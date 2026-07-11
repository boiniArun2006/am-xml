package com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks;

import com.fyber.inneractive.sdk.flow.storepromo.loader.g;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f53889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.model.b f53890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f53891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f53892d;

    public b(com.fyber.inneractive.sdk.flow.storepromo.model.b bVar, String str, g gVar) {
        this.f53890b = bVar;
        this.f53891c = str;
        this.f53889a = gVar;
        this.f53892d = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    @Override // com.fyber.inneractive.sdk.network.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Exception exc, boolean z2) {
        boolean z3;
        String str = (String) obj;
        if (str != null && exc == null) {
            g gVar = this.f53889a;
            com.fyber.inneractive.sdk.flow.storepromo.model.b bVar = this.f53890b;
            int i2 = this.f53892d;
            gVar.getClass();
            IAlog.a("StorePromoResourcesLoader: onAssetDownloaded: type: %s, sortIndex: %s", bVar, Integer.valueOf(i2));
            com.fyber.inneractive.sdk.flow.storepromo.model.c cVar = gVar.f53860d;
            cVar.f53899a.add(new com.fyber.inneractive.sdk.flow.storepromo.model.a(str, bVar, i2));
            if (bVar == com.fyber.inneractive.sdk.flow.storepromo.model.b.SCREENSHOT) {
                cVar.f53907i++;
            }
            gVar.a(null, false, null, null);
            return;
        }
        com.fyber.inneractive.sdk.flow.storepromo.events.a aVar = exc instanceof com.fyber.inneractive.sdk.flow.storepromo.loader.network.exception.a ? com.fyber.inneractive.sdk.flow.storepromo.events.a.FILE_SIZE_EXCEEDS_LIMIT : com.fyber.inneractive.sdk.flow.storepromo.events.a.DOWNLOAD_RESOURCE_ERROR;
        String str2 = "Unable download store promo asset type: " + this.f53890b + ", error: " + (exc != null ? exc.getMessage() != null ? exc.getMessage() : exc.toString() : "");
        g gVar2 = this.f53889a;
        String str3 = this.f53891c;
        int i3 = a.f53888a[this.f53890b.ordinal()];
        if ((i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.UNKNOWN_FAILURE : com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.RATING_ICON_FAILURE : com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.VIDEO_FAILURE : com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.SCREENSHOT_FAILURE : com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.APP_ICON_FAILURE) == com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.SCREENSHOT_FAILURE) {
            int i5 = gVar2.f53862f;
            int i7 = gVar2.f53863g + 1;
            gVar2.f53863g = i7;
            z3 = i5 - i7 < 2;
        }
        gVar2.a(aVar, z3, str2, str3);
    }

    public b(com.fyber.inneractive.sdk.flow.storepromo.model.b bVar, String str, g gVar, int i2) {
        this.f53890b = bVar;
        this.f53891c = str;
        this.f53889a = gVar;
        this.f53892d = i2;
    }
}
