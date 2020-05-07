package com.example.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private ImageView ballI;
   private TextView respuesta;
   private String[]respuestaArray={"Es cierto", "Definitivamente es así", "Sin duda", "Sí definitivamente", "Puede confiar en él", "Como yo lo veo, sí",
           "Lo más probable", "Perspectiva buena", "Sí", "Las señales apuntan a sí", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde",
           "Mejor no decirte ahora", "No puedo predecir ahora", "Concéntrate y pregunta de nuevo", "No cuentes con eso",
           "Mi respuesta es no", "Mis fuentes dicen que no", "Outlook no es tan bueno", "Muy dudoso"}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ballI= findViewById(R.id.boton); // se refiere a la variable que en nuestra pantalla tiene la variable boton
        respuesta= findViewById(R.id.respuesta); //se refiere a la variable

        ballI.setOnClickListener(this); //constantemente escuchando  cada cierto tiempo pregunta si alguien a echo click
    }
    // git add - p. permite ver linea por linea y archivo por archivo lo que modifique
    // Y guardar cambios
}
