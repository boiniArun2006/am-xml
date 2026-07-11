package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.source.r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.v;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class i implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k f54846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f54847b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f54849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f54850e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f54854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r f54855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f54856k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f54857l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z f54858m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n[] f54859n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n[] f54860o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.h f54861p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54848c = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IdentityHashMap f54851f = new IdentityHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f54852g = new o();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f54853h = new Handler();

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void a(r rVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar;
        this.f54846a.f54977g.add(this);
        this.f54855j = rVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar = this.f54846a.f54980j;
        ArrayList arrayList = new ArrayList(bVar.f54906b);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) arrayList.get(i2);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.f54905b;
            if (oVar.f55863k > 0) {
                arrayList2.add(aVar);
                break;
                break;
            }
            String str = oVar.f55855c;
            if (!TextUtils.isEmpty(str)) {
                for (String str2 : str.split("(\\s*,\\s*)|(\\s*$)")) {
                    if (str2.startsWith("avc")) {
                        arrayList2.add(aVar);
                        break;
                    }
                }
            }
            String str3 = aVar.f54905b.f55855c;
            if (!TextUtils.isEmpty(str3)) {
                String[] strArrSplit = str3.split("(\\s*,\\s*)|(\\s*$)");
                int length = strArrSplit.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (strArrSplit[i3].startsWith("mp4a")) {
                        arrayList3.add(aVar);
                        break;
                    }
                    i3++;
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else if (arrayList3.size() < arrayList.size()) {
            arrayList.removeAll(arrayList3);
        }
        List list = bVar.f54907c;
        List list2 = bVar.f54908d;
        int size = list2.size() + list.size() + 1;
        this.f54859n = new n[size];
        this.f54856k = size;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] aVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[arrayList.size()];
        arrayList.toArray(aVarArr);
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = bVar.f54909e;
        f fVar = new f(this.f54846a, aVarArr, this.f54847b, this.f54852g, bVar.f54910f);
        n nVar = new n(0, this, fVar, this.f54850e, this.f54854i, oVar2, this.f54848c, this.f54849d);
        this.f54859n[0] = nVar;
        fVar.f54813h = true;
        if (!nVar.f54884o) {
            nVar.b(nVar.f54892w);
        }
        int i5 = 0;
        int i7 = 1;
        while (i5 < list.size()) {
            n nVar2 = new n(1, this, new f(this.f54846a, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[]{(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) list.get(i5)}, this.f54847b, this.f54852g, Collections.EMPTY_LIST), this.f54850e, this.f54854i, null, this.f54848c, this.f54849d);
            int i8 = i7 + 1;
            this.f54859n[i7] = nVar2;
            if (!nVar2.f54884o) {
                nVar2.b(nVar2.f54892w);
            }
            i5++;
            i7 = i8;
        }
        int i9 = 0;
        while (i9 < list2.size()) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) list2.get(i9);
            f fVar2 = new f(this.f54846a, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[]{aVar2}, this.f54847b, this.f54852g, Collections.EMPTY_LIST);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar2 = this.f54850e;
            n nVar3 = new n(3, this, fVar2, bVar2, this.f54854i, null, this.f54848c, this.f54849d);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar3 = aVar2.f54905b;
            if (nVar3.f54879j.indexOfKey(0) >= 0) {
                gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar3.f54879j.get(0);
            } else {
                gVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(bVar2);
                gVar.f54791n = nVar3;
                gVar.f54780c.f54752r = nVar3.f54887r;
                nVar3.f54879j.put(0, gVar);
            }
            gVar.a(oVar3);
            nVar3.f54883n = true;
            nVar3.h();
            this.f54859n[i7] = nVar3;
            i9++;
            i7++;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long g() {
        return -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final boolean b(long j2) {
        return this.f54861p.b(j2);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long c() {
        /*
            r18 = this;
            r0 = r18
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n[] r1 = r0.f54860o
            int r2 = r1.length
            r5 = 0
            r6 = r5
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Lc:
            r9 = -9223372036854775808
            if (r6 >= r2) goto L85
            r11 = r1[r6]
            boolean r12 = r11.f54894y
            if (r12 == 0) goto L1d
            r12 = r9
        L17:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L7a
        L1d:
            long r12 = r11.f54893x
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 == 0) goto L29
            goto L17
        L29:
            long r12 = r11.f54892w
            java.util.LinkedList r14 = r11.f54880k
            java.lang.Object r14 = r14.getLast()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h) r14
            boolean r15 = r14.f54828F
            if (r15 == 0) goto L38
            goto L51
        L38:
            java.util.LinkedList r14 = r11.f54880k
            int r14 = r14.size()
            r15 = 1
            if (r14 <= r15) goto L50
            java.util.LinkedList r14 = r11.f54880k
            int r15 = r14.size()
            int r15 = r15 + (-2)
            java.lang.Object r14 = r14.get(r15)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h) r14
            goto L51
        L50:
            r14 = 0
        L51:
            if (r14 == 0) goto L59
            long r14 = r14.f55902g
            long r12 = java.lang.Math.max(r12, r14)
        L59:
            android.util.SparseArray r14 = r11.f54879j
            int r14 = r14.size()
            r15 = r5
        L60:
            if (r15 >= r14) goto L17
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            android.util.SparseArray r3 = r11.f54879j
            java.lang.Object r3 = r3.valueAt(r15)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) r3
            long r3 = r3.d()
            long r12 = java.lang.Math.max(r12, r3)
            int r15 = r15 + 1
            goto L60
        L7a:
            int r3 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r3 == 0) goto L82
            long r7 = java.lang.Math.min(r7, r12)
        L82:
            int r6 = r6 + 1
            goto Lc
        L85:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 != 0) goto L8f
            return r9
        L8f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i.c():long");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void d() throws IOException {
        n[] nVarArr = this.f54859n;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                nVar.f54876g.b();
                f fVar = nVar.f54872c;
                com.fyber.inneractive.sdk.player.exoplayer2.source.g gVar = fVar.f54815j;
                if (gVar != null) {
                    throw gVar;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = fVar.f54816k;
                if (aVar != null) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) fVar.f54810e.f54974d.get(aVar);
                    hVar.f54961b.b();
                    IOException iOException = hVar.f54969j;
                    if (iOException != null) {
                        throw iOException;
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        return this.f54861p.f();
    }

    public i(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar, b bVar, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar2, long j2) {
        this.f54846a = kVar;
        this.f54847b = bVar;
        this.f54849d = fVar;
        this.f54850e = bVar2;
        this.f54854i = j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final z a() {
        return this.f54858m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, v[] vVarArr, boolean[] zArr2, long j2) {
        int[] iArr;
        int i2;
        boolean z2;
        v[] vVarArr2;
        int i3;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr2;
        int i5;
        int[] iArr2;
        int[] iArr3 = new int[bVarArr.length];
        int[] iArr4 = new int[bVarArr.length];
        for (int i7 = 0; i7 < bVarArr.length; i7++) {
            v vVar = vVarArr[i7];
            iArr3[i7] = vVar == null ? -1 : ((Integer) this.f54851f.get(vVar)).intValue();
            iArr4[i7] = -1;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = bVarArr[i7];
            if (bVar != null) {
                y yVar = bVar.f55997a;
                int i8 = 0;
                while (true) {
                    n[] nVarArr = this.f54859n;
                    if (i8 < nVarArr.length) {
                        z zVar = nVarArr[i8].f54889t;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= zVar.f55989a) {
                                i9 = -1;
                                break;
                            }
                            if (zVar.f55990b[i9] == yVar) {
                                break;
                            }
                            i9++;
                        }
                        if (i9 != -1) {
                            iArr4[i7] = i8;
                            break;
                        }
                        i8++;
                    }
                }
            }
        }
        this.f54851f.clear();
        int length = bVarArr.length;
        v[] vVarArr3 = new v[length];
        v[] vVarArr4 = new v[bVarArr.length];
        int length2 = bVarArr.length;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr3 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[length2];
        ArrayList arrayList = new ArrayList(this.f54859n.length);
        int i10 = 0;
        boolean z3 = false;
        while (i10 < this.f54859n.length) {
            int i11 = 0;
            while (true) {
                iArr = iArr3;
                if (i11 >= bVarArr.length) {
                    break;
                }
                vVarArr4[i11] = iArr[i11] == i10 ? vVarArr[i11] : null;
                bVarArr3[i11] = iArr4[i11] == i10 ? bVarArr[i11] : null;
                i11++;
                iArr3 = iArr;
            }
            n nVar = this.f54859n[i10];
            boolean z4 = this.f54857l;
            if (nVar.f54884o) {
                int i12 = 0;
                while (i12 < length2) {
                    v vVar2 = vVarArr4[i12];
                    if (vVar2 == null || (bVarArr3[i12] != null && zArr[i12])) {
                        i5 = i12;
                        iArr2 = iArr4;
                    } else {
                        i5 = i12;
                        int i13 = ((k) vVar2).f54867a;
                        iArr2 = iArr4;
                        boolean[] zArr3 = nVar.f54891v;
                        if (zArr3[i13]) {
                            zArr3[i13] = false;
                            nVar.f54885p--;
                            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f54879j.valueAt(i13)).b();
                            vVarArr4[i5] = null;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    i12 = i5 + 1;
                    iArr4 = iArr2;
                }
                int[] iArr5 = iArr4;
                int i14 = 0;
                boolean z5 = false;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar2 = null;
                while (i14 < length2) {
                    if (vVarArr4[i14] == null) {
                        i2 = i14;
                        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar3 = bVarArr3[i2];
                        z2 = z4;
                        if (bVar3 != null) {
                            z zVar2 = nVar.f54889t;
                            vVarArr2 = vVarArr4;
                            y yVar2 = bVar3.f55997a;
                            i3 = length2;
                            bVarArr2 = bVarArr3;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= zVar2.f55989a) {
                                    i15 = -1;
                                    break;
                                }
                                if (zVar2.f55990b[i15] == yVar2) {
                                    break;
                                }
                                i15++;
                            }
                            boolean[] zArr4 = nVar.f54891v;
                            if (!zArr4[i15]) {
                                zArr4[i15] = true;
                                nVar.f54885p++;
                                if (i15 == nVar.f54890u) {
                                    nVar.f54872c.f54821p = bVar3;
                                    bVar2 = bVar3;
                                }
                                vVarArr2[i2] = new k(nVar, i15);
                                zArr2[i2] = true;
                                z5 = true;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        i14 = i2 + 1;
                        z4 = z2;
                        vVarArr4 = vVarArr2;
                        length2 = i3;
                        bVarArr3 = bVarArr2;
                    } else {
                        i2 = i14;
                        z2 = z4;
                    }
                    vVarArr2 = vVarArr4;
                    i3 = length2;
                    bVarArr2 = bVarArr3;
                    i14 = i2 + 1;
                    z4 = z2;
                    vVarArr4 = vVarArr2;
                    length2 = i3;
                    bVarArr3 = bVarArr2;
                }
                v[] vVarArr5 = vVarArr4;
                int i16 = length2;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr4 = bVarArr3;
                if (!z4) {
                    int size = nVar.f54879j.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        if (!nVar.f54891v[i17]) {
                            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f54879j.valueAt(i17)).b();
                        }
                    }
                    if (bVar2 != null && !nVar.f54880k.isEmpty()) {
                        bVar2.d();
                        if (bVar2.f55999c[bVar2.a()] != nVar.f54872c.f54811f.a(((h) nVar.f54880k.getLast()).f55898c)) {
                            nVar.c(nVar.f54892w);
                        }
                    }
                }
                if (nVar.f54885p == 0) {
                    nVar.f54872c.f54815j = null;
                    nVar.f54886q = null;
                    nVar.f54880k.clear();
                    if (nVar.f54876g.a()) {
                        nVar.f54876g.f56016b.a(false);
                    }
                }
                z3 |= z5;
                boolean z6 = false;
                for (int i18 = 0; i18 < bVarArr.length; i18++) {
                    if (iArr5[i18] == i10) {
                        v vVar3 = vVarArr5[i18];
                        if (vVar3 != null) {
                            vVarArr3[i18] = vVar3;
                            this.f54851f.put(vVarArr5[i18], Integer.valueOf(i10));
                            z6 = true;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (iArr[i18] == i10 && vVarArr5[i18] != null) {
                        throw new IllegalStateException();
                    }
                }
                if (z6) {
                    arrayList.add(this.f54859n[i10]);
                }
                i10++;
                iArr3 = iArr;
                iArr4 = iArr5;
                vVarArr4 = vVarArr5;
                length2 = i16;
                bVarArr3 = bVarArr4;
            } else {
                throw new IllegalStateException();
            }
        }
        System.arraycopy(vVarArr3, 0, vVarArr, 0, length);
        n[] nVarArr2 = new n[arrayList.size()];
        this.f54860o = nVarArr2;
        arrayList.toArray(nVarArr2);
        n[] nVarArr3 = this.f54860o;
        if (nVarArr3.length > 0) {
            nVarArr3[0].f54872c.f54813h = true;
            int i19 = 1;
            while (true) {
                n[] nVarArr4 = this.f54860o;
                if (i19 >= nVarArr4.length) {
                    break;
                }
                nVarArr4[i19].f54872c.f54813h = false;
                i19++;
            }
        }
        this.f54861p = new com.fyber.inneractive.sdk.player.exoplayer2.source.h(this.f54860o);
        if (this.f54857l && z3) {
            a(j2);
            for (int i20 = 0; i20 < bVarArr.length; i20++) {
                if (vVarArr[i20] != null) {
                    zArr2[i20] = true;
                }
            }
        }
        this.f54857l = true;
        return j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(long j2) {
        this.f54852g.f54895a.clear();
        for (n nVar : this.f54860o) {
            nVar.c(j2);
        }
        return j2;
    }
}
