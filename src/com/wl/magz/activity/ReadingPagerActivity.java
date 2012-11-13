package com.wl.magz.activity;

import com.wl.magz.R;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class ReadingPagerActivity extends FragmentActivity {

    public void onCreate(Bundle savedInstanceState) {
        // ViewPager and its adapters use support library
        // fragments, so use getSupportFragmentManager.
        setContentView(R.layout.reading_pager_activity);
//        mDemoCollectionPagerAdapter =
//                new DemoCollectionPagerAdapter(
//                        getSupportFragmentManager());
//        mViewPager = (ViewPager) findViewById(R.id.pager);
//        mViewPager.setAdapter(mDemoCollectionPagerAdapter);
    }
}
