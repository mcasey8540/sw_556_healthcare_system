/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem2;

/**
 *
 * @author mcasey
 */
    public class User {

        Integer Id;
        String  Username;
        String  Password;
          
        public Integer getId() {
                return Id;
        }        
        public void setId(Integer id) {
                this.Id = id;
        }

        public String getPassword() {
                return Password;
        }
        public void setPassword(String password) {
                this.Password = password;
        }
        public String getUsername() {
                return Username;
        }
        public void setUsername(String username) {
                Username = username;
        }  

    }
