package matc89.exercicio2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OutraActivity extends AppCompatActivity {
    EditText editText;
    Button btnConfirmar;
    Button btnCancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outra);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        btnConfirmar = (Button)findViewById(R.id.btnConfirmar);
        editText = (EditText)findViewById(R.id.editText);
        btnCancelar = (Button)findViewById(R.id.btnCancelar);
    }
    public void confirmar(View v){
        Intent data = new Intent();
        data.putExtra("usuario",editText.getText());
        setResult(RESULT_OK, data);
        finish();
    }
    public void cancelar (View v){
        setResult(RESULT_CANCELED);
        finish();
    }

}
