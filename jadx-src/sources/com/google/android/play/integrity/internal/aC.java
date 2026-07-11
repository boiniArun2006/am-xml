package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class aC implements Pl {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f59573t = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Pl f59574n;
    private volatile Object rl = f59573t;

    private aC(Pl pl) {
        this.f59574n = pl;
    }

    public static Pl n(Pl pl) {
        return pl instanceof aC ? pl : new aC(pl);
    }

    @Override // com.google.android.play.integrity.internal.Pl
    public final Object a() {
        Object objA;
        Object obj = this.rl;
        Object obj2 = f59573t;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.rl;
                if (objA == obj2) {
                    objA = this.f59574n.a();
                    Object obj3 = this.rl;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.rl = objA;
                    this.f59574n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
