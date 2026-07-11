package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@UnstableApi
public interface BandwidthStatistic {
    void addSample(long j2, long j3);

    long getBandwidthEstimate();

    void reset();
}
