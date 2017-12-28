package com.maple.zsj.baseapp.test.impro;

import com.maple.zsj.baseapp.R;
import com.maple.zsj.baseapp.base.activities.BaseBackActivity;

/**
 * Created by Administrator on 2017/12/28.
 */

public class TestImproBaseActivity extends BaseBackActivity{
    @Override
    protected void initData() {
        super.initData();

    }

    @Override
    protected void initWidget() {
        super.initWidget();
        setSwipeBackEnable(true);
    }

    @Override
    protected int getContentView() {

        return R.layout.test_base_fragment_activity;
    }
}
