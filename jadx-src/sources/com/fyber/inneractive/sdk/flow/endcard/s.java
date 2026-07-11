package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.q0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class s implements com.fyber.inneractive.sdk.web.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f53653a;

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar) {
        IAlog.a("%s End-Card loaded", this.f53653a.f53584a);
        this.f53653a.f53661h.set(false);
        u uVar = this.f53653a;
        uVar.getClass();
        boolean z2 = iVar != null;
        uVar.f53659f = z2;
        com.fyber.inneractive.sdk.web.m mVar = z2 ? iVar.f57113b : null;
        String str = IAConfigManager.f53260M.f53267E.f53189e;
        if (!uVar.f() || mVar == null || TextUtils.isEmpty(str)) {
            uVar.f53585b.m();
        } else {
            q0.a(mVar, str, uVar);
        }
    }

    public s(u uVar) {
        this.f53653a = uVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.f("%s End-Card failed to load!", this.f53653a.f53584a);
        this.f53653a.f53661h.set(false);
        u uVar = this.f53653a;
        uVar.f53659f = false;
        uVar.f53585b.a(inneractiveInfrastructureError);
    }
}
