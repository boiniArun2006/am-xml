package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class DefaultExtractorInput implements ExtractorInput {
    private static final int PEEK_MAX_FREE_SPACE = 524288;
    private static final int PEEK_MIN_FREE_SPACE_AFTER_RESIZE = 65536;
    private static final int SCRATCH_SPACE_SIZE = 4096;
    private final DataReader dataReader;
    private int peekBufferLength;
    private int peekBufferPosition;
    private long position;
    private final long streamLength;
    private byte[] peekBuffer = new byte[65536];
    private final byte[] scratchSpace = new byte[4096];

    private void commitBytesRead(int i2) {
        if (i2 != -1) {
            this.position += (long) i2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean advancePeekPosition(int i2, boolean z2) throws IOException {
        ensureSpaceForPeek(i2);
        int fromUpstream = this.peekBufferLength - this.peekBufferPosition;
        while (fromUpstream < i2) {
            int i3 = i2;
            boolean z3 = z2;
            fromUpstream = readFromUpstream(this.peekBuffer, this.peekBufferPosition, i3, fromUpstream, z3);
            if (fromUpstream == -1) {
                return false;
            }
            this.peekBufferLength = this.peekBufferPosition + fromUpstream;
            i2 = i3;
            z2 = z3;
        }
        this.peekBufferPosition += i2;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean peekFully(byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        if (!advancePeekPosition(i3, z2)) {
            return false;
        }
        System.arraycopy(this.peekBuffer, this.peekBufferPosition - i3, bArr, i2, i3);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean readFully(byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        int fromPeekBuffer = readFromPeekBuffer(bArr, i2, i3);
        while (fromPeekBuffer < i3 && fromPeekBuffer != -1) {
            fromPeekBuffer = readFromUpstream(bArr, i2, i3, fromPeekBuffer, z2);
        }
        commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void resetPeekPosition() {
        this.peekBufferPosition = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean skipFully(int i2, boolean z2) throws IOException {
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i2);
        while (iSkipFromPeekBuffer < i2 && iSkipFromPeekBuffer != -1) {
            iSkipFromPeekBuffer = readFromUpstream(this.scratchSpace, -iSkipFromPeekBuffer, Math.min(i2, this.scratchSpace.length + iSkipFromPeekBuffer), iSkipFromPeekBuffer, z2);
        }
        commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer != -1;
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.extractor");
    }

    private void ensureSpaceForPeek(int i2) {
        int i3 = this.peekBufferPosition + i2;
        byte[] bArr = this.peekBuffer;
        if (i3 > bArr.length) {
            this.peekBuffer = Arrays.copyOf(this.peekBuffer, Util.constrainValue(bArr.length * 2, 65536 + i3, i3 + PEEK_MAX_FREE_SPACE));
        }
    }

    private int readFromPeekBuffer(byte[] bArr, int i2, int i3) {
        int i5 = this.peekBufferLength;
        if (i5 == 0) {
            return 0;
        }
        int iMin = Math.min(i5, i3);
        System.arraycopy(this.peekBuffer, 0, bArr, i2, iMin);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private int skipFromPeekBuffer(int i2) {
        int iMin = Math.min(this.peekBufferLength, i2);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private void updatePeekBuffer(int i2) {
        int i3 = this.peekBufferLength - i2;
        this.peekBufferLength = i3;
        this.peekBufferPosition = 0;
        byte[] bArr = this.peekBuffer;
        byte[] bArr2 = i3 < bArr.length - PEEK_MAX_FREE_SPACE ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.peekBuffer = bArr2;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
        return this.streamLength;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.position + ((long) this.peekBufferPosition);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
        return this.position;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j2, E e2) throws Throwable {
        Assertions.checkArgument(j2 >= 0);
        this.position = j2;
        throw e2;
    }

    public DefaultExtractorInput(DataReader dataReader, long j2, long j3) {
        this.dataReader = dataReader;
        this.position = j2;
        this.streamLength = j3;
    }

    private int readFromUpstream(byte[] bArr, int i2, int i3, int i5, boolean z2) throws IOException {
        if (!Thread.interrupted()) {
            int i7 = this.dataReader.read(bArr, i2 + i5, i3 - i5);
            if (i7 == -1) {
                if (i5 == 0 && z2) {
                    return -1;
                }
                throw new EOFException();
            }
            return i5 + i7;
        }
        throw new InterruptedIOException();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int peek(byte[] bArr, int i2, int i3) throws IOException {
        DefaultExtractorInput defaultExtractorInput;
        int iMin;
        ensureSpaceForPeek(i3);
        int i5 = this.peekBufferLength;
        int i7 = this.peekBufferPosition;
        int i8 = i5 - i7;
        if (i8 == 0) {
            defaultExtractorInput = this;
            iMin = defaultExtractorInput.readFromUpstream(this.peekBuffer, i7, i3, 0, true);
            if (iMin == -1) {
                return -1;
            }
            defaultExtractorInput.peekBufferLength += iMin;
        } else {
            defaultExtractorInput = this;
            iMin = Math.min(i3, i8);
        }
        System.arraycopy(defaultExtractorInput.peekBuffer, defaultExtractorInput.peekBufferPosition, bArr, i2, iMin);
        defaultExtractorInput.peekBufferPosition += iMin;
        return iMin;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void peekFully(byte[] bArr, int i2, int i3) throws IOException {
        peekFully(bArr, i2, i3, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int fromPeekBuffer = readFromPeekBuffer(bArr, i2, i3);
        if (fromPeekBuffer == 0) {
            fromPeekBuffer = readFromUpstream(bArr, i2, i3, 0, true);
        }
        commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int skip(int i2) throws IOException {
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i2);
        if (iSkipFromPeekBuffer == 0) {
            byte[] bArr = this.scratchSpace;
            iSkipFromPeekBuffer = readFromUpstream(bArr, 0, Math.min(i2, bArr.length), 0, true);
        }
        commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i2, int i3) throws IOException {
        readFully(bArr, i2, i3, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void skipFully(int i2) throws IOException {
        skipFully(i2, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void advancePeekPosition(int i2) throws IOException {
        advancePeekPosition(i2, false);
    }
}
