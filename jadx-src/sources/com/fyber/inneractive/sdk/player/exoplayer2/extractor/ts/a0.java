package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f55435a = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[5]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f55436b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseIntArray f55437c = new SparseIntArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f55439e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
    }

    public a0(b0 b0Var, int i2) {
        this.f55439e = b0Var;
        this.f55438d = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cc  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar;
        char c2;
        f0 f0VarA;
        int i2;
        int i3;
        int i5;
        if (nVar.j() != 2) {
            return;
        }
        b0 b0Var = this.f55439e;
        int i7 = b0Var.f55455a;
        int i8 = 0;
        if (i7 == 1 || i7 == 2 || b0Var.f55463i == 1) {
            vVar = (com.fyber.inneractive.sdk.player.exoplayer2.util.v) b0Var.f55456b.get(0);
        } else {
            vVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.v(((com.fyber.inneractive.sdk.player.exoplayer2.util.v) b0Var.f55456b.get(0)).f56230a);
            this.f55439e.f55456b.add(vVar);
        }
        nVar.e(nVar.f56207b + 2);
        int iO = nVar.o();
        int i9 = 5;
        nVar.e(nVar.f56207b + 5);
        com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = this.f55435a;
        nVar.a(mVar.f56202a, 0, 2);
        mVar.b(0);
        int i10 = 4;
        this.f55435a.c(4);
        int i11 = 12;
        nVar.e(nVar.f56207b + this.f55435a.a(12));
        b0 b0Var2 = this.f55439e;
        if (b0Var2.f55455a == 2 && b0Var2.f55465k == null) {
            d0 d0Var = new d0(21, null, null, new byte[0]);
            b0 b0Var3 = this.f55439e;
            b0Var3.f55465k = b0Var3.f55459e.a(21, d0Var);
            b0 b0Var4 = this.f55439e;
            b0Var4.f55465k.a(vVar, b0Var4.f55462h, new e0(iO, 21, 8192));
        }
        this.f55436b.clear();
        this.f55437c.clear();
        int i12 = nVar.f56208c - nVar.f56207b;
        while (i12 > 0) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar2 = this.f55435a;
            nVar.a(mVar2.f56202a, i8, i9);
            mVar2.b(i8);
            int iA = this.f55435a.a(8);
            int i13 = 3;
            this.f55435a.c(3);
            int iA2 = this.f55435a.a(13);
            this.f55435a.c(i10);
            int iA3 = this.f55435a.a(i11);
            int i14 = nVar.f56207b;
            int i15 = i14 + iA3;
            int i16 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            while (nVar.f56207b < i15) {
                int iJ = nVar.j();
                int iJ2 = nVar.f56207b + nVar.j();
                if (iJ == i9) {
                    long jK = nVar.k();
                    if (jK == b0.f55452l) {
                        i5 = 129;
                    } else if (jK == b0.f55453m) {
                        i5 = 135;
                    } else {
                        if (jK == b0.f55454n) {
                            i5 = 36;
                        }
                        i2 = i12;
                        i3 = 4;
                    }
                    i16 = i5;
                    i2 = i12;
                    i3 = 4;
                } else {
                    if (iJ != 106) {
                        if (iJ != 122) {
                            if (iJ == 123) {
                                i5 = 138;
                            } else {
                                if (iJ == 10) {
                                    strTrim = nVar.b(i13).trim();
                                } else if (iJ == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (nVar.f56207b < iJ2) {
                                        String strTrim2 = nVar.b(i13).trim();
                                        nVar.j();
                                        byte[] bArr = new byte[4];
                                        nVar.a(bArr, 0, 4);
                                        arrayList2.add(new c0(strTrim2, bArr));
                                        i12 = i12;
                                        i13 = 3;
                                    }
                                    i2 = i12;
                                    i3 = 4;
                                    arrayList = arrayList2;
                                    i16 = 89;
                                }
                                i2 = i12;
                                i3 = 4;
                            }
                        }
                    }
                    i16 = i5;
                    i2 = i12;
                    i3 = 4;
                }
                int i17 = nVar.f56207b;
                nVar.e((iJ2 - i17) + i17);
                i10 = i3;
                i12 = i2;
                i9 = 5;
                i13 = 3;
            }
            int i18 = i12;
            int i19 = i10;
            nVar.e(i15);
            d0 d0Var2 = new d0(i16, strTrim, arrayList, Arrays.copyOfRange(nVar.f56206a, i14, i15));
            if (iA == 6) {
                iA = i16;
            }
            i12 = i18 - (iA3 + 5);
            b0 b0Var5 = this.f55439e;
            int i20 = b0Var5.f55455a == 2 ? iA : iA2;
            if (b0Var5.f55461g.get(i20)) {
                c2 = 21;
            } else {
                b0 b0Var6 = this.f55439e;
                if (b0Var6.f55455a == 2) {
                    c2 = 21;
                    if (iA == 21) {
                        f0VarA = b0Var6.f55465k;
                    }
                    if (this.f55439e.f55455a == 2 || iA2 < this.f55437c.get(i20, 8192)) {
                        this.f55437c.put(i20, iA2);
                        this.f55436b.put(i20, f0VarA);
                    }
                } else {
                    c2 = 21;
                }
                f0VarA = b0Var6.f55459e.a(iA, d0Var2);
                if (this.f55439e.f55455a == 2) {
                    this.f55437c.put(i20, iA2);
                    this.f55436b.put(i20, f0VarA);
                }
            }
            i10 = i19;
            i8 = 0;
            i9 = 5;
            i11 = 12;
        }
        int size = this.f55437c.size();
        for (int i21 = 0; i21 < size; i21++) {
            int iKeyAt = this.f55437c.keyAt(i21);
            this.f55439e.f55461g.put(iKeyAt, true);
            f0 f0Var = (f0) this.f55436b.valueAt(i21);
            if (f0Var != null) {
                b0 b0Var7 = this.f55439e;
                if (f0Var != b0Var7.f55465k) {
                    f0Var.a(vVar, b0Var7.f55462h, new e0(iO, iKeyAt, 8192));
                }
                this.f55439e.f55460f.put(this.f55437c.valueAt(i21), f0Var);
            }
        }
        b0 b0Var8 = this.f55439e;
        if (b0Var8.f55455a == 2) {
            if (b0Var8.f55464j) {
                return;
            }
            b0Var8.f55462h.b();
            b0 b0Var9 = this.f55439e;
            b0Var9.f55463i = 0;
            b0Var9.f55464j = true;
            return;
        }
        b0Var8.f55460f.remove(this.f55438d);
        b0 b0Var10 = this.f55439e;
        int i22 = b0Var10.f55455a == 1 ? 0 : b0Var10.f55463i - 1;
        b0Var10.f55463i = i22;
        if (i22 == 0) {
            b0Var10.f55462h.b();
            this.f55439e.f55464j = true;
        }
    }
}
