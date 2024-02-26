package com.example.bindingkullanm;

import static com.example.bindingkullanm.databinding.ActivityMainBinding.bind;
import static com.example.bindingkullanm.databinding.ActivityMainBinding.inflate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.bindingkullanm.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    int seciliSiraNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Gorsel	araba1	=	new Gorsel("Üzgün Araba",1,R.drawable.araba1);
        Gorsel	araba2	=	new Gorsel("Tofaşk",2,R.drawable.araba2);
        Gorsel	araba3	=	new Gorsel("Serçe",3,R.drawable.araba3);
        Gorsel	araba4	=	new Gorsel("Dogan SLX",4,R.drawable.araba4);
        gorselArrayList = new ArrayList<>();
        gorselArrayList.add(araba1);
        gorselArrayList.add(araba2);
        gorselArrayList.add(araba3);
        gorselArrayList.add(araba4);
        binding.imageViewGorsel.setImageResource(gorselArrayList.get(0).foto);
        binding.textViewBilgi.setText("Bilgi : " +	gorselArrayList.get(0).bilgi);
        seciliSiraNo=0;

    }
     ArrayList<Gorsel> gorselArrayList;
    public void geriGelme(View	view){
        if(seciliSiraNo>0){
            seciliSiraNo--;
            binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textViewBilgi.setText("Bilgi : " +	gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }
    public void ileriGitme(View	view){
        if(seciliSiraNo<gorselArrayList.size()-1){
            seciliSiraNo++;
            binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textViewBilgi.setText("Bilgi : " +	gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }
}