package com.maple.zsj.baseapp.base.activities;

import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;

import com.maple.zsj.baseapp.R;


/**
 * Created by haibin
 * on 2016/12/1.
 */

public abstract class BackActivity extends BaseActivity {
    protected Toolbar mToolBar;

    @Override
    protected void initWindow() {
        super.initWindow();
//        mToolBar = (Toolbar) findViewById(R.id.toolbar);   // TODO: 2017/12/27
        if (mToolBar != null) {
            setSupportActionBar(mToolBar);
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(true);
                actionBar.setHomeButtonEnabled(false);
            }
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
