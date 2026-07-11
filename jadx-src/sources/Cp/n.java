package Cp;

import kotlin.ExceptionsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n {
    public static final void n(j jVar, Throwable th) {
        if (jVar != null) {
            if (th == null) {
                jVar.release();
                return;
            }
            try {
                jVar.release();
            } catch (Throwable th2) {
                ExceptionsKt.addSuppressed(th, th2);
            }
        }
    }
}
