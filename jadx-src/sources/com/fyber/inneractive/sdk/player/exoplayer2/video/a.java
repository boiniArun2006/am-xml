package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.r;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f56261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f56264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f56265e;

    public static a a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) throws r {
        float f3;
        int i2;
        int i3;
        try {
            nVar.e(nVar.f56207b + 4);
            int iJ = (nVar.j() & 3) + 1;
            if (iJ == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iJ2 = nVar.j() & 31;
            for (int i5 = 0; i5 < iJ2; i5++) {
                int iO = nVar.o();
                int i7 = nVar.f56207b;
                nVar.e(i7 + iO);
                byte[] bArr = nVar.f56206a;
                byte[] bArr2 = new byte[iO + 4];
                System.arraycopy(com.fyber.inneractive.sdk.player.exoplayer2.util.d.f56176a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i7, bArr2, 4, iO);
                arrayList.add(bArr2);
            }
            int iJ3 = nVar.j();
            for (int i8 = 0; i8 < iJ3; i8++) {
                int iO2 = nVar.o();
                int i9 = nVar.f56207b;
                nVar.e(i9 + iO2);
                byte[] bArr3 = nVar.f56206a;
                byte[] bArr4 = new byte[iO2 + 4];
                System.arraycopy(com.fyber.inneractive.sdk.player.exoplayer2.util.d.f56176a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i9, bArr4, 4, iO2);
                arrayList.add(bArr4);
            }
            if (iJ2 > 0) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.k kVarA = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a((byte[]) arrayList.get(0), iJ, ((byte[]) arrayList.get(0)).length);
                int i10 = kVarA.f56189b;
                int i11 = kVarA.f56190c;
                f3 = kVarA.f56191d;
                i2 = i10;
                i3 = i11;
            } else {
                f3 = 1.0f;
                i2 = -1;
                i3 = -1;
            }
            return new a(arrayList, iJ, i2, i3, f3);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new r("Error parsing AVC config", e2);
        }
    }

    public a(ArrayList arrayList, int i2, int i3, int i5, float f3) {
        this.f56261a = arrayList;
        this.f56262b = i2;
        this.f56263c = i3;
        this.f56264d = i5;
        this.f56265e = f3;
    }
}
