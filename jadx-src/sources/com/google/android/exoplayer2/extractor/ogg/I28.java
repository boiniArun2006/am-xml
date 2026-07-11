package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
interface I28 {
    SeekMap createSeekMap();

    long read(ExtractorInput extractorInput);

    void startSeek(long j2);
}
