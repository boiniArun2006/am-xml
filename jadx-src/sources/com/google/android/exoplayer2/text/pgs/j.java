package com.google.android.exoplayer2.text.pgs;

import com.google.android.exoplayer2.text.Subtitle;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class j implements Subtitle {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f58316n;

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i2) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j2) {
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List getCues(long j2) {
        return this.f58316n;
    }

    public j(List list) {
        this.f58316n = list;
    }
}
