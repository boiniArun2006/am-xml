package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e0 implements com.fyber.inneractive.sdk.network.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f53329a;

    public e0(IAConfigManager iAConfigManager) {
        this.f53329a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z2) {
        com.fyber.inneractive.sdk.config.global.l lVar = (com.fyber.inneractive.sdk.config.global.l) obj;
        if (lVar != null) {
            IAlog.a("calling mergeRemoteFeaturesConfig fromCache: %b", Boolean.valueOf(z2));
            IAConfigManager iAConfigManager = this.f53329a;
            iAConfigManager.f53299y.f53346a = lVar;
            if (!z2) {
                iAConfigManager.f53273K.a(true, "");
                IAConfigManager.f53260M.f53266D.a(iAConfigManager.f53273K);
            }
            IAConfigManager iAConfigManager2 = this.f53329a;
            iAConfigManager2.f53270H.f56922f = iAConfigManager2.f53273K;
            return;
        }
        if (exc != null) {
            if (exc instanceof com.fyber.inneractive.sdk.network.g) {
                IAlog.a("remote features config not modified", new Object[0]);
                IAConfigManager iAConfigManager3 = this.f53329a;
                iAConfigManager3.f53273K.a(true, "");
                IAConfigManager.f53260M.f53266D.a(iAConfigManager3.f53273K);
                return;
            }
            IAlog.a("Config manager: Error getting or parsing remote config. Resetting configurable features", new Object[0]);
            IAConfigManager iAConfigManager4 = this.f53329a;
            IAConfigManager iAConfigManager5 = IAConfigManager.f53260M;
            iAConfigManager4.getClass();
            new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.t.FATAL_FEATURES_CONFIG_ERROR).a("exception", exc.getClass().getName(), "message", exc.getLocalizedMessage()).a((String) null);
        }
    }
}
