package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint mPaint;
    private Path  mPath;
    private Paint mPaint1;

    public Practice10HistogramView(Context context) {
        super(context);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPath = new Path();
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(3);
        mPaint1 = new Paint();
        mPaint1.setColor(Color.parseColor("#1BEE52"));
        mPath.moveTo(100, 100);
        mPath.lineTo(100, 800);
        mPath.lineTo(1000, 800);

        mPaint.setTextSize(50);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        canvas.drawPath(mPath, mPaint);

        canvas.drawRect(getMyRectf(125, 10), mPaint1);
        canvas.drawRect(getMyRectf(275, 50), mPaint1);
        canvas.drawRect(getMyRectf(425, 230), mPaint1);
        canvas.drawRect(getMyRectf(575, 300), mPaint1);
        canvas.drawRect(getMyRectf(725, 280), mPaint1);
        canvas.drawRect(getMyRectf(875, 200), mPaint1);

        canvas.drawText("测试",130,850,mPaint);
    }

    private RectF getMyRectf(int x, int h) {
        return new RectF(x, 800 - h, x + 100, 800);
    }

}
