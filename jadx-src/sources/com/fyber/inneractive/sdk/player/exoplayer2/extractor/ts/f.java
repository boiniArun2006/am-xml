package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f55503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f55504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f55506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f55507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f55508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f55509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f55510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f55511k;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f55505e = 0;
        this.f55506f = 0;
        this.f55507g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    public f(String str) {
        byte[] bArr = new byte[15];
        this.f55501a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(bArr);
        bArr[0] = ByteCompanionObject.MAX_VALUE;
        bArr[1] = -2;
        bArr[2] = ByteCompanionObject.MIN_VALUE;
        bArr[3] = 1;
        this.f55505e = 0;
        this.f55502b = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f55503c = e0Var.f55500e;
        e0Var.b();
        this.f55504d = jVar.a(e0Var.f55499d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z2, long j2) {
        this.f55511k = j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        char c2;
        while (true) {
            int i2 = nVar.f56208c - nVar.f56207b;
            if (i2 <= 0) {
                return;
            }
            int i3 = this.f55505e;
            if (i3 == 0) {
                while (true) {
                    if (nVar.f56208c - nVar.f56207b > 0) {
                        int i5 = this.f55507g << 8;
                        this.f55507g = i5;
                        int iJ = i5 | nVar.j();
                        this.f55507g = iJ;
                        if (iJ == 2147385345) {
                            this.f55507g = 0;
                            this.f55506f = 4;
                            this.f55505e = 1;
                            break;
                        }
                    }
                }
            } else if (i3 == 1) {
                byte[] bArr = this.f55501a.f56206a;
                int iMin = Math.min(i2, 15 - this.f55506f);
                nVar.a(bArr, this.f55506f, iMin);
                int i7 = this.f55506f + iMin;
                this.f55506f = i7;
                if (i7 == 15) {
                    byte[] bArr2 = this.f55501a.f56206a;
                    if (this.f55509i == null) {
                        String str = this.f55503c;
                        String str2 = this.f55502b;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(bArr2);
                        mVar.c(60);
                        int i8 = com.fyber.inneractive.sdk.player.exoplayer2.audio.t.f54643a[mVar.a(6)];
                        int i9 = com.fyber.inneractive.sdk.player.exoplayer2.audio.t.f54644b[mVar.a(4)];
                        int iA = mVar.a(5);
                        c2 = 5;
                        int i10 = iA >= 29 ? -1 : (com.fyber.inneractive.sdk.player.exoplayer2.audio.t.f54645c[iA] * 1000) / 2;
                        mVar.c(10);
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "audio/vnd.dts", i10, -1, i8 + (mVar.a(2) > 0 ? 1 : 0), i9, null, null, str2);
                        this.f55509i = oVarA;
                        this.f55504d.a(oVarA);
                    } else {
                        c2 = 5;
                    }
                    this.f55510j = (((bArr2[c2] & 2) << 12) | ((bArr2[6] & UByte.MAX_VALUE) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                    this.f55508h = (int) ((((long) (((((bArr2[4] & 1) << 6) | ((r3 & 252) >> 2)) + 1) * 32)) * 1000000) / ((long) this.f55509i.f55871s));
                    this.f55501a.e(0);
                    this.f55504d.a(15, this.f55501a);
                    this.f55505e = 2;
                }
            } else if (i3 == 2) {
                int iMin2 = Math.min(i2, this.f55510j - this.f55506f);
                this.f55504d.a(iMin2, nVar);
                int i11 = this.f55506f + iMin2;
                this.f55506f = i11;
                int i12 = this.f55510j;
                if (i11 == i12) {
                    this.f55504d.a(this.f55511k, 1, i12, 0, null);
                    this.f55511k += this.f55508h;
                    this.f55505e = 0;
                }
            }
        }
    }
}
