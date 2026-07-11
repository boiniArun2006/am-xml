package com.fyber.inneractive.sdk.flow.storepromo;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.storepromo.loader.f;
import com.fyber.inneractive.sdk.flow.storepromo.loader.g;
import com.fyber.inneractive.sdk.flow.storepromo.ui.c;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.v;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class b implements com.fyber.inneractive.sdk.flow.storepromo.loader.b, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f53814k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f53815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f53816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InneractiveAdRequest f53817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.b f53818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.loader.b f53819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f53820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53821g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f53822h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f53823i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f53824j = new a();

    public final void a() {
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar = this.f53818d;
        if (bVar != null) {
            c cVar = bVar.f53828d;
            if (cVar != null) {
                if (cVar.f53916b != null && cVar.f53915a != null) {
                    cVar.f53918d.setAnimationListener(cVar.f53923i);
                    cVar.f53915a.setAnimation(cVar.f53918d);
                    cVar.f53915a.setVisibility(8);
                }
                View view = cVar.f53915a;
                if (view != null) {
                    view.setAnimation(null);
                    v.a(cVar.f53915a);
                }
                ViewGroup viewGroup = cVar.f53916b;
                if (viewGroup != null) {
                    viewGroup.removeAllViewsInLayout();
                    v.a(cVar.f53916b);
                }
                cVar.f53915a = null;
                cVar.f53916b = null;
                com.fyber.inneractive.sdk.flow.storepromo.ui.b bVar2 = cVar.f53919e;
                if (bVar2 != null) {
                    try {
                        o.f57018a.unregisterReceiver(bVar2);
                    } catch (Exception unused) {
                    }
                    cVar.f53919e.f53914a.clear();
                    cVar.f53919e = null;
                }
                cVar.f53920f = null;
                bVar.f53828d = null;
            }
            com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar2 = bVar.f53827c;
            if (cVar2 != null) {
                f fVar = cVar2.f53837d;
                if (fVar != null) {
                    com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = fVar.f53851a;
                    if (aVar != null) {
                        v.a(aVar);
                        fVar.f53851a.destroy();
                        fVar.f53851a = null;
                    }
                    fVar.f53855e = null;
                    fVar.f53854d = null;
                    fVar.f53853c = null;
                    fVar.f53856f = null;
                    fVar.f53852b = null;
                }
                com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar2 = cVar2.f53835b;
                if (aVar2 != null) {
                    v.a(aVar2);
                    cVar2.f53835b.destroy();
                    cVar2.f53835b = null;
                }
                cVar2.f53839f = null;
                cVar2.f53840g = null;
                cVar2.f53836c = null;
                cVar2.f53837d = null;
                bVar.f53827c = null;
            }
            bVar.f53833i = null;
            bVar.f53829e = null;
            bVar.f53830f = null;
            bVar.f53832h = null;
            this.f53818d = null;
        }
    }

    public b(com.fyber.inneractive.sdk.model.vast.v vVar, e eVar, InneractiveAdRequest inneractiveAdRequest) {
        this.f53815a = new g(vVar, this);
        this.f53820f = vVar.f54179c;
        this.f53816b = eVar;
        this.f53817c = inneractiveAdRequest;
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.b
    public final void a(g1 g1Var) {
        c cVar;
        View view;
        this.f53823i = true;
        com.fyber.inneractive.sdk.flow.storepromo.loader.b bVar = this.f53819e;
        if (bVar != null) {
            bVar.a(g1Var);
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2 = this.f53818d;
        com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar3 = new com.fyber.inneractive.sdk.flow.storepromo.observer.b((bVar2 == null || (cVar = bVar2.f53828d) == null || cVar.f53916b == null || (view = cVar.f53915a) == null || view.getParent() == null || cVar.f53916b.getVisibility() != 0) ? false : true, this.f53823i);
        Iterator it = this.f53822h.iterator();
        while (it.hasNext()) {
            ((com.fyber.inneractive.sdk.flow.storepromo.observer.a) it.next()).a(bVar3);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, String str2) {
        a(bVar.name(), str, str2);
    }

    public final void a(String str, String str2, String str3) {
        IAlog.b("StorePromoManager: reportStorePromoError: %s, msg: %s", str, str2);
        if (this.f53824j != null) {
            InneractiveAdRequest inneractiveAdRequest = this.f53817c;
            e eVar = this.f53816b;
            HashMap map = new HashMap(1);
            if (!TextUtils.isEmpty(str2)) {
                map.put(MRAIDPresenter.ERROR, str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                map.put("failedURL", str3);
            }
            com.fyber.inneractive.sdk.network.events.a.a(t.ERROR_STORE_PROMO_FAILURE, str, (String) null, inneractiveAdRequest, eVar, map, (Boolean) null);
            this.f53824j = null;
        }
    }
}
