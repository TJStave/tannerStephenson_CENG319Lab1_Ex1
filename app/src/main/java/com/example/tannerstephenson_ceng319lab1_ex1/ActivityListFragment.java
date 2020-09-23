package com.example.tannerstephenson_ceng319lab1_ex1;

import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.ListFragment;

public class ActivityListFragment extends ListFragment {
    //
    String[] activities = new String[]
            {
                    "AIActivity",
                    "VRActivity"
                     };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_list, container, false);
        //ArrayAdapter creates a view for each array item
        // by calling toString() on each item and placing
        // the contents in a TextView.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, activities);
        //bind the list view with array adapter
        setListAdapter(adapter);
        Toast toast = Toast.makeText(getContext(), "List OnCreateView", Toast.LENGTH_SHORT);
        toast.show();

        return view;

    }
    @Override
    public void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(getContext(), "List OnStart", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if(position==0) {
            Intent intent = new Intent(getContext(), AIActivity.class);
            startActivity(intent);
        }
        if(position==1) {
            Intent intent = new Intent(getContext(), VRActivity.class);
            startActivity(intent);
        }
    }
}
