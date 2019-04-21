package com.example.apifeed;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

   // String Base_Url="http://dummy.restapiexample.com/api/v1/";
    String Base_Url="https://newsapi.org/v2/";

    @GET("everything?q=bitcoin&from=2019-03-09&sortBy=publishedAt&apiKey=0a30fe3ad9a04fc58094a214530513e9")
    Call<List<Data>> getPost();
}
