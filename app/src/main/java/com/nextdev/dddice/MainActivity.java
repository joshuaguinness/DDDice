package com.nextdev.dddice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView outputDiceOne;
    TextView outputDiceTwo;
    TextView outputQuote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputDiceOne = (TextView)findViewById(R.id.outputDiceOne);
        outputDiceTwo = (TextView)findViewById(R.id.outputDiceTwo);
        outputQuote = (TextView)findViewById(R.id.outputQuote);

        Button rollButton = (Button)findViewById(R.id.rollButton);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int randomNumberOne = (int)(Math.random()*10);
                int randomNumberTwo = (int)(Math.random()*10);
                int randomQuoteNumber = (int)(Math.random()*10);

                String[] quotes = new String[11];

                quotes[0] = "Is it rolling or stretching";
                quotes[1] = "I'm a dumb";
                quotes[2] = "I'll run it over in my jeep";
                quotes[3] = "Come fly with me";
                quotes[4] = "I'm the smartest man in the world";
                quotes[5] = "Stop yanking on my chain";
                quotes[6] = "No";
                quotes[7] = "Yah sure";
                quotes[8] = "Hug me";
                quotes[9] = "You know my feelings about the japanese";
                quotes[10] = "Torque squad";

                outputDiceOne.setText(Integer.toString(randomNumberOne));
                outputDiceTwo.setText(Integer.toString(randomNumberTwo));

                if(randomNumberOne == 0 && randomNumberTwo == 0){
                    outputQuote.setText(quotes[10]);
                }
                else{
                    outputQuote.setText(quotes[randomQuoteNumber]);
                }

            }
        });

    }
}
