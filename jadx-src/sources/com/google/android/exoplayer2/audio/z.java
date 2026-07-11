package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class z extends BaseAudioProcessor {
    private int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private byte[] f57699O = Util.EMPTY_BYTE_ARRAY;
    private long Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f57700n;
    private int nr;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f57701t;

    public long n() {
        return this.Uo;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        this.f57701t = true;
        return (this.f57700n == 0 && this.rl == 0) ? AudioProcessor.AudioFormat.NOT_SET : audioFormat;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    protected void onFlush() {
        if (this.f57701t) {
            this.f57701t = false;
            int i2 = this.rl;
            int i3 = this.inputAudioFormat.bytesPerFrame;
            this.f57699O = new byte[i2 * i3];
            this.nr = this.f57700n * i3;
        }
        this.J2 = 0;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    protected void onQueueEndOfStream() {
        if (this.f57701t) {
            int i2 = this.J2;
            if (i2 > 0) {
                this.Uo += (long) (i2 / this.inputAudioFormat.bytesPerFrame);
            }
            this.J2 = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    protected void onReset() {
        this.f57699O = Util.EMPTY_BYTE_ARRAY;
    }

    public void rl() {
        this.Uo = 0L;
    }

    public void t(int i2, int i3) {
        this.f57700n = i2;
        this.rl = i3;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        int i2;
        if (super.isEnded() && (i2 = this.J2) > 0) {
            replaceOutputBuffer(i2).put(this.f57699O, 0, this.J2).flip();
            this.J2 = 0;
        }
        return super.getOutput();
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        if (super.isEnded() && this.J2 == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        if (i2 != 0) {
            int iMin = Math.min(i2, this.nr);
            this.Uo += (long) (iMin / this.inputAudioFormat.bytesPerFrame);
            this.nr -= iMin;
            byteBuffer.position(iPosition + iMin);
            if (this.nr > 0) {
                return;
            }
            int i3 = i2 - iMin;
            int length = (this.J2 + i3) - this.f57699O.length;
            ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(length);
            int iConstrainValue = Util.constrainValue(length, 0, this.J2);
            byteBufferReplaceOutputBuffer.put(this.f57699O, 0, iConstrainValue);
            int iConstrainValue2 = Util.constrainValue(length - iConstrainValue, 0, i3);
            byteBuffer.limit(byteBuffer.position() + iConstrainValue2);
            byteBufferReplaceOutputBuffer.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i5 = i3 - iConstrainValue2;
            int i7 = this.J2 - iConstrainValue;
            this.J2 = i7;
            byte[] bArr = this.f57699O;
            System.arraycopy(bArr, iConstrainValue, bArr, 0, i7);
            byteBuffer.get(this.f57699O, this.J2, i5);
            this.J2 += i5;
            byteBufferReplaceOutputBuffer.flip();
        }
    }
}
