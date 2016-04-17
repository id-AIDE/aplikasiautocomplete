package hazan.app;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class Dataku extends Activity implements TextWatcher  {
        /** Called when the activity is first created. */
        TextView hasil;
        AutoCompleteTextView edit;
        String[] item = { "Situbondo","Banyuwangi","Bondowoso","Jember" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dataku);

        hasil = (TextView) findViewById(R.id.hasil);
        edit = (AutoCompleteTextView) findViewById(R.id.edit);
        edit.addTextChangedListener(this);
        edit.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, item));
    }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // hasil.setText(edit.getText() ) ;
        }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // not used
        }
            public void afterTextChanged(Editable s) {
                // not used
        }

    }
