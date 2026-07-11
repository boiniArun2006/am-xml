package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class x implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f54679d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f54682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ShortBuffer f54683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ByteBuffer f54684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f54685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f54686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f54687l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f54680e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f54681f = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54677b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54678c = -1;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i2, int i3, int i5) throws b {
        if (i5 != 2) {
            throw new b(i2, i3, i5);
        }
        if (this.f54678c == i2 && this.f54677b == i3) {
            return false;
        }
        this.f54678c = i2;
        this.f54677b = i3;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        this.f54679d = null;
        ByteBuffer byteBuffer = c.f54547a;
        this.f54682g = byteBuffer;
        this.f54683h = byteBuffer.asShortBuffer();
        this.f54684i = byteBuffer;
        this.f54677b = -1;
        this.f54678c = -1;
        this.f54685j = 0L;
        this.f54686k = 0L;
        this.f54687l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        int i2;
        w wVar = this.f54679d;
        int i3 = wVar.f54669q;
        float f3 = wVar.f54667o;
        float f4 = wVar.f54668p;
        int i5 = wVar.f54670r + ((int) ((((i3 / (f3 / f4)) + wVar.f54671s) / f4) + 0.5f));
        wVar.a((wVar.f54657e * 2) + i3);
        int i7 = 0;
        while (true) {
            i2 = wVar.f54657e * 2;
            int i8 = wVar.f54654b;
            if (i7 >= i2 * i8) {
                break;
            }
            wVar.f54660h[(i8 * i3) + i7] = 0;
            i7++;
        }
        wVar.f54669q = i2 + wVar.f54669q;
        wVar.a();
        if (wVar.f54670r > i5) {
            wVar.f54670r = i5;
        }
        wVar.f54669q = 0;
        wVar.f54672t = 0;
        wVar.f54671s = 0;
        this.f54687l = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        if (!this.f54687l) {
            return false;
        }
        w wVar = this.f54679d;
        return wVar == null || wVar.f54670r == 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        return Math.abs(this.f54680e - 1.0f) >= 0.01f || Math.abs(this.f54681f - 1.0f) >= 0.01f;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        return this.f54677b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        w wVar = new w(this.f54678c, this.f54677b);
        this.f54679d = wVar;
        wVar.f54667o = this.f54680e;
        wVar.f54668p = this.f54681f;
        this.f54684i = c.f54547a;
        this.f54685j = 0L;
        this.f54686k = 0L;
        this.f54687l = false;
    }

    public x() {
        ByteBuffer byteBuffer = c.f54547a;
        this.f54682g = byteBuffer;
        this.f54683h = byteBuffer.asShortBuffer();
        this.f54684i = byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f54685j += (long) iRemaining;
            w wVar = this.f54679d;
            wVar.getClass();
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i2 = wVar.f54654b;
            int i3 = iRemaining2 / i2;
            wVar.a(i3);
            shortBufferAsShortBuffer.get(wVar.f54660h, wVar.f54669q * wVar.f54654b, ((i2 * i3) * 2) / 2);
            wVar.f54669q += i3;
            wVar.a();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int i5 = this.f54679d.f54670r * this.f54677b * 2;
        if (i5 > 0) {
            if (this.f54682g.capacity() < i5) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i5).order(ByteOrder.nativeOrder());
                this.f54682g = byteBufferOrder;
                this.f54683h = byteBufferOrder.asShortBuffer();
            } else {
                this.f54682g.clear();
                this.f54683h.clear();
            }
            w wVar2 = this.f54679d;
            ShortBuffer shortBuffer = this.f54683h;
            wVar2.getClass();
            int iMin = Math.min(shortBuffer.remaining() / wVar2.f54654b, wVar2.f54670r);
            shortBuffer.put(wVar2.f54662j, 0, wVar2.f54654b * iMin);
            int i7 = wVar2.f54670r - iMin;
            wVar2.f54670r = i7;
            short[] sArr = wVar2.f54662j;
            int i8 = wVar2.f54654b;
            System.arraycopy(sArr, iMin * i8, sArr, 0, i7 * i8);
            this.f54686k += (long) i5;
            this.f54682g.limit(i5);
            this.f54684i = this.f54682g;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f54684i;
        this.f54684i = c.f54547a;
        return byteBuffer;
    }
}
