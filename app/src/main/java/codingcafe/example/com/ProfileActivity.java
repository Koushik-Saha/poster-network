package codingcafe.example.com;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity
{

    private TextView userName, userProfName, userStatus, userCountry, userGender, userRelation, userDOB;
    private CircleImageView userProfileImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        userName = (TextView) findViewById(R.id.my_username);
        userProfName = (TextView) findViewById(R.id.my_profile_full_name);
        userStatus = (TextView) findViewById(R.id.my_profile_status);
        userCountry = (TextView) findViewById(R.id.my_country);
        userGender = (TextView) findViewById(R.id.my_gender);
        userRelation = (TextView) findViewById(R.id.my_relationship_status);
        userDOB = (TextView) findViewById(R.id.my_dob);
        userProfileImage = (CircleImageView) findViewById(R.id.my_profile_pic);
    }
}
