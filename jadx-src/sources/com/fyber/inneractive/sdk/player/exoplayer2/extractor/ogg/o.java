package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class o extends l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n f55417n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f55418o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f55419p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r f55420q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p f55421r;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(boolean z2) {
        super.a(z2);
        if (z2) {
            this.f55417n = null;
            this.f55420q = null;
            this.f55421r = null;
        }
        this.f55418o = 0;
        this.f55419p = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i2;
        byte b2 = nVar.f56206a[0];
        if ((b2 & 1) == 1) {
            return -1L;
        }
        n nVar2 = this.f55417n;
        if (!nVar2.f55415c[(b2 >> 1) & (255 >>> (8 - nVar2.f55416d))].f55422a) {
            i2 = nVar2.f55413a.f55426d;
        } else {
            i2 = nVar2.f55413a.f55427e;
        }
        long j2 = this.f55419p ? (this.f55418o + i2) / 4 : 0;
        nVar.d(nVar.f56208c + 4);
        byte[] bArr = nVar.f56206a;
        int i3 = nVar.f56208c;
        bArr[i3 - 4] = (byte) (j2 & 255);
        bArr[i3 - 3] = (byte) ((j2 >>> 8) & 255);
        bArr[i3 - 2] = (byte) ((j2 >>> 16) & 255);
        bArr[i3 - 1] = (byte) ((j2 >>> 24) & 255);
        this.f55419p = true;
        this.f55418o = i2;
        return j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j2, j jVar) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        int i2;
        int i3;
        long jFloor;
        int i5;
        if (this.f55417n != null) {
            return false;
        }
        n nVar2 = null;
        int i7 = 1;
        if (this.f55420q == null) {
            this.f55420q = s.a(nVar);
        } else if (this.f55421r == null) {
            s.a(3, nVar, false);
            nVar.b((int) nVar.e());
            long jE = nVar.e();
            String[] strArr = new String[(int) jE];
            for (int i8 = 0; i8 < jE; i8++) {
                strArr[i8] = nVar.b((int) nVar.e());
            }
            if ((nVar.j() & 1) != 0) {
                this.f55421r = new p();
            } else {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("framing bit expected to be set");
            }
        } else {
            int i9 = nVar.f56208c;
            byte[] bArr = new byte[i9];
            System.arraycopy(nVar.f56206a, 0, bArr, 0, i9);
            int i10 = this.f55420q.f55423a;
            int i11 = 5;
            s.a(5, nVar, false);
            int iJ = nVar.j() + 1;
            m mVar = new m(nVar.f56206a);
            int i12 = 8;
            mVar.b(nVar.f56207b * 8);
            int i13 = 0;
            while (true) {
                int i14 = 4;
                int i15 = 16;
                if (i13 < iJ) {
                    if (mVar.a(24) == 5653314) {
                        int iA = mVar.a(16);
                        int iA2 = mVar.a(24);
                        long[] jArr = new long[iA2];
                        long j3 = 0;
                        if (!mVar.a()) {
                            boolean zA = mVar.a();
                            i3 = i12;
                            int i16 = 0;
                            while (i16 < iA2) {
                                if (zA) {
                                    if (mVar.a()) {
                                        i5 = i7;
                                        jArr[i16] = mVar.a(i11) + 1;
                                    } else {
                                        i5 = i7;
                                        jArr[i16] = 0;
                                    }
                                } else {
                                    i5 = i7;
                                    jArr[i16] = mVar.a(i11) + 1;
                                }
                                i16++;
                                i7 = i5;
                            }
                            i2 = i7;
                        } else {
                            i2 = i7;
                            i3 = i12;
                            int iA3 = mVar.a(i11) + 1;
                            int i17 = 0;
                            while (i17 < iA2) {
                                int i18 = 0;
                                for (int i19 = iA2 - i17; i19 > 0; i19 >>>= 1) {
                                    i18++;
                                }
                                int iA4 = mVar.a(i18);
                                int i20 = 0;
                                while (i20 < iA4 && i17 < iA2) {
                                    jArr[i17] = iA3;
                                    i17++;
                                    i20++;
                                    iJ = iJ;
                                }
                                iA3++;
                                iJ = iJ;
                            }
                        }
                        int i21 = iJ;
                        int iA5 = mVar.a(4);
                        if (iA5 > 2) {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(com.fyber.inneractive.sdk.player.exoplayer2.m.a("lookup type greater than 2 not decodable: ", iA5));
                        }
                        int i22 = i2;
                        if (iA5 == i22 || iA5 == 2) {
                            mVar.b(32);
                            mVar.b(32);
                            int iA6 = mVar.a(4) + i22;
                            mVar.b(i22);
                            if (iA5 == i22) {
                                if (iA != 0) {
                                    jFloor = (long) Math.floor(Math.pow(iA2, 1.0d / ((double) iA)));
                                }
                                mVar.b((int) (((long) iA6) * j3));
                            } else {
                                jFloor = iA2 * iA;
                            }
                            j3 = jFloor;
                            mVar.b((int) (((long) iA6) * j3));
                        }
                        i13++;
                        i12 = i3;
                        iJ = i21;
                        i7 = 1;
                        i11 = 5;
                    } else {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("expected code book to start with [0x56, 0x43, 0x42] at " + ((mVar.f55411c * 8) + mVar.f55412d));
                    }
                } else {
                    int i23 = i12;
                    int i24 = 6;
                    int iA7 = mVar.a(6) + 1;
                    for (int i25 = 0; i25 < iA7; i25++) {
                        if (mVar.a(16) != 0) {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("placeholder of time domain transforms not zeroed out");
                        }
                    }
                    int i26 = 1;
                    int iA8 = mVar.a(6) + 1;
                    int i27 = 0;
                    while (i27 < iA8) {
                        int iA9 = mVar.a(i15);
                        if (iA9 == 0) {
                            int i28 = i23;
                            mVar.b(i28);
                            mVar.b(16);
                            mVar.b(16);
                            mVar.b(6);
                            mVar.b(i28);
                            int iA10 = mVar.a(4) + 1;
                            int i29 = 0;
                            while (i29 < iA10) {
                                mVar.b(i28);
                                i29++;
                                i28 = 8;
                            }
                        } else if (iA9 == i26) {
                            int iA11 = mVar.a(5);
                            int[] iArr = new int[iA11];
                            int i30 = -1;
                            for (int i31 = 0; i31 < iA11; i31++) {
                                int iA12 = mVar.a(i14);
                                iArr[i31] = iA12;
                                if (iA12 > i30) {
                                    i30 = iA12;
                                }
                            }
                            int i32 = i30 + 1;
                            int[] iArr2 = new int[i32];
                            int i33 = 0;
                            while (i33 < i32) {
                                iArr2[i33] = mVar.a(3) + 1;
                                int iA13 = mVar.a(2);
                                int i34 = i23;
                                if (iA13 > 0) {
                                    mVar.b(i34);
                                }
                                int i35 = 0;
                                for (int i36 = 1; i35 < (i36 << iA13); i36 = 1) {
                                    mVar.b(i34);
                                    i35++;
                                    i34 = 8;
                                }
                                i33++;
                                i23 = 8;
                            }
                            mVar.b(2);
                            int iA14 = mVar.a(4);
                            int i37 = 0;
                            int i38 = 0;
                            for (int i39 = 0; i39 < iA11; i39++) {
                                i37 += iArr2[iArr[i39]];
                                while (i38 < i37) {
                                    mVar.b(iA14);
                                    i38++;
                                }
                            }
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(com.fyber.inneractive.sdk.player.exoplayer2.m.a("floor type greater than 1 not decodable: ", iA9));
                        }
                        i27++;
                        i23 = 8;
                        i24 = 6;
                        i26 = 1;
                        i14 = 4;
                        i15 = 16;
                    }
                    int i40 = i24;
                    int iA15 = mVar.a(i40) + 1;
                    int i41 = 0;
                    while (i41 < iA15) {
                        if (mVar.a(16) <= 2) {
                            mVar.b(24);
                            mVar.b(24);
                            mVar.b(24);
                            int iA16 = mVar.a(i40) + 1;
                            int i42 = 8;
                            mVar.b(8);
                            int[] iArr3 = new int[iA16];
                            for (int i43 = 0; i43 < iA16; i43++) {
                                iArr3[i43] = ((mVar.a() ? mVar.a(5) : 0) * 8) + mVar.a(3);
                            }
                            int i44 = 0;
                            while (i44 < iA16) {
                                int i45 = 0;
                                while (i45 < i42) {
                                    if ((iArr3[i44] & (1 << i45)) != 0) {
                                        mVar.b(i42);
                                    }
                                    i45++;
                                    i42 = 8;
                                }
                                i44++;
                                i42 = 8;
                            }
                            i41++;
                            i40 = 6;
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("residueType greater than 2 is not decodable");
                        }
                    }
                    int iA17 = mVar.a(i40) + 1;
                    for (int i46 = 0; i46 < iA17; i46++) {
                        int iA18 = mVar.a(16);
                        if (iA18 != 0) {
                            Log.e("VorbisUtil", "mapping type other than 0 not supported: " + iA18);
                        } else {
                            int iA19 = mVar.a() ? mVar.a(4) + 1 : 1;
                            if (mVar.a()) {
                                int iA20 = mVar.a(8) + 1;
                                for (int i47 = 0; i47 < iA20; i47++) {
                                    int i48 = i10 - 1;
                                    int i49 = 0;
                                    for (int i50 = i48; i50 > 0; i50 >>>= 1) {
                                        i49++;
                                    }
                                    mVar.b(i49);
                                    int i51 = 0;
                                    while (i48 > 0) {
                                        i51++;
                                        i48 >>>= 1;
                                    }
                                    mVar.b(i51);
                                }
                            }
                            if (mVar.a(2) != 0) {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("to reserved bits must be zero after mapping coupling steps");
                            }
                            if (iA19 > 1) {
                                for (int i52 = 0; i52 < i10; i52++) {
                                    mVar.b(4);
                                }
                            }
                            for (int i53 = 0; i53 < iA19; i53++) {
                                mVar.b(8);
                                mVar.b(8);
                                mVar.b(8);
                            }
                        }
                    }
                    int iA21 = mVar.a(6);
                    int i54 = iA21 + 1;
                    q[] qVarArr = new q[i54];
                    for (int i55 = 0; i55 < i54; i55++) {
                        boolean zA2 = mVar.a();
                        mVar.a(16);
                        mVar.a(16);
                        mVar.a(8);
                        qVarArr[i55] = new q(zA2);
                    }
                    if (mVar.a()) {
                        int i56 = 0;
                        while (iA21 > 0) {
                            i56++;
                            iA21 >>>= 1;
                        }
                        nVar2 = new n(this.f55420q, bArr, qVarArr, i56);
                    } else {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("framing bit after modes not set as expected");
                    }
                }
            }
        }
        this.f55417n = nVar2;
        if (nVar2 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f55417n.f55413a.f55428f);
        arrayList.add(this.f55417n.f55414b);
        r rVar = this.f55417n.f55413a;
        jVar.f55394a = com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "audio/vorbis", rVar.f55425c, -1, rVar.f55423a, (int) rVar.f55424b, arrayList, null, null);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(long j2) {
        this.f55402g = j2;
        this.f55419p = j2 != 0;
        r rVar = this.f55420q;
        this.f55418o = rVar != null ? rVar.f55426d : 0;
    }
}
