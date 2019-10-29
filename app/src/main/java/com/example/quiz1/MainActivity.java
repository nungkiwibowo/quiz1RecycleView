package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private keluargaAdapter adapter;
    private ArrayList<keluarga> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        adapter = new keluargaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new keluarga("purwanto", "ayah", getDrawable(R.drawable.ayah)));
        mahasiswaArrayList.add(new keluarga("nunik ismawati", "ibu", getDrawable(R.drawable.ibu)));
        mahasiswaArrayList.add(new keluarga("nungki wibowo", "anak1", getDrawable(R.drawable.nungki)));
        mahasiswaArrayList.add(new keluarga("sinta ayu r", "anak2", getDrawable(R.drawable.sinta)));
        mahasiswaArrayList.add(new keluarga("amelia putri", "anak3", getDrawable(R.drawable.amel)));
    }
}
