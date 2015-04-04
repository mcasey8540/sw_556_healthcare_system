/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mcasey
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //step 1 - create 3 user records
        List<User> users = HealthcareFactory.createUsers();
        
        //step 2 - create 3 medical records
        List<MedicalRecord> medicalRecords = HealthcareFactory.createMedicalRecords();
        
        //step 3 - collect user input
        Scanner s = new Scanner(System.in);
        System.out.print( "Enter username: "  );
        String userName = s.nextLine();
        System.out.print( "Enter password: "  );
        String password = s.nextLine();
        
        //step 4 - authenticate user
        Authentication authentication = new Authentication();
        User authenticatedUser = authentication.authenticateUser(users, userName, password);
        
        if(authenticatedUser == null){
            System.out.println( "Authentication Failed: Username or password invalid. Please run again.");
            return;
        }

        //step 5 - authorize viewing of medical records for user
        Authorization authorization = new Authorization();
        authorization.displayUserMedicalRecords(medicalRecords, authenticatedUser);

        return;
        
    }
                 
}
