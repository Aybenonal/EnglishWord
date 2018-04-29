package com.example.ayben.ilkodev;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Object v;
    Button bt1,bt2,bt3;
    TextView tv,tv1;
    int i,skor=0;
    int yenikelime;
    String [][] Words  =new String[][]{{"Red","Kırmızı","ELma"},
            {"Pencil","Silgi","Kalem"},
            {"Green","Yeşil","Çiçek"},
            {"Strawberry","Mavi","Çilek"},
            {"Snow","Siyah","Kar"},
            {"Postman","Postacı","Şair"},
            {"Breakfast","Bordo","Kahvaltı"},
            {"Hand","Kafa","El"},
            {"Knee","Diz","Bıçak"},
            {"Sixty","Altı","Altmış"}};

String[]Dogrular=new String[]{"Kırmızı","Kalem","Yeşil","Çilek","Kar","Postacı","Kahvaltı","El","Diz","Altmış"};
    public int rasgele_ata()
    {
        Random r=new Random();
        int sayi=r.nextInt(10);
        return sayi;
    }


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            bt1=(Button)findViewById(R.id.button3);
            bt2=(Button)findViewById(R.id.button4);
            bt3=(Button)findViewById(R.id.button5);
            tv =(TextView) findViewById(R.id.textView);
            tv1=(TextView)findViewById(R.id.textView3);

            bt2.setVisibility(View.INVISIBLE);
            bt3.setVisibility(View.INVISIBLE);

     bt1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             bt1.setVisibility(View.INVISIBLE);
             bt2.setVisibility(View.VISIBLE);
             bt3.setVisibility(View.VISIBLE);



yenikelime=rasgele_ata();
             tv.setText(Words[yenikelime][0]);
             bt2.setText(Words[yenikelime][1]);
             bt3.setText(Words[yenikelime][2]);
         }
     });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bt2.getText()==Dogrular[yenikelime])
                {
                    skor+=10;
                    tv1.setText(String.valueOf(skor));
                    yenikelime=rasgele_ata();
                    tv.setText(Words[yenikelime][0]);
                    bt2.setText(Words[yenikelime][1]);
                    bt3.setText(Words[yenikelime][2]);
                    Toast.makeText(getApplication(),"Doğru",Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplication(),"Yanlış",Toast.LENGTH_SHORT).show();
                    yenikelime=rasgele_ata();
                    tv.setText(Words[yenikelime][0]);
                    bt2.setText(Words[yenikelime][1]);
                    bt3.setText(Words[yenikelime][2]);
                    skor-=10;
                    tv1.setText(String.valueOf(skor));
                }

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bt3.getText()==Dogrular[yenikelime])
                {
                    skor+=10;
                    tv1.setText(String.valueOf(skor));
                    yenikelime=rasgele_ata();
                    tv.setText(Words[yenikelime][0]);
                    bt2.setText(Words[yenikelime][1]);
                    bt3.setText(Words[yenikelime][2]);
                    Toast.makeText(getApplication(),"Doğru",Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplication(),"Yanlış",Toast.LENGTH_SHORT).show();
                    yenikelime=rasgele_ata();
                    tv.setText(Words[yenikelime][0]);
                    bt2.setText(Words[yenikelime][1]);
                    bt3.setText(Words[yenikelime][2]);
                    skor-=10;
                    tv1.setText(String.valueOf(skor));
                }

            }
        });


}
}