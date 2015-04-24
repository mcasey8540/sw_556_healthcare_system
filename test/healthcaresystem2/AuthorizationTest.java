/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem2;

import java.util.List;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mcasey
 */
public class AuthorizationTest {
    
    public AuthorizationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of displayedUserMedicalRecords method, of class Authorization.
     */
    @Test
    public void testAuthorizationPositiveIntegersFuzzTest() {
        System.out.println("authorization Fuzz Test with Randomly Generated Intgers");
        List<MedicalRecord> medicalRecords = HealthcareFactory.createMedicalRecords();
        
        Random rand = new Random();
        
        //random user id 
        int userId = rand.nextInt(2147483647) + 1;
        
        System.out.println("Testing userid authorization: " + userId);

        User user = new User();       
	user.setUsername("johndoe");
	user.setPassword("abc123");
        user.setId(userId);
        
        Authorization instance = new Authorization();
        boolean result = instance.displayedUserMedicalRecords(medicalRecords, user);
        assertFalse(result);

    }
    
    @Test
    public void testAuthorizationNegativeIntegersFuzzTest() {
        System.out.println("authorization Fuzz Test with Randomly Generated Negative Intgers");
        List<MedicalRecord> medicalRecords = HealthcareFactory.createMedicalRecords();
        
        Random rand = new Random();
        
        //random user id 
        int userId = rand.nextInt(-2147483647) + 1;
        
        System.out.println("Testing userid authorization: " + userId);

        User user = new User();       
	user.setUsername("johndoe");
	user.setPassword("abc123");
        user.setId(userId);
        
        Authorization instance = new Authorization();
        boolean result = instance.displayedUserMedicalRecords(medicalRecords, user);
        assertFalse(result);

    }    
    
    @Test
    public void testAuthorizationNullFuzzTest() {
        System.out.println("authorization Fuzz Test with Null Intgers");
        List<MedicalRecord> medicalRecords = HealthcareFactory.createMedicalRecords();
        
        Random rand = new Random();
                
        System.out.println("Testing userid authorization: " + null);

        User user = new User();       
	user.setUsername("johndoe");
	user.setPassword("abc123");
        user.setId(null);
        
        Authorization instance = new Authorization();
        boolean result = instance.displayedUserMedicalRecords(medicalRecords, user);
        assertFalse(result);

    }     
    
}
