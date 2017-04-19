package castro.rodriguez.fernando.com.personas;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class Registro extends AppCompatActivity {
    private EditText nomb,apell,edad;
    private CheckBox leer,bailar,programar;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        res= this.getResources();
        nomb= (EditText)findViewById(R.id.txtnombre);
        apell=(EditText)findViewById(R.id.txtapellido);
        edad=(EditText)findViewById(R.id.txtedad);

        leer= (CheckBox)findViewById(R.id.ch_leer);
        bailar=(CheckBox)findViewById(R.id.ch_bailar);
        programar=(CheckBox)findViewById(R.id.ch_Prog);


    }

    public void registrar (View v){
        String nombre,apellido,aux = "";
        int ed;
        nombre=nomb.getText().toString().trim();
        apellido=apell.getText().toString().trim();
        ed= Integer.parseInt(edad.getText().toString().trim());

        if(leer.isChecked()) aux= res.getString(R.string.Leer);
        if(bailar.isChecked()) aux = aux+", "+res.getString(R.string.Bailar);
        if(programar.isChecked()) aux = aux+", "+res.getString(R.string.Programar);


        Persona p = new Persona(nombre,apellido,aux,ed);
          p.guardar();

        new AlertDialog.Builder(this).setMessage(res.getString(R.string.mensaje)).show();
        Borrar();
    }
    public void Borrar(View v){
        Borrar();
    }

     public void Borrar(){
         nomb.setText("");
         apell.setText("");
         edad.setText("");
         leer.setChecked(true);
         bailar.setChecked(false);
         programar.setChecked(false);

         nomb.requestFocus();
     }


}
