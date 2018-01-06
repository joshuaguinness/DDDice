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

                int randomNumberOne = (int)((Math.random()*6)+1);
                int randomNumberTwo = (int)((Math.random()*6)+1);
                int randomQuoteNumber = (int)(Math.random()*10);

                String[] quotes = new String[11];

                quotes[0] = "I shall never believe that God plays dice with the world - Albert Einstein";
                quotes[1] = "If the risk is high, the reward is high... Why not roll the dice - Tyron Woodley";
                quotes[2] = "One who doesn't throw the dice can never expect to score a six - Navjot Singh Sidhu";
                quotes[3] = "Life is like a dice, so watch the ones you're rolling with - LeCrae";
                quotes[4] = "Time to toss the dice - Robert Jordan";
                quotes[5] = "God's dice always have a lucky roll - Sophocles";
                quotes[6] = "Appeal. In law, to put the dice into the box for another throw - Ambrose Bierce";
                quotes[7] = "The die has been cast - Julius Caesar";
                quotes[8] = "It is lost at dice, what ancient honor won - William Shakespeare";
                quotes[9] = "Imposing democracy through force is a roll of the dice - Chuck Hagel";
                quotes[10] = "Football is like chess, only without the dice - Lukas Podolski";

                outputDiceOne.setText(Integer.toString(randomNumberOne));
                outputDiceTwo.setText(Integer.toString(randomNumberTwo));


                outputQuote.setText(quotes[randomQuoteNumber]);


            }
        });

    }
}
