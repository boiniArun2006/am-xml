package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f56183d;

    public f(byte[] bArr) {
        m mVar = new m(bArr);
        mVar.b(136);
        mVar.a(16);
        mVar.a(16);
        mVar.a(24);
        mVar.a(24);
        this.f56180a = mVar.a(20);
        this.f56181b = mVar.a(3) + 1;
        this.f56182c = mVar.a(5) + 1;
        this.f56183d = ((((long) mVar.a(4)) & 15) << 32) | (((long) mVar.a(32)) & 4294967295L);
    }
}
