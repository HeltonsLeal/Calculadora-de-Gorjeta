package com.silver7.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText valorDaConta;
    private SeekBar seekBarPorcentagem;
    private TextView textPorcentagem, valorGorjeta, valorTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorDaConta        = findViewById(R.id.valorDaConta);
        seekBarPorcentagem  = findViewById(R.id.seekBarPorcentagem);
        textPorcentagem     = findViewById(R.id.textPorcentagem);
        valorGorjeta        = findViewById(R.id.valorGorjeta);
        valorTotal          = findViewById(R.id.valorTotal);

        seekBarPorcentagem.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textPorcentagem.setText(progress+"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
