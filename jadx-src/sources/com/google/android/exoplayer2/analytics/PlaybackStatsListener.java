package com.google.android.exoplayer2.analytics;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.PlaybackSessionManager;
import com.google.android.exoplayer2.analytics.PlaybackStats;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class PlaybackStatsListener implements AnalyticsListener, PlaybackSessionManager.Listener {

    @Nullable
    private Format audioFormat;
    private long bandwidthBytes;
    private long bandwidthTimeMs;

    @Nullable
    private final Callback callback;
    private long discontinuityFromPositionMs;

    @Nullable
    private String discontinuityFromSession;
    private int discontinuityReason;
    private int droppedFrames;
    private PlaybackStats finishedPlaybackStats;
    private final boolean keepHistory;

    @Nullable
    private Exception nonFatalException;
    private final Timeline.Period period;
    private final Map<String, j> playbackStatsTrackers;
    private final PlaybackSessionManager sessionManager;
    private final Map<String, AnalyticsListener.EventTime> sessionStartEventTimes;

    @Nullable
    private Format videoFormat;
    private VideoSize videoSize;

    public interface Callback {
        void onPlaybackStatsReady(AnalyticsListener.EventTime eventTime, PlaybackStats playbackStats);
    }

    private static final class j {
        private long E2;
        private int HI;
        private int Ik;
        private final List J2;
        private final List KN;
        private float M7;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private long f57552N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final List f57553O;
        private long P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private long f57554S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private int f57555T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        private long f57556U;
        private final List Uo;
        private long ViF;
        private long WPU;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private int f57557X;
        private long XQ;
        private Format Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private long f57558Z;
        private long aYN;
        private boolean az;
        private long bzg;
        private int ck;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f57559e;
        private long fD;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f57560g;
        private boolean gh;
        private long iF;
        private Format jB;
        private long mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f57561n;
        private boolean nHg;
        private long nY;
        private final List nr;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f57562o;
        private boolean qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f57563r;
        private boolean rV9;
        private final long[] rl = new long[16];
        private boolean s7N;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final List f57564t;
        private long te;
        private int ty;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f57565v;
        private boolean wTp;
        private final boolean xMQ;

        private static boolean J2(int i2) {
            return i2 == 6 || i2 == 7 || i2 == 10;
        }

        private static boolean O(int i2) {
            return i2 == 3 || i2 == 4 || i2 == 9;
        }

        private void gh(long j2, long j3) {
            if (this.f57561n) {
                if (this.f57555T != 3) {
                    if (j3 == -9223372036854775807L) {
                        return;
                    }
                    if (!this.nr.isEmpty()) {
                        List list = this.nr;
                        long j4 = ((long[]) list.get(list.size() - 1))[1];
                        if (j4 != j3) {
                            this.nr.add(new long[]{j2, j4});
                        }
                    }
                }
                if (j3 != -9223372036854775807L) {
                    this.nr.add(new long[]{j2, j3});
                } else {
                    if (this.nr.isEmpty()) {
                        return;
                    }
                    this.nr.add(rl(j2));
                }
            }
        }

        private static boolean nr(int i2) {
            return i2 == 4 || i2 == 7;
        }

        private static boolean t(int i2, int i3) {
            return ((i2 != 1 && i2 != 2 && i2 != 14) || i3 == 1 || i3 == 2 || i3 == 14 || i3 == 3 || i3 == 4 || i3 == 9 || i3 == 11) ? false : true;
        }

        public void HI() {
            this.s7N = true;
        }

        public void az(Player player, AnalyticsListener.EventTime eventTime, boolean z2, long j2, boolean z3, int i2, boolean z4, boolean z5, PlaybackException playbackException, Exception exc, long j3, long j4, Format format, Format format2, VideoSize videoSize) {
            if (j2 != -9223372036854775807L) {
                gh(eventTime.realtimeMs, j2);
                this.nHg = true;
            }
            if (player.getPlaybackState() != 2) {
                this.nHg = false;
            }
            int playbackState = player.getPlaybackState();
            if (playbackState == 1 || playbackState == 4 || z3) {
                this.wTp = false;
            }
            if (playbackException != null) {
                this.f57565v = true;
                this.f57559e++;
                if (this.f57561n) {
                    this.Uo.add(new PlaybackStats.EventTimeAndException(eventTime, playbackException));
                }
            } else if (player.getPlayerError() == null) {
                this.f57565v = false;
            }
            if (this.s7N && !this.wTp) {
                Tracks currentTracks = player.getCurrentTracks();
                if (!currentTracks.isTypeSelected(2)) {
                    qie(eventTime, null);
                }
                if (!currentTracks.isTypeSelected(1)) {
                    xMQ(eventTime, null);
                }
            }
            if (format != null) {
                qie(eventTime, format);
            }
            if (format2 != null) {
                xMQ(eventTime, format2);
            }
            Format format3 = this.Xw;
            if (format3 != null && format3.height == -1 && videoSize != null) {
                qie(eventTime, format3.buildUpon().setWidth(videoSize.width).setHeight(videoSize.height).build());
            }
            if (z5) {
                this.rV9 = true;
            }
            if (z4) {
                this.E2++;
            }
            this.fD += (long) i2;
            this.te += j3;
            this.iF += j4;
            if (exc != null) {
                this.f57557X++;
                if (this.f57561n) {
                    this.KN.add(new PlaybackStats.EventTimeAndException(eventTime, exc));
                }
            }
            int iIk = Ik(player);
            float f3 = player.getPlaybackParameters().speed;
            if (this.f57555T != iIk || this.M7 != f3) {
                gh(eventTime.realtimeMs, z2 ? eventTime.eventPlaybackPositionMs : -9223372036854775807L);
                KN(eventTime.realtimeMs);
                Uo(eventTime.realtimeMs);
            }
            this.M7 = f3;
            if (this.f57555T != iIk) {
                r(iIk, eventTime);
            }
        }

        public void ck() {
            this.wTp = true;
            this.nHg = false;
        }

        private void KN(long j2) {
            Format format;
            if (this.f57555T == 3 && (format = this.Xw) != null) {
                long j3 = (long) ((j2 - this.f57556U) * this.M7);
                int i2 = format.height;
                if (i2 != -1) {
                    this.f57554S += j3;
                    this.WPU += ((long) i2) * j3;
                }
                int i3 = format.bitrate;
                if (i3 != -1) {
                    this.aYN += j3;
                    this.ViF += j3 * ((long) i3);
                }
            }
            this.f57556U = j2;
        }

        private void Uo(long j2) {
            Format format;
            int i2;
            if (this.f57555T == 3 && (format = this.jB) != null && (i2 = format.bitrate) != -1) {
                long j3 = (long) ((j2 - this.P5) * this.M7);
                this.nY += j3;
                this.f57560g += j3 * ((long) i2);
            }
            this.P5 = j2;
        }

        private void mUb(long j2) {
            if (J2(this.f57555T)) {
                long j3 = j2 - this.bzg;
                long j4 = this.f57563r;
                if (j4 == -9223372036854775807L || j3 > j4) {
                    this.f57563r = j3;
                }
            }
        }

        private void qie(AnalyticsListener.EventTime eventTime, Format format) {
            int i2;
            int i3;
            if (Util.areEqual(this.Xw, format)) {
                return;
            }
            KN(eventTime.realtimeMs);
            if (format != null) {
                if (this.f57562o == -1 && (i3 = format.height) != -1) {
                    this.f57562o = i3;
                }
                if (this.f57558Z == -1 && (i2 = format.bitrate) != -1) {
                    this.f57558Z = i2;
                }
            }
            this.Xw = format;
            if (this.f57561n) {
                this.f57553O.add(new PlaybackStats.EventTimeAndFormat(eventTime, format));
            }
        }

        private void r(int i2, AnalyticsListener.EventTime eventTime) {
            Assertions.checkArgument(eventTime.realtimeMs >= this.f57552N);
            long j2 = eventTime.realtimeMs;
            long j3 = j2 - this.f57552N;
            long[] jArr = this.rl;
            int i3 = this.f57555T;
            jArr[i3] = jArr[i3] + j3;
            if (this.mUb == -9223372036854775807L) {
                this.mUb = j2;
            }
            this.az |= t(i3, i2);
            this.gh |= O(i2);
            this.qie |= i2 == 11;
            if (!nr(this.f57555T) && nr(i2)) {
                this.ty++;
            }
            if (i2 == 5) {
                this.ck++;
            }
            if (!J2(this.f57555T) && J2(i2)) {
                this.Ik++;
                this.bzg = eventTime.realtimeMs;
            }
            if (J2(this.f57555T) && this.f57555T != 7 && i2 == 7) {
                this.HI++;
            }
            mUb(eventTime.realtimeMs);
            this.f57555T = i2;
            this.f57552N = eventTime.realtimeMs;
            if (this.f57561n) {
                this.f57564t.add(new PlaybackStats.EventTimeAndPlaybackState(eventTime, i2));
            }
        }

        private long[] rl(long j2) {
            List list = this.nr;
            return new long[]{j2, ((long[]) list.get(list.size() - 1))[1] + ((long) ((j2 - r0[0]) * this.M7))};
        }

        private void xMQ(AnalyticsListener.EventTime eventTime, Format format) {
            int i2;
            if (Util.areEqual(this.jB, format)) {
                return;
            }
            Uo(eventTime.realtimeMs);
            if (format != null && this.XQ == -1 && (i2 = format.bitrate) != -1) {
                this.XQ = i2;
            }
            this.jB = format;
            if (this.f57561n) {
                this.J2.add(new PlaybackStats.EventTimeAndFormat(eventTime, format));
            }
        }

        public PlaybackStats n(boolean z2) {
            long[] jArr;
            List list;
            long[] jArr2 = this.rl;
            List list2 = this.nr;
            if (z2) {
                jArr = jArr2;
                list = list2;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long[] jArrCopyOf = Arrays.copyOf(this.rl, 16);
                long jMax = Math.max(0L, jElapsedRealtime - this.f57552N);
                int i2 = this.f57555T;
                jArrCopyOf[i2] = jArrCopyOf[i2] + jMax;
                mUb(jElapsedRealtime);
                KN(jElapsedRealtime);
                Uo(jElapsedRealtime);
                ArrayList arrayList = new ArrayList(this.nr);
                if (this.f57561n && this.f57555T == 3) {
                    arrayList.add(rl(jElapsedRealtime));
                }
                jArr = jArrCopyOf;
                list = arrayList;
            }
            int i3 = (this.az || !this.gh) ? 1 : 0;
            long j2 = i3 != 0 ? -9223372036854775807L : jArr[2];
            int i5 = jArr[1] > 0 ? 1 : 0;
            List arrayList2 = z2 ? this.f57553O : new ArrayList(this.f57553O);
            List arrayList3 = z2 ? this.J2 : new ArrayList(this.J2);
            List arrayList4 = z2 ? this.f57564t : new ArrayList(this.f57564t);
            long j3 = this.mUb;
            boolean z3 = this.s7N;
            int i7 = !this.gh ? 1 : 0;
            boolean z4 = this.qie;
            int i8 = i3 ^ 1;
            int i9 = this.ty;
            int i10 = this.HI;
            int i11 = this.ck;
            int i12 = this.Ik;
            long j4 = this.f57563r;
            boolean z5 = this.xMQ;
            long j5 = this.f57554S;
            long j6 = this.WPU;
            long j7 = this.aYN;
            long j9 = this.ViF;
            long j10 = this.nY;
            long j11 = this.f57560g;
            int i13 = this.f57562o;
            int i14 = i13 == -1 ? 0 : 1;
            long j12 = this.f57558Z;
            int i15 = j12 == -1 ? 0 : 1;
            long j13 = this.XQ;
            int i16 = j13 == -1 ? 0 : 1;
            long j14 = this.te;
            long j15 = this.iF;
            long j16 = this.fD;
            long j17 = this.E2;
            int i17 = this.f57559e;
            return new PlaybackStats(1, jArr, arrayList4, list, j3, z3 ? 1 : 0, i7, z4 ? 1 : 0, i5, j2, i8, i9, i10, i11, i12, j4, z5 ? 1 : 0, arrayList2, arrayList3, j5, j6, j7, j9, j10, j11, i14, i15, i13, j12, i16, j13, j14, j15, j16, j17, i17 > 0 ? 1 : 0, i17, this.f57557X, this.Uo, this.KN);
        }

        public void ty(AnalyticsListener.EventTime eventTime, boolean z2, long j2) {
            int i2 = 11;
            if (this.f57555T != 11 && !z2) {
                i2 = 15;
            }
            gh(eventTime.realtimeMs, j2);
            KN(eventTime.realtimeMs);
            Uo(eventTime.realtimeMs);
            r(i2, eventTime);
        }

        public j(boolean z2, AnalyticsListener.EventTime eventTime) {
            List arrayList;
            List arrayList2;
            List arrayList3;
            List arrayList4;
            List arrayList5;
            List arrayList6;
            this.f57561n = z2;
            if (z2) {
                arrayList = new ArrayList();
            } else {
                arrayList = Collections.EMPTY_LIST;
            }
            this.f57564t = arrayList;
            if (z2) {
                arrayList2 = new ArrayList();
            } else {
                arrayList2 = Collections.EMPTY_LIST;
            }
            this.nr = arrayList2;
            if (z2) {
                arrayList3 = new ArrayList();
            } else {
                arrayList3 = Collections.EMPTY_LIST;
            }
            this.f57553O = arrayList3;
            if (z2) {
                arrayList4 = new ArrayList();
            } else {
                arrayList4 = Collections.EMPTY_LIST;
            }
            this.J2 = arrayList4;
            if (z2) {
                arrayList5 = new ArrayList();
            } else {
                arrayList5 = Collections.EMPTY_LIST;
            }
            this.Uo = arrayList5;
            if (z2) {
                arrayList6 = new ArrayList();
            } else {
                arrayList6 = Collections.EMPTY_LIST;
            }
            this.KN = arrayList6;
            boolean z3 = false;
            this.f57555T = 0;
            this.f57552N = eventTime.realtimeMs;
            this.mUb = -9223372036854775807L;
            this.f57563r = -9223372036854775807L;
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId != null && mediaPeriodId.isAd()) {
                z3 = true;
            }
            this.xMQ = z3;
            this.XQ = -1L;
            this.f57558Z = -1L;
            this.f57562o = -1;
            this.M7 = 1.0f;
        }

        private int Ik(Player player) {
            int playbackState = player.getPlaybackState();
            if (this.nHg && this.s7N) {
                return 5;
            }
            if (this.f57565v) {
                return 13;
            }
            if (!this.s7N) {
                return this.rV9 ? 1 : 0;
            }
            if (this.wTp) {
                return 14;
            }
            if (playbackState == 4) {
                return 11;
            }
            if (playbackState == 2) {
                int i2 = this.f57555T;
                if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 14) {
                    return 2;
                }
                if (!player.getPlayWhenReady()) {
                    return 7;
                }
                if (player.getPlaybackSuppressionReason() != 0) {
                    return 10;
                }
                return 6;
            }
            if (playbackState == 3) {
                if (!player.getPlayWhenReady()) {
                    return 4;
                }
                if (player.getPlaybackSuppressionReason() == 0) {
                    return 3;
                }
                return 9;
            }
            if (playbackState == 1 && this.f57555T != 0) {
                return 12;
            }
            return this.f57555T;
        }
    }

    private void maybeAddSessions(AnalyticsListener.Events events) {
        for (int i2 = 0; i2 < events.size(); i2++) {
            int i3 = events.get(i2);
            AnalyticsListener.EventTime eventTime = events.getEventTime(i3);
            if (i3 == 0) {
                this.sessionManager.updateSessionsWithTimelineChange(eventTime);
            } else if (i3 == 11) {
                this.sessionManager.updateSessionsWithDiscontinuity(eventTime, this.discontinuityReason);
            } else {
                this.sessionManager.updateSessions(eventTime);
            }
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i2, long j2, long j3) {
        this.bandwidthTimeMs = i2;
        this.bandwidthBytes = j2;
    }

    private Pair<AnalyticsListener.EventTime, Boolean> findBestEventTime(AnalyticsListener.Events events, String str) {
        MediaSource.MediaPeriodId mediaPeriodId;
        AnalyticsListener.EventTime eventTime = null;
        boolean zBelongsToSession = false;
        for (int i2 = 0; i2 < events.size(); i2++) {
            AnalyticsListener.EventTime eventTime2 = events.getEventTime(events.get(i2));
            boolean zBelongsToSession2 = this.sessionManager.belongsToSession(eventTime2, str);
            if (eventTime == null || ((zBelongsToSession2 && !zBelongsToSession) || (zBelongsToSession2 == zBelongsToSession && eventTime2.realtimeMs > eventTime.realtimeMs))) {
                eventTime = eventTime2;
                zBelongsToSession = zBelongsToSession2;
            }
        }
        Assertions.checkNotNull(eventTime);
        if (!zBelongsToSession && (mediaPeriodId = eventTime.mediaPeriodId) != null && mediaPeriodId.isAd()) {
            long adGroupTimeUs = eventTime.timeline.getPeriodByUid(eventTime.mediaPeriodId.periodUid, this.period).getAdGroupTimeUs(eventTime.mediaPeriodId.adGroupIndex);
            if (adGroupTimeUs == Long.MIN_VALUE) {
                adGroupTimeUs = this.period.durationUs;
            }
            long positionInWindowUs = adGroupTimeUs + this.period.getPositionInWindowUs();
            long j2 = eventTime.realtimeMs;
            Timeline timeline = eventTime.timeline;
            int i3 = eventTime.windowIndex;
            MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
            AnalyticsListener.EventTime eventTime3 = new AnalyticsListener.EventTime(j2, timeline, i3, new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber, mediaPeriodId2.adGroupIndex), Util.usToMs(positionInWindowUs), eventTime.timeline, eventTime.currentWindowIndex, eventTime.currentMediaPeriodId, eventTime.currentPlaybackPositionMs, eventTime.totalBufferedDurationMs);
            zBelongsToSession = this.sessionManager.belongsToSession(eventTime3, str);
            eventTime = eventTime3;
        }
        return Pair.create(eventTime, Boolean.valueOf(zBelongsToSession));
    }

    public PlaybackStats getCombinedPlaybackStats() {
        int i2 = 1;
        PlaybackStats[] playbackStatsArr = new PlaybackStats[this.playbackStatsTrackers.size() + 1];
        playbackStatsArr[0] = this.finishedPlaybackStats;
        Iterator<j> it = this.playbackStatsTrackers.values().iterator();
        while (it.hasNext()) {
            playbackStatsArr[i2] = it.next().n(false);
            i2++;
        }
        return PlaybackStats.merge(playbackStatsArr);
    }

    @Nullable
    public PlaybackStats getPlaybackStats() {
        String activeSessionId = this.sessionManager.getActiveSessionId();
        j jVar = activeSessionId == null ? null : this.playbackStatsTrackers.get(activeSessionId);
        if (jVar == null) {
            return null;
        }
        return jVar.n(false);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onAdPlaybackStarted(AnalyticsListener.EventTime eventTime, String str, String str2) {
        ((j) Assertions.checkNotNull(this.playbackStatsTrackers.get(str))).ck();
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        int i2 = mediaLoadData.trackType;
        if (i2 == 2 || i2 == 0) {
            this.videoFormat = mediaLoadData.trackFormat;
        } else if (i2 == 1) {
            this.audioFormat = mediaLoadData.trackFormat;
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        this.nonFatalException = exc;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i2, long j2) {
        this.droppedFrames = i2;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onEvents(Player player, AnalyticsListener.Events events) {
        if (events.size() == 0) {
            return;
        }
        maybeAddSessions(events);
        Iterator<String> it = this.playbackStatsTrackers.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Pair<AnalyticsListener.EventTime, Boolean> pairFindBestEventTime = findBestEventTime(events, next);
            j jVar = this.playbackStatsTrackers.get(next);
            boolean zHasEvent = hasEvent(events, next, 11);
            boolean zHasEvent2 = hasEvent(events, next, 1018);
            boolean zHasEvent3 = hasEvent(events, next, 1011);
            boolean zHasEvent4 = hasEvent(events, next, 1000);
            boolean zHasEvent5 = hasEvent(events, next, 10);
            boolean z2 = hasEvent(events, next, 1003) || hasEvent(events, next, 1024);
            boolean zHasEvent6 = hasEvent(events, next, 1006);
            boolean zHasEvent7 = hasEvent(events, next, 1004);
            boolean zHasEvent8 = hasEvent(events, next, 25);
            Iterator<String> it2 = it;
            jVar.az(player, (AnalyticsListener.EventTime) pairFindBestEventTime.first, ((Boolean) pairFindBestEventTime.second).booleanValue(), next.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : -9223372036854775807L, zHasEvent, zHasEvent2 ? this.droppedFrames : 0, zHasEvent3, zHasEvent4, zHasEvent5 ? player.getPlayerError() : null, z2 ? this.nonFatalException : null, zHasEvent6 ? this.bandwidthTimeMs : 0L, zHasEvent6 ? this.bandwidthBytes : 0L, zHasEvent7 ? this.videoFormat : null, zHasEvent7 ? this.audioFormat : null, zHasEvent8 ? this.videoSize : null);
            it = it2;
        }
        this.videoFormat = null;
        this.audioFormat = null;
        this.discontinuityFromSession = null;
        if (events.contains(1028)) {
            this.sessionManager.finishAllSessions(events.getEventTime(1028));
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
        this.nonFatalException = iOException;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        if (this.discontinuityFromSession == null) {
            this.discontinuityFromSession = this.sessionManager.getActiveSessionId();
            this.discontinuityFromPositionMs = positionInfo.positionMs;
        }
        this.discontinuityReason = i2;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionActive(AnalyticsListener.EventTime eventTime, String str) {
        ((j) Assertions.checkNotNull(this.playbackStatsTrackers.get(str))).HI();
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionCreated(AnalyticsListener.EventTime eventTime, String str) {
        this.playbackStatsTrackers.put(str, new j(this.keepHistory, eventTime));
        this.sessionStartEventTimes.put(str, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionFinished(AnalyticsListener.EventTime eventTime, String str, boolean z2) {
        j jVar = (j) Assertions.checkNotNull(this.playbackStatsTrackers.remove(str));
        AnalyticsListener.EventTime eventTime2 = (AnalyticsListener.EventTime) Assertions.checkNotNull(this.sessionStartEventTimes.remove(str));
        jVar.ty(eventTime, z2, str.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : -9223372036854775807L);
        PlaybackStats playbackStatsN = jVar.n(true);
        this.finishedPlaybackStats = PlaybackStats.merge(this.finishedPlaybackStats, playbackStatsN);
        Callback callback = this.callback;
        if (callback != null) {
            callback.onPlaybackStatsReady(eventTime2, playbackStatsN);
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        this.videoSize = videoSize;
    }

    public PlaybackStatsListener(boolean z2, @Nullable Callback callback) {
        this.callback = callback;
        this.keepHistory = z2;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = new DefaultPlaybackSessionManager();
        this.sessionManager = defaultPlaybackSessionManager;
        this.playbackStatsTrackers = new HashMap();
        this.sessionStartEventTimes = new HashMap();
        this.finishedPlaybackStats = PlaybackStats.EMPTY;
        this.period = new Timeline.Period();
        this.videoSize = VideoSize.UNKNOWN;
        defaultPlaybackSessionManager.setListener(this);
    }

    private boolean hasEvent(AnalyticsListener.Events events, String str, int i2) {
        if (events.contains(i2) && this.sessionManager.belongsToSession(events.getEventTime(i2), str)) {
            return true;
        }
        return false;
    }
}
