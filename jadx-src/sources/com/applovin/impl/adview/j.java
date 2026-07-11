package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import com.applovin.impl.adview.e;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Paint f48060e = new Paint(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Paint f48061f = new Paint(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f48062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Path f48063d;

    @Override // com.applovin.impl.adview.e
    public void a(int i2) {
        setViewScale(i2 / 30.0f);
        a();
    }

    @Override // com.applovin.impl.adview.e, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f63161a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.adview.e, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    protected float getStrokeWidth() {
        return this.f48036a * 2.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.TRANSPARENT_SKIP;
    }

    public j(Context context) {
        super(context);
        this.f48062c = new float[]{30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};
        f48060e.setARGB(80, 0, 0, 0);
        Paint paint = f48061f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    private void a() {
        int i2 = 0;
        while (true) {
            float[] fArr = this.f48062c;
            if (i2 < fArr.length) {
                fArr[i2] = fArr[i2] * 0.3f * this.f48036a;
                i2++;
            } else {
                Path path = new Path();
                this.f48063d = path;
                float[] fArr2 = this.f48062c;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f48063d;
                float[] fArr3 = this.f48062c;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f48063d;
                float[] fArr4 = this.f48062c;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f48063d;
                float[] fArr5 = this.f48062c;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.f48063d;
                float[] fArr6 = this.f48062c;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.f48063d;
                float[] fArr7 = this.f48062c;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
        }
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f48060e);
        Paint paint = f48061f;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.f48063d, paint);
    }
}
