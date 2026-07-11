package K7m;

import a88.C;
import a88.Dsr;
import a88.Pl;
import android.text.TextUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class CN3 {
    public static void nr(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void rl(C c2, a88.Wre wre, Dsr dsr) {
        if (c2 == C.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (wre == a88.Wre.DEFINED_BY_JAVASCRIPT && c2 == C.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (dsr == Dsr.DEFINED_BY_JAVASCRIPT && c2 == C.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public static void J2(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void KN(Pl pl) {
        if (!pl.S()) {
        } else {
            throw new IllegalStateException("AdSession is started");
        }
    }

    public static void O(String str, int i2, String str2) {
        if (str.length() <= i2) {
        } else {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void Uo(Pl pl) {
        if (!pl.o()) {
        } else {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void az(Pl pl) {
        if (pl.ty().o() == null) {
        } else {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    public static void gh(Pl pl) {
        if (pl.XQ()) {
        } else {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    public static void mUb(Pl pl) {
        if (pl.Z()) {
        } else {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void n() {
        if (ixS.j.t()) {
        } else {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void qie(Pl pl) {
        if (pl.ty().r() == null) {
        } else {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public static void t(Pl pl) {
        xMQ(pl);
        Uo(pl);
    }

    private static void xMQ(Pl pl) {
        if (pl.S()) {
        } else {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
