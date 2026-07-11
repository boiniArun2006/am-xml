package Jff;

import Hh.C;
import Jff.I28;
import OLt.CN3;
import OLt.Dsr;
import OLt.InterfaceC1421z;
import OLt.Pl;
import OLt.Xo;
import OLt.aC;
import OLt.o;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Drawable f4629n = new ColorDrawable(0);

    static Drawable J2(Drawable drawable, InterfaceC1421z interfaceC1421z) {
        return Uo(drawable, interfaceC1421z, null);
    }

    static Xo KN(OLt.w6 w6Var, InterfaceC1421z interfaceC1421z) {
        Drawable drawableJ2 = J2(w6Var.O(f4629n), interfaceC1421z);
        w6Var.O(drawableJ2);
        C.KN(drawableJ2, "Parent has no child drawable!");
        return (Xo) drawableJ2;
    }

    private static Drawable n(Drawable drawable, I28 i28, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            aC aCVar = new aC(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint(), i28.KN());
            rl(aCVar, i28);
            return aCVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            Pl pl = new Pl((NinePatchDrawable) drawable);
            rl(pl, i28);
            return pl;
        }
        if (!(drawable instanceof ColorDrawable)) {
            Dzy.j.ViF("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        OLt.C cN = OLt.C.n((ColorDrawable) drawable);
        rl(cN, i28);
        return cN;
    }

    static Drawable O(Drawable drawable, I28 i28) {
        try {
            if (T5.n.nr()) {
                T5.n.n("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && i28 != null && i28.mUb() == I28.j.OVERLAY_COLOR) {
                o oVar = new o(drawable);
                rl(oVar, i28);
                oVar.r(i28.O());
                return oVar;
            }
            if (T5.n.nr()) {
                T5.n.rl();
            }
            return drawable;
        } finally {
            if (T5.n.nr()) {
                T5.n.rl();
            }
        }
    }

    static Drawable Uo(Drawable drawable, InterfaceC1421z interfaceC1421z, PointF pointF) {
        if (T5.n.nr()) {
            T5.n.n("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable != null && interfaceC1421z != null) {
            Xo xo = new Xo(drawable, interfaceC1421z);
            if (pointF != null) {
                xo.XQ(pointF);
            }
            if (T5.n.nr()) {
                T5.n.rl();
            }
            return xo;
        }
        if (T5.n.nr()) {
            T5.n.rl();
        }
        return drawable;
    }

    static Drawable nr(Drawable drawable, I28 i28, Resources resources) {
        try {
            if (T5.n.nr()) {
                T5.n.n("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && i28 != null && i28.mUb() == I28.j.BITMAP_ONLY) {
                if (drawable instanceof CN3) {
                    OLt.w6 w6VarT = t((CN3) drawable);
                    w6VarT.O(n(w6VarT.O(f4629n), i28, resources));
                    return drawable;
                }
                Drawable drawableN = n(drawable, i28, resources);
                if (T5.n.nr()) {
                    T5.n.rl();
                }
                return drawableN;
            }
            if (T5.n.nr()) {
                T5.n.rl();
            }
            return drawable;
        } finally {
            if (T5.n.nr()) {
                T5.n.rl();
            }
        }
    }

    static void rl(Dsr dsr, I28 i28) {
        dsr.t(i28.xMQ());
        dsr.az(i28.t());
        dsr.rl(i28.n(), i28.rl());
        dsr.J2(i28.J2());
        dsr.gh(i28.gh());
        dsr.mUb(i28.Uo());
        dsr.KN(i28.KN());
    }

    static OLt.w6 t(OLt.w6 w6Var) {
        while (true) {
            Object objN = w6Var.n();
            if (objN == w6Var || !(objN instanceof OLt.w6)) {
                break;
            }
            w6Var = (OLt.w6) objN;
        }
        return w6Var;
    }
}
