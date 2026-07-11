package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.io.EOFException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55430e = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("ID3");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55432b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f55433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f55434d;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        int iA;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);
        int i2 = 0;
        while (true) {
            bVar.a(nVar.f56206a, 0, 10, false);
            nVar.e(0);
            if (nVar.l() != f55430e) {
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
        int i7 = i2;
        while (true) {
            bVar.a(nVar.f56206a, 0, 5, false);
            nVar.e(0);
            if (nVar.o() != 2935) {
                bVar.f54728e = 0;
                i7++;
                if (i7 - i2 >= 8192) {
                    return false;
                }
                bVar.a(i7, false);
                i5 = 0;
            } else {
                i5++;
                if (i5 >= 4) {
                    return true;
                }
                byte[] bArr = nVar.f56206a;
                if (bArr.length < 5) {
                    iA = -1;
                } else {
                    byte b2 = bArr[4];
                    iA = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.a((b2 & 192) >> 6, b2 & 63);
                }
                if (iA == -1) {
                    return false;
                }
                bVar.a(iA - 5, false);
            }
        }
    }

    public a(long j2) {
        this.f55431a = j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        b bVar = new b(null);
        this.f55433c = bVar;
        bVar.f55443d = "0";
        bVar.f55444e = jVar.a(0, 1);
        jVar.b();
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j2, long j3) {
        this.f55434d = false;
        this.f55433c.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        int iMin;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2;
        byte[] bArr = this.f55432b.f56206a;
        int i2 = bVar.f54729f;
        if (i2 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i2, 2786);
            System.arraycopy(bVar.f54727d, 0, bArr, 0, iMin);
            bVar.b(iMin);
        }
        if (iMin == 0) {
            bVar2 = bVar;
            iMin = bVar2.a(bArr, 0, 2786, 0, true);
        } else {
            bVar2 = bVar;
        }
        if (iMin != -1) {
            bVar2.f54726c += (long) iMin;
        }
        if (iMin == -1) {
            return -1;
        }
        this.f55432b.e(0);
        this.f55432b.d(iMin);
        if (!this.f55434d) {
            this.f55433c.f55451l = this.f55431a;
            this.f55434d = true;
        }
        this.f55433c.a(this.f55432b);
        return 0;
    }
}
