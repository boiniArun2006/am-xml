package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.flow.x0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class v extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.model.vast.k f53663h;

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final n c() {
        return new w(this);
    }

    public v(x0 x0Var, com.fyber.inneractive.sdk.model.vast.c cVar, int i2) {
        super(x0Var, cVar, i2);
        this.f53663h = cVar.f54120b;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.c, com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean l() {
        if (super.l() && ((w) f()).f53664c != null) {
            return true;
        }
        return false;
    }
}
