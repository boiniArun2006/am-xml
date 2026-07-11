package com.applovin.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class i0 extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f48687w = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f48688x = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f48689y = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f48690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f48691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Paint f48692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Paint f48693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f48694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f48695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f48696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f48697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f48698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f48699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f48700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f48701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f48702m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f48703n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f48704o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f48705p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f48706q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f48707r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f48708s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f48709t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final float f48710u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f48711v;

    public i0(Context context) {
        this(context, null);
    }

    protected void a() {
        this.f48700k = f48687w;
        this.f48696g = f48688x;
        this.f48695f = this.f48709t;
        setMax(100);
        setProgress(0);
        this.f48701l = this.f48708s;
        this.f48702m = 0;
        this.f48705p = this.f48710u;
        this.f48697h = f48689y;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f63161a, this, me);
        return super.dispatchTouchEvent(me);
    }

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(Resources resources, float f3) {
            return (f3 * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(Resources resources, float f3) {
            return f3 * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected void b() {
        TextPaint textPaint = new TextPaint();
        this.f48692c = textPaint;
        textPaint.setColor(this.f48696g);
        this.f48692c.setTextSize(this.f48695f);
        this.f48692c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f48693d = textPaint2;
        textPaint2.setColor(this.f48697h);
        this.f48693d.setTextSize(this.f48705p);
        this.f48693d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f48690a = paint;
        paint.setColor(this.f48700k);
        this.f48690a.setStyle(Paint.Style.STROKE);
        this.f48690a.setAntiAlias(true);
        this.f48690a.setStrokeWidth(this.f48701l);
        Paint paint2 = new Paint();
        this.f48691b = paint2;
        paint2.setColor(this.f48702m);
        this.f48691b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.f48700k;
    }

    public float getFinishedStrokeWidth() {
        return this.f48701l;
    }

    public int getInnerBackgroundColor() {
        return this.f48702m;
    }

    public String getInnerBottomText() {
        return this.f48706q;
    }

    public int getInnerBottomTextColor() {
        return this.f48697h;
    }

    public float getInnerBottomTextSize() {
        return this.f48705p;
    }

    public int getMax() {
        return this.f48699j;
    }

    public String getPrefixText() {
        return this.f48703n;
    }

    public int getProgress() {
        return this.f48698i;
    }

    public String getSuffixText() {
        return this.f48704o;
    }

    public int getTextColor() {
        return this.f48696g;
    }

    public float getTextSize() {
        return this.f48695f;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f48696g = bundle.getInt("text_color");
        this.f48695f = bundle.getFloat("text_size");
        this.f48705p = bundle.getFloat("inner_bottom_text_size");
        this.f48706q = bundle.getString("inner_bottom_text");
        this.f48697h = bundle.getInt("inner_bottom_text_color");
        this.f48700k = bundle.getInt("finished_stroke_color");
        this.f48701l = bundle.getFloat("finished_stroke_width");
        this.f48702m = bundle.getInt("inner_background_color");
        b();
        setMax(bundle.getInt("max"));
        setProgress(bundle.getInt("progress"));
        this.f48703n = bundle.getString("prefix");
        this.f48704o = bundle.getString("suffix");
        super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt("max", getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i2) {
        this.f48700k = i2;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f3) {
        this.f48701l = f3;
        invalidate();
    }

    public void setInnerBackgroundColor(int i2) {
        this.f48702m = i2;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f48706q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i2) {
        this.f48697h = i2;
        invalidate();
    }

    public void setInnerBottomTextSize(float f3) {
        this.f48705p = f3;
        invalidate();
    }

    public void setMax(int i2) {
        if (i2 > 0) {
            this.f48699j = i2;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f48703n = str;
        invalidate();
    }

    public void setProgress(int i2) {
        this.f48698i = i2;
        if (i2 > getMax()) {
            this.f48698i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f48704o = str;
        invalidate();
    }

    public void setTextColor(int i2) {
        this.f48696g = i2;
        invalidate();
    }

    public void setTextSize(float f3) {
        this.f48695f = f3;
        invalidate();
    }

    public i0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f48694e = new RectF();
        this.f48698i = 0;
        this.f48703n = "";
        this.f48704o = "";
        this.f48706q = "";
        this.f48709t = a.d(getResources(), 14.0f);
        this.f48711v = (int) a.c(getResources(), 100.0f);
        this.f48708s = a.c(getResources(), 4.0f);
        this.f48710u = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private float getProgressAngle() {
        return (getProgress() / this.f48699j) * 360.0f;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f3 = this.f48701l;
        this.f48694e.set(f3, f3, getWidth() - f3, getHeight() - f3);
        float width = getWidth();
        float f4 = this.f48701l;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f4) + f4) / 2.0f, this.f48691b);
        canvas.drawArc(this.f48694e, 270.0f, -getProgressAngle(), false, this.f48690a);
        String str = this.f48703n + this.f48698i + this.f48704o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f48692c.measureText(str)) / 2.0f, (getWidth() - (this.f48692c.descent() + this.f48692c.ascent())) / 2.0f, this.f48692c);
        }
        if (!TextUtils.isEmpty(getInnerBottomText())) {
            this.f48693d.setTextSize(this.f48705p);
            canvas.drawText(getInnerBottomText(), (getWidth() - this.f48693d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f48707r) - ((this.f48692c.descent() + this.f48692c.ascent()) / 2.0f), this.f48693d);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(a(i2), a(i3));
        this.f48707r = getHeight() - ((getHeight() * 3) / 4);
    }

    private int a(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            return size;
        }
        int i3 = this.f48711v;
        return mode == Integer.MIN_VALUE ? Math.min(i3, size) : i3;
    }
}
