package vn.edu.ntu.thaithanhdat_59130291_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
      TextView editTG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Life Recycle","onCreate Called" );
            editTG=findViewById(R.id.editTG);
//        editTen=findViewById(R.id.editTen);
        SimpleDateFormat spF = new SimpleDateFormat("HH:mm:ss");
        String date =spF.format(new Date());
        editTG.setText(date);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life Recycle","onStart Called" );
        Toast.makeText(getApplicationContext(), "onStart Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life Recycle","onRestart Called" );
        Toast.makeText(getApplicationContext(), "onRestart Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life Recycle","onResume Called" );
        Toast.makeText(getApplicationContext(), "onResume Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life Recycle","onPause Called" );
        Toast.makeText(getApplicationContext(), "onPause Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life Recycle","onStop Called" );
        Toast.makeText(getApplicationContext(), "onStop Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life Recycle","onDetroy Called" );
        Toast.makeText(getApplicationContext(), "onDetroy Called", Toast.LENGTH_SHORT).show();
    }
}