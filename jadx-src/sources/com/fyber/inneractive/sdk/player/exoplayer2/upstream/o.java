package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class o implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f56131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f56132c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final h a() {
        return new n(this.f56130a, this.f56131b, this.f56132c.a());
    }

    public o(Context context, m mVar, q qVar) {
        this.f56130a = context.getApplicationContext();
        this.f56131b = mVar;
        this.f56132c = qVar;
    }
}
