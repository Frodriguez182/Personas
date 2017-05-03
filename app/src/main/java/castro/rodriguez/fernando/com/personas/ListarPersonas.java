package castro.rodriguez.fernando.com.personas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListarPersonas extends AppCompatActivity {


    private ListView Lista;
    private ArrayList<Persona>personas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_personas);

        Lista= (ListView)findViewById(R.id.lvList);


    }
}
