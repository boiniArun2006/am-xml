package com.google.android.exoplayer2.analytics;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.PlaybackSessionManager;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {
    public static final t1.UGc DEFAULT_SESSION_ID_GENERATOR = new t1.UGc() { // from class: com.google.android.exoplayer2.analytics.RzR
        @Override // t1.UGc
        public final Object get() {
            return DefaultPlaybackSessionManager.generateDefaultSessionId();
        }
    };
    private static final Random RANDOM = new Random();
    private static final int SESSION_ID_LENGTH = 12;

    @Nullable
    private String currentSessionId;
    private Timeline currentTimeline;
    private PlaybackSessionManager.Listener listener;
    private final Timeline.Period period;
    private final t1.UGc sessionIdGenerator;
    private final HashMap<String, j> sessions;
    private final Timeline.Window window;

    private final class j {
        private boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f57527O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f57528n;
        private MediaSource.MediaPeriodId nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f57529t;

        public boolean xMQ(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (mediaPeriodId == null) {
                return i2 == this.rl;
            }
            MediaSource.MediaPeriodId mediaPeriodId2 = this.nr;
            return mediaPeriodId2 == null ? !mediaPeriodId.isAd() && mediaPeriodId.windowSequenceNumber == this.f57529t : mediaPeriodId.windowSequenceNumber == mediaPeriodId2.windowSequenceNumber && mediaPeriodId.adGroupIndex == mediaPeriodId2.adGroupIndex && mediaPeriodId.adIndexInAdGroup == mediaPeriodId2.adIndexInAdGroup;
        }

        public j(String str, int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            this.f57528n = str;
            this.rl = i2;
            this.f57529t = mediaPeriodId == null ? -1L : mediaPeriodId.windowSequenceNumber;
            if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
                return;
            }
            this.nr = mediaPeriodId;
        }

        public boolean az(Timeline timeline, Timeline timeline2) {
            int iQie = qie(timeline, timeline2, this.rl);
            this.rl = iQie;
            if (iQie == -1) {
                return false;
            }
            MediaSource.MediaPeriodId mediaPeriodId = this.nr;
            return mediaPeriodId == null || timeline2.getIndexOfPeriod(mediaPeriodId.periodUid) != -1;
        }

        public void gh(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (this.f57529t == -1 && i2 == this.rl && mediaPeriodId != null) {
                this.f57529t = mediaPeriodId.windowSequenceNumber;
            }
        }

        public boolean mUb(AnalyticsListener.EventTime eventTime) {
            long j2 = this.f57529t;
            if (j2 == -1) {
                return false;
            }
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId == null) {
                return this.rl != eventTime.windowIndex;
            }
            if (mediaPeriodId.windowSequenceNumber > j2) {
                return true;
            }
            if (this.nr == null) {
                return false;
            }
            int indexOfPeriod = eventTime.timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
            int indexOfPeriod2 = eventTime.timeline.getIndexOfPeriod(this.nr.periodUid);
            MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
            if (mediaPeriodId2.windowSequenceNumber < this.nr.windowSequenceNumber || indexOfPeriod < indexOfPeriod2) {
                return false;
            }
            if (indexOfPeriod > indexOfPeriod2) {
                return true;
            }
            if (!mediaPeriodId2.isAd()) {
                int i2 = eventTime.mediaPeriodId.nextAdGroupIndex;
                return i2 == -1 || i2 > this.nr.adGroupIndex;
            }
            MediaSource.MediaPeriodId mediaPeriodId3 = eventTime.mediaPeriodId;
            int i3 = mediaPeriodId3.adGroupIndex;
            int i5 = mediaPeriodId3.adIndexInAdGroup;
            MediaSource.MediaPeriodId mediaPeriodId4 = this.nr;
            int i7 = mediaPeriodId4.adGroupIndex;
            return i3 > i7 || (i3 == i7 && i5 > mediaPeriodId4.adIndexInAdGroup);
        }

        private int qie(Timeline timeline, Timeline timeline2, int i2) {
            if (i2 >= timeline.getWindowCount()) {
                if (i2 >= timeline2.getWindowCount()) {
                    return -1;
                }
                return i2;
            }
            timeline.getWindow(i2, DefaultPlaybackSessionManager.this.window);
            for (int i3 = DefaultPlaybackSessionManager.this.window.firstPeriodIndex; i3 <= DefaultPlaybackSessionManager.this.window.lastPeriodIndex; i3++) {
                int indexOfPeriod = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i3));
                if (indexOfPeriod != -1) {
                    return timeline2.getPeriod(indexOfPeriod, DefaultPlaybackSessionManager.this.period).windowIndex;
                }
            }
            return -1;
        }
    }

    public DefaultPlaybackSessionManager() {
        this(DEFAULT_SESSION_ID_GENERATOR);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized boolean belongsToSession(AnalyticsListener.EventTime eventTime, String str) {
        j jVar = this.sessions.get(str);
        if (jVar == null) {
            return false;
        }
        jVar.gh(eventTime.windowIndex, eventTime.mediaPeriodId);
        return jVar.xMQ(eventTime.windowIndex, eventTime.mediaPeriodId);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void finishAllSessions(AnalyticsListener.EventTime eventTime) {
        PlaybackSessionManager.Listener listener;
        this.currentSessionId = null;
        Iterator<j> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            j next = it.next();
            it.remove();
            if (next.f57527O && (listener = this.listener) != null) {
                listener.onSessionFinished(eventTime, next.f57528n, false);
            }
        }
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    @Nullable
    public synchronized String getActiveSessionId() {
        return this.currentSessionId;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized String getSessionForMediaPeriodId(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        return getOrAddSession(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId).f57528n;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithDiscontinuity(AnalyticsListener.EventTime eventTime, int i2) {
        try {
            Assertions.checkNotNull(this.listener);
            boolean z2 = i2 == 0;
            Iterator<j> it = this.sessions.values().iterator();
            while (it.hasNext()) {
                j next = it.next();
                if (next.mUb(eventTime)) {
                    it.remove();
                    if (next.f57527O) {
                        boolean zEquals = next.f57528n.equals(this.currentSessionId);
                        boolean z3 = z2 && zEquals && next.J2;
                        if (zEquals) {
                            this.currentSessionId = null;
                        }
                        this.listener.onSessionFinished(eventTime, next.f57528n, z3);
                    }
                }
            }
            updateCurrentSession(eventTime);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithTimelineChange(AnalyticsListener.EventTime eventTime) {
        try {
            Assertions.checkNotNull(this.listener);
            Timeline timeline = this.currentTimeline;
            this.currentTimeline = eventTime.timeline;
            Iterator<j> it = this.sessions.values().iterator();
            while (it.hasNext()) {
                j next = it.next();
                if (!next.az(timeline, this.currentTimeline) || next.mUb(eventTime)) {
                    it.remove();
                    if (next.f57527O) {
                        if (next.f57528n.equals(this.currentSessionId)) {
                            this.currentSessionId = null;
                        }
                        this.listener.onSessionFinished(eventTime, next.f57528n, false);
                    }
                }
            }
            updateCurrentSession(eventTime);
        } catch (Throwable th) {
            throw th;
        }
    }

    public DefaultPlaybackSessionManager(t1.UGc uGc) {
        this.sessionIdGenerator = uGc;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.sessions = new HashMap<>();
        this.currentTimeline = Timeline.EMPTY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateDefaultSessionId() {
        byte[] bArr = new byte[12];
        RANDOM.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private j getOrAddSession(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        j jVar = null;
        long j2 = Long.MAX_VALUE;
        for (j jVar2 : this.sessions.values()) {
            jVar2.gh(i2, mediaPeriodId);
            if (jVar2.xMQ(i2, mediaPeriodId)) {
                long j3 = jVar2.f57529t;
                if (j3 == -1 || j3 < j2) {
                    jVar = jVar2;
                    j2 = j3;
                } else if (j3 == j2 && ((j) Util.castNonNull(jVar)).nr != null && jVar2.nr != null) {
                    jVar = jVar2;
                }
            }
        }
        if (jVar != null) {
            return jVar;
        }
        String str = (String) this.sessionIdGenerator.get();
        j jVar3 = new j(str, i2, mediaPeriodId);
        this.sessions.put(str, jVar3);
        return jVar3;
    }

    private void updateCurrentSession(AnalyticsListener.EventTime eventTime) {
        if (eventTime.timeline.isEmpty()) {
            this.currentSessionId = null;
            return;
        }
        j jVar = this.sessions.get(this.currentSessionId);
        j orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
        this.currentSessionId = orAddSession.f57528n;
        updateSessions(eventTime);
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
            return;
        }
        if (jVar != null && jVar.f57529t == eventTime.mediaPeriodId.windowSequenceNumber && jVar.nr != null && jVar.nr.adGroupIndex == eventTime.mediaPeriodId.adGroupIndex && jVar.nr.adIndexInAdGroup == eventTime.mediaPeriodId.adIndexInAdGroup) {
            return;
        }
        MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
        this.listener.onAdPlaybackStarted(eventTime, getOrAddSession(eventTime.windowIndex, new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber)).f57528n, orAddSession.f57528n);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public void setListener(PlaybackSessionManager.Listener listener) {
        this.listener = listener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r22.mediaPeriodId.windowSequenceNumber < r2.f57529t) goto L21;
     */
    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void updateSessions(AnalyticsListener.EventTime eventTime) {
        try {
            Assertions.checkNotNull(this.listener);
            if (eventTime.timeline.isEmpty()) {
                return;
            }
            j jVar = this.sessions.get(this.currentSessionId);
            if (eventTime.mediaPeriodId != null && jVar != null) {
                if (jVar.f57529t == -1) {
                    if (jVar.rl != eventTime.windowIndex) {
                        return;
                    }
                }
            }
            j orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
            if (this.currentSessionId == null) {
                this.currentSessionId = orAddSession.f57528n;
            }
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId != null && mediaPeriodId.isAd()) {
                MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
                MediaSource.MediaPeriodId mediaPeriodId3 = new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber, mediaPeriodId2.adGroupIndex);
                j orAddSession2 = getOrAddSession(eventTime.windowIndex, mediaPeriodId3);
                if (!orAddSession2.f57527O) {
                    orAddSession2.f57527O = true;
                    eventTime.timeline.getPeriodByUid(eventTime.mediaPeriodId.periodUid, this.period);
                    this.listener.onSessionCreated(new AnalyticsListener.EventTime(eventTime.realtimeMs, eventTime.timeline, eventTime.windowIndex, mediaPeriodId3, Math.max(0L, Util.usToMs(this.period.getAdGroupTimeUs(eventTime.mediaPeriodId.adGroupIndex)) + this.period.getPositionInWindowMs()), eventTime.currentTimeline, eventTime.currentWindowIndex, eventTime.currentMediaPeriodId, eventTime.currentPlaybackPositionMs, eventTime.totalBufferedDurationMs), orAddSession2.f57528n);
                }
            }
            if (!orAddSession.f57527O) {
                orAddSession.f57527O = true;
                this.listener.onSessionCreated(eventTime, orAddSession.f57528n);
            }
            if (orAddSession.f57528n.equals(this.currentSessionId) && !orAddSession.J2) {
                orAddSession.J2 = true;
                this.listener.onSessionActive(eventTime, orAddSession.f57528n);
            }
        } finally {
        }
    }
}
