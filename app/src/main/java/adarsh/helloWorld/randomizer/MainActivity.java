package adarsh.helloWorld.randomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button)findViewById(R.id.rollButton);
        final TextView resultsTextView = (TextView)findViewById(R.id.resultsTextView);
        final SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);

        //declaring OnClickListener as an object
        View.OnClickListener btnClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Log.v("Seek", Integer.toString(seekBar.getProgress()));
                int rand = (int)(Math.random()*seekBar.getProgress())+1;
                resultsTextView.setText(Integer.toString(rand));
            }
        };

//passing listener object to button
        rollButton.setOnClickListener(btnClick);
    }
}
