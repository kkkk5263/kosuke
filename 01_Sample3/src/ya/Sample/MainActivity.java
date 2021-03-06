package ya.Sample;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;


public class MainActivity extends Activity
{
        TextView tv;
        Button bt;

protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        LinearLayout ll=new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        setContentView(ll);

        tv=new TextView(this);
        tv.setText("いらっしゃいませ");
        bt=new Button(this);
        bt.setText("購入");

        ll.addView(tv);
        ll.addView(bt);

        bt.setOnClickListener(new SampleClickListener());
        }

class SampleClickListener implements OnClickListener {
    public void onClick(View v) {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("購入")
                .setMessage("有難うございます")
                .setPositiveButton("OK", null).show();
        }
    }
}