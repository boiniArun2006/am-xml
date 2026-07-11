package com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks;

import com.fyber.inneractive.sdk.flow.storepromo.loader.g;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class c implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f53893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f53894b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f53895c;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    @Override // com.fyber.inneractive.sdk.network.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Exception exc, boolean z2) {
        boolean z3;
        String str = (String) obj;
        if (this.f53894b) {
            IAlog.a("StorePromoTemplateCallback: onNetworkResult: the cached response was applied and this one being cached", new Object[0]);
            return;
        }
        IAlog.a("StorePromoTemplateCallback: onNetworkResult: fromCache: " + z2, new Object[0]);
        this.f53894b = true;
        if (str != null && exc == null) {
            g gVar = this.f53893a;
            gVar.getClass();
            IAlog.a("StorePromoResourcesLoader: onTemplateDownloaded", new Object[0]);
            gVar.f53860d.f53901c = str;
            gVar.a(null, false, null, null);
            return;
        }
        String str2 = "Unable download store promo template, error: " + (exc != null ? exc.getMessage() != null ? exc.getMessage() : exc.toString() : "");
        g gVar2 = this.f53893a;
        com.fyber.inneractive.sdk.flow.storepromo.events.a aVar = com.fyber.inneractive.sdk.flow.storepromo.events.a.DOWNLOAD_RESOURCE_ERROR;
        String str3 = this.f53895c;
        if (com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.TEMPLATE_FAILURE == com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.SCREENSHOT_FAILURE) {
            int i2 = gVar2.f53862f;
            int i3 = gVar2.f53863g + 1;
            gVar2.f53863g = i3;
            z3 = i2 - i3 < 2;
        }
        gVar2.a(aVar, z3, str2, str3);
    }

    public c(g gVar, String str) {
        this.f53893a = gVar;
        this.f53895c = str;
    }
}
