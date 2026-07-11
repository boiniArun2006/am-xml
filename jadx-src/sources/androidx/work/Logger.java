package androidx.work;

import android.util.Log;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public abstract class Logger {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Logger f42731n = null;
    private static final int rl = 20;

    public static class LogcatLogger extends Logger {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f42732t;

        @Override // androidx.work.Logger
        public void KN(String str, String str2, Throwable... thArr) {
            if (this.f42732t <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.Logger
        public void Uo(String str, String str2, Throwable... thArr) {
            if (this.f42732t <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.Logger
        public void n(String str, String str2, Throwable... thArr) {
            if (this.f42732t <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.Logger
        public void nr(String str, String str2, Throwable... thArr) {
            if (this.f42732t <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.Logger
        public void rl(String str, String str2, Throwable... thArr) {
            if (this.f42732t <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        public LogcatLogger(int i2) {
            super(i2);
            this.f42732t = i2;
        }
    }

    public abstract void KN(String str, String str2, Throwable... thArr);

    public abstract void Uo(String str, String str2, Throwable... thArr);

    public abstract void n(String str, String str2, Throwable... thArr);

    public abstract void nr(String str, String str2, Throwable... thArr);

    public abstract void rl(String str, String str2, Throwable... thArr);

    public static synchronized void O(Logger logger) {
        f42731n = logger;
    }

    public static synchronized Logger t() {
        try {
            if (f42731n == null) {
                f42731n = new LogcatLogger(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f42731n;
    }

    public Logger(int i2) {
    }

    public static String J2(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i2 = rl;
        if (length >= i2) {
            sb.append(str.substring(0, i2));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
