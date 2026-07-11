package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.util.w;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class MediaCodecVideoRenderer extends com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c {
    public static final int[] q0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final h f56247P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final VideoRendererEventListener.EventDispatcher f56248Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final long f56249R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final int f56250S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final boolean f56251T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o[] f56252U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public e f56253V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Surface f56254W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f56255X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f56256Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public long f56257Z;
    public long a0;
    public int b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f56258c0;
    public int d0;
    public float e0;
    public int f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f56259g0;
    public int h0;
    public float i0;
    public int j0;
    public int k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f56260l0;
    public float m0;
    public boolean n0;
    public int o0;
    public f p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecVideoRenderer(Handler handler, VideoRendererEventListener videoRendererEventListener) {
        super(2, false);
        boolean z2 = false;
        this.f56249R = 5000L;
        this.f56250S = -1;
        this.f56247P = new h();
        this.f56248Q = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        if (z.f56234a <= 22 && "foster".equals(z.f56235b) && "NVIDIA".equals(z.f56236c)) {
            z2 = true;
        }
        this.f56251T = z2;
        this.f56257Z = -9223372036854775807L;
        this.f0 = -1;
        this.f56259g0 = -1;
        this.i0 = -1.0f;
        this.e0 = -1.0f;
        this.f56255X = 1;
        this.j0 = -1;
        this.k0 = -1;
        this.m0 = -1.0f;
        this.f56260l0 = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr) {
        this.f56252U = oVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final int b(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        boolean z2;
        int i2;
        int i3;
        String str = oVar.f55858f;
        if (!"video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
            return 0;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar2 = oVar.f55861i;
        if (dVar2 != null) {
            z2 = false;
            for (int i5 = 0; i5 < dVar2.f54716c; i5++) {
                z2 |= dVar2.f54714a[i5].f54713e;
            }
        } else {
            z2 = false;
        }
        dVar.getClass();
        com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a(z2, str);
        if (aVarA == null) {
            return 1;
        }
        boolean zA = aVarA.a(oVar.f55855c);
        if (zA && (i2 = oVar.f55862j) > 0 && (i3 = oVar.f55863k) > 0) {
            if (z.f56234a >= 21) {
                zA = aVarA.a(i2, i3, oVar.f55864l);
            } else {
                boolean z3 = i2 * i3 <= com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a();
                if (!z3) {
                    Log.d("MediaCodecVideoRenderer", YjqZUJsVmhcjko.VLlvPBqSDMrFSmi + oVar.f55862j + "x" + oVar.f55863k + "] [" + z.f56238e + "]");
                }
                zA = z3;
            }
        }
        return (zA ? 3 : 2) | (aVarA.f55767b ? 8 : 4) | (aVarA.f55768c ? 16 : 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void g() {
        this.f0 = -1;
        this.f56259g0 = -1;
        this.i0 = -1.0f;
        this.e0 = -1.0f;
        this.j0 = -1;
        this.k0 = -1;
        this.m0 = -1.0f;
        this.f56260l0 = -1;
        r();
        h hVar = this.f56247P;
        if (hVar.f56283b) {
            hVar.f56282a.f56279b.sendEmptyMessage(2);
        }
        this.p0 = null;
        try {
            this.f55792n = null;
            o();
        } finally {
            this.f55785N.ensureUpdated();
            this.f56248Q.disabled(this.f55785N);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void i() {
        this.b0 = 0;
        this.a0 = SystemClock.elapsedRealtime();
    }

    public final void r() {
        MediaCodec mediaCodec;
        this.f56256Y = false;
        if (z.f56234a < 23 || !this.n0 || (mediaCodec = this.f55793o) == null) {
            return;
        }
        this.p0 = new f(this, mediaCodec);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(boolean z2, long j2) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(z2, j2);
        r();
        this.f56258c0 = 0;
        if (z2) {
            this.f56257Z = this.f56249R > 0 ? SystemClock.elapsedRealtime() + this.f56249R : -9223372036854775807L;
        } else {
            this.f56257Z = -9223372036854775807L;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final boolean f() {
        if ((this.f56256Y || super.q()) && super.f()) {
            this.f56257Z = -9223372036854775807L;
            return true;
        }
        if (this.f56257Z == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f56257Z) {
            return true;
        }
        this.f56257Z = -9223372036854775807L;
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void h() {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.f55785N = decoderCounters;
        int i2 = this.f54528b.f55993a;
        this.o0 = i2;
        this.n0 = i2 != 0;
        this.f56248Q.enabled(decoderCounters);
        h hVar = this.f56247P;
        hVar.f56289h = false;
        if (hVar.f56283b) {
            hVar.f56282a.f56279b.sendEmptyMessage(1);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void m() {
        if (z.f56234a >= 23 || !this.n0 || this.f56256Y) {
            return;
        }
        this.f56256Y = true;
        this.f56248Q.renderedFirstFrame(this.f56254W);
    }

    public final void s() {
        int i2 = this.f0;
        if (i2 == -1 && this.f56259g0 == -1) {
            return;
        }
        if (this.j0 == i2 && this.k0 == this.f56259g0 && this.f56260l0 == this.h0 && this.m0 == this.i0) {
            return;
        }
        this.f56248Q.videoSizeChanged(i2, this.f56259g0, this.h0, this.i0);
        this.j0 = this.f0;
        this.k0 = this.f56259g0;
        this.f56260l0 = this.h0;
        this.m0 = this.i0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean q() {
        Surface surface;
        if (super.q() && (surface = this.f56254W) != null && surface.isValid()) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void j() {
        this.f56257Z = -9223372036854775807L;
        if (this.b0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f56248Q.droppedFrames(this.b0, jElapsedRealtime - this.a0);
            this.b0 = 0;
            this.a0 = jElapsedRealtime;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(int i2, Object obj) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (i2 != 1) {
            if (i2 == 4) {
                int iIntValue = ((Integer) obj).intValue();
                this.f56255X = iIntValue;
                MediaCodec mediaCodec = this.f55793o;
                if (mediaCodec != null) {
                    mediaCodec.setVideoScalingMode(iIntValue);
                    return;
                }
                return;
            }
            return;
        }
        Surface surface = (Surface) obj;
        if (this.f56254W == surface) {
            if (surface != null) {
                int i3 = this.j0;
                if (i3 != -1 || this.k0 != -1) {
                    this.f56248Q.videoSizeChanged(i3, this.k0, this.f56260l0, this.m0);
                }
                if (this.f56256Y) {
                    this.f56248Q.renderedFirstFrame(this.f56254W);
                    return;
                }
                return;
            }
            return;
        }
        this.f56254W = surface;
        int i5 = this.f54529c;
        if (i5 == 1 || i5 == 2) {
            MediaCodec mediaCodec2 = this.f55793o;
            if (z.f56234a >= 23 && mediaCodec2 != null && surface != null) {
                mediaCodec2.setOutputSurface(surface);
            } else {
                o();
                l();
            }
        }
        if (surface != null) {
            int i7 = this.j0;
            if (i7 != -1 || this.k0 != -1) {
                this.f56248Q.videoSizeChanged(i7, this.k0, this.f56260l0, this.m0);
            }
            r();
            if (i5 == 2) {
                this.f56257Z = this.f56249R > 0 ? SystemClock.elapsedRealtime() + this.f56249R : -9223372036854775807L;
                return;
            }
            return;
        }
        this.j0 = -1;
        this.k0 = -1;
        this.m0 = -1.0f;
        this.f56260l0 = -1;
        r();
    }

    public static boolean b(boolean z2, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        if (oVar.f55858f.equals(oVar2.f55858f)) {
            int i2 = oVar.f55865m;
            if (i2 == -1) {
                i2 = 0;
            }
            int i3 = oVar2.f55865m;
            if (i3 == -1) {
                i3 = 0;
            }
            if (i2 == i3) {
                if (z2) {
                    return true;
                }
                if (oVar.f55862j == oVar2.f55862j && oVar.f55863k == oVar2.f55863k) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVar, MediaCodec mediaCodec, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        e eVar;
        Point point;
        float f3;
        boolean z2;
        int i2;
        int i3;
        com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = this.f56252U;
        int iMax = oVar.f55862j;
        int iMax2 = oVar.f55863k;
        int iMax3 = oVar.f55859g;
        if (iMax3 == -1) {
            iMax3 = a(oVar.f55858f, iMax, iMax2);
        }
        if (oVarArr.length == 1) {
            eVar = new e(iMax, iMax2, iMax3);
        } else {
            boolean z3 = false;
            for (com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 : oVarArr) {
                if (b(aVar.f55767b, oVar, oVar2)) {
                    int i5 = oVar2.f55862j;
                    z3 |= i5 == -1 || oVar2.f55863k == -1;
                    iMax = Math.max(iMax, i5);
                    iMax2 = Math.max(iMax2, oVar2.f55863k);
                    int iA = oVar2.f55859g;
                    if (iA == -1) {
                        iA = a(oVar2.f55858f, oVar2.f55862j, oVar2.f55863k);
                    }
                    iMax3 = Math.max(iMax3, iA);
                }
            }
            if (z3) {
                Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i7 = oVar.f55863k;
                int i8 = oVar.f55862j;
                boolean z4 = i7 > i8;
                int i9 = z4 ? i7 : i8;
                if (z4) {
                    i7 = i8;
                }
                float f4 = i7 / i9;
                int[] iArr = q0;
                int i10 = 0;
                while (i10 < 9) {
                    int i11 = iArr[i10];
                    int i12 = i10;
                    int i13 = (int) (i11 * f4);
                    if (i11 <= i9 || i13 <= i7) {
                        break;
                    }
                    int i14 = i7;
                    if (z.f56234a >= 21) {
                        point = aVar.a(z4 ? i13 : i11, z4 ? i11 : i13);
                        f3 = f4;
                        z2 = z4;
                        i2 = i9;
                        if (aVar.a(point.x, point.y, oVar.f55864l)) {
                            break;
                        }
                        i10 = i12 + 1;
                        i7 = i14;
                        f4 = f3;
                        z4 = z2;
                        i9 = i2;
                    } else {
                        f3 = f4;
                        z2 = z4;
                        i2 = i9;
                        int i15 = ((i11 + 15) / 16) * 16;
                        int i16 = ((i13 + 15) / 16) * 16;
                        if (i15 * i16 <= com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a()) {
                            int i17 = z2 ? i16 : i15;
                            if (!z2) {
                                i15 = i16;
                            }
                            point = new Point(i17, i15);
                        } else {
                            i10 = i12 + 1;
                            i7 = i14;
                            f4 = f3;
                            z4 = z2;
                            i9 = i2;
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    iMax3 = Math.max(iMax3, a(oVar.f55858f, iMax, iMax2));
                    Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
            eVar = new e(iMax, iMax2, iMax3);
        }
        this.f56253V = eVar;
        boolean z5 = this.f56251T;
        int i18 = this.o0;
        MediaFormat mediaFormatA = oVar.a();
        mediaFormatA.setInteger("max-width", eVar.f56273a);
        mediaFormatA.setInteger("max-height", eVar.f56274b);
        int i19 = eVar.f56275c;
        if (i19 != -1) {
            mediaFormatA.setInteger("max-input-size", i19);
        }
        if (z5) {
            i3 = 0;
            mediaFormatA.setInteger("auto-frc", 0);
        } else {
            i3 = 0;
        }
        if (i18 != 0) {
            mediaFormatA.setFeatureEnabled("tunneled-playback", true);
            mediaFormatA.setInteger("audio-session-id", i18);
        }
        mediaCodec.configure(mediaFormatA, this.f56254W, (MediaCrypto) null, i3);
        if (z.f56234a < 23 || !this.n0) {
            return;
        }
        this.p0 = new f(this, mediaCodec);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(String str, long j2, long j3) {
        this.f56248Q.decoderInitialized(str, j2, j3);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(oVar);
        this.f56248Q.inputFormatChanged(oVar);
        float f3 = oVar.f55866n;
        if (f3 == -1.0f) {
            f3 = 1.0f;
        }
        this.e0 = f3;
        int i2 = oVar.f55865m;
        if (i2 == -1) {
            i2 = 0;
        }
        this.d0 = i2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z2 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z2) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.f0 = integer;
        if (z2) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.f56259g0 = integer2;
        float f3 = this.e0;
        this.i0 = f3;
        if (z.f56234a >= 21) {
            int i2 = this.d0;
            if (i2 == 90 || i2 == 270) {
                int i3 = this.f0;
                this.f0 = integer2;
                this.f56259g0 = i3;
                this.i0 = 1.0f / f3;
            }
        } else {
            this.h0 = this.d0;
        }
        mediaCodec.setVideoScalingMode(this.f56255X);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean a(boolean z2, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        if (!b(z2, oVar, oVar2)) {
            return false;
        }
        int i2 = oVar2.f55862j;
        e eVar = this.f56253V;
        return i2 <= eVar.f56273a && oVar2.f55863k <= eVar.f56274b && oVar2.f55859g <= eVar.f56275c;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0190  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, long j4, boolean z2) {
        String str;
        long j5;
        long j6;
        g gVar;
        long j7;
        long j9;
        long j10;
        if (z2) {
            w.a("skipVideoBuffer");
            mediaCodec.releaseOutputBuffer(i2, false);
            w.a();
            this.f55785N.skippedOutputBufferCount++;
            return true;
        }
        if (!this.f56256Y) {
            if (z.f56234a >= 21) {
                long jNanoTime = System.nanoTime();
                s();
                w.a("releaseOutputBuffer");
                mediaCodec.releaseOutputBuffer(i2, jNanoTime);
                w.a();
                this.f55785N.renderedOutputBufferCount++;
                this.f56258c0 = 0;
                if (!this.f56256Y) {
                    this.f56256Y = true;
                    this.f56248Q.renderedFirstFrame(this.f56254W);
                }
            } else {
                s();
                w.a("releaseOutputBuffer");
                mediaCodec.releaseOutputBuffer(i2, true);
                w.a();
                this.f55785N.renderedOutputBufferCount++;
                this.f56258c0 = 0;
                if (!this.f56256Y) {
                    this.f56256Y = true;
                    this.f56248Q.renderedFirstFrame(this.f56254W);
                }
            }
            return true;
        }
        if (this.f54529c != 2) {
            return false;
        }
        long jElapsedRealtime = (j4 - j2) - ((SystemClock.elapsedRealtime() * 1000) - j3);
        long jNanoTime2 = System.nanoTime();
        long j11 = (jElapsedRealtime * 1000) + jNanoTime2;
        h hVar = this.f56247P;
        long j12 = j4 * 1000;
        if (hVar.f56289h) {
            if (j4 != hVar.f56286e) {
                hVar.f56292k++;
                hVar.f56287f = hVar.f56288g;
            }
            long j13 = hVar.f56292k;
            if (j13 >= 6) {
                str = "releaseOutputBuffer";
                long j14 = hVar.f56291j;
                long j15 = hVar.f56287f + ((j12 - j14) / j13);
                if (Math.abs((j11 - hVar.f56290i) - (j15 - j14)) > 20000000) {
                    hVar.f56289h = false;
                } else {
                    j5 = (hVar.f56290i + j15) - hVar.f56291j;
                    j6 = j15;
                    if (!hVar.f56289h) {
                        hVar.f56291j = j12;
                        hVar.f56290i = j11;
                        hVar.f56292k = 0L;
                        hVar.f56289h = true;
                    }
                    hVar.f56286e = j4;
                    hVar.f56288g = j6;
                    gVar = hVar.f56282a;
                    if (gVar != null && gVar.f56278a != 0) {
                        long j16 = hVar.f56282a.f56278a;
                        long j17 = hVar.f56284c;
                        j9 = (((j5 - j16) / j17) * j17) + j16;
                        if (j5 > j9) {
                            j10 = j9 - j17;
                        } else {
                            j10 = j9;
                            j9 = j17 + j9;
                        }
                        if (j9 - j5 >= j5 - j10) {
                            j9 = j10;
                        }
                        j5 = j9 - hVar.f56285d;
                    }
                    long j18 = j5;
                    j7 = (j18 - jNanoTime2) / 1000;
                    if (j7 >= -30000) {
                        w.a("dropVideoBuffer");
                        mediaCodec.releaseOutputBuffer(i2, false);
                        w.a();
                        DecoderCounters decoderCounters = this.f55785N;
                        decoderCounters.droppedOutputBufferCount++;
                        this.b0++;
                        int i3 = this.f56258c0 + 1;
                        this.f56258c0 = i3;
                        decoderCounters.maxConsecutiveDroppedOutputBufferCount = Math.max(i3, decoderCounters.maxConsecutiveDroppedOutputBufferCount);
                        int i5 = this.b0;
                        if (i5 != this.f56250S || i5 <= 0) {
                            return true;
                        }
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        this.f56248Q.droppedFrames(this.b0, jElapsedRealtime2 - this.a0);
                        this.b0 = 0;
                        this.a0 = jElapsedRealtime2;
                        return true;
                    }
                    if (z.f56234a >= 21) {
                        if (j7 >= 50000) {
                            return false;
                        }
                        s();
                        w.a(str);
                        mediaCodec.releaseOutputBuffer(i2, j18);
                        w.a();
                        this.f55785N.renderedOutputBufferCount++;
                        this.f56258c0 = 0;
                        if (!this.f56256Y) {
                            this.f56256Y = true;
                            this.f56248Q.renderedFirstFrame(this.f56254W);
                        }
                        return true;
                    }
                    if (j7 >= 30000) {
                        return false;
                    }
                    if (j7 > 11000) {
                        try {
                            Thread.sleep((j7 - 10000) / 1000);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    s();
                    w.a(str);
                    mediaCodec.releaseOutputBuffer(i2, true);
                    w.a();
                    this.f55785N.renderedOutputBufferCount++;
                    this.f56258c0 = 0;
                    if (!this.f56256Y) {
                        this.f56256Y = true;
                        this.f56248Q.renderedFirstFrame(this.f56254W);
                    }
                    return true;
                }
            } else {
                str = "releaseOutputBuffer";
                if (Math.abs((j11 - hVar.f56290i) - (j12 - hVar.f56291j)) > 20000000) {
                    hVar.f56289h = false;
                }
            }
        } else {
            str = "releaseOutputBuffer";
        }
        j6 = j12;
        j5 = j11;
        if (!hVar.f56289h) {
        }
        hVar.f56286e = j4;
        hVar.f56288g = j6;
        gVar = hVar.f56282a;
        if (gVar != null) {
            long j162 = hVar.f56282a.f56278a;
            long j172 = hVar.f56284c;
            j9 = (((j5 - j162) / j172) * j172) + j162;
            if (j5 > j9) {
            }
            if (j9 - j5 >= j5 - j10) {
            }
            j5 = j9 - hVar.f56285d;
        }
        long j182 = j5;
        j7 = (j182 - jNanoTime2) / 1000;
        if (j7 >= -30000) {
        }
    }

    public static int a(String str, int i2, int i3) {
        int i5;
        int i7 = 4;
        if (i2 == -1 || i3 == -1) {
            return -1;
        }
        str.getClass();
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                i5 = i3 * i2;
                i7 = 2;
                break;
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                i5 = i3 * i2;
                break;
            case "video/avc":
                if (!"BRAVIA 4K 2015".equals(z.f56237d)) {
                    i5 = ((i3 + 15) / 16) * ((i2 + 15) / 16) * 256;
                    i7 = 2;
                    break;
                }
                break;
        }
        return -1;
    }
}
