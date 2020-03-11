package com.example.myapplication3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.EditText;
import android.graphics.Color;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Object creation for Relative layout, button & UserName
        RelativeLayout MyLayout = new RelativeLayout(this);
        Button MyButton = new Button(this);
        EditText UserName = new EditText(this);


        //Setting background color
        MyLayout.setBackgroundColor(Color.BLUE);
        MyButton.setBackgroundColor(Color.GREEN);

        //Setting name to our button to display oin the app
        MyButton.setText("Click Here");

        //Aligning the button Adding the rule(ButtonDetail) Wrap content wraps the widget which is specified inside it
        RelativeLayout.LayoutParams ButtonDetails = new RelativeLayout.LayoutParams
                                        (RelativeLayout.LayoutParams.WRAP_CONTENT,
                                         RelativeLayout.LayoutParams.WRAP_CONTENT);

        //Setting position
        ButtonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        ButtonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        //Adding button to our layout
        MyLayout.addView(MyButton,ButtonDetails);

        //Setting ID's
        MyButton.setId(1);
        UserName.setId(2);

        //Creating rule for UserName
        RelativeLayout.LayoutParams UserNameDetails = new RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);

        //Positioning the username
        UserNameDetails.addRule(RelativeLayout.ABOVE,MyButton.getId());
        UserNameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        //Setting margins
        UserNameDetails.setMargins(0,0,0,50);

        //Adding username object and rules in our view
        MyLayout.addView(UserName,UserNameDetails);

        //Setting content to current layout
        setContentView(MyLayout);

    }

}


