package vn.tien.photo_world.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import vn.tien.photo_world.R;
import vn.tien.photo_world.ui.fragment.CollectionFragment;
import vn.tien.photo_world.ui.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private HomeFragment mHomeFragment;
    private CollectionFragment mCollectionFragment;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents() {
        mTabLayout = findViewById(R.id.tab_layout);
        mToolbar = findViewById(R.id.tool_bar);
        mViewPager = findViewById(R.id.view_pager);

        mHomeFragment = new HomeFragment();
        mCollectionFragment = new CollectionFragment();

        mToolbar.setTitle(R.string.app_name);
        mToolbar.setNavigationIcon(R.drawable.ic_monochrome_photos_black_24dp);
        setSupportActionBar(mToolbar);
        setUpViewPager(mViewPager);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    public static Intent getIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    private void setUpViewPager(ViewPager viewPager) {
        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(mHomeFragment, getString(R.string.title_home));
        pagerAdapter.addFragment(mCollectionFragment,getString(R.string.title_collection));

        mViewPager.setAdapter(pagerAdapter);
    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragments = new ArrayList<>();
        private final List<String> mTitles = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles.get(position);
        }

        public void addFragment(Fragment fragment, String title) {
            mFragments.add(fragment);
            mTitles.add(title);
        }
    }
}
