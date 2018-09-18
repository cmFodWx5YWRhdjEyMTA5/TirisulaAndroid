package com.tirisulayoga;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.view.Window;
import android.view.WindowManager;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class DashActivity extends BaseActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
        ButterKnife.bind(this);
        setStatusBar();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void setStatusBar() {
        if (android.os.Build.VERSION.SDK_INT >= 21){
            Window window = getWindow(); // in Activity's onCreate() for instance
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.colorAccent));
        }
    }


    @OnClick(R.id.ll_yoga)
    void llAbout()
    {
        Intent intent = new Intent(getApplicationContext(), WebviewActivity.class);
        intent.putExtra("link","https://tirisulayoga.com/yoga-classes/");
        intent.putExtra("heading","Yoga Classes");
        startActivity(intent);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    @OnClick(R.id.ll_location)
    void llClasses()
    {
        Intent intent = new Intent(getApplicationContext(), WebviewActivity.class);
        intent.putExtra("link","https://tirisulayoga.com/locations/");
        intent.putExtra("heading","Locations");
        startActivity(intent);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }


    @OnClick(R.id.ll_courses)
    void llCourses()
    {
        Intent intent = new Intent(getApplicationContext(), WebviewActivity.class);
        intent.putExtra("link","https://tirisulayoga.com/200hrs-yoga-teacher-training/");
        intent.putExtra("heading","Courses");
        startActivity(intent);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    @OnClick(R.id.ll_franchise)
    void llFranchise()
    {
        Intent intent = new Intent(getApplicationContext(), WebviewActivity.class);
        intent.putExtra("link","https://tirisulayoga.com/franchise/");
        intent.putExtra("heading","Franchise Now");
        startActivity(intent);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    @OnClick(R.id.ll_price)
    void llPricing()
    {
        Intent intent = new Intent(getApplicationContext(), WebviewActivity.class);
        intent.putExtra("link","https://tirisulayoga.com/pricing/");
        intent.putExtra("heading","Pricing");
        startActivity(intent);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    @OnClick(R.id.ll_booking)
    void llBooking()
    {
        Intent intent = new Intent(getApplicationContext(), WebviewActivity.class);
        intent.putExtra("link","https://tirisulayoga.com/bookings/");
        intent.putExtra("heading","Booking");
        startActivity(intent);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }
}
