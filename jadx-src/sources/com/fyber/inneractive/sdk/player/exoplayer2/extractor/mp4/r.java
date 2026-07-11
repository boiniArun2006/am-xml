package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f55304a = {z.a("isom"), z.a("iso2"), z.a("iso3"), z.a("iso4"), z.a("iso5"), z.a("iso6"), z.a("avc1"), z.a("hvc1"), z.a("hev1"), z.a("mp41"), z.a("mp42"), z.a("3g2a"), z.a("3g2b"), z.a("3gr6"), z.a("3gs6"), z.a("3ge6"), z.a("3gg6"), z.a("M4V "), z.a("M4A "), z.a("f4v "), z.a("kddi"), z.a("M4VP"), z.a("qt  "), z.a("MSNV")};

    public static boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z2) throws InterruptedException, EOFException {
        boolean z3;
        int i2;
        long j2 = bVar.f54725b;
        if (j2 == -1 || j2 > 4096) {
            j2 = 4096;
        }
        int i3 = (int) j2;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(64);
        boolean z4 = false;
        int i5 = 0;
        boolean z5 = false;
        while (i5 < i3) {
            nVar.c(8);
            bVar.a(nVar.f56206a, z4 ? 1 : 0, 8, z4);
            long jK = nVar.k();
            int iB = nVar.b();
            if (jK == 1) {
                bVar.a(nVar.f56206a, 8, 8, z4);
                nVar.d(16);
                i2 = 16;
                jK = nVar.n();
            } else {
                i2 = 8;
            }
            long j3 = i2;
            if (jK < j3) {
                return z4;
            }
            i5 += i2;
            if (iB != c.f55127C) {
                if (iB == c.f55138L || iB == c.f55140N) {
                    z3 = true;
                    break;
                }
                long j4 = (((long) i5) + jK) - j3;
                boolean z6 = z4 ? 1 : 0;
                if (j4 >= i3) {
                    break;
                }
                int i7 = (int) (jK - j3);
                i5 += i7;
                z5 = z5;
                if (iB == c.f55153b) {
                    if (i7 < 8) {
                        return z6;
                    }
                    nVar.c(i7);
                    bVar.a(nVar.f56206a, z6 ? 1 : 0, i7, z6);
                    int i8 = i7 / 4;
                    for (int i9 = 0; i9 < i8; i9++) {
                        if (i9 != 1) {
                            int iB2 = nVar.b();
                            if ((iB2 >>> 8) != z.a("3gp")) {
                                for (int i10 : f55304a) {
                                    if (i10 != iB2) {
                                    }
                                }
                            }
                            z5 = true;
                            break;
                        }
                        nVar.e(nVar.f56207b + 4);
                    }
                    z5 = z5;
                    if (!z5) {
                        return false;
                    }
                } else if (i7 != 0) {
                    bVar.a(i7, z6);
                    z5 = z5;
                }
                z4 = false;
            }
        }
        z3 = false;
        return z5 && z2 == z3;
    }
}
