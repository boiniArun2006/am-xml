package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class MediaCodecAudioRenderer extends com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c implements com.fyber.inneractive.sdk.player.exoplayer2.util.h {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final AudioRendererEventListener.EventDispatcher f54534P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final r f54535Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f54536R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f54537S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f54538T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public long f54539U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f54540V;

    public MediaCodecAudioRenderer() {
        super(1, true);
        this.f54535Q = new r(new c[0], new u(this));
        this.f54534P = new AudioRendererEventListener.EventDispatcher(null, null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        String str = oVar.f55858f;
        this.f54535Q.getClass();
        String str2 = oVar.f55858f;
        dVar.getClass();
        return com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a(false, str2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final int b(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        int i2;
        int i3;
        String str = oVar.f55858f;
        if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
            return 0;
        }
        int i5 = z.f56234a;
        int i7 = i5 >= 21 ? 16 : 0;
        this.f54535Q.getClass();
        dVar.getClass();
        com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a(false, str);
        if (aVarA == null) {
            return 1;
        }
        return ((i5 < 21 || (((i2 = oVar.f55871s) == -1 || aVarA.b(i2)) && ((i3 = oVar.f55870r) == -1 || aVarA.a(i3)))) ? 3 : 2) | i7 | 4;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.h d() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void g() {
        try {
            r rVar = this.f54535Q;
            rVar.g();
            for (c cVar : rVar.f54610c) {
                cVar.f();
            }
            rVar.f54607Z = 0;
            rVar.f54606Y = false;
            try {
                this.f55792n = null;
                o();
            } finally {
            }
        } catch (Throwable th) {
            try {
                this.f55792n = null;
                o();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final boolean e() {
        if (!this.f55783L) {
            return false;
        }
        r rVar = this.f54535Q;
        if (rVar.d()) {
            return rVar.f54605X && !rVar.c();
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final boolean f() {
        return this.f54535Q.c() || super.f();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void h() {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.f55785N = decoderCounters;
        this.f54534P.enabled(decoderCounters);
        int i2 = this.f54528b.f55993a;
        if (i2 == 0) {
            r rVar = this.f54535Q;
            if (rVar.a0) {
                rVar.a0 = false;
                rVar.f54607Z = 0;
                rVar.g();
                return;
            }
            return;
        }
        r rVar2 = this.f54535Q;
        rVar2.getClass();
        if (z.f56234a < 21) {
            throw new IllegalStateException();
        }
        if (rVar2.a0 && rVar2.f54607Z == i2) {
            return;
        }
        rVar2.a0 = true;
        rVar2.f54607Z = i2;
        rVar2.g();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void i() {
        this.f54535Q.f();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void j() {
        r rVar = this.f54535Q;
        rVar.f54606Y = false;
        if (rVar.d()) {
            rVar.f54634z = 0L;
            rVar.f54633y = 0;
            rVar.f54632x = 0;
            rVar.f54582A = 0L;
            rVar.f54583B = false;
            rVar.f54584C = 0L;
            rVar.f54615g.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void p() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        try {
            r rVar = this.f54535Q;
            if (!rVar.f54605X && rVar.d() && rVar.a()) {
                rVar.f54615g.a(rVar.b());
                rVar.f54631w = 0;
                rVar.f54605X = true;
            }
        } catch (q e2) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVar, MediaCodec mediaCodec, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        boolean z2;
        String str = aVar.f55766a;
        if (z.f56234a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(z.f56236c)) {
            String str2 = z.f56235b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        this.f54536R = z2;
        mediaCodec.configure(oVar.a(), (Surface) null, (MediaCrypto) null, 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final long b() {
        long jA = this.f54535Q.a(e());
        if (jA != Long.MIN_VALUE) {
            if (!this.f54540V) {
                jA = Math.max(this.f54539U, jA);
            }
            this.f54539U = jA;
            this.f54540V = false;
        }
        return this.f54539U;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(String str, long j2, long j3) {
        this.f54534P.decoderInitialized(str, j2, j3);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(oVar);
        this.f54534P.inputFormatChanged(oVar);
        this.f54537S = "audio/raw".equals(oVar.f55858f) ? oVar.f55872t : 2;
        this.f54538T = oVar.f55870r;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        int[] iArr;
        int i2;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.f54536R && integer == 6 && (i2 = this.f54538T) < 6) {
            iArr = new int[i2];
            for (int i3 = 0; i3 < this.f54538T; i3++) {
                iArr[i3] = i3;
            }
        } else {
            iArr = null;
        }
        try {
            this.f54535Q.a(integer, integer2, this.f54537S, iArr);
        } catch (m e2) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(boolean z2, long j2) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(z2, j2);
        this.f54535Q.g();
        this.f54539U = j2;
        this.f54540V = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        return this.f54535Q.a(sVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a() {
        return this.f54535Q.f54627s;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean a(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, long j4, boolean z2) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (z2) {
            mediaCodec.releaseOutputBuffer(i2, false);
            this.f55785N.skippedOutputBufferCount++;
            r rVar = this.f54535Q;
            if (rVar.f54593L == 1) {
                rVar.f54593L = 2;
            }
            return true;
        }
        try {
            if (!this.f54535Q.a(byteBuffer, j4)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i2, false);
            this.f55785N.renderedOutputBufferCount++;
            return true;
        } catch (n | q e2) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(int i2, Object obj) {
        if (i2 == 2) {
            r rVar = this.f54535Q;
            float fFloatValue = ((Float) obj).floatValue();
            if (rVar.f54597P != fFloatValue) {
                rVar.f54597P = fFloatValue;
                rVar.i();
                return;
            }
            return;
        }
        if (i2 != 3) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        r rVar2 = this.f54535Q;
        if (rVar2.f54622n == iIntValue) {
            return;
        }
        rVar2.f54622n = iIntValue;
        if (rVar2.a0) {
            return;
        }
        rVar2.g();
        rVar2.f54607Z = 0;
    }
}
