package wqP;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class QJ {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static n f75112n = n.WARN;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public enum n {
        DEBUG,
        WARN,
        NONE
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f75113n;

        static {
            int[] iArr = new int[n.values().length];
            f75113n = iArr;
            try {
                iArr[n.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75113n[n.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75113n[n.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void n(String str, String str2, Object... objArr) {
        rl(n.DEBUG, str, str2, objArr);
    }

    public static void nr(String str, String str2, Object... objArr) {
        rl(n.WARN, str, str2, objArr);
    }

    public static boolean t() {
        return f75112n.ordinal() >= n.DEBUG.ordinal();
    }

    private static void rl(n nVar, String str, String str2, Object... objArr) {
        if (nVar.ordinal() >= f75112n.ordinal()) {
            String str3 = String.format("(%s) [%s]: ", pTYaLzzmJSGAPQ.kKLCt, str) + String.format(str2, objArr);
            int i2 = j.f75113n[nVar.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        throw new IllegalStateException("Trying to log something on level NONE");
                    }
                    return;
                } else {
                    Log.w("Firestore", str3);
                    return;
                }
            }
            Log.i("Firestore", str3);
        }
    }
}
