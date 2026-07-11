package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f55383h = z.a("OggS");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f55385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f55389f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55390g = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(255);

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z2) throws com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f55390g;
        nVar.f56207b = 0;
        nVar.f56208c = 0;
        this.f55384a = 0;
        this.f55385b = 0L;
        this.f55386c = 0;
        this.f55387d = 0;
        this.f55388e = 0;
        long j2 = bVar.f54725b;
        if ((j2 != -1 && j2 - (bVar.f54726c + ((long) bVar.f54728e)) < 27) || !bVar.a(nVar.f56206a, 0, 27, true)) {
            if (z2) {
                return false;
            }
            throw new EOFException();
        }
        if (this.f55390g.k() != f55383h) {
            if (z2) {
                return false;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("expected OggS capture pattern at begin of page");
        }
        if (this.f55390g.j() != 0) {
            if (z2) {
                return false;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("unsupported bit stream revision");
        }
        this.f55384a = this.f55390g.j();
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f55390g;
        byte[] bArr = nVar2.f56206a;
        int i2 = nVar2.f56207b;
        int i3 = i2 + 1;
        nVar2.f56207b = i3;
        long j3 = ((long) bArr[i2]) & 255;
        int i5 = i2 + 2;
        nVar2.f56207b = i5;
        long j4 = j3 | ((((long) bArr[i3]) & 255) << 8);
        int i7 = i2 + 3;
        nVar2.f56207b = i7;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 16);
        int i8 = i2 + 4;
        nVar2.f56207b = i8;
        long j6 = j5 | ((((long) bArr[i7]) & 255) << 24);
        int i9 = i2 + 5;
        nVar2.f56207b = i9;
        long j7 = j6 | ((((long) bArr[i8]) & 255) << 32);
        int i10 = i2 + 6;
        nVar2.f56207b = i10;
        long j9 = j7 | ((((long) bArr[i9]) & 255) << 40);
        int i11 = i2 + 7;
        nVar2.f56207b = i11;
        long j10 = j9 | ((((long) bArr[i10]) & 255) << 48);
        nVar2.f56207b = i2 + 8;
        this.f55385b = j10 | ((255 & ((long) bArr[i11])) << 56);
        nVar2.e();
        this.f55390g.e();
        this.f55390g.e();
        int iJ = this.f55390g.j();
        this.f55386c = iJ;
        this.f55387d = iJ + 27;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f55390g;
        nVar3.f56207b = 0;
        nVar3.f56208c = 0;
        bVar.a(nVar3.f56206a, 0, iJ, false);
        for (int i12 = 0; i12 < this.f55386c; i12++) {
            this.f55389f[i12] = this.f55390g.j();
            this.f55388e += this.f55389f[i12];
        }
        return true;
    }
}
