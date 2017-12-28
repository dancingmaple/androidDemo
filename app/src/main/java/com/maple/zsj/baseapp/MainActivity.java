package com.maple.zsj.baseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.maple.zsj.baseapp.base.BaseActivity;
import com.maple.zsj.baseapp.base.adapter.BaseRecyclerAdapter;
import com.maple.zsj.baseapp.base.util.DialogHelper;
import com.maple.zsj.baseapp.base.view.SimplexToast;
import com.maple.zsj.baseapp.test.TestBaseFragmentActivity;
import com.maple.zsj.baseapp.test.impro.TestImproBaseActivity;
import com.maple.zsj.baseapp.test.impro.TestImproBaseRecyclerViewActivity;

import butterknife.Bind;

public class MainActivity extends BaseActivity {

    @Bind(R.id.tv_base_fragment)
    TextView tv_base_fragment;
    @Bind(R.id.tv_base_list_fragment)
    TextView tv_base_list_fragment;
    @Bind(R.id.tv_base_head_list_fragment)
    TextView tv_base_head_list_fragment;
    @Bind(R.id.tv_base_viewpager_fragment)
    TextView tv_base_viewpager_fragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_base_fragment:
                openActivity(TestBaseFragmentActivity.class);
                showToast("弹出吐司",R.mipmap.icon_call, Gravity.CENTER);
                break;
            case R.id.tv_base_list_fragment:
                openActivity(TestImproBaseActivity.class);
                showWaitDialog();
                break;
            case R.id.tv_base_head_list_fragment:
                DialogHelper.getRecyclerViewDialog(this, new BaseRecyclerAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(int position, long itemId) {

                    }
                }).create().show();
                openActivity(TestImproBaseRecyclerViewActivity.class);
                break;
            case R.id.tv_base_viewpager_fragment:
                SimplexToast.show(this,"test SimpleXToast");
                break;

        }
    }

    @Override
    public void initView() {
        /*tv_base_fragment.setOnClickListener(this);
        tv_base_list_fragment.setOnClickListener(this);
        tv_base_head_list_fragment.setOnClickListener(this);
        tv_base_viewpager_fragment.setOnClickListener(this);*/
        setOnClickListener(this,tv_base_fragment,tv_base_list_fragment,tv_base_head_list_fragment,tv_base_viewpager_fragment);
    }

    @Override
    public void initData() {

    }
}
