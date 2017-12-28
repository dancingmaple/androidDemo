package com.maple.zsj.baseapp.test;

import com.maple.zsj.baseapp.base.BaseViewPagerFragment;
import com.maple.zsj.baseapp.base.view.ViewPageFragmentAdapter;

/**
 * Created by Administrator on 2017/12/28.
 */

public class TestViewPagerFragment extends BaseViewPagerFragment{
    @Override
    protected void onSetupTabAdapter(ViewPageFragmentAdapter adapter) {
        adapter.addTab("zsj","first",TestListFragment.class,null);
        adapter.addTab("zzz","second",TestListFragment.class,null);
        adapter.addTab("sss","third",TestBaseFragment.class,null);
        adapter.addTab("jjj","fourth",TestListFragment.class,null);

    }
}
