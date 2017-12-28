package com.maple.zsj.baseapp.test.impro;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.maple.zsj.baseapp.R;
import com.maple.zsj.baseapp.base.activities.BaseRecyclerViewActivity;
import com.maple.zsj.baseapp.base.adapter.BaseRecyclerAdapter;

import java.lang.reflect.Type;

/**
 * Created by Administrator on 2017/12/28.
 */

public class TestImproBaseRecyclerViewActivity extends BaseRecyclerViewActivity<TestImproBaseRecyclerViewActivity.User>{
    @Override
    protected Type getType() {
        return null;
    }

    @Override
    protected BaseRecyclerAdapter getRecyclerAdapter() {
        BaseRecyclerAdapter adapter = new TestBaseRecyclerAdapter(this,BaseRecyclerAdapter.ONLY_FOOTER);
        return adapter;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        mRefreshLayout.setEnabled(false);
        setSwipeBackEnable(true);

    }

    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        return new GridLayoutManager(this,3);
    }

    class User {
        String name;
        int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    class TestBaseRecyclerAdapter extends BaseRecyclerAdapter<User>{

        public TestBaseRecyclerAdapter(Context context, int mode) {
            super(context, mode);
            for (int i = 0 ; i < 10 ; i ++){
                User user = new User();
                user.setId(i);
                user.setName("zsj"+i);
                mItems.add(user);
            }
        }

        @Override
        protected RecyclerView.ViewHolder onCreateDefaultViewHolder(ViewGroup parent, int type) {
            return new MyViewHolder(mInflater.inflate(R.layout.test_item_list_fragment,parent,false));
        }

        @Override
        protected void onBindDefaultViewHolder(RecyclerView.ViewHolder holder, User item, int position) {
            MyViewHolder viewHolder = (MyViewHolder)holder;
            viewHolder.tv1.setText(item.getId()+"");
            viewHolder.tv2.setText(item.getName());

        }
        class MyViewHolder extends RecyclerView.ViewHolder{
            TextView tv1,tv2;
            public MyViewHolder(View view) {
                super(view);
                tv1 = (TextView) view.findViewById(R.id.textView1);
                tv2 = (TextView) view.findViewById(R.id.textView2);
            }
        }
    }
}
