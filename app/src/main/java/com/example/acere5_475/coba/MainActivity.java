package com.example.acere5_475.coba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner dataJurusan;
    String jurusan[] ={"Sistem Informasi", "Teknologi Informasi"};
    EditText nama,nim,matkul1,matkul2,sks1,sks2,uts1,uts2,uas1,uas2;
    TextView hasilNama,hasilNIM,hasilJurusan,hasilMatkul1,hasilMatkul2,hasilSKS1,hasilSKS2,hasilAlpha1,hasilAlpha2,hasilMatkul,hasilSKS,hasilNilai,hasilIPK;
    Button submit;
    Integer nUas1,nUts1,nUas2,nUts2,nSks1,nSks2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.inputNama);
        nim  = (EditText) findViewById(R.id.inputNIM);
        dataJurusan = (Spinner) findViewById(R.id.inputJurusan);
        ArrayAdapter<String> arrayJurusan = new ArrayAdapter<>(this, R.layout.activity_list_jurusan, R.id.textJurusan, jurusan);
        dataJurusan.setAdapter(arrayJurusan);

        matkul1 = (EditText) findViewById(R.id.inputMatkul1);
        matkul2 = (EditText) findViewById(R.id.inputMatkul2);
        sks1 = (EditText) findViewById(R.id.inputSks1);
        sks2 = (EditText) findViewById(R.id.inputSks2);
        uts1 = (EditText) findViewById(R.id.inputUts1);
        uts2 = (EditText) findViewById(R.id.inputUts2);
        uas1 = (EditText) findViewById(R.id.inputUas1);
        uas2 = (EditText) findViewById(R.id.inputUas2);
        hasilNama = (TextView) findViewById(R.id.hasilNama);
        hasilNIM = (TextView) findViewById(R.id.hasilNIM);
        hasilJurusan = (TextView) findViewById(R.id.hasilJurusan);
        hasilMatkul = (TextView) findViewById(R.id.hasilMatkul);
        hasilMatkul1 = (TextView) findViewById(R.id.hasilMatkul1);
        hasilMatkul2 = (TextView)findViewById(R.id.hasilMatkul2);
        hasilSKS = (TextView) findViewById(R.id.hasilSKS);
        hasilNilai = (TextView)findViewById(R.id.hasilNilai);
        hasilSKS1 = (TextView) findViewById(R.id.hasilSKS1);
        hasilSKS2 = (TextView) findViewById(R.id.hasilSKS2);
        hasilAlpha1 = (TextView) findViewById(R.id.hasilAlpha1);
        hasilAlpha2 = (TextView) findViewById(R.id.hasilAlpha2);
        hasilIPK = (TextView) findViewById(R.id.hasilIPK);
        submit = (Button) findViewById(R.id.button);



        submit.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){

                String namaMhs = nama.getText().toString();
                String nimMhs  = nim.getText().toString();
                String jurusan = dataJurusan.getSelectedItem().toString();
                String mataKuliah1 = matkul1.getText().toString();
                String mataKuliah2 = matkul2.getText().toString();
                String sksA = sks1.getText().toString();
                String sksB = sks2.getText().toString();

                hasilNama.setText(namaMhs);
                hasilNIM.setText("("+nimMhs+")");
                hasilJurusan.setText("-"+jurusan);
                hasilMatkul1.setText(mataKuliah1);
                hasilMatkul2.setText(mataKuliah2);
                hasilSKS1.setText(sksA);
                hasilSKS2.setText(sksB);
                hasilMatkul.setText("Mata Kuliah");
                hasilNilai.setText("Nilai");
                hasilSKS.setText("SKS");

                nUas1 = Integer.parseInt(uas1.getText().toString());
                nUts1 = Integer.parseInt(uts1.getText().toString());
                nUas2 = Integer.parseInt(uas2.getText().toString());
                nUts2 = Integer.parseInt(uts2.getText().toString());
                nSks1 = Integer.parseInt(hasilSKS1.getText().toString());
                nSks2 = Integer.parseInt(hasilSKS2.getText().toString());

                Integer H_sks = (nSks1+nSks2);
                Integer hasil1 = (nUas1+nUts1)/2;
                Integer hasil2 = (nUas2+nUts2)/2;
                double data1,data2;

                if (hasil1 > 80 ){
                    hasilAlpha1.setText("A");
                    data1 = 4;
                }else if (hasil1 >75 && hasil1 <= 80){
                    hasilAlpha1.setText("B+");
                    data1 = 3.5;
                }else if (hasil1 > 70 && hasil1 <= 75){
                    hasilAlpha1.setText("B");
                    data1 = 3;
                }else if(hasil1 >65 && hasil1 <=70){
                    hasilAlpha1.setText("C+");
                    data1 = 2.5;
                }else if(hasil1 >60 && hasil1 <=65){
                    hasilAlpha1.setText("C");
                    data1 = 2;
                }
                else if(hasil1 >55 && hasil1 <=60){
                    hasilAlpha1.setText("D+");
                    data1 = 1.5;
                }
                else if(hasil1 >50 && hasil1 <=55){
                    hasilAlpha1.setText("D");
                    data1 = 1;
                }else {
                    hasilAlpha1.setText("E");
                    data1 = 0.5;
                }


                if (hasil2 > 80 ){
                    hasilAlpha2.setText("A");
                    data2 = 4;
                }else if (hasil2 >75 && hasil2 <= 80){
                    hasilAlpha2.setText("B+");
                    data2 = 3.5;
                }else if (hasil2 > 70 && hasil2 <= 75){
                    hasilAlpha2.setText("B");
                    data2 = 3;
                }else if(hasil2 >65 && hasil2 <=70){
                    hasilAlpha2.setText("C+");
                    data2 = 2.5;
                }else if(hasil2 >60 && hasil2 <=65){
                    hasilAlpha2.setText("C");
                    data2 = 2;
                }
                else if(hasil2 >55 && hasil2 <=60){
                    hasilAlpha2.setText("D+");
                    data2 = 1.5;
                }
                else if(hasil2 >50 && hasil2 <=55){
                    hasilAlpha2.setText("D");
                    data2= 1;
                }else {
                    hasilAlpha2.setText("E");
                    data2 = 0.5;
                }
                double IPK = ((data1*nSks1)+(data2*nSks2))/H_sks;
                String number =  String.format("%,.2f", IPK);
                hasilIPK.setText("IPK : "+(number));
            }
        });


    }
}
