package com.maple.zsj.baseapp.base.present;

/**
 * Created by haibin
 * on 2016/11/30.
 */

public interface BaseListPresenter extends BasePresenter {
    void onRefreshing();

    void onLoadMore();
}
