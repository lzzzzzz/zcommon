package org.fortree.zcommon;

import android.app.Application;
import android.content.Context;

/**
 * Created by lz on 18-6-12.
 * 原作者：DeMonLiu623
 */

public class BaseApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }
}
