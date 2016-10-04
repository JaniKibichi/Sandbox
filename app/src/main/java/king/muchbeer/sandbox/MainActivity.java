package king.muchbeer.sandbox;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fab;
    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      setSupportActionBar(toolbar);

        fab = (FloatingActionButton) findViewById(R.id.fab);

        // Find the ListView resource.
        mainListView = (ListView) findViewById( R.id.mainListView );

        // Create and populate a List of planet names.
        String[] Shortcode = new String[] { "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"};

        // storing string resources into Array
        String[] code_products = getResources().getStringArray(R.array.adobe_products);

        ArrayList<String> planetList = new ArrayList<String>();


        planetList.addAll( Arrays.asList(code_products) );



        // Create ArrayAdapter using the planet list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.chat_rooms_list_row, R.id.label, planetList);

      /*
        listAdapter.add( "11221" );
        listAdapter.add( "12112" );
        listAdapter.add( "54543" );
        listAdapter.add( "56434" );
        listAdapter.add( "86774" );

        */

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter( listAdapter );


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Click action
                Intent intent = new Intent(MainActivity.this, NewMessageActivity.class);
                startActivity(intent);
            }
        });
    }
}
