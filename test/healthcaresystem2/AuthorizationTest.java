/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem2;

import java.util.List;
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
    public void testDisplayedUserMedicalRecords() {
        System.out.println("displayedUserMedicalRecords");
        List<MedicalRecord> medicalRecords = null;
        User authenticatedUser = null;
        Authorization instance = new Authorization();
        boolean expResult = false;
        boolean result = instance.displayedUserMedicalRecords(medicalRecords, authenticatedUser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
