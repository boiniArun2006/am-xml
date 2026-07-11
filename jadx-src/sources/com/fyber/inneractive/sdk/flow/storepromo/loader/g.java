package com.fyber.inneractive.sdk.flow.storepromo.loader;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.model.vast.v;
import com.fyber.inneractive.sdk.network.l0;
import com.fyber.inneractive.sdk.network.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f53857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CountDownLatch f53858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.b f53859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.model.c f53860d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f53862f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f53861e = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53863g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f53864h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f53865i = false;

    public final void a(com.fyber.inneractive.sdk.flow.storepromo.events.a aVar, boolean z2, String str, String str2) {
        f fVar;
        this.f53858b.countDown();
        if (this.f53865i) {
            return;
        }
        if (z2) {
            this.f53865i = true;
            this.f53864h = true;
            a();
            if (TextUtils.isEmpty(str)) {
                str = "Something went wrong during promo's resources download";
            }
            com.fyber.inneractive.sdk.flow.storepromo.b bVar = this.f53859c;
            if (bVar != null) {
                if (aVar == null) {
                    aVar = com.fyber.inneractive.sdk.flow.storepromo.events.a.DOWNLOAD_RESOURCE_ERROR;
                }
                bVar.a(aVar.name(), str, str2);
                return;
            }
            return;
        }
        if (this.f53858b.getCount() != 0 || this.f53864h) {
            return;
        }
        this.f53865i = true;
        Collections.sort(this.f53860d.f53899a);
        this.f53861e.clear();
        com.fyber.inneractive.sdk.flow.storepromo.b bVar2 = this.f53859c;
        if (bVar2 != null) {
            com.fyber.inneractive.sdk.flow.storepromo.model.c cVar = this.f53860d;
            IAlog.a("StorePromoManager : onPromoLoadSucceed", new Object[0]);
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar3 = new com.fyber.inneractive.sdk.flow.storepromo.controller.b(cVar, bVar2, bVar2, bVar2, bVar2.f53816b, bVar2.f53817c);
            bVar2.f53818d = bVar3;
            bVar2.f53821g = cVar.f53907i;
            com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar2 = bVar3.f53827c;
            if (cVar2 == null || (fVar = cVar2.f53837d) == null) {
                return;
            }
            r.f57025a.execute(new e(fVar, new d(fVar)));
        }
    }

    public g(v vVar, com.fyber.inneractive.sdk.flow.storepromo.b bVar) {
        this.f53857a = vVar;
        this.f53862f = vVar.f54182f.size();
        this.f53859c = bVar;
        this.f53860d = new com.fyber.inneractive.sdk.flow.storepromo.model.c(vVar);
    }

    public final void a() {
        for (t0 t0Var : this.f53861e) {
            l0 l0Var = IAConfigManager.f53260M.f53292r;
            String str = t0Var.f54321g;
            l0Var.getClass();
            t0Var.c();
        }
        this.f53861e.clear();
    }
}
