package Dzy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static w6 f2092n = n.KN();

    public static void Ik(Class cls, String str, Object obj, Object obj2, Object obj3) {
        if (az(2)) {
            ty(cls, gh(str, obj, obj2, obj3));
        }
    }

    public static void aYN(Class cls, Throwable th, String str, Object... objArr) {
        if (az(5)) {
            S(cls, gh(str, objArr), th);
        }
    }

    private static String gh(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    public static void HI(Class cls, String str, Object obj) {
        if (f2092n.Uo(2)) {
            f2092n.t(qie(cls), gh(str, obj));
        }
    }

    public static void J2(Class cls, String str, Object... objArr) {
        if (f2092n.Uo(6)) {
            f2092n.rl(qie(cls), gh(str, objArr));
        }
    }

    public static void KN(String str, String str2) {
        if (f2092n.Uo(6)) {
            f2092n.rl(str, str2);
        }
    }

    public static void O(Class cls, String str, Throwable th) {
        if (f2092n.Uo(6)) {
            f2092n.e(qie(cls), str, th);
        }
    }

    public static void S(Class cls, String str, Throwable th) {
        if (f2092n.Uo(5)) {
            f2092n.w(qie(cls), str, th);
        }
    }

    public static void Uo(Class cls, Throwable th, String str, Object... objArr) {
        if (f2092n.Uo(6)) {
            f2092n.e(qie(cls), gh(str, objArr), th);
        }
    }

    public static void ViF(String str, String str2, Object... objArr) {
        if (f2092n.Uo(5)) {
            f2092n.n(str, gh(str2, objArr));
        }
    }

    public static void WPU(Class cls, String str, Object... objArr) {
        if (f2092n.Uo(5)) {
            f2092n.n(qie(cls), gh(str, objArr));
        }
    }

    public static void XQ(Class cls, String str) {
        if (f2092n.Uo(5)) {
            f2092n.n(qie(cls), str);
        }
    }

    public static void Z(String str, String str2, Object... objArr) {
        if (f2092n.Uo(2)) {
            f2092n.t(str, gh(str2, objArr));
        }
    }

    public static boolean az(int i2) {
        return f2092n.Uo(i2);
    }

    public static void ck(Class cls, String str, Object obj, Object obj2) {
        if (f2092n.Uo(2)) {
            f2092n.t(qie(cls), gh(str, obj, obj2));
        }
    }

    public static void g(String str, String str2, Object... objArr) {
        if (f2092n.Uo(6)) {
            f2092n.nr(str, gh(str2, objArr));
        }
    }

    public static void mUb(String str, String str2, Object... objArr) {
        if (f2092n.Uo(6)) {
            f2092n.rl(str, gh(str2, objArr));
        }
    }

    public static void n(Class cls, String str, Object obj) {
        if (f2092n.Uo(3)) {
            f2092n.O(qie(cls), gh(str, obj));
        }
    }

    public static void nY(Class cls, String str, Throwable th) {
        if (f2092n.Uo(6)) {
            f2092n.J2(qie(cls), str, th);
        }
    }

    public static void nr(Class cls, String str) {
        if (f2092n.Uo(6)) {
            f2092n.rl(qie(cls), str);
        }
    }

    public static void o(Class cls, String str, Object... objArr) {
        if (f2092n.Uo(2)) {
            f2092n.t(qie(cls), gh(str, objArr));
        }
    }

    public static void r(Class cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f2092n.Uo(2)) {
            f2092n.t(qie(cls), gh(str, obj, obj2, obj3, obj4));
        }
    }

    public static void rl(String str, String str2) {
        if (f2092n.Uo(3)) {
            f2092n.O(str, str2);
        }
    }

    public static void t(String str, String str2, Throwable th) {
        if (f2092n.Uo(3)) {
            f2092n.d(str, str2, th);
        }
    }

    public static void ty(Class cls, String str) {
        if (f2092n.Uo(2)) {
            f2092n.t(qie(cls), str);
        }
    }

    public static void xMQ(String str, String str2, Throwable th) {
        if (f2092n.Uo(6)) {
            f2092n.e(str, str2, th);
        }
    }

    private static String qie(Class cls) {
        return cls.getSimpleName();
    }
}
