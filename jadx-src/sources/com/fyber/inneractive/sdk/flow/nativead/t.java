package com.fyber.inneractive.sdk.flow.nativead;

import android.net.Uri;
import com.fyber.inneractive.sdk.network.f0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class t implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.f f53779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f53780b;

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z2) {
        Uri uri = (Uri) obj;
        if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            return;
        }
        if (exc != null || uri == null) {
            this.f53780b.a(null, exc, this.f53779a);
            return;
        }
        s sVar = this.f53780b;
        com.fyber.inneractive.sdk.response.nativead.f fVar = this.f53779a;
        sVar.a(new g(fVar.f56890a, uri), null, fVar);
    }

    public t(com.fyber.inneractive.sdk.response.nativead.f fVar, s sVar) {
        this.f53779a = fVar;
        this.f53780b = sVar;
    }
}
