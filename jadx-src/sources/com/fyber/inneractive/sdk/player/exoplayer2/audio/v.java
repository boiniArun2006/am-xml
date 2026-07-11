package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class v implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54647b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54648c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54649d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f54650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f54651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f54652g;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i2, int i3, int i5) throws b {
        if (i5 != 3 && i5 != 2 && i5 != Integer.MIN_VALUE && i5 != 1073741824) {
            throw new b(i2, i3, i5);
        }
        if (this.f54647b == i2 && this.f54648c == i3 && this.f54649d == i5) {
            return false;
        }
        this.f54647b = i2;
        this.f54648c = i3;
        this.f54649d = i5;
        if (i5 != 2) {
            return true;
        }
        this.f54650e = c.f54547a;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        this.f54652g = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        return this.f54652g && this.f54651f == c.f54547a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        int i2 = this.f54649d;
        return (i2 == 0 || i2 == 2) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        return this.f54648c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        ByteBuffer byteBuffer = c.f54547a;
        this.f54651f = byteBuffer;
        this.f54652g = false;
        this.f54650e = byteBuffer;
        this.f54647b = -1;
        this.f54648c = -1;
        this.f54649d = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        this.f54651f = c.f54547a;
        this.f54652g = false;
    }

    public v() {
        ByteBuffer byteBuffer = c.f54547a;
        this.f54650e = byteBuffer;
        this.f54651f = byteBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[ADDED_TO_REGION, LOOP:2: B:25:0x0083->B:26:0x0085, LOOP_START, PHI: r0
      0x0083: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0043, B:26:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ByteBuffer byteBuffer) {
        int i2;
        int i3;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i5 = iLimit - iPosition;
        int i7 = this.f54649d;
        if (i7 == Integer.MIN_VALUE) {
            i5 /= 3;
        } else {
            if (i7 != 3) {
                if (i7 == 1073741824) {
                    i2 = i5 / 2;
                } else {
                    throw new IllegalStateException();
                }
            }
            if (this.f54650e.capacity() >= i2) {
                this.f54650e = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
            } else {
                this.f54650e.clear();
            }
            i3 = this.f54649d;
            if (i3 != Integer.MIN_VALUE) {
                while (iPosition < iLimit) {
                    this.f54650e.put(byteBuffer.get(iPosition + 1));
                    this.f54650e.put(byteBuffer.get(iPosition + 2));
                    iPosition += 3;
                }
            } else if (i3 == 3) {
                while (iPosition < iLimit) {
                    this.f54650e.put((byte) 0);
                    this.f54650e.put((byte) ((byteBuffer.get(iPosition) & UByte.MAX_VALUE) - 128));
                    iPosition++;
                }
            } else {
                if (i3 != 1073741824) {
                    throw new IllegalStateException();
                }
                while (iPosition < iLimit) {
                    this.f54650e.put(byteBuffer.get(iPosition + 2));
                    this.f54650e.put(byteBuffer.get(iPosition + 3));
                    iPosition += 4;
                }
            }
            byteBuffer.position(byteBuffer.limit());
            this.f54650e.flip();
            this.f54651f = this.f54650e;
        }
        i2 = i5 * 2;
        if (this.f54650e.capacity() >= i2) {
        }
        i3 = this.f54649d;
        if (i3 != Integer.MIN_VALUE) {
        }
        byteBuffer.position(byteBuffer.limit());
        this.f54650e.flip();
        this.f54651f = this.f54650e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f54651f;
        this.f54651f = c.f54547a;
        return byteBuffer;
    }
}
