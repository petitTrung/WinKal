package wincal.android.com.wincal;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        ListView month_listview= (ListView) findViewById(R.id.month_listview);
        month_listview.setAdapter(new MonthAdapter(this, new String[] { "data1",
                "data2","data3","data3","data3","data3","data3","data3" }));

        ListView  date_listview= (ListView) findViewById(R.id.date_listview);
        date_listview.setAdapter(new MonthAdapter(this, new String[] { "data1",
                "data2","data3","data4","data5","data6","data7","data8" }));

        ListView  year_listview= (ListView) findViewById(R.id.year_listview);
        year_listview.setAdapter(new MonthAdapter(this, new String[] { "data1",
                "data2","data3","data3","data3","data3","data3","data3" }));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
