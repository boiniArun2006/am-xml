package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class p extends u {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f53646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f53647k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f53648l;

    @Override // com.fyber.inneractive.sdk.flow.endcard.u
    public final boolean f() {
        return false;
    }

    public final void b(com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        if (TextUtils.isEmpty(this.f53658e) || TextUtils.isEmpty(this.f53647k)) {
            return;
        }
        if (this.f53659f || !this.f53661h.compareAndSet(false, true)) {
            IAlog.a("%sisWebLoaded: %s, mFmpEndCardPrepareInProgress: %s", this.f53584a, Boolean.valueOf(this.f53659f), Boolean.valueOf(this.f53661h.get()));
        } else {
            a(aVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.u
    public final q d() {
        b bVar = this.f53585b;
        return new q(bVar.f53588c.f53987e, (o) bVar);
    }

    public p(o oVar) {
        String str;
        super(oVar);
        com.fyber.inneractive.sdk.model.vast.o oVar2 = oVar.f53588c.f53987e.f54108f;
        if (oVar2 != null) {
            str = oVar2.f54159a;
        } else {
            str = null;
        }
        this.f53646j = str;
    }
}
