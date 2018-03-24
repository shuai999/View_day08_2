package com.jackchen.view_day08_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 下边这个获取不到view的高度，因为参数3是null，即就是父布局是null，说明你还没有把activity_main添加到父布局中，所以不能获取到宽高
        View view = View.inflate(this, R.layout.activity_main, null);


        // 这个可以获取到宽高，因为 参数3ViewGroup表示父布局，下边代码就表示，你已经把activity_main布局添加到父布局中了，所以可以获取到宽高
//        View view = View.inflate(this, R.layout.activity_main, ViewGroup);


        text_view = (TextView) findViewById(R.id.text_view);
        Log.e("TAG" , "height1 -> " + text_view.getMeasuredHeight()) ;   // 0

        text_view.post(new Runnable() {
            @Override
            public void run() {
                Log.e("TAG" , "height2 -> " + text_view.getMeasuredHeight()) ;  // 高度：51
            }
        }) ;
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("TAG" , "height3 -> " + text_view.getMeasuredHeight()) ;  // 0
    }
}
