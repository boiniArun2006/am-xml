package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.SlidingPercentile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class SlidingPercentile {
    private static final int MAX_RECYCLED_SAMPLES = 5;
    private static final int SORT_ORDER_BY_INDEX = 1;
    private static final int SORT_ORDER_BY_VALUE = 0;
    private static final int SORT_ORDER_NONE = -1;
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private int totalWeight;
    private static final Comparator<n> INDEX_COMPARATOR = new Comparator() { // from class: com.google.android.exoplayer2.upstream.CN3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return SlidingPercentile.n((SlidingPercentile.n) obj, (SlidingPercentile.n) obj2);
        }
    };
    private static final Comparator<n> VALUE_COMPARATOR = new Comparator() { // from class: com.google.android.exoplayer2.upstream.fuX
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((SlidingPercentile.n) obj).f58434t, ((SlidingPercentile.n) obj2).f58434t);
        }
    };
    private final n[] recycledSamples = new n[5];
    private final ArrayList<n> samples = new ArrayList<>();
    private int currentSortOrder = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f58433n;
        public int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f58434t;

        private n() {
        }
    }

    private void ensureSortedByIndex() {
        if (this.currentSortOrder != 1) {
            Collections.sort(this.samples, INDEX_COMPARATOR);
            this.currentSortOrder = 1;
        }
    }

    private void ensureSortedByValue() {
        if (this.currentSortOrder != 0) {
            Collections.sort(this.samples, VALUE_COMPARATOR);
            this.currentSortOrder = 0;
        }
    }

    public static /* synthetic */ int n(n nVar, n nVar2) {
        return nVar.f58433n - nVar2.f58433n;
    }

    public void reset() {
        this.samples.clear();
        this.currentSortOrder = -1;
        this.nextSampleIndex = 0;
        this.totalWeight = 0;
    }

    public SlidingPercentile(int i2) {
        this.maxWeight = i2;
    }

    public void addSample(int i2, float f3) {
        n nVar;
        ensureSortedByIndex();
        int i3 = this.recycledSampleCount;
        if (i3 > 0) {
            n[] nVarArr = this.recycledSamples;
            int i5 = i3 - 1;
            this.recycledSampleCount = i5;
            nVar = nVarArr[i5];
        } else {
            nVar = new n();
        }
        int i7 = this.nextSampleIndex;
        this.nextSampleIndex = i7 + 1;
        nVar.f58433n = i7;
        nVar.rl = i2;
        nVar.f58434t = f3;
        this.samples.add(nVar);
        this.totalWeight += i2;
        while (true) {
            int i8 = this.totalWeight;
            int i9 = this.maxWeight;
            if (i8 > i9) {
                int i10 = i8 - i9;
                n nVar2 = this.samples.get(0);
                int i11 = nVar2.rl;
                if (i11 <= i10) {
                    this.totalWeight -= i11;
                    this.samples.remove(0);
                    int i12 = this.recycledSampleCount;
                    if (i12 < 5) {
                        n[] nVarArr2 = this.recycledSamples;
                        this.recycledSampleCount = i12 + 1;
                        nVarArr2[i12] = nVar2;
                    }
                } else {
                    nVar2.rl = i11 - i10;
                    this.totalWeight -= i10;
                }
            } else {
                return;
            }
        }
    }

    public float getPercentile(float f3) {
        ensureSortedByValue();
        float f4 = f3 * this.totalWeight;
        int i2 = 0;
        for (int i3 = 0; i3 < this.samples.size(); i3++) {
            n nVar = this.samples.get(i3);
            i2 += nVar.rl;
            if (i2 >= f4) {
                return nVar.f58434t;
            }
        }
        if (this.samples.isEmpty()) {
            return Float.NaN;
        }
        return this.samples.get(r5.size() - 1).f58434t;
    }
}
