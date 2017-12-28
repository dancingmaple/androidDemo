package com.maple.zsj.baseapp.test;

import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.maple.zsj.baseapp.R;
import com.maple.zsj.baseapp.base.BaseListFragment;
import com.maple.zsj.baseapp.base.ListBaseAdapter;
import com.maple.zsj.baseapp.base.entity.Entity;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

import static com.maple.zsj.baseapp.base.ListBaseAdapter.STATE_LESS_ONE_PAGE;

/**
 * Created by Administrator on 2017/12/27.
 */

public class TestListFragment extends BaseListFragment<Entity>{

    @Override
    protected ListBaseAdapter<Entity> getListAdapter() {
        mSwipeRefreshLayout.setEnabled(false);
        ArrayList<Author> datalist = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++){
            Author author = new Author();
            author.setName("zsj"+ i);
            author.setPortrait("ppp"+i);
            author.setId(STATE_LESS_ONE_PAGE);
            datalist.add(author);
        }
        ListBaseAdapter authorAdapter = new AuthorAdapter();
        authorAdapter.setData(datalist);
        return authorAdapter;
    }


    @Override
    protected void sendRequestData() {

    }

    class Author extends Entity {

        @XStreamAlias("name")
        private String name;

        @XStreamAlias("portrait")
        private String portrait;

        @XStreamAlias("")
        private String oscName;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPortrait() {
            return portrait;
        }

        public void setPortrait(String portrait) {
            this.portrait = portrait;
        }

    }

    class AuthorAdapter extends ListBaseAdapter<Author> {

        @Override
        protected View getRealView(int position, View convertView, ViewGroup parent) {
            ViewHolder vh = null;
            int type = getItemViewType(position);
            if (convertView == null || convertView.getTag() == null) {

                convertView = getLayoutInflater(parent.getContext()).inflate(
                        R.layout.test_item_list_fragment, null);
                vh = new ViewHolder(convertView);
                convertView.setTag(vh);
            }else {
                vh = (ViewHolder) convertView.getTag();
            }
            vh.tv1.setText(mDatas.get(position).getName());
            vh.tv2.setText(mDatas.get(position).getPortrait());
            return convertView;
        }
        class ViewHolder{
            TextView tv1,tv2;

            public ViewHolder(View view) {
                tv1 = (TextView) view.findViewById(R.id.textView1);
                tv2 = (TextView) view.findViewById(R.id.textView2);
            }
        }
    }
}
