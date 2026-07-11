package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l implements Handler.Callback, com.fyber.inneractive.sdk.player.exoplayer2.source.r, com.fyber.inneractive.sdk.player.exoplayer2.source.t {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public h f55737A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public h f55738B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public x f55739C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f55740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f55741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i f55742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f55743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.u f55744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f55745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HandlerThread f55746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f55747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f55748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v f55749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f55750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s f55751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f55752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.h f55753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.u f55754o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a[] f55755p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f55756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f55757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f55758s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f55759t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f55760u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f55761v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f55762w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j f55763x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f55764y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public h f55765z;

    public static void a(a aVar) {
        int i2 = aVar.f54529c;
        if (i2 == 2) {
            if (i2 != 2) {
                throw new IllegalStateException();
            }
            aVar.f54529c = 1;
            aVar.j();
        }
    }

    public final void b(boolean z2) {
        if (this.f55759t != z2) {
            this.f55759t = z2;
            this.f55747h.obtainMessage(2, z2 ? 1 : 0, 0).sendToTarget();
        }
    }

    public final void c(boolean z2) {
        this.f55758s = false;
        this.f55757r = z2;
        if (!z2) {
            g();
            h();
            a(false);
            return;
        }
        int i2 = this.f55760u;
        if (i2 != 3) {
            if (i2 == 2) {
                this.f55745f.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.f55758s = false;
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f55744e;
        if (!uVar.f56226a) {
            uVar.f56228c = SystemClock.elapsedRealtime();
            uVar.f56226a = true;
        }
        for (a aVar : this.f55755p) {
            if (aVar.f54529c != 1) {
                throw new IllegalStateException();
            }
            aVar.f54529c = 2;
            aVar.i();
        }
        this.f55745f.sendEmptyMessage(2);
    }

    public final synchronized void d() {
        if (this.f55756q) {
            return;
        }
        this.f55745f.sendEmptyMessage(6);
        while (!this.f55756q) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.f55746g.quit();
    }

    public final void e() {
        a(true);
        this.f55743d.a(true);
        a(1);
        synchronized (this) {
            this.f55756q = true;
            notifyAll();
        }
    }

    public final void f() throws d {
        h hVar = this.f55738B;
        if (hVar == null) {
            return;
        }
        boolean z2 = true;
        while (hVar != null && hVar.f55716i) {
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVarA = hVar.f55723p.a(hVar.f55722o, hVar.f55708a.a());
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = hVar.f55726s;
            if (jVar != null) {
                for (int i2 = 0; i2 < jVarA.f56010b.f56006a; i2++) {
                    if (jVarA.a(jVar, i2)) {
                    }
                }
                if (hVar == this.f55737A) {
                    z2 = false;
                }
                hVar = hVar.f55718k;
            }
            hVar.f55720m = jVarA;
            if (z2) {
                h hVar2 = this.f55737A;
                h hVar3 = this.f55738B;
                boolean z3 = hVar2 != hVar3;
                for (h hVar4 = hVar3.f55718k; hVar4 != null; hVar4 = hVar4.f55718k) {
                    hVar4.a();
                }
                h hVar5 = this.f55738B;
                hVar5.f55718k = null;
                this.f55765z = hVar5;
                this.f55737A = hVar5;
                boolean[] zArr = new boolean[this.f55740a.length];
                long jA = hVar5.a(this.f55750k.f55729c, z3, zArr);
                if (jA != this.f55750k.f55729c) {
                    this.f55750k.f55729c = jA;
                    a(jA);
                }
                boolean[] zArr2 = new boolean[this.f55740a.length];
                int i3 = 0;
                int i5 = 0;
                while (true) {
                    a[] aVarArr = this.f55740a;
                    if (i3 >= aVarArr.length) {
                        break;
                    }
                    a aVar = aVarArr[i3];
                    boolean z4 = aVar.f54529c != 0;
                    zArr2[i3] = z4;
                    com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar = this.f55738B.f55710c[i3];
                    if (vVar != null) {
                        i5++;
                    }
                    if (z4) {
                        if (vVar != aVar.f54530d) {
                            if (aVar == this.f55752m) {
                                if (vVar == null) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f55744e;
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar6 = this.f55753n;
                                    uVar.getClass();
                                    uVar.a(hVar6.b());
                                    uVar.f56229d = hVar6.a();
                                }
                                this.f55753n = null;
                                this.f55752m = null;
                            }
                            a(aVar);
                            aVar.c();
                        } else if (zArr[i3]) {
                            long j2 = this.f55764y;
                            aVar.f54533g = false;
                            aVar.f54532f = false;
                            aVar.a(false, j2);
                        }
                    }
                    i3++;
                }
                this.f55747h.obtainMessage(3, hVar.f55720m).sendToTarget();
                a(zArr2, i5);
            } else {
                this.f55765z = hVar;
                for (h hVar7 = hVar.f55718k; hVar7 != null; hVar7 = hVar7.f55718k) {
                    hVar7.a();
                }
                h hVar8 = this.f55765z;
                hVar8.f55718k = null;
                if (hVar8.f55716i) {
                    long j3 = hVar8.f55714g;
                    long jMax = Math.max(j3, Math.abs(this.f55764y - (hVar8.f55712e - j3)));
                    h hVar9 = this.f55765z;
                    hVar9.a(jMax, false, new boolean[hVar9.f55721n.length]);
                }
            }
            b();
            h();
            this.f55745f.sendEmptyMessage(2);
            return;
        }
    }

    public final void g() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f55744e;
        if (uVar.f56226a) {
            uVar.a(uVar.b());
            uVar.f56226a = false;
        }
        for (a aVar : this.f55755p) {
            a(aVar);
        }
    }

    public final void h() {
        h hVar = this.f55738B;
        if (hVar == null) {
            return;
        }
        long jG = hVar.f55708a.g();
        if (jG != -9223372036854775807L) {
            a(jG);
        } else {
            a aVar = this.f55752m;
            if (aVar == null || aVar.e()) {
                this.f55764y = this.f55744e.b();
            } else {
                long jB = this.f55753n.b();
                this.f55764y = jB;
                this.f55744e.a(jB);
            }
            h hVar2 = this.f55738B;
            jG = Math.abs(this.f55764y - (hVar2.f55712e - hVar2.f55714g));
        }
        this.f55750k.f55729c = jG;
        this.f55761v = SystemClock.elapsedRealtime() * 1000;
        long jC = this.f55755p.length == 0 ? Long.MIN_VALUE : this.f55738B.f55708a.c();
        i iVar = this.f55750k;
        if (jC == Long.MIN_VALUE) {
            long j2 = this.f55739C.a(this.f55738B.f55713f, this.f55749j, false).f56245d;
        }
        iVar.getClass();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.u) message.obj, message.arg1 != 0);
                    return true;
                case 1:
                    c(message.arg1 != 0);
                    return true;
                case 2:
                    a();
                    return true;
                case 3:
                    b((j) message.obj);
                    return true;
                case 4:
                    a((s) message.obj);
                    return true;
                case 5:
                    a(true);
                    this.f55743d.a(true);
                    a(1);
                    return true;
                case 6:
                    e();
                    return true;
                case 7:
                    a((Pair) message.obj);
                    return true;
                case 8:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.s) message.obj);
                    return true;
                case 9:
                    com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.s) message.obj;
                    h hVar = this.f55765z;
                    if (hVar != null && hVar.f55708a == sVar) {
                        b();
                    }
                    return true;
                case 10:
                    f();
                    return true;
                case 11:
                    a((e[]) message.obj);
                    return true;
                default:
                    return false;
            }
        } catch (d e2) {
            Log.e("ExoPlayerImplInternal", "Renderer error.", e2);
            this.f55747h.obtainMessage(8, e2).sendToTarget();
            a(true);
            this.f55743d.a(true);
            a(1);
            return true;
        } catch (IOException e3) {
            Log.e("ExoPlayerImplInternal", "Source error.", e3);
            this.f55747h.obtainMessage(8, new d(e3)).sendToTarget();
            a(true);
            this.f55743d.a(true);
            a(1);
            return true;
        } catch (RuntimeException e4) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e4);
            this.f55747h.obtainMessage(8, new d(e4)).sendToTarget();
            a(true);
            this.f55743d.a(true);
            a(1);
            return true;
        }
    }

    public l(a[] aVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d dVar, c cVar, boolean z2, f fVar, i iVar, g gVar) {
        this.f55740a = aVarArr;
        this.f55742c = dVar;
        this.f55743d = cVar;
        this.f55757r = z2;
        this.f55747h = fVar;
        this.f55750k = iVar;
        this.f55741b = new a[aVarArr.length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            a aVar = aVarArr[i2];
            aVar.getClass();
            this.f55741b[i2] = aVar;
        }
        this.f55744e = new com.fyber.inneractive.sdk.player.exoplayer2.util.u();
        this.f55755p = new a[0];
        this.f55748i = new w();
        this.f55749j = new v();
        this.f55751l = s.f55880d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f55746g = handlerThread;
        handlerThread.start();
        this.f55745f = new Handler(handlerThread.getLooper(), this);
    }

    public final void b(j jVar) {
        if (this.f55739C == null) {
            this.f55762w++;
            this.f55763x = jVar;
            return;
        }
        Pair pairA = a(jVar);
        if (pairA == null) {
            i iVar = new i(0, 0L);
            this.f55750k = iVar;
            this.f55747h.obtainMessage(4, 1, 0, iVar).sendToTarget();
            this.f55750k = new i(0, -9223372036854775807L);
            a(4);
            a(false);
            return;
        }
        int i2 = jVar.f55732c == -9223372036854775807L ? 1 : 0;
        int iIntValue = ((Integer) pairA.first).intValue();
        long jLongValue = ((Long) pairA.second).longValue();
        try {
            i iVar2 = this.f55750k;
            if (iIntValue == iVar2.f55727a && jLongValue / 1000 == iVar2.f55729c / 1000) {
                return;
            }
            long jA = a(iIntValue, jLongValue);
            int i3 = i2 | (jLongValue == jA ? 0 : 1);
            i iVar3 = new i(iIntValue, jA);
            this.f55750k = iVar3;
            this.f55747h.obtainMessage(4, i3, 0, iVar3).sendToTarget();
        } finally {
            i iVar4 = new i(iIntValue, jLongValue);
            this.f55750k = iVar4;
            this.f55747h.obtainMessage(4, i2, 0, iVar4).sendToTarget();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.t
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.x xVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g gVar) {
        this.f55745f.obtainMessage(7, Pair.create(xVar, gVar)).sendToTarget();
    }

    public final void a(int i2) {
        if (this.f55760u != i2) {
            this.f55760u = i2;
            this.f55747h.obtainMessage(1, i2, 0).sendToTarget();
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar, boolean z2) {
        this.f55747h.sendEmptyMessage(0);
        a(true);
        this.f55743d.a(false);
        if (z2) {
            this.f55750k = new i(0, -9223372036854775807L);
        }
        this.f55754o = uVar;
        uVar.a(this);
        a(2);
        this.f55745f.sendEmptyMessage(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018a A[LOOP:3: B:75:0x018a->B:79:0x019a, LOOP_START] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() throws d {
        h hVar;
        int i2;
        long j2;
        boolean z2;
        h hVar2;
        h hVar3;
        long j3;
        long j4;
        long j5;
        h hVar4;
        h hVar5;
        int i3;
        h hVar6;
        int i5;
        long jC;
        long j6;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j7 = 0;
        long j9 = -9223372036854775807L;
        if (this.f55739C == null) {
            this.f55754o.a();
            j2 = Long.MIN_VALUE;
        } else {
            h hVar7 = this.f55765z;
            if (hVar7 == null) {
                i2 = this.f55750k.f55727a;
            } else {
                int i7 = hVar7.f55713f;
                if (!hVar7.f55715h && hVar7.f55716i && ((!hVar7.f55717j || hVar7.f55708a.c() == Long.MIN_VALUE) && this.f55739C.a(i7, this.f55749j, false).f56245d != -9223372036854775807L && ((hVar = this.f55738B) == null || i7 - hVar.f55713f != 100))) {
                    i2 = this.f55765z.f55713f + 1;
                }
                j2 = Long.MIN_VALUE;
                z2 = true;
                hVar2 = this.f55765z;
                if (hVar2 == null && (!hVar2.f55716i || (hVar2.f55717j && hVar2.f55708a.c() != j2))) {
                    h hVar8 = this.f55765z;
                    if (hVar8 != null && hVar8.f55719l) {
                        b();
                    }
                } else {
                    b(false);
                }
                if (this.f55738B != null) {
                    while (true) {
                        h hVar9 = this.f55738B;
                        hVar3 = this.f55737A;
                        if (hVar9 == hVar3 || this.f55764y < hVar9.f55718k.f55712e) {
                            break;
                        }
                        hVar9.a();
                        a(this.f55738B.f55718k);
                        h hVar10 = this.f55738B;
                        this.f55750k = new i(hVar10.f55713f, hVar10.f55714g);
                        h();
                        this.f55747h.obtainMessage(5, this.f55750k).sendToTarget();
                    }
                    if (hVar3.f55715h) {
                        int i8 = 0;
                        while (true) {
                            a[] aVarArr = this.f55740a;
                            if (i8 >= aVarArr.length) {
                                break;
                            }
                            a aVar = aVarArr[i8];
                            com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar = this.f55737A.f55710c[i8];
                            if (vVar != null && aVar.f54530d == vVar && aVar.f54532f) {
                                aVar.f54533g = z2;
                            }
                            i8++;
                        }
                    } else {
                        int i9 = 0;
                        while (true) {
                            a[] aVarArr2 = this.f55740a;
                            if (i9 < aVarArr2.length) {
                                a aVar2 = aVarArr2[i9];
                                com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar2 = this.f55737A.f55710c[i9];
                                if (aVar2.f54530d != vVar2 || (vVar2 != null && !aVar2.f54532f)) {
                                    break;
                                } else {
                                    i9++;
                                }
                            } else {
                                h hVar11 = this.f55737A;
                                h hVar12 = hVar11.f55718k;
                                if (hVar12 != null && hVar12.f55716i) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = hVar11.f55720m;
                                    this.f55737A = hVar12;
                                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar2 = hVar12.f55720m;
                                    Object[] objArr = hVar12.f55708a.g() != -9223372036854775807L ? z2 ? 1 : 0 : null;
                                    int i10 = 0;
                                    while (true) {
                                        a[] aVarArr3 = this.f55740a;
                                        if (i10 >= aVarArr3.length) {
                                            break;
                                        }
                                        a aVar3 = aVarArr3[i10];
                                        if (jVar.f56010b.f56007b[i10] != null) {
                                            if (objArr != null) {
                                                aVar3.f54533g = z2;
                                            } else if (!aVar3.f54533g) {
                                                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = jVar2.f56010b.f56007b[i10];
                                                t tVar = jVar.f56012d[i10];
                                                j3 = j7;
                                                t tVar2 = jVar2.f56012d[i10];
                                                if (bVar != null && tVar2.equals(tVar)) {
                                                    int length = bVar.f55999c.length;
                                                    o[] oVarArr = new o[length];
                                                    int i11 = 0;
                                                    while (i11 < length) {
                                                        oVarArr[i11] = bVar.f56000d[i11];
                                                        i11++;
                                                        j9 = j9;
                                                    }
                                                    j4 = j9;
                                                    h hVar13 = this.f55737A;
                                                    com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar3 = hVar13.f55710c[i10];
                                                    long j10 = hVar13.f55712e - hVar13.f55714g;
                                                    if (!aVar3.f54533g) {
                                                        aVar3.f54530d = vVar3;
                                                        aVar3.f54532f = false;
                                                        aVar3.f54531e = j10;
                                                        aVar3.a(oVarArr);
                                                    } else {
                                                        throw new IllegalStateException();
                                                    }
                                                } else {
                                                    j4 = j9;
                                                    aVar3.f54533g = z2;
                                                }
                                            }
                                            j3 = j7;
                                            j4 = j9;
                                        } else {
                                            j3 = j7;
                                            j4 = j9;
                                        }
                                        i10++;
                                        j7 = j3;
                                        j9 = j4;
                                        z2 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i2 >= this.f55739C.a()) {
                this.f55754o.a();
                j2 = Long.MIN_VALUE;
                z2 = true;
                hVar2 = this.f55765z;
                if (hVar2 == null) {
                    b(false);
                    if (this.f55738B != null) {
                    }
                }
            } else {
                if (this.f55765z == null) {
                    j5 = this.f55750k.f55729c;
                    j2 = Long.MIN_VALUE;
                } else {
                    int i12 = this.f55739C.a(i2, this.f55749j, false).f56244c;
                    if (i2 != this.f55739C.a(i12, this.f55748i, 0L).f56315c) {
                        j2 = Long.MIN_VALUE;
                        j5 = 0;
                    } else {
                        h hVar14 = this.f55765z;
                        j2 = Long.MIN_VALUE;
                        z2 = true;
                        Pair pairA = a(this.f55739C, i12, -9223372036854775807L, Math.max(0L, ((hVar14.f55712e - hVar14.f55714g) + this.f55739C.a(hVar14.f55713f, this.f55749j, false).f56245d) - this.f55764y));
                        if (pairA != null) {
                            int iIntValue = ((Integer) pairA.first).intValue();
                            long jLongValue = ((Long) pairA.second).longValue();
                            i2 = iIntValue;
                            j5 = jLongValue;
                            h hVar15 = this.f55765z;
                            long j11 = hVar15 != null ? j5 + 60000000 : (hVar15.f55712e - hVar15.f55714g) + this.f55739C.a(hVar15.f55713f, this.f55749j, false).f56245d;
                            this.f55739C.a(i2, this.f55749j, z2);
                            h hVar16 = new h(this.f55740a, this.f55741b, j11, this.f55742c, this.f55743d, this.f55754o, this.f55749j.f56243b, i2, (i2 == this.f55739C.a() - (z2 ? 1 : 0) || this.f55739C.a(this.f55749j.f56244c, this.f55748i, 0L).f56314b) ? false : z2 ? 1 : 0, j5);
                            hVar4 = this.f55765z;
                            if (hVar4 != null) {
                                hVar4.f55718k = hVar16;
                            }
                            this.f55765z = hVar16;
                            hVar16.f55708a.a(this);
                            b(z2);
                        }
                        hVar2 = this.f55765z;
                        if (hVar2 == null) {
                        }
                    }
                }
                z2 = true;
                h hVar152 = this.f55765z;
                long j112 = hVar152 != null ? j5 + 60000000 : (hVar152.f55712e - hVar152.f55714g) + this.f55739C.a(hVar152.f55713f, this.f55749j, false).f56245d;
                this.f55739C.a(i2, this.f55749j, z2);
                if (i2 == this.f55739C.a() - (z2 ? 1 : 0)) {
                    h hVar162 = new h(this.f55740a, this.f55741b, j112, this.f55742c, this.f55743d, this.f55754o, this.f55749j.f56243b, i2, (i2 == this.f55739C.a() - (z2 ? 1 : 0) || this.f55739C.a(this.f55749j.f56244c, this.f55748i, 0L).f56314b) ? false : z2 ? 1 : 0, j5);
                    hVar4 = this.f55765z;
                    if (hVar4 != null) {
                    }
                    this.f55765z = hVar162;
                    hVar162.f55708a.a(this);
                    b(z2);
                    hVar2 = this.f55765z;
                    if (hVar2 == null) {
                    }
                }
            }
        }
        long j12 = j7;
        long j13 = j9;
        if (this.f55738B == null) {
            c();
            a(jElapsedRealtime, 10L);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.w.a("doSomeWork");
        h();
        com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar = this.f55738B.f55708a;
        long j14 = this.f55750k.f55729c;
        sVar.getClass();
        boolean z3 = true;
        boolean z4 = true;
        for (a aVar4 : this.f55755p) {
            aVar4.a(this.f55764y, this.f55761v);
            z4 = z4 && aVar4.e();
            boolean z5 = aVar4.f() || aVar4.e();
            if (!z5) {
                aVar4.f54530d.a();
            }
            z3 = z3 && z5;
        }
        if (!z3) {
            c();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar17 = this.f55753n;
        if (hVar17 != null) {
            s sVarA = hVar17.a();
            if (!sVarA.equals(this.f55751l)) {
                this.f55751l = sVarA;
                com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f55744e;
                com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar18 = this.f55753n;
                uVar.getClass();
                uVar.a(hVar18.b());
                uVar.f56229d = hVar18.a();
                this.f55747h.obtainMessage(7, sVarA).sendToTarget();
            }
        }
        long j15 = this.f55739C.a(this.f55738B.f55713f, this.f55749j, false).f56245d;
        if (z4 && ((j15 == j13 || j15 <= this.f55750k.f55729c) && this.f55738B.f55715h)) {
            a(4);
            g();
        } else {
            int i13 = this.f55760u;
            if (i13 == 2) {
                if (this.f55755p.length > 0) {
                    if (z3) {
                        boolean z6 = this.f55758s;
                        h hVar19 = this.f55765z;
                        if (!hVar19.f55716i) {
                            jC = hVar19.f55714g;
                        } else {
                            jC = hVar19.f55708a.c();
                        }
                        if (jC == j2) {
                            h hVar20 = this.f55765z;
                            if (!hVar20.f55715h) {
                                jC = this.f55739C.a(hVar20.f55713f, this.f55749j, false).f56245d;
                                c cVar = this.f55743d;
                                h hVar21 = this.f55765z;
                                long jAbs = jC - Math.abs(this.f55764y - (hVar21.f55712e - hVar21.f55714g));
                                j6 = !z6 ? cVar.f54694e : cVar.f54693d;
                                if (j6 > j12 || jAbs >= j6) {
                                }
                            }
                            a(3);
                            if (this.f55757r) {
                                this.f55758s = false;
                                com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar2 = this.f55744e;
                                if (uVar2.f56226a) {
                                    i5 = 1;
                                } else {
                                    uVar2.f56228c = SystemClock.elapsedRealtime();
                                    i5 = 1;
                                    uVar2.f56226a = true;
                                }
                                for (a aVar5 : this.f55755p) {
                                    if (aVar5.f54529c == i5) {
                                        aVar5.f54529c = 2;
                                        aVar5.i();
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                }
                            }
                        } else {
                            c cVar2 = this.f55743d;
                            h hVar212 = this.f55765z;
                            long jAbs2 = jC - Math.abs(this.f55764y - (hVar212.f55712e - hVar212.f55714g));
                            if (!z6) {
                            }
                            if (j6 > j12) {
                                a(3);
                                if (this.f55757r) {
                                }
                            } else {
                                a(3);
                                if (this.f55757r) {
                                }
                            }
                        }
                    }
                } else if (j15 == j13 || this.f55750k.f55729c < j15 || ((hVar6 = this.f55738B.f55718k) != null && hVar6.f55716i)) {
                }
                if (this.f55760u == i3) {
                    for (a aVar6 : this.f55755p) {
                        aVar6.f54530d.a();
                    }
                }
                if ((!this.f55757r && this.f55760u == 3) || this.f55760u == 2) {
                    a(jElapsedRealtime, 10L);
                } else if (this.f55755p.length != 0) {
                    a(jElapsedRealtime, 1000L);
                } else {
                    this.f55745f.removeMessages(2);
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
            }
            if (i13 == 3) {
                if (!(this.f55755p.length > 0 ? z3 : j15 == j13 || this.f55750k.f55729c < j15 || ((hVar5 = this.f55738B.f55718k) != null && hVar5.f55716i))) {
                    this.f55758s = this.f55757r;
                    i3 = 2;
                    a(2);
                    g();
                }
            }
            if (this.f55760u == i3) {
            }
            if (!this.f55757r) {
                if (this.f55755p.length != 0) {
                }
            } else if (this.f55755p.length != 0) {
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
            i3 = 2;
            if (this.f55760u == i3) {
            }
            if (!this.f55757r) {
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
        }
        i3 = 2;
        if (this.f55760u == i3) {
        }
        if (!this.f55757r) {
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
    }

    public final void c() {
        h hVar = this.f55765z;
        if (hVar == null || hVar.f55716i) {
            return;
        }
        h hVar2 = this.f55737A;
        if (hVar2 == null || hVar2.f55718k == hVar) {
            for (a aVar : this.f55755p) {
                if (!aVar.f54532f) {
                    return;
                }
            }
            this.f55765z.f55708a.d();
        }
    }

    public final void b() {
        int i2;
        h hVar = this.f55765z;
        long jF = !hVar.f55716i ? 0L : hVar.f55708a.f();
        if (jF == Long.MIN_VALUE) {
            b(false);
            return;
        }
        h hVar2 = this.f55765z;
        long jAbs = Math.abs(this.f55764y - (hVar2.f55712e - hVar2.f55714g));
        long j2 = jF - jAbs;
        c cVar = this.f55743d;
        char c2 = j2 > cVar.f54692c ? (char) 0 : j2 < cVar.f54691b ? (char) 2 : (char) 1;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = cVar.f54690a;
        synchronized (lVar) {
            i2 = lVar.f56116c * 65536;
        }
        boolean z2 = c2 == 2 || (c2 == 1 && cVar.f54696g && !(i2 >= cVar.f54695f));
        cVar.f54696g = z2;
        b(z2);
        if (z2) {
            h hVar3 = this.f55765z;
            hVar3.f55719l = false;
            hVar3.f55708a.b(jAbs);
            return;
        }
        this.f55765z.f55719l = true;
    }

    public final void a(long j2, long j3) {
        this.f55745f.removeMessages(2);
        long jElapsedRealtime = (j2 + j3) - SystemClock.elapsedRealtime();
        if (jElapsedRealtime <= 0) {
            this.f55745f.sendEmptyMessage(2);
        } else {
            this.f55745f.sendEmptyMessageDelayed(2, jElapsedRealtime);
        }
    }

    public final long a(int i2, long j2) throws d {
        h hVar;
        g();
        this.f55758s = false;
        a(2);
        h hVar2 = this.f55738B;
        if (hVar2 == null) {
            h hVar3 = this.f55765z;
            if (hVar3 != null) {
                hVar3.a();
            }
            hVar = null;
        } else {
            hVar = null;
            while (hVar2 != null) {
                if (hVar2.f55713f == i2 && hVar2.f55716i) {
                    hVar = hVar2;
                } else {
                    hVar2.a();
                }
                hVar2 = hVar2.f55718k;
            }
        }
        h hVar4 = this.f55738B;
        if (hVar4 != hVar || hVar4 != this.f55737A) {
            for (a aVar : this.f55755p) {
                aVar.c();
            }
            this.f55755p = new a[0];
            this.f55753n = null;
            this.f55752m = null;
            this.f55738B = null;
        }
        if (hVar != null) {
            hVar.f55718k = null;
            this.f55765z = hVar;
            this.f55737A = hVar;
            a(hVar);
            h hVar5 = this.f55738B;
            if (hVar5.f55717j) {
                j2 = hVar5.f55708a.a(j2);
            }
            a(j2);
            b();
        } else {
            this.f55765z = null;
            this.f55737A = null;
            this.f55738B = null;
            a(j2);
        }
        this.f55745f.sendEmptyMessage(2);
        return j2;
    }

    public final void a(long j2) {
        h hVar = this.f55738B;
        long j3 = hVar == null ? j2 + 60000000 : j2 + (hVar.f55712e - hVar.f55714g);
        this.f55764y = j3;
        this.f55744e.a(j3);
        for (a aVar : this.f55755p) {
            long j4 = this.f55764y;
            aVar.f54533g = false;
            aVar.f54532f = false;
            aVar.a(false, j4);
        }
    }

    public final void a(s sVar) {
        s sVarA;
        com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar = this.f55753n;
        if (hVar != null) {
            sVarA = hVar.a(sVar);
        } else {
            sVarA = this.f55744e.a(sVar);
        }
        this.f55751l = sVarA;
        this.f55747h.obtainMessage(7, sVarA).sendToTarget();
    }

    public final void a(boolean z2) {
        this.f55745f.removeMessages(2);
        this.f55758s = false;
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f55744e;
        if (uVar.f56226a) {
            uVar.a(uVar.b());
            uVar.f56226a = false;
        }
        this.f55753n = null;
        this.f55752m = null;
        this.f55764y = 60000000L;
        for (a aVar : this.f55755p) {
            try {
                a(aVar);
                aVar.c();
            } catch (d | RuntimeException e2) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e2);
            }
        }
        this.f55755p = new a[0];
        h hVar = this.f55738B;
        if (hVar == null) {
            hVar = this.f55765z;
        }
        while (hVar != null) {
            hVar.a();
            hVar = hVar.f55718k;
        }
        this.f55765z = null;
        this.f55737A = null;
        this.f55738B = null;
        b(false);
        if (z2) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar2 = this.f55754o;
            if (uVar2 != null) {
                uVar2.b();
                this.f55754o = null;
            }
            this.f55739C = null;
        }
    }

    public final void a(e[] eVarArr) {
        try {
            for (e eVar : eVarArr) {
                eVar.f54717a.a(eVar.f54718b, eVar.f54719c);
            }
            if (this.f55754o != null) {
                this.f55745f.sendEmptyMessage(2);
            }
            synchronized (this) {
                notifyAll();
            }
        } catch (Throwable th) {
            synchronized (this) {
                notifyAll();
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9  */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.fyber.inneractive.sdk.player.exoplayer2.l] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.fyber.inneractive.sdk.player.exoplayer2.x] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.fyber.inneractive.sdk.player.exoplayer2.x] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Pair pair) {
        boolean z2;
        int i2;
        ?? r9;
        x xVar = this.f55739C;
        x xVar2 = (x) pair.first;
        this.f55739C = xVar2;
        Object obj = pair.second;
        if (xVar != null) {
            z2 = false;
            i2 = z2 ? 1 : 0;
            r9 = z2;
        } else if (this.f55762w > 0) {
            Pair pairA = a(this.f55763x);
            int i3 = this.f55762w;
            this.f55762w = 0;
            this.f55763x = null;
            if (pairA == null) {
                i iVar = new i(0, 0L);
                this.f55750k = iVar;
                this.f55747h.obtainMessage(6, new k(this.f55739C, obj, iVar, i3)).sendToTarget();
                this.f55750k = new i(0, -9223372036854775807L);
                a(4);
                a(false);
                return;
            }
            this.f55750k = new i(((Integer) pairA.first).intValue(), ((Long) pairA.second).longValue());
            r9 = 0;
            i2 = i3;
        } else {
            if (this.f55750k.f55728b == -9223372036854775807L) {
                if (xVar2.c()) {
                    i iVar2 = new i(0, 0L);
                    this.f55750k = iVar2;
                    this.f55747h.obtainMessage(6, new k(this.f55739C, obj, iVar2, 0)).sendToTarget();
                    this.f55750k = new i(0, -9223372036854775807L);
                    a(4);
                    a(false);
                    return;
                }
                z2 = false;
                Pair pairA2 = a(this.f55739C, 0, -9223372036854775807L, 0L);
                this.f55750k = new i(((Integer) pairA2.first).intValue(), ((Long) pairA2.second).longValue());
            }
            i2 = z2 ? 1 : 0;
            r9 = z2;
        }
        h hVar = this.f55738B;
        if (hVar == null) {
            hVar = this.f55765z;
        }
        if (hVar == null) {
            this.f55747h.obtainMessage(6, new k(this.f55739C, obj, this.f55750k, i2)).sendToTarget();
            return;
        }
        int iA = this.f55739C.a(hVar.f55709b);
        if (iA == -1) {
            int i5 = hVar.f55713f;
            x xVar3 = this.f55739C;
            int iA2 = -1;
            while (iA2 == -1 && i5 < xVar.a() - 1) {
                i5++;
                iA2 = xVar3.a(xVar.a(i5, this.f55749j, true).f56243b);
            }
            if (iA2 == -1) {
                i iVar3 = new i(r9, 0L);
                this.f55750k = iVar3;
                this.f55747h.obtainMessage(6, new k(this.f55739C, obj, iVar3, i2)).sendToTarget();
                this.f55750k = new i(r9, -9223372036854775807L);
                a(4);
                a(r9);
                return;
            }
            int i7 = this.f55739C.a(iA2, this.f55749j, r9).f56244c;
            h hVar2 = hVar;
            Pair pairA3 = a(this.f55739C, 0, -9223372036854775807L, 0L);
            int iIntValue = ((Integer) pairA3.first).intValue();
            long jLongValue = ((Long) pairA3.second).longValue();
            this.f55739C.a(iIntValue, this.f55749j, true);
            Object obj2 = this.f55749j.f56243b;
            hVar2.f55713f = -1;
            while (true) {
                hVar2 = hVar2.f55718k;
                if (hVar2 != null) {
                    hVar2.f55713f = hVar2.f55709b.equals(obj2) ? iIntValue : -1;
                } else {
                    i iVar4 = new i(iIntValue, a(iIntValue, jLongValue));
                    this.f55750k = iVar4;
                    this.f55747h.obtainMessage(6, new k(this.f55739C, obj, iVar4, i2)).sendToTarget();
                    return;
                }
            }
        } else {
            h hVar3 = hVar;
            this.f55739C.a(iA, this.f55749j, r9);
            ?? r12 = (iA != this.f55739C.a() - 1 || this.f55739C.a(this.f55749j.f56244c, this.f55748i, 0L).f56314b) ? r9 : 1;
            hVar3.f55713f = iA;
            hVar3.f55715h = r12;
            ?? r13 = hVar3 == this.f55737A ? 1 : r9;
            i iVar5 = this.f55750k;
            if (iA != iVar5.f55727a) {
                i iVar6 = new i(iA, iVar5.f55728b);
                iVar6.f55729c = iVar5.f55729c;
                this.f55750k = iVar6;
            }
            int i8 = iA;
            ?? r2 = r13;
            h hVar4 = hVar3;
            while (true) {
                h hVar5 = hVar4.f55718k;
                if (hVar5 == null) {
                    break;
                }
                i8++;
                this.f55739C.a(i8, this.f55749j, true);
                ?? r52 = (i8 != this.f55739C.a() - 1 || this.f55739C.a(this.f55749j.f56244c, this.f55748i, 0L).f56314b) ? r9 : 1;
                if (hVar5.f55709b.equals(this.f55749j.f56243b)) {
                    hVar5.f55713f = i8;
                    hVar5.f55715h = r52;
                    hVar4 = hVar5;
                    r2 |= hVar5 == this.f55737A ? 1 : r9;
                } else if (r2 == 0) {
                    int i9 = this.f55738B.f55713f;
                    this.f55750k = new i(i9, a(i9, this.f55750k.f55729c));
                } else {
                    this.f55765z = hVar4;
                    hVar4.f55718k = null;
                    while (hVar5 != null) {
                        hVar5.a();
                        hVar5 = hVar5.f55718k;
                    }
                }
            }
            this.f55747h.obtainMessage(6, new k(this.f55739C, obj, this.f55750k, i2)).sendToTarget();
        }
    }

    public final Pair a(j jVar) {
        x xVar = jVar.f55730a;
        if (xVar.c()) {
            xVar = this.f55739C;
        }
        x xVar2 = xVar;
        try {
            Pair pairA = a(xVar2, jVar.f55731b, jVar.f55732c, 0L);
            x xVar3 = this.f55739C;
            if (xVar3 == xVar2) {
                return pairA;
            }
            int iA = xVar3.a(xVar2.a(((Integer) pairA.first).intValue(), this.f55749j, true).f56243b);
            if (iA != -1) {
                return Pair.create(Integer.valueOf(iA), (Long) pairA.second);
            }
            int iIntValue = ((Integer) pairA.first).intValue();
            x xVar4 = this.f55739C;
            int iA2 = -1;
            while (iA2 == -1 && iIntValue < xVar2.a() - 1) {
                iIntValue++;
                iA2 = xVar4.a(xVar2.a(iIntValue, this.f55749j, true).f56243b);
            }
            if (iA2 == -1) {
                return null;
            }
            int i2 = this.f55739C.a(iA2, this.f55749j, false).f56244c;
            return a(this.f55739C, 0, -9223372036854775807L, 0L);
        } catch (IndexOutOfBoundsException unused) {
            throw new q();
        }
    }

    public final Pair a(x xVar, int i2, long j2, long j3) {
        int iB = xVar.b();
        if (i2 >= 0 && i2 < iB) {
            xVar.a(i2, this.f55748i, j3);
            if (j2 == -9223372036854775807L) {
                j2 = this.f55748i.f56317e;
                if (j2 == -9223372036854775807L) {
                    return null;
                }
            }
            w wVar = this.f55748i;
            int i3 = wVar.f56315c;
            long j4 = wVar.f56319g + j2;
            long j5 = xVar.a(i3, this.f55749j, false).f56245d;
            while (j5 != -9223372036854775807L && j4 >= j5 && i3 < this.f55748i.f56316d) {
                j4 -= j5;
                i3++;
                j5 = xVar.a(i3, this.f55749j, false).f56245d;
            }
            return Pair.create(Integer.valueOf(i3), Long.valueOf(j4));
        }
        throw new IndexOutOfBoundsException();
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar) throws d {
        com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar2;
        h hVar = this.f55765z;
        if (hVar == null || (sVar2 = hVar.f55708a) != sVar) {
            return;
        }
        hVar.f55716i = true;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVarA = hVar.f55723p.a(hVar.f55722o, sVar2.a());
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = hVar.f55726s;
        if (jVar != null) {
            for (int i2 = 0; i2 < jVarA.f56010b.f56006a; i2++) {
                if (!jVarA.a(jVar, i2)) {
                    hVar.f55720m = jVarA;
                    break;
                }
            }
        } else {
            hVar.f55720m = jVarA;
            break;
        }
        hVar.f55714g = hVar.a(hVar.f55714g, false, new boolean[hVar.f55721n.length]);
        if (this.f55738B == null) {
            h hVar2 = this.f55765z;
            this.f55737A = hVar2;
            a(hVar2.f55714g);
            a(this.f55737A);
        }
        b();
    }

    public final void a(h hVar) throws d {
        if (this.f55738B == hVar) {
            return;
        }
        boolean[] zArr = new boolean[this.f55740a.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            a[] aVarArr = this.f55740a;
            if (i2 < aVarArr.length) {
                a aVar = aVarArr[i2];
                boolean z2 = aVar.f54529c != 0;
                zArr[i2] = z2;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = hVar.f55720m.f56010b.f56007b[i2];
                if (bVar != null) {
                    i3++;
                }
                if (z2 && (bVar == null || (aVar.f54533g && aVar.f54530d == this.f55738B.f55710c[i2]))) {
                    if (aVar == this.f55752m) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f55744e;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar2 = this.f55753n;
                        uVar.getClass();
                        uVar.a(hVar2.b());
                        uVar.f56229d = hVar2.a();
                        this.f55753n = null;
                        this.f55752m = null;
                    }
                    a(aVar);
                    aVar.c();
                }
                i2++;
            } else {
                this.f55738B = hVar;
                this.f55747h.obtainMessage(3, hVar.f55720m).sendToTarget();
                a(zArr, i3);
                return;
            }
        }
    }

    public final void a(boolean[] zArr, int i2) throws d {
        int i3;
        this.f55755p = new a[i2];
        int i5 = 0;
        int i7 = 0;
        while (true) {
            a[] aVarArr = this.f55740a;
            if (i5 >= aVarArr.length) {
                return;
            }
            a aVar = aVarArr[i5];
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = this.f55738B.f55720m;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = jVar.f56010b.f56007b[i5];
            if (bVar != null) {
                int i8 = i7 + 1;
                this.f55755p[i7] = aVar;
                if (aVar.f54529c == 0) {
                    t tVar = jVar.f56012d[i5];
                    boolean z2 = this.f55757r && this.f55760u == 3;
                    boolean z3 = !zArr[i5] && z2;
                    int length = bVar.f55999c.length;
                    o[] oVarArr = new o[length];
                    for (int i9 = 0; i9 < length; i9++) {
                        oVarArr[i9] = bVar.f56000d[i9];
                    }
                    h hVar = this.f55738B;
                    com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar = hVar.f55710c[i5];
                    long j2 = this.f55764y;
                    i3 = i5;
                    long j3 = hVar.f55712e - hVar.f55714g;
                    if (aVar.f54529c == 0) {
                        aVar.f54528b = tVar;
                        aVar.f54529c = 1;
                        aVar.h();
                        if (!aVar.f54533g) {
                            aVar.f54530d = vVar;
                            aVar.f54532f = false;
                            aVar.f54531e = j3;
                            aVar.a(oVarArr);
                            aVar.a(z3, j2);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.h hVarD = aVar.d();
                            if (hVarD != null) {
                                if (this.f55753n == null) {
                                    this.f55753n = hVarD;
                                    this.f55752m = aVar;
                                    ((MediaCodecAudioRenderer) hVarD).f54535Q.a(this.f55751l);
                                } else {
                                    throw new d(new IllegalStateException("Multiple renderer media clocks enabled."));
                                }
                            }
                            if (z2) {
                                if (aVar.f54529c == 1) {
                                    aVar.f54529c = 2;
                                    aVar.i();
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    i3 = i5;
                }
                i7 = i8;
            } else {
                i3 = i5;
            }
            i5 = i3 + 1;
        }
    }
}
