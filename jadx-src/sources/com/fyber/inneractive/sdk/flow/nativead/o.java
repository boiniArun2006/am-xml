package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class o implements com.fyber.inneractive.sdk.click.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f53769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f53770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f53771c;

    public o(p pVar, i iVar, com.fyber.inneractive.sdk.util.g gVar) {
        this.f53771c = pVar;
        this.f53769a = iVar;
        this.f53770b = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.f53213a == com.fyber.inneractive.sdk.click.q.FAILED) {
            p pVar = this.f53771c;
            i iVar = this.f53769a;
            String str = bVar.f53216d;
            com.fyber.inneractive.sdk.util.g gVar = this.f53770b;
            pVar.getClass();
            IAlog.f("%s : Trying to resolve fallback Link: %s", p.f53772b, str);
            j jVar = (j) pVar.f53773a;
            i iVar2 = jVar.f53743a;
            if (iVar2 == null || iVar2.equals(iVar)) {
                IAlog.a("%s : No valid link object, origin: %s", j.f53742d, gVar);
                return;
            }
            p pVar2 = jVar.f53745c;
            i iVar3 = jVar.f53743a;
            pVar2.getClass();
            com.fyber.inneractive.sdk.util.r.f57025a.execute(new m(pVar2, iVar3, true, gVar));
        }
    }
}
