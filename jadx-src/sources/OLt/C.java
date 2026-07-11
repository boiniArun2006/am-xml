package OLt;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class C extends Drawable implements Dsr {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    float[] f7304O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float[] f7311n = new float[8];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final float[] f7314t = new float[8];
    final Paint J2 = new Paint(1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f7313r = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f7312o = 0.0f;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f7308Z = 0.0f;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f7305S = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7310g = false;
    private boolean E2 = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Path f7309e = new Path();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    final Path f7307X = new Path();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f7306T = 0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final RectF f7303N = new RectF();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f7315v = 255;

    @Override // OLt.Dsr
    public void KN(boolean z2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    private void Uo() {
        float[] fArr;
        float[] fArr2;
        this.f7309e.reset();
        this.f7307X.reset();
        this.f7303N.set(getBounds());
        RectF rectF = this.f7303N;
        float f3 = this.f7312o;
        rectF.inset(f3 / 2.0f, f3 / 2.0f);
        int i2 = 0;
        if (this.f7313r) {
            this.f7307X.addCircle(this.f7303N.centerX(), this.f7303N.centerY(), Math.min(this.f7303N.width(), this.f7303N.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i3 = 0;
            while (true) {
                fArr = this.f7314t;
                if (i3 >= fArr.length) {
                    break;
                }
                fArr[i3] = (this.f7311n[i3] + this.f7308Z) - (this.f7312o / 2.0f);
                i3++;
            }
            this.f7307X.addRoundRect(this.f7303N, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f7303N;
        float f4 = this.f7312o;
        rectF2.inset((-f4) / 2.0f, (-f4) / 2.0f);
        float f5 = this.f7308Z + (this.f7310g ? this.f7312o : 0.0f);
        this.f7303N.inset(f5, f5);
        if (this.f7313r) {
            this.f7309e.addCircle(this.f7303N.centerX(), this.f7303N.centerY(), Math.min(this.f7303N.width(), this.f7303N.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f7310g) {
            if (this.f7304O == null) {
                this.f7304O = new float[8];
            }
            while (true) {
                fArr2 = this.f7304O;
                if (i2 >= fArr2.length) {
                    break;
                }
                fArr2[i2] = this.f7311n[i2] - this.f7312o;
                i2++;
            }
            this.f7309e.addRoundRect(this.f7303N, fArr2, Path.Direction.CW);
        } else {
            this.f7309e.addRoundRect(this.f7303N, this.f7311n, Path.Direction.CW);
        }
        float f6 = -f5;
        this.f7303N.inset(f6, f6);
    }

    public static C n(ColorDrawable colorDrawable) {
        return new C(colorDrawable.getColor());
    }

    @Override // OLt.Dsr
    public void J2(float f3) {
        if (this.f7308Z != f3) {
            this.f7308Z = f3;
            Uo();
            invalidateSelf();
        }
    }

    public void O(int i2) {
        if (this.f7306T != i2) {
            this.f7306T = i2;
            invalidateSelf();
        }
    }

    @Override // OLt.Dsr
    public void az(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f7311n, 0.0f);
        } else {
            Hh.C.t(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f7311n, 0, 8);
        }
        Uo();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.J2.setColor(I28.t(this.f7306T, this.f7315v));
        this.J2.setStyle(Paint.Style.FILL);
        this.J2.setFilterBitmap(nr());
        canvas.drawPath(this.f7309e, this.J2);
        if (this.f7312o != 0.0f) {
            this.J2.setColor(I28.t(this.f7305S, this.f7315v));
            this.J2.setStyle(Paint.Style.STROKE);
            this.J2.setStrokeWidth(this.f7312o);
            canvas.drawPath(this.f7307X, this.J2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7315v;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return I28.rl(I28.t(this.f7306T, this.f7315v));
    }

    @Override // OLt.Dsr
    public void gh(boolean z2) {
        if (this.f7310g != z2) {
            this.f7310g = z2;
            Uo();
            invalidateSelf();
        }
    }

    @Override // OLt.Dsr
    public void mUb(boolean z2) {
        if (this.E2 != z2) {
            this.E2 = z2;
            invalidateSelf();
        }
    }

    public boolean nr() {
        return this.E2;
    }

    @Override // OLt.Dsr
    public void rl(int i2, float f3) {
        if (this.f7305S != i2) {
            this.f7305S = i2;
            invalidateSelf();
        }
        if (this.f7312o != f3) {
            this.f7312o = f3;
            Uo();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (i2 != this.f7315v) {
            this.f7315v = i2;
            invalidateSelf();
        }
    }

    @Override // OLt.Dsr
    public void t(boolean z2) {
        this.f7313r = z2;
        Uo();
        invalidateSelf();
    }

    public C(int i2) {
        O(i2);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Uo();
    }
}
