/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem2;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mcasey
 */
public class AuthenticationTest {
    
    
    public AuthenticationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of authenticateUser method, of class Authentication.
     */
    @Test
    public void testAuthenticateUserFuzzIntegersTest() {
        System.out.println("authenticateUser Fuzz Test with Randomly Generated Intgers");
        List<User> users = HealthcareFactory.createUsers();
            
        Random rand = new Random();

        int userNameInt = rand.nextInt(2147483647) + 1;
        String userNameStr = Integer.toString(userNameInt);
        //password
        int passwordInt = rand.nextInt(2147483647) + 1;
        String passwordStr = Integer.toString(passwordInt); 
        
        String userName = userNameStr;
        String password = passwordStr;
        Authentication instance = new Authentication();
        
        System.out.println("Testing username input: " + userName);
        System.out.println("Testing password input: " + password);
        
        User result = instance.authenticateUser(users, userName, password);
        assertNull(result);
        
        
    }
    
    @Test
    public void testAuthenticateUserFuzzIntegersNegativeTest() {
        System.out.println("authenticateUser Fuzz Test with Randomly Generated Intgers");
        List<User> users = HealthcareFactory.createUsers();
            
        Random rand = new Random();

        int userNameInt = rand.nextInt(-2147483647) + 1;
        String userNameStr = Integer.toString(userNameInt);
        //password
        int passwordInt = rand.nextInt(-2147483647) + 1;
        String passwordStr = Integer.toString(passwordInt); 
        
        String userName = userNameStr;
        String password = passwordStr;
        Authentication instance = new Authentication();
        
        System.out.println("Testing username input: " + userName);
        System.out.println("Testing password input: " + password);
        
        User result = instance.authenticateUser(users, userName, password);
        assertNull(result);
        
        
    } 
    
   @Test
    public void testAuthenticateUserFuzzAlphaNumericStringTest() {
        System.out.println("authenticateUser Fuzz Test with Randomly Generated Strings");
        List<User> users = HealthcareFactory.createUsers();
            
        Random rand = new Random();
        
        String userName = UUID.randomUUID().toString();
        String password = UUID.randomUUID().toString();
        Authentication instance = new Authentication();
        
        System.out.println("Testing username input: " + userName);
        System.out.println("Testing password input: " + password);
        
        User result = instance.authenticateUser(users, userName, password);
        assertNull(result);
        
        
    }        
    
}
