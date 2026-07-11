package com.google.android.exoplayer2.extractor.ogg;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class j implements I28 {
    private long J2;
    private long KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f57864O;
    private long Uo;
    private long gh;
    private long mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f57865n;
    private final CN3 nr;
    private long qie;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f57866t;
    private long xMQ;

    private final class n implements SeekMap {
        private n() {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return j.this.nr.rl(j.this.J2);
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j2) {
            return new SeekMap.SeekPoints(new SeekPoint(j2, Util.constrainValue((j.this.rl + ((j.this.nr.t(j2) * (j.this.f57866t - j.this.rl)) / j.this.J2)) - 30000, j.this.rl, j.this.f57866t - 1)));
        }
    }

    private long J2(ExtractorInput extractorInput) throws IOException {
        if (this.xMQ == this.mUb) {
            return -1L;
        }
        long position = extractorInput.getPosition();
        if (!this.f57865n.nr(extractorInput, this.mUb)) {
            long j2 = this.xMQ;
            if (j2 != position) {
                return j2;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f57865n.n(extractorInput, false);
        extractorInput.resetPeekPosition();
        long j3 = this.KN;
        Ml ml = this.f57865n;
        long j4 = ml.f57859t;
        long j5 = j3 - j4;
        int i2 = ml.KN + ml.xMQ;
        if (0 <= j5 && j5 < 72000) {
            return -1L;
        }
        if (j5 < 0) {
            this.mUb = position;
            this.qie = j4;
        } else {
            this.xMQ = extractorInput.getPosition() + ((long) i2);
            this.gh = this.f57865n.f57859t;
        }
        long j6 = this.mUb;
        long j7 = this.xMQ;
        if (j6 - j7 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
            this.mUb = j7;
            return j7;
        }
        long position2 = extractorInput.getPosition() - (((long) i2) * (j5 <= 0 ? 2L : 1L));
        long j9 = this.mUb;
        long j10 = this.xMQ;
        return Util.constrainValue(position2 + ((j5 * (j9 - j10)) / (this.qie - this.gh)), j10, j9 - 1);
    }

    private void KN(ExtractorInput extractorInput) throws IOException {
        while (true) {
            this.f57865n.t(extractorInput);
            this.f57865n.n(extractorInput, false);
            Ml ml = this.f57865n;
            if (ml.f57859t > this.KN) {
                extractorInput.resetPeekPosition();
                return;
            } else {
                extractorInput.skipFully(ml.KN + ml.xMQ);
                this.xMQ = extractorInput.getPosition();
                this.gh = this.f57865n.f57859t;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.I28
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public n createSeekMap() {
        if (this.J2 != 0) {
            return new n();
        }
        return null;
    }

    long Uo(ExtractorInput extractorInput) throws IOException {
        this.f57865n.rl();
        if (!this.f57865n.t(extractorInput)) {
            throw new EOFException();
        }
        this.f57865n.n(extractorInput, false);
        Ml ml = this.f57865n;
        extractorInput.skipFully(ml.KN + ml.xMQ);
        long j2 = this.f57865n.f57859t;
        while (true) {
            Ml ml2 = this.f57865n;
            if ((ml2.rl & 4) == 4 || !ml2.t(extractorInput) || extractorInput.getPosition() >= this.f57866t || !this.f57865n.n(extractorInput, true)) {
                break;
            }
            Ml ml3 = this.f57865n;
            if (!ExtractorUtil.skipFullyQuietly(extractorInput, ml3.KN + ml3.xMQ)) {
                break;
            }
            j2 = this.f57865n.f57859t;
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.I28
    public long read(ExtractorInput extractorInput) throws IOException {
        int i2 = this.f57864O;
        if (i2 == 0) {
            long position = extractorInput.getPosition();
            this.Uo = position;
            this.f57864O = 1;
            long j2 = this.f57866t - 65307;
            if (j2 > position) {
                return j2;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                long jJ2 = J2(extractorInput);
                if (jJ2 != -1) {
                    return jJ2;
                }
                this.f57864O = 3;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            KN(extractorInput);
            this.f57864O = 4;
            return -(this.gh + 2);
        }
        this.J2 = Uo(extractorInput);
        this.f57864O = 4;
        return this.Uo;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.I28
    public void startSeek(long j2) {
        this.KN = Util.constrainValue(j2, 0L, this.J2 - 1);
        this.f57864O = 2;
        this.xMQ = this.rl;
        this.mUb = this.f57866t;
        this.gh = 0L;
        this.qie = this.J2;
    }

    public j(CN3 cn3, long j2, long j3, long j4, long j5, boolean z2) {
        boolean z3;
        if (j2 >= 0 && j3 > j2) {
            z3 = true;
        } else {
            z3 = false;
        }
        Assertions.checkArgument(z3);
        this.nr = cn3;
        this.rl = j2;
        this.f57866t = j3;
        if (j4 != j3 - j2 && !z2) {
            this.f57864O = 0;
        } else {
            this.J2 = j5;
            this.f57864O = 4;
        }
        this.f57865n = new Ml();
    }
}
