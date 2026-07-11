package androidx.media3.extractor.text;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.iF;
import com.google.common.collect.lej;
import com.google.common.collect.nKK;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t1.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@UnstableApi
public final class CuesWithTimingSubtitle implements Subtitle {
    private static final iF CUES_BY_START_TIME_ASCENDING = iF.t().nr(new CN3() { // from class: androidx.media3.extractor.text.n
        @Override // t1.CN3
        public final Object apply(Object obj) {
            return Long.valueOf(CuesWithTimingSubtitle.normalizeUnsetStartTimeToZero(((CuesWithTiming) obj).startTimeUs));
        }
    });
    private static final String TAG = "CuesWithTimingSubtitle";
    private final nKK eventCues;
    private final long[] eventTimesUs;

    private static long normalizeUnsetStartTimeToZero(long j2) {
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CuesWithTimingSubtitle(List<CuesWithTiming> list) {
        if (list.size() == 1) {
            CuesWithTiming cuesWithTiming = (CuesWithTiming) lej.Uo(list);
            long jNormalizeUnsetStartTimeToZero = normalizeUnsetStartTimeToZero(cuesWithTiming.startTimeUs);
            if (cuesWithTiming.durationUs == -9223372036854775807L) {
                this.eventCues = nKK.o(cuesWithTiming.cues);
                this.eventTimesUs = new long[]{jNormalizeUnsetStartTimeToZero};
                return;
            } else {
                this.eventCues = nKK.XQ(cuesWithTiming.cues, nKK.r());
                this.eventTimesUs = new long[]{jNormalizeUnsetStartTimeToZero, cuesWithTiming.durationUs + jNormalizeUnsetStartTimeToZero};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.eventTimesUs = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        nKK nkkNY = nKK.nY(CUES_BY_START_TIME_ASCENDING, list);
        int i2 = 0;
        for (int i3 = 0; i3 < nkkNY.size(); i3++) {
            CuesWithTiming cuesWithTiming2 = (CuesWithTiming) nkkNY.get(i3);
            long jNormalizeUnsetStartTimeToZero2 = normalizeUnsetStartTimeToZero(cuesWithTiming2.startTimeUs);
            long j2 = cuesWithTiming2.durationUs + jNormalizeUnsetStartTimeToZero2;
            if (i2 != 0) {
                int i5 = i2 - 1;
                long j3 = this.eventTimesUs[i5];
                if (j3 < jNormalizeUnsetStartTimeToZero2) {
                    this.eventTimesUs[i2] = jNormalizeUnsetStartTimeToZero2;
                    arrayList.add(cuesWithTiming2.cues);
                    i2++;
                } else if (j3 == jNormalizeUnsetStartTimeToZero2 && ((nKK) arrayList.get(i5)).isEmpty()) {
                    arrayList.set(i5, cuesWithTiming2.cues);
                } else {
                    Log.w(TAG, "Truncating unsupported overlapping cues.");
                    this.eventTimesUs[i5] = jNormalizeUnsetStartTimeToZero2;
                    arrayList.set(i5, cuesWithTiming2.cues);
                }
            }
            if (cuesWithTiming2.durationUs != -9223372036854775807L) {
                this.eventTimesUs[i2] = j2;
                arrayList.add(nKK.r());
                i2++;
            }
        }
        this.eventCues = nKK.ty(arrayList);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public nKK getCues(long j2) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.eventTimesUs, j2, true, false);
        return iBinarySearchFloor == -1 ? nKK.r() : (nKK) this.eventCues.get(iBinarySearchFloor);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i2) {
        Assertions.checkArgument(i2 < this.eventCues.size());
        return this.eventTimesUs[i2];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.eventCues.size();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j2) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j2, false, false);
        if (iBinarySearchCeil < this.eventCues.size()) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
