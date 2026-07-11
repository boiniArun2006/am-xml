package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.t f56119a = new com.fyber.inneractive.sdk.player.exoplayer2.util.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f56121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f56122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f56123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f56124f;

    public final synchronized void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar;
        int i2;
        float f3;
        try {
            if (this.f56120b <= 0) {
                throw new IllegalStateException();
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i3 = (int) (jElapsedRealtime - this.f56121c);
            long j2 = i3;
            this.f56123e += j2;
            long j3 = this.f56124f;
            long j4 = this.f56122d;
            this.f56124f = j3 + j4;
            if (i3 > 0) {
                float f4 = (8000 * j4) / j2;
                com.fyber.inneractive.sdk.player.exoplayer2.util.t tVar = this.f56119a;
                int iSqrt = (int) Math.sqrt(j4);
                if (tVar.f56222d != 1) {
                    Collections.sort(tVar.f56220b, com.fyber.inneractive.sdk.player.exoplayer2.util.t.f56217h);
                    tVar.f56222d = 1;
                }
                int i5 = tVar.f56225g;
                if (i5 > 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.s[] sVarArr = tVar.f56221c;
                    int i7 = i5 - 1;
                    tVar.f56225g = i7;
                    sVar = sVarArr[i7];
                } else {
                    sVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.s();
                }
                int i8 = tVar.f56223e;
                tVar.f56223e = i8 + 1;
                sVar.f56214a = i8;
                sVar.f56215b = iSqrt;
                sVar.f56216c = f4;
                tVar.f56220b.add(sVar);
                tVar.f56224f += iSqrt;
                while (true) {
                    int i9 = tVar.f56224f;
                    int i10 = tVar.f56219a;
                    i2 = 0;
                    if (i9 <= i10) {
                        break;
                    }
                    int i11 = i9 - i10;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.util.s) tVar.f56220b.get(0);
                    int i12 = sVar2.f56215b;
                    if (i12 <= i11) {
                        tVar.f56224f -= i12;
                        tVar.f56220b.remove(0);
                        int i13 = tVar.f56225g;
                        if (i13 < 5) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.s[] sVarArr2 = tVar.f56221c;
                            tVar.f56225g = i13 + 1;
                            sVarArr2[i13] = sVar2;
                        }
                    } else {
                        sVar2.f56215b = i12 - i11;
                        tVar.f56224f -= i11;
                    }
                }
                if (this.f56123e >= 2000 || this.f56124f >= 524288) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.t tVar2 = this.f56119a;
                    if (tVar2.f56222d != 0) {
                        Collections.sort(tVar2.f56220b, com.fyber.inneractive.sdk.player.exoplayer2.util.t.f56218i);
                        tVar2.f56222d = 0;
                    }
                    float f5 = 0.5f * tVar2.f56224f;
                    int i14 = 0;
                    while (true) {
                        if (i2 < tVar2.f56220b.size()) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.util.s) tVar2.f56220b.get(i2);
                            i14 += sVar3.f56215b;
                            if (i14 >= f5) {
                                f3 = sVar3.f56216c;
                                break;
                            }
                            i2++;
                        } else if (tVar2.f56220b.isEmpty()) {
                            f3 = Float.NaN;
                        } else {
                            ArrayList arrayList = tVar2.f56220b;
                            f3 = ((com.fyber.inneractive.sdk.player.exoplayer2.util.s) arrayList.get(arrayList.size() - 1)).f56216c;
                        }
                    }
                    Float.isNaN(f3);
                }
            }
            int i15 = this.f56120b - 1;
            this.f56120b = i15;
            if (i15 > 0) {
                this.f56121c = jElapsedRealtime;
            }
            this.f56122d = 0L;
        } catch (Throwable th) {
            throw th;
        }
    }
}
