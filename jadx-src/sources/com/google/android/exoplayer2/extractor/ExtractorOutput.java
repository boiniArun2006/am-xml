package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface ExtractorOutput {
    public static final ExtractorOutput PLACEHOLDER = new j();

    class j implements ExtractorOutput {
        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void endTracks() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public TrackOutput track(int i2, int i3) {
            throw new UnsupportedOperationException();
        }

        j() {
        }
    }

    void endTracks();

    void seekMap(SeekMap seekMap);

    TrackOutput track(int i2, int i3);
}
