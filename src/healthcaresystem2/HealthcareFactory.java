/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mcasey
 */
public class HealthcareFactory {
        
      public static List<User> createUsers(){
          
        List<User> users = new ArrayList<User>();
        
        //user record 1
        User user = new User();       
	user.setUsername("johndoe");
	user.setPassword("abc123");
        user.setId(1);
        
        //user record 2
        User user2 = new User();       
	user2.setUsername("janedoe");
	user2.setPassword("ABC123");
        user2.setId(2);        
        
        //user record 3
        User user3 = new User();       
	user3.setUsername("JackDoe");
	user3.setPassword("abc123");
        user3.setId(3); 
        
        //add users to list
        users.add(user);
        users.add(user2);
        users.add(user3);
               
        return users;        
    } 
    
    public static List<MedicalRecord> createMedicalRecords(){
        
        List<MedicalRecord> medRecords = new ArrayList<MedicalRecord>();
        
        //medical record for patient 1
        MedicalRecord mr1 = new MedicalRecord();  
        mr1.setId(1);
        mr1.setUserId(1);
        mr1.setCurrent_Proc_Code("CPT9999");
        mr1.setAdmitted_At(new Date());
        mr1.setBill_Due_At(new Date());
        mr1.setBilling_Amt(300);
        
        //medical record for patient 2
        MedicalRecord mr2 = new MedicalRecord();  
        mr2.setId(2);
        mr2.setUserId(2);
        mr2.setCurrent_Proc_Code("CPT8889");
        mr2.setAdmitted_At(new Date());
        mr2.setBill_Due_At(new Date());
        mr2.setBilling_Amt(150);  
        
        //medical record for patient 2
        MedicalRecord mr3 = new MedicalRecord();  
        mr3.setId(3);
        mr3.setUserId(3);
        mr3.setCurrent_Proc_Code("CPT7779");
        mr3.setAdmitted_At(new Date());
        mr3.setBill_Due_At(new Date());
        mr3.setBilling_Amt(425);         
       
         
        //add 3 medical records to list
        medRecords.add(mr1);
        medRecords.add(mr2);
        medRecords.add(mr3);
        
        return medRecords;        
    }   
}
