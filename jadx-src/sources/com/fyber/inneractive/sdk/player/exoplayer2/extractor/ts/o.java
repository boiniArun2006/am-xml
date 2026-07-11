package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class o implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f55597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f55598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f55599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f55600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f55601e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f55608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f55609m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f55602f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f55603g = new r(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f55604h = new r(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f55605i = new r(34);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f55606j = new r(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f55607k = new r(40);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55610n = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.f55602f);
        r rVar = this.f55603g;
        rVar.f55630b = false;
        rVar.f55631c = false;
        r rVar2 = this.f55604h;
        rVar2.f55630b = false;
        rVar2.f55631c = false;
        r rVar3 = this.f55605i;
        rVar3.f55630b = false;
        rVar3.f55631c = false;
        r rVar4 = this.f55606j;
        rVar4.f55630b = false;
        rVar4.f55631c = false;
        r rVar5 = this.f55607k;
        rVar5.f55630b = false;
        rVar5.f55631c = false;
        n nVar = this.f55600d;
        nVar.f55589f = false;
        nVar.f55590g = false;
        nVar.f55591h = false;
        nVar.f55592i = false;
        nVar.f55593j = false;
        this.f55608l = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    public o(x xVar) {
        this.f55597a = xVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f55598b = e0Var.f55500e;
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f55499d, 2);
        this.f55599c = gVarA;
        this.f55600d = new n(gVarA);
        this.f55597a.a(jVar, e0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8 A[PHI: r12 r15 r17 r18
      0x00a8: PHI (r12v1 int) = (r12v0 int), (r12v0 int), (r12v0 int), (r12v4 int) binds: [B:37:0x00cb, B:39:0x00d1, B:41:0x00d7, B:34:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r15v2 int) = (r15v1 int), (r15v1 int), (r15v1 int), (r15v6 int) binds: [B:37:0x00cb, B:39:0x00d1, B:41:0x00d7, B:34:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r17v1 int) = (r17v0 int), (r17v0 int), (r17v0 int), (r17v3 int) binds: [B:37:0x00cb, B:39:0x00d1, B:41:0x00d7, B:34:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r18v1 long) = (r18v0 long), (r18v0 long), (r18v0 long), (r18v3 long) binds: [B:37:0x00cb, B:39:0x00d1, B:41:0x00d7, B:34:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
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
        long j2;
        int i2;
        int i3;
        int i5;
        int i7;
        byte[] bArr;
        int i8;
        int i9;
        float f3;
        byte[] bArr2;
        long j3;
        int i10;
        boolean z2;
        boolean z3;
        while (true) {
            int i11 = nVar.f56208c;
            int i12 = nVar.f56207b;
            int i13 = i11 - i12;
            if (i13 <= 0) {
                return;
            }
            byte[] bArr3 = nVar.f56206a;
            this.f55608l += (long) i13;
            this.f55599c.a(i13, nVar);
            while (i12 < i11) {
                int iA = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(bArr3, i12, i11, this.f55602f);
                if (iA == i11) {
                    a(bArr3, i12, i11);
                    return;
                }
                int i14 = iA + 3;
                int i15 = (bArr3[i14] & 126) >> 1;
                int i16 = iA - i12;
                if (i16 > 0) {
                    a(bArr3, i12, iA);
                }
                int i17 = i11 - iA;
                long j4 = this.f55608l - ((long) i17);
                int i18 = i16 < 0 ? -i16 : 0;
                long j5 = this.f55609m;
                if (this.f55601e) {
                    n nVar2 = this.f55600d;
                    i3 = 5;
                    if (nVar2.f55593j && nVar2.f55590g) {
                        nVar2.f55596m = nVar2.f55586c;
                        nVar2.f55593j = false;
                    } else if (nVar2.f55591h || nVar2.f55590g) {
                        j2 = j5;
                        if (nVar2.f55592i) {
                            long j6 = nVar2.f55585b;
                            i2 = i17;
                            i5 = i18;
                            nVar2.f55584a.a(nVar2.f55595l, nVar2.f55596m ? 1 : 0, (int) (j6 - nVar2.f55594k), i2 + ((int) (j4 - j6)), null);
                        } else {
                            i2 = i17;
                            i5 = i18;
                        }
                        nVar2.f55594k = nVar2.f55585b;
                        nVar2.f55595l = nVar2.f55588e;
                        nVar2.f55592i = true;
                        nVar2.f55596m = nVar2.f55586c;
                        i7 = i11;
                        bArr = bArr3;
                        i8 = i14;
                        i9 = 16;
                    }
                    i7 = i11;
                    bArr = bArr3;
                    i8 = i14;
                    j2 = j5;
                    i2 = i17;
                    i9 = 16;
                    i5 = i18;
                } else {
                    j2 = j5;
                    i2 = i17;
                    i3 = 5;
                    i5 = i18;
                    this.f55603g.a(i5);
                    this.f55604h.a(i5);
                    this.f55605i.a(i5);
                    r rVar = this.f55603g;
                    if (rVar.f55631c) {
                        r rVar2 = this.f55604h;
                        if (rVar2.f55631c) {
                            r rVar3 = this.f55605i;
                            if (rVar3.f55631c) {
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar4 = this.f55599c;
                                String str = this.f55598b;
                                int i19 = rVar.f55633e;
                                byte[] bArr4 = new byte[rVar2.f55633e + i19 + rVar3.f55633e];
                                i7 = i11;
                                bArr = bArr3;
                                System.arraycopy(rVar.f55632d, 0, bArr4, 0, i19);
                                i8 = i14;
                                System.arraycopy(rVar2.f55632d, 0, bArr4, rVar.f55633e, rVar2.f55633e);
                                System.arraycopy(rVar3.f55632d, 0, bArr4, rVar.f55633e + rVar2.f55633e, rVar3.f55633e);
                                com.fyber.inneractive.sdk.player.exoplayer2.util.o oVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.o(rVar2.f55632d, 0, rVar2.f55633e);
                                oVar.d(44);
                                int i20 = 3;
                                int iB = oVar.b(3);
                                oVar.f();
                                oVar.d(88);
                                oVar.d(8);
                                int i21 = 0;
                                for (int i22 = 0; i22 < iB; i22++) {
                                    if (oVar.c()) {
                                        i21 += 89;
                                    }
                                    if (oVar.c()) {
                                        i21 += 8;
                                    }
                                }
                                oVar.d(i21);
                                int i23 = 2;
                                if (iB > 0) {
                                    oVar.d((8 - iB) * 2);
                                }
                                oVar.d();
                                int iD = oVar.d();
                                if (iD == 3) {
                                    oVar.f();
                                }
                                int iD2 = oVar.d();
                                int iD3 = oVar.d();
                                if (oVar.c()) {
                                    int iD4 = oVar.d();
                                    int iD5 = oVar.d();
                                    int iD6 = oVar.d();
                                    int iD7 = oVar.d();
                                    iD2 -= (iD4 + iD5) * ((iD == 1 || iD == 2) ? 2 : 1);
                                    iD3 -= (iD6 + iD7) * (iD == 1 ? 2 : 1);
                                }
                                int i24 = iD2;
                                int i25 = iD3;
                                oVar.d();
                                oVar.d();
                                int iD8 = oVar.d();
                                for (int i26 = oVar.c() ? 0 : iB; i26 <= iB; i26++) {
                                    oVar.d();
                                    oVar.d();
                                    oVar.d();
                                }
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                if (oVar.c() && oVar.c()) {
                                    int i27 = 0;
                                    while (i27 < 4) {
                                        for (int i28 = 0; i28 < 6; i28 += i27 == i20 ? i20 : 1) {
                                            if (!oVar.c()) {
                                                oVar.d();
                                            } else {
                                                int iMin = Math.min(64, 1 << ((i27 << 1) + 4));
                                                if (i27 > 1) {
                                                    oVar.e();
                                                }
                                                for (int i29 = 0; i29 < iMin; i29++) {
                                                    oVar.e();
                                                }
                                                i20 = 3;
                                            }
                                        }
                                        i27++;
                                        i23 = 2;
                                    }
                                }
                                oVar.d(i23);
                                if (oVar.c()) {
                                    oVar.d(8);
                                    oVar.d();
                                    oVar.d();
                                    oVar.f();
                                }
                                int iD9 = oVar.d();
                                boolean zC2 = false;
                                int i30 = 0;
                                int i31 = 0;
                                while (i31 < iD9) {
                                    if (i31 != 0) {
                                        zC2 = oVar.c();
                                    }
                                    if (zC2) {
                                        oVar.f();
                                        oVar.d();
                                        for (int i32 = 0; i32 <= i30; i32++) {
                                            if (oVar.c()) {
                                                oVar.f();
                                            }
                                        }
                                        bArr2 = bArr4;
                                    } else {
                                        int iD10 = oVar.d();
                                        int iD11 = oVar.d();
                                        int i33 = iD10 + iD11;
                                        bArr2 = bArr4;
                                        for (int i34 = 0; i34 < iD10; i34++) {
                                            oVar.d();
                                            oVar.f();
                                        }
                                        for (int i35 = 0; i35 < iD11; i35++) {
                                            oVar.d();
                                            oVar.f();
                                        }
                                        i30 = i33;
                                    }
                                    i31++;
                                    bArr4 = bArr2;
                                }
                                byte[] bArr5 = bArr4;
                                if (oVar.c()) {
                                    for (int i36 = 0; i36 < oVar.d(); i36++) {
                                        oVar.d(iD8 + 5);
                                    }
                                }
                                oVar.d(2);
                                if (oVar.c() && oVar.c()) {
                                    int iB2 = oVar.b(8);
                                    if (iB2 == 255) {
                                        i9 = 16;
                                        int iB3 = oVar.b(16);
                                        int iB4 = oVar.b(16);
                                        if (iB3 != 0 && iB4 != 0) {
                                            f3 = iB3 / iB4;
                                        }
                                        rVar4.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/hevc", -1, i24, i25, Collections.singletonList(bArr5), -1, f3, null, -1, null, null));
                                        this.f55601e = true;
                                    } else {
                                        i9 = 16;
                                        float[] fArr = com.fyber.inneractive.sdk.player.exoplayer2.util.l.f56199b;
                                        if (iB2 < 17) {
                                            f3 = fArr[iB2];
                                            rVar4.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/hevc", -1, i24, i25, Collections.singletonList(bArr5), -1, f3, null, -1, null, null));
                                            this.f55601e = true;
                                        } else {
                                            Log.w("H265Reader", "Unexpected aspect_ratio_idc value: " + iB2);
                                        }
                                    }
                                } else {
                                    i9 = 16;
                                }
                                f3 = 1.0f;
                                rVar4.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/hevc", -1, i24, i25, Collections.singletonList(bArr5), -1, f3, null, -1, null, null));
                                this.f55601e = true;
                            } else {
                                i7 = i11;
                                bArr = bArr3;
                                i8 = i14;
                                i9 = 16;
                            }
                        }
                    }
                }
                if (this.f55606j.a(i5)) {
                    r rVar5 = this.f55606j;
                    int iA2 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar5.f55633e, rVar5.f55632d);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f55610n;
                    nVar3.f56206a = this.f55606j.f55632d;
                    nVar3.f56208c = iA2;
                    nVar3.f56207b = 0;
                    nVar3.e(i3);
                    j3 = j2;
                    com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j3, this.f55610n, this.f55597a.f55667b);
                } else {
                    j3 = j2;
                }
                if (this.f55607k.a(i5)) {
                    r rVar6 = this.f55607k;
                    int iA3 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar6.f55633e, rVar6.f55632d);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.f55610n;
                    nVar4.f56206a = this.f55607k.f55632d;
                    nVar4.f56208c = iA3;
                    nVar4.f56207b = 0;
                    nVar4.e(5);
                    com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j3, this.f55610n, this.f55597a.f55667b);
                }
                long j7 = this.f55609m;
                if (this.f55601e) {
                    n nVar5 = this.f55600d;
                    nVar5.f55590g = false;
                    nVar5.f55591h = false;
                    nVar5.f55588e = j7;
                    nVar5.f55587d = 0;
                    nVar5.f55585b = j4;
                    if (i15 >= 32) {
                        if (nVar5.f55593j || !nVar5.f55592i) {
                            i10 = i9;
                            z2 = false;
                        } else {
                            i10 = i9;
                            z2 = false;
                            nVar5.f55584a.a(nVar5.f55595l, nVar5.f55596m ? 1 : 0, (int) (j4 - nVar5.f55594k), i2, null);
                            nVar5.f55592i = false;
                        }
                        if (i15 <= 34) {
                            z3 = true;
                            nVar5.f55591h = !nVar5.f55593j;
                            nVar5.f55593j = true;
                        }
                        boolean z4 = (i15 >= i10 || i15 > 21) ? z2 : z3;
                        nVar5.f55586c = z4;
                        nVar5.f55589f = (!z4 || i15 <= 9) ? z3 : z2;
                    } else {
                        i10 = i9;
                        z2 = false;
                    }
                    z3 = true;
                    if (i15 >= i10) {
                        nVar5.f55586c = z4;
                        if (z4) {
                            nVar5.f55589f = (!z4 || i15 <= 9) ? z3 : z2;
                        }
                    }
                } else {
                    this.f55603g.b(i15);
                    this.f55604h.b(i15);
                    this.f55605i.b(i15);
                }
                this.f55606j.b(i15);
                this.f55607k.b(i15);
                i12 = i8;
                i11 = i7;
                bArr3 = bArr;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z2, long j2) {
        this.f55609m = j2;
    }

    public final void a(byte[] bArr, int i2, int i3) {
        if (this.f55601e) {
            n nVar = this.f55600d;
            if (nVar.f55589f) {
                int i5 = nVar.f55587d;
                int i7 = (i2 + 2) - i5;
                if (i7 < i3) {
                    nVar.f55590g = (bArr[i7] & ByteCompanionObject.MIN_VALUE) != 0;
                    nVar.f55589f = false;
                } else {
                    nVar.f55587d = (i3 - i2) + i5;
                }
            }
        } else {
            this.f55603g.a(bArr, i2, i3);
            this.f55604h.a(bArr, i2, i3);
            this.f55605i.a(bArr, i2, i3);
        }
        this.f55606j.a(bArr, i2, i3);
        this.f55607k.a(bArr, i2, i3);
    }
}
