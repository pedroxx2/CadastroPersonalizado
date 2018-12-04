// Pedro Henrique Fortunato Silva Mariano

package com.softwares.pedroMariano.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter adapter;
    private ImageView imagemSexo;
    private String cumprimento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagemSexo= findViewById(R.id.imagemSexoId);
        
        AdapterView.OnItemSelectedListener escolha= new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = spnEstadoCivil.getSelectedItem().toString();
                if(item.equals("Masculino")){
                    imagemSexo.setImageResource(R.drawable.male_user);

                    if(!cumprimento.getText().toString().isEmpty()){

                        cumprimento.setText("Senhor "+cumprimento.getText().toString());
                    }


                }else {
                    imagemSexo.setImageResource(R.drawable.female_user);

                    if(!cumprimento.getText().toString().isEmpty()){

                        cumprimento.setText("Senhora "+edtNome.getText().toString());
                    }
                }

                //Toast.makeText(getApplicationContext(), Item, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };
}