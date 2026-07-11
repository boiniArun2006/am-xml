package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.video.AvcConfig;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class w6 extends TagPayloadReader {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f57779O;
    private int Uo;
    private int nr;
    private final ParsableByteArray rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ParsableByteArray f57780t;

    public w6(TrackOutput trackOutput) {
        super(trackOutput);
        this.rl = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.f57780t = new ParsableByteArray(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean rl(ParsableByteArray parsableByteArray) throws TagPayloadReader.UnsupportedFormatException {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = (unsignedByte >> 4) & 15;
        int i3 = unsignedByte & 15;
        if (i3 == 7) {
            this.Uo = i2;
            if (i2 != 5) {
                return true;
            }
            return false;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i3);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean t(ParsableByteArray parsableByteArray, long j2) throws ParserException {
        int i2;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        long int24 = j2 + (((long) parsableByteArray.readInt24()) * 1000);
        if (unsignedByte == 0 && !this.f57779O) {
            ParsableByteArray parsableByteArray2 = new ParsableByteArray(new byte[parsableByteArray.bytesLeft()]);
            parsableByteArray.readBytes(parsableByteArray2.getData(), 0, parsableByteArray.bytesLeft());
            AvcConfig avcConfig = AvcConfig.parse(parsableByteArray2);
            this.nr = avcConfig.nalUnitLengthFieldLength;
            this.f57775n.format(new Format.Builder().setSampleMimeType("video/avc").setCodecs(avcConfig.codecs).setWidth(avcConfig.width).setHeight(avcConfig.height).setPixelWidthHeightRatio(avcConfig.pixelWidthHeightRatio).setInitializationData(avcConfig.initializationData).build());
            this.f57779O = true;
            return false;
        }
        if (unsignedByte != 1 || !this.f57779O) {
            return false;
        }
        if (this.Uo == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (!this.J2 && i2 == 0) {
            return false;
        }
        byte[] data = this.f57780t.getData();
        data[0] = 0;
        data[1] = 0;
        data[2] = 0;
        int i3 = 4 - this.nr;
        int i5 = 0;
        while (parsableByteArray.bytesLeft() > 0) {
            parsableByteArray.readBytes(this.f57780t.getData(), i3, this.nr);
            this.f57780t.setPosition(0);
            int unsignedIntToInt = this.f57780t.readUnsignedIntToInt();
            this.rl.setPosition(0);
            this.f57775n.sampleData(this.rl, 4);
            this.f57775n.sampleData(parsableByteArray, unsignedIntToInt);
            i5 = i5 + 4 + unsignedIntToInt;
        }
        this.f57775n.sampleMetadata(int24, i2, i5, 0, null);
        this.J2 = true;
        return true;
    }
}
