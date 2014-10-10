package cn.edu.gdmec.s07131033.menudemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView mytv;
    @Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		// TODO Auto-generated method stub
    	super.onOptionsItemSelected(item);
    	switch (item.getItemId()) {
    		case R.id.item1:     
    			mytv.setText("you have selected 'HELLO'");
    			break;
 		case R.id.item2:  
 			  mytv.setText("you have selected 'so good'");
    			break;
		case R.id.item3:    
			mytv.setText("you have selected 'AAA'");
			break;	}
		return super.onMenuItemSelected(featureId, item);
	}
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytv=(TextView) findViewById(R.id.textView1);      
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
