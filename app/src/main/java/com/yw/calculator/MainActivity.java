package com.yw.calculator;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends Activity implements Button.OnClickListener{

    private StringBuffer sb = new StringBuffer();
    private TextView editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
//        equalsTest();
    }

    private void setupView() {
        editText = (TextView)findViewById(R.id.editText);
    }

    private void equalsTest(){
        char[] a = {'1','2','3'};
        String str1 = new String(a);
        String str2 = new String(a);

        if (str1.equals(str2)){
            Log.i("info", "str1.equals(str2)");
        }

        if (str1 == str2)
        {
            Log.i("info", "str1 == str2");
        }

        ArrayList<Integer> list1  = new ArrayList<Integer>(2);
        list1.add(new Integer(2));

        ArrayList<Integer> list2  = new ArrayList<Integer>(2);
        list2.add(new Integer(2));

        if (list1.equals(list2)){
            Log.i("info", "list1.equals(list2)");
        }

        if (list1 == list2)
        {
            Log.i("info", "list1 == list2");
        }
    }
    @Override
    public void onClick(View v) {
        String text = ((Button)v).getText().toString();
        if(!"=".equals(text)){
            sb.append(text);
            editText.setText(sb.toString());
        }else{

        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
