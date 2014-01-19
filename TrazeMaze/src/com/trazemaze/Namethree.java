package com.trazemaze;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class Namethree extends View {Imagepagethree v;

private Paint paint = new Paint();
  private Path path = new Path();
  int startX;
  int startY;
  int endX;
  int endY;
  int ctr=0;
 
  public Namethree(Context context, AttributeSet attrs) {
    super(context, attrs);

    paint.setAntiAlias(true);
    paint.setStrokeWidth(6f);
    paint.setColor(Color.WHITE);
    paint.setStyle(Paint.Style.STROKE);
    paint.setStrokeJoin(Paint.Join.ROUND);
    
  }

  @Override
protected
   void onDraw(Canvas canvas) {
    canvas.drawPath(path, paint);
  }

  @Override
  public boolean onTouchEvent(MotionEvent event) {
    int eventX = (int) event.getX();
    int eventY = (int) event.getY();
    Log.v("XY","X = "+eventX+" Y= "+eventY);

    switch (event.getAction()) {
    case MotionEvent.ACTION_DOWN:
      path.moveTo(eventX, eventY);
      startX=(int) eventX;
      startY=(int) eventY;
      return true;
      
    case MotionEvent.ACTION_MOVE: 
     if ((eventX<200|| eventX>500) && (eventY>160 || eventY<450) )
      {
    		 v.vibrate();
//    		 path.moveTo(eventX, eventY);
    	 
      }
      else
      {
    	  ctr++;
    	  path.lineTo(eventX, eventY);
      }
      path.lineTo(eventX, eventY);
      
      break;
      
    case MotionEvent.ACTION_UP:
     
      break;
    default:
      return false;
    }
 // Schedules a repaint.
    invalidate();
    return true;
  }

public void reset()
  {
	  path.reset();
  }

public void setInstance(Context v)
{
	this.v = (Imagepagethree)v;
}


}
