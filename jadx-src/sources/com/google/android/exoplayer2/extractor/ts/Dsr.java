package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class Dsr {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f57874O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f57875n;
    private boolean nr;
    private final TimestampAdjuster rl = new TimestampAdjuster(0);
    private long Uo = -9223372036854775807L;
    private long KN = -9223372036854775807L;
    private long xMQ = -9223372036854775807L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ParsableByteArray f57876t = new ParsableByteArray();

    private int J2(ExtractorInput extractorInput, PositionHolder positionHolder, int i2) throws IOException {
        int iMin = (int) Math.min(this.f57875n, extractorInput.getLength());
        long j2 = 0;
        if (extractorInput.getPosition() != j2) {
            positionHolder.position = j2;
            return 1;
        }
        this.f57876t.reset(iMin);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.f57876t.getData(), 0, iMin);
        this.Uo = Uo(this.f57876t, i2);
        this.f57874O = true;
        return 0;
    }

    private int n(ExtractorInput extractorInput) {
        this.f57876t.reset(Util.EMPTY_BYTE_ARRAY);
        this.nr = true;
        extractorInput.resetPeekPosition();
        return 0;
    }

    public int O(ExtractorInput extractorInput, PositionHolder positionHolder, int i2) {
        if (i2 <= 0) {
            return n(extractorInput);
        }
        if (!this.J2) {
            return KN(extractorInput, positionHolder, i2);
        }
        if (this.KN == -9223372036854775807L) {
            return n(extractorInput);
        }
        if (!this.f57874O) {
            return J2(extractorInput, positionHolder, i2);
        }
        long j2 = this.Uo;
        if (j2 == -9223372036854775807L) {
            return n(extractorInput);
        }
        long jAdjustTsTimestamp = this.rl.adjustTsTimestamp(this.KN) - this.rl.adjustTsTimestamp(j2);
        this.xMQ = jAdjustTsTimestamp;
        if (jAdjustTsTimestamp < 0) {
            Log.w("TsDurationReader", "Invalid duration: " + this.xMQ + ". Using TIME_UNSET instead.");
            this.xMQ = -9223372036854775807L;
        }
        return n(extractorInput);
    }

    public boolean nr() {
        return this.nr;
    }

    public long rl() {
        return this.xMQ;
    }

    public TimestampAdjuster t() {
        return this.rl;
    }

    Dsr(int i2) {
        this.f57875n = i2;
    }

    private int KN(ExtractorInput extractorInput, PositionHolder positionHolder, int i2) throws IOException {
        long length = extractorInput.getLength();
        int iMin = (int) Math.min(this.f57875n, length);
        long j2 = length - ((long) iMin);
        if (extractorInput.getPosition() != j2) {
            positionHolder.position = j2;
            return 1;
        }
        this.f57876t.reset(iMin);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.f57876t.getData(), 0, iMin);
        this.KN = xMQ(this.f57876t, i2);
        this.J2 = true;
        return 0;
    }

    private long Uo(ParsableByteArray parsableByteArray, int i2) {
        int iLimit = parsableByteArray.limit();
        for (int position = parsableByteArray.getPosition(); position < iLimit; position++) {
            if (parsableByteArray.getData()[position] == 71) {
                long pcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, position, i2);
                if (pcrFromPacket != -9223372036854775807L) {
                    return pcrFromPacket;
                }
            }
        }
        return -9223372036854775807L;
    }

    private long xMQ(ParsableByteArray parsableByteArray, int i2) {
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        for (int i3 = iLimit - 188; i3 >= position; i3--) {
            if (TsUtil.isStartOfTsPacket(parsableByteArray.getData(), position, iLimit, i3)) {
                long pcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, i3, i2);
                if (pcrFromPacket != -9223372036854775807L) {
                    return pcrFromPacket;
                }
            }
        }
        return -9223372036854775807L;
    }
}
