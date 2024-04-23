package com.example.etapa2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainer;

public class Fragmento2 extends Fragment {

    private Button btnHoje;
    private Button btnOutraData;
    static  View frgto2;
    ViewGroup c;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla o layout para este fragmento
        frgto2 = inflater.inflate(R.layout.fragmento2, container, false);

        btnHoje = (Button) frgto2.findViewById(R.id.btnHoje);
        btnHoje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        btnOutraData = (Button) frgto2.findViewById(R.id.btnOutraData);
        btnOutraData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });


        // Retorna uma "View frgto2" para acessar as propriedades e métodos do fragmento a partir da Activity pai
        return frgto2; //inflater.inflate(R.layout.fragmento2, container, false);
    }
}