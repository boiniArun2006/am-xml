package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.m;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class e implements i {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final byte[] f55039Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    public static final UUID b0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f55040A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g f55041B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g f55042C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f55043D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f55044E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f55045F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f55046G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f55047H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f55048I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int[] f55049J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f55050K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f55051L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f55052M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f55053N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f55054O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f55055P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f55056Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f55057R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public byte f55058S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f55059T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f55060U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f55061V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f55062W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f55063X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public j f55064Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f55065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f55066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f55067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f55068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f55069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f55070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f55071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f55072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f55073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f55074j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n f55075k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f55076l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f55077m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ByteBuffer f55078n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f55079o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f55080p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f55081q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f55082r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f55083s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f55084t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f55085u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f55086v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f55087w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f55088x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f55089y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f55090z;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        f fVar = new f();
        long j2 = bVar.f54725b;
        long j3 = 1024;
        if (j2 != -1 && j2 <= 1024) {
            j3 = j2;
        }
        int i2 = (int) j3;
        bVar.a(fVar.f55091a.f56206a, 0, 4, false);
        long jK = fVar.f55091a.k();
        fVar.f55092b = 4;
        while (true) {
            if (jK != 440786851) {
                int i3 = fVar.f55092b + 1;
                fVar.f55092b = i3;
                if (i3 == i2) {
                    break;
                }
                bVar.a(fVar.f55091a.f56206a, 0, 1, false);
                jK = ((jK << 8) & (-256)) | ((long) (fVar.f55091a.f56206a[0] & UByte.MAX_VALUE));
            } else {
                long jA = fVar.a(bVar);
                long j4 = fVar.f55092b;
                if (jA != Long.MIN_VALUE && (j2 == -1 || j4 + jA < j2)) {
                    while (true) {
                        long j5 = fVar.f55092b;
                        long j6 = j4 + jA;
                        if (j5 < j6) {
                            if (fVar.a(bVar) == Long.MIN_VALUE) {
                                break;
                            }
                            long jA2 = fVar.a(bVar);
                            if (jA2 < 0 || jA2 > 2147483647L) {
                                break;
                            }
                            if (jA2 != 0) {
                                bVar.a((int) jA2, false);
                                fVar.f55092b = (int) (((long) fVar.f55092b) + jA2);
                            }
                        } else if (j5 == j6) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public e() {
        b bVar = new b();
        this.f55080p = -1L;
        this.f55081q = -9223372036854775807L;
        this.f55082r = -9223372036854775807L;
        this.f55083s = -9223372036854775807L;
        this.f55089y = -1L;
        this.f55090z = -1L;
        this.f55040A = -9223372036854775807L;
        this.f55065a = bVar;
        bVar.f54992d = new c(this);
        this.f55068d = true;
        this.f55066b = new g();
        this.f55067c = new SparseArray();
        this.f55071g = new n(4);
        this.f55072h = new n(ByteBuffer.allocate(4).putInt(-1).array());
        this.f55073i = new n(4);
        this.f55069e = new n(l.f56198a);
        this.f55070f = new n(4);
        this.f55074j = new n();
        this.f55075k = new n();
        this.f55076l = new n(8);
        this.f55077m = new n();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.f55064Y = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j2, long j3) {
        this.f55040A = -9223372036854775807L;
        this.f55044E = 0;
        b bVar = this.f55065a;
        bVar.f54993e = 0;
        bVar.f54990b.clear();
        g gVar = bVar.f54991c;
        gVar.f55095b = 0;
        gVar.f55096c = 0;
        g gVar2 = this.f55066b;
        gVar2.f55095b = 0;
        gVar2.f55096c = 0;
        this.f55053N = 0;
        this.f55061V = 0;
        this.f55060U = 0;
        this.f55054O = false;
        this.f55055P = false;
        this.f55057R = false;
        this.f55059T = 0;
        this.f55058S = (byte) 0;
        this.f55056Q = false;
        n nVar = this.f55074j;
        nVar.f56207b = 0;
        nVar.f56208c = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x02e4, code lost:
    
        r5 = true;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0ab9, code lost:
    
        if (r5 == false) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0abb, code lost:
    
        r3 = r33.f54726c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0abf, code lost:
    
        if (r32.f55088x == false) goto L583;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0ac1, code lost:
    
        r32.f55090z = r3;
        r34.f55356a = r32.f55089y;
        r32.f55088x = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0ac9, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0ace, code lost:
    
        if (r32.f55085u == false) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0ad0, code lost:
    
        r3 = r32.f55090z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0ad6, code lost:
    
        if (r3 == (-1)) goto L633;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0ad8, code lost:
    
        r34.f55356a = r3;
        r32.f55090z = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0ade, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0ade, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:306:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0835  */
    /* JADX WARN: Type inference failed for: r3v111, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v117 */
    /* JADX WARN: Type inference failed for: r3v168 */
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
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) throws InterruptedException, r, EOFException {
        boolean z2;
        long j2;
        int i2;
        boolean z3;
        boolean z4;
        String str;
        boolean z5;
        boolean z6;
        int i3;
        boolean z7;
        int i5;
        int i7;
        char c2;
        int i8;
        long j3;
        int i9;
        int i10;
        double dLongBitsToDouble;
        long j4;
        int i11;
        int iA;
        boolean z9;
        q pVar;
        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar;
        int i12;
        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar2;
        boolean z10 = false;
        this.f55062W = false;
        boolean z11 = true;
        while (z11 && !this.f55062W) {
            b bVar2 = this.f55065a;
            boolean z12 = z10;
            if (bVar2.f54992d == null) {
                throw new IllegalStateException();
            }
            while (true) {
                if (!bVar2.f54990b.isEmpty() && bVar.f54726c >= ((a) bVar2.f54990b.peek()).f54988b) {
                    c cVar = bVar2.f54992d;
                    int i13 = ((a) bVar2.f54990b.pop()).f54987a;
                    e eVar = cVar.f54996a;
                    if (i13 != 160) {
                        if (i13 == 174) {
                            String str2 = eVar.f55084t.f55013a;
                            if ("V_VP8".equals(str2) || "V_VP9".equals(str2) || "V_MPEG2".equals(str2) || "V_MPEG4/ISO/SP".equals(str2) || "V_MPEG4/ISO/ASP".equals(str2) || "V_MPEG4/ISO/AP".equals(str2) || "V_MPEG4/ISO/AVC".equals(str2) || "V_MPEGH/ISO/HEVC".equals(str2) || "V_MS/VFW/FOURCC".equals(str2) || "V_THEORA".equals(str2) || "A_OPUS".equals(str2) || "A_VORBIS".equals(str2) || "A_AAC".equals(str2) || "A_MPEG/L2".equals(str2) || "A_MPEG/L3".equals(str2) || "A_AC3".equals(str2) || "A_EAC3".equals(str2) || "A_TRUEHD".equals(str2) || "A_DTS".equals(str2) || "A_DTS/EXPRESS".equals(str2) || "A_DTS/LOSSLESS".equals(str2) || "A_FLAC".equals(str2) || "A_MS/ACM".equals(str2) || "A_PCM/INT/LIT".equals(str2) || "S_TEXT/UTF8".equals(str2) || "S_VOBSUB".equals(str2) || "S_HDMV/PGS".equals(str2) || "S_DVBSUB".equals(str2)) {
                                d dVar = eVar.f55084t;
                                dVar.a(eVar.f55064Y, dVar.f55014b);
                                SparseArray sparseArray = eVar.f55067c;
                                d dVar2 = eVar.f55084t;
                                sparseArray.put(dVar2.f55014b, dVar2);
                            }
                            eVar.f55084t = null;
                        } else {
                            if (i13 == 19899) {
                                int i14 = eVar.f55086v;
                                if (i14 != -1) {
                                    long j5 = eVar.f55087w;
                                    if (j5 != -1) {
                                        if (i14 == 475249515) {
                                            eVar.f55089y = j5;
                                        }
                                    }
                                }
                                throw new r("Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i13 == 25152) {
                                d dVar3 = eVar.f55084t;
                                if (dVar3.f55017e) {
                                    byte[] bArr = dVar3.f55019g;
                                    if (bArr != null) {
                                        dVar3.f55021i = new com.fyber.inneractive.sdk.player.exoplayer2.drm.d(true, new com.fyber.inneractive.sdk.player.exoplayer2.drm.c(com.fyber.inneractive.sdk.player.exoplayer2.b.f54689b, "video/webm", bArr));
                                    } else {
                                        throw new r("Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                }
                            } else if (i13 == 28032) {
                                d dVar4 = eVar.f55084t;
                                if (dVar4.f55017e && dVar4.f55018f != null) {
                                    throw new r("Combining encryption and compression is not supported");
                                }
                            } else if (i13 == 357149030) {
                                if (eVar.f55081q == -9223372036854775807L) {
                                    eVar.f55081q = 1000000L;
                                }
                                long j6 = eVar.f55082r;
                                if (j6 != -9223372036854775807L) {
                                    eVar.f55083s = eVar.a(j6);
                                }
                            } else if (i13 != 374648427) {
                                if (i13 != 475249515) {
                                    eVar.getClass();
                                    z9 = z12;
                                } else {
                                    z9 = z12;
                                    if (!eVar.f55085u) {
                                        j jVar = eVar.f55064Y;
                                        if (eVar.f55080p != -1 && eVar.f55083s != -9223372036854775807L && (gVar = eVar.f55041B) != null && (i12 = gVar.f56184a) != 0 && (gVar2 = eVar.f55042C) != null && gVar2.f56184a == i12) {
                                            int[] iArr = new int[i12];
                                            long[] jArr = new long[i12];
                                            long[] jArr2 = new long[i12];
                                            long[] jArr3 = new long[i12];
                                            for (int i15 = z12 ? 1 : 0; i15 < i12; i15++) {
                                                com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar3 = eVar.f55041B;
                                                if (i15 >= 0) {
                                                    if (i15 < gVar3.f56184a) {
                                                        jArr3[i15] = gVar3.f56185b[i15];
                                                        long j7 = eVar.f55080p;
                                                        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar4 = eVar.f55042C;
                                                        if (i15 < 0) {
                                                            gVar4.getClass();
                                                        } else if (i15 < gVar4.f56184a) {
                                                            jArr[i15] = gVar4.f56185b[i15] + j7;
                                                        }
                                                        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Invalid index ", i15, ", size is ");
                                                        sbA.append(gVar4.f56184a);
                                                        throw new IndexOutOfBoundsException(sbA.toString());
                                                    }
                                                } else {
                                                    gVar3.getClass();
                                                }
                                                StringBuilder sbA2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Invalid index ", i15, ", size is ");
                                                sbA2.append(gVar3.f56184a);
                                                throw new IndexOutOfBoundsException(sbA2.toString());
                                            }
                                            int i16 = 0;
                                            while (true) {
                                                int i17 = i12 - 1;
                                                if (i16 < i17) {
                                                    int i18 = i16 + 1;
                                                    iArr[i16] = (int) (jArr[i18] - jArr[i16]);
                                                    jArr2[i16] = jArr3[i18] - jArr3[i16];
                                                    i16 = i18;
                                                } else {
                                                    iArr[i17] = (int) ((eVar.f55080p + eVar.f55079o) - jArr[i17]);
                                                    jArr2[i17] = eVar.f55083s - jArr3[i17];
                                                    eVar.f55041B = null;
                                                    eVar.f55042C = null;
                                                    pVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.a(iArr, jArr, jArr2, jArr3);
                                                }
                                            }
                                        } else {
                                            eVar.f55041B = null;
                                            eVar.f55042C = null;
                                            pVar = new p(eVar.f55083s);
                                        }
                                        jVar.a(pVar);
                                        eVar.f55085u = true;
                                    }
                                }
                                z5 = z9;
                            } else if (eVar.f55067c.size() != 0) {
                                eVar.f55064Y.b();
                            } else {
                                throw new r("No valid tracks were found");
                            }
                        }
                        z9 = false;
                        z5 = z9;
                    } else {
                        if (eVar.f55044E != 2) {
                            z9 = false;
                        } else {
                            if (!eVar.f55063X) {
                                eVar.f55052M |= 1;
                            }
                            eVar.a((d) eVar.f55067c.get(eVar.f55050K), eVar.f55045F);
                            z9 = false;
                            eVar.f55044E = 0;
                        }
                        z5 = z9;
                    }
                } else {
                    int i19 = 8;
                    if (bVar2.f54993e == 0) {
                        long jA = bVar2.f54991c.a(bVar, true, z12, 4);
                        if (jA == -2) {
                            bVar.f54728e = z12 ? 1 : 0;
                            ?? r3 = z12;
                            while (true) {
                                bVar.a(bVar2.f54989a, r3, 4, r3);
                                byte b2 = bVar2.f54989a[r3];
                                i11 = 0;
                                while (true) {
                                    long[] jArr4 = g.f55093d;
                                    if (i11 < 8) {
                                        j2 = 0;
                                        long j9 = jArr4[i11] & ((long) b2);
                                        i11++;
                                        if (j9 != 0) {
                                        }
                                    } else {
                                        j2 = 0;
                                        i11 = -1;
                                    }
                                }
                                if (i11 != -1 && i11 <= 4) {
                                    iA = (int) g.a(bVar2.f54989a, i11, false);
                                    bVar2.f54992d.f54996a.getClass();
                                    if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                                    }
                                }
                                bVar.a(1);
                                r3 = 0;
                            }
                            bVar.a(i11);
                            j4 = iA;
                        } else {
                            j2 = 0;
                            j4 = jA;
                        }
                        z2 = true;
                        if (j4 == -1) {
                            z11 = false;
                            boolean z13 = false;
                        } else {
                            bVar2.f54994f = (int) j4;
                            bVar2.f54993e = 1;
                        }
                    } else {
                        z2 = true;
                        j2 = 0;
                    }
                    if (bVar2.f54993e == z2) {
                        bVar2.f54995g = bVar2.f54991c.a(bVar, false, z2, 8);
                        bVar2.f54993e = 2;
                    }
                    c cVar2 = bVar2.f54992d;
                    int i20 = bVar2.f54994f;
                    cVar2.f54996a.getClass();
                    switch (i20) {
                        case MRAID_JS_WRITE_FAILED_VALUE:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case AD_RESPONSE_EMPTY_VALUE:
                        case 231:
                        case 241:
                        case 251:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 2352003:
                        case 2807729:
                            i2 = 2;
                            break;
                        case 134:
                        case 17026:
                        case 2274716:
                            i2 = 3;
                            break;
                        case 160:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i2 = 1;
                            break;
                        case 161:
                        case 163:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i2 = 4;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                            i2 = 5;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    if (i2 == 0) {
                        bVar.a((int) bVar2.f54995g);
                        bVar2.f54993e = 0;
                        z12 = false;
                    } else if (i2 != 1) {
                        char c4 = 6;
                        byte b4 = UByte.MAX_VALUE;
                        if (i2 == 2) {
                            long j10 = bVar2.f54995g;
                            if (j10 <= 8) {
                                c cVar3 = bVar2.f54992d;
                                int i21 = bVar2.f54994f;
                                int i22 = (int) j10;
                                bVar.b(bVar2.f54989a, 0, i22, false);
                                long j11 = j2;
                                for (int i23 = 0; i23 < i22; i23++) {
                                    j11 = (j11 << 8) | ((long) (bVar2.f54989a[i23] & UByte.MAX_VALUE));
                                }
                                e eVar2 = cVar3.f54996a;
                                eVar2.getClass();
                                if (i21 != 20529) {
                                    if (i21 != 20530) {
                                        switch (i21) {
                                            case MRAID_JS_WRITE_FAILED_VALUE:
                                                eVar2.f55084t.f55015c = (int) j11;
                                                break;
                                            case 136:
                                                eVar2.f55084t.f55008L = j11 == 1;
                                                break;
                                            case 155:
                                                eVar2.f55046G = eVar2.a(j11);
                                                break;
                                            case 159:
                                                eVar2.f55084t.f55003G = (int) j11;
                                                break;
                                            case 176:
                                                eVar2.f55084t.f55022j = (int) j11;
                                                break;
                                            case 179:
                                                eVar2.f55041B.a(eVar2.a(j11));
                                                break;
                                            case 186:
                                                eVar2.f55084t.f55023k = (int) j11;
                                                break;
                                            case AD_RESPONSE_EMPTY_VALUE:
                                                eVar2.f55084t.f55014b = (int) j11;
                                                break;
                                            case 231:
                                                eVar2.f55040A = eVar2.a(j11);
                                                break;
                                            case 241:
                                                if (!eVar2.f55043D) {
                                                    eVar2.f55042C.a(j11);
                                                    eVar2.f55043D = true;
                                                }
                                                break;
                                            case 251:
                                                eVar2.f55063X = true;
                                                break;
                                            case 16980:
                                                if (j11 != 3) {
                                                    throw new r("ContentCompAlgo " + j11 + " not supported");
                                                }
                                                break;
                                            case 17029:
                                                if (j11 < 1 || j11 > 2) {
                                                    throw new r("DocTypeReadVersion " + j11 + " not supported");
                                                }
                                                break;
                                            case 17143:
                                                if (j11 != 1) {
                                                    throw new r("EBMLReadVersion " + j11 + " not supported");
                                                }
                                                break;
                                            case 18401:
                                                if (j11 != 5) {
                                                    throw new r("ContentEncAlgo " + j11 + " not supported");
                                                }
                                                break;
                                            case 18408:
                                                if (j11 != 1) {
                                                    throw new r("AESSettingsCipherMode " + j11 + " not supported");
                                                }
                                                break;
                                            case 21420:
                                                eVar2.f55087w = j11 + eVar2.f55080p;
                                                break;
                                            case 21432:
                                                int i24 = (int) j11;
                                                if (i24 == 0) {
                                                    z4 = false;
                                                    eVar2.f55084t.f55028p = 0;
                                                    bVar2.f54993e = z4 ? 1 : 0;
                                                    z5 = z4;
                                                } else if (i24 == 1) {
                                                    eVar2.f55084t.f55028p = 2;
                                                } else if (i24 == 3) {
                                                    eVar2.f55084t.f55028p = 1;
                                                } else if (i24 == 15) {
                                                    eVar2.f55084t.f55028p = 3;
                                                }
                                                break;
                                            case 21680:
                                                eVar2.f55084t.f55024l = (int) j11;
                                                break;
                                            case 21682:
                                                eVar2.f55084t.f55026n = (int) j11;
                                                break;
                                            case 21690:
                                                eVar2.f55084t.f55025m = (int) j11;
                                                break;
                                            case 21930:
                                                eVar2.f55084t.f55009M = j11 == 1;
                                                break;
                                            case 22186:
                                                eVar2.f55084t.f55006J = j11;
                                                break;
                                            case 22203:
                                                eVar2.f55084t.f55007K = j11;
                                                break;
                                            case 25188:
                                                eVar2.f55084t.f55004H = (int) j11;
                                                break;
                                            case 2352003:
                                                eVar2.f55084t.f55016d = (int) j11;
                                                break;
                                            case 2807729:
                                                eVar2.f55081q = j11;
                                                break;
                                            default:
                                                switch (i21) {
                                                    case 21945:
                                                        int i25 = (int) j11;
                                                        if (i25 == 1) {
                                                            eVar2.f55084t.f55032t = 2;
                                                        } else if (i25 == 2) {
                                                            eVar2.f55084t.f55032t = 1;
                                                        }
                                                        break;
                                                    case 21946:
                                                        int i26 = (int) j11;
                                                        if (i26 == 1) {
                                                            eVar2.f55084t.f55031s = 3;
                                                            break;
                                                        } else if (i26 == 16) {
                                                            eVar2.f55084t.f55031s = 6;
                                                            break;
                                                        } else if (i26 == 18) {
                                                            eVar2.f55084t.f55031s = 7;
                                                            break;
                                                        } else if (i26 == 6 || i26 == 7) {
                                                        }
                                                        break;
                                                    case 21947:
                                                        d dVar5 = eVar2.f55084t;
                                                        dVar5.f55029q = true;
                                                        int i27 = (int) j11;
                                                        if (i27 == 1) {
                                                            dVar5.f55030r = 1;
                                                        } else if (i27 == 9) {
                                                            dVar5.f55030r = 6;
                                                        } else if (i27 == 4 || i27 == 5 || i27 == 6 || i27 == 7) {
                                                            dVar5.f55030r = 2;
                                                        }
                                                        break;
                                                    case 21948:
                                                        eVar2.f55084t.f55033u = (int) j11;
                                                        break;
                                                    case 21949:
                                                        eVar2.f55084t.f55034v = (int) j11;
                                                        break;
                                                }
                                                break;
                                        }
                                    } else if (j11 != 1) {
                                        throw new r("ContentEncodingScope " + j11 + " not supported");
                                    }
                                } else if (j11 != j2) {
                                    throw new r("ContentEncodingOrder " + j11 + " not supported");
                                }
                                z4 = false;
                                bVar2.f54993e = z4 ? 1 : 0;
                                z5 = z4;
                            } else {
                                throw new r("Invalid integer size: " + bVar2.f54995g);
                            }
                        } else if (i2 == 3) {
                            long j12 = bVar2.f54995g;
                            if (j12 <= 2147483647L) {
                                c cVar4 = bVar2.f54992d;
                                int i28 = bVar2.f54994f;
                                int i29 = (int) j12;
                                if (i29 == 0) {
                                    str = "";
                                } else {
                                    byte[] bArr2 = new byte[i29];
                                    bVar.b(bArr2, 0, i29, false);
                                    str = new String(bArr2);
                                }
                                e eVar3 = cVar4.f54996a;
                                eVar3.getClass();
                                if (i28 == 134) {
                                    eVar3.f55084t.f55013a = str;
                                } else if (i28 != 17026) {
                                    if (i28 == 2274716) {
                                        eVar3.f55084t.f55010N = str;
                                    }
                                } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                    throw new r("DocType " + str + " not supported");
                                }
                                z5 = false;
                                bVar2.f54993e = 0;
                            } else {
                                throw new r("String element size: " + bVar2.f54995g);
                            }
                        } else if (i2 == 4) {
                            c cVar5 = bVar2.f54992d;
                            int i30 = bVar2.f54994f;
                            int i31 = (int) bVar2.f54995g;
                            e eVar4 = cVar5.f54996a;
                            if (i30 == 161 || i30 == 163) {
                                z6 = false;
                                if (eVar4.f55044E == 0) {
                                    eVar4.f55050K = (int) eVar4.f55066b.a(bVar, false, true, 8);
                                    eVar4.f55051L = eVar4.f55066b.f55096c;
                                    eVar4.f55046G = -9223372036854775807L;
                                    eVar4.f55044E = 1;
                                    n nVar = eVar4.f55071g;
                                    nVar.f56207b = 0;
                                    nVar.f56208c = 0;
                                }
                                d dVar6 = (d) eVar4.f55067c.get(eVar4.f55050K);
                                if (dVar6 == null) {
                                    bVar.a(i31 - eVar4.f55051L);
                                    eVar4.f55044E = 0;
                                } else {
                                    if (eVar4.f55044E == 1) {
                                        eVar4.a(bVar, 3);
                                        int i32 = (eVar4.f55071g.f56206a[2] & 6) >> 1;
                                        if (i32 == 0) {
                                            eVar4.f55048I = 1;
                                            int[] iArr2 = eVar4.f55049J;
                                            if (iArr2 == null) {
                                                iArr2 = new int[1];
                                            } else if (iArr2.length < 1) {
                                                iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                                            }
                                            eVar4.f55049J = iArr2;
                                            iArr2[0] = (i31 - eVar4.f55051L) - 3;
                                        } else if (i30 == 163) {
                                            eVar4.a(bVar, 4);
                                            int i33 = (eVar4.f55071g.f56206a[3] & 255) + 1;
                                            eVar4.f55048I = i33;
                                            int[] iArr3 = eVar4.f55049J;
                                            if (iArr3 == null) {
                                                iArr3 = new int[i33];
                                            } else {
                                                if (iArr3.length < i33) {
                                                    i5 = 2;
                                                    iArr3 = new int[Math.max(iArr3.length * 2, i33)];
                                                }
                                                eVar4.f55049J = iArr3;
                                                if (i32 != i5) {
                                                    int i34 = (i31 - eVar4.f55051L) - 4;
                                                    int i35 = eVar4.f55048I;
                                                    Arrays.fill(iArr3, 0, i35, i34 / i35);
                                                } else {
                                                    int i36 = 0;
                                                    int i37 = 1;
                                                    if (i32 != 1) {
                                                        if (i32 == 3) {
                                                            int i38 = 0;
                                                            int i39 = 0;
                                                            int i40 = 4;
                                                            while (true) {
                                                                int i41 = eVar4.f55048I - 1;
                                                                if (i38 < i41) {
                                                                    eVar4.f55049J[i38] = 0;
                                                                    int i42 = i40 + 1;
                                                                    eVar4.a(bVar, i42);
                                                                    if (eVar4.f55071g.f56206a[i40] == 0) {
                                                                        throw new r("No valid varint length mask found");
                                                                    }
                                                                    int i43 = 0;
                                                                    while (true) {
                                                                        if (i43 < i19) {
                                                                            c2 = c4;
                                                                            int i44 = 1 << (7 - i43);
                                                                            if ((eVar4.f55071g.f56206a[i40] & i44) != 0) {
                                                                                int i45 = i42 + i43;
                                                                                eVar4.a(bVar, i45);
                                                                                i8 = i19;
                                                                                int i46 = i43;
                                                                                j3 = (~i44) & eVar4.f55071g.f56206a[i40] & UByte.MAX_VALUE;
                                                                                while (i42 < i45) {
                                                                                    j3 = (j3 << i8) | ((long) (eVar4.f55071g.f56206a[i42] & UByte.MAX_VALUE));
                                                                                    i42++;
                                                                                }
                                                                                if (i38 > 0) {
                                                                                    j3 -= (1 << ((i46 * 7) + 6)) - 1;
                                                                                }
                                                                                i40 = i45;
                                                                            } else {
                                                                                i43++;
                                                                                c4 = c2;
                                                                            }
                                                                        } else {
                                                                            c2 = c4;
                                                                            i8 = i19;
                                                                            i40 = i42;
                                                                            j3 = j2;
                                                                        }
                                                                    }
                                                                    if (j3 >= -2147483648L && j3 <= 2147483647L) {
                                                                        int i47 = (int) j3;
                                                                        int[] iArr4 = eVar4.f55049J;
                                                                        if (i38 != 0) {
                                                                            i47 += iArr4[i38 - 1];
                                                                        }
                                                                        iArr4[i38] = i47;
                                                                        i39 += i47;
                                                                        i38++;
                                                                        c4 = c2;
                                                                        i19 = i8;
                                                                    }
                                                                } else {
                                                                    i7 = i19;
                                                                    eVar4.f55049J[i41] = ((i31 - eVar4.f55051L) - i40) - i39;
                                                                }
                                                            }
                                                            throw new r("EBML lacing sample size out of range.");
                                                        }
                                                        throw new r(m.a("Unexpected lacing value: ", i32));
                                                    }
                                                    int i48 = 0;
                                                    int i49 = 0;
                                                    int i50 = 4;
                                                    while (true) {
                                                        int i51 = eVar4.f55048I - i37;
                                                        if (i48 < i51) {
                                                            eVar4.f55049J[i48] = i36;
                                                            while (true) {
                                                                i9 = i50 + 1;
                                                                eVar4.a(bVar, i9);
                                                                int i52 = eVar4.f55071g.f56206a[i50] & UByte.MAX_VALUE;
                                                                int[] iArr5 = eVar4.f55049J;
                                                                i10 = iArr5[i48] + i52;
                                                                iArr5[i48] = i10;
                                                                if (i52 != 255) {
                                                                    break;
                                                                }
                                                                i50 = i9;
                                                            }
                                                            i49 += i10;
                                                            i48++;
                                                            i50 = i9;
                                                            i36 = 0;
                                                            i37 = 1;
                                                        } else {
                                                            eVar4.f55049J[i51] = ((i31 - eVar4.f55051L) - i50) - i49;
                                                        }
                                                    }
                                                }
                                            }
                                            i5 = 2;
                                            eVar4.f55049J = iArr3;
                                            if (i32 != i5) {
                                            }
                                        } else {
                                            throw new r("Lacing only supported in SimpleBlocks.");
                                        }
                                        i7 = 8;
                                        byte[] bArr3 = eVar4.f55071g.f56206a;
                                        eVar4.f55045F = eVar4.a((bArr3[1] & UByte.MAX_VALUE) | (bArr3[0] << 8)) + eVar4.f55040A;
                                        byte b5 = eVar4.f55071g.f56206a[2];
                                        eVar4.f55052M = ((dVar6.f55015c == 2 || (i30 == 163 && (b5 & ByteCompanionObject.MIN_VALUE) == 128)) ? 1 : 0) | ((b5 & 8) == i7 ? Integer.MIN_VALUE : 0);
                                        eVar4.f55044E = 2;
                                        eVar4.f55047H = 0;
                                        i3 = 163;
                                    } else {
                                        i3 = 163;
                                    }
                                    if (i30 == i3) {
                                        while (true) {
                                            int i53 = eVar4.f55047H;
                                            if (i53 < eVar4.f55048I) {
                                                eVar4.a(bVar, dVar6, eVar4.f55049J[i53]);
                                                eVar4.a(dVar6, eVar4.f55045F + ((long) ((eVar4.f55047H * dVar6.f55016d) / 1000)));
                                                eVar4.f55047H++;
                                            } else {
                                                z7 = false;
                                                eVar4.f55044E = 0;
                                            }
                                        }
                                    } else {
                                        z7 = false;
                                        eVar4.a(bVar, dVar6, eVar4.f55049J[0]);
                                    }
                                    bVar2.f54993e = z7 ? 1 : 0;
                                    z5 = z7;
                                }
                            } else if (i30 == 16981) {
                                z6 = false;
                                byte[] bArr4 = new byte[i31];
                                eVar4.f55084t.f55018f = bArr4;
                                bVar.b(bArr4, 0, i31, false);
                            } else if (i30 == 18402) {
                                z6 = false;
                                byte[] bArr5 = new byte[i31];
                                eVar4.f55084t.f55019g = bArr5;
                                bVar.b(bArr5, 0, i31, false);
                            } else if (i30 == 21419) {
                                z6 = false;
                                Arrays.fill(eVar4.f55073i.f56206a, (byte) 0);
                                bVar.b(eVar4.f55073i.f56206a, 4 - i31, i31, false);
                                eVar4.f55073i.e(0);
                                eVar4.f55086v = (int) eVar4.f55073i.k();
                            } else if (i30 == 25506) {
                                z6 = false;
                                byte[] bArr6 = new byte[i31];
                                eVar4.f55084t.f55020h = bArr6;
                                bVar.b(bArr6, 0, i31, false);
                            } else if (i30 == 30322) {
                                byte[] bArr7 = new byte[i31];
                                eVar4.f55084t.f55027o = bArr7;
                                z6 = false;
                                bVar.b(bArr7, 0, i31, false);
                            } else {
                                eVar4.getClass();
                                throw new r(m.a("Unexpected id: ", i30));
                            }
                            z7 = z6;
                            bVar2.f54993e = z7 ? 1 : 0;
                            z5 = z7;
                        } else if (i2 == 5) {
                            long j13 = bVar2.f54995g;
                            if (j13 != 4 && j13 != 8) {
                                throw new r("Invalid float size: " + bVar2.f54995g);
                            }
                            c cVar6 = bVar2.f54992d;
                            int i54 = bVar2.f54994f;
                            int i55 = (int) j13;
                            bVar.b(bVar2.f54989a, 0, i55, false);
                            long j14 = j2;
                            int i56 = 0;
                            while (i56 < i55) {
                                j14 = (j14 << 8) | ((long) (bVar2.f54989a[i56] & b4));
                                i56++;
                                b4 = UByte.MAX_VALUE;
                            }
                            if (i55 == 4) {
                                dLongBitsToDouble = Float.intBitsToFloat((int) j14);
                            } else {
                                dLongBitsToDouble = Double.longBitsToDouble(j14);
                            }
                            e eVar5 = cVar6.f54996a;
                            if (i54 == 181) {
                                eVar5.f55084t.f55005I = (int) dLongBitsToDouble;
                            } else if (i54 != 17545) {
                                switch (i54) {
                                    case 21969:
                                        eVar5.f55084t.f55035w = (float) dLongBitsToDouble;
                                        break;
                                    case 21970:
                                        eVar5.f55084t.f55036x = (float) dLongBitsToDouble;
                                        break;
                                    case 21971:
                                        eVar5.f55084t.f55037y = (float) dLongBitsToDouble;
                                        break;
                                    case 21972:
                                        eVar5.f55084t.f55038z = (float) dLongBitsToDouble;
                                        break;
                                    case 21973:
                                        eVar5.f55084t.f54997A = (float) dLongBitsToDouble;
                                        break;
                                    case 21974:
                                        eVar5.f55084t.f54998B = (float) dLongBitsToDouble;
                                        break;
                                    case 21975:
                                        eVar5.f55084t.f54999C = (float) dLongBitsToDouble;
                                        break;
                                    case 21976:
                                        eVar5.f55084t.f55000D = (float) dLongBitsToDouble;
                                        break;
                                    case 21977:
                                        eVar5.f55084t.f55001E = (float) dLongBitsToDouble;
                                        break;
                                    case 21978:
                                        eVar5.f55084t.f55002F = (float) dLongBitsToDouble;
                                        break;
                                    default:
                                        eVar5.getClass();
                                        break;
                                }
                            } else {
                                eVar5.f55082r = (long) dLongBitsToDouble;
                            }
                            z5 = false;
                            bVar2.f54993e = 0;
                        } else {
                            throw new r(m.a("Invalid element type ", i2));
                        }
                    } else {
                        long j15 = bVar.f54726c;
                        bVar2.f54990b.add(new a(bVar2.f54994f, bVar2.f54995g + j15));
                        c cVar7 = bVar2.f54992d;
                        int i57 = bVar2.f54994f;
                        long j16 = bVar2.f54995g;
                        e eVar6 = cVar7.f54996a;
                        eVar6.getClass();
                        if (i57 == 160) {
                            z3 = false;
                            eVar6.f55063X = false;
                        } else if (i57 == 174) {
                            z3 = false;
                            eVar6.f55084t = new d();
                        } else if (i57 != 187) {
                            if (i57 == 19899) {
                                eVar6.f55086v = -1;
                                eVar6.f55087w = -1L;
                            } else if (i57 == 20533) {
                                eVar6.f55084t.f55017e = true;
                            } else if (i57 == 21968) {
                                eVar6.f55084t.f55029q = true;
                            } else if (i57 == 408125543) {
                                long j17 = eVar6.f55080p;
                                if (j17 != -1 && j17 != j15) {
                                    throw new r("Multiple Segment elements not supported");
                                }
                                eVar6.f55080p = j15;
                                eVar6.f55079o = j16;
                            } else if (i57 != 475249515) {
                                if (i57 == 524531317 && !eVar6.f55085u) {
                                    if (eVar6.f55068d && eVar6.f55089y != -1) {
                                        eVar6.f55088x = true;
                                    } else {
                                        eVar6.f55064Y.a(new p(eVar6.f55083s));
                                        eVar6.f55085u = true;
                                    }
                                }
                            } else {
                                eVar6.f55041B = new com.fyber.inneractive.sdk.player.exoplayer2.util.g();
                                eVar6.f55042C = new com.fyber.inneractive.sdk.player.exoplayer2.util.g();
                            }
                            z3 = false;
                        } else {
                            z3 = false;
                            eVar6.f55043D = false;
                        }
                        bVar2.f54993e = z3 ? 1 : 0;
                        z5 = z3;
                    }
                }
            }
        }
        boolean z14 = z10 ? 1 : 0;
        if (z11) {
            return z14 ? 1 : 0;
        }
        return -1;
    }

    public final void a(d dVar, long j2) {
        byte[] bArrB;
        if ("S_TEXT/UTF8".equals(dVar.f55013a)) {
            byte[] bArr = this.f55075k.f56206a;
            long j3 = this.f55046G;
            if (j3 == -9223372036854775807L) {
                bArrB = a0;
            } else {
                int i2 = (int) (j3 / 3600000000L);
                long j4 = j3 - (((long) i2) * 3600000000L);
                int i3 = (int) (j4 / 60000000);
                long j5 = j4 - ((long) (60000000 * i3));
                int i5 = (int) (j5 / 1000000);
                bArrB = z.b(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf((int) ((j5 - ((long) (1000000 * i5))) / 1000))));
            }
            System.arraycopy(bArrB, 0, bArr, 19, 12);
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = dVar.f55011O;
            n nVar = this.f55075k;
            rVar.a(nVar.f56208c, nVar);
            this.f55061V += this.f55075k.f56208c;
        }
        dVar.f55011O.a(j2, this.f55052M, this.f55061V, 0, dVar.f55019g);
        this.f55062W = true;
        this.f55053N = 0;
        this.f55061V = 0;
        this.f55060U = 0;
        this.f55054O = false;
        this.f55055P = false;
        this.f55057R = false;
        this.f55059T = 0;
        this.f55058S = (byte) 0;
        this.f55056Q = false;
        n nVar2 = this.f55074j;
        nVar2.f56207b = 0;
        nVar2.f56208c = 0;
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, int i2) throws InterruptedException, EOFException {
        n nVar = this.f55071g;
        if (nVar.f56208c >= i2) {
            return;
        }
        if (nVar.a() < i2) {
            n nVar2 = this.f55071g;
            byte[] bArr = nVar2.f56206a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, Math.max(bArr.length * 2, i2));
            int i3 = this.f55071g.f56208c;
            nVar2.f56206a = bArrCopyOf;
            nVar2.f56208c = i3;
            nVar2.f56207b = 0;
        }
        n nVar3 = this.f55071g;
        byte[] bArr2 = nVar3.f56206a;
        int i5 = nVar3.f56208c;
        bVar.b(bArr2, i5, i2 - i5, false);
        this.f55071g.d(i2);
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, d dVar, int i2) throws InterruptedException, r, EOFException {
        int iA;
        int iA2;
        int i3;
        if ("S_TEXT/UTF8".equals(dVar.f55013a)) {
            byte[] bArr = f55039Z;
            int i5 = i2 + 32;
            if (this.f55075k.a() < i5) {
                this.f55075k.f56206a = Arrays.copyOf(bArr, i5 + i2);
            }
            bVar.b(this.f55075k.f56206a, 32, i2, false);
            this.f55075k.e(0);
            this.f55075k.d(i5);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = dVar.f55011O;
        if (!this.f55054O) {
            if (dVar.f55017e) {
                this.f55052M &= -1073741825;
                if (!this.f55055P) {
                    bVar.b(this.f55071g.f56206a, 0, 1, false);
                    this.f55053N++;
                    byte b2 = this.f55071g.f56206a[0];
                    if ((b2 & ByteCompanionObject.MIN_VALUE) != 128) {
                        this.f55058S = b2;
                        this.f55055P = true;
                    } else {
                        throw new r("Extension bit is set in signal byte");
                    }
                }
                byte b4 = this.f55058S;
                if ((b4 & 1) == 1) {
                    boolean z2 = (b4 & 2) == 2;
                    this.f55052M |= 1073741824;
                    if (!this.f55056Q) {
                        bVar.b(this.f55076l.f56206a, 0, 8, false);
                        this.f55053N += 8;
                        this.f55056Q = true;
                        n nVar = this.f55071g;
                        nVar.f56206a[0] = (byte) ((z2 ? 128 : 0) | 8);
                        nVar.e(0);
                        rVar.a(1, this.f55071g);
                        this.f55061V++;
                        this.f55076l.e(0);
                        rVar.a(8, this.f55076l);
                        this.f55061V += 8;
                    }
                    if (z2) {
                        if (!this.f55057R) {
                            bVar.b(this.f55071g.f56206a, 0, 1, false);
                            this.f55053N++;
                            this.f55071g.e(0);
                            this.f55059T = this.f55071g.j();
                            this.f55057R = true;
                        }
                        int i7 = this.f55059T * 4;
                        this.f55071g.c(i7);
                        bVar.b(this.f55071g.f56206a, 0, i7, false);
                        this.f55053N += i7;
                        short s2 = (short) ((this.f55059T / 2) + 1);
                        int i8 = (s2 * 6) + 2;
                        ByteBuffer byteBuffer = this.f55078n;
                        if (byteBuffer == null || byteBuffer.capacity() < i8) {
                            this.f55078n = ByteBuffer.allocate(i8);
                        }
                        this.f55078n.position(0);
                        this.f55078n.putShort(s2);
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            i3 = this.f55059T;
                            if (i9 >= i3) {
                                break;
                            }
                            int iM = this.f55071g.m();
                            if (i9 % 2 == 0) {
                                this.f55078n.putShort((short) (iM - i10));
                            } else {
                                this.f55078n.putInt(iM - i10);
                            }
                            i9++;
                            i10 = iM;
                        }
                        int i11 = (i2 - this.f55053N) - i10;
                        if (i3 % 2 == 1) {
                            this.f55078n.putInt(i11);
                        } else {
                            this.f55078n.putShort((short) i11);
                            this.f55078n.putInt(0);
                        }
                        n nVar2 = this.f55077m;
                        nVar2.f56206a = this.f55078n.array();
                        nVar2.f56208c = i8;
                        nVar2.f56207b = 0;
                        rVar.a(i8, this.f55077m);
                        this.f55061V += i8;
                    }
                }
            } else {
                byte[] bArr2 = dVar.f55018f;
                if (bArr2 != null) {
                    n nVar3 = this.f55074j;
                    int length = bArr2.length;
                    nVar3.f56206a = bArr2;
                    nVar3.f56208c = length;
                    nVar3.f56207b = 0;
                }
            }
            this.f55054O = true;
        }
        int i12 = i2 + this.f55074j.f56208c;
        if (!"V_MPEG4/ISO/AVC".equals(dVar.f55013a) && !"V_MPEGH/ISO/HEVC".equals(dVar.f55013a)) {
            while (true) {
                int i13 = this.f55053N;
                if (i13 >= i12) {
                    break;
                }
                int i14 = i12 - i13;
                n nVar4 = this.f55074j;
                int i15 = nVar4.f56208c - nVar4.f56207b;
                if (i15 > 0) {
                    iA2 = Math.min(i14, i15);
                    rVar.a(iA2, this.f55074j);
                } else {
                    iA2 = rVar.a(bVar, i14, false);
                }
                this.f55053N += iA2;
                this.f55061V += iA2;
            }
        } else {
            byte[] bArr3 = this.f55070f.f56206a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i16 = dVar.f55012P;
            int i17 = 4 - i16;
            while (this.f55053N < i12) {
                int i18 = this.f55060U;
                if (i18 == 0) {
                    n nVar5 = this.f55074j;
                    int iMin = Math.min(i16, nVar5.f56208c - nVar5.f56207b);
                    bVar.b(bArr3, i17 + iMin, i16 - iMin, false);
                    if (iMin > 0) {
                        this.f55074j.a(bArr3, i17, iMin);
                    }
                    this.f55053N += i16;
                    this.f55070f.e(0);
                    this.f55060U = this.f55070f.m();
                    this.f55069e.e(0);
                    rVar.a(4, this.f55069e);
                    this.f55061V += 4;
                } else {
                    n nVar6 = this.f55074j;
                    int i19 = nVar6.f56208c - nVar6.f56207b;
                    if (i19 > 0) {
                        iA = Math.min(i18, i19);
                        rVar.a(iA, this.f55074j);
                    } else {
                        iA = rVar.a(bVar, i18, false);
                    }
                    this.f55053N += iA;
                    this.f55061V += iA;
                    this.f55060U = i18 - iA;
                }
            }
        }
        if ("A_VORBIS".equals(dVar.f55013a)) {
            this.f55072h.e(0);
            rVar.a(4, this.f55072h);
            this.f55061V += 4;
        }
    }

    public final long a(long j2) throws r {
        long j3 = this.f55081q;
        if (j3 != -9223372036854775807L) {
            return z.a(j2, j3, 1000L);
        }
        throw new r("Can't scale timecode prior to timecodeScale being set.");
    }
}
