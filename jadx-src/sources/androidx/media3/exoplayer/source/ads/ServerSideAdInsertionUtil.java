package androidx.media3.exoplayer.source.ads;

import androidx.annotation.CheckResult;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@UnstableApi
public final class ServerSideAdInsertionUtil {
    @CheckResult
    public static AdPlaybackState addAdGroupToAdPlaybackState(AdPlaybackState adPlaybackState, long j2, long j3, long... jArr) {
        long mediaPeriodPositionUsForContent = getMediaPeriodPositionUsForContent(j2, -1, adPlaybackState);
        int i2 = adPlaybackState.removedAdGroupCount;
        while (i2 < adPlaybackState.adGroupCount && adPlaybackState.getAdGroup(i2).timeUs != Long.MIN_VALUE && adPlaybackState.getAdGroup(i2).timeUs <= mediaPeriodPositionUsForContent) {
            i2++;
        }
        AdPlaybackState adPlaybackStateWithContentResumeOffsetUs = adPlaybackState.withNewAdGroup(i2, mediaPeriodPositionUsForContent).withIsServerSideInserted(i2, true).withAdCount(i2, jArr.length).withAdDurationsUs(i2, jArr).withContentResumeOffsetUs(i2, j3);
        AdPlaybackState adPlaybackStateWithSkippedAd = adPlaybackStateWithContentResumeOffsetUs;
        for (int i3 = 0; i3 < jArr.length && jArr[i3] == 0; i3++) {
            adPlaybackStateWithSkippedAd = adPlaybackStateWithSkippedAd.withSkippedAd(i2, i3);
        }
        return correctFollowingAdGroupTimes(adPlaybackStateWithSkippedAd, i2, Util.sum(jArr), j3);
    }

    private static AdPlaybackState correctFollowingAdGroupTimes(AdPlaybackState adPlaybackState, int i2, long j2, long j3) {
        long j4 = (-j2) + j3;
        while (true) {
            i2++;
            if (i2 >= adPlaybackState.adGroupCount) {
                return adPlaybackState;
            }
            long j5 = adPlaybackState.getAdGroup(i2).timeUs;
            if (j5 != Long.MIN_VALUE) {
                adPlaybackState = adPlaybackState.withAdGroupTimeUs(i2, j5 + j4);
            }
        }
    }

    public static long getMediaPeriodPositionUsForContent(long j2, int i2, AdPlaybackState adPlaybackState) {
        if (i2 == -1) {
            i2 = adPlaybackState.adGroupCount;
        }
        long j3 = 0;
        for (int i3 = adPlaybackState.removedAdGroupCount; i3 < i2; i3++) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i3);
            long j4 = adGroup.timeUs;
            if (j4 == Long.MIN_VALUE || j4 > j2 - j3) {
                break;
            }
            for (int i5 = 0; i5 < getAdCountInGroup(adPlaybackState, i3); i5++) {
                j3 += adGroup.durationsUs[i5];
            }
            long j5 = adGroup.contentResumeOffsetUs;
            j3 -= j5;
            long j6 = adGroup.timeUs;
            long j7 = j2 - j3;
            if (j5 + j6 > j7) {
                return Math.max(j6, j7);
            }
        }
        return j2 - j3;
    }

    public static long getStreamPositionUs(Player player, AdPlaybackState adPlaybackState) {
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -9223372036854775807L;
        }
        Timeline.Period period = currentTimeline.getPeriod(player.getCurrentPeriodIndex(), new Timeline.Period());
        if (!Objects.equals(period.getAdsId(), adPlaybackState.adsId)) {
            return -9223372036854775807L;
        }
        if (!player.isPlayingAd()) {
            return getStreamPositionUsForContent(Util.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs(), -1, adPlaybackState);
        }
        return getStreamPositionUsForAd(Util.msToUs(player.getCurrentPosition()), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adPlaybackState);
    }

    public static long getStreamPositionUsForContent(long j2, int i2, AdPlaybackState adPlaybackState) {
        if (i2 == -1) {
            i2 = adPlaybackState.adGroupCount;
        }
        long j3 = 0;
        for (int i3 = adPlaybackState.removedAdGroupCount; i3 < i2; i3++) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i3);
            long j4 = adGroup.timeUs;
            if (j4 == Long.MIN_VALUE || j4 > j2) {
                break;
            }
            long j5 = j4 + j3;
            for (int i5 = 0; i5 < getAdCountInGroup(adPlaybackState, i3); i5++) {
                j3 += adGroup.durationsUs[i5];
            }
            long j6 = adGroup.contentResumeOffsetUs;
            j3 -= j6;
            if (adGroup.timeUs + j6 > j2) {
                return Math.max(j5, j2 + j3);
            }
        }
        return j2 + j3;
    }

    private ServerSideAdInsertionUtil() {
    }

    public static int getAdCountInGroup(AdPlaybackState adPlaybackState, int i2) {
        int i3 = adPlaybackState.getAdGroup(i2).count;
        if (i3 == -1) {
            return 0;
        }
        return i3;
    }

    public static long getMediaPeriodPositionUs(long j2, MediaSource.MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
        if (mediaPeriodId.isAd()) {
            return getMediaPeriodPositionUsForAd(j2, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState);
        }
        return getMediaPeriodPositionUsForContent(j2, mediaPeriodId.nextAdGroupIndex, adPlaybackState);
    }

    public static long getMediaPeriodPositionUsForAd(long j2, int i2, int i3, AdPlaybackState adPlaybackState) {
        int i5;
        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i2);
        long j3 = j2 - adGroup.timeUs;
        int i7 = adPlaybackState.removedAdGroupCount;
        while (true) {
            i5 = 0;
            if (i7 >= i2) {
                break;
            }
            AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(i7);
            while (i5 < getAdCountInGroup(adPlaybackState, i7)) {
                j3 -= adGroup2.durationsUs[i5];
                i5++;
            }
            j3 += adGroup2.contentResumeOffsetUs;
            i7++;
        }
        if (i3 < getAdCountInGroup(adPlaybackState, i2)) {
            while (i5 < i3) {
                j3 -= adGroup.durationsUs[i5];
                i5++;
            }
        }
        return j3;
    }

    public static long getStreamPositionUsForAd(long j2, int i2, int i3, AdPlaybackState adPlaybackState) {
        int i5;
        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i2);
        long j3 = j2 + adGroup.timeUs;
        int i7 = adPlaybackState.removedAdGroupCount;
        while (true) {
            i5 = 0;
            if (i7 >= i2) {
                break;
            }
            AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(i7);
            while (i5 < getAdCountInGroup(adPlaybackState, i7)) {
                j3 += adGroup2.durationsUs[i5];
                i5++;
            }
            j3 -= adGroup2.contentResumeOffsetUs;
            i7++;
        }
        if (i3 < getAdCountInGroup(adPlaybackState, i2)) {
            while (i5 < i3) {
                j3 += adGroup.durationsUs[i5];
                i5++;
            }
        }
        return j3;
    }

    public static long getStreamPositionUs(long j2, MediaSource.MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
        if (mediaPeriodId.isAd()) {
            return getStreamPositionUsForAd(j2, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState);
        }
        return getStreamPositionUsForContent(j2, mediaPeriodId.nextAdGroupIndex, adPlaybackState);
    }
}
