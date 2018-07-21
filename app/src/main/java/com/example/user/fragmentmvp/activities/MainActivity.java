package com.example.user.fragmentmvp.activities;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.user.fragmentmvp.R;
import com.example.user.fragmentmvp.model.FModel;
import com.example.user.fragmentmvp.presenter.Fpresenter;
import com.example.user.fragmentmvp.view.Fview;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener,Fview{
    private ListView listView;
    Fpresenter fpresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= (ListView) findViewById(R.id.listview1);
         String [] name={"Jony","Milon Vai", "Mohsiul Sir"};
        ArrayAdapter arrayAdapter= new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,name);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);
        fpresenter=new FModel(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             if(position==0)
             {
                 fpresenter.fragment_jony();

             }
             else if(position==1)
             {
                 fpresenter.fragment_milon();
             }
    }

    @Override
    public void show_jony() {
        Fragment fragment;
        fragment=new JonyFragment();
        getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
    }

    @Override
    public void show_milon() {
        Fragment fragment;
        fragment=new MilonFragment();
        getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
    }
}
