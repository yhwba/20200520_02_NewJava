package kr.co.yhw.a20200520_02_newjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import kr.co.yhw.a20200520_02_newjava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputMessage = binding.contentEdt.getText().toString();
                Log.d("적은내용", inputMessage);

                binding.contentTxt.setText(inputMessage);

                Toast.makeText(MainActivity.this, inputMessage+"문구를 반영했습니다 :D", Toast.LENGTH_SHORT).show();
            }
        });
//        binding.okBtn.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View v) {
//        Log.d("메인화면","자체이벤트 코드");
//    }
}
