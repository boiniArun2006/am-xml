package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class j extends TagPayloadReader {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int[] f57776O = {5512, 11025, 22050, 44100};
    private int nr;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f57777t;

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean rl(ParsableByteArray parsableByteArray) throws TagPayloadReader.UnsupportedFormatException {
        if (this.rl) {
            parsableByteArray.skipBytes(1);
        } else {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int i2 = (unsignedByte >> 4) & 15;
            this.nr = i2;
            if (i2 == 2) {
                this.f57775n.format(new Format.Builder().setSampleMimeType("audio/mpeg").setChannelCount(1).setSampleRate(f57776O[(unsignedByte >> 2) & 3]).build());
                this.f57777t = true;
            } else if (i2 == 7 || i2 == 8) {
                this.f57775n.format(new Format.Builder().setSampleMimeType(i2 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").setChannelCount(1).setSampleRate(8000).build());
                this.f57777t = true;
            } else if (i2 != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.nr);
            }
            this.rl = true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean t(ParsableByteArray parsableByteArray, long j2) throws ParserException {
        if (this.nr == 2) {
            int iBytesLeft = parsableByteArray.bytesLeft();
            this.f57775n.sampleData(parsableByteArray, iBytesLeft);
            this.f57775n.sampleMetadata(j2, 1, iBytesLeft, 0, null);
            return true;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if (unsignedByte != 0 || this.f57777t) {
            if (this.nr == 10 && unsignedByte != 1) {
                return false;
            }
            int iBytesLeft2 = parsableByteArray.bytesLeft();
            this.f57775n.sampleData(parsableByteArray, iBytesLeft2);
            this.f57775n.sampleMetadata(j2, 1, iBytesLeft2, 0, null);
            return true;
        }
        int iBytesLeft3 = parsableByteArray.bytesLeft();
        byte[] bArr = new byte[iBytesLeft3];
        parsableByteArray.readBytes(bArr, 0, iBytesLeft3);
        AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr);
        this.f57775n.format(new Format.Builder().setSampleMimeType("audio/mp4a-latm").setCodecs(audioSpecificConfig.codecs).setChannelCount(audioSpecificConfig.channelCount).setSampleRate(audioSpecificConfig.sampleRateHz).setInitializationData(Collections.singletonList(bArr)).build());
        this.f57777t = true;
        return false;
    }

    public j(TrackOutput trackOutput) {
        super(trackOutput);
    }
}
