package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import com.fyber.inneractive.sdk.web.j1;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w extends f {
    @Override // com.fyber.inneractive.sdk.mraid.f
    public final boolean b() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        boolean zEquals = "true".equals(this.f54205b.get("shouldUseCustomClose"));
        if (InneractiveAdManager.isCurrentUserAChild()) {
            zEquals = false;
        }
        i0 i0Var = this.f54206c;
        i0Var.f57142X = zEquals;
        j1 j1Var = i0Var.f57118g;
        if (j1Var != null) {
            ((com.fyber.inneractive.sdk.web.b0) j1Var).b(zEquals);
        }
    }

    public w(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }
}
