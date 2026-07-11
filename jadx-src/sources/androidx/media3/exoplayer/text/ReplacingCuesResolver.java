package androidx.media3.exoplayer.text;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.lej;
import com.google.common.collect.nKK;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class ReplacingCuesResolver implements CuesResolver {
    private final ArrayList<CuesWithTiming> cuesWithTimingList = new ArrayList<>();

    private int getIndexOfCuesStartingAfter(long j2) {
        for (int i2 = 0; i2 < this.cuesWithTimingList.size(); i2++) {
            if (j2 < this.cuesWithTimingList.get(i2).startTimeUs) {
                return i2;
            }
        }
        return this.cuesWithTimingList.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean addCues(CuesWithTiming cuesWithTiming, long j2) {
        boolean z2;
        Assertions.checkArgument(cuesWithTiming.startTimeUs != -9223372036854775807L);
        if (cuesWithTiming.startTimeUs <= j2) {
            long j3 = cuesWithTiming.endTimeUs;
            z2 = j3 == -9223372036854775807L || j2 < j3;
        }
        for (int size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
            if (cuesWithTiming.startTimeUs >= this.cuesWithTimingList.get(size).startTimeUs) {
                this.cuesWithTimingList.add(size + 1, cuesWithTiming);
                return z2;
            }
            if (this.cuesWithTimingList.get(size).startTimeUs <= j2) {
                z2 = false;
            }
        }
        this.cuesWithTimingList.add(0, cuesWithTiming);
        return z2;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j2) {
        if (this.cuesWithTimingList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j2 < this.cuesWithTimingList.get(0).startTimeUs) {
            return this.cuesWithTimingList.get(0).startTimeUs;
        }
        for (int i2 = 1; i2 < this.cuesWithTimingList.size(); i2++) {
            CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i2);
            if (j2 < cuesWithTiming.startTimeUs) {
                long j3 = this.cuesWithTimingList.get(i2 - 1).endTimeUs;
                return (j3 == -9223372036854775807L || j3 <= j2 || j3 >= cuesWithTiming.startTimeUs) ? cuesWithTiming.startTimeUs : j3;
            }
        }
        long j4 = ((CuesWithTiming) lej.nr(this.cuesWithTimingList)).endTimeUs;
        if (j4 == -9223372036854775807L || j2 >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j2) {
        if (this.cuesWithTimingList.isEmpty() || j2 < this.cuesWithTimingList.get(0).startTimeUs) {
            return -9223372036854775807L;
        }
        for (int i2 = 1; i2 < this.cuesWithTimingList.size(); i2++) {
            long j3 = this.cuesWithTimingList.get(i2).startTimeUs;
            if (j2 == j3) {
                return j3;
            }
            if (j2 < j3) {
                CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i2 - 1);
                long j4 = cuesWithTiming.endTimeUs;
                return (j4 == -9223372036854775807L || j4 > j2) ? cuesWithTiming.startTimeUs : j4;
            }
        }
        CuesWithTiming cuesWithTiming2 = (CuesWithTiming) lej.nr(this.cuesWithTimingList);
        long j5 = cuesWithTiming2.endTimeUs;
        return (j5 == -9223372036854775807L || j2 < j5) ? cuesWithTiming2.startTimeUs : j5;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j2) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j2);
        if (indexOfCuesStartingAfter == 0) {
            return;
        }
        long j3 = this.cuesWithTimingList.get(indexOfCuesStartingAfter - 1).endTimeUs;
        if (j3 == -9223372036854775807L || j3 >= j2) {
            indexOfCuesStartingAfter--;
        }
        this.cuesWithTimingList.subList(0, indexOfCuesStartingAfter).clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public nKK getCuesAtTimeUs(long j2) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j2);
        if (indexOfCuesStartingAfter == 0) {
            return nKK.r();
        }
        CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(indexOfCuesStartingAfter - 1);
        long j3 = cuesWithTiming.endTimeUs;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            return nKK.r();
        }
        return cuesWithTiming.cues;
    }
}
