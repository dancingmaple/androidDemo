package com.maple.zsj.baseapp.test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maple.zsj.baseapp.R;
import com.maple.zsj.baseapp.base.BaseFragment;

/**
 * Created by Administrator on 2017/12/27.
 */

public class TestBaseFragment extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.test_base_fragment,container,false);
    }
}
