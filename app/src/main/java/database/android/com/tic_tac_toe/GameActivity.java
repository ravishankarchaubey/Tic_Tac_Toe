package database.android.com.tic_tac_toe;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends Activity implements View.OnClickListener{
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,replay;
    TextView tv1;
    int count=0,tap=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        tv1=(TextView)findViewById(R.id.tv1);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        replay=(Button)findViewById(R.id.replay);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        replay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.equals(btn1))
        {
            tap++;
            if(count%2!=0)
            {
                btn1.setText("O");
                tv1.setText("Player 1's Chance");
            }
            else
            {
                btn1.setText("X");
                tv1.setText("Player 2's Chance");
            }
            count++;
            winner();
        }
        else
            if(v.equals(btn2))
            {
                tap++;
                if(count%2!=0) {
                    btn2.setText("O");
                    tv1.setText("Player 1's Chance");
                }
                else {
                    btn2.setText("X");
                    tv1.setText("Player 2's Chance");
                }
                count++;
                winner();
            }
            else
            if(v.equals(btn3))
            {
                tap++;
                if(count%2!=0) {
                    btn3.setText("O");
                    tv1.setText("Player 1's Chance");
                }
                else{
                    btn3.setText("X");
                    tv1.setText("Player 2's Chance");
                }
                count++;
                winner();
            } else
            if(v.equals(btn4))
            {
                tap++;
                if(count%2!=0)
                {
                    btn4.setText("O");
                    tv1.setText("Player 1's Chance");
                }
                else
                {
                    btn4.setText("X");
                    tv1.setText("Player 2's Chance");
                }
                count++;
                winner();
            }
            else
            if(v.equals(btn5))
            {
                tap++;
                if(count%2!=0)
                {
                    btn5.setText("O");
                    tv1.setText("Player 1's Chance");
                }
                else
                {
                    btn5.setText("X");
                    tv1.setText("Player 2's Chance");
                }
                count++;
                winner();
            } else
            if(v.equals(btn6))
            {
                tap++;
                if(count%2!=0)
                {
                    btn6.setText("O");
                    tv1.setText("Player 1's Chance");
                }
                else
                {
                    btn6.setText("X");
                    tv1.setText("Player 2's Chance");
                }
                count++;
                winner();
            } else
            if(v.equals(btn7))
            {
                tap++;
                if(count%2!=0)
                {
                    btn7.setText("O");
                    tv1.setText("Player 1's Chance");
                }
                else
                {
                    btn7.setText("X");
                    tv1.setText("Player 2's Chance");
                }
                count++;
                winner();
            } else
            if(v.equals(btn8))
            {
                tap++;
                if(count%2!=0)
                {
                    btn8.setText("O");
                    tv1.setText("Player 1's Chance");
                }
                else
                {
                    btn8.setText("X");
                    tv1.setText("Player 2's Chance");
                }
                count++;
                winner();
            } else
            if(v.equals(btn9))
            {
                tap++;
                if(count%2!=0)
                {
                    btn9.setText("O");
                    tv1.setText("Player 1's Chance");
                }
                else
                {
                    btn9.setText("X");
                    tv1.setText("Player 1's Chance");
                }
                count++;
                winner();
            }
        else
                if(v.equals(replay))
                {
                    Replay();
                }
}
    public void winner()
    {
        if(tap>=5)
        {
            if(count%2!=0) {
                if ("XXX".equals(btn1.getText().toString() + btn2.getText().toString() + btn3.getText().toString())) {

                    tv1.setText("Winner Player 1");
                    replay.setVisibility(View.VISIBLE);
                } else if ("XXX".equals(btn4.getText().toString() + btn5.getText().toString() + btn6.getText().toString())) {

                    tv1.setText("Winner Player 1");
                    replay.setVisibility(View.VISIBLE);
                }
                else if ("XXX".equals(btn7.getText().toString() + btn8.getText().toString() + btn9.getText().toString())) {

                    tv1.setText("Winner Player 1");
                    replay.setVisibility(View.VISIBLE);
                }
                else if ("XXX".equals(btn1.getText().toString() + btn4.getText().toString() + btn7.getText().toString())) {

                    tv1.setText("Winner Player 1");
                    replay.setVisibility(View.VISIBLE);
                }
                else if ("XXX".equals(btn2.getText().toString() + btn5.getText().toString() + btn8.getText().toString())) {

                    tv1.setText("Winner Player 1");
                    replay.setVisibility(View.VISIBLE);
                }
                else if ("XXX".equals(btn3.getText().toString() + btn6.getText().toString() + btn9.getText().toString())) {

                    tv1.setText("Winner Player 1");
                    replay.setVisibility(View.VISIBLE);
                }
                else if ("XXX".equals(btn1.getText().toString() + btn5.getText().toString() + btn9.getText().toString())) {

                    tv1.setText("Winner Player 1");
                    replay.setVisibility(View.VISIBLE);
                }
                else if ("XXX".equals(btn3.getText().toString() + btn5.getText().toString() + btn7.getText().toString())) {

                    tv1.setText("Winner Player 1");
                    replay.setVisibility(View.VISIBLE);
                }
            }
            else
            {
                if ("OOO".equals(btn1.getText().toString() + btn2.getText().toString() + btn3.getText().toString())) {

                    tv1.setText("Winner Player 2");
                    replay.setVisibility(View.VISIBLE);
                } else if ("OOO".equals(btn4.getText().toString() + btn5.getText().toString() + btn6.getText().toString())) {

                    tv1.setText("Winner Player 2");
                    replay.setVisibility(View.VISIBLE);
                }
                else if ("OOO".equals(btn7.getText().toString() + btn8.getText().toString() + btn9.getText().toString())) {

                    tv1.setText("Winner Player 2");
                    replay.setVisibility(View.VISIBLE);
                }
                else if ("OOO".equals(btn1.getText().toString() + btn4.getText().toString() + btn7.getText().toString())) {

                    tv1.setText("Winner Player 2");
                    replay.setVisibility(View.VISIBLE);
                }
                else if ("OOO".equals(btn2.getText().toString() + btn5.getText().toString() + btn8.getText().toString())) {

                    tv1.setText("Winner Player 2");
                    replay.setVisibility(View.VISIBLE);
                }
                else if ("OOO".equals(btn3.getText().toString() + btn6.getText().toString() + btn9.getText().toString())) {

                    tv1.setText("Winner Player 2");
                    replay.setVisibility(View.VISIBLE);
                }
                else if ("OOO".equals(btn1.getText().toString() + btn5.getText().toString() + btn9.getText().toString())) {

                    tv1.setText("Winner Player 2");
                    replay.setVisibility(View.VISIBLE);
                }
                else if ("OOO".equals(btn3.getText().toString() + btn5.getText().toString() + btn7.getText().toString())) {

                    tv1.setText("Winner Player 2");
                    replay.setVisibility(View.VISIBLE);
                }
            }
        }
        if(tap==9)
        {
            if(tv1.getText().toString().equals("Winner Player 2")||tv1.getText().toString().equals("Winner Player 1"))
                tap=9;
            else
            {
                tv1.setText("Game Draw");
                replay.setVisibility(View.VISIBLE);
            }
        }
    }
    public void Replay()
    {
        count=0;
        tap=0;
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        tv1.setText("Player 1's Chance");
        replay.setVisibility(View.INVISIBLE);
    }
}
