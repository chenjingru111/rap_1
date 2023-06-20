package com.example.rap_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rap_1.manager.Tag_1_manager;


public class MainActivity extends AppCompatActivity {

    private Button btn_create;
    private TextView tv_country;
    private CharSequence text=" ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();



        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag_1 = Tag_1_manager.getTag_1();
                tv_country.setText(tag_1);

            }
        });
    }


    private void initView() {
        btn_create = (Button) findViewById(R.id.btn_create);
        tv_country = (TextView) findViewById(R.id.tv_country);
        findViewById(R.id.btn_copy).setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            text = tv_country.getText();
            ClipData clip = ClipData.newPlainText("label", text);
            clipboard.setPrimaryClip(clip);

            if (text !=null){
                Toast.makeText(this, "复制成功", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "你丫的文本为空", Toast.LENGTH_SHORT).show();
            }

        });
    }
}