package com.google.android.exoplayer2.source.mediaparser;

import android.media.MediaParser$SeekableInputReader;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RequiresApi
public final class InputReaderAdapterV30 implements MediaParser$SeekableInputReader {
    private long currentPosition;

    @Nullable
    private DataReader dataReader;
    private long lastSeekPosition;
    private long resourceLength;

    public long getAndResetSeekPosition() {
        long j2 = this.lastSeekPosition;
        this.lastSeekPosition = -1L;
        return j2;
    }

    public long getLength() {
        return this.resourceLength;
    }

    public long getPosition() {
        return this.currentPosition;
    }

    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i5 = ((DataReader) Util.castNonNull(this.dataReader)).read(bArr, i2, i3);
        this.currentPosition += (long) i5;
        return i5;
    }

    public void seekToPosition(long j2) {
        this.lastSeekPosition = j2;
    }

    public void setCurrentPosition(long j2) {
        this.currentPosition = j2;
    }

    public void setDataReader(DataReader dataReader, long j2) {
        this.dataReader = dataReader;
        this.resourceLength = j2;
        this.lastSeekPosition = -1L;
    }
}
