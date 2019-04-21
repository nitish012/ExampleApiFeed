package com.example.apifeed;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<Data> list;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = findViewById(R.id.recycler);
        getData();
        list = new ArrayList();
        context = MainActivity.this;
    }

    private void getData() {


        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.Base_Url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<List<Data>> call = api.getPost();
        call.enqueue(new Callback<List<Data>>() {
            @Override
            public void onResponse(Call<List<Data>> call, Response<List<Data>> response) {

                Log.i("tag", "onResponse: ");
                list = (ArrayList) response.body();
                recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recycler.setAdapter(new ProgramingAdapter(list, context));


            }

            @Override
            public void onFailure(Call<List<Data>> call, Throwable t) {

            }
        });

    }
}

//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                try {
//                    String resp=response.body().string();
//                    Log.i("tag", "onResponse: "+resp);
//
//
//
// //                   JSONObject jsonObject=new JSONObject(resp);
////                    String id=jsonObject.getString("id");
////                    String emp_name=jsonObject.getString("emp_name");
////                    String emp_age=jsonObject.getString("emp_age");
////                    String emp_salary=jsonObject.getString("emp_salary");
//
//                    JSONArray jsonArray=new JSONArray();
//                    for (int i=0;i<jsonArray.length();i++){
//
//
//                        JSONObject jsonObject=jsonArray.getJSONObject(i);
////                        String id=jsonObject.getString("id");
////                        String employee_name=jsonObject.getString("employee_name");
////                        String employee_salary=jsonObject.getString("employee_salary");
////                        String employee_age=jsonObject.getString("employee_age");
////                        String profile_image=jsonObject.getString("profile_image");
////
////                        list.add(id);
////                        list.add(employee_name);
////                        list.add(employee_salary);
////                        list.add(employee_age);
////                        list.add(profile_image);
//                        list.add(jsonObject);
//
//                    }
//
//                    recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
//                    recycler.setAdapter(new ProgramingAdapter(list,context));
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            }


