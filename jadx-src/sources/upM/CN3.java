package upM;

import Vy.Pl;
import Vy.aC;
import android.text.TextUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class CN3 {
    public static void nr(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void rl(aC aCVar, Vy.Wre wre, Vy.fuX fux) {
        if (aCVar == aC.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (wre == Vy.Wre.DEFINED_BY_JAVASCRIPT && aCVar == aC.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (fux == Vy.fuX.DEFINED_BY_JAVASCRIPT && aCVar == aC.NATIVE) {
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
        if (!pl.Z()) {
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
        if (!pl.Ik()) {
        } else {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void az(Pl pl) {
        if (pl.qie().o() == null) {
        } else {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    public static void gh(Pl pl) {
        if (pl.o()) {
        } else {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    public static void mUb(Pl pl) {
        if (pl.r()) {
        } else {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void n() {
        if (Z7k.j.rl()) {
        } else {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void qie(Pl pl) {
        if (pl.qie().r() == null) {
        } else {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public static void t(Pl pl) {
        xMQ(pl);
        Uo(pl);
    }

    private static void xMQ(Pl pl) {
        if (pl.Z()) {
        } else {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
