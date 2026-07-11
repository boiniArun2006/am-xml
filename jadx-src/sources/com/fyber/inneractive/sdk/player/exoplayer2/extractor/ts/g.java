package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[] f55513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f55514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f55517f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f55514c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        for (int i2 = 0; i2 < this.f55513b.length; i2++) {
            c0 c0Var = (c0) this.f55512a.get(i2);
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f55499d, 3);
            e0Var.b();
            gVarA.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(e0Var.f55500e, null, "application/dvbsubs", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, c0Var.f55471a, -1, Long.MAX_VALUE, Collections.singletonList(c0Var.f55472b), null, null));
            this.f55513b[i2] = gVarA;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
        if (this.f55514c) {
            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar : this.f55513b) {
                rVar.a(this.f55517f, 1, this.f55516e, 0, null);
            }
            this.f55514c = false;
        }
    }

    public g(List list) {
        this.f55512a = list;
        this.f55513b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[list.size()];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z2, long j2) {
        if (z2) {
            this.f55514c = true;
            this.f55517f = j2;
            this.f55516e = 0;
            this.f55515d = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        boolean z2;
        boolean z3;
        if (this.f55514c) {
            if (this.f55515d == 2) {
                if (nVar.f56208c - nVar.f56207b == 0) {
                    z3 = false;
                } else {
                    if (nVar.j() != 32) {
                        this.f55514c = false;
                    }
                    this.f55515d--;
                    z3 = this.f55514c;
                }
                if (!z3) {
                    return;
                }
            }
            if (this.f55515d == 1) {
                if (nVar.f56208c - nVar.f56207b == 0) {
                    z2 = false;
                } else {
                    if (nVar.j() != 0) {
                        this.f55514c = false;
                    }
                    this.f55515d--;
                    z2 = this.f55514c;
                }
                if (!z2) {
                    return;
                }
            }
            int i2 = nVar.f56207b;
            int i3 = nVar.f56208c - i2;
            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar : this.f55513b) {
                nVar.e(i2);
                rVar.a(i3, nVar);
            }
            this.f55516e += i3;
        }
    }
}
