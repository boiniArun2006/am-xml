package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f54778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f54780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedBlockingDeque f54781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f54782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f54783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f54784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f54785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f54786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f54787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.a f54788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f54789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f54790m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f54791n;

    public final void a(boolean z2) {
        int andSet = this.f54784g.getAndSet(z2 ? 0 : 2);
        a();
        e eVar = this.f54780c;
        eVar.f54747m = Long.MIN_VALUE;
        eVar.f54748n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.f54786i = null;
        }
    }

    public final void b() {
        if (this.f54784g.getAndSet(2) == 0) {
            a();
        }
    }

    public final void c() {
        if (this.f54784g.compareAndSet(1, 0)) {
            return;
        }
        a();
    }

    public final long d() {
        long jMax;
        e eVar = this.f54780c;
        synchronized (eVar) {
            jMax = Math.max(eVar.f54747m, eVar.f54748n);
        }
        return jMax;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.o e() {
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar;
        e eVar = this.f54780c;
        synchronized (eVar) {
            oVar = eVar.f54750p ? null : eVar.f54751q;
        }
        return oVar;
    }

    public final void f() {
        long j2;
        e eVar = this.f54780c;
        synchronized (eVar) {
            int i2 = eVar.f54743i;
            if (i2 == 0) {
                j2 = -1;
            } else {
                int i3 = eVar.f54745k + i2;
                int i5 = eVar.f54735a;
                int i7 = (i3 - 1) % i5;
                eVar.f54745k = i3 % i5;
                eVar.f54744j += i2;
                eVar.f54743i = 0;
                j2 = eVar.f54737c[i7] + ((long) eVar.f54738d[i7]);
            }
        }
        if (j2 != -1) {
            a(j2);
        }
    }

    public g(com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar) {
        this.f54778a = bVar;
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar).getClass();
        this.f54779b = 65536;
        this.f54780c = new e();
        this.f54781d = new LinkedBlockingDeque();
        this.f54782e = new d();
        this.f54783f = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(32);
        this.f54784g = new AtomicInteger();
        this.f54789l = 65536;
    }

    public final boolean a(boolean z2, long j2) {
        long j3;
        e eVar = this.f54780c;
        synchronized (eVar) {
            if (eVar.f54743i != 0) {
                long[] jArr = eVar.f54740f;
                int i2 = eVar.f54745k;
                if (j2 < jArr[i2]) {
                    j3 = -1;
                } else {
                    if (j2 <= eVar.f54748n || z2) {
                        int i3 = -1;
                        int i5 = 0;
                        while (i2 != eVar.f54746l && eVar.f54740f[i2] <= j2) {
                            if ((eVar.f54739e[i2] & 1) != 0) {
                                i3 = i5;
                            }
                            i2 = (i2 + 1) % eVar.f54735a;
                            i5++;
                        }
                        if (i3 != -1) {
                            int i7 = (eVar.f54745k + i3) % eVar.f54735a;
                            eVar.f54745k = i7;
                            eVar.f54744j += i3;
                            eVar.f54743i -= i3;
                            j3 = eVar.f54737c[i7];
                        }
                    }
                    j3 = -1;
                }
            } else {
                j3 = -1;
            }
        }
        if (j3 == -1) {
            return false;
        }
        a(j3);
        return true;
    }

    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z2, boolean z3, long j2) {
        int iO;
        long j3;
        byte b2;
        e eVar = this.f54780c;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = this.f54786i;
        d dVar = this.f54782e;
        synchronized (eVar) {
            iO = 1;
            if (eVar.f54743i != 0) {
                if (!z2) {
                    com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = eVar.f54742h;
                    int i2 = eVar.f54745k;
                    if (oVarArr[i2] == oVar) {
                        if (cVar.f54706c == null && cVar.f54708e == 0) {
                            b2 = -3;
                        } else {
                            long j4 = eVar.f54740f[i2];
                            cVar.f54707d = j4;
                            cVar.f54704a = eVar.f54739e[i2];
                            dVar.f54731a = eVar.f54738d[i2];
                            dVar.f54732b = eVar.f54737c[i2];
                            dVar.f54734d = eVar.f54741g[i2];
                            eVar.f54747m = Math.max(eVar.f54747m, j4);
                            int i3 = eVar.f54743i - 1;
                            eVar.f54743i = i3;
                            int i5 = eVar.f54745k + 1;
                            eVar.f54745k = i5;
                            eVar.f54744j++;
                            if (i5 == eVar.f54735a) {
                                eVar.f54745k = 0;
                            }
                            if (i3 > 0) {
                                j3 = eVar.f54737c[eVar.f54745k];
                            } else {
                                j3 = dVar.f54732b + ((long) dVar.f54731a);
                            }
                            dVar.f54733c = j3;
                            b2 = -4;
                        }
                    }
                }
                pVar.f55879a = eVar.f54742h[eVar.f54745k];
                b2 = -5;
            } else if (z3) {
                cVar.f54704a = 4;
                b2 = -4;
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = eVar.f54751q;
                if (oVar2 == null || (!z2 && oVar2 == oVar)) {
                    b2 = -3;
                } else {
                    pVar.f55879a = oVar2;
                    b2 = -5;
                }
            }
        }
        if (b2 == -5) {
            this.f54786i = pVar.f55879a;
            return -5;
        }
        if (b2 != -4) {
            if (b2 == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!cVar.b(4)) {
            if (cVar.f54707d < j2) {
                cVar.f54704a = Integer.MIN_VALUE | cVar.f54704a;
            }
            if (cVar.b(1073741824)) {
                d dVar2 = this.f54782e;
                long j5 = dVar2.f54732b;
                this.f54783f.c(1);
                a(j5, this.f54783f.f56206a, 1);
                long j6 = j5 + 1;
                byte b4 = this.f54783f.f56206a[0];
                boolean z4 = (b4 & ByteCompanionObject.MIN_VALUE) != 0;
                int i7 = b4 & ByteCompanionObject.MAX_VALUE;
                com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar = cVar.f54705b;
                if (bVar.f54699a == null) {
                    bVar.f54699a = new byte[16];
                }
                a(j6, bVar.f54699a, i7);
                long j7 = j6 + ((long) i7);
                if (z4) {
                    this.f54783f.c(2);
                    a(j7, this.f54783f.f56206a, 2);
                    j7 += 2;
                    iO = this.f54783f.o();
                }
                int i8 = iO;
                com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar2 = cVar.f54705b;
                int[] iArr = bVar2.f54700b;
                if (iArr == null || iArr.length < i8) {
                    iArr = new int[i8];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = bVar2.f54701c;
                if (iArr3 == null || iArr3.length < i8) {
                    iArr3 = new int[i8];
                }
                int[] iArr4 = iArr3;
                if (z4) {
                    int i9 = i8 * 6;
                    this.f54783f.c(i9);
                    a(j7, this.f54783f.f56206a, i9);
                    j7 += (long) i9;
                    this.f54783f.e(0);
                    for (int i10 = 0; i10 < i8; i10++) {
                        iArr2[i10] = this.f54783f.o();
                        iArr4[i10] = this.f54783f.m();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = dVar2.f54731a - ((int) (j7 - dVar2.f54732b));
                }
                com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar3 = cVar.f54705b;
                bVar3.a(i8, iArr2, iArr4, dVar2.f54734d, bVar3.f54699a);
                long j9 = dVar2.f54732b;
                int i11 = (int) (j7 - j9);
                dVar2.f54732b = j9 + ((long) i11);
                dVar2.f54731a -= i11;
            }
            int i12 = this.f54782e.f54731a;
            ByteBuffer byteBuffer = cVar.f54706c;
            if (byteBuffer == null) {
                cVar.f54706c = cVar.a(i12);
            } else {
                int iCapacity = byteBuffer.capacity();
                int iPosition = cVar.f54706c.position();
                int i13 = i12 + iPosition;
                if (iCapacity < i13) {
                    ByteBuffer byteBufferA = cVar.a(i13);
                    if (iPosition > 0) {
                        cVar.f54706c.position(0);
                        cVar.f54706c.limit(iPosition);
                        byteBufferA.put(cVar.f54706c);
                    }
                    cVar.f54706c = byteBufferA;
                }
            }
            d dVar3 = this.f54782e;
            long j10 = dVar3.f54732b;
            ByteBuffer byteBuffer2 = cVar.f54706c;
            int i14 = dVar3.f54731a;
            while (i14 > 0) {
                a(j10);
                int i15 = (int) (j10 - this.f54785h);
                int iMin = Math.min(i14, this.f54779b - i15);
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f54781d.peek();
                byteBuffer2.put(aVar.f56013a, aVar.f56014b + i15, iMin);
                j10 += (long) iMin;
                i14 -= iMin;
            }
            a(this.f54782e.f54733c);
        }
        return -4;
    }

    public final void a(long j2, byte[] bArr, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            a(j2);
            int i5 = (int) (j2 - this.f54785h);
            int iMin = Math.min(i2 - i3, this.f54779b - i5);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f54781d.peek();
            System.arraycopy(aVar.f56013a, aVar.f56014b + i5, bArr, i3, iMin);
            j2 += (long) iMin;
            i3 += iMin;
        }
    }

    public final void a(long j2) {
        int i2 = ((int) (j2 - this.f54785h)) / this.f54779b;
        for (int i3 = 0; i3 < i2; i3++) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.f54778a;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f54781d.remove();
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar;
            synchronized (lVar) {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = lVar.f56114a;
                aVarArr[0] = aVar;
                lVar.a(aVarArr);
            }
            this.f54785h += (long) this.f54779b;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        boolean z2;
        if (oVar == null) {
            oVar = null;
        }
        e eVar = this.f54780c;
        synchronized (eVar) {
            z2 = true;
            if (oVar == null) {
                eVar.f54750p = true;
            } else {
                eVar.f54750p = false;
                com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = eVar.f54751q;
                int i2 = z.f56234a;
                if (!oVar.equals(oVar2)) {
                    eVar.f54751q = oVar;
                }
            }
            z2 = false;
        }
        f fVar = this.f54791n;
        if (fVar == null || !z2) {
            return;
        }
        fVar.e();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final int a(b bVar, int i2, boolean z2) throws InterruptedException, EOFException {
        b bVar2;
        int iA = 0;
        if (!this.f54784g.compareAndSet(0, 1)) {
            int iMin = Math.min(bVar.f54729f, i2);
            bVar.b(iMin);
            if (iMin == 0) {
                iMin = bVar.a(b.f54723g, 0, Math.min(i2, 4096), 0, true);
            }
            if (iMin != -1) {
                bVar.f54726c += (long) iMin;
            }
            if (iMin != -1) {
                return iMin;
            }
            if (z2) {
                return -1;
            }
            throw new EOFException();
        }
        try {
            int iA2 = a(i2);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.f54788k;
            byte[] bArr = aVar.f56013a;
            int i3 = aVar.f56014b + this.f54789l;
            int i5 = bVar.f54729f;
            if (i5 != 0) {
                int iMin2 = Math.min(i5, iA2);
                System.arraycopy(bVar.f54727d, 0, bArr, i3, iMin2);
                bVar.b(iMin2);
                iA = iMin2;
            }
            if (iA == 0) {
                bVar2 = bVar;
                iA = bVar.a(bArr, i3, iA2, 0, true);
            } else {
                bVar2 = bVar;
            }
            if (iA != -1) {
                bVar2.f54726c += (long) iA;
            }
            if (iA == -1) {
                if (z2) {
                    c();
                    return -1;
                }
                throw new EOFException();
            }
            this.f54789l += iA;
            this.f54787j += (long) iA;
            c();
            return iA;
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(int i2, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (!this.f54784g.compareAndSet(0, 1)) {
            nVar.e(nVar.f56207b + i2);
            return;
        }
        while (i2 > 0) {
            int iA = a(i2);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.f54788k;
            nVar.a(aVar.f56013a, aVar.f56014b + this.f54789l, iA);
            this.f54789l += iA;
            this.f54787j += (long) iA;
            i2 -= iA;
        }
        c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(long j2, int i2, int i3, int i5, byte[] bArr) {
        if (!this.f54784g.compareAndSet(0, 1)) {
            e eVar = this.f54780c;
            synchronized (eVar) {
                eVar.f54748n = Math.max(eVar.f54748n, j2);
            }
            return;
        }
        try {
            if (this.f54790m) {
                if ((i2 & 1) != 0 && this.f54780c.a(j2)) {
                    this.f54790m = false;
                }
                return;
            }
            this.f54780c.a(j2, i2, (this.f54787j - ((long) i3)) - ((long) i5), i3, bArr);
        } finally {
            c();
        }
    }

    public final void a() {
        e eVar = this.f54780c;
        eVar.f54744j = 0;
        eVar.f54745k = 0;
        eVar.f54746l = 0;
        eVar.f54743i = 0;
        eVar.f54749o = true;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.f54778a;
        LinkedBlockingDeque linkedBlockingDeque = this.f54781d;
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar).a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[]) linkedBlockingDeque.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[linkedBlockingDeque.size()]));
        this.f54781d.clear();
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) this.f54778a).a();
        this.f54785h = 0L;
        this.f54787j = 0L;
        this.f54788k = null;
        this.f54789l = this.f54779b;
    }

    public final int a(int i2) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar;
        if (this.f54789l == this.f54779b) {
            this.f54789l = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) this.f54778a;
            synchronized (lVar) {
                try {
                    lVar.f56116c++;
                    int i3 = lVar.f56117d;
                    if (i3 > 0) {
                        com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = lVar.f56118e;
                        int i5 = i3 - 1;
                        lVar.f56117d = i5;
                        aVar = aVarArr[i5];
                        aVarArr[i5] = null;
                    } else {
                        aVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a(0, new byte[65536]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f54788k = aVar;
            this.f54781d.add(aVar);
        }
        return Math.min(i2, this.f54779b - this.f54789l);
    }
}
