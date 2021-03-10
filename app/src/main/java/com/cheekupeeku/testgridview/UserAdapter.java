package com.cheekupeeku.testgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.cheekupeeku.testgridview.databinding.ItemListBinding;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<User> {
  Context context;
  ArrayList<User> al;
  public UserAdapter(Context context, ArrayList<User>al){
      super(context,R.layout.item_list,al);
      this.context = context;
      this.al = al;
  }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      User user = al.get(position);
      ItemListBinding binding = ItemListBinding.inflate(LayoutInflater.from(context));
      binding.imageView.setImageResource(user.getImageId());
      binding.tv.setText(user.getName());
      return binding.getRoot();
    }

    @Override
    public int getCount() {
        return al.size();
    }
}
