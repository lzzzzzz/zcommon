package org.fortree.zcommon.framework.net;

import android.content.Context;


import org.fortree.zcommon.progress.ObserverOnNextListener;
import org.fortree.zcommon.progress.ProgressObserver;

import io.reactivex.Observable;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by lz on 2018/6/12.
 * @author deMon
 */

public class BaseModel<T> {
    /**
     * 封装线程管理和订阅的过程
     */
    public void Subscribe(Context context, final Observable observable, ObserverOnNextListener<T>
            listener) {
        final Observer<T> observer = new ProgressObserver<T>(context, listener);
        observable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }


}