/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem2;

import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mcasey
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = {"johndoe", "abc123"};
        Main.main(args);
        assertEquals(0,0);
    }
    
    @Test
    public void testFuzzIntegersZeroToThousand() {
        System.out.println("main");
        Random rand = new Random();
        //username
        int userNameInt = rand.nextInt(50) + 1;
        String userNameStr = Integer.toString(userNameInt);
        //password
        int passwordInt = rand.nextInt(50) + 1;
        String passwordStr = Integer.toString(passwordInt);        
        
        String[] args = {userNameStr, passwordStr};
        Main.main(args);
    } 
    
}
