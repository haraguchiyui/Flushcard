package com.lifeistech.android.flashcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Word apple;
    LinearLayout container;
    TextView nameTextView;
    Word orange;
    TextView nameTextView2;
    Word grape;
    TextView nameTextView3;
    Word strawberry;
    TextView nameTextView4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apple = new Word(R.drawable.apple_icon, "りんご");
        container = (LinearLayout)findViewById(R.id.container);


        nameTextView = new TextView(getApplicationContext());
        nameTextView.setText(apple.name);
        //container.addView(nameTextView);

        LinearLayout layout = new LinearLayout(this.getApplicationContext());
        layout.setOrientation(LinearLayout.HORIZONTAL);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(apple.resId);

        layout.addView(imageView);
        layout.addView(nameTextView);

        container.addView(layout);



        orange = new Word(R.drawable.orange_icon,"オレンジ");
        container =(LinearLayout)findViewById(R.id.container);

        nameTextView2 = new TextView(getApplicationContext());
        nameTextView2.setText(orange.resId);

        LinearLayout layout1 = new LinearLayout(this.getApplicationContext());
        layout1.setOrientation(LinearLayout.HORIZONTAL);

        ImageView imageView1 = new ImageView(this);
        imageView.setImageResource(orange.resId);

        container.addView(layout1);


        grape = new Word(R.drawable.grape_icon,"ブドウ");
        container=(LinearLayout)findViewById(R.id.container);

        nameTextView3= new TextView(getApplicationContext());
        nameTextView3.setText(grape.resId);

        LinearLayout layout2 = new LinearLayout(this.getApplicationContext());
        layout2.setOrientation(LinearLayout.HORIZONTAL);

        ImageView imageView2 = new ImageView(this);
        imageView2.setImageResource(grape.resId);

        container.addView(layout2);



        strawberry = new Word(R.drawable.strawberry_icon,"イチゴ");
        container=(LinearLayout)findViewById(strawberry.resId);

        LinearLayout layout3= new LinearLayout(this.getApplicationContext());
        layout3.setOrientation(LinearLayout.HORIZONTAL);

        ImageView imageView3 = new ImageView(this);
        imageView3.setImageResource(strawberry.resId);

        container.addView(layout3);




    }

}
