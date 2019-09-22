package com.example.work.test;

        import android.content.Intent;
        import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Start home activity
        startActivity(new Intent(Splash.this, MainActivity.class));
        // close splash activity
        finish();
    }
}
