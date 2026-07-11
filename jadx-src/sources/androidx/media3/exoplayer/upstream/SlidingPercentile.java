package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.upstream.SlidingPercentile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@UnstableApi
public class SlidingPercentile {
    private static final int MAX_RECYCLED_SAMPLES = 5;
    private static final int SORT_ORDER_BY_INDEX = 1;
    private static final int SORT_ORDER_BY_VALUE = 0;
    private static final int SORT_ORDER_NONE = -1;
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private int totalWeight;
    private static final Comparator<Sample> INDEX_COMPARATOR = new Comparator() { // from class: androidx.media3.exoplayer.upstream.I28
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return SlidingPercentile.rl((SlidingPercentile.Sample) obj, (SlidingPercentile.Sample) obj2);
        }
    };
    private static final Comparator<Sample> VALUE_COMPARATOR = new Comparator() { // from class: androidx.media3.exoplayer.upstream.Wre
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((SlidingPercentile.Sample) obj).value, ((SlidingPercentile.Sample) obj2).value);
        }
    };
    private final Sample[] recycledSamples = new Sample[5];
    private final ArrayList<Sample> samples = new ArrayList<>();
    private int currentSortOrder = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class Sample {
        public int index;
        public float value;
        public int weight;

        private Sample() {
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

    public static /* synthetic */ int rl(Sample sample, Sample sample2) {
        return sample.index - sample2.index;
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
        Sample sample;
        ensureSortedByIndex();
        int i3 = this.recycledSampleCount;
        if (i3 > 0) {
            Sample[] sampleArr = this.recycledSamples;
            int i5 = i3 - 1;
            this.recycledSampleCount = i5;
            sample = sampleArr[i5];
        } else {
            sample = new Sample();
        }
        int i7 = this.nextSampleIndex;
        this.nextSampleIndex = i7 + 1;
        sample.index = i7;
        sample.weight = i2;
        sample.value = f3;
        this.samples.add(sample);
        this.totalWeight += i2;
        while (true) {
            int i8 = this.totalWeight;
            int i9 = this.maxWeight;
            if (i8 > i9) {
                int i10 = i8 - i9;
                Sample sample2 = this.samples.get(0);
                int i11 = sample2.weight;
                if (i11 <= i10) {
                    this.totalWeight -= i11;
                    this.samples.remove(0);
                    int i12 = this.recycledSampleCount;
                    if (i12 < 5) {
                        Sample[] sampleArr2 = this.recycledSamples;
                        this.recycledSampleCount = i12 + 1;
                        sampleArr2[i12] = sample2;
                    }
                } else {
                    sample2.weight = i11 - i10;
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
            Sample sample = this.samples.get(i3);
            i2 += sample.weight;
            if (i2 >= f4) {
                return sample.value;
            }
        }
        if (this.samples.isEmpty()) {
            return Float.NaN;
        }
        return this.samples.get(r5.size() - 1).value;
    }
}
