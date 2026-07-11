package com.fyber.inneractive.sdk.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.util.o;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class IAcloseButton extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f56944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f56945b;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f63176p, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public IAcloseButton(Context context, int i2) {
        super(context);
        int iB = o.b(10);
        int i3 = ((i2 - (iB * 2)) / 4) + iB;
        Point point = new Point(i3, i3);
        int i5 = i2 - i3;
        Point point2 = new Point(i3, i5);
        Point point3 = new Point(i5, i5);
        Point point4 = new Point(i5, i3);
        Path path = new Path();
        this.f56945b = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(point.x, point.y);
        path.lineTo(point3.x, point3.y);
        path.moveTo(point2.x, point2.y);
        path.lineTo(point4.x, point4.y);
        path.close();
        Paint paint = new Paint(1);
        this.f56944a = paint;
        paint.setStrokeWidth(o.b(2));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-1436657061);
        gradientDrawable.setStroke(o.b(2), -1);
        o.a(this, gradientDrawable);
        setPadding(iB, iB, iB, iB);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f56945b, this.f56944a);
    }
}
