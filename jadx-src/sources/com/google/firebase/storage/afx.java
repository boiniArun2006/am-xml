package com.google.firebase.storage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class afx {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final afx f60867t = new afx();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f60868n = new HashMap();
    private final Object rl = new Object();

    static afx rl() {
        return f60867t;
    }

    public void n(g9s g9sVar) {
        synchronized (this.rl) {
            this.f60868n.put(g9sVar.X().toString(), new WeakReference(g9sVar));
        }
    }

    public void t(g9s g9sVar) {
        synchronized (this.rl) {
            try {
                String string = g9sVar.X().toString();
                WeakReference weakReference = (WeakReference) this.f60868n.get(string);
                g9s g9sVar2 = weakReference != null ? (g9s) weakReference.get() : null;
                if (g9sVar2 == null || g9sVar2 == g9sVar) {
                    this.f60868n.remove(string);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    afx() {
    }
}
