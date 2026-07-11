package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.FloatLayout;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class MotionLabel extends View implements FloatLayout {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private float f35849B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    float f35850C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private float f35851D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f35852E;
    RectF E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private boolean f35853FX;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private BitmapShader f35854GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Bitmap f35855I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private float f35856J;
    private int J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f35857M;
    private int M7;
    float Mx;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f35858N;
    private Matrix Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f35859O;
    private int P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f35860S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f35861T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f35862U;
    boolean Xw;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Matrix f35863a;
    private float dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f35864e;
    private Layout eF;
    Paint eTf;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ViewOutlineProvider f35865g;
    Paint ijL;
    private Rect jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f35866k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Rect f35867m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    TextPaint f35868n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f35869o;
    float ofS;
    private int p5;
    float pJg;
    private float piY;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f35870r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Path f35871t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f35872v;
    float xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f35873z;

    private void J2() {
        float f3 = Float.isNaN(this.pJg) ? 0.0f : this.pJg;
        float f4 = Float.isNaN(this.ofS) ? 0.0f : this.ofS;
        float f5 = Float.isNaN(this.f35850C) ? 1.0f : this.f35850C;
        float f6 = Float.isNaN(this.Mx) ? 0.0f : this.Mx;
        this.Nxk.reset();
        float width = this.f35855I.getWidth();
        float height = this.f35855I.getHeight();
        float f7 = Float.isNaN(this.dR0) ? this.f35856J : this.dR0;
        float f8 = Float.isNaN(this.f35866k) ? this.f35851D : this.f35866k;
        float f9 = f5 * (width * f8 < height * f7 ? f7 / width : f8 / height);
        this.Nxk.postScale(f9, f9);
        float f10 = width * f9;
        float f11 = f7 - f10;
        float f12 = f9 * height;
        float f13 = f8 - f12;
        if (!Float.isNaN(this.f35866k)) {
            f13 = this.f35866k / 2.0f;
        }
        if (!Float.isNaN(this.dR0)) {
            f11 = this.dR0 / 2.0f;
        }
        this.Nxk.postTranslate((((f3 * f11) + f7) - f10) * 0.5f, (((f4 * f13) + f8) - f12) * 0.5f);
        this.Nxk.postRotate(f6, f7 / 2.0f, f8 / 2.0f);
        this.f35854GR.setLocalMatrix(this.Nxk);
    }

    private float getHorizontalOffset() {
        float f3 = Float.isNaN(this.f35861T) ? 1.0f : this.f35864e / this.f35861T;
        TextPaint textPaint = this.f35868n;
        String str = this.f35872v;
        return (((((Float.isNaN(this.f35856J) ? getMeasuredWidth() : this.f35856J) - getPaddingLeft()) - getPaddingRight()) - (f3 * textPaint.measureText(str, 0, str.length()))) * (this.f35873z + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f3 = Float.isNaN(this.f35861T) ? 1.0f : this.f35864e / this.f35861T;
        Paint.FontMetrics fontMetrics = this.f35868n.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.f35851D) ? getMeasuredHeight() : this.f35851D) - getPaddingTop()) - getPaddingBottom();
        float f4 = fontMetrics.descent;
        float f5 = fontMetrics.ascent;
        return (((measuredHeight - ((f4 - f5) * f3)) * (1.0f - this.piY)) / 2.0f) - (f3 * f5);
    }

    private void nr(float f3, float f4, float f5, float f6) {
        if (this.Nxk == null) {
            return;
        }
        this.f35856J = f5 - f3;
        this.f35851D = f6 - f4;
        J2();
    }

    private void setUpTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.wTp, typedValue, true);
        TextPaint textPaint = this.f35868n;
        int i2 = typedValue.data;
        this.f35859O = i2;
        textPaint.setColor(i2);
    }

    void O(float f3) {
        if (this.f35870r || f3 != 1.0f) {
            this.f35871t.reset();
            String str = this.f35872v;
            int length = str.length();
            this.f35868n.getTextBounds(str, 0, length, this.jB);
            this.f35868n.getTextPath(str, 0, length, 0.0f, 0.0f, this.f35871t);
            if (f3 != 1.0f) {
                Log.v("MotionLabel", Debug.n() + " scale " + f3);
                Matrix matrix = new Matrix();
                matrix.postScale(f3, f3);
                this.f35871t.transform(matrix);
            }
            Rect rect = this.jB;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.Xw = false;
        }
    }

    public float getRound() {
        return this.f35860S;
    }

    public float getRoundPercent() {
        return this.f35869o;
    }

    public float getScaleFromTextSize() {
        return this.f35861T;
    }

    public float getTextBackgroundPanX() {
        return this.pJg;
    }

    public float getTextBackgroundPanY() {
        return this.ofS;
    }

    public float getTextBackgroundRotate() {
        return this.Mx;
    }

    public float getTextBackgroundZoom() {
        return this.f35850C;
    }

    public int getTextOutlineColor() {
        return this.J2;
    }

    public float getTextPanX() {
        return this.f35873z;
    }

    public float getTextPanY() {
        return this.piY;
    }

    public float getTextureHeight() {
        return this.f35866k;
    }

    public float getTextureWidth() {
        return this.dR0;
    }

    public Typeface getTypeface() {
        return this.f35868n.getTypeface();
    }

    @Override // androidx.constraintlayout.motion.widget.FloatLayout
    public void n(float f3, float f4, float f5, float f6) {
        int i2 = (int) (f3 + 0.5f);
        this.f35849B = f3 - i2;
        int i3 = (int) (f5 + 0.5f);
        int i5 = i3 - i2;
        int i7 = (int) (f6 + 0.5f);
        int i8 = (int) (0.5f + f4);
        int i9 = i7 - i8;
        float f7 = f5 - f3;
        this.f35856J = f7;
        float f8 = f6 - f4;
        this.f35851D = f8;
        nr(f3, f4, f5, f6);
        if (getMeasuredHeight() == i9 && getMeasuredWidth() == i5) {
            super.layout(i2, i8, i3, i7);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
            super.layout(i2, i8, i3, i7);
        }
        if (this.f35853FX) {
            if (this.f35867m == null) {
                this.eTf = new Paint();
                this.f35867m = new Rect();
                this.eTf.set(this.f35868n);
                this.xg = this.eTf.getTextSize();
            }
            this.f35856J = f7;
            this.f35851D = f8;
            Paint paint = this.eTf;
            String str = this.f35872v;
            paint.getTextBounds(str, 0, str.length(), this.f35867m);
            float fHeight = this.f35867m.height() * 1.3f;
            float f9 = (f7 - this.P5) - this.f35862U;
            float f10 = (f8 - this.p5) - this.M7;
            float fWidth = this.f35867m.width();
            if (fWidth * f10 > fHeight * f9) {
                this.f35868n.setTextSize((this.xg * f9) / fWidth);
            } else {
                this.f35868n.setTextSize((this.xg * f10) / fHeight);
            }
            if (this.f35870r || !Float.isNaN(this.f35861T)) {
                O(Float.isNaN(this.f35861T) ? 1.0f : this.f35864e / this.f35861T);
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f3 = Float.isNaN(this.f35861T) ? 1.0f : this.f35864e / this.f35861T;
        super.onDraw(canvas);
        if (!this.f35870r && f3 == 1.0f) {
            canvas.drawText(this.f35872v, this.f35849B + this.f35862U + getHorizontalOffset(), this.M7 + getVerticalOffset(), this.f35868n);
            return;
        }
        if (this.Xw) {
            O(f3);
        }
        if (this.f35863a == null) {
            this.f35863a = new Matrix();
        }
        if (!this.f35870r) {
            float horizontalOffset = this.f35862U + getHorizontalOffset();
            float verticalOffset = this.M7 + getVerticalOffset();
            this.f35863a.reset();
            this.f35863a.preTranslate(horizontalOffset, verticalOffset);
            this.f35871t.transform(this.f35863a);
            this.f35868n.setColor(this.f35859O);
            this.f35868n.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f35868n.setStrokeWidth(this.f35858N);
            canvas.drawPath(this.f35871t, this.f35868n);
            this.f35863a.reset();
            this.f35863a.preTranslate(-horizontalOffset, -verticalOffset);
            this.f35871t.transform(this.f35863a);
            return;
        }
        this.ijL.set(this.f35868n);
        this.f35863a.reset();
        float horizontalOffset2 = this.f35862U + getHorizontalOffset();
        float verticalOffset2 = this.M7 + getVerticalOffset();
        this.f35863a.postTranslate(horizontalOffset2, verticalOffset2);
        this.f35863a.preScale(f3, f3);
        this.f35871t.transform(this.f35863a);
        if (this.f35854GR != null) {
            this.f35868n.setFilterBitmap(true);
            this.f35868n.setShader(this.f35854GR);
        } else {
            this.f35868n.setColor(this.f35859O);
        }
        this.f35868n.setStyle(Paint.Style.FILL);
        this.f35868n.setStrokeWidth(this.f35858N);
        canvas.drawPath(this.f35871t, this.f35868n);
        if (this.f35854GR != null) {
            this.f35868n.setShader(null);
        }
        this.f35868n.setColor(this.J2);
        this.f35868n.setStyle(Paint.Style.STROKE);
        this.f35868n.setStrokeWidth(this.f35858N);
        canvas.drawPath(this.f35871t, this.f35868n);
        this.f35863a.reset();
        this.f35863a.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f35871t.transform(this.f35863a);
        this.f35868n.set(this.ijL);
    }

    @RequiresApi
    public void setRoundPercent(float f3) {
        boolean z2 = this.f35869o != f3;
        this.f35869o = f3;
        if (f3 != 0.0f) {
            if (this.f35871t == null) {
                this.f35871t = new Path();
            }
            if (this.E2 == null) {
                this.E2 = new RectF();
            }
            if (this.f35865g == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionLabel.1
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), (Math.min(r3, r4) * MotionLabel.this.f35869o) / 2.0f);
                    }
                };
                this.f35865g = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f35869o) / 2.0f;
            this.E2.set(0.0f, 0.0f, width, height);
            this.f35871t.reset();
            this.f35871t.addRoundRect(this.E2, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z2) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f3) {
        this.f35861T = f3;
    }

    public void setTextBackgroundPanX(float f3) {
        this.pJg = f3;
        J2();
        invalidate();
    }

    public void setTextBackgroundPanY(float f3) {
        this.ofS = f3;
        J2();
        invalidate();
    }

    public void setTextBackgroundRotate(float f3) {
        this.Mx = f3;
        J2();
        invalidate();
    }

    public void setTextBackgroundZoom(float f3) {
        this.f35850C = f3;
        J2();
        invalidate();
    }

    public void setTextFillColor(int i2) {
        this.f35859O = i2;
        invalidate();
    }

    public void setTextOutlineColor(int i2) {
        this.J2 = i2;
        this.f35870r = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f3) {
        this.f35858N = f3;
        this.f35870r = true;
        if (Float.isNaN(f3)) {
            this.f35858N = 1.0f;
            this.f35870r = false;
        }
        invalidate();
    }

    public void setTextPanX(float f3) {
        this.f35873z = f3;
        invalidate();
    }

    public void setTextPanY(float f3) {
        this.piY = f3;
        invalidate();
    }

    public void setTextSize(float f3) {
        this.f35864e = f3;
        TextPaint textPaint = this.f35868n;
        if (!Float.isNaN(this.f35861T)) {
            f3 = this.f35861T;
        }
        textPaint.setTextSize(f3);
        O(Float.isNaN(this.f35861T) ? 1.0f : this.f35864e / this.f35861T);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f3) {
        this.f35866k = f3;
        J2();
        invalidate();
    }

    public void setTextureWidth(float f3) {
        this.dR0 = f3;
        J2();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (Objects.equals(this.f35868n.getTypeface(), typeface)) {
            return;
        }
        this.f35868n.setTypeface(typeface);
        if (this.eF != null) {
            this.eF = null;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void layout(int i2, int i3, int i5, int i7) {
        float f3;
        super.layout(i2, i3, i5, i7);
        boolean zIsNaN = Float.isNaN(this.f35861T);
        if (zIsNaN) {
            f3 = 1.0f;
        } else {
            f3 = this.f35864e / this.f35861T;
        }
        this.f35856J = i5 - i2;
        this.f35851D = i7 - i3;
        if (this.f35853FX) {
            if (this.f35867m == null) {
                this.eTf = new Paint();
                this.f35867m = new Rect();
                this.eTf.set(this.f35868n);
                this.xg = this.eTf.getTextSize();
            }
            Paint paint = this.eTf;
            String str = this.f35872v;
            paint.getTextBounds(str, 0, str.length(), this.f35867m);
            int iWidth = this.f35867m.width();
            int iHeight = (int) (this.f35867m.height() * 1.3f);
            float f4 = (this.f35856J - this.P5) - this.f35862U;
            float f5 = (this.f35851D - this.p5) - this.M7;
            if (zIsNaN) {
                float f6 = iWidth;
                float f7 = iHeight;
                if (f6 * f5 > f7 * f4) {
                    this.f35868n.setTextSize((this.xg * f4) / f6);
                } else {
                    this.f35868n.setTextSize((this.xg * f5) / f7);
                }
            } else {
                float f8 = iWidth;
                float f9 = iHeight;
                if (f8 * f5 > f9 * f4) {
                    f3 = f4 / f8;
                } else {
                    f3 = f5 / f9;
                }
            }
        }
        if (!this.f35870r && zIsNaN) {
            return;
        }
        nr(i2, i3, i5, i7);
        O(f3);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        this.f35853FX = false;
        this.f35862U = getPaddingLeft();
        this.P5 = getPaddingRight();
        this.M7 = getPaddingTop();
        this.p5 = getPaddingBottom();
        if (mode == 1073741824 && mode2 == 1073741824) {
            if (this.f35857M != 0) {
                this.f35853FX = true;
            }
        } else {
            TextPaint textPaint = this.f35868n;
            String str = this.f35872v;
            textPaint.getTextBounds(str, 0, str.length(), this.jB);
            if (mode != 1073741824) {
                size = (int) (this.jB.width() + 0.99999f);
            }
            size += this.f35862U + this.P5;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f35868n.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.M7 + this.p5 + fontMetricsInt;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setGravity(int i2) {
        if ((i2 & 8388615) == 0) {
            i2 |= 8388611;
        }
        if ((i2 & 112) == 0) {
            i2 |= 48;
        }
        if (i2 != this.f35852E) {
            invalidate();
        }
        this.f35852E = i2;
        int i3 = i2 & 112;
        if (i3 != 48) {
            if (i3 != 80) {
                this.piY = 0.0f;
            } else {
                this.piY = 1.0f;
            }
        } else {
            this.piY = -1.0f;
        }
        int i5 = i2 & 8388615;
        if (i5 != 3) {
            if (i5 != 5) {
                if (i5 != 8388611) {
                    if (i5 != 8388613) {
                        this.f35873z = 0.0f;
                        return;
                    }
                }
            }
            this.f35873z = 1.0f;
            return;
        }
        this.f35873z = -1.0f;
    }

    @RequiresApi
    public void setRound(float f3) {
        boolean z2;
        if (Float.isNaN(f3)) {
            this.f35860S = f3;
            float f4 = this.f35869o;
            this.f35869o = -1.0f;
            setRoundPercent(f4);
            return;
        }
        if (this.f35860S != f3) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f35860S = f3;
        if (f3 != 0.0f) {
            if (this.f35871t == null) {
                this.f35871t = new Path();
            }
            if (this.E2 == null) {
                this.E2 = new RectF();
            }
            if (this.f35865g == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionLabel.2
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f35860S);
                    }
                };
                this.f35865g = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.E2.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f35871t.reset();
            Path path = this.f35871t;
            RectF rectF = this.E2;
            float f5 = this.f35860S;
            path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z2) {
            invalidateOutline();
        }
    }

    public void setText(CharSequence charSequence) {
        this.f35872v = charSequence.toString();
        invalidate();
    }
}
