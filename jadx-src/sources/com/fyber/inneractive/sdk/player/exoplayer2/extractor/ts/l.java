package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f55552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55554c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.o f55557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f55558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f55559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f55560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f55561j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f55563l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f55567p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f55568q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f55569r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f55555d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f55556e = new SparseArray();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f55564m = new k();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f55565n = new k();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f55562k = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f55566o = false;

    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(byte[] bArr, int i2, int i3) {
        boolean zC2;
        boolean zC3;
        boolean z2;
        boolean z3;
        int iD;
        int i5;
        int iE;
        int iE2;
        int i7;
        if (this.f55562k) {
            int i8 = i3 - i2;
            byte[] bArr2 = this.f55558g;
            int length = bArr2.length;
            int i9 = this.f55559h + i8;
            if (length < i9) {
                this.f55558g = Arrays.copyOf(bArr2, i9 * 2);
            }
            System.arraycopy(bArr, i2, this.f55558g, this.f55559h, i8);
            int i10 = this.f55559h + i8;
            this.f55559h = i10;
            com.fyber.inneractive.sdk.player.exoplayer2.util.o oVar = this.f55557f;
            oVar.f56209a = this.f55558g;
            int i11 = 0;
            oVar.f56211c = 0;
            oVar.f56210b = i10;
            oVar.f56212d = 0;
            oVar.a();
            if (this.f55557f.a(8)) {
                this.f55557f.f();
                int iB = this.f55557f.b(2);
                this.f55557f.d(5);
                if (this.f55557f.b()) {
                    this.f55557f.d();
                    if (this.f55557f.b()) {
                        int iD2 = this.f55557f.d();
                        if (!this.f55554c) {
                            this.f55562k = false;
                            k kVar = this.f55565n;
                            kVar.f55540e = iD2;
                            kVar.f55537b = true;
                            return;
                        }
                        if (this.f55557f.b()) {
                            int iD3 = this.f55557f.d();
                            if (this.f55556e.indexOfKey(iD3) < 0) {
                                this.f55562k = false;
                                return;
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.util.j jVar = (com.fyber.inneractive.sdk.player.exoplayer2.util.j) this.f55556e.get(iD3);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.util.k) this.f55555d.get(jVar.f56186a);
                            if (kVar2.f56192e) {
                                if (!this.f55557f.a(2)) {
                                    return;
                                } else {
                                    this.f55557f.d(2);
                                }
                            }
                            if (this.f55557f.a(kVar2.f56194g)) {
                                int iB2 = this.f55557f.b(kVar2.f56194g);
                                if (kVar2.f56193f) {
                                    zC2 = false;
                                    zC3 = false;
                                } else {
                                    if (!this.f55557f.a(1)) {
                                        return;
                                    }
                                    zC2 = this.f55557f.c();
                                    if (zC2) {
                                        if (this.f55557f.a(1)) {
                                            zC3 = this.f55557f.c();
                                            z2 = true;
                                            z3 = this.f55560i != 5;
                                            if (z3) {
                                                iD = 0;
                                            } else if (!this.f55557f.b()) {
                                                return;
                                            } else {
                                                iD = this.f55557f.d();
                                            }
                                            i5 = kVar2.f56195h;
                                            if (i5 != 0) {
                                                if (!this.f55557f.a(kVar2.f56196i)) {
                                                    return;
                                                }
                                                int iB3 = this.f55557f.b(kVar2.f56196i);
                                                if (!jVar.f56187b || zC2) {
                                                    iE = 0;
                                                    i7 = iB3;
                                                    iE2 = 0;
                                                } else {
                                                    if (!this.f55557f.b()) {
                                                        return;
                                                    }
                                                    iE = this.f55557f.e();
                                                    i7 = iB3;
                                                    iE2 = 0;
                                                }
                                            } else if (i5 != 1 || kVar2.f56197j) {
                                                iE = 0;
                                                iE2 = 0;
                                                i7 = 0;
                                            } else {
                                                if (!this.f55557f.b()) {
                                                    return;
                                                }
                                                int iE3 = this.f55557f.e();
                                                if (!jVar.f56187b || zC2) {
                                                    iE = 0;
                                                    i7 = 0;
                                                    i11 = iE3;
                                                    iE2 = 0;
                                                } else {
                                                    if (!this.f55557f.b()) {
                                                        return;
                                                    }
                                                    i7 = 0;
                                                    i11 = iE3;
                                                    iE2 = this.f55557f.e();
                                                    iE = 0;
                                                }
                                            }
                                            k kVar3 = this.f55565n;
                                            kVar3.f55538c = kVar2;
                                            kVar3.f55539d = iB;
                                            kVar3.f55540e = iD2;
                                            kVar3.f55541f = iB2;
                                            kVar3.f55542g = iD3;
                                            kVar3.f55543h = zC2;
                                            kVar3.f55544i = z2;
                                            kVar3.f55545j = zC3;
                                            kVar3.f55546k = z3;
                                            kVar3.f55547l = iD;
                                            kVar3.f55548m = i7;
                                            kVar3.f55549n = iE;
                                            kVar3.f55550o = i11;
                                            kVar3.f55551p = iE2;
                                            kVar3.f55536a = true;
                                            kVar3.f55537b = true;
                                            this.f55562k = false;
                                        }
                                        return;
                                    }
                                    zC3 = false;
                                }
                                z2 = zC3;
                                if (this.f55560i != 5) {
                                }
                                if (z3) {
                                }
                                i5 = kVar2.f56195h;
                                if (i5 != 0) {
                                }
                                k kVar32 = this.f55565n;
                                kVar32.f55538c = kVar2;
                                kVar32.f55539d = iB;
                                kVar32.f55540e = iD2;
                                kVar32.f55541f = iB2;
                                kVar32.f55542g = iD3;
                                kVar32.f55543h = zC2;
                                kVar32.f55544i = z2;
                                kVar32.f55545j = zC3;
                                kVar32.f55546k = z3;
                                kVar32.f55547l = iD;
                                kVar32.f55548m = i7;
                                kVar32.f55549n = iE;
                                kVar32.f55550o = i11;
                                kVar32.f55551p = iE2;
                                kVar32.f55536a = true;
                                kVar32.f55537b = true;
                                this.f55562k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public l(com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar, boolean z2, boolean z3) {
        this.f55552a = rVar;
        this.f55553b = z2;
        this.f55554c = z3;
        byte[] bArr = new byte[128];
        this.f55558g = bArr;
        this.f55557f = new com.fyber.inneractive.sdk.player.exoplayer2.util.o(bArr, 0, 0);
        k kVar = this.f55565n;
        kVar.f55537b = false;
        kVar.f55536a = false;
    }
}
