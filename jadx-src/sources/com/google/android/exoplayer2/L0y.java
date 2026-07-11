package com.google.android.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import androidx.media3.exoplayer.MediaPeriodQueue;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.collect.nKK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class L0y {
    private int J2;
    private C1887t KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f57456O;
    private boolean Uo;
    private long az;
    private int gh;
    private C1887t mUb;
    private final Handler nr;
    private Object qie;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AnalyticsCollector f57458t;
    private C1887t xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Timeline.Period f57457n = new Timeline.Period();
    private final Timeline.Window rl = new Timeline.Window();

    private boolean nr(long j2, long j3) {
        return j2 == -9223372036854775807L || j2 == j3;
    }

    public boolean ViF(C1887t c1887t) {
        boolean z2 = false;
        Assertions.checkState(c1887t != null);
        if (c1887t.equals(this.mUb)) {
            return false;
        }
        this.mUb = c1887t;
        while (c1887t.mUb() != null) {
            c1887t = c1887t.mUb();
            if (c1887t == this.xMQ) {
                this.xMQ = this.KN;
                z2 = true;
            }
            c1887t.Z();
            this.gh--;
        }
        this.mUb.WPU(null);
        WPU();
        return z2;
    }

    private cA KN(T t3) {
        return gh(t3.f57507n, t3.rl, t3.f57510t, t3.f57508o);
    }

    private boolean O(cA cAVar, cA cAVar2) {
        return cAVar.rl == cAVar2.rl && cAVar.f57703n.equals(cAVar2.f57703n);
    }

    private boolean Z(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, boolean z2) {
        int indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        return !timeline.getWindow(timeline.getPeriod(indexOfPeriod, this.f57457n).windowIndex, this.rl).isDynamic && timeline.isLastPeriod(indexOfPeriod, this.f57457n, this.rl, this.J2, this.Uo) && z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private cA az(Timeline timeline, Object obj, long j2, long j3, long j4) {
        boolean z2;
        long j5;
        long adGroupTimeUs;
        long j6;
        long jMax = j2;
        timeline.getPeriodByUid(obj, this.f57457n);
        int adGroupIndexAfterPositionUs = this.f57457n.getAdGroupIndexAfterPositionUs(jMax);
        int i2 = 1;
        if (adGroupIndexAfterPositionUs == -1) {
            if (this.f57457n.getAdGroupCount() > 0) {
                Timeline.Period period = this.f57457n;
                z2 = period.isServerSideInsertedAdGroup(period.getRemovedAdGroupCount());
            }
        } else if (this.f57457n.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs)) {
            long adGroupTimeUs2 = this.f57457n.getAdGroupTimeUs(adGroupIndexAfterPositionUs);
            Timeline.Period period2 = this.f57457n;
            if (adGroupTimeUs2 == period2.durationUs && period2.hasPlayedAdGroup(adGroupIndexAfterPositionUs)) {
                z2 = true;
                adGroupIndexAfterPositionUs = -1;
            }
        }
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, j4, adGroupIndexAfterPositionUs);
        boolean zO = o(mediaPeriodId);
        boolean zXQ = XQ(timeline, mediaPeriodId);
        boolean Z2 = Z(timeline, mediaPeriodId, zO);
        boolean z3 = adGroupIndexAfterPositionUs != -1 && this.f57457n.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs);
        if (adGroupIndexAfterPositionUs != -1) {
            adGroupTimeUs = this.f57457n.getAdGroupTimeUs(adGroupIndexAfterPositionUs);
        } else {
            if (!z2) {
                j5 = -9223372036854775807L;
                j6 = (j5 != -9223372036854775807L || j5 == Long.MIN_VALUE) ? this.f57457n.durationUs : j5;
                if (j6 != -9223372036854775807L && jMax >= j6) {
                    if (!Z2 && z2) {
                        i2 = 0;
                    }
                    jMax = Math.max(0L, j6 - ((long) i2));
                }
                return new cA(mediaPeriodId, jMax, j3, j5, j6, z3, zO, zXQ, Z2);
            }
            adGroupTimeUs = this.f57457n.durationUs;
        }
        j5 = adGroupTimeUs;
        if (j5 != -9223372036854775807L) {
        }
        if (j6 != -9223372036854775807L) {
            if (!Z2) {
                i2 = 0;
            }
            jMax = Math.max(0L, j6 - ((long) i2));
        }
        return new cA(mediaPeriodId, jMax, j3, j5, j6, z3, zO, zXQ, Z2);
    }

    private boolean fD(Timeline timeline) {
        Timeline timeline2;
        C1887t c1887tMUb = this.KN;
        if (c1887tMUb == null) {
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(c1887tMUb.rl);
        while (true) {
            timeline2 = timeline;
            indexOfPeriod = timeline2.getNextPeriodIndex(indexOfPeriod, this.f57457n, this.rl, this.J2, this.Uo);
            while (c1887tMUb.mUb() != null && !c1887tMUb.J2.Uo) {
                c1887tMUb = c1887tMUb.mUb();
            }
            C1887t c1887tMUb2 = c1887tMUb.mUb();
            if (indexOfPeriod == -1 || c1887tMUb2 == null || timeline2.getIndexOfPeriod(c1887tMUb2.rl) != indexOfPeriod) {
                break;
            }
            c1887tMUb = c1887tMUb2;
            timeline = timeline2;
        }
        boolean zViF = ViF(c1887tMUb);
        c1887tMUb.J2 = r(timeline2, c1887tMUb.J2);
        return !zViF;
    }

    private cA gh(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j2, long j3) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.f57457n);
        return mediaPeriodId.isAd() ? qie(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, j2, mediaPeriodId.windowSequenceNumber) : az(timeline, mediaPeriodId.periodUid, j3, j2, mediaPeriodId.windowSequenceNumber);
    }

    private cA qie(Timeline timeline, Object obj, int i2, int i3, long j2, long j3) {
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, i2, i3, j3);
        long adDurationUs = timeline.getPeriodByUid(mediaPeriodId.periodUid, this.f57457n).getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        long adResumePositionUs = i3 == this.f57457n.getFirstAdIndexToPlay(i2) ? this.f57457n.getAdResumePositionUs() : 0L;
        boolean zIsServerSideInsertedAdGroup = this.f57457n.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
        if (adDurationUs != -9223372036854775807L && adResumePositionUs >= adDurationUs) {
            adResumePositionUs = Math.max(0L, adDurationUs - 1);
        }
        return new cA(mediaPeriodId, adResumePositionUs, j2, -9223372036854775807L, adDurationUs, zIsServerSideInsertedAdGroup, false, false, false);
    }

    private long te(Timeline timeline, Object obj) {
        int indexOfPeriod;
        int i2 = timeline.getPeriodByUid(obj, this.f57457n).windowIndex;
        Object obj2 = this.qie;
        if (obj2 != null && (indexOfPeriod = timeline.getIndexOfPeriod(obj2)) != -1 && timeline.getPeriod(indexOfPeriod, this.f57457n).windowIndex == i2) {
            return this.az;
        }
        for (C1887t c1887tMUb = this.KN; c1887tMUb != null; c1887tMUb = c1887tMUb.mUb()) {
            if (c1887tMUb.rl.equals(obj)) {
                return c1887tMUb.J2.f57703n.windowSequenceNumber;
            }
        }
        for (C1887t c1887tMUb2 = this.KN; c1887tMUb2 != null; c1887tMUb2 = c1887tMUb2.mUb()) {
            int indexOfPeriod2 = timeline.getIndexOfPeriod(c1887tMUb2.rl);
            if (indexOfPeriod2 != -1 && timeline.getPeriod(indexOfPeriod2, this.f57457n).windowIndex == i2) {
                return c1887tMUb2.J2.f57703n.windowSequenceNumber;
            }
        }
        long j2 = this.f57456O;
        this.f57456O = 1 + j2;
        if (this.KN == null) {
            this.qie = obj;
            this.az = j2;
        }
        return j2;
    }

    private long ty(Timeline timeline, Object obj, int i2) {
        timeline.getPeriodByUid(obj, this.f57457n);
        long adGroupTimeUs = this.f57457n.getAdGroupTimeUs(i2);
        return adGroupTimeUs == Long.MIN_VALUE ? this.f57457n.durationUs : adGroupTimeUs + this.f57457n.getContentResumeOffsetUs(i2);
    }

    private cA xMQ(Timeline timeline, C1887t c1887t, long j2) {
        Timeline timeline2;
        Object obj;
        long j3;
        cA cAVar = c1887t.J2;
        long jQie = (c1887t.qie() + cAVar.f57702O) - j2;
        boolean z2 = false;
        if (!cAVar.Uo) {
            MediaSource.MediaPeriodId mediaPeriodId = cAVar.f57703n;
            timeline.getPeriodByUid(mediaPeriodId.periodUid, this.f57457n);
            if (!mediaPeriodId.isAd()) {
                int firstAdIndexToPlay = this.f57457n.getFirstAdIndexToPlay(mediaPeriodId.nextAdGroupIndex);
                if (this.f57457n.isServerSideInsertedAdGroup(mediaPeriodId.nextAdGroupIndex) && this.f57457n.getAdState(mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay) == 3) {
                    z2 = true;
                }
                if (firstAdIndexToPlay != this.f57457n.getAdCountInAdGroup(mediaPeriodId.nextAdGroupIndex) && !z2) {
                    return qie(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay, cAVar.f57702O, mediaPeriodId.windowSequenceNumber);
                }
                return az(timeline, mediaPeriodId.periodUid, ty(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex), cAVar.f57702O, mediaPeriodId.windowSequenceNumber);
            }
            int i2 = mediaPeriodId.adGroupIndex;
            int adCountInAdGroup = this.f57457n.getAdCountInAdGroup(i2);
            if (adCountInAdGroup == -1) {
                return null;
            }
            int nextAdIndexToPlay = this.f57457n.getNextAdIndexToPlay(i2, mediaPeriodId.adIndexInAdGroup);
            if (nextAdIndexToPlay < adCountInAdGroup) {
                return qie(timeline, mediaPeriodId.periodUid, i2, nextAdIndexToPlay, cAVar.f57704t, mediaPeriodId.windowSequenceNumber);
            }
            long jLongValue = cAVar.f57704t;
            if (jLongValue == -9223372036854775807L) {
                Timeline.Window window = this.rl;
                Timeline.Period period = this.f57457n;
                Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, period.windowIndex, -9223372036854775807L, Math.max(0L, jQie));
                timeline2 = timeline;
                if (periodPositionUs == null) {
                    return null;
                }
                jLongValue = ((Long) periodPositionUs.second).longValue();
            } else {
                timeline2 = timeline;
            }
            return az(timeline, mediaPeriodId.periodUid, Math.max(ty(timeline2, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex), jLongValue), cAVar.f57704t, mediaPeriodId.windowSequenceNumber);
        }
        long j4 = 0;
        int nextPeriodIndex = timeline.getNextPeriodIndex(timeline.getIndexOfPeriod(cAVar.f57703n.periodUid), this.f57457n, this.rl, this.J2, this.Uo);
        if (nextPeriodIndex == -1) {
            return null;
        }
        int i3 = timeline.getPeriod(nextPeriodIndex, this.f57457n, true).windowIndex;
        Object objCheckNotNull = Assertions.checkNotNull(this.f57457n.uid);
        long j5 = cAVar.f57703n.windowSequenceNumber;
        if (timeline.getWindow(i3, this.rl).firstPeriodIndex == nextPeriodIndex) {
            Pair<Object, Long> periodPositionUs2 = timeline.getPeriodPositionUs(this.rl, this.f57457n, i3, -9223372036854775807L, Math.max(0L, jQie));
            if (periodPositionUs2 == null) {
                return null;
            }
            Object obj2 = periodPositionUs2.first;
            long jLongValue2 = ((Long) periodPositionUs2.second).longValue();
            C1887t c1887tMUb = c1887t.mUb();
            if (c1887tMUb == null || !c1887tMUb.rl.equals(obj2)) {
                j5 = this.f57456O;
                this.f57456O = 1 + j5;
            } else {
                j5 = c1887tMUb.J2.f57703n.windowSequenceNumber;
            }
            obj = obj2;
            j3 = jLongValue2;
            j4 = -9223372036854775807L;
        } else {
            obj = objCheckNotNull;
            j3 = 0;
        }
        MediaSource.MediaPeriodId mediaPeriodIdNY = nY(timeline, obj, j3, j5, this.rl, this.f57457n);
        if (j4 != -9223372036854775807L && cAVar.f57704t != -9223372036854775807L) {
            if (timeline.getPeriodByUid(cAVar.f57703n.periodUid, this.f57457n).getAdGroupCount() > 0) {
                Timeline.Period period2 = this.f57457n;
                if (period2.isServerSideInsertedAdGroup(period2.getRemovedAdGroupCount())) {
                    z2 = true;
                }
            }
            if (mediaPeriodIdNY.isAd() && z2) {
                j4 = cAVar.f57704t;
            } else if (z2) {
                j3 = cAVar.f57704t;
            }
        }
        return gh(timeline, mediaPeriodIdNY, j4, j3);
    }

    public boolean E2(Timeline timeline, long j2, long j3) {
        cA cAVarR;
        C1887t c1887tMUb = this.KN;
        C1887t c1887t = null;
        while (c1887tMUb != null) {
            cA cAVar = c1887tMUb.J2;
            if (c1887t == null) {
                cAVarR = r(timeline, cAVar);
            } else {
                cA cAVarXMQ = xMQ(timeline, c1887t, j2);
                if (cAVarXMQ == null) {
                    return !ViF(c1887t);
                }
                if (!O(cAVar, cAVarXMQ)) {
                    return !ViF(c1887t);
                }
                cAVarR = cAVarXMQ;
            }
            c1887tMUb.J2 = cAVarR.n(cAVar.f57704t);
            if (!nr(cAVar.f57702O, cAVarR.f57702O)) {
                c1887tMUb.g();
                long j4 = cAVarR.f57702O;
                return (ViF(c1887tMUb) || (c1887tMUb == this.xMQ && !c1887tMUb.J2.J2 && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c1887tMUb.nY(j4)) ? 1 : (j3 == ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c1887tMUb.nY(j4)) ? 0 : -1)) >= 0))) ? false : true;
            }
            c1887t = c1887tMUb;
            c1887tMUb = c1887tMUb.mUb();
        }
        return true;
    }

    public cA HI(long j2, T t3) {
        C1887t c1887t = this.mUb;
        return c1887t == null ? KN(t3) : xMQ(t3.f57507n, c1887t, j2);
    }

    public C1887t Ik() {
        return this.xMQ;
    }

    public void J2() {
        if (this.gh == 0) {
            return;
        }
        C1887t c1887tMUb = (C1887t) Assertions.checkStateNotNull(this.KN);
        this.qie = c1887tMUb.rl;
        this.az = c1887tMUb.J2.f57703n.windowSequenceNumber;
        while (c1887tMUb != null) {
            c1887tMUb.Z();
            c1887tMUb = c1887tMUb.mUb();
        }
        this.KN = null;
        this.mUb = null;
        this.xMQ = null;
        this.gh = 0;
        WPU();
    }

    public boolean S(MediaPeriod mediaPeriod) {
        C1887t c1887t = this.mUb;
        return c1887t != null && c1887t.f58261n == mediaPeriod;
    }

    public C1887t Uo(RendererCapabilities[] rendererCapabilitiesArr, TrackSelector trackSelector, Allocator allocator, MediaSourceList mediaSourceList, cA cAVar, TrackSelectorResult trackSelectorResult) {
        cA cAVar2;
        long jQie;
        C1887t c1887t = this.mUb;
        if (c1887t == null) {
            jQie = MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
            cAVar2 = cAVar;
        } else {
            cAVar2 = cAVar;
            jQie = (c1887t.qie() + this.mUb.J2.f57702O) - cAVar2.rl;
        }
        C1887t c1887t2 = new C1887t(rendererCapabilitiesArr, jQie, trackSelector, allocator, mediaSourceList, cAVar2, trackSelectorResult);
        C1887t c1887t3 = this.mUb;
        if (c1887t3 != null) {
            c1887t3.WPU(c1887t2);
        } else {
            this.KN = c1887t2;
            this.xMQ = c1887t2;
        }
        this.qie = null;
        this.mUb = c1887t2;
        this.gh++;
        WPU();
        return c1887t2;
    }

    public boolean X(Timeline timeline, boolean z2) {
        this.Uo = z2;
        return fD(timeline);
    }

    public void aYN(long j2) {
        C1887t c1887t = this.mUb;
        if (c1887t != null) {
            c1887t.o(j2);
        }
    }

    public C1887t ck() {
        return this.KN;
    }

    public boolean e(Timeline timeline, int i2) {
        this.J2 = i2;
        return fD(timeline);
    }

    public boolean iF() {
        C1887t c1887t = this.mUb;
        if (c1887t != null) {
            return !c1887t.J2.xMQ && c1887t.Ik() && this.mUb.J2.f57702O != -9223372036854775807L && this.gh < 100;
        }
        return true;
    }

    public C1887t mUb() {
        return this.mUb;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cA r(Timeline timeline, cA cAVar) {
        long durationUs;
        long j2;
        boolean zIsServerSideInsertedAdGroup;
        int i2;
        MediaSource.MediaPeriodId mediaPeriodId = cAVar.f57703n;
        boolean zO = o(mediaPeriodId);
        boolean zXQ = XQ(timeline, mediaPeriodId);
        boolean Z2 = Z(timeline, mediaPeriodId, zO);
        timeline.getPeriodByUid(cAVar.f57703n.periodUid, this.f57457n);
        long adGroupTimeUs = (mediaPeriodId.isAd() || (i2 = mediaPeriodId.nextAdGroupIndex) == -1) ? -9223372036854775807L : this.f57457n.getAdGroupTimeUs(i2);
        if (mediaPeriodId.isAd()) {
            durationUs = this.f57457n.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        } else {
            if (adGroupTimeUs != -9223372036854775807L && adGroupTimeUs != Long.MIN_VALUE) {
                j2 = adGroupTimeUs;
                if (mediaPeriodId.isAd()) {
                    int i3 = mediaPeriodId.nextAdGroupIndex;
                    zIsServerSideInsertedAdGroup = i3 != -1 && this.f57457n.isServerSideInsertedAdGroup(i3);
                } else {
                    zIsServerSideInsertedAdGroup = this.f57457n.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
                }
                return new cA(mediaPeriodId, cAVar.rl, cAVar.f57704t, adGroupTimeUs, j2, zIsServerSideInsertedAdGroup, zO, zXQ, Z2);
            }
            durationUs = this.f57457n.getDurationUs();
        }
        j2 = durationUs;
        if (mediaPeriodId.isAd()) {
        }
        return new cA(mediaPeriodId, cAVar.rl, cAVar.f57704t, adGroupTimeUs, j2, zIsServerSideInsertedAdGroup, zO, zXQ, Z2);
    }

    public C1887t rl() {
        C1887t c1887t = this.KN;
        if (c1887t == null) {
            return null;
        }
        if (c1887t == this.xMQ) {
            this.xMQ = c1887t.mUb();
        }
        this.KN.Z();
        int i2 = this.gh - 1;
        this.gh = i2;
        if (i2 == 0) {
            this.mUb = null;
            C1887t c1887t2 = this.KN;
            this.qie = c1887t2.rl;
            this.az = c1887t2.J2.f57703n.windowSequenceNumber;
        }
        this.KN = this.KN.mUb();
        WPU();
        return this.KN;
    }

    public C1887t t() {
        C1887t c1887t = this.xMQ;
        Assertions.checkState((c1887t == null || c1887t.mUb() == null) ? false : true);
        this.xMQ = this.xMQ.mUb();
        WPU();
        return this.xMQ;
    }

    public L0y(AnalyticsCollector analyticsCollector, Handler handler) {
        this.f57458t = analyticsCollector;
        this.nr = handler;
    }

    private void WPU() {
        final MediaSource.MediaPeriodId mediaPeriodId;
        final nKK.j jVarGh = com.google.common.collect.nKK.gh();
        for (C1887t c1887tMUb = this.KN; c1887tMUb != null; c1887tMUb = c1887tMUb.mUb()) {
            jVarGh.n(c1887tMUb.J2.f57703n);
        }
        C1887t c1887t = this.xMQ;
        if (c1887t == null) {
            mediaPeriodId = null;
        } else {
            mediaPeriodId = c1887t.J2.f57703n;
        }
        this.nr.post(new Runnable() { // from class: com.google.android.exoplayer2.g9
            @Override // java.lang.Runnable
            public final void run() {
                this.f57929n.f57458t.updateMediaPeriodQueueInfo(jVarGh.gh(), mediaPeriodId);
            }
        });
    }

    private boolean XQ(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (!o(mediaPeriodId)) {
            return false;
        }
        int i2 = timeline.getPeriodByUid(mediaPeriodId.periodUid, this.f57457n).windowIndex;
        if (timeline.getWindow(i2, this.rl).lastPeriodIndex != timeline.getIndexOfPeriod(mediaPeriodId.periodUid)) {
            return false;
        }
        return true;
    }

    private static MediaSource.MediaPeriodId nY(Timeline timeline, Object obj, long j2, long j3, Timeline.Window window, Timeline.Period period) {
        timeline.getPeriodByUid(obj, period);
        timeline.getWindow(period.windowIndex, window);
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        while (period.durationUs == 0 && period.getAdGroupCount() > 0 && period.isServerSideInsertedAdGroup(period.getRemovedAdGroupCount()) && period.getAdGroupIndexForPositionUs(0L) == -1) {
            int i2 = indexOfPeriod + 1;
            if (indexOfPeriod >= window.lastPeriodIndex) {
                break;
            }
            timeline.getPeriod(i2, period, true);
            obj = Assertions.checkNotNull(period.uid);
            indexOfPeriod = i2;
        }
        timeline.getPeriodByUid(obj, period);
        int adGroupIndexForPositionUs = period.getAdGroupIndexForPositionUs(j2);
        if (adGroupIndexForPositionUs == -1) {
            return new MediaSource.MediaPeriodId(obj, j3, period.getAdGroupIndexAfterPositionUs(j2));
        }
        return new MediaSource.MediaPeriodId(obj, adGroupIndexForPositionUs, period.getFirstAdIndexToPlay(adGroupIndexForPositionUs), j3);
    }

    private boolean o(MediaSource.MediaPeriodId mediaPeriodId) {
        if (!mediaPeriodId.isAd() && mediaPeriodId.nextAdGroupIndex == -1) {
            return true;
        }
        return false;
    }

    public MediaSource.MediaPeriodId g(Timeline timeline, Object obj, long j2) {
        long jTe = te(timeline, obj);
        timeline.getPeriodByUid(obj, this.f57457n);
        timeline.getWindow(this.f57457n.windowIndex, this.rl);
        boolean z2 = false;
        for (int indexOfPeriod = timeline.getIndexOfPeriod(obj); indexOfPeriod >= this.rl.firstPeriodIndex; indexOfPeriod--) {
            boolean z3 = true;
            timeline.getPeriod(indexOfPeriod, this.f57457n, true);
            if (this.f57457n.getAdGroupCount() <= 0) {
                z3 = false;
            }
            z2 |= z3;
            Timeline.Period period = this.f57457n;
            if (period.getAdGroupIndexForPositionUs(period.durationUs) != -1) {
                obj = Assertions.checkNotNull(this.f57457n.uid);
            }
            if (z2 && (!z3 || this.f57457n.durationUs != 0)) {
                break;
            }
        }
        return nY(timeline, obj, j2, jTe, this.rl, this.f57457n);
    }
}
