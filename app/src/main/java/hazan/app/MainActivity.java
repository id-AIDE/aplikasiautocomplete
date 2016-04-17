package hazan.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Dataku;
    Button Fotoku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fotoku = (Button)findViewById(R.id.buttonFotoku);
        Fotoku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IF = new Intent(getApplicationContext(),Fotoku.class);
                startActivity(IF);
            }
        });
        Dataku = (Button)findViewById(R.id.buttonDataku);
        Dataku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ID = new Intent(getApplicationContext(), Dataku.class);
                startActivity(ID);
            }
        });
    }
}
