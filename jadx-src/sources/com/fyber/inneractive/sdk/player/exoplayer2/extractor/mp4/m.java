package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.vungle.ads.internal.protos.Sdk;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class m implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f55226A = z.a("seig");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final byte[] f55227B = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.v f55233f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f55239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f55240m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.n f55242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f55243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f55244q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l f55247t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f55248u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f55249v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f55250w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f55251x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f55252y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f55253z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55234g = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55229b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(com.fyber.inneractive.sdk.player.exoplayer2.util.l.f56198a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55230c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55231d = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55232e = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f55235h = new byte[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Stack f55236i = new Stack();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedList f55237j = new LinkedList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f55228a = new SparseArray();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f55245r = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f55246s = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f55238k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f55241n = 0;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return r.a(bVar, true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f55252y = jVar;
    }

    public m(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar) {
        this.f55233f = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j2, long j3) {
        int size = this.f55228a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((l) this.f55228a.valueAt(i2)).a();
        }
        this.f55237j.clear();
        this.f55244q = 0;
        this.f55236i.clear();
        this.f55238k = 0;
        this.f55241n = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        r2 = r27.f55247t;
        r3 = r2.f55219a;
        r4 = r3.f55325h;
        r9 = r2.f55223e;
        r27.f55248u = r4[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        if (r3.f55329l == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        r4 = r3.f55333p;
        r10 = r3.f55318a.f55213a;
        r11 = r3.f55331n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        if (r11 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        r11 = r2.f55221c.f55312h[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        r10 = r11.f55316a;
        r3 = r3.f55330m[r9];
        r9 = r27.f55232e;
        r11 = r9.f56206a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:
    
        if (r3 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
    
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        r11[0] = (byte) (r12 | r10);
        r9.e(0);
        r2 = r2.f55220b;
        r2.a(1, r27.f55232e);
        r2.a(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        if (r3 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        r3 = r4.o();
        r4.e(r4.f56207b - 2);
        r3 = (r3 * 6) + 2;
        r2.a(r3, r4);
        r10 = (r10 + 1) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
    
        r27.f55249v = r10;
        r27.f55248u += r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:
    
        r27.f55249v = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ed, code lost:
    
        if (r27.f55247t.f55221c.f55311g != 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ef, code lost:
    
        r27.f55248u -= 8;
        r28.a(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f7, code lost:
    
        r27.f55238k = 4;
        r27.f55250w = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        r2 = r27.f55247t;
        r3 = r2.f55219a;
        r4 = r2.f55221c;
        r9 = r2.f55220b;
        r2 = r2.f55223e;
        r5 = r4.f55315k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010a, code lost:
    
        if (r5 == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010c, code lost:
    
        r12 = r27.f55230c.f56206a;
        r12[0] = 0;
        r12[1] = 0;
        r12[r29] = 0;
        r13 = r5 + 1;
        r5 = 4 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011e, code lost:
    
        if (r27.f55249v >= r27.f55248u) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
    
        r14 = r27.f55250w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0122, code lost:
    
        if (r14 != 0) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0124, code lost:
    
        r28.b(r12, r5, r13, r7);
        r27.f55230c.e(r7 ? 1 : 0);
        r27.f55250w = r27.f55230c.m() - r6;
        r27.f55229b.e(r7 ? 1 : 0);
        r9.a(r8, r27.f55229b);
        r9.a(r6, r27.f55230c);
        r27.f55251x = r7;
        r27.f55249v += 5;
        r27.f55248u += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0154, code lost:
    
        if (r27.f55251x == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0156, code lost:
    
        r27.f55231d.c(r14);
        r28.b(r27.f55231d.f56206a, r7 ? 1 : 0, r27.f55250w, r7);
        r9.a(r27.f55250w, r27.f55231d);
        r14 = r27.f55250w;
        r15 = r27.f55231d;
        r18 = r8;
        r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(r15.f56208c, r15.f56206a);
        r27.f55231d.e("video/hevc".equals(r4.f55310f.f55858f) ? 1 : 0);
        r27.f55231d.d(r8);
        r21 = r6;
        com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a((r3.f55327j[r2] + ((long) r3.f55326i[r2])) * 1000, r27.f55231d, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a4, code lost:
    
        r21 = r6;
        r18 = r8;
        r14 = r9.a(r28, r14, r7 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01af, code lost:
    
        r27.f55249v += r14;
        r27.f55250w -= r14;
        r8 = r18;
        r6 = r21;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c0, code lost:
    
        r19 = 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c5, code lost:
    
        r19 = 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c9, code lost:
    
        r5 = r27.f55249v;
        r6 = r27.f55248u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01cd, code lost:
    
        if (r5 >= r6) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01cf, code lost:
    
        r27.f55249v += r9.a(r28, r6 - r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01db, code lost:
    
        r5 = (r3.f55327j[r2] + ((long) r3.f55326i[r2])) * r19;
        r1 = r3.f55329l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e9, code lost:
    
        if (r1 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01eb, code lost:
    
        r7 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ee, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ef, code lost:
    
        r12 = r7 | (r3.f55328k[r2] ? 1 : 0);
        r2 = r3.f55318a.f55213a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01f9, code lost:
    
        if (r1 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01fb, code lost:
    
        r1 = r3.f55331n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fd, code lost:
    
        if (r1 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ff, code lost:
    
        r1 = r1.f55317b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0201, code lost:
    
        r15 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0203, code lost:
    
        r1 = r4.f55312h[r2].f55317b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x020a, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x020b, code lost:
    
        r1 = r27.f55233f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020d, code lost:
    
        if (r1 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020f, code lost:
    
        r5 = r1.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0213, code lost:
    
        r9.a(r5, r12, r27.f55248u, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0220, code lost:
    
        if (r27.f55237j.isEmpty() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0222, code lost:
    
        r1 = r27.f55247t;
        r1.f55223e++;
        r2 = r1.f55224f + 1;
        r1.f55224f = r2;
        r3 = r3.f55324g;
        r4 = r1.f55225g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0236, code lost:
    
        if (r2 != r3[r4]) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0238, code lost:
    
        r1.f55225g = r4 + 1;
        r5 = 0;
        r1.f55224f = 0;
        r27.f55247t = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0244, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0246, code lost:
    
        r27.f55238k = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0248, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0249, code lost:
    
        r27.f55244q -= ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k) r27.f55237j.removeFirst()).f55218b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x025a, code lost:
    
        throw null;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        char c2;
        long jN;
        long jN2;
        while (true) {
            int i2 = this.f55238k;
            char c4 = 2;
            int i3 = 1;
            boolean z2 = false;
            if (i2 != 0) {
                int i5 = 4;
                if (i2 != 1) {
                    long j2 = Long.MAX_VALUE;
                    if (i2 != 2) {
                        if (i2 != 3) {
                            c2 = 2;
                            break;
                        }
                        if (this.f55247t != null) {
                            c2 = 2;
                            break;
                        }
                        SparseArray sparseArray = this.f55228a;
                        int size = sparseArray.size();
                        int i7 = 0;
                        l lVar = null;
                        while (i7 < size) {
                            l lVar2 = (l) sparseArray.valueAt(i7);
                            char c5 = c4;
                            int i8 = lVar2.f55225g;
                            u uVar = lVar2.f55219a;
                            if (i8 != uVar.f55321d) {
                                long j3 = uVar.f55323f[i8];
                                if (j3 < j2) {
                                    j2 = j3;
                                    lVar = lVar2;
                                }
                            }
                            i7++;
                            c4 = c5;
                        }
                        c2 = c4;
                        if (lVar == null) {
                            int i9 = (int) (this.f55243p - bVar.f54726c);
                            if (i9 >= 0) {
                                bVar.a(i9);
                                this.f55238k = 0;
                                this.f55241n = 0;
                            } else {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Offset to end of mdat was negative.");
                            }
                        } else {
                            int i10 = (int) (lVar.f55219a.f55323f[lVar.f55225g] - bVar.f54726c);
                            if (i10 < 0) {
                                Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                i10 = 0;
                            }
                            bVar.a(i10);
                            this.f55247t = lVar;
                        }
                    } else {
                        int size2 = this.f55228a.size();
                        l lVar3 = null;
                        for (int i11 = 0; i11 < size2; i11++) {
                            u uVar2 = ((l) this.f55228a.valueAt(i11)).f55219a;
                            if (uVar2.f55334q) {
                                long j4 = uVar2.f55320c;
                                if (j4 < j2) {
                                    lVar3 = (l) this.f55228a.valueAt(i11);
                                    j2 = j4;
                                }
                            }
                        }
                        if (lVar3 == null) {
                            this.f55238k = 3;
                        } else {
                            int i12 = (int) (j2 - bVar.f54726c);
                            if (i12 >= 0) {
                                bVar.a(i12);
                                u uVar3 = lVar3.f55219a;
                                bVar.b(uVar3.f55333p.f56206a, 0, uVar3.f55332o, false);
                                uVar3.f55333p.e(0);
                                uVar3.f55334q = false;
                            } else {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Offset to encryption data was negative.");
                            }
                        }
                    }
                } else {
                    int i13 = ((int) this.f55240m) - this.f55241n;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f55242o;
                    if (nVar != null) {
                        bVar.b(nVar.f56206a, 8, i13, false);
                        int i14 = this.f55239l;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f55242o;
                        b bVar2 = new b(i14, nVar2);
                        long j5 = bVar.f54726c;
                        if (!this.f55236i.isEmpty()) {
                            ((a) this.f55236i.peek()).Q0.add(bVar2);
                        } else if (i14 == c.f55126B) {
                            nVar2.e(8);
                            int iB = (nVar2.b() >> 24) & 255;
                            nVar2.e(nVar2.f56207b + 4);
                            long jK = nVar2.k();
                            if (iB == 0) {
                                jN = nVar2.k();
                                jN2 = nVar2.k();
                            } else {
                                jN = nVar2.n();
                                jN2 = nVar2.n();
                            }
                            long j6 = jN2 + j5;
                            long j7 = jN;
                            long j9 = j6;
                            long jA = z.a(j7, 1000000L, jK);
                            nVar2.e(nVar2.f56207b + 2);
                            int iO = nVar2.o();
                            int[] iArr = new int[iO];
                            long[] jArr = new long[iO];
                            long[] jArr2 = new long[iO];
                            long[] jArr3 = new long[iO];
                            long jA2 = jA;
                            long j10 = j7;
                            int i15 = 0;
                            while (i15 < iO) {
                                int iB2 = nVar2.b();
                                if ((iB2 & Integer.MIN_VALUE) == 0) {
                                    long jK2 = nVar2.k();
                                    iArr[i15] = iB2 & Integer.MAX_VALUE;
                                    jArr[i15] = j9;
                                    jArr3[i15] = jA2;
                                    long j11 = j10 + jK2;
                                    long[] jArr4 = jArr2;
                                    long[] jArr5 = jArr3;
                                    int i16 = i15;
                                    jA2 = z.a(j11, 1000000L, jK);
                                    jArr4[i16] = jA2 - jArr5[i16];
                                    nVar2.e(nVar2.f56207b + 4);
                                    long j12 = j9 + ((long) iArr[i16]);
                                    i15 = i16 + 1;
                                    j10 = j11;
                                    jArr2 = jArr4;
                                    jArr3 = jArr5;
                                    j9 = j12;
                                } else {
                                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unhandled indirect reference");
                                }
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jA), new com.fyber.inneractive.sdk.player.exoplayer2.extractor.a(iArr, jArr, jArr2, jArr3));
                            this.f55246s = ((Long) pairCreate.first).longValue();
                            this.f55252y.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.q) pairCreate.second);
                            this.f55253z = true;
                        }
                    } else {
                        bVar.a(i13);
                    }
                    a(bVar.f54726c);
                }
            } else {
                if (this.f55241n == 0) {
                    if (!bVar.b(this.f55234g.f56206a, 0, 8, true)) {
                        return -1;
                    }
                    this.f55241n = 8;
                    this.f55234g.e(0);
                    this.f55240m = this.f55234g.k();
                    this.f55239l = this.f55234g.b();
                }
                if (this.f55240m == 1) {
                    bVar.b(this.f55234g.f56206a, 8, 8, false);
                    this.f55241n += 8;
                    this.f55240m = this.f55234g.n();
                }
                long j13 = this.f55240m;
                long j14 = this.f55241n;
                if (j13 >= j14) {
                    long j15 = bVar.f54726c - j14;
                    if (this.f55239l == c.f55138L) {
                        int size3 = this.f55228a.size();
                        for (int i17 = 0; i17 < size3; i17++) {
                            u uVar4 = ((l) this.f55228a.valueAt(i17)).f55219a;
                            uVar4.getClass();
                            uVar4.f55320c = j15;
                            uVar4.f55319b = j15;
                        }
                    }
                    int i18 = this.f55239l;
                    if (i18 == c.f55162i) {
                        this.f55247t = null;
                        this.f55243p = j15 + this.f55240m;
                        if (!this.f55253z) {
                            this.f55252y.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(this.f55245r));
                            this.f55253z = true;
                        }
                        this.f55238k = 2;
                    } else if (i18 != c.f55127C && i18 != c.f55129E && i18 != c.f55130F && i18 != c.f55131G && i18 != c.f55132H && i18 != c.f55138L && i18 != c.f55139M && i18 != c.f55140N && i18 != c.f55143Q) {
                        if (i18 == c.f55146T || i18 == c.f55145S || i18 == c.f55128D || i18 == c.f55126B || i18 == c.f55147U || i18 == c.f55179x || i18 == c.f55181y || i18 == c.f55142P || i18 == c.f55182z || i18 == c.f55125A || i18 == c.f55148V || i18 == c.d0 || i18 == c.e0 || i18 == c.i0 || i18 == c.h0 || i18 == c.f0 || i18 == c.f55160g0 || i18 == c.f55144R || i18 == c.f55141O || i18 == c.G0) {
                            if (this.f55241n == 8) {
                                long j16 = this.f55240m;
                                if (j16 <= 2147483647L) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.util.n((int) j16);
                                    this.f55242o = nVar3;
                                    System.arraycopy(this.f55234g.f56206a, 0, nVar3.f56206a, 0, 8);
                                    this.f55238k = 1;
                                } else {
                                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Leaf atom with length > 2147483647 (unsupported).");
                                }
                            } else {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Leaf atom defines extended atom size (unsupported).");
                            }
                        } else if (this.f55240m <= 2147483647L) {
                            this.f55242o = null;
                            this.f55238k = 1;
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Skipping atom with length > 2147483647 (unsupported).");
                        }
                    } else {
                        long j17 = (bVar.f54726c + this.f55240m) - 8;
                        this.f55236i.add(new a(this.f55239l, j17));
                        if (this.f55240m == this.f55241n) {
                            a(j17);
                        } else {
                            this.f55238k = 0;
                            this.f55241n = 0;
                        }
                    }
                } else {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Atom size less than header length (unsupported).");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j2) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        s sVarA;
        int i2;
        SparseArray sparseArray;
        int i3;
        int i5;
        int i7;
        int i8;
        int size;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList;
        long j3;
        int i12;
        boolean z2;
        long j4;
        int i13;
        long j5;
        int iM;
        int i14;
        int iB;
        int i15;
        j jVar;
        int i16;
        while (!this.f55236i.isEmpty() && ((a) this.f55236i.peek()).P0 == j2) {
            a aVar = (a) this.f55236i.pop();
            int i17 = aVar.f55183a;
            int i18 = 12;
            int i19 = 8;
            int i20 = 1;
            if (i17 == c.f55127C) {
                com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVarA = a(aVar.Q0);
                a aVarB = aVar.b(c.f55140N);
                SparseArray sparseArray2 = new SparseArray();
                int size2 = aVarB.Q0.size();
                long jK = -9223372036854775807L;
                int i21 = 0;
                while (i21 < size2) {
                    b bVar = (b) aVarB.Q0.get(i21);
                    int i22 = bVar.f55183a;
                    if (i22 == c.f55182z) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = bVar.P0;
                        nVar.e(i18);
                        i2 = i20;
                        Pair pairCreate = Pair.create(Integer.valueOf(nVar.b()), new j(nVar.m() - i20, nVar.m(), nVar.m(), nVar.b()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (j) pairCreate.second);
                    } else {
                        i2 = i20;
                        if (i22 == c.f55141O) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = bVar.P0;
                            nVar2.e(8);
                            jK = ((nVar2.b() >> 24) & 255) == 0 ? nVar2.k() : nVar2.n();
                        }
                    }
                    i21++;
                    i20 = i2;
                    i18 = 12;
                }
                SparseArray sparseArray3 = new SparseArray();
                int size3 = aVar.f55124R0.size();
                for (int i23 = 0; i23 < size3; i23++) {
                    a aVar2 = (a) aVar.f55124R0.get(i23);
                    if (aVar2.f55183a == c.f55129E && (sVarA = i.a(aVar2, aVar.c(c.f55128D), jK, dVarA, false)) != null) {
                        sparseArray3.put(sVarA.f55305a, sVarA);
                    }
                }
                int size4 = sparseArray3.size();
                if (this.f55228a.size() == 0) {
                    for (int i24 = 0; i24 < size4; i24++) {
                        s sVar = (s) sparseArray3.valueAt(i24);
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = this.f55252y.a(i24, sVar.f55306b);
                        l lVar = new l(gVarA);
                        j jVar2 = (j) sparseArray2.get(sVar.f55305a);
                        lVar.f55221c = sVar;
                        jVar2.getClass();
                        lVar.f55222d = jVar2;
                        gVarA.a(sVar.f55310f);
                        lVar.a();
                        this.f55228a.put(sVar.f55305a, lVar);
                        this.f55245r = Math.max(this.f55245r, sVar.f55309e);
                    }
                    this.f55252y.b();
                } else {
                    if (this.f55228a.size() != size4) {
                        throw new IllegalStateException();
                    }
                    for (int i25 = 0; i25 < size4; i25++) {
                        s sVar2 = (s) sparseArray3.valueAt(i25);
                        l lVar2 = (l) this.f55228a.get(sVar2.f55305a);
                        j jVar3 = (j) sparseArray2.get(sVar2.f55305a);
                        lVar2.getClass();
                        lVar2.f55221c = sVar2;
                        jVar3.getClass();
                        lVar2.f55222d = jVar3;
                        lVar2.f55220b.a(sVar2.f55310f);
                        lVar2.a();
                    }
                }
            } else {
                int i26 = 1;
                if (i17 == c.f55138L) {
                    SparseArray sparseArray4 = this.f55228a;
                    byte[] bArr = this.f55235h;
                    int size5 = aVar.f55124R0.size();
                    int i27 = 0;
                    while (i27 < size5) {
                        a aVar3 = (a) aVar.f55124R0.get(i27);
                        if (aVar3.f55183a == c.f55139M) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = aVar3.c(c.f55181y).P0;
                            nVar3.e(i19);
                            int iB2 = nVar3.b();
                            l lVar3 = (l) sparseArray4.get(nVar3.b());
                            if (lVar3 == null) {
                                lVar3 = null;
                            } else {
                                if ((iB2 & 1) != 0) {
                                    long jN = nVar3.n();
                                    u uVar = lVar3.f55219a;
                                    uVar.f55319b = jN;
                                    uVar.f55320c = jN;
                                }
                                j jVar4 = lVar3.f55222d;
                                lVar3.f55219a.f55318a = new j((iB2 & 2) != 0 ? nVar3.m() - 1 : jVar4.f55213a, (iB2 & 8) != 0 ? nVar3.m() : jVar4.f55214b, (iB2 & 16) != 0 ? nVar3.m() : jVar4.f55215c, (iB2 & 32) != 0 ? nVar3.m() : jVar4.f55216d);
                            }
                            if (lVar3 == null) {
                                sparseArray = sparseArray4;
                                i3 = size5;
                                i5 = i27;
                                i7 = i19;
                                i8 = i26;
                            } else {
                                u uVar2 = lVar3.f55219a;
                                long jN2 = uVar2.f55335r;
                                lVar3.a();
                                int i28 = c.f55179x;
                                if (aVar3.c(i28) != null) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = aVar3.c(i28).P0;
                                    nVar4.e(i19);
                                    jN2 = ((nVar4.b() >> 24) & 255) == i26 ? nVar4.n() : nVar4.k();
                                }
                                ArrayList arrayList2 = aVar3.Q0;
                                int size6 = arrayList2.size();
                                int i29 = 0;
                                int i30 = 0;
                                int i31 = 0;
                                while (i30 < size6) {
                                    SparseArray sparseArray5 = sparseArray4;
                                    b bVar2 = (b) arrayList2.get(i30);
                                    int i32 = size5;
                                    int i33 = i27;
                                    if (bVar2.f55183a == c.f55125A) {
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = bVar2.P0;
                                        nVar5.e(12);
                                        int iM2 = nVar5.m();
                                        if (iM2 > 0) {
                                            i29 += iM2;
                                            i31++;
                                        }
                                    }
                                    i30++;
                                    size5 = i32;
                                    sparseArray4 = sparseArray5;
                                    i27 = i33;
                                }
                                sparseArray = sparseArray4;
                                i3 = size5;
                                i5 = i27;
                                lVar3.f55225g = 0;
                                lVar3.f55224f = 0;
                                lVar3.f55223e = 0;
                                u uVar3 = lVar3.f55219a;
                                uVar3.f55321d = i31;
                                uVar3.f55322e = i29;
                                int[] iArr = uVar3.f55324g;
                                if (iArr == null || iArr.length < i31) {
                                    uVar3.f55323f = new long[i31];
                                    uVar3.f55324g = new int[i31];
                                }
                                int[] iArr2 = uVar3.f55325h;
                                if (iArr2 == null || iArr2.length < i29) {
                                    int i34 = (i29 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
                                    uVar3.f55325h = new int[i34];
                                    uVar3.f55326i = new int[i34];
                                    uVar3.f55327j = new long[i34];
                                    uVar3.f55328k = new boolean[i34];
                                    uVar3.f55330m = new boolean[i34];
                                }
                                int i35 = 0;
                                int i36 = 0;
                                int i37 = 0;
                                while (i35 < size6) {
                                    long jA = 0;
                                    b bVar3 = (b) arrayList2.get(i35);
                                    if (bVar3.f55183a == c.f55125A) {
                                        int i38 = i36 + 1;
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = bVar3.P0;
                                        nVar6.e(8);
                                        int iB3 = nVar6.b();
                                        i11 = i35;
                                        s sVar3 = lVar3.f55221c;
                                        u uVar4 = lVar3.f55219a;
                                        int i39 = i36;
                                        j jVar5 = uVar4.f55318a;
                                        int i40 = i37;
                                        uVar4.f55324g[i39] = nVar6.m();
                                        long[] jArr = uVar4.f55323f;
                                        j3 = jN2;
                                        long j6 = uVar4.f55319b;
                                        jArr[i39] = j6;
                                        if ((iB3 & 1) != 0) {
                                            jArr[i39] = j6 + ((long) nVar6.b());
                                        }
                                        boolean z3 = (iB3 & 4) != 0;
                                        int iM3 = jVar5.f55216d;
                                        if (z3) {
                                            iM3 = nVar6.m();
                                        }
                                        boolean z4 = (iB3 & 256) != 0;
                                        boolean z5 = z3;
                                        boolean z6 = (iB3 & 512) != 0;
                                        boolean z7 = (iB3 & 1024) != 0;
                                        boolean z9 = (iB3 & 2048) != 0;
                                        boolean z10 = z7;
                                        long[] jArr2 = sVar3.f55313i;
                                        arrayList = arrayList2;
                                        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
                                            i12 = iM3;
                                            z2 = z4;
                                            jA = z.a(sVar3.f55314j[0], 1000L, sVar3.f55307c);
                                        } else {
                                            i12 = iM3;
                                            z2 = z4;
                                        }
                                        int[] iArr3 = uVar4.f55325h;
                                        int[] iArr4 = uVar4.f55326i;
                                        int i41 = i12;
                                        long[] jArr3 = uVar4.f55327j;
                                        boolean[] zArr = uVar4.f55328k;
                                        int i42 = i40 + uVar4.f55324g[i39];
                                        long j7 = sVar3.f55307c;
                                        if (i39 > 0) {
                                            j4 = j7;
                                            j5 = uVar4.f55335r;
                                            i13 = i40;
                                        } else {
                                            j4 = j7;
                                            i13 = i40;
                                            j5 = j3;
                                        }
                                        while (i13 < i42) {
                                            if (z2) {
                                                iM = nVar6.m();
                                            } else {
                                                iM = jVar5.f55214b;
                                            }
                                            int iM4 = z6 ? nVar6.m() : jVar5.f55215c;
                                            if (i13 == 0 && z5) {
                                                i14 = i13;
                                                iB = i41;
                                            } else if (z10) {
                                                i14 = i13;
                                                iB = nVar6.b();
                                            } else {
                                                i14 = i13;
                                                iB = jVar5.f55216d;
                                            }
                                            if (z9) {
                                                i15 = iB;
                                                jVar = jVar5;
                                                i16 = i42;
                                                iArr4[i14] = (int) (((long) (nVar6.b() * 1000)) / j4);
                                            } else {
                                                i15 = iB;
                                                jVar = jVar5;
                                                i16 = i42;
                                                iArr4[i14] = 0;
                                            }
                                            long j9 = j5;
                                            jArr3[i14] = z.a(j5, 1000L, j4) - jA;
                                            iArr3[i14] = iM4;
                                            zArr[i14] = ((i15 >> 16) & 1) == 0;
                                            j5 = j9 + ((long) iM);
                                            i13 = i14 + 1;
                                            jVar5 = jVar;
                                            i42 = i16;
                                        }
                                        uVar4.f55335r = j5;
                                        i36 = i38;
                                        i37 = i42;
                                    } else {
                                        i11 = i35;
                                        arrayList = arrayList2;
                                        j3 = jN2;
                                    }
                                    i35 = i11 + 1;
                                    jN2 = j3;
                                    arrayList2 = arrayList;
                                }
                                b bVarC = aVar3.c(c.d0);
                                if (bVarC != null) {
                                    t tVar = lVar3.f55221c.f55312h[uVar2.f55318a.f55213a];
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar7 = bVarC.P0;
                                    int i43 = tVar.f55316a;
                                    nVar7.e(8);
                                    if ((nVar7.b() & 1) == 1) {
                                        nVar7.e(nVar7.f56207b + 8);
                                    }
                                    int iJ = nVar7.j();
                                    int iM5 = nVar7.m();
                                    if (iM5 == uVar2.f55322e) {
                                        if (iJ == 0) {
                                            boolean[] zArr2 = uVar2.f55330m;
                                            i10 = 0;
                                            for (int i44 = 0; i44 < iM5; i44++) {
                                                int iJ2 = nVar7.j();
                                                i10 += iJ2;
                                                zArr2[i44] = iJ2 > i43;
                                            }
                                        } else {
                                            i10 = iJ * iM5;
                                            Arrays.fill(uVar2.f55330m, 0, iM5, iJ > i43);
                                        }
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar8 = uVar2.f55333p;
                                        if (nVar8 == null || nVar8.f56208c < i10) {
                                            uVar2.f55333p = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(i10);
                                        }
                                        uVar2.f55332o = i10;
                                        uVar2.f55329l = true;
                                        uVar2.f55334q = true;
                                    } else {
                                        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Length mismatch: ", iM5, ", ");
                                        sbA.append(uVar2.f55322e);
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r(sbA.toString());
                                    }
                                }
                                b bVarC2 = aVar3.c(c.e0);
                                if (bVarC2 != null) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar9 = bVarC2.P0;
                                    nVar9.e(8);
                                    int iB4 = nVar9.b();
                                    if ((iB4 & 1) == 1) {
                                        nVar9.e(nVar9.f56207b + 8);
                                    }
                                    int iM6 = nVar9.m();
                                    if (iM6 != 1) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unexpected saio entry count: ", iM6));
                                    }
                                    uVar2.f55320c += ((iB4 >> 24) & 255) == 0 ? nVar9.k() : nVar9.n();
                                }
                                b bVarC3 = aVar3.c(c.i0);
                                if (bVarC3 != null) {
                                    a(bVarC3.P0, 0, uVar2);
                                }
                                b bVarC4 = aVar3.c(c.f0);
                                b bVarC5 = aVar3.c(c.f55160g0);
                                if (bVarC4 != null && bVarC5 != null) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar10 = bVarC4.P0;
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar11 = bVarC5.P0;
                                    nVar10.e(8);
                                    int iB5 = nVar10.b();
                                    int iB6 = nVar10.b();
                                    int i45 = f55226A;
                                    if (iB6 == i45) {
                                        i8 = 1;
                                        if (((iB5 >> 24) & 255) == 1) {
                                            nVar10.e(nVar10.f56207b + 4);
                                        }
                                        if (nVar10.b() == 1) {
                                            nVar11.e(8);
                                            int iB7 = nVar11.b();
                                            if (nVar11.b() == i45) {
                                                int i46 = (iB7 >> 24) & 255;
                                                if (i46 == 1) {
                                                    if (nVar11.k() == 0) {
                                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Variable length decription in sgpd found (unsupported)");
                                                    }
                                                } else if (i46 >= 2) {
                                                    nVar11.e(nVar11.f56207b + 4);
                                                }
                                                if (nVar11.k() == 1) {
                                                    nVar11.e(nVar11.f56207b + 2);
                                                    i8 = 1;
                                                    if (nVar11.j() == 1) {
                                                        int iJ3 = nVar11.j();
                                                        byte[] bArr2 = new byte[16];
                                                        nVar11.a(bArr2, 0, 16);
                                                        uVar2.f55329l = true;
                                                        uVar2.f55331n = new t(iJ3, bArr2);
                                                    }
                                                } else {
                                                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Entry count in sgpd != 1 (unsupported).");
                                                }
                                            }
                                        } else {
                                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Entry count in sbgp != 1 (unsupported).");
                                        }
                                    }
                                    size = aVar3.Q0.size();
                                    while (i9 < size) {
                                    }
                                    i7 = 8;
                                } else {
                                    i8 = 1;
                                    size = aVar3.Q0.size();
                                    for (i9 = 0; i9 < size; i9++) {
                                        b bVar4 = (b) aVar3.Q0.get(i9);
                                        if (bVar4.f55183a == c.h0) {
                                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar12 = bVar4.P0;
                                            nVar12.e(8);
                                            nVar12.a(bArr, 0, 16);
                                            if (Arrays.equals(bArr, f55227B)) {
                                                a(nVar12, 16, uVar2);
                                            }
                                        }
                                    }
                                    i7 = 8;
                                }
                            }
                        }
                        i27 = i5 + 1;
                        i26 = i8;
                        i19 = i7;
                        size5 = i3;
                        sparseArray4 = sparseArray;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVarA2 = a(aVar.Q0);
                    if (dVarA2 != null) {
                        int i47 = 0;
                        for (int size7 = this.f55228a.size(); i47 < size7; size7 = size7) {
                            l lVar4 = (l) this.f55228a.valueAt(i47);
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = lVar4.f55220b;
                            com.fyber.inneractive.sdk.player.exoplayer2.o oVar = lVar4.f55221c.f55310f;
                            rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar.f55853a, oVar.f55857e, oVar.f55858f, oVar.f55855c, oVar.f55854b, oVar.f55859g, oVar.f55862j, oVar.f55863k, oVar.f55864l, oVar.f55865m, oVar.f55866n, oVar.f55868p, oVar.f55867o, oVar.f55869q, oVar.f55870r, oVar.f55871s, oVar.f55872t, oVar.f55873u, oVar.f55874v, oVar.f55876x, oVar.f55877y, oVar.f55878z, oVar.f55875w, oVar.f55860h, dVarA2, oVar.f55856d));
                            i47++;
                        }
                    }
                } else if (!this.f55236i.isEmpty()) {
                    ((a) this.f55236i.peek()).f55124R0.add(aVar);
                }
            }
        }
        this.f55238k = 0;
        this.f55241n = 0;
    }

    public static void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i2, u uVar) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        nVar.e(i2 + 8);
        int iB = nVar.b();
        int i3 = c.f55153b;
        if ((iB & 1) == 0) {
            boolean z2 = (iB & 2) != 0;
            int iM = nVar.m();
            if (iM == uVar.f55322e) {
                Arrays.fill(uVar.f55330m, 0, iM, z2);
                int i5 = nVar.f56208c - nVar.f56207b;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = uVar.f55333p;
                if (nVar2 == null || nVar2.f56208c < i5) {
                    uVar.f55333p = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(i5);
                }
                uVar.f55332o = i5;
                uVar.f55329l = true;
                uVar.f55334q = true;
                nVar.a(uVar.f55333p.f56206a, 0, i5);
                uVar.f55333p.e(0);
                uVar.f55334q = false;
                return;
            }
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Length mismatch: ", iM, ", ");
            sbA.append(uVar.f55322e);
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(sbA.toString());
        }
        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.drm.d a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) arrayList.get(i2);
            if (bVar.f55183a == c.f55148V) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.P0.f56206a;
                UUID uuidA = q.a(bArr);
                if (uuidA == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new com.fyber.inneractive.sdk.player.exoplayer2.drm.c(uuidA, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.drm.d(false, (com.fyber.inneractive.sdk.player.exoplayer2.drm.c[]) arrayList2.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.drm.c[arrayList2.size()]));
    }
}
