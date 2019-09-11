package matc89.exercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button btnTrocar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void trocarUsuario (View v){
        Intent intent = new Intent(this,OutraActivity.class);
        startActivityForResult(intent,1234);
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == 1234 && resultCode == RESULT_OK){
            textView.setText(data.get("usuario"));
        }
    }
}
