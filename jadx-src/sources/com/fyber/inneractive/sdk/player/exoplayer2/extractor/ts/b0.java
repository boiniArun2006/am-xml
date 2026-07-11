package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class b0 implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f55452l = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("AC-3");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f55453m = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("EAC3");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f55454n = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("HEVC");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f55456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f55458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f55459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray f55460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f55461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f55462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f55463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f55464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f0 f55465k;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        byte[] bArr = this.f55457c.f56206a;
        bVar.a(bArr, 0, 940, false);
        int i2 = 0;
        while (i2 < 188) {
            for (int i3 = 0; i3 != 5; i3++) {
                if (bArr[(i3 * 188) + i2] != 71) {
                    break;
                }
            }
            bVar.a(i2);
            return true;
        }
        return false;
    }

    public b0(int i2, com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, e eVar) {
        this.f55459e = eVar;
        this.f55455a = i2;
        if (i2 != 1 && i2 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f55456b = arrayList;
            arrayList.add(vVar);
        } else {
            this.f55456b = Collections.singletonList(vVar);
        }
        this.f55457c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(940);
        this.f55461g = new SparseBooleanArray();
        this.f55460f = new SparseArray();
        this.f55458d = new SparseIntArray();
        a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f55462h = jVar;
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j2, long j3) {
        int size = this.f55456b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.util.v) this.f55456b.get(i2)).f56232c = -9223372036854775807L;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f55457c;
        nVar.f56207b = 0;
        nVar.f56208c = 0;
        this.f55458d.clear();
        a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        f0 f0Var;
        int iMin;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f55457c;
        byte[] bArr = nVar.f56206a;
        int i2 = nVar.f56207b;
        if (940 - i2 < 188) {
            int i3 = nVar.f56208c - i2;
            if (i3 > 0) {
                System.arraycopy(bArr, i2, bArr, 0, i3);
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f55457c;
            nVar2.f56206a = bArr;
            nVar2.f56208c = i3;
            nVar2.f56207b = 0;
        }
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f55457c;
            int i5 = nVar3.f56208c;
            int i7 = nVar3.f56207b;
            if (i5 - i7 < 188) {
                int i8 = 940 - i5;
                int i9 = bVar.f54729f;
                if (i9 == 0) {
                    iMin = 0;
                } else {
                    iMin = Math.min(i9, i8);
                    System.arraycopy(bVar.f54727d, 0, bArr, i5, iMin);
                    bVar.b(iMin);
                }
                if (iMin == 0) {
                    bVar2 = bVar;
                    iMin = bVar2.a(bArr, i5, i8, 0, true);
                } else {
                    bVar2 = bVar;
                }
                if (iMin != -1) {
                    bVar2.f54726c += (long) iMin;
                }
                if (iMin == -1) {
                    return -1;
                }
                this.f55457c.d(i5 + iMin);
                bVar = bVar2;
            } else {
                while (i7 < i5 && bArr[i7] != 71) {
                    i7++;
                }
                this.f55457c.e(i7);
                int i10 = i7 + 188;
                if (i10 > i5) {
                    return 0;
                }
                int iB = this.f55457c.b();
                if ((8388608 & iB) != 0) {
                    this.f55457c.e(i10);
                    return 0;
                }
                boolean z2 = true;
                boolean z3 = (4194304 & iB) != 0;
                int i11 = (2096896 & iB) >> 8;
                boolean z4 = (iB & 32) != 0;
                boolean z5 = (iB & 16) != 0;
                if (this.f55455a != 2) {
                    int i12 = iB & 15;
                    int i13 = this.f55458d.get(i11, i12 - 1);
                    this.f55458d.put(i11, i12);
                    if (i13 == i12) {
                        if (z5) {
                            this.f55457c.e(i10);
                            return 0;
                        }
                    } else if (i12 == ((i13 + 1) & 15)) {
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z4) {
                    int iJ = this.f55457c.j();
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.f55457c;
                    nVar4.e(nVar4.f56207b + iJ);
                }
                if (z5 && (f0Var = (f0) this.f55460f.get(i11)) != null) {
                    if (z2) {
                        f0Var.a();
                    }
                    this.f55457c.d(i10);
                    f0Var.a(this.f55457c, z3);
                    this.f55457c.d(i5);
                }
                this.f55457c.e(i10);
                return 0;
            }
        }
    }

    public final void a() {
        this.f55461g.clear();
        this.f55460f.clear();
        this.f55459e.getClass();
        SparseArray sparseArray = new SparseArray();
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f55460f.put(sparseArray.keyAt(i2), (f0) sparseArray.valueAt(i2));
        }
        this.f55460f.put(0, new w(new z(this)));
        this.f55465k = null;
    }
}
