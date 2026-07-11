package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f55660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55661b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f55664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f55665f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.f55660a.a(vVar, jVar, e0Var);
        this.f55665f = true;
    }

    public w(v vVar) {
        this.f55660a = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a() {
        this.f55665f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z2) {
        int iJ = z2 ? nVar.f56207b + nVar.j() : -1;
        if (this.f55665f) {
            if (!z2) {
                return;
            }
            this.f55665f = false;
            nVar.e(iJ);
            this.f55663d = 0;
        }
        while (true) {
            int i2 = nVar.f56208c - nVar.f56207b;
            if (i2 <= 0) {
                return;
            }
            int i3 = this.f55663d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iJ2 = nVar.j();
                    nVar.e(nVar.f56207b - 1);
                    if (iJ2 == 255) {
                        this.f55665f = true;
                        return;
                    }
                }
                int iMin = Math.min(nVar.f56208c - nVar.f56207b, 3 - this.f55663d);
                nVar.a(this.f55661b.f56206a, this.f55663d, iMin);
                int i5 = this.f55663d + iMin;
                this.f55663d = i5;
                if (i5 == 3) {
                    this.f55661b.c(3);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f55661b;
                    nVar2.e(nVar2.f56207b + 1);
                    int iJ3 = this.f55661b.j();
                    int iJ4 = this.f55661b.j();
                    this.f55664e = (iJ3 & 128) != 0;
                    this.f55662c = (((iJ3 & 15) << 8) | iJ4) + 3;
                    int iA = this.f55661b.a();
                    int i7 = this.f55662c;
                    if (iA < i7) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f55661b;
                        byte[] bArr = nVar3.f56206a;
                        nVar3.c(Math.min(4098, Math.max(i7, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f55661b.f56206a, 0, 3);
                    }
                }
            } else {
                int iMin2 = Math.min(i2, this.f55662c - i3);
                nVar.a(this.f55661b.f56206a, this.f55663d, iMin2);
                int i8 = this.f55663d + iMin2;
                this.f55663d = i8;
                int i9 = this.f55662c;
                if (i8 != i9) {
                    continue;
                } else {
                    if (this.f55664e) {
                        byte[] bArr2 = this.f55661b.f56206a;
                        int i10 = -1;
                        for (int i11 = 0; i11 < i9; i11++) {
                            i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f56241h[((i10 >>> 24) ^ (bArr2[i11] & UByte.MAX_VALUE)) & 255] ^ (i10 << 8);
                        }
                        int i12 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f56234a;
                        if (i10 != 0) {
                            this.f55665f = true;
                            return;
                        }
                        this.f55661b.c(this.f55662c - 4);
                    } else {
                        this.f55661b.c(i9);
                    }
                    this.f55660a.a(this.f55661b);
                    this.f55663d = 0;
                }
            }
        }
    }
}
