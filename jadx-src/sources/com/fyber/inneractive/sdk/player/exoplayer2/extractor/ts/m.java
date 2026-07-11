package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class m implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f55570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55572c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f55576g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f55578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f55579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f55580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f55581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f55582m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f55577h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f55573d = new r(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f55574e = new r(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f55575f = new r(6);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55583n = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.f55577h);
        r rVar = this.f55573d;
        rVar.f55630b = false;
        rVar.f55631c = false;
        r rVar2 = this.f55574e;
        rVar2.f55630b = false;
        rVar2.f55631c = false;
        r rVar3 = this.f55575f;
        rVar3.f55630b = false;
        rVar3.f55631c = false;
        l lVar = this.f55580k;
        lVar.f55562k = false;
        lVar.f55566o = false;
        k kVar = lVar.f55565n;
        kVar.f55537b = false;
        kVar.f55536a = false;
        this.f55576g = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    public m(x xVar, boolean z2, boolean z3) {
        this.f55570a = xVar;
        this.f55571b = z2;
        this.f55572c = z3;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f55578i = e0Var.f55500e;
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f55499d, 2);
        this.f55579j = gVarA;
        this.f55580k = new l(gVarA, this.f55571b, this.f55572c);
        this.f55570a.a(jVar, e0Var);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z2, long j2) {
        this.f55582m = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0241  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i2;
        int i3;
        int i5;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        boolean z4;
        int i11 = nVar.f56207b;
        int i12 = nVar.f56208c;
        byte[] bArr = nVar.f56206a;
        int i13 = i12 - i11;
        this.f55576g += (long) i13;
        this.f55579j.a(i13, nVar);
        while (true) {
            int iA = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(bArr, i11, i12, this.f55577h);
            if (iA == i12) {
                break;
            }
            int i14 = iA + 3;
            int i15 = bArr[i14] & 31;
            int i16 = iA - i11;
            if (i16 > 0) {
                if (!this.f55581l || this.f55580k.f55554c) {
                    this.f55573d.a(bArr, i11, iA);
                    this.f55574e.a(bArr, i11, iA);
                }
                this.f55575f.a(bArr, i11, iA);
                this.f55580k.a(bArr, i11, iA);
            }
            int i17 = i12 - iA;
            long j2 = this.f55576g - ((long) i17);
            int i18 = i16 < 0 ? -i16 : 0;
            long j3 = this.f55582m;
            if (!this.f55581l || this.f55580k.f55554c) {
                this.f55573d.a(i18);
                this.f55574e.a(i18);
                if (!this.f55581l) {
                    if (this.f55573d.f55631c && this.f55574e.f55631c) {
                        ArrayList arrayList = new ArrayList();
                        r rVar = this.f55573d;
                        arrayList.add(Arrays.copyOf(rVar.f55632d, rVar.f55633e));
                        r rVar2 = this.f55574e;
                        arrayList.add(Arrays.copyOf(rVar2.f55632d, rVar2.f55633e));
                        r rVar3 = this.f55573d;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.k kVarA = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar3.f55632d, 3, rVar3.f55633e);
                        r rVar4 = this.f55574e;
                        i2 = i17;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.o oVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.o(rVar4.f55632d, 3, rVar4.f55633e);
                        oVar.d(8);
                        int iD = oVar.d();
                        int iD2 = oVar.d();
                        oVar.f();
                        com.fyber.inneractive.sdk.player.exoplayer2.util.j jVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.j(oVar.c(), iD, iD2);
                        i3 = i12;
                        this.f55579j.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f55578i, "video/avc", -1, kVarA.f56189b, kVarA.f56190c, arrayList, -1, kVarA.f56191d, null, -1, null, null));
                        this.f55581l = true;
                        this.f55580k.f55555d.append(kVarA.f56188a, kVarA);
                        this.f55580k.f55556e.append(iD, jVar);
                        r rVar5 = this.f55573d;
                        rVar5.f55630b = false;
                        rVar5.f55631c = false;
                        r rVar6 = this.f55574e;
                        rVar6.f55630b = false;
                        rVar6.f55631c = false;
                    } else {
                        i2 = i17;
                        i3 = i12;
                    }
                } else {
                    i2 = i17;
                    i3 = i12;
                    r rVar7 = this.f55573d;
                    if (rVar7.f55631c) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.k kVarA2 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar7.f55632d, 3, rVar7.f55633e);
                        this.f55580k.f55555d.append(kVarA2.f56188a, kVarA2);
                        r rVar8 = this.f55573d;
                        rVar8.f55630b = false;
                        rVar8.f55631c = false;
                    } else {
                        r rVar9 = this.f55574e;
                        if (rVar9.f55631c) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.o oVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.util.o(rVar9.f55632d, 3, rVar9.f55633e);
                            oVar2.d(8);
                            int iD3 = oVar2.d();
                            int iD4 = oVar2.d();
                            oVar2.f();
                            this.f55580k.f55556e.append(iD3, new com.fyber.inneractive.sdk.player.exoplayer2.util.j(oVar2.c(), iD3, iD4));
                            r rVar10 = this.f55574e;
                            rVar10.f55630b = false;
                            rVar10.f55631c = false;
                        }
                    }
                }
            }
            if (this.f55575f.a(i18)) {
                r rVar11 = this.f55575f;
                int iA2 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar11.f55633e, rVar11.f55632d);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f55583n;
                nVar2.f56206a = this.f55575f.f55632d;
                nVar2.f56208c = iA2;
                nVar2.f56207b = 0;
                nVar2.e(4);
                com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j3, this.f55583n, this.f55570a.f55667b);
            }
            l lVar = this.f55580k;
            if (lVar.f55560i != 9) {
                if (lVar.f55554c) {
                    k kVar = lVar.f55565n;
                    k kVar2 = lVar.f55564m;
                    if (!kVar.f55536a || (kVar2.f55536a && kVar.f55541f == kVar2.f55541f && kVar.f55542g == kVar2.f55542g && kVar.f55543h == kVar2.f55543h && ((!kVar.f55544i || !kVar2.f55544i || kVar.f55545j == kVar2.f55545j) && (((i8 = kVar.f55539d) == (i9 = kVar2.f55539d) || (i8 != 0 && i9 != 0)) && (((i10 = kVar.f55538c.f56195h) != 0 || kVar2.f55538c.f56195h != 0 || (kVar.f55548m == kVar2.f55548m && kVar.f55549n == kVar2.f55549n)) && ((i10 != 1 || kVar2.f55538c.f56195h != 1 || (kVar.f55550o == kVar2.f55550o && kVar.f55551p == kVar2.f55551p)) && (z3 = kVar.f55546k) == (z4 = kVar2.f55546k) && (!z3 || !z4 || kVar.f55547l == kVar2.f55547l))))))) {
                    }
                }
                i5 = 1;
            } else {
                if (lVar.f55566o) {
                    long j4 = lVar.f55561j;
                    lVar.f55552a.a(lVar.f55568q, lVar.f55569r ? 1 : 0, (int) (j4 - lVar.f55567p), i2 + ((int) (j2 - j4)), null);
                }
                lVar.f55567p = lVar.f55561j;
                lVar.f55568q = lVar.f55563l;
                lVar.f55569r = false;
                i5 = 1;
                lVar.f55566o = true;
            }
            boolean z5 = lVar.f55569r;
            int i19 = lVar.f55560i;
            if (i19 == 5) {
                z2 = true;
            } else {
                if (lVar.f55553b && i19 == i5) {
                    k kVar3 = lVar.f55565n;
                    if (!kVar3.f55537b || ((i7 = kVar3.f55540e) != 7 && i7 != 2)) {
                    }
                }
                z2 = false;
            }
            lVar.f55569r = z5 | z2;
            long j5 = this.f55582m;
            if (!this.f55581l || this.f55580k.f55554c) {
                this.f55573d.b(i15);
                this.f55574e.b(i15);
            }
            this.f55575f.b(i15);
            l lVar2 = this.f55580k;
            lVar2.f55560i = i15;
            lVar2.f55563l = j5;
            lVar2.f55561j = j2;
            if ((lVar2.f55553b && i15 == 1) || (lVar2.f55554c && (i15 == 5 || i15 == 1 || i15 == 2))) {
                k kVar4 = lVar2.f55564m;
                lVar2.f55564m = lVar2.f55565n;
                lVar2.f55565n = kVar4;
                kVar4.f55537b = false;
                kVar4.f55536a = false;
                lVar2.f55559h = 0;
                lVar2.f55562k = true;
            }
            i11 = i14;
            i12 = i3;
        }
        if (!this.f55581l || this.f55580k.f55554c) {
            this.f55573d.a(bArr, i11, i12);
            this.f55574e.a(bArr, i11, i12);
        }
        this.f55575f.a(bArr, i11, i12);
        this.f55580k.a(bArr, i11, i12);
    }
}
