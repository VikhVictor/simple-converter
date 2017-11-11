package com.eh.simpleconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mInput, mOutput;
    private Button mConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInput = (EditText) findViewById(R.id.et_input);
        mOutput = (EditText) findViewById(R.id.et_output);
        mConvert = (Button) findViewById(R.id.btn_convert);
    }

    public void onButtonClick(View view) {
        // convert
        String src = mInput.getText().toString();
        double value = Double.parseDouble(src);

        double result = Converter.convert(Converter.TYPE_FT,
                Converter.TYPE_MET, value);

        mOutput.setText(String.valueOf(result));

    }

}
