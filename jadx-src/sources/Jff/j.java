package Jff;

import OLt.CN3;
import OLt.InterfaceC1421z;
import OLt.Xo;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class j implements htt.w6 {
    private final CN3 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final OLt.Wre f4630O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Drawable f4631n;
    private final Ml nr;
    private final Resources rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private I28 f4632t;

    private void mUb() {
        gh(1);
        gh(2);
        gh(3);
        gh(4);
        gh(5);
    }

    public void XQ(Drawable drawable) {
        o(1, drawable);
    }

    public InterfaceC1421z az() {
        if (ck(2)) {
            return HI(2).Z();
        }
        return null;
    }

    public PointF qie() {
        if (ck(2)) {
            return HI(2).o();
        }
        return null;
    }

    private void Ik() {
        this.J2.O(this.f4631n);
    }

    private Drawable KN(Drawable drawable, InterfaceC1421z interfaceC1421z) {
        return Wre.J2(Wre.nr(drawable, this.f4632t, this.rl), interfaceC1421z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void S(float f3) {
        Drawable drawableRl = this.f4630O.rl(3);
        if (drawableRl == 0) {
            return;
        }
        if (f3 >= 0.999f) {
            if (drawableRl instanceof Animatable) {
                ((Animatable) drawableRl).stop();
            }
            gh(3);
        } else {
            if (drawableRl instanceof Animatable) {
                ((Animatable) drawableRl).start();
            }
            xMQ(3);
        }
        drawableRl.setLevel(Math.round(f3 * 10000.0f));
    }

    private void gh(int i2) {
        if (i2 >= 0) {
            this.f4630O.ty(i2);
        }
    }

    private void o(int i2, Drawable drawable) {
        if (drawable == null) {
            this.f4630O.J2(i2, null);
        } else {
            ty(i2).O(Wre.nr(drawable, this.f4632t, this.rl));
        }
    }

    private void r() {
        OLt.Wre wre = this.f4630O;
        if (wre != null) {
            wre.KN();
            this.f4630O.gh();
            mUb();
            xMQ(1);
            this.f4630O.HI();
            this.f4630O.mUb();
        }
    }

    private OLt.w6 ty(int i2) {
        OLt.w6 w6VarT = this.f4630O.t(i2);
        w6VarT.n();
        return w6VarT.n() instanceof Xo ? (Xo) w6VarT.n() : w6VarT;
    }

    private void xMQ(int i2) {
        if (i2 >= 0) {
            this.f4630O.az(i2);
        }
    }

    @Override // htt.w6
    public void J2(Drawable drawable) {
        this.nr.Ik(drawable);
    }

    @Override // htt.w6
    public void O(Drawable drawable, float f3, boolean z2) {
        Drawable drawableNr = Wre.nr(drawable, this.f4632t, this.rl);
        drawableNr.mutate();
        this.J2.O(drawableNr);
        this.f4630O.KN();
        mUb();
        xMQ(2);
        S(f3);
        if (z2) {
            this.f4630O.HI();
        }
        this.f4630O.mUb();
    }

    public void Z(int i2) {
        XQ(this.rl.getDrawable(i2));
    }

    @Override // htt.n
    public Rect getBounds() {
        return this.nr.getBounds();
    }

    @Override // htt.w6
    public void n(Throwable th) {
        this.f4630O.KN();
        mUb();
        if (this.f4630O.rl(4) != null) {
            xMQ(4);
        } else {
            xMQ(1);
        }
        this.f4630O.mUb();
    }

    @Override // htt.n
    public Drawable nr() {
        return this.nr;
    }

    @Override // htt.w6
    public void rl(Throwable th) {
        this.f4630O.KN();
        mUb();
        if (this.f4630O.rl(5) != null) {
            xMQ(5);
        } else {
            xMQ(1);
        }
        this.f4630O.mUb();
    }

    @Override // htt.w6
    public void t(float f3, boolean z2) {
        if (this.f4630O.rl(3) == null) {
            return;
        }
        this.f4630O.KN();
        S(f3);
        if (z2) {
            this.f4630O.HI();
        }
        this.f4630O.mUb();
    }

    j(n nVar) {
        int size;
        int i2;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f4631n = colorDrawable;
        if (T5.n.nr()) {
            T5.n.n("GenericDraweeHierarchy()");
        }
        this.rl = nVar.ck();
        this.f4632t = nVar.o();
        CN3 cn3 = new CN3(colorDrawable);
        this.J2 = cn3;
        int i3 = 1;
        if (nVar.mUb() != null) {
            size = nVar.mUb().size();
        } else {
            size = 1;
        }
        size = size == 0 ? 1 : size;
        if (nVar.az() != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = size + i2;
        Drawable[] drawableArr = new Drawable[i5 + 6];
        drawableArr[0] = KN(nVar.O(), null);
        drawableArr[1] = KN(nVar.gh(), nVar.qie());
        drawableArr[2] = Uo(cn3, nVar.nr(), nVar.t(), nVar.rl());
        drawableArr[3] = KN(nVar.ty(), nVar.HI());
        drawableArr[4] = KN(nVar.Ik(), nVar.r());
        drawableArr[5] = KN(nVar.KN(), nVar.xMQ());
        if (i5 > 0) {
            if (nVar.mUb() != null) {
                Iterator it = nVar.mUb().iterator();
                i3 = 0;
                while (it.hasNext()) {
                    drawableArr[i3 + 6] = KN((Drawable) it.next(), null);
                    i3++;
                }
            }
            if (nVar.az() != null) {
                drawableArr[i3 + 6] = KN(nVar.az(), null);
            }
        }
        OLt.Wre wre = new OLt.Wre(drawableArr, false, 2);
        this.f4630O = wre;
        wre.XQ(nVar.Uo());
        Ml ml = new Ml(Wre.O(wre, this.f4632t));
        this.nr = ml;
        ml.mutate();
        r();
        if (T5.n.nr()) {
            T5.n.rl();
        }
    }

    private Xo HI(int i2) {
        OLt.w6 w6VarTy = ty(i2);
        if (w6VarTy instanceof Xo) {
            return (Xo) w6VarTy;
        }
        return Wre.KN(w6VarTy, InterfaceC1421z.f7396n);
    }

    private Drawable Uo(Drawable drawable, InterfaceC1421z interfaceC1421z, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return Wre.Uo(drawable, interfaceC1421z, pointF);
    }

    private boolean ck(int i2) {
        return ty(i2) instanceof Xo;
    }

    @Override // htt.w6
    public void reset() {
        Ik();
        r();
    }
}
