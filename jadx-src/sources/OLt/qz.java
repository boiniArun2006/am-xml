package OLt;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class qz extends Drawable implements Dsr, Z {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    Matrix f7376E;
    RectF Xw;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Ew f7387a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float[] f7388e;
    Matrix eF;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Drawable f7390n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f7393t = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected boolean f7381O = false;
    protected float J2 = 0.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final Path f7392r = new Path();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected boolean f7391o = true;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    protected int f7386Z = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected final Path f7382S = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f7389g = new float[8];
    final float[] E2 = new float[8];

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    final RectF f7385X = new RectF();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    final RectF f7383T = new RectF();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final RectF f7380N = new RectF();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final RectF f7394v = new RectF();
    final Matrix jB = new Matrix();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    final Matrix f7384U = new Matrix();
    final Matrix P5 = new Matrix();
    final Matrix M7 = new Matrix();
    final Matrix p5 = new Matrix();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    final Matrix f7379M = new Matrix();

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private float f7377FX = 0.0f;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f7374B = false;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f7378J = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f7375D = true;

    public void KN(boolean z2) {
    }

    @Override // OLt.Dsr
    public void az(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f7389g, 0.0f);
            this.f7381O = false;
        } else {
            Hh.C.t(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f7389g, 0, 8);
            this.f7381O = false;
            for (int i2 = 0; i2 < 8; i2++) {
                this.f7381O |= fArr[i2] > 0.0f;
            }
        }
        this.f7375D = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i2, PorterDuff.Mode mode) {
        this.f7390n.setColorFilter(i2, mode);
    }

    private static boolean O(Matrix matrix, Matrix matrix2) {
        if (matrix == null && matrix2 == null) {
            return true;
        }
        if (matrix == null || matrix2 == null) {
            return false;
        }
        return matrix.equals(matrix2);
    }

    private static Matrix n(Matrix matrix) {
        if (matrix == null) {
            return null;
        }
        return new Matrix(matrix);
    }

    @Override // OLt.Dsr
    public void J2(float f3) {
        if (this.f7377FX != f3) {
            this.f7377FX = f3;
            this.f7375D = true;
            invalidateSelf();
        }
    }

    @Override // OLt.Z
    public void Uo(Ew ew) {
        this.f7387a = ew;
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f7390n.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7390n.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f7390n.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f7390n.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f7390n.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f7390n.getOpacity();
    }

    @Override // OLt.Dsr
    public void gh(boolean z2) {
        if (this.f7374B != z2) {
            this.f7374B = z2;
            this.f7375D = true;
            invalidateSelf();
        }
    }

    @Override // OLt.Dsr
    public void mUb(boolean z2) {
        if (this.f7378J != z2) {
            this.f7378J = z2;
            invalidateSelf();
        }
    }

    public boolean nr() {
        return this.f7378J;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f7390n.setBounds(rect);
    }

    protected void qie() {
        float[] fArr;
        if (this.f7375D) {
            this.f7382S.reset();
            RectF rectF = this.f7385X;
            float f3 = this.J2;
            rectF.inset(f3 / 2.0f, f3 / 2.0f);
            if (this.f7393t) {
                this.f7382S.addCircle(this.f7385X.centerX(), this.f7385X.centerY(), Math.min(this.f7385X.width(), this.f7385X.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i2 = 0;
                while (true) {
                    fArr = this.E2;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    fArr[i2] = (this.f7389g[i2] + this.f7377FX) - (this.J2 / 2.0f);
                    i2++;
                }
                this.f7382S.addRoundRect(this.f7385X, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f7385X;
            float f4 = this.J2;
            rectF2.inset((-f4) / 2.0f, (-f4) / 2.0f);
            this.f7392r.reset();
            float f5 = this.f7377FX + (this.f7374B ? this.J2 : 0.0f);
            this.f7385X.inset(f5, f5);
            if (this.f7393t) {
                this.f7392r.addCircle(this.f7385X.centerX(), this.f7385X.centerY(), Math.min(this.f7385X.width(), this.f7385X.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f7374B) {
                if (this.f7388e == null) {
                    this.f7388e = new float[8];
                }
                for (int i3 = 0; i3 < this.E2.length; i3++) {
                    this.f7388e[i3] = this.f7389g[i3] - this.J2;
                }
                this.f7392r.addRoundRect(this.f7385X, this.f7388e, Path.Direction.CW);
            } else {
                this.f7392r.addRoundRect(this.f7385X, this.f7389g, Path.Direction.CW);
            }
            float f6 = -f5;
            this.f7385X.inset(f6, f6);
            this.f7392r.setFillType(Path.FillType.WINDING);
            this.f7375D = false;
        }
    }

    @Override // OLt.Dsr
    public void rl(int i2, float f3) {
        if (this.f7386Z == i2 && this.J2 == f3) {
            return;
        }
        this.f7386Z = i2;
        this.J2 = f3;
        this.f7375D = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f7390n.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7390n.setColorFilter(colorFilter);
    }

    @Override // OLt.Dsr
    public void t(boolean z2) {
        this.f7393t = z2;
        this.f7375D = true;
        invalidateSelf();
    }

    protected void ty() {
        Matrix matrix;
        Matrix matrix2;
        Ew ew = this.f7387a;
        if (ew != null) {
            ew.nr(this.P5);
            this.f7387a.qie(this.f7385X);
        } else {
            this.P5.reset();
            this.f7385X.set(getBounds());
        }
        this.f7380N.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.f7394v.set(this.f7390n.getBounds());
        Matrix matrix3 = this.jB;
        RectF rectF = this.f7380N;
        RectF rectF2 = this.f7394v;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix3.setRectToRect(rectF, rectF2, scaleToFit);
        if (this.f7374B) {
            RectF rectF3 = this.Xw;
            if (rectF3 == null) {
                this.Xw = new RectF(this.f7385X);
            } else {
                rectF3.set(this.f7385X);
            }
            RectF rectF4 = this.Xw;
            float f3 = this.J2;
            rectF4.inset(f3, f3);
            if (this.eF == null) {
                this.eF = new Matrix();
            }
            this.eF.setRectToRect(this.f7385X, this.Xw, scaleToFit);
        } else {
            Matrix matrix4 = this.eF;
            if (matrix4 != null) {
                matrix4.reset();
            }
        }
        if (!this.P5.equals(this.M7) || !this.jB.equals(this.f7384U) || ((matrix2 = this.eF) != null && !O(matrix2, this.f7376E))) {
            this.f7391o = true;
            this.P5.invert(this.p5);
            this.f7379M.set(this.P5);
            if (this.f7374B && (matrix = this.eF) != null) {
                this.f7379M.postConcat(matrix);
            }
            this.f7379M.preConcat(this.jB);
            this.M7.set(this.P5);
            this.f7384U.set(this.jB);
            if (this.f7374B) {
                Matrix matrix5 = this.f7376E;
                if (matrix5 == null) {
                    this.f7376E = n(this.eF);
                } else {
                    matrix5.set(this.eF);
                }
            } else {
                Matrix matrix6 = this.f7376E;
                if (matrix6 != null) {
                    matrix6.reset();
                }
            }
        }
        if (this.f7385X.equals(this.f7383T)) {
            return;
        }
        this.f7375D = true;
        this.f7383T.set(this.f7385X);
    }

    boolean xMQ() {
        return this.f7393t || this.f7381O || this.J2 > 0.0f;
    }

    qz(Drawable drawable) {
        this.f7390n = drawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (T5.n.nr()) {
            T5.n.n("RoundedDrawable#draw");
        }
        this.f7390n.draw(canvas);
        if (T5.n.nr()) {
            T5.n.rl();
        }
    }
}
