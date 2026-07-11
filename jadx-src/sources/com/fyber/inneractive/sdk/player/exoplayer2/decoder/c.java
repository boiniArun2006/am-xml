package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54704a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f54706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f54707d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f54705b = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f54708e = 0;

    public final void a() {
        this.f54704a = 0;
        ByteBuffer byteBuffer = this.f54706c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final boolean b(int i2) {
        return (this.f54704a & i2) == i2;
    }

    public final ByteBuffer a(int i2) {
        int i3 = this.f54708e;
        if (i3 == 1) {
            return ByteBuffer.allocate(i2);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i2);
        }
        ByteBuffer byteBuffer = this.f54706c;
        throw new IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i2 + ")");
    }
}
