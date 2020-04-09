package com.example.loginschoolpool;

public class ValidationTool {

    // This method Validates Email and password are correct.
    public static User validateUsernameAndPassword(String inputEmail, String inputPassword) {
        for (User user : Utils.getDb())
        {
            String currentEmail = user.getEmail();
            String currentPassword = user.getPassword();
            if(inputEmail.equals(currentEmail) && inputPassword.equals(currentPassword))
            {
                return user;
            }
        }
        return null;
    }
}
