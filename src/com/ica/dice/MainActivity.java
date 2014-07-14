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
	private ImageView imgDie5;
    private ImageView imgDie6;
    private ImageView imgDie7;
    private TextView imgDie8;
    private TextView imgDie9;

	private Button btnDiceRoll;
	private Dice dice = new Dice(7,1,6);
    private Dice dice10 = new Dice(2,0,9);

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
        imgDie5 = (ImageView)findViewById(R.id.die5);
        imgDie6 = (ImageView)findViewById(R.id.die6);
        imgDie7 = (ImageView)findViewById(R.id.die7);
        imgDie8 = (TextView)findViewById(R.id.die8);
        imgDie9 = (TextView)findViewById(R.id.die9);

		btnDiceRoll = (Button)findViewById(R.id.buttonRoll);

		imgDie1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				dice.increment(0);
				displayDice();				
			}
		});
		imgDie2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				dice.increment(1);
				displayDice();				
			}
		});
        imgDie3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                dice.increment(2);
                displayDice();
            }
        });
        imgDie4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                dice.increment(3);
                displayDice();
            }
        });

        imgDie5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                dice.increment(4);
                displayDice();
            }
        });
        imgDie6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                dice.increment(5);
                displayDice();
            }
        });
        imgDie7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                dice.increment(6);
                displayDice();
            }
        });

        imgDie8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                dice10.increment(0);
                displayDice();
            }
        });
        imgDie9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                dice10.increment(1);
                displayDice();
            }
        });

        btnDiceRoll.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {				
				dice.roll();
                dice10.roll();
				displayDice();				
			}
		});
    }
	
	void displayDice() {
		imgDie1.setImageResource(getWhiteBlackDieResource(dice.getDie(0)));
		imgDie2.setImageResource(getRedWhiteDieResource(dice.getDie(1)));
        imgDie3.setImageResource(getBlueWhiteDieResource(dice.getDie(2)));
        imgDie4.setImageResource(getGreenWhiteDieResource(dice.getDie(3)));
        imgDie5.setImageResource(getBlackWhiteDieResource(dice.getDie(4)));
        imgDie6.setImageResource(getBlackRedDieResource(dice.getDie(5)));
        imgDie7.setImageResource(getYellowBlackDieResource(dice.getDie(6)));

        imgDie8.setText(Integer.toString(dice10.getDie(0)));
        imgDie9.setText(Integer.toString(dice10.getDie(1)));
        /*
		imgDie1.setImageResource(getDieResource(dice.getDie(0), "die6_whiteblack"));
		imgDie2.setImageResource(getDieResource(dice.getDie(1), "die6_redwhite"));
        imgDie3.setImageResource(getDieResource(dice.getDie(2), "die6_bluewhite"));
        imgDie4.setImageResource(getDieResource(dice.getDie(3), "die6_greenwhite"));
        imgDie5.setImageResource(getDieResource(dice.getDie(4), "die6_blackwhite"));
        imgDie6.setImageResource(getDieResource(dice.getDie(5), "die6_blackred"));
        imgDie7.setImageResource(getDieResource(dice.getDie(6), "die6_yellowblack"));
        */
	}

    // too slow?
	int getDieResource(int die, String basename) {
        String name = "drawable/" + basename + "_" + Integer.toString(die);
        return getResources().getIdentifier(name, null, getPackageName());
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

    int getBlackWhiteDieResource(int die) {
        switch(die) {
            case 1:
                return R.drawable.die6_blackwhite_1;
            case 2:
                return R.drawable.die6_blackwhite_2;
            case 3:
                return R.drawable.die6_blackwhite_3;
            case 4:
                return R.drawable.die6_blackwhite_4;
            case 5:
                return R.drawable.die6_blackwhite_5;
            case 6:
                return R.drawable.die6_blackwhite_6;
        }
        return R.drawable.die6_blackwhite_1;
    }

    int getBlackRedDieResource(int die) {
        switch(die) {
            case 1:
                return R.drawable.die6_blackred_1;
            case 2:
                return R.drawable.die6_blackred_2;
            case 3:
                return R.drawable.die6_blackred_3;
            case 4:
                return R.drawable.die6_blackred_4;
            case 5:
                return R.drawable.die6_blackred_5;
            case 6:
                return R.drawable.die6_blackred_6;
        }
        return R.drawable.die6_blackred_1;
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

    int getYellowBlackDieResource(int die) {
        switch(die) {
            case 1:
                return R.drawable.die6_yellowblack_1;
            case 2:
                return R.drawable.die6_yellowblack_2;
            case 3:
                return R.drawable.die6_yellowblack_3;
            case 4:
                return R.drawable.die6_yellowblack_4;
            case 5:
                return R.drawable.die6_yellowblack_5;
            case 6:
                return R.drawable.die6_yellowblack_6;
        }
        return R.drawable.die6_yellowblack_1;
    }
    
}
