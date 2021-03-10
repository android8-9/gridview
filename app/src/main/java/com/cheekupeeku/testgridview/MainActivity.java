package com.cheekupeeku.testgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.cheekupeeku.testgridview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ArrayList<User> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());

        al = new ArrayList<>();
        al.add(new User(R.drawable.bean,"Bean","1111111"));
        al.add(new User(R.drawable.donald,"Donald","22222"));
        al.add(new User(R.drawable.doremon,"Doremon","3333333"));
        al.add(new User(R.drawable.jambo,"Jambo","4444444"));
        al.add(new User(R.drawable.jerry,"Jerry","5555555"));
        al.add(new User(R.drawable.micky,"Mocky","666666666"));
        al.add(new User(R.drawable.motupatlu,"Motu-patlu","77777777"));
        al.add(new User(R.drawable.pickachoo,"Pickachoo","8888888"));
        al.add(new User(R.drawable.powergirls,"Power girls","99999999"));
        al.add(new User(R.drawable.scooby,"Scooby du","10100101"));
        al.add(new User(R.drawable.simbha,"Simbha","12121212"));
        al.add(new User(R.drawable.twitty,"Twitty","343434343434"));

        UserAdapter adapter = new UserAdapter(this,al);
        binding.gv.setAdapter(adapter);
    }
}