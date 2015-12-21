package com.moxingnet.ect10;

import android.app.Activity;
import android.os.Bundle;

import com.BeeFramework.BeeFrameworkApp;
import com.BeeFramework.model.BeeQuery;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();
        if(BeeQuery.environment() == BeeQuery.ENVIROMENT_DEVELOPMENT)
        {
            BeeFrameworkApp.getInstance().showBug(this);
        }
    }
}
