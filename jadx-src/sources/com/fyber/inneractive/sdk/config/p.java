package com.fyber.inneractive.sdk.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class p implements com.fyber.inneractive.sdk.network.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f53411a;

    public p(s sVar) {
        this.f53411a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z2) {
        o oVar = (o) obj;
        if (oVar != null) {
            s sVar = this.f53411a;
            if (oVar.equals(sVar.f53466b)) {
                return;
            }
            sVar.f53468d = true;
            sVar.f53466b = oVar;
            com.fyber.inneractive.sdk.util.r.f57025a.execute(new q(sVar));
        }
    }
}
