package com.fyber.inneractive.sdk.flow.storepromo.loader.network;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.c1;
import com.fyber.inneractive.sdk.network.l;
import com.fyber.inneractive.sdk.network.o0;
import com.fyber.inneractive.sdk.network.t0;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a extends c1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f53886q;

    public a(String str, com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks.b bVar) {
        super(bVar, str, null);
    }

    @Override // com.fyber.inneractive.sdk.network.c1, com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i2) throws com.fyber.inneractive.sdk.flow.storepromo.loader.network.exception.a {
        int iA;
        int iA2 = IAConfigManager.f53260M.f53294t.f53466b.a("sp_max_size", 307200, 0);
        this.f53886q = iA2;
        int i3 = iA2 + 10;
        if (lVar != null && (iA = t0.a(lVar.f54273d)) >= 0) {
            i3 = iA;
        }
        long j2 = i3;
        int i5 = this.f53886q;
        if (j2 <= i5) {
            return super.a(lVar, map, i2);
        }
        throw new com.fyber.inneractive.sdk.flow.storepromo.loader.network.exception.a("The image exceeds the maximal size: " + i5 + ", actual size: " + i3);
    }
}
