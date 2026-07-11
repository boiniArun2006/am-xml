package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.io.EOFException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class c implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55466e = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("ID3");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55468b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(200);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f55469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f55470d;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);
        com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(nVar.f56206a);
        int i2 = 0;
        while (true) {
            bVar.a(nVar.f56206a, 0, 10, false);
            nVar.e(0);
            if (nVar.l() != f55466e) {
                break;
            }
            nVar.e(nVar.f56207b + 3);
            int i3 = nVar.i();
            i2 += i3 + 10;
            bVar.a(i3, false);
        }
        bVar.f54728e = 0;
        bVar.a(i2, false);
        int i5 = 0;
        int i7 = 0;
        int i8 = i2;
        while (true) {
            bVar.a(nVar.f56206a, 0, 2, false);
            nVar.e(0);
            if ((nVar.o() & 65526) != 65520) {
                bVar.f54728e = 0;
                i8++;
                if (i8 - i2 >= 8192) {
                    return false;
                }
                bVar.a(i8, false);
                i5 = 0;
                i7 = 0;
            } else {
                i5++;
                if (i5 >= 4 && i7 > 188) {
                    return true;
                }
                bVar.a(nVar.f56206a, 0, 4, false);
                mVar.b(14);
                int iA = mVar.a(13);
                if (iA <= 6) {
                    return false;
                }
                bVar.a(iA - 6, false);
                i7 += iA;
            }
        }
    }

    public c(long j2) {
        this.f55467a = j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        d dVar = new d(true, null);
        this.f55469c = dVar;
        dVar.a(jVar, new e0(Integer.MIN_VALUE, 0, 1));
        jVar.b();
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j2, long j3) {
        this.f55470d = false;
        d dVar = this.f55469c;
        dVar.f55481h = 0;
        dVar.f55482i = 0;
        dVar.f55483j = 256;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        int iMin;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2;
        byte[] bArr = this.f55468b.f56206a;
        int i2 = bVar.f54729f;
        if (i2 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i2, 200);
            System.arraycopy(bVar.f54727d, 0, bArr, 0, iMin);
            bVar.b(iMin);
        }
        if (iMin == 0) {
            bVar2 = bVar;
            iMin = bVar2.a(bArr, 0, 200, 0, true);
        } else {
            bVar2 = bVar;
        }
        if (iMin != -1) {
            bVar2.f54726c += (long) iMin;
        }
        if (iMin == -1) {
            return -1;
        }
        this.f55468b.e(0);
        this.f55468b.d(iMin);
        if (!this.f55470d) {
            this.f55469c.f55488o = this.f55467a;
            this.f55470d = true;
        }
        this.f55469c.a(this.f55468b);
        return 0;
    }
}
