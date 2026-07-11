package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class Ml {
    public long J2;
    public int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f57857O;
    public int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f57858n;
    public long nr;
    public int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f57859t;
    public int xMQ;
    public final int[] mUb = new int[255];
    private final ParsableByteArray gh = new ParsableByteArray(255);

    public void rl() {
        this.f57858n = 0;
        this.rl = 0;
        this.f57859t = 0L;
        this.nr = 0L;
        this.f57857O = 0L;
        this.J2 = 0L;
        this.Uo = 0;
        this.KN = 0;
        this.xMQ = 0;
    }

    public boolean t(ExtractorInput extractorInput) {
        return nr(extractorInput, -1L);
    }

    Ml() {
    }

    public boolean n(ExtractorInput extractorInput, boolean z2) throws ParserException {
        rl();
        this.gh.reset(27);
        if (!ExtractorUtil.peekFullyQuietly(extractorInput, this.gh.getData(), 0, 27, z2) || this.gh.readUnsignedInt() != 1332176723) {
            return false;
        }
        int unsignedByte = this.gh.readUnsignedByte();
        this.f57858n = unsignedByte;
        if (unsignedByte != 0) {
            if (z2) {
                return false;
            }
            throw ParserException.createForUnsupportedContainerFeature("unsupported bit stream revision");
        }
        this.rl = this.gh.readUnsignedByte();
        this.f57859t = this.gh.readLittleEndianLong();
        this.nr = this.gh.readLittleEndianUnsignedInt();
        this.f57857O = this.gh.readLittleEndianUnsignedInt();
        this.J2 = this.gh.readLittleEndianUnsignedInt();
        int unsignedByte2 = this.gh.readUnsignedByte();
        this.Uo = unsignedByte2;
        this.KN = unsignedByte2 + 27;
        this.gh.reset(unsignedByte2);
        if (!ExtractorUtil.peekFullyQuietly(extractorInput, this.gh.getData(), 0, this.Uo, z2)) {
            return false;
        }
        for (int i2 = 0; i2 < this.Uo; i2++) {
            this.mUb[i2] = this.gh.readUnsignedByte();
            this.xMQ += this.mUb[i2];
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r9.getPosition() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.skip(1) == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean nr(ExtractorInput extractorInput, long j2) throws IOException {
        boolean z2;
        if (extractorInput.getPosition() == extractorInput.getPeekPosition()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        this.gh.reset(4);
        while (true) {
            if ((j2 != -1 && extractorInput.getPosition() + 4 >= j2) || !ExtractorUtil.peekFullyQuietly(extractorInput, this.gh.getData(), 0, 4, true)) {
                break;
            }
            this.gh.setPosition(0);
            if (this.gh.readUnsignedInt() == 1332176723) {
                extractorInput.resetPeekPosition();
                return true;
            }
            extractorInput.skipFully(1);
        }
    }
}
