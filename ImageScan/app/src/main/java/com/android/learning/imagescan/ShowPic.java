package com.android.learning.imagescan;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by 980560 on 2017/3/28.
 */
public class ShowPic extends MainActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.show_image);

        ImageView image = (ImageView) findViewById(R.id.showPic);

    }


}
