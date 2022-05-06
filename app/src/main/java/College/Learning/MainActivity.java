package College.Learning;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private Button submit;
    private Spinner combo;
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetViews();

        setSpinner();


    }


    private void setSpinner() {
        DrinksMockUp database = new DrinksMockUp();
        String[] cat = database.getCategories();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cat);
        combo.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView, View itemView, int itemPosition, long itemId) {
                String Cat = listView.getItemAtPosition(itemPosition).toString();
                Toast.makeText(MainActivity.this, Cat, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void SetViews() {
        submit = findViewById(R.id.executebtn);
        combo = findViewById(R.id.spinner);
        listview = findViewById(R.id.listDrinks);

    }


    public void btnOn_Click(View view) {
        String str = combo.getSelectedItem().toString();
        DrinksMockUp database = new DrinksMockUp();
        ArrayList<Drink> list = database.getDrinks(str);


        ArrayList<Drink> result = database.getDrinks(str);

        ArrayAdapter<Drink> adapterlist = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, result);
        listview.setAdapter(adapterlist);

    }


}