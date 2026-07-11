package com.fyber.inneractive.sdk.click;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f53244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f53245b;

    public n(r rVar, b bVar) {
        this.f53245b = rVar;
        this.f53244a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.f53245b.f53250e;
        if (oVar != null) {
            oVar.a(this.f53244a);
        }
    }
}
