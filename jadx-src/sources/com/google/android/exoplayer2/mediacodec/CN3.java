package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class CN3 extends DecoderInputBuffer {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f57949O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f57950n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f57951t;

    public CN3() {
        super(2);
        this.f57949O = 32;
    }

    public int J2() {
        return this.f57951t;
    }

    public void KN(int i2) {
        Assertions.checkArgument(i2 > 0);
        this.f57949O = i2;
    }

    public boolean Uo() {
        return this.f57951t > 0;
    }

    public long nr() {
        return this.f57950n;
    }

    public long t() {
        return this.timeUs;
    }

    private boolean rl(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!Uo()) {
            return true;
        }
        if (this.f57951t >= this.f57949O || decoderInputBuffer.isDecodeOnly() != isDecodeOnly()) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.data;
        if (byteBuffer2 == null || (byteBuffer = this.data) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        this.f57951t = 0;
    }

    public boolean n(DecoderInputBuffer decoderInputBuffer) {
        Assertions.checkArgument(!decoderInputBuffer.isEncrypted());
        Assertions.checkArgument(!decoderInputBuffer.hasSupplementalData());
        Assertions.checkArgument(!decoderInputBuffer.isEndOfStream());
        if (!rl(decoderInputBuffer)) {
            return false;
        }
        int i2 = this.f57951t;
        this.f57951t = i2 + 1;
        if (i2 == 0) {
            this.timeUs = decoderInputBuffer.timeUs;
            if (decoderInputBuffer.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (decoderInputBuffer.isDecodeOnly()) {
            setFlags(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = decoderInputBuffer.data;
        if (byteBuffer != null) {
            ensureSpaceForWrite(byteBuffer.remaining());
            this.data.put(byteBuffer);
        }
        this.f57950n = decoderInputBuffer.timeUs;
        return true;
    }
}
