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
public class Authentication {

    public User authenticateUser(List<User> users, String userName, String password)
    {
        if(users != null && userName !=null && password != null)
        {
            for(int i = 0; i < users.size(); i++)
            {
                User usr = users.get(i);
                
                if(usr.getUsername().equals(userName) && usr.getPassword().equals(password))
                {
                    return usr;
                }
            }   
        }else{
            System.out.println( "Null Exception: Users, Username or Password");
            return null;
        }
        return null;
    }    
    
}
