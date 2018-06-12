个人所用安卓开发基础类库包
功能类库：
1.网络(待添加文件下载相关功能)
2.图片显示
3.基础application、activity等

功能使用如下
一、基础application、activity等
MVP构建
1.创建presenter
public class MainPresenter extends MainContract.Presenter {
    private static final String TAG = "MainPresenter";
    public MainPresenter(MainContract.View view) {
        super(view);
    }
    }
}
2.创建activity
public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View{
...
}

二、网络功能使用
1.创建ApiService类
用于Retrofit管理Api及请求参数。

public interface ApiService {
    @GET("geocoding")
    Observable<String> getLocation(@Query("a") String a);//获取的请求结果为String
    ...
    }

2.创建Api类
强烈建议使用单例模式获取ApiService实例。
根据RESTful API配置baseUrl。

public class Api {

    private String baseUrl = "http://gc.ditu.aliyun.com/";//阿里云根据地区名获取经纬度接口

    private volatile static ApiService apiService;

    public static ApiService getApiService() {
        if (apiService == null) {
            synchronized (Api.class) {
                if (apiService == null) {
                    new Api();
                }
            }
        }
        return apiService;
    }

    private Api() {
        BaseApi baseApi = new BaseApi();
        apiService = baseApi.getRetrofit(baseUrl).create(ApiService.class);
    }
    ...}
3.构建网络请求

mModel.Subscribe(mContext, Api.getApiService().getLocation(city), new ObserverOnNextListener() {
                 @Override
                 public void onNext(Object o) {
                     getView().result(o+"");
                 }
        });


参考：
1.https://github.com/DeMonLiu623/DeMon_MVPRR