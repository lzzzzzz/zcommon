package org.fortree.zcommon.base;

public interface MainContract {

    interface View extends BaseView {
        void result(String s);
    }

    abstract class Presenter extends BasePresenter<View> {
        public Presenter(View view) {
            super(view);
        }
        public abstract void getLocation(String city);
    }
}