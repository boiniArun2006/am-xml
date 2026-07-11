package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.u0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h implements c, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CountDownLatch f53732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f53733b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f53735d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f53734c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f53736e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f53737f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f53738g = b.UNINITIALIZED;

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.f53738g == b.LOADING;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.s
    public final void a(g gVar, Exception exc, com.fyber.inneractive.sdk.response.nativead.f fVar) throws Throwable {
        if (gVar != null) {
            this.f53737f.add(gVar);
        } else {
            this.f53736e.add(fVar);
        }
        CountDownLatch countDownLatch = this.f53732a;
        if (countDownLatch == null) {
            return;
        }
        countDownLatch.countDown();
        if (this.f53732a.getCount() == 0) {
            this.f53738g = b.LOADED;
            c();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() throws Throwable {
        com.fyber.inneractive.sdk.response.nativead.c cVar;
        String str;
        if (this.f53735d.isEmpty()) {
            this.f53738g = b.FAILED;
            c();
            return;
        }
        Iterator it = this.f53735d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.fyber.inneractive.sdk.response.nativead.f fVar = (com.fyber.inneractive.sdk.response.nativead.f) it.next();
            if (fVar == null || (cVar = fVar.f56893d) == null || (str = cVar.f56887a) == null || str.trim().isEmpty()) {
                IAlog.f("%sImage asset not downloadable. imageAssetId: %s, imageObject: %s", IAlog.a(this), Integer.valueOf(fVar.f56890a), fVar.f56893d);
                this.f53736e.add(fVar);
            } else {
                ArrayList arrayList = this.f53734c;
                if (arrayList != null) {
                    arrayList.add(new u0(new t(fVar, this), IAConfigManager.f53260M.f53295u.f53389a, new com.fyber.inneractive.sdk.cache.d(fVar.f56893d.f56887a)));
                }
            }
        }
        ArrayList arrayList2 = this.f53734c;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.f53738g = b.FAILED;
            c();
            return;
        }
        this.f53738g = b.LOADING;
        this.f53732a = new CountDownLatch(this.f53734c.size());
        Iterator it2 = this.f53734c.iterator();
        while (it2.hasNext()) {
            IAConfigManager.f53260M.f53292r.a((u0) it2.next());
        }
    }

    public final void c() throws Throwable {
        e eVar = this.f53733b;
        if (eVar != null) {
            ArrayList arrayList = this.f53737f;
            ArrayList<com.fyber.inneractive.sdk.response.nativead.f> arrayList2 = this.f53736e;
            if (!arrayList.isEmpty()) {
                eVar.f53715a.f53721d.addAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                for (com.fyber.inneractive.sdk.response.nativead.f fVar : arrayList2) {
                    IAlog.f("%sFailed to load image asset. id: %s, imageObj: %s", f.f53716m, Integer.valueOf(fVar.f56890a), fVar.f56893d);
                }
            }
            eVar.f53715a.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        ArrayList arrayList = this.f53734c;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.f53734c.iterator();
            while (it.hasNext()) {
                ((u0) it.next()).f54315a = true;
            }
            this.f53734c.clear();
        }
        this.f53734c = null;
        this.f53738g = b.DESTROYED;
    }

    public h(ArrayList arrayList, e eVar) {
        this.f53735d = arrayList;
        this.f53733b = eVar;
    }
}
