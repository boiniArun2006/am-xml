package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class h6y extends AbstractConcatenatedTimeline {
    private final int[] J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int[] f57934O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final HashMap f57935Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f57936n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object[] f57937o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Timeline[] f57938r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f57939t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6y(Collection collection, ShuffleOrder shuffleOrder) {
        super(false, shuffleOrder);
        int windowCount = 0;
        int size = collection.size();
        this.f57934O = new int[size];
        this.J2 = new int[size];
        this.f57938r = new Timeline[size];
        this.f57937o = new Object[size];
        this.f57935Z = new HashMap();
        Iterator it = collection.iterator();
        int periodCount = 0;
        int i2 = 0;
        while (it.hasNext()) {
            CM cm = (CM) it.next();
            this.f57938r[i2] = cm.getTimeline();
            this.J2[i2] = windowCount;
            this.f57934O[i2] = periodCount;
            windowCount += this.f57938r[i2].getWindowCount();
            periodCount += this.f57938r[i2].getPeriodCount();
            this.f57937o[i2] = cm.getUid();
            this.f57935Z.put(this.f57937o[i2], Integer.valueOf(i2));
            i2++;
        }
        this.f57936n = windowCount;
        this.f57939t = periodCount;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected int getChildIndexByChildUid(Object obj) {
        Integer num = (Integer) this.f57935Z.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected int getChildIndexByPeriodIndex(int i2) {
        return Util.binarySearchFloor(this.f57934O, i2 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected int getChildIndexByWindowIndex(int i2) {
        return Util.binarySearchFloor(this.J2, i2 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected Object getChildUidByChildIndex(int i2) {
        return this.f57937o[i2];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected int getFirstPeriodIndexByChildIndex(int i2) {
        return this.f57934O[i2];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected int getFirstWindowIndexByChildIndex(int i2) {
        return this.J2[i2];
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
        return this.f57939t;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected Timeline getTimelineByChildIndex(int i2) {
        return this.f57938r[i2];
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
        return this.f57936n;
    }

    List rl() {
        return Arrays.asList(this.f57938r);
    }
}
