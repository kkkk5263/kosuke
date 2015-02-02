package ya.Sample;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity
{

	ImageView[] iv = new ImageView[3];
	Bitmap bmp;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		LinearLayout ll = new LinearLayout(this);
		ll.setOrientation(LinearLayout.HORIZONTAL);
		ll.setGravity(Gravity.CENTER);
		setContentView(ll);
		
		bmp = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
		
		for(int i=0; i<iv.length; i++)
		{
			iv[i] = new ImageView(this);
			iv[i].setImageBitmap(bmp);
			
			ll.addView(iv[i]);
			
			iv[i].setOnClickListener(new SampleClickListener());
		}
	}
	class SampleClickListener implements OnClickListener
	{
		public void onClick(View v)
		{
			ImageView tmp = (ImageView) v;
			RotateAnimation anim = new RotateAnimation(0, 360, tmp.getWidth()/2, tmp.getHeight()/2);
			anim.setDuration(1000);
			tmp.startAnimation(anim);
		}
		
	}
}