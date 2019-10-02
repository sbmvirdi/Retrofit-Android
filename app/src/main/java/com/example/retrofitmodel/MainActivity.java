package com.example.retrofitmodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.retrofitmodel.Adapters.DataAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetDataService service = RetrofitInstance.getInstance().create(GetDataService.class);
        Call<List<DataModel>> call = service.getAllData();
        call.enqueue(new Callback<List<DataModel>>() {
            @Override
            public void onResponse(Call<List<DataModel>> call, Response<List<DataModel>> response) {
               generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<DataModel>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed to fetch the data!", Toast.LENGTH_SHORT)
                        .show();
            }
        });




    }
    public void generateDataList(List<DataModel> modelList){
    rec =findViewById(R.id.recycler);
    rec.setLayoutManager(new LinearLayoutManager(this));
        DataAdapter adapter = new DataAdapter(modelList,getApplicationContext());
        rec.setAdapter(adapter);
    }
}
