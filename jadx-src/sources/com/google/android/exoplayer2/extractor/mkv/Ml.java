package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ParsableByteArray f57790n = new ParsableByteArray(8);
    private int rl;

    private long n(ExtractorInput extractorInput) throws IOException {
        int i2 = 0;
        extractorInput.peekFully(this.f57790n.getData(), 0, 1);
        int i3 = this.f57790n.getData()[0] & UByte.MAX_VALUE;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i5 = 128;
        int i7 = 0;
        while ((i3 & i5) == 0) {
            i5 >>= 1;
            i7++;
        }
        int i8 = i3 & (~i5);
        extractorInput.peekFully(this.f57790n.getData(), 1, i7);
        while (i2 < i7) {
            i2++;
            i8 = (this.f57790n.getData()[i2] & UByte.MAX_VALUE) + (i8 << 8);
        }
        this.rl += i7 + 1;
        return i8;
    }

    public boolean rl(ExtractorInput extractorInput) throws IOException {
        long length = extractorInput.getLength();
        long j2 = 1024;
        if (length != -1 && length <= 1024) {
            j2 = length;
        }
        int i2 = (int) j2;
        extractorInput.peekFully(this.f57790n.getData(), 0, 4);
        long unsignedInt = this.f57790n.readUnsignedInt();
        this.rl = 4;
        while (unsignedInt != 440786851) {
            int i3 = this.rl + 1;
            this.rl = i3;
            if (i3 == i2) {
                return false;
            }
            extractorInput.peekFully(this.f57790n.getData(), 0, 1);
            unsignedInt = ((unsignedInt << 8) & (-256)) | ((long) (this.f57790n.getData()[0] & UByte.MAX_VALUE));
        }
        long jN = n(extractorInput);
        long j3 = this.rl;
        if (jN != Long.MIN_VALUE && (length == -1 || j3 + jN < length)) {
            while (true) {
                int i5 = this.rl;
                long j4 = j3 + jN;
                if (i5 < j4) {
                    if (n(extractorInput) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jN2 = n(extractorInput);
                    if (jN2 < 0 || jN2 > 2147483647L) {
                        break;
                    }
                    if (jN2 != 0) {
                        int i7 = (int) jN2;
                        extractorInput.advancePeekPosition(i7);
                        this.rl += i7;
                    }
                } else if (i5 == j4) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
