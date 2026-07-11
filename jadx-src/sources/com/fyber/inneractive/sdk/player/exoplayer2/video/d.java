package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.r;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f56271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56272b;

    public static d a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) throws r {
        try {
            nVar.e(nVar.f56207b + 21);
            int iJ = nVar.j() & 3;
            int iJ2 = nVar.j();
            int i2 = nVar.f56207b;
            int i3 = 0;
            for (int i5 = 0; i5 < iJ2; i5++) {
                nVar.e(nVar.f56207b + 1);
                int iO = nVar.o();
                for (int i7 = 0; i7 < iO; i7++) {
                    int iO2 = nVar.o();
                    i3 += iO2 + 4;
                    nVar.e(nVar.f56207b + iO2);
                }
            }
            nVar.e(i2);
            byte[] bArr = new byte[i3];
            int i8 = 0;
            for (int i9 = 0; i9 < iJ2; i9++) {
                nVar.e(nVar.f56207b + 1);
                int iO3 = nVar.o();
                for (int i10 = 0; i10 < iO3; i10++) {
                    int iO4 = nVar.o();
                    System.arraycopy(com.fyber.inneractive.sdk.player.exoplayer2.util.l.f56198a, 0, bArr, i8, 4);
                    int i11 = i8 + 4;
                    System.arraycopy(nVar.f56206a, nVar.f56207b, bArr, i11, iO4);
                    i8 = i11 + iO4;
                    nVar.e(nVar.f56207b + iO4);
                }
            }
            return new d(iJ + 1, i3 == 0 ? null : Collections.singletonList(bArr));
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new r("Error parsing HEVC config", e2);
        }
    }

    public d(int i2, List list) {
        this.f56271a = list;
        this.f56272b = i2;
    }
}
