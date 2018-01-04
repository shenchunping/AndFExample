package com.we.scp.andframe;

import android.content.Context;

import com.google.gson.Gson;
import com.we.scp.andapi.ApiModule;
import com.we.scp.andapi.encrypt.AesEncryptImpl;
import com.we.scp.andapi.encrypt.IEncrypt;
import com.we.scp.andmvp.scopes.ApplicationScope;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by shenchunping on 2017/12/6.
 */
@Module
@ApplicationScope
public class AppModule {

    private final Context mContext;
    private final ApiModule mApiModule;


    public AppModule(Context context) {
        mContext = context;
        mApiModule = new ApiModule();
    }

    @Provides
    public Api getApi() {
        Gson gson = new Gson();
        IEncrypt encrypt = new AesEncryptImpl("");
        encrypt.setEncrypt(false);
        encrypt.setDecrypt(false);
        OkHttpClient client = mApiModule.simpleConfigOkHttpClient(mContext);
        Retrofit retrofit = mApiModule.simpleJsonRetrofit(Api.BASE_URL, client, gson, encrypt);
        return retrofit.create(Api.class);
    }


}
