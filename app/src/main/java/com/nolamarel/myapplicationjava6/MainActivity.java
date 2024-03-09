package com.nolamarel.myapplicationjava6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.nolamarel.myapplicationjava6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.getInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = getString(R.string.welcome, binding.chooseName.getText().toString().toLowerCase());
                chooseHoroscope(binding.chooseName.getText().toString().toLowerCase());
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void chooseHoroscope(String chooseName){
        switch (chooseName){
            case "овен":{
                binding.imageView.setImageResource(R.drawable.aries);
                binding.name.setText(R.string.aries);
                binding.dateInfo.setText(R.string.aries_date_info);
                binding.fullInfo.setText(R.string.aries_full_info);
                break;
            }
            case "телец":{
                binding.imageView.setImageResource(R.drawable.taurus);
                binding.name.setText(R.string.taurus);
                binding.dateInfo.setText(R.string.taurus_date_info);
                binding.fullInfo.setText(R.string.taurus_full_info);
                break;
            }
            case "близнецы":{
                binding.imageView.setImageResource(R.drawable.gemini);
                binding.name.setText(R.string.gemini);
                binding.dateInfo.setText(R.string.gemini_date_info);
                binding.fullInfo.setText(R.string.gemini_full_info);
                break;
            }
            case "весы":{
                binding.imageView.setImageResource(R.drawable.libra);
                binding.name.setText(R.string.libra);
                binding.dateInfo.setText(R.string.libra_date_info);
                binding.fullInfo.setText(R.string.libra_full_info);
                break;
            }
            case "водолей":{
                binding.imageView.setImageResource(R.drawable.aquarius);
                binding.name.setText(R.string.aquarius);
                binding.dateInfo.setText(R.string.aquarius_date_info);
                binding.fullInfo.setText(R.string.aquarius_full_info);
                break;
            }
            case "дева":{
                binding.imageView.setImageResource(R.drawable.virgo);
                binding.name.setText(R.string.virgo);
                binding.dateInfo.setText(R.string.virgo_date_info);
                binding.fullInfo.setText(R.string.virgo_full_info);
                break;
            }
            case "козерог":{
                binding.imageView.setImageResource(R.drawable.capricorn);
                binding.name.setText(R.string.capricorn);
                binding.dateInfo.setText(R.string.capricorn_date_info);
                binding.fullInfo.setText(R.string.capricorn_full_info);
                break;
            }
            case "лев":{
                binding.imageView.setImageResource(R.drawable.leo);
                binding.name.setText(R.string.leo);
                binding.dateInfo.setText(R.string.leo_date_info);
                binding.fullInfo.setText(R.string.leo_full_info);
                break;
            }
            case "рак ":{
                binding.imageView.setImageResource(R.drawable.cancer);
                binding.name.setText(R.string.cancer);
                binding.dateInfo.setText(R.string.cancer_date_info);
                binding.fullInfo.setText(R.string.cancer_full_info);
                break;
            }
            case "рыбы":{
                binding.imageView.setImageResource(R.drawable.pisces);
                binding.name.setText(R.string.pisces);
                binding.dateInfo.setText(R.string.pisces_date_info);
                binding.fullInfo.setText(R.string.pisces_full_info);
                break;
            }
            case "скорпион":{
                binding.imageView.setImageResource(R.drawable.scorpio);
                binding.name.setText(R.string.scorpio);
                binding.dateInfo.setText(R.string.scorpio_date_info);
                binding.fullInfo.setText(R.string.scorpio_full_info);
                break;
            }
            case "стрелец":{
                binding.imageView.setImageResource(R.drawable.sagittarius);
                binding.name.setText(R.string.sagittarius);
                binding.dateInfo.setText(R.string.sagittarius_date_info);
                binding.fullInfo.setText(R.string.sagittarius_full_info);
                break;
            }
        }
        binding.imageView.setVisibility(View.VISIBLE);
        binding.name.setVisibility(View.VISIBLE);
        binding.dateInfo.setVisibility(View.VISIBLE);
        binding.fullInfo.setVisibility(View.VISIBLE);

    }
}