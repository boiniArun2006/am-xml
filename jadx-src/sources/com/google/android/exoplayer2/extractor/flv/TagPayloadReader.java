package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
abstract class TagPayloadReader {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final TrackOutput f57775n;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    protected abstract boolean rl(ParsableByteArray parsableByteArray);

    protected abstract boolean t(ParsableByteArray parsableByteArray, long j2);

    protected TagPayloadReader(TrackOutput trackOutput) {
        this.f57775n = trackOutput;
    }

    public final boolean n(ParsableByteArray parsableByteArray, long j2) {
        if (rl(parsableByteArray) && t(parsableByteArray, j2)) {
            return true;
        }
        return false;
    }
}
