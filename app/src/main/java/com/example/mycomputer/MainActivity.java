package com.example.mycomputer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView txtNoidung;
    EditText edttext;
    EditText edtpheptinh;
    EditText edtText3;
    Button btntinh;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNoidung = (TextView) findViewById(R.id.textView);
        edttext = (EditText) findViewById(R.id.editText);
        edtpheptinh = (EditText) findViewById(R.id.editTextPhepTinh);
        edtText3 = (EditText) findViewById(R.id.editText3);
        editText = (EditText) findViewById(R.id.editText4);

        btntinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = edttext.getText().toString();
                int editext = Integer.parseInt(chuoi1);
                String chuoi2 = edtText3.getText().toString();
                int edtText3 = Integer.parseInt(chuoi2);
                int tong = editext+edtText3;
                int tich = editext-edtText3;
                int hieu = editext*edtText3;
                double thuong = editext/edtText3;
                String sai ="phép tính sai!!";
                if (view.getId() == R.id.buttonTinh) {
                    if (edtpheptinh.getText().toString().equals("+"))
                        editText.setText(String.valueOf("tong"));
                    else if (edtpheptinh.getText().toString().equals("-"))
                        editText.setText(String.valueOf("tich"));
                    else if (edtpheptinh.getText().toString().equals("*"))
                        editText.setText(String.valueOf("hieu"));
                    else if (edtpheptinh.getText().toString().equals("/"))
                        editText.setText(String.valueOf("thuong"));
                    else
                        editText.setText(sai);
                }



            }
        });


    }
}
