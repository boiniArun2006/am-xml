package Hh;

import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class C {
    public static int J2(int i2, int i3, String str) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(n(i2, i3, str));
        }
        return i2;
    }

    public static Object KN(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static int O(int i2, int i3) {
        return J2(i2, i3, "index");
    }

    public static void mUb(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    private static String n(int i2, int i3, String str) {
        if (i2 < 0) {
            return gh("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return gh("%s (%s) must be less than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(gUxOLwRQBPPLC.yQRZHoFiTSg + i3);
    }

    public static void nr(boolean z2, String str, Object... objArr) {
        if (!z2) {
            throw new IllegalArgumentException(gh(str, objArr));
        }
    }

    public static void rl(Boolean bool) {
        if (bool != null && !bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    public static void t(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void xMQ(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static Object Uo(Object obj) {
        obj.getClass();
        return obj;
    }

    static String gh(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append(strValueOf.substring(i3, iIndexOf));
            sb.append(objArr[i2]);
            i3 = iIndexOf + 2;
            i2++;
        }
        sb.append(strValueOf.substring(i3));
        if (i2 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
