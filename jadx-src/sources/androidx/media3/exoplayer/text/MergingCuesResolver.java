package androidx.media3.exoplayer.text;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.iF;
import com.google.common.collect.nKK;
import java.util.ArrayList;
import java.util.List;
import t1.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class MergingCuesResolver implements CuesResolver {
    private static final iF CUES_DISPLAY_PRIORITY_COMPARATOR = iF.t().nr(new CN3() { // from class: androidx.media3.exoplayer.text.j
        @Override // t1.CN3
        public final Object apply(Object obj) {
            return Long.valueOf(((CuesWithTiming) obj).startTimeUs);
        }
    }).n(iF.t().O().nr(new CN3() { // from class: androidx.media3.exoplayer.text.n
        @Override // t1.CN3
        public final Object apply(Object obj) {
            return Long.valueOf(((CuesWithTiming) obj).durationUs);
        }
    }));
    private final List<CuesWithTiming> cuesWithTimingList = new ArrayList();

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j2) {
        int i2 = 0;
        while (i2 < this.cuesWithTimingList.size()) {
            long j3 = this.cuesWithTimingList.get(i2).startTimeUs;
            if (j2 > j3 && j2 > this.cuesWithTimingList.get(i2).endTimeUs) {
                this.cuesWithTimingList.remove(i2);
                i2--;
            } else if (j2 < j3) {
                return;
            }
            i2++;
        }
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public boolean addCues(CuesWithTiming cuesWithTiming, long j2) {
        Assertions.checkArgument(cuesWithTiming.startTimeUs != -9223372036854775807L);
        Assertions.checkArgument(cuesWithTiming.durationUs != -9223372036854775807L);
        boolean z2 = cuesWithTiming.startTimeUs <= j2 && j2 < cuesWithTiming.endTimeUs;
        for (int size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
            if (cuesWithTiming.startTimeUs >= this.cuesWithTimingList.get(size).startTimeUs) {
                this.cuesWithTimingList.add(size + 1, cuesWithTiming);
                return z2;
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
    public nKK getCuesAtTimeUs(long j2) {
        if (!this.cuesWithTimingList.isEmpty()) {
            if (j2 >= this.cuesWithTimingList.get(0).startTimeUs) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < this.cuesWithTimingList.size(); i2++) {
                    CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i2);
                    if (j2 >= cuesWithTiming.startTimeUs && j2 < cuesWithTiming.endTimeUs) {
                        arrayList.add(cuesWithTiming);
                    }
                    if (j2 < cuesWithTiming.startTimeUs) {
                        break;
                    }
                }
                nKK nkkNY = nKK.nY(CUES_DISPLAY_PRIORITY_COMPARATOR, arrayList);
                nKK.j jVarGh = nKK.gh();
                for (int i3 = 0; i3 < nkkNY.size(); i3++) {
                    jVarGh.mUb(((CuesWithTiming) nkkNY.get(i3)).cues);
                }
                return jVarGh.gh();
            }
        }
        return nKK.r();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j2) {
        if (this.cuesWithTimingList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j2 < this.cuesWithTimingList.get(0).startTimeUs) {
            return -9223372036854775807L;
        }
        long jMax = this.cuesWithTimingList.get(0).startTimeUs;
        for (int i2 = 0; i2 < this.cuesWithTimingList.size(); i2++) {
            long j3 = this.cuesWithTimingList.get(i2).startTimeUs;
            long j4 = this.cuesWithTimingList.get(i2).endTimeUs;
            if (j4 > j2) {
                if (j3 > j2) {
                    break;
                }
                jMax = Math.max(jMax, j3);
            } else {
                jMax = Math.max(jMax, j4);
            }
        }
        return jMax;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j2) {
        int i2 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            if (i2 >= this.cuesWithTimingList.size()) {
                break;
            }
            long j3 = this.cuesWithTimingList.get(i2).startTimeUs;
            long j4 = this.cuesWithTimingList.get(i2).endTimeUs;
            if (j2 < j3) {
                if (jMin == -9223372036854775807L) {
                    jMin = j3;
                } else {
                    jMin = Math.min(jMin, j3);
                }
            } else {
                if (j2 < j4) {
                    if (jMin == -9223372036854775807L) {
                        jMin = j4;
                    } else {
                        jMin = Math.min(jMin, j4);
                    }
                }
                i2++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }
}
