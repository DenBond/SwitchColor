package com.example.LihgtSwap;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Random;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    FrameLayout lay1,lay2;
    LinearLayout lay3,lay4,lay5,lay6;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        lay1 = (FrameLayout) findViewById(R.id.layote1);
        lay2 = (FrameLayout) findViewById(R.id.layoute2);
        lay3 = (LinearLayout) findViewById(R.id.layoute3);
        lay4 = (LinearLayout) findViewById(R.id.layout4);
        lay5 = (LinearLayout) findViewById(R.id.layout5);
        lay6 = (LinearLayout) findViewById(R.id.layout6);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
getMenuInflater().inflate(R.menu.menu,menu);

        return true;
    }
    public int RandColor()
    {

        Random r = new Random();
        int b = r.nextInt();
        return b;

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.change_color:
                    {



                        lay1.setBackgroundColor(RandColor());
                        lay2.setBackgroundColor(RandColor());
                        lay3.setBackgroundColor(RandColor());
                        lay4.setBackgroundColor(RandColor());
                        lay5.setBackgroundColor(RandColor());
                        lay6.setBackgroundColor(RandColor());




                    }
                default:
                    super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }
}
