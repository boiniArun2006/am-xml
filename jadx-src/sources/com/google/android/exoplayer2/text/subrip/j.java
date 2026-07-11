package com.google.android.exoplayer2.text.subrip;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class j implements Subtitle {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Cue[] f58331n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long[] f58332t;

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i2) {
        Assertions.checkArgument(i2 >= 0);
        Assertions.checkArgument(i2 < this.f58332t.length);
        return this.f58332t[i2];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List getCues(long j2) {
        Cue cue;
        int iBinarySearchFloor = Util.binarySearchFloor(this.f58332t, j2, true, false);
        return (iBinarySearchFloor == -1 || (cue = this.f58331n[iBinarySearchFloor]) == Cue.EMPTY) ? Collections.EMPTY_LIST : Collections.singletonList(cue);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.f58332t.length;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j2) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.f58332t, j2, false, false);
        if (iBinarySearchCeil < this.f58332t.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    public j(Cue[] cueArr, long[] jArr) {
        this.f58331n = cueArr;
        this.f58332t = jArr;
    }
}
