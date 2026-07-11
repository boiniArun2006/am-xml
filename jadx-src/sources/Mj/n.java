package Mj;

import android.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final n f6680t = new n("FirebaseAppCheck");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f6681n;
    private int rl = 4;

    public void O(String str, Throwable th) {
        if (n(6)) {
            Log.e(this.f6681n, str, th);
        }
    }

    public void nr(String str) {
        O(str, null);
    }

    public void rl(String str) {
        t(str, null);
    }

    public void t(String str, Throwable th) {
        if (n(3)) {
            Log.d(this.f6681n, str, th);
        }
    }

    public static n J2() {
        return f6680t;
    }

    private boolean n(int i2) {
        return this.rl <= i2 || Log.isLoggable(this.f6681n, i2);
    }

    public n(String str) {
        this.f6681n = str;
    }
}
