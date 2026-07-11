package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class x extends com.fyber.inneractive.sdk.player.exoplayer2.x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f55979g = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f55982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f55983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f55984f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int a() {
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int b() {
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final com.fyber.inneractive.sdk.player.exoplayer2.w a(int i2, com.fyber.inneractive.sdk.player.exoplayer2.w wVar, long j2) {
        if (i2 < 0 || i2 >= 1) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = this.f55983e;
        boolean z2 = this.f55984f;
        if (z2) {
            j3 += j2;
            if (j3 > this.f55981c) {
                j3 = -9223372036854775807L;
            }
        }
        long j4 = this.f55981c;
        long j5 = this.f55982d;
        wVar.f56313a = null;
        wVar.f56314b = z2;
        wVar.f56317e = j3;
        wVar.f56318f = j4;
        wVar.f56315c = 0;
        wVar.f56316d = 0;
        wVar.f56319g = j5;
        return wVar;
    }

    public x(long j2, long j3, long j4, long j5, boolean z2, boolean z3) {
        this.f55980b = j2;
        this.f55981c = j3;
        this.f55982d = j4;
        this.f55983e = j5;
        this.f55984f = z3;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final com.fyber.inneractive.sdk.player.exoplayer2.v a(int i2, com.fyber.inneractive.sdk.player.exoplayer2.v vVar, boolean z2) {
        if (i2 >= 0 && i2 < 1) {
            Object obj = z2 ? f55979g : null;
            long j2 = this.f55980b;
            long j3 = -this.f55982d;
            vVar.f56242a = obj;
            vVar.f56243b = obj;
            vVar.f56244c = 0;
            vVar.f56245d = j2;
            vVar.f56246e = j3;
            return vVar;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int a(Object obj) {
        return f55979g.equals(obj) ? 0 : -1;
    }
}
