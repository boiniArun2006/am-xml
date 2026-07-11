package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Pair;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j implements h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final double[] f55522n = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f55523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f55524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f55525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f55526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f55527e = new boolean[4];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f55528f = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f55529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f55530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f55531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f55532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f55533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f55534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f55535m;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.f55527e);
        i iVar = this.f55528f;
        iVar.f55518a = false;
        iVar.f55519b = 0;
        iVar.f55520c = 0;
        this.f55532j = false;
        this.f55529g = false;
        this.f55530h = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f55523a = e0Var.f55500e;
        e0Var.b();
        this.f55524b = jVar.a(e0Var.f55499d, 2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z2, long j2) {
        boolean z3 = j2 != -9223372036854775807L;
        this.f55532j = z3;
        if (z3) {
            this.f55531i = j2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
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
        boolean z2;
        float f3;
        int i2;
        float f4;
        int i3;
        long j2;
        int i5 = nVar.f56207b;
        int i7 = nVar.f56208c;
        byte[] bArr = nVar.f56206a;
        int i8 = i7 - i5;
        this.f55530h += (long) i8;
        this.f55524b.a(i8, nVar);
        int i9 = i5;
        while (true) {
            int iA = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(bArr, i5, i7, this.f55527e);
            if (iA == i7) {
                break;
            }
            int i10 = iA + 3;
            boolean z3 = nVar.f56206a[i10] & UByte.MAX_VALUE;
            if (!this.f55525c) {
                int i11 = iA - i9;
                if (i11 > 0) {
                    i iVar = this.f55528f;
                    if (iVar.f55518a) {
                        byte[] bArr2 = iVar.f55521d;
                        int length = bArr2.length;
                        int i12 = iVar.f55519b + i11;
                        if (length < i12) {
                            iVar.f55521d = Arrays.copyOf(bArr2, i12 * 2);
                        }
                        System.arraycopy(bArr, i9, iVar.f55521d, iVar.f55519b, i11);
                        iVar.f55519b += i11;
                    }
                }
                int i13 = i11 < 0 ? -i11 : 0;
                i iVar2 = this.f55528f;
                if (iVar2.f55518a) {
                    if (iVar2.f55520c == 0 && z3 == 181) {
                        iVar2.f55520c = iVar2.f55519b;
                    } else {
                        int i14 = iVar2.f55519b - i13;
                        iVar2.f55519b = i14;
                        iVar2.f55518a = false;
                        String str = this.f55523a;
                        byte[] bArrCopyOf = Arrays.copyOf(iVar2.f55521d, i14);
                        int i15 = bArrCopyOf[4] & UByte.MAX_VALUE;
                        byte b2 = bArrCopyOf[5];
                        int i16 = (i15 << 4) | ((b2 & UByte.MAX_VALUE) >> 4);
                        int i17 = ((b2 & 15) << 8) | (bArrCopyOf[6] & UByte.MAX_VALUE);
                        int i18 = (bArrCopyOf[7] & 240) >> 4;
                        if (i18 == 2) {
                            f3 = i17 * 4;
                            i2 = i16 * 3;
                        } else if (i18 == 3) {
                            f3 = i17 * 16;
                            i2 = i16 * 9;
                        } else if (i18 != 4) {
                            f4 = 1.0f;
                            com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/mpeg2", -1, i16, i17, Collections.singletonList(bArrCopyOf), -1, f4, null, -1, null, null);
                            i3 = (bArrCopyOf[7] & 15) - 1;
                            if (i3 < 0) {
                                double[] dArr = f55522n;
                                if (i3 < 8) {
                                    double d2 = dArr[i3];
                                    byte b4 = bArrCopyOf[iVar2.f55520c + 9];
                                    int i19 = (b4 & 96) >> 5;
                                    int i20 = b4 & 31;
                                    if (i19 != i20) {
                                        d2 *= (((double) i19) + 1.0d) / ((double) (i20 + 1));
                                    }
                                    j2 = (long) (1000000.0d / d2);
                                } else {
                                    j2 = 0;
                                }
                                Pair pairCreate = Pair.create(oVarA, Long.valueOf(j2));
                                this.f55524b.a((com.fyber.inneractive.sdk.player.exoplayer2.o) pairCreate.first);
                                this.f55526d = ((Long) pairCreate.second).longValue();
                                this.f55525c = true;
                            }
                        } else {
                            f3 = i17 * Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                            i2 = i16 * 100;
                        }
                        f4 = f3 / i2;
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA2 = com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/mpeg2", -1, i16, i17, Collections.singletonList(bArrCopyOf), -1, f4, null, -1, null, null);
                        i3 = (bArrCopyOf[7] & 15) - 1;
                        if (i3 < 0) {
                        }
                    }
                } else if (z3 == 179) {
                    iVar2.f55518a = true;
                }
            }
            if (this.f55525c && (z3 == 184 || z3 == 0)) {
                int i21 = i7 - iA;
                if (this.f55529g) {
                    this.f55524b.a(this.f55535m, this.f55533k ? 1 : 0, ((int) (this.f55530h - this.f55534l)) - i21, i21, null);
                    z2 = false;
                    this.f55533k = false;
                } else {
                    z2 = false;
                }
                if (z3 == 184) {
                    this.f55529g = z2;
                    this.f55533k = true;
                } else {
                    this.f55535m = this.f55532j ? this.f55531i : this.f55535m + this.f55526d;
                    this.f55534l = this.f55530h - ((long) i21);
                    this.f55532j = false;
                    this.f55529g = true;
                }
            }
            i9 = iA;
            i5 = i10;
        }
        if (this.f55525c) {
            return;
        }
        i iVar3 = this.f55528f;
        if (iVar3.f55518a) {
            int i22 = i7 - i9;
            byte[] bArr3 = iVar3.f55521d;
            int length2 = bArr3.length;
            int i23 = iVar3.f55519b + i22;
            if (length2 < i23) {
                iVar3.f55521d = Arrays.copyOf(bArr3, i23 * 2);
            }
            System.arraycopy(bArr, i9, iVar3.f55521d, iVar3.f55519b, i22);
            iVar3.f55519b += i22;
        }
    }
}
