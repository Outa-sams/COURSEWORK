package must.ac.csce.OUTA.outasamsonprogcolorswap;

import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.R.color;
import android.annotation.SuppressLint;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import  android.widget.Button;
import  android.*;
import android.graphics.Color;
import java.util.Random;

public class ProgColorSawp extends Activity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadBroadcastReceiver();
        Button btn = new Button(this);
        //btn.setPadding(200,200,200,200);
        btn.setText("Tap Me!");

        TextView tv = new TextView(this);
        tv.setText("Tap to Change Color");

        final Random random = new Random();

        btn.setOnClickListener((v) -> {
            float red = random.nextFloat();

            float green = random.nextFloat();
            float blue = random.nextFloat();
            tv.setText("r" + String.valueOf(red) + "   g" + String.valueOf(green + " b" + String.valueOf(blue)));
            tv.setTextColor(Color.rgb(red, green, blue));
        });
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams layoutparams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutparams.setMarginStart(30);
        layout.addView(tv);
        layout.addView(btn,layoutparams);
        setContentView(layout);


    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    public void loadBroadcastReceiver(){
        IntentFilter intentFilter= new IntentFilter("must.codes.programcolorswap");
        MyBroadcastReceiver mybroad = new MyBroadcastReceiver();
        registerReceiver(mybroad,intentFilter);

    }





    }







