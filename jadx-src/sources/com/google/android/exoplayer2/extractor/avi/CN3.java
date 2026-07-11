package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class CN3 implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f57762n;

    @Override // com.google.android.exoplayer2.extractor.avi.j
    public int getType() {
        return 1852994675;
    }

    public static CN3 n(ParsableByteArray parsableByteArray) {
        return new CN3(parsableByteArray.readString(parsableByteArray.bytesLeft()));
    }

    private CN3(String str) {
        this.f57762n = str;
    }
}
