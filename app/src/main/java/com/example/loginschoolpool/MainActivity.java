package com.example.loginschoolpool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

/**
 * MainActivity class - its Like Login class
 *                      The user credentials are typically some form of "username" and a matching "password"
 *
 *                      NOTE: There is validation of Email & Password,
 *                            but the password & Email its hide for convenience
 *
 */

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    //"(?=.*[0-9])" +         //at least 1 digit
                    //"(?=.*[a-z])" +         //at least 1 lower case letter
                    //"(?=.*[A-Z])" +         //at least 1 upper case letter
                    "(?=.*[a-zA-Z])" +      //any letter
                    //"(?=.*[@#$%^&+=])" +    //at least 1 special character
                    "(?=\\S+$)" +           //no white spaces
                    ".{4,}" +               //at least 4 characters
                    "$");

    private EditText textInputUserName;
    private EditText textInputPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textInputUserName = (EditText) findViewById(R.id.edit_text_username);
        textInputPassword = (EditText) findViewById(R.id.edit_text_password);
        buttonLogin = (Button) findViewById(R.id.button_login_now);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmInput(v);
                System.out.println("success\n");
            }
        });
    }

    private boolean validateUsername() {
//        String usernameInput = textInputUserName.getText().toString().trim();
//
//        if (usernameInput.isEmpty()) {
//            textInputUserName.setError(getResources().getString(R.string.EMPTY_USERNAME));
//            return false;
//        } else if (!Patterns.EMAIL_ADDRESS.matcher(usernameInput).matches()) {
//            textInputUserName.setError(getResources().getString(R.string.USERNAME_INVALID));
//            return false;
//        } else {
//            textInputUserName.setError(null);
//            return true;
//        }
        return true;
    }

    private boolean validatePassword() {
        String passwordInput = textInputPassword.getText().toString().trim();

        if (passwordInput.isEmpty()) {
            textInputPassword.setError(getResources().getString(R.string.EMPTY_PASSWORD));
            return false;
        } else if (!PASSWORD_PATTERN.matcher(passwordInput).matches()) {
            textInputPassword.setError(getResources().getString(R.string.PASSWORD_INVALID));
            return false;
        } else {
            textInputPassword.setError(null);
            return true;
        }
    }

    public void confirmInput(View v) {
        if (!validateUsername() | !validatePassword()) {
            return;
        }

        String input = null;
        input += "Username: " + textInputUserName.getText().toString();
        input += "\n";
        input += "Password: " + textInputPassword.getText().toString();

      //  Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
        openAppActivity();
    }

    private void openAppActivity() {
        Intent intent = new Intent(this,AppActivity.class);
        startActivity(intent);
    }


}
