package must.ac.csce.outasamson.xmlcolorswap;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.btn);
        TextView textview = (TextView) findViewById(R.id.textcolor);

        final Random random= new Random();

        button.setOnClickListener((v )-> {
            float red= random.nextFloat();

            float green= random.nextFloat();
            float blue= random.nextFloat();
            textview.setText("r"+String.valueOf(red)+"   g"+String.valueOf(green+" b"+String.valueOf(blue)  ));
            textview.setTextColor(Color.rgb(red,green,blue));
    });
}
}
