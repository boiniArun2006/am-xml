package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class j implements com.google.android.exoplayer2.extractor.mkv.n {
    private int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f57791O;
    private long Uo;
    private EbmlProcessor nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f57792n = new byte[8];
    private final ArrayDeque rl = new ArrayDeque();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final I28 f57793t = new I28();

    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f57794n;
        private final long rl;

        private n(int i2, long j2) {
            this.f57794n = i2;
            this.rl = j2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.n
    public void reset() {
        this.f57791O = 0;
        this.rl.clear();
        this.f57793t.O();
    }

    private static String O(ExtractorInput extractorInput, int i2) throws IOException {
        if (i2 == 0) {
            return "";
        }
        byte[] bArr = new byte[i2];
        extractorInput.readFully(bArr, 0, i2);
        while (i2 > 0 && bArr[i2 - 1] == 0) {
            i2--;
        }
        return new String(bArr, 0, i2);
    }

    private long nr(ExtractorInput extractorInput, int i2) throws IOException {
        extractorInput.readFully(this.f57792n, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | ((long) (this.f57792n[i3] & UByte.MAX_VALUE));
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.n
    public void n(EbmlProcessor ebmlProcessor) {
        this.nr = ebmlProcessor;
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.n
    public boolean read(ExtractorInput extractorInput) throws IOException {
        Assertions.checkStateNotNull(this.nr);
        while (true) {
            n nVar = (n) this.rl.peek();
            if (nVar != null && extractorInput.getPosition() >= nVar.rl) {
                this.nr.endMasterElement(((n) this.rl.pop()).f57794n);
                return true;
            }
            if (this.f57791O == 0) {
                long jNr = this.f57793t.nr(extractorInput, true, false, 4);
                if (jNr == -2) {
                    jNr = rl(extractorInput);
                }
                if (jNr == -1) {
                    return false;
                }
                this.J2 = (int) jNr;
                this.f57791O = 1;
            }
            if (this.f57791O == 1) {
                this.Uo = this.f57793t.nr(extractorInput, false, true, 8);
                this.f57791O = 2;
            }
            int elementType = this.nr.getElementType(this.J2);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = extractorInput.getPosition();
                    this.rl.push(new n(this.J2, this.Uo + position));
                    this.nr.startMasterElement(this.J2, position, this.Uo);
                    this.f57791O = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j2 = this.Uo;
                    if (j2 <= 8) {
                        this.nr.integerElement(this.J2, nr(extractorInput, (int) j2));
                        this.f57791O = 0;
                        return true;
                    }
                    throw ParserException.createForMalformedContainer("Invalid integer size: " + this.Uo, null);
                }
                if (elementType == 3) {
                    long j3 = this.Uo;
                    if (j3 <= 2147483647L) {
                        this.nr.stringElement(this.J2, O(extractorInput, (int) j3));
                        this.f57791O = 0;
                        return true;
                    }
                    throw ParserException.createForMalformedContainer("String element size: " + this.Uo, null);
                }
                if (elementType == 4) {
                    this.nr.binaryElement(this.J2, (int) this.Uo, extractorInput);
                    this.f57791O = 0;
                    return true;
                }
                if (elementType != 5) {
                    throw ParserException.createForMalformedContainer("Invalid element type " + elementType, null);
                }
                long j4 = this.Uo;
                if (j4 == 4 || j4 == 8) {
                    this.nr.floatElement(this.J2, t(extractorInput, (int) j4));
                    this.f57791O = 0;
                    return true;
                }
                throw ParserException.createForMalformedContainer("Invalid float size: " + this.Uo, null);
            }
            extractorInput.skipFully((int) this.Uo);
            this.f57791O = 0;
        }
    }

    private long rl(ExtractorInput extractorInput) throws IOException {
        extractorInput.resetPeekPosition();
        while (true) {
            extractorInput.peekFully(this.f57792n, 0, 4);
            int iT = I28.t(this.f57792n[0]);
            if (iT != -1 && iT <= 4) {
                int iN = (int) I28.n(this.f57792n, iT, false);
                if (this.nr.isLevel1Element(iN)) {
                    extractorInput.skipFully(iT);
                    return iN;
                }
            }
            extractorInput.skipFully(1);
        }
    }

    private double t(ExtractorInput extractorInput, int i2) throws IOException {
        long jNr = nr(extractorInput, i2);
        if (i2 == 4) {
            return Float.intBitsToFloat((int) jNr);
        }
        return Double.longBitsToDouble(jNr);
    }
}
