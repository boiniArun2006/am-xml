package com.google.android.exoplayer2.text.ssa;

import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class n implements Subtitle {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f58329n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f58330t;

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i2) {
        Assertions.checkArgument(i2 >= 0);
        Assertions.checkArgument(i2 < this.f58330t.size());
        return ((Long) this.f58330t.get(i2)).longValue();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List getCues(long j2) {
        int iBinarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super Long>>) this.f58330t, Long.valueOf(j2), true, false);
        return iBinarySearchFloor == -1 ? Collections.EMPTY_LIST : (List) this.f58329n.get(iBinarySearchFloor);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.f58330t.size();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j2) {
        int iBinarySearchCeil = Util.binarySearchCeil((List<? extends Comparable<? super Long>>) this.f58330t, Long.valueOf(j2), false, false);
        if (iBinarySearchCeil < this.f58330t.size()) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    public n(List list, List list2) {
        this.f58329n = list;
        this.f58330t = list2;
    }
}
