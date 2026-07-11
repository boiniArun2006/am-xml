package com.google.android.exoplayer2.extractor.ogg;

import androidx.media3.extractor.ogg.OggPageHeader;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f57870O;
    private int nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f57871n = new Ml();
    private final ParsableByteArray rl = new ParsableByteArray(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f57872t = -1;

    private int n(int i2) {
        int i3;
        int i5 = 0;
        this.nr = 0;
        do {
            int i7 = this.nr;
            int i8 = i2 + i7;
            Ml ml = this.f57871n;
            if (i8 >= ml.Uo) {
                break;
            }
            int[] iArr = ml.mUb;
            this.nr = i7 + 1;
            i3 = iArr[i7 + i2];
            i5 += i3;
        } while (i3 == 255);
        return i5;
    }

    public boolean nr(ExtractorInput extractorInput) {
        int i2;
        Assertions.checkState(extractorInput != null);
        if (this.f57870O) {
            this.f57870O = false;
            this.rl.reset(0);
        }
        while (!this.f57870O) {
            if (this.f57872t < 0) {
                if (!this.f57871n.t(extractorInput) || !this.f57871n.n(extractorInput, true)) {
                    return false;
                }
                Ml ml = this.f57871n;
                int iN = ml.KN;
                if ((ml.rl & 1) == 1 && this.rl.limit() == 0) {
                    iN += n(0);
                    i2 = this.nr;
                } else {
                    i2 = 0;
                }
                if (!ExtractorUtil.skipFullyQuietly(extractorInput, iN)) {
                    return false;
                }
                this.f57872t = i2;
            }
            int iN2 = n(this.f57872t);
            int i3 = this.f57872t + this.nr;
            if (iN2 > 0) {
                ParsableByteArray parsableByteArray = this.rl;
                parsableByteArray.ensureCapacity(parsableByteArray.limit() + iN2);
                if (!ExtractorUtil.readFullyQuietly(extractorInput, this.rl.getData(), this.rl.limit(), iN2)) {
                    return false;
                }
                ParsableByteArray parsableByteArray2 = this.rl;
                parsableByteArray2.setLimit(parsableByteArray2.limit() + iN2);
                this.f57870O = this.f57871n.mUb[i3 + (-1)] != 255;
            }
            if (i3 == this.f57871n.Uo) {
                i3 = -1;
            }
            this.f57872t = i3;
        }
        return true;
    }

    public void J2() {
        if (this.rl.getData().length == 65025) {
            return;
        }
        ParsableByteArray parsableByteArray = this.rl;
        parsableByteArray.reset(Arrays.copyOf(parsableByteArray.getData(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, this.rl.limit())), this.rl.limit());
    }

    public void O() {
        this.f57871n.rl();
        this.rl.reset(0);
        this.f57872t = -1;
        this.f57870O = false;
    }

    public Ml rl() {
        return this.f57871n;
    }

    public ParsableByteArray t() {
        return this.rl;
    }

    w6() {
    }
}
