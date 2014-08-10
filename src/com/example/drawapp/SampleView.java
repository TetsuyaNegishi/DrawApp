package com.example.drawapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class SampleView extends View {
	
	private Paint paint = new Paint();
	public SampleView(Context context) {
		super(context);
		setBackgroundColor(Color.WHITE);
	}
	
	@Override
	public void onDraw(Canvas canvas){
		canvas.drawCircle(100, 100, 20, paint);
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event){
		Toast.makeText(getContext(), "Touch", Toast.LENGTH_SHORT).show();
		return true;
	}
}
