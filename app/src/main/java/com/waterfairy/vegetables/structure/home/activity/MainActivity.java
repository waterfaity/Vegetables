package com.waterfairy.vegetables.structure.home.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.waterfairy.vegetables.R;
import com.waterfairy.vegetables.structure.home.fragment.HomePageFragment;
import com.waterfairy.vegetables.structure.home.fragment.MineFragment;
import com.waterfairy.vegetables.structure.home.fragment.ShoppingFragment;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private MineFragment mineFragment;
    private HomePageFragment mHomeFragment;
    private ShoppingFragment mShoppingFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        initView();
        initData();
    }

    private void initData() {

    }

    private void initView() {
        mHomeFragment = new HomePageFragment();
        mineFragment = new MineFragment();
        mShoppingFragment = new ShoppingFragment();
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                if (position == 0) {
                    return mHomeFragment;
                } else if (position == 1) {
                    return mShoppingFragment;
                } else {
                    return mineFragment;
                }
            }

            @Override
            public int getCount() {
                return 3;
            }
        });
    }

    private void findView() {
        mViewPager = findViewById(R.id.view_pager);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.home:
                mViewPager.setCurrentItem(0);
                break;
            case R.id.shopping:
                mViewPager.setCurrentItem(1);
                break;
            case R.id.mine:
                mViewPager.setCurrentItem(2);
                break;
        }
    }
}
