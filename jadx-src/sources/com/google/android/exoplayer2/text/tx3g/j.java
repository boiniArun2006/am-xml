package com.google.android.exoplayer2.text.tx3g;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class j implements Subtitle {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f58355t = new j();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f58356n;

    public j(Cue cue) {
        this.f58356n = Collections.singletonList(cue);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j2) {
        return j2 < 0 ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List getCues(long j2) {
        return j2 >= 0 ? this.f58356n : Collections.EMPTY_LIST;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i2) {
        Assertions.checkArgument(i2 == 0);
        return 0L;
    }

    private j() {
        this.f58356n = Collections.EMPTY_LIST;
    }
}
