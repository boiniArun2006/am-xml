package Szt;

import X1.I28;
import X1.n;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final X1.j f10110n;
    private final boolean nr;
    private final n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Paint f10111t;

    public interface n {
        void n(int i2, Bitmap bitmap);

        Pj0.j rl(int i2);
    }

    private enum w6 {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    private boolean nr(int i2) {
        if (i2 == 0) {
            return true;
        }
        X1.n nVarNr = this.f10110n.nr(i2);
        X1.n nVarNr2 = this.f10110n.nr(i2 - 1);
        if (nVarNr.J2 == n.j.NO_BLEND && t(nVarNr)) {
            return true;
        }
        return nVarNr2.Uo == n.EnumC0422n.DISPOSE_TO_BACKGROUND && t(nVarNr2);
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f10112n;

        static {
            int[] iArr = new int[w6.values().length];
            f10112n = iArr;
            try {
                iArr[w6.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10112n[w6.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10112n[w6.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10112n[w6.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private int J2(int i2, Canvas canvas) {
        while (i2 >= 0) {
            int i3 = j.f10112n[rl(i2).ordinal()];
            if (i3 == 1) {
                X1.n nVarNr = this.f10110n.nr(i2);
                Pj0.j jVarRl = this.rl.rl(i2);
                if (jVarRl != null) {
                    try {
                        canvas.drawBitmap((Bitmap) jVarRl.eF(), 0.0f, 0.0f, (Paint) null);
                        if (nVarNr.Uo == n.EnumC0422n.DISPOSE_TO_BACKGROUND) {
                            n(canvas, nVarNr);
                        }
                        return i2 + 1;
                    } finally {
                        if (!this.nr) {
                            jVarRl.close();
                        }
                    }
                }
                if (nr(i2)) {
                    return i2;
                }
                i2--;
            } else {
                if (i3 == 2) {
                    return i2 + 1;
                }
                if (i3 == 3) {
                    return i2;
                }
                i2--;
            }
        }
        return 0;
    }

    private void O(Bitmap bitmap) {
        I28 i28Gh = this.f10110n.gh();
        if (i28Gh == null) {
            return;
        }
        i28Gh.t();
    }

    private void n(Canvas canvas, X1.n nVar) {
        canvas.drawRect(nVar.rl, nVar.f11731t, r0 + nVar.nr, r1 + nVar.f11729O, this.f10111t);
    }

    private w6 rl(int i2) {
        X1.n nVarNr = this.f10110n.nr(i2);
        n.EnumC0422n enumC0422n = nVarNr.Uo;
        return enumC0422n == n.EnumC0422n.DISPOSE_DO_NOT ? w6.REQUIRED : enumC0422n == n.EnumC0422n.DISPOSE_TO_BACKGROUND ? t(nVarNr) ? w6.NOT_REQUIRED : w6.REQUIRED : enumC0422n == n.EnumC0422n.DISPOSE_TO_PREVIOUS ? w6.SKIP : w6.ABORT;
    }

    private boolean t(X1.n nVar) {
        return nVar.rl == 0 && nVar.f11731t == 0 && nVar.nr == this.f10110n.mUb() && nVar.f11729O == this.f10110n.KN();
    }

    public void KN(int i2, Bitmap bitmap) {
        if (this.nr) {
            Uo(i2, bitmap);
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        for (int iJ2 = !nr(i2) ? J2(i2 - 1, canvas) : i2; iJ2 < i2; iJ2++) {
            X1.n nVarNr = this.f10110n.nr(iJ2);
            n.EnumC0422n enumC0422n = nVarNr.Uo;
            if (enumC0422n != n.EnumC0422n.DISPOSE_TO_PREVIOUS) {
                if (nVarNr.J2 == n.j.NO_BLEND) {
                    n(canvas, nVarNr);
                }
                this.f10110n.O(iJ2, canvas);
                this.rl.n(iJ2, bitmap);
                if (enumC0422n == n.EnumC0422n.DISPOSE_TO_BACKGROUND) {
                    n(canvas, nVarNr);
                }
            }
        }
        X1.n nVarNr2 = this.f10110n.nr(i2);
        if (nVarNr2.J2 == n.j.NO_BLEND) {
            n(canvas, nVarNr2);
        }
        this.f10110n.O(i2, canvas);
        O(bitmap);
    }

    public void Uo(int i2, Bitmap bitmap) {
        this.f10110n.xMQ(i2, new Canvas(bitmap));
    }

    public Ml(X1.j jVar, boolean z2, n nVar) {
        this.f10110n = jVar;
        this.rl = nVar;
        this.nr = z2;
        Paint paint = new Paint();
        this.f10111t = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
