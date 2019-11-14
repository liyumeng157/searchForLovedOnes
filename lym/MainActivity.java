package cn.edu.hebtu.software.xunqin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    private ImageView img_totop=null;
    private ScrollView sc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_totop=findViewById(R.id.btn_toTop);
        sc=findViewById(R.id.sv_home);
        img_totop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sc.post(new Runnable() {
                    public void run() {
                        // 滚动至顶部
                        sc.fullScroll(ScrollView.FOCUS_UP);
                    }
                });
            }
        });
    }
}
