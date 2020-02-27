package cl.ubb.randomnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button randomButton = (Button) findViewById(R.id.botonRandom);
//        para capturar la primera imagen
        final ImageView primeraImagen =(ImageView) findViewById(R.id.primerNumero);
//        para capturar la segunda imagen
        final ImageView segundaImagen = (ImageView) findViewById(R.id.segundoNumero);

//        cargar imagenes con picaso en un json BUSCAR EN GOOGLE
        final int [] numerosID = {
                R.drawable.cero,
                R.drawable.uno,
                R.drawable.dos,
                R.drawable.tres,
                R.drawable.cuatro,
                R.drawable.cinco,
                R.drawable.seis,
                R.drawable.siete,
                R.drawable.ocho,
                R.drawable.nueve
        };

        randomButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Random random = new Random();
                int numeroUno = random.nextInt(10);
                int numeroDos = random.nextInt(10);

                primeraImagen.setImageResource(numerosID[numeroUno]);
                segundaImagen.setImageResource(numerosID[numeroDos]);
            }
        });
    }
}
