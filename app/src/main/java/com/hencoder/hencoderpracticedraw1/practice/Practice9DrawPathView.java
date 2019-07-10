package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    private Paint mPaint;
    private Path  mPath;

    public Practice9DrawPathView(Context context) {
        super(context);
        init();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPath = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        练习内容：使用 canvas.drawPath() 方法画心形
        mPath.addArc(300, 300, 600, 600, 135, 225);
        mPath.lineTo(600, 800);
        mPath.addArc(600, 300, 900, 600, 180, 225);
        mPath.lineTo(600, 800);
//        canvas.drawPath(mPath, mPaint);
//        //        canvas.drawLine(300, 450, 600, 800, mPaint);
//        //        canvas.drawLine(900, 450, 600, 800, mPaint);

//        mPath.addArc(300, 200, 500, 400, 135, 225);
//                mPath.lineTo(500, 600);
//                mPath.addArc(500, 200, 700, 400, 180, 220);
//                mPath.lineTo(500, 600);

        //另一种形式
//        mPath.arcTo(500,200,700,400,180,225,false);
//        mPath.lineTo(500,560);

        canvas.drawPath(mPath, mPaint);
    }
}
