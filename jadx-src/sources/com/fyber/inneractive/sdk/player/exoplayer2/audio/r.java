package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import androidx.media3.exoplayer.dash.DashMediaSource;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class r {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f54582A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f54583B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f54584C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Method f54585D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f54586E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f54587F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f54588G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f54589H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f54590I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f54591J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f54592K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f54593L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f54594M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f54595N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f54596O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f54597P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public c[] f54598Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ByteBuffer[] f54599R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ByteBuffer f54600S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ByteBuffer f54601T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public byte[] f54602U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f54603V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f54604W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f54605X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f54606Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f54607Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f54608a;
    public boolean a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f54609b;
    public boolean b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c[] f54610c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f54611c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f54612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConditionVariable f54613e = new ConditionVariable(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f54614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f54615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedList f54616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AudioTrack f54617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f54618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f54619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f54620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f54621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f54622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f54623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f54624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f54625q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.s f54626r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.s f54627s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f54628t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f54629u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ByteBuffer f54630v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f54631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f54632x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f54633y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f54634z;

    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i2, int i3, int i5, int[] iArr) throws m {
        int i7;
        int i8;
        int i9 = z.f56234a;
        if (i5 == Integer.MIN_VALUE) {
            i7 = i2 * 3;
        } else if (i5 == 1073741824) {
            i7 = i2 * 4;
        } else if (i5 == 2) {
            i7 = i2 * 2;
        } else {
            if (i5 != 3) {
                throw new IllegalArgumentException();
            }
            i7 = i2;
        }
        this.f54586E = i7;
        this.f54608a.f54637d = iArr;
        boolean zA = false;
        for (c cVar : this.f54610c) {
            try {
                zA |= cVar.a(i3, i2, i5);
                if (cVar.d()) {
                    i2 = cVar.e();
                    i5 = 2;
                }
            } catch (b e2) {
                throw new m(e2);
            }
        }
        if (zA) {
            h();
        }
        int i10 = 252;
        switch (i2) {
            case 1:
                i8 = 4;
                break;
            case 2:
                i8 = 12;
                break;
            case 3:
                i8 = 28;
                break;
            case 4:
                i8 = 204;
                break;
            case 5:
                i8 = Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
                break;
            case 6:
                i8 = 252;
                break;
            case 7:
                i8 = 1276;
                break;
            case 8:
                i8 = com.fyber.inneractive.sdk.player.exoplayer2.b.f54688a;
                break;
            default:
                throw new m(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unsupported channel count: ", i2));
        }
        int i11 = z.f56234a;
        if (i11 > 23 || !"foster".equals(z.f56235b) || !"NVIDIA".equals(z.f56236c)) {
            i10 = i8;
        } else if (i2 != 3 && i2 != 5) {
            if (i2 == 7) {
                i10 = com.fyber.inneractive.sdk.player.exoplayer2.b.f54688a;
            }
        }
        if (i11 <= 25) {
            "fugu".equals(z.f56235b);
        }
        if (!zA && d() && this.f54620l == i5 && this.f54618j == i3 && this.f54619k == i10) {
            return;
        }
        g();
        this.f54620l = i5;
        this.f54623o = false;
        this.f54618j = i3;
        this.f54619k = i10;
        this.f54621m = 2;
        this.f54589H = i2 * 2;
        int minBufferSize = AudioTrack.getMinBufferSize(i3, i10, 2);
        if (minBufferSize == -2) {
            throw new IllegalStateException();
        }
        int i12 = 4 * minBufferSize;
        long j2 = this.f54618j;
        int i13 = this.f54589H;
        int i14 = ((int) ((250000 * j2) / 1000000)) * i13;
        int iMax = (int) Math.max(minBufferSize, ((j2 * 750000) / 1000000) * ((long) i13));
        if (i12 < i14) {
            i12 = i14;
        } else if (i12 > iMax) {
            i12 = iMax;
        }
        this.f54624p = i12;
        this.f54625q = (((long) (i12 / this.f54589H)) * 1000000) / ((long) this.f54618j);
        a(this.f54627s);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ByteBuffer byteBuffer, long j2) throws q {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f54601T;
            int iWrite = 0;
            if (byteBuffer2 == null) {
                this.f54601T = byteBuffer;
                if (z.f56234a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f54602U;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f54602U = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f54602U, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f54603V = 0;
                }
            } else if (byteBuffer2 != byteBuffer) {
                throw new IllegalArgumentException();
            }
            int iRemaining2 = byteBuffer.remaining();
            if (z.f56234a < 21) {
                int iA = this.f54624p - ((int) (this.f54590I - (this.f54615g.a() * ((long) this.f54589H))));
                if (iA > 0) {
                    iWrite = this.f54617i.write(this.f54602U, this.f54603V, Math.min(iRemaining2, iA));
                    if (iWrite > 0) {
                        this.f54603V += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                }
            } else if (!this.a0) {
                iWrite = this.f54617i.write(byteBuffer, iRemaining2, 1);
            } else {
                if (j2 == -9223372036854775807L) {
                    throw new IllegalStateException();
                }
                AudioTrack audioTrack = this.f54617i;
                if (this.f54630v == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.f54630v = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.f54630v.putInt(1431633921);
                }
                if (this.f54631w == 0) {
                    this.f54630v.putInt(4, iRemaining2);
                    this.f54630v.putLong(8, j2 * 1000);
                    this.f54630v.position(0);
                    this.f54631w = iRemaining2;
                }
                int iRemaining3 = this.f54630v.remaining();
                if (iRemaining3 <= 0) {
                    int iWrite2 = audioTrack.write(byteBuffer, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.f54631w = 0;
                    } else {
                        this.f54631w -= iWrite2;
                    }
                    iWrite = iWrite2;
                } else {
                    int iWrite3 = audioTrack.write(this.f54630v, iRemaining3, 1);
                    if (iWrite3 < 0) {
                        this.f54631w = 0;
                        iWrite = iWrite3;
                    } else if (iWrite3 >= iRemaining3) {
                    }
                }
            }
            this.f54611c0 = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                throw new q(iWrite);
            }
            boolean z2 = this.f54623o;
            if (!z2) {
                this.f54590I += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (z2) {
                    this.f54591J += (long) this.f54592K;
                }
                this.f54601T = null;
            }
        }
    }

    public final void f() {
        this.f54606Y = true;
        if (d()) {
            this.f54595N = System.nanoTime() / 1000;
            this.f54617i.play();
        }
    }

    public final boolean d() {
        return this.f54617i != null;
    }

    public final boolean e() {
        if (z.f56234a >= 23) {
            return false;
        }
        int i2 = this.f54621m;
        return i2 == 5 || i2 == 6;
    }

    public final void h() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f54610c) {
            if (cVar.d()) {
                arrayList.add(cVar);
            } else {
                cVar.flush();
            }
        }
        int size = arrayList.size();
        this.f54598Q = (c[]) arrayList.toArray(new c[size]);
        this.f54599R = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            c cVar2 = this.f54598Q[i2];
            cVar2.flush();
            this.f54599R[i2] = cVar2.a();
        }
    }

    public r(c[] cVarArr, u uVar) {
        this.f54612d = uVar;
        if (z.f56234a >= 18) {
            try {
                this.f54585D = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (z.f56234a >= 19) {
            this.f54615g = new l();
        } else {
            this.f54615g = new k();
        }
        s sVar = new s();
        this.f54608a = sVar;
        x xVar = new x();
        this.f54609b = xVar;
        c[] cVarArr2 = new c[cVarArr.length + 3];
        this.f54610c = cVarArr2;
        cVarArr2[0] = new v();
        cVarArr2[1] = sVar;
        System.arraycopy(cVarArr, 0, cVarArr2, 2, cVarArr.length);
        cVarArr2[cVarArr.length + 2] = xVar;
        this.f54614f = new long[10];
        this.f54597P = 1.0f;
        this.f54593L = 0;
        this.f54622n = 3;
        this.f54607Z = 0;
        this.f54627s = com.fyber.inneractive.sdk.player.exoplayer2.s.f55880d;
        this.f54604W = -1;
        this.f54598Q = new c[0];
        this.f54599R = new ByteBuffer[0];
        this.f54616h = new LinkedList();
    }

    public final boolean c() {
        if (d()) {
            if (b() <= this.f54615g.a()) {
                if (e() && this.f54617i.getPlayState() == 2 && this.f54617i.getPlaybackHeadPosition() == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void g() {
        if (d()) {
            this.f54587F = 0L;
            this.f54588G = 0L;
            this.f54590I = 0L;
            this.f54591J = 0L;
            this.f54592K = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.s sVar = this.f54626r;
            if (sVar != null) {
                this.f54627s = sVar;
                this.f54626r = null;
            } else if (!this.f54616h.isEmpty()) {
                this.f54627s = ((p) this.f54616h.getLast()).f54579a;
            }
            this.f54616h.clear();
            this.f54628t = 0L;
            this.f54629u = 0L;
            this.f54600S = null;
            this.f54601T = null;
            int i2 = 0;
            while (true) {
                c[] cVarArr = this.f54598Q;
                if (i2 >= cVarArr.length) {
                    break;
                }
                c cVar = cVarArr[i2];
                cVar.flush();
                this.f54599R[i2] = cVar.a();
                i2++;
            }
            this.f54605X = false;
            this.f54604W = -1;
            this.f54630v = null;
            this.f54631w = 0;
            this.f54593L = 0;
            this.f54596O = 0L;
            this.f54634z = 0L;
            this.f54633y = 0;
            this.f54632x = 0;
            this.f54582A = 0L;
            this.f54583B = false;
            this.f54584C = 0L;
            if (this.f54617i.getPlayState() == 3) {
                this.f54617i.pause();
            }
            AudioTrack audioTrack = this.f54617i;
            this.f54617i = null;
            this.f54615g.a(null, false);
            this.f54613e.close();
            new j(this, audioTrack).start();
        }
    }

    public final void i() {
        if (!d()) {
            return;
        }
        if (z.f56234a >= 21) {
            this.f54617i.setVolume(this.f54597P);
            return;
        }
        AudioTrack audioTrack = this.f54617i;
        float f3 = this.f54597P;
        audioTrack.setStereoVolume(f3, f3);
    }

    public final boolean a(ByteBuffer byteBuffer, long j2) throws q, n {
        long j3;
        int i2;
        ByteBuffer byteBuffer2 = this.f54600S;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            throw new IllegalArgumentException();
        }
        if (!d()) {
            this.f54613e.block();
            if (this.a0) {
                this.f54617i = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.f54619k).setEncoding(this.f54621m).setSampleRate(this.f54618j).build(), this.f54624p, 1, this.f54607Z);
            } else if (this.f54607Z == 0) {
                this.f54617i = new AudioTrack(this.f54622n, this.f54618j, this.f54619k, this.f54621m, this.f54624p, 1);
            } else {
                this.f54617i = new AudioTrack(this.f54622n, this.f54618j, this.f54619k, this.f54621m, this.f54624p, 1, this.f54607Z);
            }
            int state = this.f54617i.getState();
            if (state == 1) {
                int audioSessionId = this.f54617i.getAudioSessionId();
                if (this.f54607Z != audioSessionId) {
                    this.f54607Z = audioSessionId;
                    u uVar = (u) this.f54612d;
                    uVar.f54646a.f54534P.audioSessionId(audioSessionId);
                    uVar.f54646a.getClass();
                }
                this.f54615g.a(this.f54617i, e());
                i();
                this.b0 = false;
                if (this.f54606Y) {
                    f();
                }
            } else {
                try {
                    this.f54617i.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.f54617i = null;
                    throw th;
                }
                this.f54617i = null;
                throw new n(state, this.f54618j, this.f54619k, this.f54624p);
            }
        }
        if (e()) {
            if (this.f54617i.getPlayState() == 2) {
                this.b0 = false;
                return false;
            }
            if (this.f54617i.getPlayState() == 1 && this.f54615g.a() != 0) {
                return false;
            }
        }
        boolean z2 = this.b0;
        boolean zC2 = c();
        this.b0 = zC2;
        if (z2 && !zC2 && this.f54617i.getPlayState() != 1) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f54611c0;
            u uVar2 = (u) this.f54612d;
            uVar2.f54646a.f54534P.audioTrackUnderrun(this.f54624p, com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f54625q), jElapsedRealtime);
            uVar2.f54646a.getClass();
        }
        if (this.f54600S == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f54623o && this.f54592K == 0) {
                int i3 = this.f54621m;
                if (i3 == 7 || i3 == 8) {
                    int iPosition = byteBuffer.position();
                    i2 = ((((byteBuffer.get(iPosition + 5) & 252) >> 2) | ((byteBuffer.get(iPosition + 4) & 1) << 6)) + 1) * 32;
                } else if (i3 == 5) {
                    i2 = 1536;
                } else if (i3 == 6) {
                    i2 = (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? a.f54541a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
                } else {
                    throw new IllegalStateException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unexpected audio encoding: ", i3));
                }
                this.f54592K = i2;
            }
            if (this.f54626r == null) {
                j3 = 1000000;
            } else {
                if (!a()) {
                    return false;
                }
                j3 = 1000000;
                this.f54616h.add(new p(this.f54626r, Math.max(0L, j2), (b() * 1000000) / ((long) this.f54618j)));
                this.f54626r = null;
                h();
            }
            int i5 = this.f54593L;
            if (i5 == 0) {
                this.f54594M = Math.max(0L, j2);
                this.f54593L = 1;
            } else {
                long j4 = (((this.f54623o ? this.f54588G : this.f54587F / ((long) this.f54586E)) * j3) / ((long) this.f54618j)) + this.f54594M;
                if (i5 == 1 && Math.abs(j4 - j2) > 200000) {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + j4 + ", got " + j2 + "]");
                    this.f54593L = 2;
                }
                if (this.f54593L == 2) {
                    this.f54594M = (j2 - j4) + this.f54594M;
                    this.f54593L = 1;
                    u uVar3 = (u) this.f54612d;
                    uVar3.f54646a.getClass();
                    uVar3.f54646a.f54540V = true;
                }
            }
            if (this.f54623o) {
                this.f54588G += (long) this.f54592K;
            } else {
                this.f54587F += (long) byteBuffer.remaining();
            }
            this.f54600S = byteBuffer;
        }
        if (this.f54623o) {
            b(this.f54600S, j2);
        } else {
            a(j2);
        }
        if (this.f54600S.hasRemaining()) {
            return false;
        }
        this.f54600S = null;
        return true;
    }

    public final long b() {
        return this.f54623o ? this.f54591J : this.f54590I / ((long) this.f54589H);
    }

    public final void a(long j2) throws q {
        ByteBuffer byteBuffer;
        int length = this.f54598Q.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.f54599R[i2 - 1];
            } else {
                byteBuffer = this.f54600S;
                if (byteBuffer == null) {
                    byteBuffer = c.f54547a;
                }
            }
            if (i2 == length) {
                b(byteBuffer, j2);
            } else {
                c cVar = this.f54598Q[i2];
                cVar.a(byteBuffer);
                ByteBuffer byteBufferA = cVar.a();
                this.f54599R[i2] = byteBufferA;
                if (byteBufferA.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i2--;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() throws q {
        boolean z2;
        int i2;
        c[] cVarArr;
        if (this.f54604W == -1) {
            this.f54604W = this.f54623o ? this.f54598Q.length : 0;
            z2 = true;
            i2 = this.f54604W;
            cVarArr = this.f54598Q;
            if (i2 < cVarArr.length) {
                c cVar = cVarArr[i2];
                if (z2) {
                    cVar.b();
                }
                a(-9223372036854775807L);
                if (!cVar.c()) {
                    return false;
                }
                this.f54604W++;
                z2 = true;
                i2 = this.f54604W;
                cVarArr = this.f54598Q;
                if (i2 < cVarArr.length) {
                    ByteBuffer byteBuffer = this.f54601T;
                    if (byteBuffer != null) {
                        b(byteBuffer, -9223372036854775807L);
                        if (this.f54601T != null) {
                            return false;
                        }
                    }
                    this.f54604W = -1;
                    return true;
                }
            }
        } else {
            z2 = false;
            i2 = this.f54604W;
            cVarArr = this.f54598Q;
            if (i2 < cVarArr.length) {
            }
        }
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        if (this.f54623o) {
            com.fyber.inneractive.sdk.player.exoplayer2.s sVar2 = com.fyber.inneractive.sdk.player.exoplayer2.s.f55880d;
            this.f54627s = sVar2;
            return sVar2;
        }
        x xVar = this.f54609b;
        float f3 = sVar.f55881a;
        xVar.getClass();
        int i2 = z.f56234a;
        float fMax = Math.max(0.1f, Math.min(f3, 8.0f));
        xVar.f54680e = fMax;
        x xVar2 = this.f54609b;
        float f4 = sVar.f55882b;
        xVar2.getClass();
        xVar2.f54681f = Math.max(0.1f, Math.min(f4, 8.0f));
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.s(fMax, f4);
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar4 = this.f54626r;
        if (sVar4 == null) {
            if (!this.f54616h.isEmpty()) {
                sVar4 = ((p) this.f54616h.getLast()).f54579a;
            } else {
                sVar4 = this.f54627s;
            }
        }
        if (!sVar3.equals(sVar4)) {
            if (d()) {
                this.f54626r = sVar3;
            } else {
                this.f54627s = sVar3;
            }
        }
        return this.f54627s;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(boolean z2) {
        long j2;
        long j3;
        long jA;
        long jA2;
        long j4;
        if (!d() || this.f54593L == 0) {
            return Long.MIN_VALUE;
        }
        long j5 = 1000;
        if (this.f54617i.getPlayState() == 3) {
            k kVar = this.f54615g;
            long jA3 = (kVar.a() * 1000000) / ((long) kVar.f54568c);
            if (jA3 == 0) {
                j2 = 1000;
            } else {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - this.f54582A >= 30000) {
                    long[] jArr = this.f54614f;
                    int i2 = this.f54632x;
                    jArr[i2] = jA3 - jNanoTime;
                    this.f54632x = (i2 + 1) % 10;
                    int i3 = this.f54633y;
                    if (i3 < 10) {
                        this.f54633y = i3 + 1;
                    }
                    this.f54582A = jNanoTime;
                    this.f54634z = 0L;
                    int i5 = 0;
                    while (true) {
                        int i7 = this.f54633y;
                        if (i5 >= i7) {
                            break;
                        }
                        this.f54634z = (this.f54614f[i5] / ((long) i7)) + this.f54634z;
                        i5++;
                        j5 = j5;
                    }
                }
                j2 = j5;
                if (!e() && jNanoTime - this.f54584C >= 500000) {
                    boolean zE = this.f54615g.e();
                    this.f54583B = zE;
                    if (zE) {
                        j3 = 1000000;
                        long jC = this.f54615g.c() / j2;
                        k kVar2 = this.f54615g;
                        j4 = DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US;
                        long jB = kVar2.b();
                        if (jC < this.f54595N) {
                            this.f54583B = false;
                        } else if (Math.abs(jC - jNanoTime) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                            StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(jB);
                            sb.append(", ");
                            sb.append(jC);
                            sb.append(", ");
                            sb.append(jNanoTime);
                            sb.append(", ");
                            sb.append(jA3);
                            sb.append(", ");
                            sb.append(this.f54623o ? this.f54588G : this.f54587F / ((long) this.f54586E));
                            sb.append(", ");
                            sb.append(b());
                            Log.w("AudioTrack", sb.toString());
                            this.f54583B = false;
                        } else if (Math.abs(((jB * 1000000) / ((long) this.f54618j)) - jA3) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                            StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(jB);
                            sb2.append(", ");
                            sb2.append(jC);
                            sb2.append(", ");
                            sb2.append(jNanoTime);
                            sb2.append(", ");
                            sb2.append(jA3);
                            sb2.append(", ");
                            sb2.append(this.f54623o ? this.f54588G : this.f54587F / ((long) this.f54586E));
                            sb2.append(", ");
                            sb2.append(b());
                            Log.w("AudioTrack", sb2.toString());
                            this.f54583B = false;
                        }
                    } else {
                        j3 = 1000000;
                        j4 = DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US;
                    }
                    Method method = this.f54585D;
                    if (method != null && !this.f54623o) {
                        try {
                            long jIntValue = (((long) ((Integer) method.invoke(this.f54617i, null)).intValue()) * j2) - this.f54625q;
                            this.f54596O = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            this.f54596O = jMax;
                            if (jMax > j4) {
                                Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + this.f54596O);
                                this.f54596O = 0L;
                            }
                        } catch (Exception unused) {
                            this.f54585D = null;
                        }
                    }
                    this.f54584C = jNanoTime;
                }
            }
            j3 = 1000000;
        }
        long jNanoTime2 = System.nanoTime() / j2;
        if (this.f54583B) {
            jA = ((this.f54615g.b() + (((jNanoTime2 - (this.f54615g.c() / j2)) * ((long) this.f54618j)) / j3)) * j3) / ((long) this.f54618j);
        } else {
            if (this.f54633y == 0) {
                k kVar3 = this.f54615g;
                jA = (kVar3.a() * j3) / ((long) kVar3.f54568c);
            } else {
                jA = jNanoTime2 + this.f54634z;
            }
            if (!z2) {
                jA -= this.f54596O;
            }
        }
        long j6 = this.f54594M;
        while (!this.f54616h.isEmpty() && jA >= ((p) this.f54616h.getFirst()).f54581c) {
            p pVar = (p) this.f54616h.remove();
            this.f54627s = pVar.f54579a;
            this.f54629u = pVar.f54581c;
            this.f54628t = pVar.f54580b - this.f54594M;
        }
        if (this.f54627s.f55881a == 1.0f) {
            jA2 = (jA + this.f54628t) - this.f54629u;
        } else if (this.f54616h.isEmpty()) {
            x xVar = this.f54609b;
            long j7 = xVar.f54686k;
            if (j7 >= 1024) {
                jA2 = z.a(jA - this.f54629u, xVar.f54685j, j7) + this.f54628t;
            } else {
                jA2 = ((long) (((double) this.f54627s.f55881a) * (jA - this.f54629u))) + this.f54628t;
            }
        }
        return j6 + jA2;
    }
}
