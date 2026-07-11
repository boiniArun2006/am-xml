package com.fyber.inneractive.sdk.player;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f54375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f54376b;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a a() {
        com.fyber.inneractive.sdk.config.t0 t0Var;
        UnitDisplayType unitDisplayType;
        if (this.f54376b == null) {
            Application application = com.fyber.inneractive.sdk.util.o.f57018a;
            t0 t0Var2 = this.f54375a;
            com.fyber.inneractive.sdk.response.g gVar = (com.fyber.inneractive.sdk.response.g) t0Var2.f53978b;
            s0 s0Var = t0Var2.f53980d;
            InneractiveAdRequest inneractiveAdRequest = t0Var2.f53977a;
            if (s0Var != null) {
                IAConfigManager iAConfigManager = IAConfigManager.f53260M;
                Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.m) iAConfigManager.f53273K.a(com.fyber.inneractive.sdk.config.global.features.m.class)).c("enable");
                boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
                IAlog.a("OMSDK AB %s", String.valueOf(zBooleanValue));
                com.fyber.inneractive.sdk.measurement.e eVar = (zBooleanValue && (t0Var = ((r0) this.f54375a.f53980d).f53420f) != null && ((unitDisplayType = t0Var.f53480j) == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED)) ? iAConfigManager.f53271I : null;
                this.f54376b = new n(application, gVar, s0Var, inneractiveAdRequest, t0Var2, eVar);
            }
        }
        return this.f54376b;
    }

    public b(t0 t0Var) {
        this.f54375a = t0Var;
    }
}
