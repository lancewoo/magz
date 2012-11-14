package com.wl.magz.activity;

import com.wl.magz.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ReadingPagerActivity extends FragmentActivity {
    private ReadingPagerAdapter mPagerAdapter;
    private ViewPager mViewPager;

    public void onCreate(Bundle savedInstanceState) {
        // ViewPager and its adapters use support library
        // fragments, so use getSupportFragmentManager.
        setContentView(R.layout.reading_pager_activity);
        mPagerAdapter = new ReadingPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mPagerAdapter);
        
        super.onCreate(savedInstanceState);
    }
    
    
    public class ReadingPagerAdapter extends FragmentStatePagerAdapter {
        public ReadingPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        
        @Override
        public Fragment getItem(int i) {
            Fragment fragment = new PageFragment();
            Bundle args = new Bundle();
            // Our object is just an integer :-P
            args.putInt(PageFragment.ARG_OBJECT, i + 1);
            fragment.setArguments(args);
            return fragment;
        }
        
        @Override
        public int getCount() {
            return 3;
        }
        
        @Override
        public CharSequence getPageTitle(int position) {
            return "OBJECT " + (position + 1);
        }
    }
    
    public static class PageFragment extends Fragment {
        public static final String ARG_OBJECT = "object";

        @Override
        public View onCreateView(LayoutInflater inflater,
                ViewGroup container, Bundle savedInstanceState) {
            // The last two arguments ensure LayoutParams are inflated
            // properly.
            View rootView = inflater.inflate(
                    R.layout.page_fragment, container, false);
            Bundle args = getArguments();
//            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
//                    Integer.toString(args.getInt(ARG_OBJECT)));
            return rootView;
        }
    }

}
