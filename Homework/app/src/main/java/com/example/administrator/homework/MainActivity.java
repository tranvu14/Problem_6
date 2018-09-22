package com.example.administrator.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); }
    public void btn_sum(View view) {
        EditText edita = (EditText) findViewById(R.id.editsoa);
        int a = Integer.parseInt(edita.getText() + "");
        EditText editb = (EditText) findViewById(R.id.editsob);
        int b = Integer.parseInt(editb.getText() + "");

        TextView txtkq = (TextView) findViewById(R.id.txt_kq);

        txtkq.setText((a + b)+"");
    }
    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
}
