package androidx.browser.trusted;

import a8o.j;
import android.os.IBinder;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class TrustedWebActivityCallbackRemote {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final a8o.j f14615n;

    static TrustedWebActivityCallbackRemote n(IBinder iBinder) {
        a8o.j jVarFcU = iBinder == null ? null : j.AbstractBinderC0466j.fcU(iBinder);
        if (jVarFcU == null) {
            return null;
        }
        return new TrustedWebActivityCallbackRemote(jVarFcU);
    }

    private TrustedWebActivityCallbackRemote(a8o.j jVar) {
        this.f14615n = jVar;
    }
}
