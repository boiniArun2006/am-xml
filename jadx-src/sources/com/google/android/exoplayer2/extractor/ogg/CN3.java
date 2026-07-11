package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
abstract class CN3 {
    private long J2;
    private int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f57853O;
    private long Uo;
    private boolean az;
    private long gh;
    private I28 nr;
    private boolean qie;
    private TrackOutput rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ExtractorOutput f57855t;
    private int xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.exoplayer2.extractor.ogg.w6 f57854n = new com.google.android.exoplayer2.extractor.ogg.w6();
    private n mUb = new n();

    private static final class w6 implements I28 {
        private w6() {
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.I28
        public long read(ExtractorInput extractorInput) {
            return -1L;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.I28
        public void startSeek(long j2) {
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.I28
        public SeekMap createSeekMap() {
            return new SeekMap.Unseekable(-9223372036854775807L);
        }
    }

    protected abstract long J2(ParsableByteArray parsableByteArray);

    protected abstract boolean xMQ(ParsableByteArray parsableByteArray, long j2, n nVar);

    static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Format f57856n;
        I28 rl;

        n() {
        }
    }

    private boolean KN(ExtractorInput extractorInput) {
        while (this.f57854n.nr(extractorInput)) {
            this.gh = extractorInput.getPosition() - this.J2;
            if (!xMQ(this.f57854n.t(), this.J2, this.mUb)) {
                return true;
            }
            this.J2 = extractorInput.getPosition();
        }
        this.KN = 3;
        return false;
    }

    private int gh(ExtractorInput extractorInput, PositionHolder positionHolder) {
        long j2 = this.nr.read(extractorInput);
        if (j2 >= 0) {
            positionHolder.position = j2;
            return 1;
        }
        if (j2 < -1) {
            O(-(j2 + 2));
        }
        if (!this.qie) {
            this.f57855t.seekMap((SeekMap) Assertions.checkStateNotNull(this.nr.createSeekMap()));
            this.qie = true;
        }
        if (this.gh <= 0 && !this.f57854n.nr(extractorInput)) {
            this.KN = 3;
            return -1;
        }
        this.gh = 0L;
        ParsableByteArray parsableByteArrayT = this.f57854n.t();
        long jJ2 = J2(parsableByteArrayT);
        if (jJ2 >= 0) {
            long j3 = this.Uo;
            if (j3 + jJ2 >= this.f57853O) {
                long jRl = rl(j3);
                this.rl.sampleData(parsableByteArrayT, parsableByteArrayT.limit());
                this.rl.sampleMetadata(jRl, 1, parsableByteArrayT.limit(), 0, null);
                this.f57853O = -1L;
            }
        }
        this.Uo += jJ2;
        return 0;
    }

    private void n() {
        Assertions.checkStateNotNull(this.rl);
        Util.castNonNull(this.f57855t);
    }

    protected void O(long j2) {
        this.Uo = j2;
    }

    final void az(long j2, long j3) {
        this.f57854n.O();
        if (j2 == 0) {
            qie(!this.qie);
        } else if (this.KN != 0) {
            this.f57853O = t(j3);
            ((I28) Util.castNonNull(this.nr)).startSeek(this.f57853O);
            this.KN = 2;
        }
    }

    void nr(ExtractorOutput extractorOutput, TrackOutput trackOutput) {
        this.f57855t = extractorOutput;
        this.rl = trackOutput;
        qie(true);
    }

    protected void qie(boolean z2) {
        if (z2) {
            this.mUb = new n();
            this.J2 = 0L;
            this.KN = 0;
        } else {
            this.KN = 1;
        }
        this.f57853O = -1L;
        this.Uo = 0L;
    }

    protected long t(long j2) {
        return (((long) this.xMQ) * j2) / 1000000;
    }

    private int mUb(ExtractorInput extractorInput) {
        boolean z2;
        if (!KN(extractorInput)) {
            return -1;
        }
        Format format = this.mUb.f57856n;
        this.xMQ = format.sampleRate;
        if (!this.az) {
            this.rl.format(format);
            this.az = true;
        }
        I28 i28 = this.mUb.rl;
        if (i28 != null) {
            this.nr = i28;
        } else if (extractorInput.getLength() == -1) {
            this.nr = new w6();
        } else {
            Ml mlRl = this.f57854n.rl();
            if ((mlRl.rl & 4) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.nr = new com.google.android.exoplayer2.extractor.ogg.j(this, this.J2, extractorInput.getLength(), mlRl.KN + mlRl.xMQ, mlRl.f57859t, z2);
        }
        this.KN = 2;
        this.f57854n.J2();
        return 0;
    }

    final int Uo(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        n();
        int i2 = this.KN;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                Util.castNonNull(this.nr);
                return gh(extractorInput, positionHolder);
            }
            extractorInput.skipFully((int) this.J2);
            this.KN = 2;
            return 0;
        }
        return mUb(extractorInput);
    }

    protected long rl(long j2) {
        return (j2 * 1000000) / ((long) this.xMQ);
    }
}
