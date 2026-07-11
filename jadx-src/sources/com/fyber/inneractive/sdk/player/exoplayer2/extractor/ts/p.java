package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class p implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55611a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f55612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f55613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f55614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f55616f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f55613c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f55499d, 4);
        this.f55612b = gVarA;
        e0Var.b();
        gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.f55500e, "application/id3", (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
        int i2;
        if (this.f55613c && (i2 = this.f55615e) != 0 && this.f55616f == i2) {
            this.f55612b.a(this.f55614d, 1, i2, 0, null);
            this.f55613c = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z2, long j2) {
        if (z2) {
            this.f55613c = true;
            this.f55614d = j2;
            this.f55615e = 0;
            this.f55616f = 0;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (this.f55613c) {
            int i2 = nVar.f56208c - nVar.f56207b;
            int i3 = this.f55616f;
            if (i3 < 10) {
                int iMin = Math.min(i2, 10 - i3);
                System.arraycopy(nVar.f56206a, nVar.f56207b, this.f55611a.f56206a, this.f55616f, iMin);
                if (this.f55616f + iMin == 10) {
                    this.f55611a.e(0);
                    if (73 == this.f55611a.j() && 68 == this.f55611a.j() && 51 == this.f55611a.j()) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f55611a;
                        nVar2.e(nVar2.f56207b + 3);
                        this.f55615e = this.f55611a.i() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f55613c = false;
                        return;
                    }
                }
            }
            int iMin2 = Math.min(i2, this.f55615e - this.f55616f);
            this.f55612b.a(iMin2, nVar);
            this.f55616f += iMin2;
        }
    }
}
