package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class s implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f54637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f54638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f54639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f54640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteBuffer f54641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f54642i;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i2, int i3, int i5) throws b {
        boolean zEquals = Arrays.equals(this.f54637d, this.f54639f);
        boolean z2 = !zEquals;
        int[] iArr = this.f54637d;
        this.f54639f = iArr;
        if (iArr == null) {
            this.f54638e = false;
            return z2;
        }
        if (i5 != 2) {
            throw new b(i2, i3, i5);
        }
        if (zEquals && this.f54636c == i2 && this.f54635b == i3) {
            return false;
        }
        this.f54636c = i2;
        this.f54635b = i3;
        this.f54638e = i3 != iArr.length;
        int i7 = 0;
        while (true) {
            int[] iArr2 = this.f54639f;
            if (i7 >= iArr2.length) {
                return true;
            }
            int i8 = iArr2[i7];
            if (i8 >= i3) {
                throw new b(i2, i3, i5);
            }
            this.f54638e = (i8 != i7) | this.f54638e;
            i7++;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        this.f54642i = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        return this.f54642i && this.f54641h == c.f54547a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        return this.f54638e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        int[] iArr = this.f54639f;
        return iArr == null ? this.f54635b : iArr.length;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        ByteBuffer byteBuffer = c.f54547a;
        this.f54641h = byteBuffer;
        this.f54642i = false;
        this.f54640g = byteBuffer;
        this.f54635b = -1;
        this.f54636c = -1;
        this.f54639f = null;
        this.f54638e = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        this.f54641h = c.f54547a;
        this.f54642i = false;
    }

    public s() {
        ByteBuffer byteBuffer = c.f54547a;
        this.f54640g = byteBuffer;
        this.f54641h = byteBuffer;
        this.f54635b = -1;
        this.f54636c = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int length = ((iLimit - iPosition) / (this.f54635b * 2)) * this.f54639f.length * 2;
        if (this.f54640g.capacity() < length) {
            this.f54640g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f54640g.clear();
        }
        while (iPosition < iLimit) {
            for (int i2 : this.f54639f) {
                this.f54640g.putShort(byteBuffer.getShort((i2 * 2) + iPosition));
            }
            iPosition += this.f54635b * 2;
        }
        byteBuffer.position(iLimit);
        this.f54640g.flip();
        this.f54641h = this.f54640g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f54641h;
        this.f54641h = c.f54547a;
        return byteBuffer;
    }
}
