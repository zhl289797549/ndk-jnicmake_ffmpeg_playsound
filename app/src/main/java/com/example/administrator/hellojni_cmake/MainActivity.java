package com.example.administrator.hellojni_cmake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
//        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
//        final TextView tv = (TextView) findViewById(R.id.sample_text);
//        tv.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//                tv.setText(stringFromJNI());
//            }
//        });
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
