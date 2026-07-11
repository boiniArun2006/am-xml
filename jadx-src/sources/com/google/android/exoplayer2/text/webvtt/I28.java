package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class I28 implements Subtitle {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long[] f58357O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f58358n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long[] f58359t;

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i2) {
        Assertions.checkArgument(i2 >= 0);
        Assertions.checkArgument(i2 < this.f58357O.length);
        return this.f58357O[i2];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List getCues(long j2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.f58358n.size(); i2++) {
            long[] jArr = this.f58359t;
            int i3 = i2 * 2;
            if (jArr[i3] <= j2 && j2 < jArr[i3 + 1]) {
                WebvttCueInfo webvttCueInfo = (WebvttCueInfo) this.f58358n.get(i2);
                Cue cue = webvttCueInfo.cue;
                if (cue.line == -3.4028235E38f) {
                    arrayList2.add(webvttCueInfo);
                } else {
                    arrayList.add(cue);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.exoplayer2.text.webvtt.Ml
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((WebvttCueInfo) obj).startTimeUs, ((WebvttCueInfo) obj2).startTimeUs);
            }
        });
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            arrayList.add(((WebvttCueInfo) arrayList2.get(i5)).cue.buildUpon().setLine((-1) - i5, 1).build());
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.f58357O.length;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j2) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.f58357O, j2, false, false);
        if (iBinarySearchCeil < this.f58357O.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    public I28(List list) {
        this.f58358n = Collections.unmodifiableList(new ArrayList(list));
        this.f58359t = new long[list.size() * 2];
        for (int i2 = 0; i2 < list.size(); i2++) {
            WebvttCueInfo webvttCueInfo = (WebvttCueInfo) list.get(i2);
            int i3 = i2 * 2;
            long[] jArr = this.f58359t;
            jArr[i3] = webvttCueInfo.startTimeUs;
            jArr[i3 + 1] = webvttCueInfo.endTimeUs;
        }
        long[] jArr2 = this.f58359t;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f58357O = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }
}
