package com.google.android.exoplayer2.extractor.wav;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract class n {

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f57921n;
        public final long rl;

        private j(int i2, long j2) {
            this.f57921n = i2;
            this.rl = j2;
        }

        public static j n(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws IOException {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
            parsableByteArray.setPosition(0);
            return new j(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }

    public static boolean n(ExtractorInput extractorInput) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        int i2 = j.n(extractorInput, parsableByteArray).f57921n;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        extractorInput.peekFully(parsableByteArray.getData(), 0, 4);
        parsableByteArray.setPosition(0);
        int i3 = parsableByteArray.readInt();
        if (i3 == 1463899717) {
            return true;
        }
        Log.e("WavHeaderReader", "Unsupported form type: " + i3);
        return false;
    }

    public static com.google.android.exoplayer2.extractor.wav.j rl(ExtractorInput extractorInput) throws IOException {
        byte[] bArr;
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        j jVarNr = nr(1718449184, extractorInput, parsableByteArray);
        Assertions.checkState(jVarNr.rl >= 16);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 16);
        parsableByteArray.setPosition(0);
        int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort4 = parsableByteArray.readLittleEndianUnsignedShort();
        int i2 = ((int) jVarNr.rl) - 16;
        if (i2 > 0) {
            bArr = new byte[i2];
            extractorInput.peekFully(bArr, 0, i2);
        } else {
            bArr = Util.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr2 = bArr;
        extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
        return new com.google.android.exoplayer2.extractor.wav.j(littleEndianUnsignedShort, littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, bArr2);
    }

    public static long t(ExtractorInput extractorInput) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        j jVarN = j.n(extractorInput, parsableByteArray);
        if (jVarN.f57921n != 1685272116) {
            extractorInput.resetPeekPosition();
            return -1L;
        }
        extractorInput.advancePeekPosition(8);
        parsableByteArray.setPosition(0);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
        long littleEndianLong = parsableByteArray.readLittleEndianLong();
        extractorInput.skipFully(((int) jVarN.rl) + 8);
        return littleEndianLong;
    }

    public static Pair O(ExtractorInput extractorInput) throws IOException {
        extractorInput.resetPeekPosition();
        j jVarNr = nr(1684108385, extractorInput, new ParsableByteArray(8));
        extractorInput.skipFully(8);
        return Pair.create(Long.valueOf(extractorInput.getPosition()), Long.valueOf(jVarNr.rl));
    }

    private static j nr(int i2, ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws IOException {
        j jVarN = j.n(extractorInput, parsableByteArray);
        while (jVarN.f57921n != i2) {
            Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + jVarN.f57921n);
            long j2 = jVarN.rl + 8;
            if (j2 <= 2147483647L) {
                extractorInput.skipFully((int) j2);
                jVarN = j.n(extractorInput, parsableByteArray);
            } else {
                throw ParserException.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + jVarN.f57921n);
            }
        }
        return jVarN;
    }
}
