package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f57971n;
    private long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f57972t;

    private long n(long j2) {
        return this.f57971n + Math.max(0L, ((this.rl - 529) * 1000000) / j2);
    }

    public long nr(Format format, DecoderInputBuffer decoderInputBuffer) {
        if (this.rl == 0) {
            this.f57971n = decoderInputBuffer.timeUs;
        }
        if (this.f57972t) {
            return decoderInputBuffer.timeUs;
        }
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.data);
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = (i2 << 8) | (byteBuffer.get(i3) & UByte.MAX_VALUE);
        }
        int mpegAudioFrameSampleCount = MpegAudioUtil.parseMpegAudioFrameSampleCount(i2);
        if (mpegAudioFrameSampleCount != -1) {
            long jN = n(format.sampleRate);
            this.rl += (long) mpegAudioFrameSampleCount;
            return jN;
        }
        this.f57972t = true;
        this.rl = 0L;
        this.f57971n = decoderInputBuffer.timeUs;
        Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return decoderInputBuffer.timeUs;
    }

    public long rl(Format format) {
        return n(format.sampleRate);
    }

    public void t() {
        this.f57971n = 0L;
        this.rl = 0L;
        this.f57972t = false;
    }

    fuX() {
    }
}
