package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n implements com.fyber.inneractive.sdk.click.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f53765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f53766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f53767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f53768d;

    public n(p pVar, i iVar, String str, com.fyber.inneractive.sdk.util.g gVar) {
        this.f53768d = pVar;
        this.f53765a = iVar;
        this.f53766b = str;
        this.f53767c = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.f53213a == com.fyber.inneractive.sdk.click.q.FAILED) {
            p pVar = this.f53768d;
            i iVar = this.f53765a;
            String str = this.f53766b;
            com.fyber.inneractive.sdk.util.g gVar = this.f53767c;
            pVar.getClass();
            IAlog.f("%s : Trying to resolve fallback Link: %s", p.f53772b, str);
            if (v.a(str)) {
                o oVar = new o(pVar, iVar, gVar);
                k kVar = ((j) pVar.f53773a).f53744b;
                if (kVar != null) {
                    kVar.a(str, true, gVar, oVar);
                    return;
                }
                return;
            }
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
