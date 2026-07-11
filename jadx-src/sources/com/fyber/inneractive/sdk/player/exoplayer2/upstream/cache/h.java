package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.TreeSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet f56058c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f56059d;

    public final m a(long j2) {
        m mVar = new m(this.f56057b, j2, -1L, -9223372036854775807L, null);
        m mVar2 = (m) this.f56058c.floor(mVar);
        if (mVar2 != null && mVar2.f56051b + mVar2.f56052c > j2) {
            return mVar2;
        }
        m mVar3 = (m) this.f56058c.ceiling(mVar);
        return mVar3 == null ? new m(this.f56057b, j2, -1L, -9223372036854775807L, null) : new m(this.f56057b, j2, mVar3.f56051b - j2, -9223372036854775807L, null);
    }

    public h(int i2, String str, long j2) {
        this.f56056a = i2;
        this.f56057b = str;
        this.f56059d = j2;
    }
}
