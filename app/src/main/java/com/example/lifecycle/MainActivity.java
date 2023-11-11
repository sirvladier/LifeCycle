package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.lifecycle.databinding.ElementsBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ElementsBinding binding = ElementsBinding.inflate(getLayoutInflater());


        setContentView(binding.getRoot());
        binding.et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("MAINACTIVITY" + "BEFORE", s.toString());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("MAINACTIVITY" + "ON", s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("MAINACTIVITY" + "AFTER", s.toString());

            }
        });
        //Toast.makeText(this, "create", Toast.LENGTH_SHORT).show();
        binding.cb.isChecked();
        binding.rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (R.id.rb1 == checkedId) {
                    binding.tv.setText("МОЛОДЕЦ!");
                }
                if (R.id.rb2 == checkedId){
                    binding.tv.setText("ПРЕЗИДЕНТ МИРА!");
                }
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        //Toast.makeText(this, "start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(this, "resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(this, "pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Toast.makeText(this, "stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //Toast.makeText(this, "restart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(this, "destroy", Toast.LENGTH_SHORT).show();
    }
}

