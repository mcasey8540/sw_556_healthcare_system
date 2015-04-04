/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem2;

import java.util.List;

/**
 *
 * @author mcasey
 */
public class Authorization {
    
    public void displayUserMedicalRecords(List<MedicalRecord> medicalRecords, User authenticatedUser){
        
        if(medicalRecords != null && authenticatedUser !=null)
        {
            for(int i = 0; i < medicalRecords.size(); i++)
            {
                MedicalRecord mr = medicalRecords.get(i);
                
                if(mr.getUserId().equals(authenticatedUser.getId()))
                {
                   System.out.println("-- Patient Medical Record --"); 
                   System.out.println("Username: " + authenticatedUser.getUsername());
                   System.out.println("Admitance Date: " + mr.getAdmitted_At().toString());
                   System.out.println("Current Procedure Code: " + mr.getCurrent_Proc_Code());
                   System.out.println("Billing Amount: " + mr.getBilling_Amt());
                   System.out.println("Billing Due Date: " + mr.getBill_Due_At().toString());                   
                }
            }
            
        }else{
            System.out.println( "Null Exception: MedicalRecords or AuthenticatedUser");
        }
        
    }    
}
