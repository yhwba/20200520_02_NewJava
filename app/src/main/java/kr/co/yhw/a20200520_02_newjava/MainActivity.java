package kr.co.yhw.a20200520_02_newjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import kr.co.yhw.a20200520_02_newjava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

//        binding.okBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("메인화면","확인버튼클릭");
//            }
//        });
        binding.okBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d("메인화면","자체이벤트 코드");
    }
}
