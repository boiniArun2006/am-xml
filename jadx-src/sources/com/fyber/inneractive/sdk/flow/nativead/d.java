package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d extends com.fyber.inneractive.sdk.flow.k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f53713m = "Native";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f53714n;

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        x xVar = this.f53695c;
        if (xVar != null) {
            ((w0) xVar).destroy();
        }
        f fVar = this.f53714n;
        if (fVar != null) {
            fVar.f53721d.clear();
            fVar.f53723f = null;
            Iterator it = fVar.f53718a.iterator();
            while (it.hasNext()) {
                ((c) it.next()).destroy();
            }
            fVar.f53718a.clear();
            this.f53714n = null;
        }
        this.f53703k.a();
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(this.f53704l);
        this.f53693a = null;
        this.f53694b = null;
        this.f53695c = null;
        this.f53696d = null;
        this.f53697e = null;
        this.f53698f = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final String e() {
        return "send_failed_native_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void g() {
        com.fyber.inneractive.sdk.response.e eVar = this.f53694b;
        if (eVar == null || ((com.fyber.inneractive.sdk.response.nativead.j) eVar).f56908Q.f56909K == null) {
            return;
        }
        com.fyber.inneractive.sdk.config.global.r rVar = this.f53699g;
        InneractiveAdRequest inneractiveAdRequest = this.f53693a;
        com.fyber.inneractive.sdk.response.nativead.j jVar = (com.fyber.inneractive.sdk.response.nativead.j) this.f53694b;
        f fVar = new f(rVar, inneractiveAdRequest, jVar, jVar.f56908Q.f56909K, this, this.f53713m);
        this.f53714n = fVar;
        com.fyber.inneractive.sdk.flow.nativead.mainasset.d dVarA = com.fyber.inneractive.sdk.flow.nativead.mainasset.e.a(fVar.f53726i, fVar.f53728k, fVar.f53725h, fVar.f53720c, fVar.f53727j, fVar);
        if (dVarA == null) {
            if (fVar.f53724g.compareAndSet(false, true)) {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT);
                inneractiveInfrastructureError.setCause(new com.fyber.inneractive.sdk.flow.nativead.mainasset.a("Could not start loading main media"));
                d dVar = fVar.f53723f;
                dVar.getClass();
                com.fyber.inneractive.sdk.util.r.f57025a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(dVar.f53694b, dVar.f53693a, "send_failed_native_creatives", dVar.f53699g.b()), inneractiveInfrastructureError));
                dVar.b(inneractiveInfrastructureError);
                return;
            }
            return;
        }
        fVar.f53718a.add(dVarA);
        CopyOnWriteArrayList copyOnWriteArrayList = fVar.f53718a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = fVar.f53720c.f56903a;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            for (com.fyber.inneractive.sdk.response.nativead.f fVar2 : fVar.f53720c.f56903a) {
                if (fVar2 != null && fVar2.f56890a != 2 && fVar2.f56893d != null) {
                    arrayList.add(fVar2);
                }
            }
        }
        copyOnWriteArrayList.add(new h(arrayList, fVar.f53729l));
        Iterator it = fVar.f53718a.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b();
        }
    }
}
