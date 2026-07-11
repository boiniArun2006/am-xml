package androidx.media3.exoplayer.text;

import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.nKK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
interface CuesResolver {
    boolean addCues(CuesWithTiming cuesWithTiming, long j2);

    void clear();

    void discardCuesBeforeTimeUs(long j2);

    nKK getCuesAtTimeUs(long j2);

    long getNextCueChangeTimeUs(long j2);

    long getPreviousCueChangeTimeUs(long j2);
}
