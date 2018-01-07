package androiddeveloper.com.drawablesdemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
        /*ImageView button = (ImageView) findViewById(R.id.image);
        Bitmap largeIcon = BitmapFactory.decodeResource(getResources(), R.drawable.ic);

       // Bitmap bitmap = BitmapFactory.decodeStream(resource);
        button.setBackground(new MyRoundCornerDrawable(largeIcon));*/
    }

    private class MyView extends View {
        public MyView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int x=getWidth();
            int y=getHeight();
            int radius;
            radius=200;
            Paint paint=new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
            canvas.drawPaint(paint);
            paint.setColor(Color.RED);
            canvas.drawCircle(x/2,y/2,radius,paint);
            paint.setColor(Color.WHITE);
            canvas.drawCircle(x/2,y/2,radius-2,paint);
            paint.setColor(Color.RED);


            canvas.drawLine(x/2-200,y/2,x/2+200,y/2,paint);

            canvas.drawLine(x/2,y/2-200,x/2,y/2+200,paint);
            canvas.drawLine(x/2,y/2-200,x/2,y/2+200,paint);
            canvas.drawLine((x/2)-(100f*1.41f),y/2+(100f*1.41f),x/2+(100f*1.41f),y/2-(100f*1.41f),paint);
            canvas.drawLine((x/2)-(100f*1.41f),y/2-(100f*1.41f),x/2+(100f*1.41f),y/2+(100f*1.41f),paint);
            }
    }
}
