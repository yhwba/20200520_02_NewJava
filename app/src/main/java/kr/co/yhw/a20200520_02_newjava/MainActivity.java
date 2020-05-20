package kr.co.yhw.a20200520_02_newjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText contentEdt;
    Button okButton;
    TextView contentTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contentEdt = findViewById(R.id.contentEdt);
        okButton = findViewById(R.id.okBtn);
        contentTxt =findViewById(R.id.contentTxt);
    }
}
