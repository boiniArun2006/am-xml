package OLt;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class o extends CN3 implements Dsr {
    final float[] E2;
    private final Path M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f7359N;
    private final Path P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Matrix f7360S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f7361T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f7362U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f7363X;
    private float Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private RectF f7364Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Paint f7365e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f7366g;
    private boolean jB;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final RectF f7367o;
    private final RectF p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    n f7368r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f7369v;

    public enum n {
        OVERLAY_COLOR,
        CLIPPING
    }

    @Override // OLt.Dsr
    public void KN(boolean z2) {
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f7370n;

        static {
            int[] iArr = new int[n.values().length];
            f7370n = iArr;
            try {
                iArr[n.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7370n[n.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void o() {
        float[] fArr;
        this.P5.reset();
        this.M7.reset();
        this.p5.set(getBounds());
        RectF rectF = this.p5;
        float f3 = this.Xw;
        rectF.inset(f3, f3);
        if (this.f7368r == n.OVERLAY_COLOR) {
            this.P5.addRect(this.p5, Path.Direction.CW);
        }
        if (this.f7363X) {
            this.P5.addCircle(this.p5.centerX(), this.p5.centerY(), Math.min(this.p5.width(), this.p5.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.P5.addRoundRect(this.p5, this.f7366g, Path.Direction.CW);
        }
        RectF rectF2 = this.p5;
        float f4 = this.Xw;
        rectF2.inset(-f4, -f4);
        RectF rectF3 = this.p5;
        float f5 = this.f7361T;
        rectF3.inset(f5 / 2.0f, f5 / 2.0f);
        if (this.f7363X) {
            this.M7.addCircle(this.p5.centerX(), this.p5.centerY(), Math.min(this.p5.width(), this.p5.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.E2;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (this.f7366g[i2] + this.Xw) - (this.f7361T / 2.0f);
                i2++;
            }
            this.M7.addRoundRect(this.p5, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.p5;
        float f6 = this.f7361T;
        rectF4.inset((-f6) / 2.0f, (-f6) / 2.0f);
    }

    public boolean Ik() {
        return this.f7362U;
    }

    @Override // OLt.Dsr
    public void J2(float f3) {
        this.Xw = f3;
        o();
        invalidateSelf();
    }

    @Override // OLt.Dsr
    public void az(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f7366g, 0.0f);
        } else {
            Hh.C.t(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f7366g, 0, 8);
        }
        o();
        invalidateSelf();
    }

    @Override // OLt.CN3, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f7367o.set(getBounds());
        int i2 = j.f7370n[this.f7368r.ordinal()];
        if (i2 == 1) {
            int iSave = canvas.save();
            canvas.clipPath(this.P5);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        } else if (i2 == 2) {
            if (this.jB) {
                RectF rectF = this.f7364Z;
                if (rectF == null) {
                    this.f7364Z = new RectF(this.f7367o);
                    this.f7360S = new Matrix();
                } else {
                    rectF.set(this.f7367o);
                }
                RectF rectF2 = this.f7364Z;
                float f3 = this.f7361T;
                rectF2.inset(f3, f3);
                Matrix matrix = this.f7360S;
                if (matrix != null) {
                    matrix.setRectToRect(this.f7367o, this.f7364Z, Matrix.ScaleToFit.FILL);
                }
                int iSave2 = canvas.save();
                canvas.clipRect(this.f7367o);
                canvas.concat(this.f7360S);
                super.draw(canvas);
                canvas.restoreToCount(iSave2);
            } else {
                super.draw(canvas);
            }
            this.f7365e.setStyle(Paint.Style.FILL);
            this.f7365e.setColor(this.f7369v);
            this.f7365e.setStrokeWidth(0.0f);
            this.f7365e.setFilterBitmap(Ik());
            this.P5.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.P5, this.f7365e);
            if (this.f7363X) {
                float fWidth = ((this.f7367o.width() - this.f7367o.height()) + this.f7361T) / 2.0f;
                float fHeight = ((this.f7367o.height() - this.f7367o.width()) + this.f7361T) / 2.0f;
                if (fWidth > 0.0f) {
                    RectF rectF3 = this.f7367o;
                    float f4 = rectF3.left;
                    canvas.drawRect(f4, rectF3.top, f4 + fWidth, rectF3.bottom, this.f7365e);
                    RectF rectF4 = this.f7367o;
                    float f5 = rectF4.right;
                    canvas.drawRect(f5 - fWidth, rectF4.top, f5, rectF4.bottom, this.f7365e);
                }
                if (fHeight > 0.0f) {
                    RectF rectF5 = this.f7367o;
                    float f6 = rectF5.left;
                    float f7 = rectF5.top;
                    canvas.drawRect(f6, f7, rectF5.right, f7 + fHeight, this.f7365e);
                    RectF rectF6 = this.f7367o;
                    float f8 = rectF6.left;
                    float f9 = rectF6.bottom;
                    canvas.drawRect(f8, f9 - fHeight, rectF6.right, f9, this.f7365e);
                }
            }
        }
        if (this.f7359N != 0) {
            this.f7365e.setStyle(Paint.Style.STROKE);
            this.f7365e.setColor(this.f7359N);
            this.f7365e.setStrokeWidth(this.f7361T);
            this.P5.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.M7, this.f7365e);
        }
    }

    @Override // OLt.Dsr
    public void gh(boolean z2) {
        this.jB = z2;
        o();
        invalidateSelf();
    }

    @Override // OLt.Dsr
    public void mUb(boolean z2) {
        if (this.f7362U != z2) {
            this.f7362U = z2;
            invalidateSelf();
        }
    }

    public void r(int i2) {
        this.f7369v = i2;
        invalidateSelf();
    }

    @Override // OLt.Dsr
    public void rl(int i2, float f3) {
        this.f7359N = i2;
        this.f7361T = f3;
        o();
        invalidateSelf();
    }

    @Override // OLt.Dsr
    public void t(boolean z2) {
        this.f7363X = z2;
        o();
        invalidateSelf();
    }

    public o(Drawable drawable) {
        super((Drawable) Hh.C.Uo(drawable));
        this.f7368r = n.OVERLAY_COLOR;
        this.f7367o = new RectF();
        this.f7366g = new float[8];
        this.E2 = new float[8];
        this.f7365e = new Paint(1);
        this.f7363X = false;
        this.f7361T = 0.0f;
        this.f7359N = 0;
        this.f7369v = 0;
        this.Xw = 0.0f;
        this.jB = false;
        this.f7362U = false;
        this.P5 = new Path();
        this.M7 = new Path();
        this.p5 = new RectF();
    }

    @Override // OLt.CN3, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        o();
    }
}
