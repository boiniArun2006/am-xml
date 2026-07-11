package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
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
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class ImageFilterButton extends AppCompatImageButton {
    ViewOutlineProvider E2;
    private ImageFilterView.ImageMatrix J2;
    private float M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    LayerDrawable f35811N;
    private float P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f35812S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    Drawable[] f35813T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f35814U;
    private Drawable Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    RectF f35815e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Path f35816g;
    private Drawable jB;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f35817o;
    private float p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f35818r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f35819v;

    private void nr() {
        if (Float.isNaN(this.f35814U) && Float.isNaN(this.P5) && Float.isNaN(this.M7) && Float.isNaN(this.p5)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            t();
        }
    }

    private void setOverlay(boolean z2) {
        this.f35819v = z2;
    }

    private void t() {
        if (Float.isNaN(this.f35814U) && Float.isNaN(this.P5) && Float.isNaN(this.M7) && Float.isNaN(this.p5)) {
            return;
        }
        float f3 = Float.isNaN(this.f35814U) ? 0.0f : this.f35814U;
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

    public float getContrast() {
        return this.J2.J2;
    }

    public float getCrossfade() {
        return this.f35818r;
    }

    public float getImagePanX() {
        return this.f35814U;
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
        return this.f35812S;
    }

    public float getRoundPercent() {
        return this.f35817o;
    }

    public float getSaturation() {
        return this.J2.f35833O;
    }

    public float getWarmth() {
        return this.J2.Uo;
    }

    public void setBrightness(float f3) {
        ImageFilterView.ImageMatrix imageMatrix = this.J2;
        imageMatrix.nr = f3;
        imageMatrix.t(this);
    }

    public void setContrast(float f3) {
        ImageFilterView.ImageMatrix imageMatrix = this.J2;
        imageMatrix.J2 = f3;
        imageMatrix.t(this);
    }

    public void setCrossfade(float f3) {
        this.f35818r = f3;
        if (this.f35813T != null) {
            if (!this.f35819v) {
                this.f35811N.getDrawable(0).setAlpha((int) ((1.0f - this.f35818r) * 255.0f));
            }
            this.f35811N.getDrawable(1).setAlpha((int) (this.f35818r * 255.0f));
            super.setImageDrawable(this.f35811N);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.Xw == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.jB = drawableMutate;
        Drawable[] drawableArr = this.f35813T;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.Xw;
        LayerDrawable layerDrawable = new LayerDrawable(this.f35813T);
        this.f35811N = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f35818r);
    }

    public void setImagePanX(float f3) {
        this.f35814U = f3;
        nr();
    }

    public void setImagePanY(float f3) {
        this.P5 = f3;
        nr();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i2) {
        if (this.Xw == null) {
            super.setImageResource(i2);
            return;
        }
        Drawable drawableMutate = AppCompatResources.rl(getContext(), i2).mutate();
        this.jB = drawableMutate;
        Drawable[] drawableArr = this.f35813T;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.Xw;
        LayerDrawable layerDrawable = new LayerDrawable(this.f35813T);
        this.f35811N = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f35818r);
    }

    public void setImageRotate(float f3) {
        this.p5 = f3;
        nr();
    }

    public void setImageZoom(float f3) {
        this.M7 = f3;
        nr();
    }

    @RequiresApi
    public void setRoundPercent(float f3) {
        boolean z2 = this.f35817o != f3;
        this.f35817o = f3;
        if (f3 != 0.0f) {
            if (this.f35816g == null) {
                this.f35816g = new Path();
            }
            if (this.f35815e == null) {
                this.f35815e = new RectF();
            }
            if (this.E2 == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterButton.1
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), (Math.min(r3, r4) * ImageFilterButton.this.f35817o) / 2.0f);
                    }
                };
                this.E2 = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f35817o) / 2.0f;
            this.f35815e.set(0.0f, 0.0f, width, height);
            this.f35816g.reset();
            this.f35816g.addRoundRect(this.f35815e, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z2) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f3) {
        ImageFilterView.ImageMatrix imageMatrix = this.J2;
        imageMatrix.f35833O = f3;
        imageMatrix.t(this);
    }

    public void setWarmth(float f3) {
        ImageFilterView.ImageMatrix imageMatrix = this.J2;
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
        t();
    }

    public void setAltImageResource(int i2) {
        Drawable drawableMutate = AppCompatResources.rl(getContext(), i2).mutate();
        this.Xw = drawableMutate;
        Drawable[] drawableArr = this.f35813T;
        drawableArr[0] = this.jB;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f35813T);
        this.f35811N = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f35818r);
    }

    @RequiresApi
    public void setRound(float f3) {
        boolean z2;
        if (Float.isNaN(f3)) {
            this.f35812S = f3;
            float f4 = this.f35817o;
            this.f35817o = -1.0f;
            setRoundPercent(f4);
            return;
        }
        if (this.f35812S != f3) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f35812S = f3;
        if (f3 != 0.0f) {
            if (this.f35816g == null) {
                this.f35816g = new Path();
            }
            if (this.f35815e == null) {
                this.f35815e = new RectF();
            }
            if (this.E2 == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterButton.2
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f35812S);
                    }
                };
                this.E2 = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.f35815e.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f35816g.reset();
            Path path = this.f35816g;
            RectF rectF = this.f35815e;
            float f5 = this.f35812S;
            path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z2) {
            invalidateOutline();
        }
    }
}
