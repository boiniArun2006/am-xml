package w9;

import kotlin.ExceptionsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Dsr {
    public static final void n(fuX fux, Throwable th) {
        if (fux != null) {
            if (th == null) {
                fux.release();
                return;
            }
            try {
                fux.release();
            } catch (Throwable th2) {
                ExceptionsKt.addSuppressed(th, th2);
            }
        }
    }
}
