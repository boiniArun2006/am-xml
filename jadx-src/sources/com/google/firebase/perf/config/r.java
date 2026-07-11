package com.google.firebase.perf.config;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class r {
    private static r nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final yMa.j f60612t = yMa.j.O();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile SharedPreferences f60613n;
    private final ExecutorService rl;

    public synchronized void KN(final Context context) {
        if (this.f60613n == null && context != null) {
            this.rl.execute(new Runnable() { // from class: com.google.firebase.perf.config.Q
                @Override // java.lang.Runnable
                public final void run() {
                    r.n(this.f60594n, context);
                }
            });
        }
    }

    public boolean gh(String str, String str2) {
        if (str == null) {
            f60612t.n("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f60613n == null) {
            KN(nr());
            if (this.f60613n == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f60613n.edit().remove(str).apply();
            return true;
        }
        this.f60613n.edit().putString(str, str2).apply();
        return true;
    }

    public boolean mUb(String str, long j2) {
        if (str == null) {
            f60612t.n("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f60613n == null) {
            KN(nr());
            if (this.f60613n == null) {
                return false;
            }
        }
        this.f60613n.edit().putLong(str, j2).apply();
        return true;
    }

    public boolean qie(String str, boolean z2) {
        if (str == null) {
            f60612t.n("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f60613n == null) {
            KN(nr());
            if (this.f60613n == null) {
                return false;
            }
        }
        this.f60613n.edit().putBoolean(str, z2).apply();
        return true;
    }

    public boolean xMQ(String str, double d2) {
        if (str == null) {
            f60612t.n("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.f60613n == null) {
            KN(nr());
            if (this.f60613n == null) {
                return false;
            }
        }
        this.f60613n.edit().putLong(str, Double.doubleToRawLongBits(d2)).apply();
        return true;
    }

    public static synchronized r O() {
        try {
            if (nr == null) {
                nr = new r(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return nr;
    }

    public static /* synthetic */ void n(r rVar, Context context) {
        if (rVar.f60613n != null || context == null) {
            return;
        }
        rVar.f60613n = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    public O2.CN3 J2(String str) {
        if (str == null) {
            f60612t.n("Key is null when getting long value on device cache.");
            return O2.CN3.n();
        }
        if (this.f60613n == null) {
            KN(nr());
            if (this.f60613n == null) {
                return O2.CN3.n();
            }
        }
        if (!this.f60613n.contains(str)) {
            return O2.CN3.n();
        }
        try {
            return O2.CN3.O(Long.valueOf(this.f60613n.getLong(str, 0L)));
        } catch (ClassCastException e2) {
            f60612t.rl("Key %s from sharedPreferences has type other than long: %s", str, e2.getMessage());
            return O2.CN3.n();
        }
    }

    public O2.CN3 Uo(String str) {
        if (str == null) {
            f60612t.n("Key is null when getting String value on device cache.");
            return O2.CN3.n();
        }
        if (this.f60613n == null) {
            KN(nr());
            if (this.f60613n == null) {
                return O2.CN3.n();
            }
        }
        if (!this.f60613n.contains(str)) {
            return O2.CN3.n();
        }
        try {
            return O2.CN3.O(this.f60613n.getString(str, ""));
        } catch (ClassCastException e2) {
            f60612t.rl("Key %s from sharedPreferences has type other than String: %s", str, e2.getMessage());
            return O2.CN3.n();
        }
    }

    public O2.CN3 rl(String str) {
        if (str == null) {
            f60612t.n("Key is null when getting boolean value on device cache.");
            return O2.CN3.n();
        }
        if (this.f60613n == null) {
            KN(nr());
            if (this.f60613n == null) {
                return O2.CN3.n();
            }
        }
        if (!this.f60613n.contains(str)) {
            return O2.CN3.n();
        }
        try {
            return O2.CN3.O(Boolean.valueOf(this.f60613n.getBoolean(str, false)));
        } catch (ClassCastException e2) {
            f60612t.rl("Key %s from sharedPreferences has type other than long: %s", str, e2.getMessage());
            return O2.CN3.n();
        }
    }

    public O2.CN3 t(String str) {
        if (str == null) {
            f60612t.n("Key is null when getting double value on device cache.");
            return O2.CN3.n();
        }
        if (this.f60613n == null) {
            KN(nr());
            if (this.f60613n == null) {
                return O2.CN3.n();
            }
        }
        if (!this.f60613n.contains(str)) {
            return O2.CN3.n();
        }
        try {
            try {
                return O2.CN3.O(Double.valueOf(Double.longBitsToDouble(this.f60613n.getLong(str, 0L))));
            } catch (ClassCastException unused) {
                return O2.CN3.O(Double.valueOf(Float.valueOf(this.f60613n.getFloat(str, 0.0f)).doubleValue()));
            }
        } catch (ClassCastException e2) {
            f60612t.rl("Key %s from sharedPreferences has type other than double: %s", str, e2.getMessage());
            return O2.CN3.n();
        }
    }

    public r(ExecutorService executorService) {
        this.rl = executorService;
    }

    private Context nr() {
        try {
            com.google.firebase.Wre.az();
            return com.google.firebase.Wre.az().qie();
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
