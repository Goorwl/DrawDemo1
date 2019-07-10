package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint mPaint;
    private RectF mRect;
    private RectF mRect1;

    public Practice11PieChartView(Context context) {
        super(context);
        init();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mRect = new RectF(200, 200, 700, 700);
        mRect1 = new RectF(180, 180, 680, 680);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        canvas.drawArc(mRect, 0, 15, true, mPaint);
        mPaint.setColor(Color.parseColor("#090909"));
        canvas.drawLine(700, 455, 740, 455, mPaint);
        mPaint.setTextSize(20);
        canvas.drawText("Marshmallow", 745, 460, mPaint);
        canvas.drawArc(mRect, 15, 10, true, mPaint);
        mPaint.setColor(Color.parseColor("#E23939"));
        canvas.drawArc(mRect, 25, 15, true, mPaint);
        mPaint.setColor(Color.parseColor("#366ACB"));
        canvas.drawArc(mRect, 40, 45, true, mPaint);
        mPaint.setColor(Color.parseColor("#8036CB"));
        canvas.drawArc(mRect, 85, 95, true, mPaint);
        mPaint.setColor(Color.parseColor("#CB3675"));
        canvas.drawArc(mRect, 320, 40, true, mPaint);

        mPaint.setColor(Color.parseColor("#A6AFF1"));
        canvas.drawArc(mRect1, 180, 140, true, mPaint);

    }
}
