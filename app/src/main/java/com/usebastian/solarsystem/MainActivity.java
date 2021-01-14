package com.usebastian.solarsystem;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private double alfa = 0;
    private double beta = 0;
    private double gama = 0;
    private double earth = 0;
    private double venus = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));


    }

    public class MyView extends View {

        public MyView(Context context) {

            super(context);
        }


        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            int width = getWidth();
            int height = getHeight();
            int radius = 200;

            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
            canvas.drawPaint(paint);
            paint.setColor(Color.parseColor("#FAB500"));
            canvas.drawCircle(width / 2, height / 2, radius, paint);

            int dist_planet_one = 400;
            int radius_planet_one = 100;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
            paint.setColor(Color.parseColor("#4169E1"));
            canvas.drawCircle(Math.round(dist_planet_one * Math.cos(alfa) + (width / 2)), Math.round(dist_planet_one * Math.sin(alfa) + (height / 2)), radius_planet_one, paint);

            int dist_planet_two = 500;
            int radius_planet_two = 50;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
            paint.setColor(Color.parseColor("#8B0000"));
            canvas.drawCircle(Math.round(dist_planet_two * Math.sin(beta) + (width / 2)), Math.round(dist_planet_two * Math.cos(beta) + (height / 2)), radius_planet_two, paint);

            int dist_planet_three = 300;
            int radius_planet_three = 70;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
            paint.setColor(Color.parseColor("#20B2AA"));
            canvas.drawCircle(Math.round(dist_planet_three * Math.cos(gama) + (width / 2)), Math.round(dist_planet_three * Math.sin(gama) + (height / 2)), radius_planet_three, paint);

            int dist_planet_four = 200;
            int radius_planet_four = 80;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
            paint.setColor(Color.parseColor("#FFA500"));
            canvas.drawCircle(Math.round(dist_planet_four * Math.sin(earth) + (width / 2)), Math.round(dist_planet_four * Math.cos(earth) + (height / 2)), radius_planet_four, paint);


            int dist_planet_five = 700;
            int radius_planet_five = 80;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
            paint.setColor(Color.parseColor("#8A2BE2"));
            canvas.drawCircle(Math.round(dist_planet_five * Math.sin(earth) + (width / 2)), Math.round(dist_planet_five * Math.cos(earth) + (height / 2)), radius_planet_five, paint);


            alfa += Math.PI / 10;
            beta += Math.PI / 30;
            gama += Math.PI / 40;
            earth += Math.PI / 20;
            venus += Math.PI / 70;

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.invalidate();
        }

    }


}