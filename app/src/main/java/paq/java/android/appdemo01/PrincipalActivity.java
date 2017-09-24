package paq.java.android.appdemo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PrincipalActivity extends AppCompatActivity {
    EditText ptxtNombre,ptxtSalida;
    Button pbtnAceptar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //instanciar los objetos java con los del view
        ptxtNombre = (EditText)findViewById(R.id.txtNombre);
        ptxtSalida = (EditText)findViewById(R.id.txtSalida);
        pbtnAceptar = (Button)findViewById(R.id.btnAceptar);
        pbtnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oNom=ptxtNombre.getText().toString();
                ptxtSalida.setText("Bienvenido "+oNom+ " a mi app.");
                ptxtNombre.setText("");
            }
        });

    }
}
