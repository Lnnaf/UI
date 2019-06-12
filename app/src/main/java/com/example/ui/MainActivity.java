package com.example.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public
class MainActivity extends AppCompatActivity {

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

    }

    public void Addfragment(View view){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment= null;
        switch (view.getId()){
            case R.id.btn1:fragment= new fragment();
                break;
            case R.id.btn2:fragment = new fragment_2();
                break;

        }

        fragmentTransaction.replace(R.id.frameContent,fragment );
        fragmentTransaction.commit();

    }
}
