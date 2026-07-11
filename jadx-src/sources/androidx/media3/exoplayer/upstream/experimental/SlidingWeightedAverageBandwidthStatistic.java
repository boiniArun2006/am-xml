package androidx.media3.exoplayer.upstream.experimental;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@UnstableApi
public class SlidingWeightedAverageBandwidthStatistic implements BandwidthStatistic {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    private double bitrateWeightProductSum;
    private final Clock clock;
    private final SampleEvictionFunction sampleEvictionFunction;
    private final ArrayDeque<Sample> samples;
    private double weightSum;

    public interface SampleEvictionFunction {
        boolean shouldEvictSample(Deque<Sample> deque);
    }

    public SlidingWeightedAverageBandwidthStatistic() {
        this(getMaxCountEvictionFunction(10L));
    }

    public static SampleEvictionFunction getAgeBasedEvictionFunction(long j2) {
        return getAgeBasedEvictionFunction(j2, Clock.DEFAULT);
    }

    public static class Sample {
        public final long bitrate;
        public final long timeAddedMs;
        public final double weight;

        public Sample(long j2, double d2, long j3) {
            this.bitrate = j2;
            this.weight = d2;
            this.timeAddedMs = j3;
        }
    }

    public SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction sampleEvictionFunction) {
        this(sampleEvictionFunction, Clock.DEFAULT);
    }

    @VisibleForTesting
    static SampleEvictionFunction getAgeBasedEvictionFunction(final long j2, final Clock clock) {
        return new SampleEvictionFunction() { // from class: androidx.media3.exoplayer.upstream.experimental.n
            @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
            public final boolean shouldEvictSample(Deque deque) {
                return SlidingWeightedAverageBandwidthStatistic.n(j2, clock, deque);
            }
        };
    }

    public static SampleEvictionFunction getMaxCountEvictionFunction(final long j2) {
        return new SampleEvictionFunction() { // from class: androidx.media3.exoplayer.upstream.experimental.w6
            @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
            public final boolean shouldEvictSample(Deque deque) {
                return SlidingWeightedAverageBandwidthStatistic.rl(j2, deque);
            }
        };
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j2, long j3) {
        while (this.sampleEvictionFunction.shouldEvictSample(this.samples)) {
            Sample sampleRemove = this.samples.remove();
            double d2 = this.bitrateWeightProductSum;
            double d4 = sampleRemove.bitrate;
            double d5 = sampleRemove.weight;
            this.bitrateWeightProductSum = d2 - (d4 * d5);
            this.weightSum -= d5;
        }
        Sample sample = new Sample((j2 * 8000000) / j3, Math.sqrt(j2), this.clock.elapsedRealtime());
        this.samples.add(sample);
        double d6 = this.bitrateWeightProductSum;
        double d7 = sample.bitrate;
        double d8 = sample.weight;
        this.bitrateWeightProductSum = d6 + (d7 * d8);
        this.weightSum += d8;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        if (this.samples.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.bitrateWeightProductSum / this.weightSum);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.samples.clear();
        this.bitrateWeightProductSum = 0.0d;
        this.weightSum = 0.0d;
    }

    @VisibleForTesting
    SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction sampleEvictionFunction, Clock clock) {
        this.samples = new ArrayDeque<>();
        this.sampleEvictionFunction = sampleEvictionFunction;
        this.clock = clock;
    }

    public static /* synthetic */ boolean n(long j2, Clock clock, Deque deque) {
        if (!deque.isEmpty() && ((Sample) Util.castNonNull((Sample) deque.peek())).timeAddedMs + j2 < clock.elapsedRealtime()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean rl(long j2, Deque deque) {
        if (deque.size() >= j2) {
            return true;
        }
        return false;
    }
}
