package com.tirisulayoga;

import android.support.multidex.MultiDexApplication;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class TirisulaYoga extends MultiDexApplication {

    private static TirisulaYoga instance;
    public String SERVER_ERROR = "Unable to connect to server, please try again after sometime";


    @Override

    public void onCreate() {
        super.onCreate();
        instance = this;
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Raleway-Bold.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }

    public static TirisulaYoga getInstance() {
        return instance;
    }
}

