package com.example.admin.retrofitcricket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApiService Service=RetrofitClass.getApiServices();
        Call<Cricket> cricketCall=Service.getCricket();
        Log.i("URL",cricketCall.request().url().toString());
        cricketCall.enqueue(new Callback<Cricket>() {
            @Override
            public void onResponse(Call<Cricket> call, Response<Cricket> response) {
                if (response.isSuccessful()){
                    List<Cricket.Bowlers> bowlers=response.body().getBowlers();
                    List<Cricket.Batsman> batsmen=response.body().getBatsman();
                    Log.i("response",batsmen+"@"+bowlers);
                    ListView listView=findViewById(R.id.listview);
                    CustomAdapter adapter=new CustomAdapter(MainActivity.this,bowlers,batsmen);
                    listView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<Cricket> call, Throwable t) {
                Log.i("error",t.getMessage());

            }
        });


    }
}
