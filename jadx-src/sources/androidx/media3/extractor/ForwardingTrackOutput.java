package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@UnstableApi
public class ForwardingTrackOutput implements TrackOutput {
    private final TrackOutput trackOutput;

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i2, boolean z2) throws IOException {
        return this.trackOutput.sampleData(dataReader, i2, z2);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void durationUs(long j2) {
        this.trackOutput.durationUs(j2);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void format(Format format) {
        this.trackOutput.format(format);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i2) {
        this.trackOutput.sampleData(parsableByteArray, i2);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleMetadata(long j2, int i2, int i3, int i5, @Nullable TrackOutput.CryptoData cryptoData) {
        this.trackOutput.sampleMetadata(j2, i2, i3, i5, cryptoData);
    }

    public ForwardingTrackOutput(TrackOutput trackOutput) {
        this.trackOutput = trackOutput;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i2, boolean z2, int i3) throws IOException {
        return this.trackOutput.sampleData(dataReader, i2, z2, i3);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i2, int i3) {
        this.trackOutput.sampleData(parsableByteArray, i2, i3);
    }
}
