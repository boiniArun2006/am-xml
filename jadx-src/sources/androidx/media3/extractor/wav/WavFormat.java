package androidx.media3.extractor.wav;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class WavFormat {
    public final int averageBytesPerSecond;
    public final int bitsPerSample;
    public final int blockSize;
    public final byte[] extraData;
    public final int formatType;
    public final int frameRateHz;
    public final int numChannels;

    public WavFormat(int i2, int i3, int i5, int i7, int i8, int i9, byte[] bArr) {
        this.formatType = i2;
        this.numChannels = i3;
        this.frameRateHz = i5;
        this.averageBytesPerSecond = i7;
        this.blockSize = i8;
        this.bitsPerSample = i9;
        this.extraData = bArr;
    }
}
