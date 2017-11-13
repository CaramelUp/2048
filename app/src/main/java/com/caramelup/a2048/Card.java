package com.caramelup.a2048;

/**
 * Created by reginaldo on 09/11/17.
 */

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;


public class Card extends FrameLayout {

    public Card(Context context) {
        super(context);

        LayoutParams lp = null;

        background = new View(getContext());
        lp = new LayoutParams(-1, -1);
        lp.setMargins(10, 10, 0, 0);
        background.setBackgroundColor(0x33ffffff);
        addView(background, lp);

        label = new TextView(getContext());
        label.setTextSize(28);
        label.setGravity(Gravity.CENTER);

        lp = new LayoutParams(-1, -1);
        lp.setMargins(10, 10, 0, 0);
        addView(label, lp);

        setNum(0);
    }


    private int num = 0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;

        if (num<=0) {
            label.setText("");
        }else{
            label.setText(num+"");
        }

        switch (num) {
            case 0:
                label.setBackgroundColor(Color.parseColor("#B0BEC5"));
                break;
            case 2:
                label.setBackgroundColor(Color.parseColor("#D50000"));
                break;
            case 4:
                label.setBackgroundColor(Color.parseColor("#4A148C"));
                break;
            case 8:
                label.setBackgroundColor(Color.parseColor("#33691E"));
                break;
            case 16:
                label.setBackgroundColor(Color.parseColor("#F57F17"));
                break;
            case 32:
                label.setBackgroundColor(Color.parseColor("#304FFE"));
                break;
            case 64:
                label.setBackgroundColor(Color.parseColor("#3E2723"));
                break;
            case 128:
                label.setBackgroundColor(Color.parseColor("#9C27B0"));
                break;
            case 256:
                label.setBackgroundColor(Color.parseColor("#006064"));
                break;
            case 512:
                label.setBackgroundColor(Color.parseColor("#AEEA00"));
                break;
            case 1024:
                label.setBackgroundColor(Color.parseColor("#263238"));
                break;
            case 2048:
                label.setBackgroundColor(Color.parseColor("#FF4081"));
                break;
            case 4096:
                label.setBackgroundColor(Color.parseColor("#000000"));
                break;
            default:
                label.setBackgroundColor(Color.parseColor("#64DD17"));
                break;
        }
    }

    public boolean equals(Card o) {
        return getNum()==o.getNum();
    }

    protected Card clone(){
        Card c= new Card(getContext());
        c.setNum(getNum());
        return c;
    }

    public TextView getLabel() {
        return label;
    }

    private TextView label;
    private View background;
}