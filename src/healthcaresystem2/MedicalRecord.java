/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem2;

import java.util.Date;

/**
 *
 * @author mcasey
 */
   public class MedicalRecord {

        Integer Id;
        Integer UserId;
        Date  Admitted_At;
        String Current_Proc_Code;
        Integer Billing_Amt;
        Date Bill_Due_At;
        
          
        public Integer getId() {
                return Id;
        }        
        public void setId(Integer id) {
                this.Id = id;
        }

        public Integer getUserId() {
                return UserId;
        }        
        public void setUserId(Integer id) {
                this.UserId = id;
        } 

        public Date getAdmitted_At() {
                return Admitted_At;
        }        
        public void setAdmitted_At(Date date) {
                this.Admitted_At = date;
        }  
        
        public String getCurrent_Proc_Code() {
                return Current_Proc_Code;
        }        
        public void setCurrent_Proc_Code(String procCode) {
                this.Current_Proc_Code = procCode;
        }   

        public Integer getBilling_Amt() {
                return Billing_Amt;
        }        
        public void setBilling_Amt(Integer billAmt) {
                this.Billing_Amt = billAmt;
        }    
        
        public Date getBill_Due_At() {
                return Bill_Due_At;
        }        
        public void setBill_Due_At(Date date) {
                this.Bill_Due_At = date;
        }  
        
        

    }
