package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.t;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f56009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f56010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f56011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t[] f56012d;

    public final boolean a(j jVar, int i2) {
        return jVar != null && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f56010b.f56007b[i2], jVar.f56010b.f56007b[i2]) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f56012d[i2], jVar.f56012d[i2]);
    }

    public j(z zVar, h hVar, f fVar, t[] tVarArr) {
        this.f56009a = zVar;
        this.f56010b = hVar;
        this.f56011c = fVar;
        this.f56012d = tVarArr;
    }
}
