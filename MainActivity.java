package com.example.cansu.liste_ornegi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView1;
    String[] listValue = {"Cansu", "Arslan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView1 = (ListView) findViewById(R.id.listview1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listValue);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               
                getPosition(position);

            }
        });


    }

    public void getPosition(int position) {
        switch (position) {
            case 0:
                Intent intent0 = new Intent(MainActivity.this, Detail.class);
                Bundle bundle0 = new Bundle();
                bundle0.putString("key", listValue[position]);
                intent0.putExtras(bundle0);
                startActivity(intent0);
                break;
            case 1:
                Intent intent1 = new Intent(MainActivity.this, Detail.class);
                Bundle bundle1 = new Bundle();
                bundle1.putString("key", listValue[position]);
                intent1.putExtras(bundle1);
                startActivity(intent1);
                break;

        }
    }
}
