package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Wre {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f57907O;
    private boolean nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f57909t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TimestampAdjuster f57908n = new TimestampAdjuster(0);
    private long J2 = -9223372036854775807L;
    private long Uo = -9223372036854775807L;
    private long KN = -9223372036854775807L;
    private final ParsableByteArray rl = new ParsableByteArray();

    private static long az(byte[] bArr) {
        byte b2 = bArr[0];
        long j2 = (((((long) b2) & 56) >> 3) << 30) | ((((long) b2) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b4 = bArr[2];
        return j2 | (((((long) b4) & 248) >> 3) << 15) | ((((long) b4) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    private static boolean n(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int J2(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & UByte.MAX_VALUE) | ((bArr[i2] & UByte.MAX_VALUE) << 24) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 8);
    }

    private int rl(ExtractorInput extractorInput) {
        this.rl.reset(Util.EMPTY_BYTE_ARRAY);
        this.f57909t = true;
        extractorInput.resetPeekPosition();
        return 0;
    }

    public boolean O() {
        return this.f57909t;
    }

    public int Uo(ExtractorInput extractorInput, PositionHolder positionHolder) {
        if (!this.f57907O) {
            return mUb(extractorInput, positionHolder);
        }
        if (this.Uo == -9223372036854775807L) {
            return rl(extractorInput);
        }
        if (!this.nr) {
            return KN(extractorInput, positionHolder);
        }
        long j2 = this.J2;
        if (j2 == -9223372036854775807L) {
            return rl(extractorInput);
        }
        long jAdjustTsTimestamp = this.f57908n.adjustTsTimestamp(this.Uo) - this.f57908n.adjustTsTimestamp(j2);
        this.KN = jAdjustTsTimestamp;
        if (jAdjustTsTimestamp < 0) {
            Log.w("PsDurationReader", "Invalid duration: " + this.KN + ". Using TIME_UNSET instead.");
            this.KN = -9223372036854775807L;
        }
        return rl(extractorInput);
    }

    public TimestampAdjuster nr() {
        return this.f57908n;
    }

    public long t() {
        return this.KN;
    }

    Wre() {
    }

    private int KN(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int iMin = (int) Math.min(20000L, extractorInput.getLength());
        long j2 = 0;
        if (extractorInput.getPosition() != j2) {
            positionHolder.position = j2;
            return 1;
        }
        this.rl.reset(iMin);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.rl.getData(), 0, iMin);
        this.J2 = xMQ(this.rl);
        this.nr = true;
        return 0;
    }

    private long gh(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        for (int iLimit = parsableByteArray.limit() - 4; iLimit >= position; iLimit--) {
            if (J2(parsableByteArray.getData(), iLimit) == 442) {
                parsableByteArray.setPosition(iLimit + 4);
                long jQie = qie(parsableByteArray);
                if (jQie != -9223372036854775807L) {
                    return jQie;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int mUb(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        long length = extractorInput.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j2 = length - ((long) iMin);
        if (extractorInput.getPosition() != j2) {
            positionHolder.position = j2;
            return 1;
        }
        this.rl.reset(iMin);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.rl.getData(), 0, iMin);
        this.Uo = gh(this.rl);
        this.f57907O = true;
        return 0;
    }

    public static long qie(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        if (parsableByteArray.bytesLeft() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        parsableByteArray.readBytes(bArr, 0, 9);
        parsableByteArray.setPosition(position);
        if (!n(bArr)) {
            return -9223372036854775807L;
        }
        return az(bArr);
    }

    private long xMQ(ParsableByteArray parsableByteArray) {
        int iLimit = parsableByteArray.limit();
        for (int position = parsableByteArray.getPosition(); position < iLimit - 3; position++) {
            if (J2(parsableByteArray.getData(), position) == 442) {
                parsableByteArray.setPosition(position + 4);
                long jQie = qie(parsableByteArray);
                if (jQie != -9223372036854775807L) {
                    return jQie;
                }
            }
        }
        return -9223372036854775807L;
    }
}
