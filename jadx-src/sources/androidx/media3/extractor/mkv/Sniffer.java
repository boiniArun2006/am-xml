package androidx.media3.extractor.mkv;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class Sniffer {
    private static final int ID_EBML = 440786851;
    private static final int SEARCH_LENGTH = 1024;
    private int peekLength;
    private final ParsableByteArray scratch = new ParsableByteArray(8);

    private long readUint(ExtractorInput extractorInput) throws IOException {
        int i2 = 0;
        extractorInput.peekFully(this.scratch.getData(), 0, 1);
        int i3 = this.scratch.getData()[0] & UByte.MAX_VALUE;
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
        extractorInput.peekFully(this.scratch.getData(), 1, i7);
        while (i2 < i7) {
            i2++;
            i8 = (this.scratch.getData()[i2] & UByte.MAX_VALUE) + (i8 << 8);
        }
        this.peekLength += i7 + 1;
        return i8;
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        long length = extractorInput.getLength();
        long j2 = 1024;
        if (length != -1 && length <= 1024) {
            j2 = length;
        }
        int i2 = (int) j2;
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        long unsignedInt = this.scratch.readUnsignedInt();
        this.peekLength = 4;
        while (unsignedInt != 440786851) {
            int i3 = this.peekLength + 1;
            this.peekLength = i3;
            if (i3 == i2) {
                return false;
            }
            extractorInput.peekFully(this.scratch.getData(), 0, 1);
            unsignedInt = ((unsignedInt << 8) & (-256)) | ((long) (this.scratch.getData()[0] & UByte.MAX_VALUE));
        }
        long uint = readUint(extractorInput);
        long j3 = this.peekLength;
        if (uint != Long.MIN_VALUE && (length == -1 || j3 + uint < length)) {
            while (true) {
                int i5 = this.peekLength;
                long j4 = j3 + uint;
                if (i5 < j4) {
                    if (readUint(extractorInput) == Long.MIN_VALUE) {
                        return false;
                    }
                    long uint2 = readUint(extractorInput);
                    if (uint2 < 0 || uint2 > 2147483647L) {
                        break;
                    }
                    if (uint2 != 0) {
                        int i7 = (int) uint2;
                        extractorInput.advancePeekPosition(i7);
                        this.peekLength += i7;
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
