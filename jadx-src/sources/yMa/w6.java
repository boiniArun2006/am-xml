package yMa;

import android.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static w6 f75598n;

    public static synchronized w6 t() {
        try {
            if (f75598n == null) {
                f75598n = new w6();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f75598n;
    }

    void O(String str) {
        Log.w("FirebasePerformance", str);
    }

    void n(String str) {
        Log.d("FirebasePerformance", str);
    }

    void nr(String str) {
        Log.i("FirebasePerformance", str);
    }

    void rl(String str) {
        Log.e("FirebasePerformance", str);
    }

    private w6() {
    }
}
