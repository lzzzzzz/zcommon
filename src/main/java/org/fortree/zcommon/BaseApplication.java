package org.fortree.zcommon;

import android.app.Application;
import android.content.Context;

/**
 * Created by lz on 18-6-12.
 * 原作者：DeMonLiu623
 */
/***
public class BaseApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        DevRing.init(this);
        
        //2.根据你的需求进行相关模块的全局配置

        //配置网络请求模块，如BaseUrl,连接超时时长，Log，全局Header，缓存，失败重试等
        DevRing.configureHttp().setXXX()...

        //配置图片加载模块，如替换实现框架，加载中图片，加载失败图片，开启过渡效果，缓存等
        DevRing.configureImage().setXXX()...

        //配置事件总线模块，如替换实现框架，EventBus的index加速
        DevRing.configureBus().setXXX()...

        //配置数据库模块、替换实现框架
        DevRing.configureDB(dbManager);

        //配置缓存模块，如磁盘缓存的地址、大小等
        DevRing.configureCache().setXXX()...

        //配置其他模块，如是否显示RingLog，是否启用崩溃日志等
        DevRing.configureOther().setXXX()...

        //3.构建
        DevRing.create();
    }

    public static Context getContext() {
        return mContext;
    }
}
*/
