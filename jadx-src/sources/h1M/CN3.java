package h1M;

import android.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class CN3 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final CN3 f67938t = new CN3("FirebaseCrashlytics");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f67939n;
    private int rl = 4;

    public void KN(String str, Throwable th) {
        if (n(4)) {
            Log.i(this.f67939n, str, th);
        }
    }

    public void O(String str, Throwable th) {
        if (n(6)) {
            Log.e(this.f67939n, str, th);
        }
    }

    public void Uo(String str) {
        KN(str, null);
    }

    public void gh(String str) {
        qie(str, null);
    }

    public void mUb(String str, Throwable th) {
        if (n(2)) {
            Log.v(this.f67939n, str, th);
        }
    }

    public void nr(String str) {
        O(str, null);
    }

    public void qie(String str, Throwable th) {
        if (n(5)) {
            Log.w(this.f67939n, str, th);
        }
    }

    public void rl(String str) {
        t(str, null);
    }

    public void t(String str, Throwable th) {
        if (n(3)) {
            Log.d(this.f67939n, str, th);
        }
    }

    public void xMQ(String str) {
        mUb(str, null);
    }

    public static CN3 J2() {
        return f67938t;
    }

    private boolean n(int i2) {
        return this.rl <= i2 || Log.isLoggable(this.f67939n, i2);
    }

    public CN3(String str) {
        this.f67939n = str;
    }
}
