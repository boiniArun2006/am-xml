package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacMetadataReader;
import com.google.android.exoplayer2.extractor.FlacSeekTableSeekMap;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.ogg.CN3;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class n extends CN3 {
    private j HI;
    private FlacStreamMetadata ty;

    private static final class j implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private FlacStreamMetadata f57868n;
        private FlacStreamMetadata.SeekTable rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f57869t = -1;
        private long nr = -1;

        @Override // com.google.android.exoplayer2.extractor.ogg.I28
        public SeekMap createSeekMap() {
            Assertions.checkState(this.f57869t != -1);
            return new FlacSeekTableSeekMap(this.f57868n, this.f57869t);
        }

        public void n(long j2) {
            this.f57869t = j2;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.I28
        public long read(ExtractorInput extractorInput) {
            long j2 = this.nr;
            if (j2 < 0) {
                return -1L;
            }
            long j3 = -(j2 + 2);
            this.nr = -1L;
            return j3;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.I28
        public void startSeek(long j2) {
            long[] jArr = this.rl.pointSampleNumbers;
            this.nr = jArr[Util.binarySearchFloor(jArr, j2, true, true)];
        }

        public j(FlacStreamMetadata flacStreamMetadata, FlacStreamMetadata.SeekTable seekTable) {
            this.f57868n = flacStreamMetadata;
            this.rl = seekTable;
        }
    }

    private static boolean HI(byte[] bArr) {
        return bArr[0] == -1;
    }

    n() {
    }

    public static boolean ck(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() >= 5 && parsableByteArray.readUnsignedByte() == 127 && parsableByteArray.readUnsignedInt() == 1179402563) {
            return true;
        }
        return false;
    }

    private int ty(ParsableByteArray parsableByteArray) {
        int i2 = (parsableByteArray.getData()[2] & UByte.MAX_VALUE) >> 4;
        if (i2 == 6 || i2 == 7) {
            parsableByteArray.skipBytes(4);
            parsableByteArray.readUtf8EncodedLong();
        }
        int frameBlockSizeSamplesFromKey = FlacFrameReader.readFrameBlockSizeSamplesFromKey(parsableByteArray, i2);
        parsableByteArray.setPosition(0);
        return frameBlockSizeSamplesFromKey;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.CN3
    protected long J2(ParsableByteArray parsableByteArray) {
        if (!HI(parsableByteArray.getData())) {
            return -1L;
        }
        return ty(parsableByteArray);
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.CN3
    protected void qie(boolean z2) {
        super.qie(z2);
        if (z2) {
            this.ty = null;
            this.HI = null;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.CN3
    protected boolean xMQ(ParsableByteArray parsableByteArray, long j2, CN3.n nVar) {
        byte[] data = parsableByteArray.getData();
        FlacStreamMetadata flacStreamMetadata = this.ty;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(data, 17);
            this.ty = flacStreamMetadata2;
            nVar.f57856n = flacStreamMetadata2.getFormat(Arrays.copyOfRange(data, 9, parsableByteArray.limit()), null);
            return true;
        }
        if ((data[0] & ByteCompanionObject.MAX_VALUE) == 3) {
            FlacStreamMetadata.SeekTable seekTableMetadataBlock = FlacMetadataReader.readSeekTableMetadataBlock(parsableByteArray);
            FlacStreamMetadata flacStreamMetadataCopyWithSeekTable = flacStreamMetadata.copyWithSeekTable(seekTableMetadataBlock);
            this.ty = flacStreamMetadataCopyWithSeekTable;
            this.HI = new j(flacStreamMetadataCopyWithSeekTable, seekTableMetadataBlock);
            return true;
        }
        if (!HI(data)) {
            return true;
        }
        j jVar = this.HI;
        if (jVar != null) {
            jVar.n(j2);
            nVar.rl = this.HI;
        }
        Assertions.checkNotNull(nVar.f57856n);
        return false;
    }
}
