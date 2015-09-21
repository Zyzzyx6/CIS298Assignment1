package edu.kvcc.cis298.cis298assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CounterActivity extends AppCompatActivity {

    private Button mPlusButton;   //
    private Button mMinusButton;  //


    int n1 = 1; //declare n1 intial value


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        mPlusButton = (Button) findViewById(R.id.plus_button);  //Reference plus_button id in XML
        mPlusButton.setOnClickListener(new View.OnClickListener() {  //OnClick Listener for plus button

            @Override
        public void onClick(View v) {

                int ans = n1++;  //Add 1 to previous click value

                TextView txtValue = (TextView) findViewById(R.id.people_counter);
                txtValue.setText(Integer.toString(ans));  //set displayed text to value of ans

              if (ans == 20) {          //Check if counter has reached 20 if so display toast

                        Toast.makeText(CounterActivity.this,
                                R.string.twenty_toast,
                                Toast.LENGTH_SHORT).show();
                    }

            }

        });

        mMinusButton = (Button) findViewById(R.id.minus_button);
        mMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
                int ans = n1--;  //subtract 1 from previous value of n1

                final TextView txtValue = (TextView) findViewById(R.id.people_counter);
                txtValue.setText(Integer.toString(ans));  //set displayed text to value of ans

                if (ans == 20) {        //Check if counter has reached 20 if so display toast


                    Toast.makeText(CounterActivity.this,
                            R.string.twenty_toast,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

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
