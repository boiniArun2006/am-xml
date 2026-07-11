package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class d implements h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f55473r = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f55474a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f55478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f55479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f55480g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f55484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f55485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f55486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f55487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f55488o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f55489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f55490q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f55475b = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[7]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55476c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(Arrays.copyOf(f55473r, 10));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f55481h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f55482i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f55483j = 256;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i2 = 7;
        while (true) {
            int i3 = nVar.f56208c;
            int i5 = nVar.f56207b;
            int i7 = i3 - i5;
            if (i7 <= 0) {
                return;
            }
            int i8 = this.f55481h;
            if (i8 == 0) {
                byte[] bArr = nVar.f56206a;
                while (true) {
                    if (i5 >= i3) {
                        nVar.e(i5);
                        break;
                    }
                    int i9 = i5 + 1;
                    byte b2 = bArr[i5];
                    int i10 = b2 & UByte.MAX_VALUE;
                    int i11 = this.f55483j;
                    if (i11 != 512 || i10 < 240 || i10 == 255) {
                        int i12 = i11 | i10;
                        if (i12 == 329) {
                            this.f55483j = 768;
                        } else if (i12 == 511) {
                            this.f55483j = 512;
                        } else if (i12 == 836) {
                            this.f55483j = 1024;
                        } else {
                            if (i12 == 1075) {
                                this.f55481h = 1;
                                this.f55482i = 3;
                                this.f55487n = 0;
                                this.f55476c.e(0);
                                nVar.e(i9);
                                break;
                            }
                            if (i11 != 256) {
                                this.f55483j = 256;
                            }
                        }
                        i5 = i9;
                    } else {
                        this.f55484k = (b2 & 1) == 0;
                        this.f55481h = 2;
                        this.f55482i = 0;
                        nVar.e(i9);
                    }
                }
                i2 = 7;
            } else if (i8 == 1) {
                byte[] bArr2 = this.f55476c.f56206a;
                int iMin = Math.min(i7, 10 - this.f55482i);
                nVar.a(bArr2, this.f55482i, iMin);
                int i13 = this.f55482i + iMin;
                this.f55482i = i13;
                if (i13 == 10) {
                    this.f55480g.a(10, this.f55476c);
                    this.f55476c.e(6);
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = this.f55480g;
                    int i14 = this.f55476c.i() + 10;
                    this.f55481h = 3;
                    this.f55482i = 10;
                    this.f55489p = rVar;
                    this.f55490q = 0L;
                    this.f55487n = i14;
                }
            } else if (i8 == 2) {
                int i15 = this.f55484k ? i2 : 5;
                byte[] bArr3 = this.f55475b.f56202a;
                int iMin2 = Math.min(i7, i15 - this.f55482i);
                nVar.a(bArr3, this.f55482i, iMin2);
                int i16 = this.f55482i + iMin2;
                this.f55482i = i16;
                if (i16 == i15) {
                    this.f55475b.b(0);
                    if (this.f55485l) {
                        this.f55475b.c(10);
                    } else {
                        int iA = this.f55475b.a(2) + 1;
                        if (iA != 2) {
                            Log.w("AdtsReader", "Detected audio object type: " + iA + ", but assuming AAC LC.");
                            iA = 2;
                        }
                        int iA2 = this.f55475b.a(4);
                        this.f55475b.c(1);
                        byte[] bArr4 = {(byte) (((iA << 3) & 248) | ((iA2 >> 1) & i2)), (byte) (((iA2 << i2) & 128) | ((this.f55475b.a(3) << 3) & com.safedk.android.analytics.brandsafety.b.f61769v))};
                        Pair pairA = com.fyber.inneractive.sdk.player.exoplayer2.util.d.a(bArr4);
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f55478e, "audio/mp4a-latm", -1, -1, ((Integer) pairA.second).intValue(), ((Integer) pairA.first).intValue(), Collections.singletonList(bArr4), null, this.f55477d);
                        this.f55486m = 1024000000 / ((long) oVarA.f55871s);
                        this.f55479f.a(oVarA);
                        this.f55485l = true;
                    }
                    this.f55475b.c(4);
                    int iA3 = this.f55475b.a(13);
                    int i17 = iA3 - 7;
                    if (this.f55484k) {
                        i17 = iA3 - 9;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar2 = this.f55479f;
                    long j2 = this.f55486m;
                    this.f55481h = 3;
                    this.f55482i = 0;
                    this.f55489p = rVar2;
                    this.f55490q = j2;
                    this.f55487n = i17;
                }
            } else if (i8 == 3) {
                int iMin3 = Math.min(i7, this.f55487n - this.f55482i);
                this.f55489p.a(iMin3, nVar);
                int i18 = this.f55482i + iMin3;
                this.f55482i = i18;
                int i19 = this.f55487n;
                if (i18 == i19) {
                    this.f55489p.a(this.f55488o, 1, i19, 0, null);
                    this.f55488o += this.f55490q;
                    this.f55481h = 0;
                    this.f55482i = 0;
                    this.f55483j = 256;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    public d(boolean z2, String str) {
        this.f55474a = z2;
        this.f55477d = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f55478e = e0Var.f55500e;
        e0Var.b();
        this.f55479f = jVar.a(e0Var.f55499d, 1);
        if (this.f55474a) {
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f55499d, 4);
            this.f55480g = gVarA;
            e0Var.b();
            gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.f55500e, "application/id3", (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
            return;
        }
        this.f55480g = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.h();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z2, long j2) {
        this.f55488o = j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f55481h = 0;
        this.f55482i = 0;
        this.f55483j = 256;
    }
}
