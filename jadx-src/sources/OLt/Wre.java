package OLt;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Wre extends j {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f7323E;
    private final boolean E2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f7324M;
    int M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    int f7325N;
    boolean[] P5;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    int f7326T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    int f7327U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final int f7328X;
    int[] Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7329e;
    private boolean eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Drawable[] f7330g;
    int[] jB;
    private QVk.qz p5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    long f7331v;

    private boolean S(float f3) {
        boolean z2 = true;
        for (int i2 = 0; i2 < this.f7330g.length; i2++) {
            boolean z3 = this.P5[i2];
            int i3 = z3 ? 1 : -1;
            int[] iArr = this.jB;
            int i5 = (int) (this.Xw[i2] + (i3 * 255 * f3));
            iArr[i2] = i5;
            if (i5 < 0) {
                iArr[i2] = 0;
            }
            if (iArr[i2] > 255) {
                iArr[i2] = 255;
            }
            if (z3 && iArr[i2] < 255) {
                z2 = false;
            }
            if (!z3 && iArr[i2] > 0) {
                z2 = false;
            }
        }
        return z2;
    }

    private void Z() {
        this.f7326T = 2;
        Arrays.fill(this.Xw, this.f7329e);
        this.Xw[0] = 255;
        Arrays.fill(this.jB, this.f7329e);
        this.jB[0] = 255;
        Arrays.fill(this.P5, this.E2);
        this.P5[0] = true;
    }

    public void HI() {
        this.f7326T = 2;
        for (int i2 = 0; i2 < this.f7330g.length; i2++) {
            this.jB[i2] = this.P5[i2] ? 255 : 0;
        }
        invalidateSelf();
    }

    public void az(int i2) {
        this.f7326T = 0;
        this.P5[i2] = true;
        invalidateSelf();
    }

    public void gh() {
        this.f7326T = 0;
        Arrays.fill(this.P5, true);
        invalidateSelf();
    }

    public void ty(int i2) {
        this.f7326T = 0;
        this.P5[i2] = false;
        invalidateSelf();
    }

    private void Ik() {
        if (this.eF) {
            this.eF = false;
            QVk.qz qzVar = this.p5;
            if (qzVar != null) {
                qzVar.t();
            }
        }
    }

    private void o() {
        if (this.f7323E && this.f7326T == 2 && this.P5[this.f7328X]) {
            QVk.qz qzVar = this.p5;
            if (qzVar != null) {
                qzVar.rl();
            }
            this.f7323E = false;
        }
    }

    private void r() {
        int i2;
        if (!this.eF && (i2 = this.f7328X) >= 0) {
            boolean[] zArr = this.P5;
            if (i2 < zArr.length && zArr[i2]) {
                this.eF = true;
                QVk.qz qzVar = this.p5;
                if (qzVar != null) {
                    qzVar.n();
                }
            }
        }
    }

    private void xMQ(Canvas canvas, Drawable drawable, int i2) {
        if (drawable == null || i2 <= 0) {
            return;
        }
        this.M7++;
        if (this.f7324M) {
            drawable.mutate();
        }
        drawable.setAlpha(i2);
        this.M7--;
        drawable.draw(canvas);
    }

    public void KN() {
        this.M7++;
    }

    public void XQ(int i2) {
        this.f7325N = i2;
        if (this.f7326T == 1) {
            this.f7326T = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[LOOP:0: B:25:0x0052->B:27:0x0057, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072 A[EDGE_INSN: B:33:0x0072->B:28:0x0072 BREAK  A[LOOP:0: B:25:0x0052->B:27:0x0057], SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        boolean zS;
        Drawable[] drawableArr;
        int i2 = this.f7326T;
        int i3 = 0;
        boolean z2 = true;
        if (i2 != 0) {
            if (i2 == 1) {
                Hh.C.xMQ(this.f7325N > 0);
                zS = S((ck() - this.f7331v) / this.f7325N);
                this.f7326T = zS ? 2 : 1;
            }
            while (true) {
                drawableArr = this.f7330g;
                if (i3 < drawableArr.length) {
                    break;
                }
                xMQ(canvas, drawableArr[i3], (int) Math.ceil(((double) (this.jB[i3] * this.f7327U)) / 255.0d));
                i3++;
            }
            if (z2) {
                invalidateSelf();
                return;
            } else {
                Ik();
                o();
                return;
            }
        }
        System.arraycopy(this.jB, 0, this.Xw, 0, this.f7330g.length);
        this.f7331v = ck();
        zS = S(this.f7325N == 0 ? 1.0f : 0.0f);
        r();
        this.f7326T = zS ? 2 : 1;
        z2 = zS;
        while (true) {
            drawableArr = this.f7330g;
            if (i3 < drawableArr.length) {
            }
            xMQ(canvas, drawableArr[i3], (int) Math.ceil(((double) (this.jB[i3] * this.f7327U)) / 255.0d));
            i3++;
        }
        if (z2) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7327U;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.M7 == 0) {
            super.invalidateSelf();
        }
    }

    public void mUb() {
        this.M7--;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.f7327U != i2) {
            this.f7327U = i2;
            invalidateSelf();
        }
    }

    public Wre(Drawable[] drawableArr, boolean z2, int i2) {
        super(drawableArr);
        this.f7324M = true;
        Hh.C.mUb(drawableArr.length >= 1, "At least one layer required!");
        this.f7330g = drawableArr;
        this.Xw = new int[drawableArr.length];
        this.jB = new int[drawableArr.length];
        this.f7327U = 255;
        this.P5 = new boolean[drawableArr.length];
        this.M7 = 0;
        this.E2 = z2;
        this.f7329e = z2 ? 255 : 0;
        this.f7328X = i2;
        Z();
    }

    protected long ck() {
        return SystemClock.uptimeMillis();
    }
}
