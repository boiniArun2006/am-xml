package FQq;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class I28 {
    private static k6.Wre J2 = null;
    private static volatile k6.fuX KN = null;
    private static k6.I28 Uo = null;
    private static ThreadLocal mUb = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f2538n = false;
    private static boolean nr = true;
    private static boolean rl = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f2539t = true;
    private static volatile k6.CN3 xMQ;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static j f2537O = j.AUTOMATIC;
    private static lr.n gh = new lr.w6();

    public static lr.n J2() {
        return gh;
    }

    public static boolean KN() {
        return rl;
    }

    public static boolean O() {
        return nr;
    }

    private static x0.Dsr Uo() {
        x0.Dsr dsr = (x0.Dsr) mUb.get();
        if (dsr != null) {
            return dsr;
        }
        x0.Dsr dsr2 = new x0.Dsr();
        mUb.set(dsr2);
        return dsr2;
    }

    public static k6.fuX mUb(Context context) {
        k6.fuX fux;
        k6.fuX fux2 = KN;
        if (fux2 != null) {
            return fux2;
        }
        synchronized (k6.fuX.class) {
            try {
                fux = KN;
                if (fux == null) {
                    k6.CN3 cn3XMQ = xMQ(context);
                    k6.Wre nVar = J2;
                    if (nVar == null) {
                        nVar = new k6.n();
                    }
                    fux = new k6.fuX(cn3XMQ, nVar);
                    KN = fux;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fux;
    }

    public static /* synthetic */ File n(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static j nr() {
        return f2537O;
    }

    public static void rl(String str) {
        if (rl) {
            Uo().n(str);
        }
    }

    public static float t(String str) {
        if (rl) {
            return Uo().rl(str);
        }
        return 0.0f;
    }

    public static k6.CN3 xMQ(Context context) {
        k6.CN3 cn3;
        if (!f2539t) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        k6.CN3 cn32 = xMQ;
        if (cn32 != null) {
            return cn32;
        }
        synchronized (k6.CN3.class) {
            try {
                cn3 = xMQ;
                if (cn3 == null) {
                    k6.I28 i28 = Uo;
                    if (i28 == null) {
                        i28 = new k6.I28() { // from class: FQq.Ml
                            @Override // k6.I28
                            public final File n() {
                                return I28.n(applicationContext);
                            }
                        };
                    }
                    cn3 = new k6.CN3(i28);
                    xMQ = cn3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cn3;
    }
}
