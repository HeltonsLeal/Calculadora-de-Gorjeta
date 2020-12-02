package com.silver7.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.sql.Struct;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText valorDaConta;
    private SeekBar seekBarPorcentagem;
    private TextView textPorcentagem, valorGorjeta, valorTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        valorDaConta = findViewById(R.id.valorDaConta);
        seekBarPorcentagem = findViewById(R.id.seekBarPorcentagem);
        textPorcentagem = findViewById(R.id.textPorcentagem);
        valorGorjeta = findViewById(R.id.valorGorjeta);
        valorTotal = findViewById(R.id.valorTotal);

        /*String valida = valorDaConta.getText().toString();
        if (valida == null || valida.equals("")) {

            valorTotal.setText("DIGITE O VALOR DA CONTA");

        }else{

        */


                seekBarPorcentagem.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        textPorcentagem.setText(progress + "%");

                        String valida = valorDaConta.getText().toString();
                        if (valida == null || valida.equals("")) {

                            valorGorjeta.setText("DIGITE O VALOR DA CONTA");
                            valorTotal.setText("DIGITE O VALOR DA CONTA");

                        }else {

                            String vrDaConta = valorDaConta.getText().toString();
                            Double valorConta = Double.parseDouble(vrDaConta);
                            valorGorjeta.setText("R$ " + (valorConta * progress) / 100);
                            valorTotal.setText("R$ " + (((valorConta * progress) / 100) + valorConta));
                        }


                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }



                });}



        //}





    public boolean validarCampos (String vTotal) {

        Boolean camposValidados = true;

        if (vTotal == null || vTotal.equals("")) {
            camposValidados = false;
        }

        return camposValidados;

    }
}