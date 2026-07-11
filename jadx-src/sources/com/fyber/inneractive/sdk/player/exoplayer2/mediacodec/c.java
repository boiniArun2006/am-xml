package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.w;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class c extends com.fyber.inneractive.sdk.player.exoplayer2.a {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final byte[] f55771O;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ByteBuffer[] f55772A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f55773B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f55774C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f55775D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f55776E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f55777F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f55778G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f55779H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f55780I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f55781J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f55782K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f55783L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f55784M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public DecoderCounters f55785N;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f55786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.c f55787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.c f55788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f55789k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f55790l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MediaCodec.BufferInfo f55791m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o f55792n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MediaCodec f55793o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f55794p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f55795q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f55796r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f55797s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f55798t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f55799u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f55800v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f55801w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f55802x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f55803y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ByteBuffer[] f55804z;

    public abstract void a(MediaCodec mediaCodec, MediaFormat mediaFormat);

    public abstract void a(a aVar, MediaCodec mediaCodec, o oVar);

    public abstract void a(String str, long j2, long j3);

    public abstract boolean a(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, long j4, boolean z2);

    public boolean a(boolean z2, o oVar, o oVar2) {
        return false;
    }

    public abstract int b(d dVar, o oVar);

    public void m() {
    }

    public void p() {
    }

    static {
        int i2 = z.f56234a;
        byte[] bArr = new byte[38];
        for (int i3 = 0; i3 < 38; i3++) {
            int i5 = i3 * 2;
            bArr[i3] = (byte) (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i5 + 1), 16) + (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i5), 16) << 4));
        }
        f55771O = bArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i2, boolean z2) {
        super(i2);
        d dVar = d.f55805a;
        if (z.f56234a < 16) {
            throw new IllegalStateException();
        }
        this.f55786h = dVar;
        this.f55787i = new com.fyber.inneractive.sdk.player.exoplayer2.decoder.c();
        this.f55788j = new com.fyber.inneractive.sdk.player.exoplayer2.decoder.c();
        this.f55789k = new p();
        this.f55790l = new ArrayList();
        this.f55791m = new MediaCodec.BufferInfo();
        this.f55778G = 0;
        this.f55779H = 0;
    }

    public a a(d dVar, o oVar) {
        String str = oVar.f55858f;
        dVar.getClass();
        return j.a(false, str);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public boolean e() {
        return this.f55783L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public boolean f() {
        if (this.f55792n == null) {
            return false;
        }
        if ((this.f54532f ? this.f54533g : this.f54530d.isReady()) || this.f55775D >= 0) {
            return true;
        }
        return this.f55773B != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f55773B;
    }

    public final boolean k() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        MediaCodec mediaCodec = this.f55793o;
        if (mediaCodec == null || this.f55779H == 2 || this.f55782K) {
            return false;
        }
        if (this.f55774C < 0) {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.f55774C = iDequeueInputBuffer;
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar = this.f55787i;
            cVar.f54706c = this.f55804z[iDequeueInputBuffer];
            cVar.a();
        }
        if (this.f55779H == 1) {
            if (!this.f55798t) {
                this.f55781J = true;
                this.f55793o.queueInputBuffer(this.f55774C, 0, 0, 0L, 4);
                this.f55774C = -1;
            }
            this.f55779H = 2;
            return false;
        }
        if (this.f55802x) {
            this.f55802x = false;
            ByteBuffer byteBuffer = this.f55787i.f54706c;
            byte[] bArr = f55771O;
            byteBuffer.put(bArr);
            this.f55793o.queueInputBuffer(this.f55774C, 0, bArr.length, 0L, 0);
            this.f55774C = -1;
            this.f55780I = true;
            return true;
        }
        if (this.f55778G == 1) {
            for (int i2 = 0; i2 < this.f55792n.f55860h.size(); i2++) {
                this.f55787i.f54706c.put((byte[]) this.f55792n.f55860h.get(i2));
            }
            this.f55778G = 2;
        }
        int iPosition = this.f55787i.f54706c.position();
        int iA = a(this.f55789k, this.f55787i, false);
        if (iA == -3) {
            return false;
        }
        if (iA == -5) {
            if (this.f55778G == 2) {
                this.f55787i.a();
                this.f55778G = 1;
            }
            a(this.f55789k.f55879a);
            return true;
        }
        if (this.f55787i.b(4)) {
            if (this.f55778G == 2) {
                this.f55787i.a();
                this.f55778G = 1;
            }
            this.f55782K = true;
            if (!this.f55780I) {
                n();
                return false;
            }
            try {
                if (!this.f55798t) {
                    this.f55781J = true;
                    this.f55793o.queueInputBuffer(this.f55774C, 0, 0, 0L, 4);
                    this.f55774C = -1;
                }
                return false;
            } catch (MediaCodec.CryptoException e2) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e2);
            }
        }
        if (this.f55784M && !this.f55787i.b(1)) {
            this.f55787i.a();
            if (this.f55778G == 2) {
                this.f55778G = 1;
            }
            return true;
        }
        this.f55784M = false;
        boolean zB = this.f55787i.b(1073741824);
        if (this.f55795q && !zB) {
            ByteBuffer byteBuffer2 = this.f55787i.f54706c;
            int iPosition2 = byteBuffer2.position();
            int i3 = 0;
            int i5 = 0;
            while (true) {
                int i7 = i3 + 1;
                if (i7 >= iPosition2) {
                    byteBuffer2.clear();
                    break;
                }
                int i8 = byteBuffer2.get(i3) & UByte.MAX_VALUE;
                if (i5 == 3) {
                    if (i8 == 1 && (byteBuffer2.get(i7) & 31) == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                        byteBufferDuplicate.position(i3 - 3);
                        byteBufferDuplicate.limit(iPosition2);
                        byteBuffer2.position(0);
                        byteBuffer2.put(byteBufferDuplicate);
                        break;
                    }
                } else if (i8 == 0) {
                    i5++;
                }
                if (i8 != 0) {
                    i5 = 0;
                }
                i3 = i7;
            }
            if (this.f55787i.f54706c.position() == 0) {
                return true;
            }
            this.f55795q = false;
        }
        try {
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar2 = this.f55787i;
            long j2 = cVar2.f54707d;
            if (cVar2.b(Integer.MIN_VALUE)) {
                this.f55790l.add(Long.valueOf(j2));
            }
            this.f55787i.f54706c.flip();
            m();
            if (zB) {
                MediaCodec.CryptoInfo cryptoInfo = this.f55787i.f54705b.f54702d;
                if (iPosition != 0) {
                    if (cryptoInfo.numBytesOfClearData == null) {
                        cryptoInfo.numBytesOfClearData = new int[1];
                    }
                    int[] iArr = cryptoInfo.numBytesOfClearData;
                    iArr[0] = iArr[0] + iPosition;
                }
                this.f55793o.queueSecureInputBuffer(this.f55774C, 0, cryptoInfo, j2, 0);
            } else {
                this.f55793o.queueInputBuffer(this.f55774C, 0, this.f55787i.f54706c.limit(), j2, 0);
            }
            this.f55774C = -1;
            this.f55780I = true;
            this.f55778G = 0;
            this.f55785N.inputBufferCount++;
            return true;
        } catch (MediaCodec.CryptoException e3) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        boolean z2;
        c cVar;
        long jElapsedRealtime;
        long jElapsedRealtime2;
        if (q()) {
            o oVar = this.f55792n;
            String str = oVar.f55858f;
            try {
                a aVarA = a(this.f55786h, oVar);
                if (aVarA == null) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.d(new b(this.f55792n, (f) null, -49999));
                }
                String str2 = aVarA.f55766a;
                this.f55794p = aVarA.f55767b;
                o oVar2 = this.f55792n;
                int i2 = z.f56234a;
                boolean z3 = false;
                this.f55795q = i2 < 21 && oVar2.f55860h.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                this.f55796r = i2 < 18 || (i2 == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (i2 == 19 && z.f56237d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
                if (i2 >= 24 || !("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2))) {
                    z2 = false;
                } else {
                    String str3 = z.f56235b;
                    if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                        z2 = true;
                    }
                }
                this.f55797s = z2;
                this.f55798t = i2 <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
                this.f55799u = (i2 <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (i2 <= 19 && "hb2000".equals(z.f56235b) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
                this.f55800v = i2 == 21 && "OMX.google.aac.decoder".equals(str2);
                o oVar3 = this.f55792n;
                if (i2 <= 18 && oVar3.f55870r == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2)) {
                    z3 = true;
                }
                this.f55801w = z3;
                try {
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    w.a("createCodec:" + str2);
                    this.f55793o = MediaCodec.createByCodecName(str2);
                    w.a();
                    w.a("configureCodec");
                    a(aVarA, this.f55793o, this.f55792n);
                    w.a();
                    w.a("startCodec");
                    this.f55793o.start();
                    w.a();
                    jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    cVar = this;
                } catch (Exception e2) {
                    e = e2;
                    cVar = this;
                }
                try {
                    cVar.a(str2, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                    cVar.f55804z = cVar.f55793o.getInputBuffers();
                    cVar.f55772A = cVar.f55793o.getOutputBuffers();
                    cVar.f55773B = cVar.f54529c == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    cVar.f55774C = -1;
                    cVar.f55775D = -1;
                    cVar.f55784M = true;
                    cVar.f55785N.decoderInitCount++;
                } catch (Exception e3) {
                    e = e3;
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.d(new b(cVar.f55792n, e, str2));
                }
            } catch (f e4) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.d(new b(this.f55792n, e4, -49998));
            }
        }
    }

    public final void n() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (this.f55779H == 2) {
            o();
            l();
        } else {
            this.f55783L = true;
            p();
        }
    }

    public final void o() {
        if (this.f55793o != null) {
            this.f55773B = -9223372036854775807L;
            this.f55774C = -1;
            this.f55775D = -1;
            this.f55776E = false;
            this.f55790l.clear();
            this.f55804z = null;
            this.f55772A = null;
            this.f55777F = false;
            this.f55780I = false;
            this.f55794p = false;
            this.f55795q = false;
            this.f55796r = false;
            this.f55797s = false;
            this.f55798t = false;
            this.f55799u = false;
            this.f55801w = false;
            this.f55802x = false;
            this.f55803y = false;
            this.f55781J = false;
            this.f55778G = 0;
            this.f55779H = 0;
            this.f55785N.decoderReleaseCount++;
            this.f55787i.f54706c = null;
            try {
                this.f55793o.stop();
                try {
                    this.f55793o.release();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.f55793o.release();
                    throw th;
                } finally {
                }
            }
        }
    }

    public boolean q() {
        return this.f55793o == null && this.f55792n != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void a(boolean z2, long j2) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        this.f55782K = false;
        this.f55783L = false;
        if (this.f55793o != null) {
            this.f55773B = -9223372036854775807L;
            this.f55774C = -1;
            this.f55775D = -1;
            this.f55784M = true;
            this.f55776E = false;
            this.f55790l.clear();
            this.f55802x = false;
            this.f55803y = false;
            if (this.f55796r || ((this.f55799u && this.f55781J) || this.f55779H != 0)) {
                o();
                l();
            } else {
                this.f55793o.flush();
                this.f55780I = false;
            }
            if (!this.f55777F || this.f55792n == null) {
                return;
            }
            this.f55778G = 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0177  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j2, long j3) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        boolean zA;
        boolean z2;
        boolean z3;
        if (this.f55783L) {
            p();
            return;
        }
        if (this.f55792n == null) {
            this.f55788j.a();
            int iA = a(this.f55789k, this.f55788j, true);
            if (iA != -5) {
                if (iA == -4) {
                    if (this.f55788j.b(4)) {
                        this.f55782K = true;
                        n();
                        return;
                    }
                    throw new IllegalStateException();
                }
                return;
            }
            a(this.f55789k.f55879a);
        }
        l();
        if (this.f55793o != null) {
            w.a("drainAndFeed");
            do {
                if (this.f55775D < 0) {
                    if (this.f55800v && this.f55781J) {
                        try {
                            this.f55775D = this.f55793o.dequeueOutputBuffer(this.f55791m, 0L);
                        } catch (IllegalStateException unused) {
                            n();
                            if (this.f55783L) {
                                o();
                            }
                        }
                    } else {
                        this.f55775D = this.f55793o.dequeueOutputBuffer(this.f55791m, 0L);
                    }
                    int i2 = this.f55775D;
                    if (i2 < 0) {
                        if (i2 == -2) {
                            MediaFormat outputFormat = this.f55793o.getOutputFormat();
                            if (this.f55797s && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                                this.f55803y = true;
                            } else {
                                if (this.f55801w) {
                                    outputFormat.setInteger("channel-count", 1);
                                }
                                a(this.f55793o, outputFormat);
                            }
                        } else if (i2 == -3) {
                            this.f55772A = this.f55793o.getOutputBuffers();
                        } else {
                            if (this.f55798t && (this.f55782K || this.f55779H == 2)) {
                                n();
                            }
                            z2 = false;
                        }
                        z2 = true;
                    } else if (this.f55803y) {
                        this.f55803y = false;
                        this.f55793o.releaseOutputBuffer(i2, false);
                        this.f55775D = -1;
                        z2 = true;
                    } else {
                        MediaCodec.BufferInfo bufferInfo = this.f55791m;
                        if ((bufferInfo.flags & 4) != 0) {
                            n();
                            this.f55775D = -1;
                            z2 = false;
                        } else {
                            ByteBuffer byteBuffer = this.f55772A[i2];
                            if (byteBuffer != null) {
                                byteBuffer.position(bufferInfo.offset);
                                MediaCodec.BufferInfo bufferInfo2 = this.f55791m;
                                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                            }
                            long j4 = this.f55791m.presentationTimeUs;
                            int size = this.f55790l.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    z3 = false;
                                    break;
                                } else {
                                    if (((Long) this.f55790l.get(i3)).longValue() == j4) {
                                        this.f55790l.remove(i3);
                                        z3 = true;
                                        break;
                                    }
                                    i3++;
                                }
                            }
                            this.f55776E = z3;
                            if (!this.f55800v) {
                                MediaCodec mediaCodec = this.f55793o;
                                ByteBuffer[] byteBufferArr = this.f55772A;
                                int i5 = this.f55775D;
                                ByteBuffer byteBuffer2 = byteBufferArr[i5];
                                MediaCodec.BufferInfo bufferInfo3 = this.f55791m;
                                int i7 = bufferInfo3.flags;
                                zA = a(j2, j3, mediaCodec, byteBuffer2, i5, bufferInfo3.presentationTimeUs, this.f55776E);
                                if (zA) {
                                }
                                z2 = false;
                            }
                        }
                    }
                } else {
                    if (!this.f55800v && this.f55781J) {
                        try {
                            MediaCodec mediaCodec2 = this.f55793o;
                            ByteBuffer[] byteBufferArr2 = this.f55772A;
                            int i8 = this.f55775D;
                            ByteBuffer byteBuffer3 = byteBufferArr2[i8];
                            MediaCodec.BufferInfo bufferInfo4 = this.f55791m;
                            int i9 = bufferInfo4.flags;
                            zA = a(j2, j3, mediaCodec2, byteBuffer3, i8, bufferInfo4.presentationTimeUs, this.f55776E);
                        } catch (IllegalStateException unused2) {
                            n();
                            if (this.f55783L) {
                                o();
                            }
                        }
                    } else {
                        MediaCodec mediaCodec3 = this.f55793o;
                        ByteBuffer[] byteBufferArr3 = this.f55772A;
                        int i52 = this.f55775D;
                        ByteBuffer byteBuffer22 = byteBufferArr3[i52];
                        MediaCodec.BufferInfo bufferInfo32 = this.f55791m;
                        int i72 = bufferInfo32.flags;
                        zA = a(j2, j3, mediaCodec3, byteBuffer22, i52, bufferInfo32.presentationTimeUs, this.f55776E);
                    }
                    if (zA) {
                        long j5 = this.f55791m.presentationTimeUs;
                        this.f55775D = -1;
                        z2 = true;
                    }
                    z2 = false;
                }
            } while (z2);
            while (k()) {
            }
            w.a();
        } else {
            this.f54530d.a(j2 - this.f54531e);
            this.f55788j.a();
            int iA2 = a(this.f55789k, this.f55788j, false);
            if (iA2 == -5) {
                a(this.f55789k.f55879a);
            } else if (iA2 == -4) {
                if (this.f55788j.b(4)) {
                    this.f55782K = true;
                    n();
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        this.f55785N.ensureUpdated();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(o oVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        boolean z2;
        o oVar2 = this.f55792n;
        this.f55792n = oVar;
        if (!z.a(oVar.f55861i, oVar2 == null ? null : oVar2.f55861i) && this.f55792n.f55861i != null) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(new IllegalStateException("Media requires a DrmSessionManager"));
        }
        if (this.f55793o != null && a(this.f55794p, oVar2, this.f55792n)) {
            this.f55777F = true;
            this.f55778G = 1;
            if (this.f55797s) {
                o oVar3 = this.f55792n;
                z2 = oVar3.f55862j == oVar2.f55862j && oVar3.f55863k == oVar2.f55863k;
            }
            this.f55802x = z2;
            return;
        }
        if (this.f55780I) {
            this.f55779H = 1;
        } else {
            o();
            l();
        }
    }
}
