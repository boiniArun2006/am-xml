package t1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Xo {
    public static Object Ik(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(s4.t(str, obj2));
    }

    public static void J2(boolean z2, String str, char c2) {
        if (!z2) {
            throw new IllegalArgumentException(s4.t(str, Character.valueOf(c2)));
        }
    }

    public static void KN(boolean z2, String str, int i2) {
        if (!z2) {
            throw new IllegalArgumentException(s4.t(str, Integer.valueOf(i2)));
        }
    }

    public static void O(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void S(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void Uo(boolean z2, String str, char c2, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(s4.t(str, Character.valueOf(c2), obj));
        }
    }

    public static void WPU(boolean z2, String str, int i2) {
        if (!z2) {
            throw new IllegalStateException(s4.t(str, Integer.valueOf(i2)));
        }
    }

    public static void XQ(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static void Z(int i2, int i3, int i5) {
        if (i2 < 0 || i3 < i2 || i3 > i5) {
            throw new IndexOutOfBoundsException(t(i2, i3, i5));
        }
    }

    public static void aYN(boolean z2, String str, Object obj) {
        if (!z2) {
            throw new IllegalStateException(s4.t(str, obj));
        }
    }

    public static int az(int i2, int i3) {
        return ty(i2, i3, "index");
    }

    public static Object ck(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void gh(boolean z2, String str, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(s4.t(str, obj));
        }
    }

    public static void mUb(boolean z2, String str, long j2) {
        if (!z2) {
            throw new IllegalArgumentException(s4.t(str, Long.valueOf(j2)));
        }
    }

    private static String n(int i2, int i3, String str) {
        if (i2 < 0) {
            return s4.t("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return s4.t("%s (%s) must be less than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException("negative size: " + i3);
    }

    public static void nr(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static int o(int i2, int i3, String str) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(rl(i2, i3, str));
        }
        return i2;
    }

    public static void qie(boolean z2, String str, Object obj, Object obj2) {
        if (!z2) {
            throw new IllegalArgumentException(s4.t(str, obj, obj2));
        }
    }

    public static int r(int i2, int i3) {
        return o(i2, i3, "index");
    }

    private static String rl(int i2, int i3, String str) {
        if (i2 < 0) {
            return s4.t("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return s4.t("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException("negative size: " + i3);
    }

    private static String t(int i2, int i3, int i5) {
        return (i2 < 0 || i2 > i5) ? rl(i2, i5, "start index") : (i3 < 0 || i3 > i5) ? rl(i3, i5, "end index") : s4.t("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public static int ty(int i2, int i3, String str) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(n(i2, i3, str));
        }
        return i2;
    }

    public static void xMQ(boolean z2, String str, int i2, int i3) {
        if (!z2) {
            throw new IllegalArgumentException(s4.t(str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public static Object HI(Object obj) {
        obj.getClass();
        return obj;
    }
}
