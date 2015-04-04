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
public class Authentication {

    public static User authenticateUser(User user, String userName, String password)
    {
       if(user.getPassword().equals(password) && user.getUsername().equals(userName))
       {
           return user;
       }else{
           return null;
       }
    }    
    
}
