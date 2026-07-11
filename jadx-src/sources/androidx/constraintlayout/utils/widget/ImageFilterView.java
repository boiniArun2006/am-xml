package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class ImageFilterView extends AppCompatImageView {
    private float E2;
    private ImageMatrix J2;
    float M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    ViewOutlineProvider f35822N;
    float P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Drawable f35823S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Path f35824T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    float f35825U;
    Drawable[] Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f35826e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f35827g;
    LayerDrawable jB;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f35828o;
    float p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f35829r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    RectF f35830v;

    static class ImageMatrix {
        float J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        float f35833O;
        float Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float[] f35834n;
        float nr;
        ColorMatrix rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        ColorMatrix f35835t;

        private void nr(float f3) {
            float fLog;
            float fPow;
            if (f3 <= 0.0f) {
                f3 = 0.01f;
            }
            float f4 = (5000.0f / f3) / 100.0f;
            if (f4 > 66.0f) {
                double d2 = f4 - 60.0f;
                fPow = ((float) Math.pow(d2, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d2, 0.07551485300064087d)) * 288.12216f;
            } else {
                fLog = (((float) Math.log(f4)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            float fLog2 = f4 < 66.0f ? f4 > 19.0f ? (((float) Math.log(f4 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
            float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
            float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
            float[] fArr = this.f35834n;
            fArr[0] = fMin / fMin4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fMin2 / fMin5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = fMin6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void n(float f3) {
            float[] fArr = this.f35834n;
            fArr[0] = f3;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f3;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f3;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void rl(float f3) {
            float f4 = 1.0f - f3;
            float f5 = 0.2999f * f4;
            float f6 = 0.587f * f4;
            float f7 = f4 * 0.114f;
            float[] fArr = this.f35834n;
            fArr[0] = f5 + f3;
            fArr[1] = f6;
            fArr[2] = f7;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f5;
            fArr[6] = f6 + f3;
            fArr[7] = f7;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f5;
            fArr[11] = f6;
            fArr[12] = f7 + f3;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        void t(ImageView imageView) {
            boolean z2;
            this.rl.reset();
            float f3 = this.f35833O;
            boolean z3 = true;
            if (f3 != 1.0f) {
                rl(f3);
                this.rl.set(this.f35834n);
                z2 = true;
            } else {
                z2 = false;
            }
            float f4 = this.J2;
            if (f4 != 1.0f) {
                this.f35835t.setScale(f4, f4, f4, 1.0f);
                this.rl.postConcat(this.f35835t);
                z2 = true;
            }
            float f5 = this.Uo;
            if (f5 != 1.0f) {
                nr(f5);
                this.f35835t.set(this.f35834n);
                this.rl.postConcat(this.f35835t);
                z2 = true;
            }
            float f6 = this.nr;
            if (f6 != 1.0f) {
                n(f6);
                this.f35835t.set(this.f35834n);
                this.rl.postConcat(this.f35835t);
            } else {
                z3 = z2;
            }
            if (z3) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.rl));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    private void J2() {
        if (Float.isNaN(this.f35825U) && Float.isNaN(this.P5) && Float.isNaN(this.M7) && Float.isNaN(this.p5)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            O();
        }
    }

    private void O() {
        if (Float.isNaN(this.f35825U) && Float.isNaN(this.P5) && Float.isNaN(this.M7) && Float.isNaN(this.p5)) {
            return;
        }
        float f3 = Float.isNaN(this.f35825U) ? 0.0f : this.f35825U;
        float f4 = Float.isNaN(this.P5) ? 0.0f : this.P5;
        float f5 = Float.isNaN(this.M7) ? 1.0f : this.M7;
        float f6 = Float.isNaN(this.p5) ? 0.0f : this.p5;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f7 = f5 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f7, f7);
        float f8 = intrinsicWidth * f7;
        float f9 = f7 * intrinsicHeight;
        matrix.postTranslate((((f3 * (width - f8)) + width) - f8) * 0.5f, (((f4 * (height - f9)) + height) - f9) * 0.5f);
        matrix.postRotate(f6, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void setOverlay(boolean z2) {
        this.f35829r = z2;
    }

    public float getBrightness() {
        return this.J2.nr;
    }

    public float getContrast() {
        return this.J2.J2;
    }

    public float getCrossfade() {
        return this.f35827g;
    }

    public float getImagePanX() {
        return this.f35825U;
    }

    public float getImagePanY() {
        return this.P5;
    }

    public float getImageRotate() {
        return this.p5;
    }

    public float getImageZoom() {
        return this.M7;
    }

    public float getRound() {
        return this.f35826e;
    }

    public float getRoundPercent() {
        return this.E2;
    }

    public float getSaturation() {
        return this.J2.f35833O;
    }

    public float getWarmth() {
        return this.J2.Uo;
    }

    public void setBrightness(float f3) {
        ImageMatrix imageMatrix = this.J2;
        imageMatrix.nr = f3;
        imageMatrix.t(this);
    }

    public void setContrast(float f3) {
        ImageMatrix imageMatrix = this.J2;
        imageMatrix.J2 = f3;
        imageMatrix.t(this);
    }

    public void setCrossfade(float f3) {
        this.f35827g = f3;
        if (this.Xw != null) {
            if (!this.f35829r) {
                this.jB.getDrawable(0).setAlpha((int) ((1.0f - this.f35827g) * 255.0f));
            }
            this.jB.getDrawable(1).setAlpha((int) (this.f35827g * 255.0f));
            super.setImageDrawable(this.jB);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f35828o == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f35823S = drawableMutate;
        Drawable[] drawableArr = this.Xw;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f35828o;
        LayerDrawable layerDrawable = new LayerDrawable(this.Xw);
        this.jB = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f35827g);
    }

    public void setImagePanX(float f3) {
        this.f35825U = f3;
        J2();
    }

    public void setImagePanY(float f3) {
        this.P5 = f3;
        J2();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i2) {
        if (this.f35828o == null) {
            super.setImageResource(i2);
            return;
        }
        Drawable drawableMutate = AppCompatResources.rl(getContext(), i2).mutate();
        this.f35823S = drawableMutate;
        Drawable[] drawableArr = this.Xw;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f35828o;
        LayerDrawable layerDrawable = new LayerDrawable(this.Xw);
        this.jB = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f35827g);
    }

    public void setImageRotate(float f3) {
        this.p5 = f3;
        J2();
    }

    public void setImageZoom(float f3) {
        this.M7 = f3;
        J2();
    }

    @RequiresApi
    public void setRoundPercent(float f3) {
        boolean z2 = this.E2 != f3;
        this.E2 = f3;
        if (f3 != 0.0f) {
            if (this.f35824T == null) {
                this.f35824T = new Path();
            }
            if (this.f35830v == null) {
                this.f35830v = new RectF();
            }
            if (this.f35822N == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterView.1
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), (Math.min(r3, r4) * ImageFilterView.this.E2) / 2.0f);
                    }
                };
                this.f35822N = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.E2) / 2.0f;
            this.f35830v.set(0.0f, 0.0f, width, height);
            this.f35824T.reset();
            this.f35824T.addRoundRect(this.f35830v, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z2) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f3) {
        ImageMatrix imageMatrix = this.J2;
        imageMatrix.f35833O = f3;
        imageMatrix.t(this);
    }

    public void setWarmth(float f3) {
        ImageMatrix imageMatrix = this.J2;
        imageMatrix.Uo = f3;
        imageMatrix.t(this);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public void layout(int i2, int i3, int i5, int i7) {
        super.layout(i2, i3, i5, i7);
        O();
    }

    public void setAltImageDrawable(Drawable drawable) {
        Drawable drawableMutate = drawable.mutate();
        this.f35828o = drawableMutate;
        Drawable[] drawableArr = this.Xw;
        drawableArr[0] = this.f35823S;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.Xw);
        this.jB = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f35827g);
    }

    public void setAltImageResource(int i2) {
        Drawable drawableRl = AppCompatResources.rl(getContext(), i2);
        this.f35828o = drawableRl;
        setAltImageDrawable(drawableRl);
    }

    @RequiresApi
    public void setRound(float f3) {
        boolean z2;
        if (Float.isNaN(f3)) {
            this.f35826e = f3;
            float f4 = this.E2;
            this.E2 = -1.0f;
            setRoundPercent(f4);
            return;
        }
        if (this.f35826e != f3) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f35826e = f3;
        if (f3 != 0.0f) {
            if (this.f35824T == null) {
                this.f35824T = new Path();
            }
            if (this.f35830v == null) {
                this.f35830v = new RectF();
            }
            if (this.f35822N == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterView.2
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f35826e);
                    }
                };
                this.f35822N = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.f35830v.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f35824T.reset();
            Path path = this.f35824T;
            RectF rectF = this.f35830v;
            float f5 = this.f35826e;
            path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z2) {
            invalidateOutline();
        }
    }
}
