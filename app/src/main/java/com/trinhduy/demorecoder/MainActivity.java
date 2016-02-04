package com.trinhduy.demorecoder;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lvExample;
    private boolean isPlay = false;
    String [] example = new String[]{"The", "They", "Where"};
    Integer[] imgid = new Integer[]{R.drawable.play};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterListView adapterListView = new AdapterListView(this, example, imgid);

        lvExample = (ListView)findViewById(R.id.lvExample);
        lvExample.setAdapter(adapterListView);


        isPlay = true;
        final Button btnPlay = (Button)findViewById(R.id.btnPlay);

        /*btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlay){
                    btnPlay.setBackgroundResource(R.drawable.play);
                    isPlay = false;

                }else {
                    btnPlay.setBackgroundResource(R.drawable.recorder);
                    isPlay = true;
                }
            }
        });*/

    }

    public void myclick(View v){
//        isPlay = true;
        final Button btnPlay = (Button)findViewById(R.id.btnPlay);

        if (isPlay){
            btnPlay.setBackgroundResource(R.drawable.play);
            isPlay = false;

            Toast.makeText(this,"Reader Text",Toast.LENGTH_LONG).show();

        }else {
            btnPlay.setBackgroundResource(R.drawable.recorder);
            isPlay = true;
            Toast.makeText(this,"Recording ",Toast.LENGTH_LONG).show();
        }
    }

}
