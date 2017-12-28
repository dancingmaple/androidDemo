package com.maple.zsj.baseapp.base;

import android.content.Context;

import com.maple.zsj.baseapp.BuildConfig;
import com.maple.zsj.baseapp.base.app.AppContext;
import com.maple.zsj.baseapp.base.app.AppCrashHandler;
import com.maple.zsj.baseapp.base.app.MySharedPreference;

/**
 * Created by qiujuer
 * on 2016/10/27.
 */
public class App extends AppContext {
    private static final String CONFIG_READ_STATE_PRE = "CONFIG_READ_STATE_PRE_";

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化操作
        init();
    }

    public static void reInit() {
        ((App) App.getInstance()).init();
    }

    private void init() {
        MySharedPreference.init(this, "osc_update_sp");
        // 初始化异常捕获类
        AppCrashHandler.getInstance().init(this);

        if (MySharedPreference.getInstance().hasShowUpdate()) {//如果已经更新过
            //如果版本大于更新过的版本，就设置弹出更新
            if (BuildConfig.VERSION_CODE > MySharedPreference.getInstance().getUpdateVersion()) {
                MySharedPreference.getInstance().putShowUpdate(true);
            }
        }
    }
}
