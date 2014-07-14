package com.ica.dice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;


public class MainActivity extends Activity {
	private ImageView imgDie1;
	private ImageView imgDie2;
    private ImageView imgDie3;
    private ImageView imgDie4;
	private Button btnDiceRoll;
	private Dice dice = new Dice(4,1,6);

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		imgDie1 = (ImageView)findViewById(R.id.die1);
		imgDie2 = (ImageView)findViewById(R.id.die2);
        imgDie3 = (ImageView)findViewById(R.id.die3);
        imgDie4 = (ImageView)findViewById(R.id.die4);
		btnDiceRoll = (Button)findViewById(R.id.buttonRoll);

		imgDie1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				dice.increment(1);				
				displayDice();				
			}
		});
		imgDie2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				dice.increment(2);
				displayDice();				
			}
		});
        imgDie3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                dice.increment(3);
                displayDice();
            }
        });
        imgDie4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                dice.increment(4);
                displayDice();
            }
        });

        btnDiceRoll.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {				
				dice.roll();
				displayDice();				
			}
		});
    }
	
	void displayDice() {
		imgDie1.setImageResource(getWhiteBlackDieResource(dice.getDie(0)));
		imgDie2.setImageResource(getRedWhiteDieResource(dice.getDie(1)));
        imgDie3.setImageResource(getBlueWhiteDieResource(dice.getDie(2)));
        imgDie4.setImageResource(getGreenWhiteDieResource(dice.getDie(3)));
	}
	
	int getWhiteBlackDieResource(int die) {
		switch(die) {
			case 1: 
				return R.drawable.die6_whiteblack_1;
			case 2: 
				return R.drawable.die6_whiteblack_2;
			case 3: 
				return R.drawable.die6_whiteblack_3;
			case 4: 
				return R.drawable.die6_whiteblack_4;
			case 5: 
				return R.drawable.die6_whiteblack_5;
			case 6: 
				return R.drawable.die6_whiteblack_6;
		}
		return R.drawable.die6_whiteblack_1;
	}

    int getRedWhiteDieResource(int die) {
        switch(die) {
            case 1:
                return R.drawable.die6_redwhite_1;
            case 2:
                return R.drawable.die6_redwhite_2;
            case 3:
                return R.drawable.die6_redwhite_3;
            case 4:
                return R.drawable.die6_redwhite_4;
            case 5:
                return R.drawable.die6_redwhite_5;
            case 6:
                return R.drawable.die6_redwhite_6;
        }
        return R.drawable.die6_redwhite_1;
    }

    int getBlueWhiteDieResource(int die) {
        switch(die) {
            case 1:
                return R.drawable.die6_bluewhite_1;
            case 2:
                return R.drawable.die6_bluewhite_2;
            case 3:
                return R.drawable.die6_bluewhite_3;
            case 4:
                return R.drawable.die6_bluewhite_4;
            case 5:
                return R.drawable.die6_bluewhite_5;
            case 6:
                return R.drawable.die6_bluewhite_6;
        }
        return R.drawable.die6_bluewhite_1;
    }

    int getGreenWhiteDieResource(int die) {
        switch(die) {
            case 1:
                return R.drawable.die6_greenwhite_1;
            case 2:
                return R.drawable.die6_greenwhite_2;
            case 3:
                return R.drawable.die6_greenwhite_3;
            case 4:
                return R.drawable.die6_greenwhite_4;
            case 5:
                return R.drawable.die6_greenwhite_5;
            case 6:
                return R.drawable.die6_greenwhite_6;
        }
        return R.drawable.die6_greenwhite_1;
    }


}
