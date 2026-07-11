package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.MediaPeriodQueue;
import com.google.android.exoplayer2.DefaultMediaClock;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaSourceList;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataRenderer;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.nKK;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSourceList.MediaSourceListInfoRefreshListener, DefaultMediaClock.PlaybackParametersListener, PlayerMessage.Sender {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f57377B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f57378D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private SeekParameters f57379E;
    private final Looper E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private PlaybackInfoUpdate f57380FX;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private int f57381GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f57382I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f57383J;
    private final TrackSelector J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private T f57384M;
    private final MediaSourceList M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final boolean f57385N;
    private boolean Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final RendererCapabilities[] f57386O;
    private final L0y P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final HandlerWrapper f57387S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final long f57388T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final PlaybackInfoUpdateListener f57389U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final Timeline.Period f57390X;
    private final ArrayList Xw;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f57391Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final BandwidthMeter f57392Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f57393a;
    private boolean dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Timeline.Window f57394e;
    private final long eF;
    private boolean eTf;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HandlerThread f57395g;
    private long ijL;
    private final Clock jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f57396k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f57397m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Renderer[] f57398n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final LoadControl f57399o;
    private long ofS = -9223372036854775807L;
    private final LivePlaybackSpeedControl p5;
    private long pJg;
    private Wre piY;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final TrackSelectorResult f57400r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f57401t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final DefaultMediaClock f57402v;
    private ExoPlaybackException xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f57403z;

    private static final class Ml implements Comparable {
        public Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public long f57407O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final PlayerMessage f57408n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f57409t;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(Ml ml) {
            Object obj = this.J2;
            if ((obj == null) != (ml.J2 == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i2 = this.f57409t - ml.f57409t;
            return i2 != 0 ? i2 : Util.compareLong(this.f57407O, ml.f57407O);
        }

        public void rl(int i2, long j2, Object obj) {
            this.f57409t = i2;
            this.f57407O = j2;
            this.J2 = obj;
        }

        public Ml(PlayerMessage playerMessage) {
            this.f57408n = playerMessage;
        }
    }

    public static final class PlaybackInfoUpdate {
        public int discontinuityReason;
        private boolean hasPendingChange;
        public boolean hasPlayWhenReadyChangeReason;
        public int operationAcks;
        public int playWhenReadyChangeReason;
        public T playbackInfo;
        public boolean positionDiscontinuity;

        public void setPlayWhenReadyChangeReason(int i2) {
            this.hasPendingChange = true;
            this.hasPlayWhenReadyChangeReason = true;
            this.playWhenReadyChangeReason = i2;
        }

        public void incrementPendingOperationAcks(int i2) {
            this.hasPendingChange |= i2 > 0;
            this.operationAcks += i2;
        }

        public void setPlaybackInfo(T t3) {
            this.hasPendingChange |= this.playbackInfo != t3;
            this.playbackInfo = t3;
        }

        public void setPositionDiscontinuity(int i2) {
            if (this.positionDiscontinuity && this.discontinuityReason != 5) {
                Assertions.checkArgument(i2 == 5);
                return;
            }
            this.hasPendingChange = true;
            this.positionDiscontinuity = true;
            this.discontinuityReason = i2;
        }

        public PlaybackInfoUpdate(T t3) {
            this.playbackInfo = t3;
        }
    }

    public interface PlaybackInfoUpdateListener {
        void onPlaybackInfoUpdate(PlaybackInfoUpdate playbackInfoUpdate);
    }

    class j implements Renderer.WakeupListener {
        j() {
        }

        @Override // com.google.android.exoplayer2.Renderer.WakeupListener
        public void onSleep() {
            ExoPlayerImplInternal.this.f57396k = true;
        }

        @Override // com.google.android.exoplayer2.Renderer.WakeupListener
        public void onWakeup() {
            ExoPlayerImplInternal.this.f57387S.sendEmptyMessage(2);
        }
    }

    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f57413n;
        private final long nr;
        private final ShuffleOrder rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f57414t;

        /* synthetic */ n(List list, ShuffleOrder shuffleOrder, int i2, long j2, j jVar) {
            this(list, shuffleOrder, i2, j2);
        }

        private n(List list, ShuffleOrder shuffleOrder, int i2, long j2) {
            this.f57413n = list;
            this.rl = shuffleOrder;
            this.f57414t = i2;
            this.nr = j2;
        }
    }

    public ExoPlayerImplInternal(Renderer[] rendererArr, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, int i2, boolean z2, AnalyticsCollector analyticsCollector, SeekParameters seekParameters, LivePlaybackSpeedControl livePlaybackSpeedControl, long j2, boolean z3, Looper looper, Clock clock, PlaybackInfoUpdateListener playbackInfoUpdateListener, PlayerId playerId) {
        this.f57389U = playbackInfoUpdateListener;
        this.f57398n = rendererArr;
        this.J2 = trackSelector;
        this.f57400r = trackSelectorResult;
        this.f57399o = loadControl;
        this.f57392Z = bandwidthMeter;
        this.f57381GR = i2;
        this.Nxk = z2;
        this.f57379E = seekParameters;
        this.p5 = livePlaybackSpeedControl;
        this.eF = j2;
        this.pJg = j2;
        this.f57383J = z3;
        this.jB = clock;
        this.f57388T = loadControl.getBackBufferDurationUs();
        this.f57385N = loadControl.retainBackBufferFromKeyframe();
        T tGh = T.gh(trackSelectorResult);
        this.f57384M = tGh;
        this.f57380FX = new PlaybackInfoUpdate(tGh);
        this.f57386O = new RendererCapabilities[rendererArr.length];
        for (int i3 = 0; i3 < rendererArr.length; i3++) {
            rendererArr[i3].init(i3, playerId);
            this.f57386O[i3] = rendererArr[i3].getCapabilities();
        }
        this.f57402v = new DefaultMediaClock(this, clock);
        this.Xw = new ArrayList();
        this.f57401t = com.google.common.collect.O.xMQ();
        this.f57394e = new Timeline.Window();
        this.f57390X = new Timeline.Period();
        trackSelector.init(this, bandwidthMeter);
        this.eTf = true;
        Handler handler = new Handler(looper);
        this.P5 = new L0y(analyticsCollector, handler);
        this.M7 = new MediaSourceList(this, analyticsCollector, handler, playerId);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f57395g = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.E2 = looper2;
        this.f57387S = clock.createHandler(looper2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void M7() throws ExoPlaybackException {
        boolean z2;
        boolean z3 = false;
        while (Bu()) {
            if (z3) {
                Xw();
            }
            C1887t c1887t = (C1887t) Assertions.checkNotNull(this.P5.rl());
            if (this.f57384M.rl.periodUid.equals(c1887t.J2.f57703n.periodUid)) {
                MediaSource.MediaPeriodId mediaPeriodId = this.f57384M.rl;
                if (mediaPeriodId.adGroupIndex == -1) {
                    MediaSource.MediaPeriodId mediaPeriodId2 = c1887t.J2.f57703n;
                    z2 = mediaPeriodId2.adGroupIndex == -1 && mediaPeriodId.nextAdGroupIndex != mediaPeriodId2.nextAdGroupIndex;
                }
            }
            cA cAVar = c1887t.J2;
            MediaSource.MediaPeriodId mediaPeriodId3 = cAVar.f57703n;
            long j2 = cAVar.rl;
            this.f57384M = X(mediaPeriodId3, j2, cAVar.f57704t, j2, !z2, 0);
            m();
            EF();
            z3 = true;
        }
    }

    private void Qu() throws ExoPlaybackException {
        this.f57393a = false;
        this.f57402v.O();
        for (Renderer renderer : this.f57398n) {
            if (wTp(renderer)) {
                renderer.start();
            }
        }
    }

    private void UF(boolean z2, boolean z3) {
        ijL(z2 || !this.f57391Y, false, true, false);
        this.f57380FX.incrementPendingOperationAcks(z3 ? 1 : 0);
        this.f57399o.onStopped();
        T3L(1);
    }

    private void Uo() throws ExoPlaybackException {
        ul(true);
    }

    private void Y() {
        ijL(true, false, true, false);
        this.f57399o.onReleased();
        T3L(1);
        this.f57395g.quit();
        synchronized (this) {
            this.f57377B = true;
            notifyAll();
        }
    }

    private static boolean nHg(boolean z2, MediaSource.MediaPeriodId mediaPeriodId, long j2, MediaSource.MediaPeriodId mediaPeriodId2, Timeline.Period period, long j3) {
        if (!z2 && j2 == j3 && mediaPeriodId.periodUid.equals(mediaPeriodId2.periodUid)) {
            if (mediaPeriodId.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex)) {
                return (period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 4 || period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 2) ? false : true;
            }
            if (mediaPeriodId2.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId2.adGroupIndex)) {
                return true;
            }
        }
        return false;
    }

    private static Format[] o(ExoTrackSelection exoTrackSelection) {
        int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i2 = 0; i2 < length; i2++) {
            formatArr[i2] = exoTrackSelection.getFormat(i2);
        }
        return formatArr;
    }

    private synchronized void y(t1.UGc uGc, long j2) {
        long jElapsedRealtime = this.jB.elapsedRealtime() + j2;
        boolean z2 = false;
        while (!((Boolean) uGc.get()).booleanValue() && j2 > 0) {
            try {
                this.jB.onThreadBlocked();
                wait(j2);
            } catch (InterruptedException unused) {
                z2 = true;
            }
            j2 = jElapsedRealtime - this.jB.elapsedRealtime();
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean Nxk() {
        if (!this.f57377B && this.f57395g.isAlive()) {
            this.f57387S.sendEmptyMessage(7);
            y(new t1.UGc() { // from class: com.google.android.exoplayer2.RzR
                @Override // t1.UGc
                public final Object get() {
                    return Boolean.valueOf(this.f57498n.f57377B);
                }
            }, this.eF);
            return this.f57377B;
        }
        return true;
    }

    public synchronized boolean Po6(boolean z2) {
        if (!this.f57377B && this.f57395g.isAlive()) {
            if (z2) {
                this.f57387S.obtainMessage(13, 1, 0).sendToTarget();
                return true;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.f57387S.obtainMessage(13, 0, 0, atomicBoolean).sendToTarget();
            y(new androidx.media3.exoplayer.Y5(atomicBoolean), this.pJg);
            return atomicBoolean.get();
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Sender
    public synchronized void sendMessage(PlayerMessage playerMessage) {
        if (!this.f57377B && this.f57395g.isAlive()) {
            this.f57387S.obtainMessage(14, playerMessage).sendToTarget();
            return;
        }
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        playerMessage.markAsProcessed(false);
    }

    private static final class I28 {
        public final boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final boolean f57404O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final MediaSource.MediaPeriodId f57405n;
        public final boolean nr;
        public final long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final long f57406t;

        public I28(MediaSource.MediaPeriodId mediaPeriodId, long j2, long j3, boolean z2, boolean z3, boolean z4) {
            this.f57405n = mediaPeriodId;
            this.rl = j2;
            this.f57406t = j3;
            this.nr = z2;
            this.f57404O = z3;
            this.J2 = z4;
        }
    }

    private static final class Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Timeline f57410n;
        public final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final long f57411t;

        public Wre(Timeline timeline, int i2, long j2) {
            this.f57410n = timeline;
            this.rl = i2;
            this.f57411t = j2;
        }
    }

    private static class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f57415n;
        public final ShuffleOrder nr;
        public final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f57416t;

        public w6(int i2, int i3, int i5, ShuffleOrder shuffleOrder) {
            this.f57415n = i2;
            this.rl = i3;
            this.f57416t = i5;
            this.nr = shuffleOrder;
        }
    }

    private void B() {
        for (C1887t c1887tCk = this.P5.ck(); c1887tCk != null; c1887tCk = c1887tCk.mUb()) {
            for (ExoTrackSelection exoTrackSelection : c1887tCk.HI().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onDiscontinuity();
                }
            }
        }
    }

    private static I28 C(Timeline timeline, T t3, Wre wre, L0y l0y, int i2, boolean z2, Timeline.Window window, Timeline.Period period) {
        long j2;
        long jLongValue;
        int firstWindowIndex;
        boolean z3;
        boolean z4;
        boolean z5;
        int firstWindowIndex2;
        boolean z6;
        Timeline timeline2;
        Timeline.Period period2;
        long j3;
        int i3;
        boolean z7;
        boolean z9;
        boolean z10;
        if (timeline.isEmpty()) {
            return new I28(T.qie(), 0L, -9223372036854775807L, false, true, false);
        }
        MediaSource.MediaPeriodId mediaPeriodId = t3.rl;
        Object obj = mediaPeriodId.periodUid;
        boolean zRV9 = rV9(t3, period);
        long j4 = (t3.rl.isAd() || zRV9) ? t3.f57510t : t3.f57508o;
        boolean z11 = false;
        if (wre != null) {
            Pair pairMx = Mx(timeline, wre, true, i2, z2, window, period);
            if (pairMx == null) {
                firstWindowIndex = timeline.getFirstWindowIndex(z2);
                jLongValue = j4;
                j2 = -9223372036854775807L;
                z7 = false;
                z9 = false;
                z10 = true;
            } else {
                if (wre.f57411t == -9223372036854775807L) {
                    firstWindowIndex = timeline.getPeriodByUid(pairMx.first, period).windowIndex;
                    jLongValue = j4;
                    z7 = false;
                } else {
                    obj = pairMx.first;
                    jLongValue = ((Long) pairMx.second).longValue();
                    firstWindowIndex = -1;
                    z7 = true;
                }
                j2 = -9223372036854775807L;
                z9 = t3.f57506O == 4;
                z10 = false;
            }
            z5 = z7;
            z3 = z9;
            z4 = z10;
        } else {
            j2 = -9223372036854775807L;
            if (t3.f57507n.isEmpty()) {
                firstWindowIndex = timeline.getFirstWindowIndex(z2);
            } else if (timeline.getIndexOfPeriod(obj) == -1) {
                Object objG7 = G7(window, period, i2, z2, obj, t3.f57507n, timeline);
                if (objG7 == null) {
                    firstWindowIndex2 = timeline.getFirstWindowIndex(z2);
                    z6 = true;
                } else {
                    firstWindowIndex2 = timeline.getPeriodByUid(objG7, period).windowIndex;
                    z6 = false;
                }
                firstWindowIndex = firstWindowIndex2;
                obj = obj;
                jLongValue = j4;
                z4 = z6;
                z3 = false;
                z5 = false;
            } else if (j4 == -9223372036854775807L) {
                firstWindowIndex = timeline.getPeriodByUid(obj, period).windowIndex;
                obj = obj;
            } else if (zRV9) {
                t3.f57507n.getPeriodByUid(mediaPeriodId.periodUid, period);
                if (t3.f57507n.getWindow(period.windowIndex, window).firstPeriodIndex == t3.f57507n.getIndexOfPeriod(mediaPeriodId.periodUid)) {
                    Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(obj, period).windowIndex, period.getPositionInWindowUs() + j4);
                    obj = periodPositionUs.first;
                    jLongValue = ((Long) periodPositionUs.second).longValue();
                } else {
                    obj = obj;
                    jLongValue = j4;
                }
                firstWindowIndex = -1;
                z3 = false;
                z4 = false;
                z5 = true;
            } else {
                obj = obj;
                jLongValue = j4;
                firstWindowIndex = -1;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            jLongValue = j4;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        if (firstWindowIndex != -1) {
            timeline2 = timeline;
            Pair<Object, Long> periodPositionUs2 = timeline2.getPeriodPositionUs(window, period, firstWindowIndex, -9223372036854775807L);
            period2 = period;
            obj = periodPositionUs2.first;
            jLongValue = ((Long) periodPositionUs2.second).longValue();
            j3 = j2;
        } else {
            timeline2 = timeline;
            period2 = period;
            j3 = jLongValue;
        }
        MediaSource.MediaPeriodId mediaPeriodIdG = l0y.g(timeline2, obj, jLongValue);
        int i5 = mediaPeriodIdG.nextAdGroupIndex;
        boolean z12 = i5 == -1 || ((i3 = mediaPeriodId.nextAdGroupIndex) != -1 && i5 >= i3);
        if (mediaPeriodId.periodUid.equals(obj) && !mediaPeriodId.isAd() && !mediaPeriodIdG.isAd() && z12) {
            z11 = true;
        }
        MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodIdG;
        boolean zNHg = nHg(zRV9, mediaPeriodId, j4, mediaPeriodId2, timeline2.getPeriodByUid(obj, period2), j3);
        if (z11 || zNHg) {
            mediaPeriodId2 = mediaPeriodId;
        }
        if (mediaPeriodId2.isAd()) {
            if (mediaPeriodId2.equals(mediaPeriodId)) {
                jLongValue = t3.f57508o;
            } else {
                timeline2.getPeriodByUid(mediaPeriodId2.periodUid, period2);
                jLongValue = mediaPeriodId2.adIndexInAdGroup == period2.getFirstAdIndexToPlay(mediaPeriodId2.adGroupIndex) ? period2.getAdResumePositionUs() : 0L;
            }
        }
        return new I28(mediaPeriodId2, jLongValue, j3, z3, z4, z5);
    }

    private void D() {
        for (C1887t c1887tCk = this.P5.ck(); c1887tCk != null; c1887tCk = c1887tCk.mUb()) {
            for (ExoTrackSelection exoTrackSelection : c1887tCk.HI().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onRebuffer();
                }
            }
        }
    }

    private void E() throws Throwable {
        iF(this.M7.xMQ(), true);
    }

    private void E2(PlaybackParameters playbackParameters, float f3, boolean z2, boolean z3) throws ExoPlaybackException {
        if (z2) {
            if (z3) {
                this.f57380FX.incrementPendingOperationAcks(1);
            }
            this.f57384M = this.f57384M.Uo(playbackParameters);
        }
        Vvq(playbackParameters.speed);
        for (Renderer renderer : this.f57398n) {
            if (renderer != null) {
                renderer.setPlaybackSpeed(f3, playbackParameters.speed);
            }
        }
    }

    private void EF() throws ExoPlaybackException {
        C1887t c1887tCk = this.P5.ck();
        if (c1887tCk == null) {
            return;
        }
        long discontinuity = c1887tCk.nr ? c1887tCk.f58261n.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != -9223372036854775807L) {
            eTf(discontinuity);
            if (discontinuity != this.f57384M.f57508o) {
                T t3 = this.f57384M;
                long j2 = discontinuity;
                this.f57384M = X(t3.rl, j2, t3.f57510t, j2, true, 5);
            }
        } else {
            long jUo = this.f57402v.Uo(c1887tCk != this.P5.Ik());
            this.ijL = jUo;
            long jViF = c1887tCk.ViF(jUo);
            U(this.f57384M.f57508o, jViF);
            this.f57384M.f57508o = jViF;
        }
        this.f57384M.Ik = this.P5.mUb().xMQ();
        this.f57384M.f57509r = aYN();
        T t4 = this.f57384M;
        if (t4.qie && t4.f57506O == 3 && ub(t4.f57507n, t4.rl) && this.f57384M.ty.speed == 1.0f) {
            float adjustedPlaybackSpeed = this.p5.getAdjustedPlaybackSpeed(r(), aYN());
            if (this.f57402v.getPlaybackParameters().speed != adjustedPlaybackSpeed) {
                this.f57402v.setPlaybackParameters(this.f57384M.ty.withSpeed(adjustedPlaybackSpeed));
                E2(this.f57384M.ty, this.f57402v.getPlaybackParameters().speed, false, false);
            }
        }
    }

    private void ER(boolean z2, int i2, boolean z3, int i3) throws ExoPlaybackException {
        this.f57380FX.incrementPendingOperationAcks(z3 ? 1 : 0);
        this.f57380FX.setPlayWhenReadyChangeReason(i3);
        this.f57384M = this.f57384M.O(z2, i2);
        this.f57393a = false;
        J(z2);
        if (!Uf()) {
            X4T();
            EF();
            return;
        }
        int i5 = this.f57384M.f57506O;
        if (i5 == 3) {
            Qu();
            this.f57387S.sendEmptyMessage(2);
        } else if (i5 == 2) {
            this.f57387S.sendEmptyMessage(2);
        }
    }

    private void EWS(boolean z2, AtomicBoolean atomicBoolean) {
        if (this.f57391Y != z2) {
            this.f57391Y = z2;
            if (!z2) {
                for (Renderer renderer : this.f57398n) {
                    if (!wTp(renderer) && this.f57401t.remove(renderer)) {
                        renderer.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void F(SeekParameters seekParameters) {
        this.f57379E = seekParameters;
    }

    private void GR() {
        this.f57380FX.incrementPendingOperationAcks(1);
        ijL(false, false, false, true);
        this.f57399o.onPrepared();
        T3L(this.f57384M.f57507n.isEmpty() ? 4 : 2);
        this.M7.S(this.f57392Z.getTransferListener());
        this.f57387S.sendEmptyMessage(2);
    }

    private void HV(long j2) {
        for (Renderer renderer : this.f57398n) {
            if (renderer.getStream() != null) {
                GD(renderer, j2);
            }
        }
    }

    private void How(boolean z2) throws ExoPlaybackException {
        this.f57383J = z2;
        m();
        if (!this.f57378D || this.P5.Ik() == this.P5.ck()) {
            return;
        }
        ul(true);
        te(false);
    }

    private com.google.common.collect.nKK Ik(ExoTrackSelection[] exoTrackSelectionArr) {
        nKK.j jVar = new nKK.j();
        boolean z2 = false;
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                Metadata metadata = exoTrackSelection.getFormat(0).metadata;
                if (metadata == null) {
                    jVar.n(new Metadata(new Metadata.Entry[0]));
                } else {
                    jVar.n(metadata);
                    z2 = true;
                }
            }
        }
        return z2 ? jVar.gh() : com.google.common.collect.nKK.r();
    }

    private void J(boolean z2) {
        for (C1887t c1887tCk = this.P5.ck(); c1887tCk != null; c1887tCk = c1887tCk.mUb()) {
            for (ExoTrackSelection exoTrackSelection : c1887tCk.HI().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlayWhenReadyChanged(z2);
                }
            }
        }
    }

    private void JVN(TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        this.f57399o.onTracksSelected(this.f57398n, trackGroupArray, trackSelectorResult.selections);
    }

    private long Jk(MediaSource.MediaPeriodId mediaPeriodId, long j2, boolean z2) {
        return Rl(mediaPeriodId, j2, this.P5.ck() != this.P5.Ik(), z2);
    }

    private void M(w6 w6Var) throws Throwable {
        this.f57380FX.incrementPendingOperationAcks(1);
        iF(this.M7.XQ(w6Var.f57415n, w6Var.rl, w6Var.f57416t, w6Var.nr), false);
    }

    private static Pair Mx(Timeline timeline, Wre wre, boolean z2, int i2, boolean z3, Timeline.Window window, Timeline.Period period) {
        Pair<Object, Long> periodPositionUs;
        Timeline timeline2;
        Object objG7;
        Timeline timeline3 = wre.f57410n;
        if (timeline.isEmpty()) {
            return null;
        }
        boolean zIsEmpty = timeline3.isEmpty();
        Timeline timeline4 = timeline3;
        if (zIsEmpty) {
            timeline4 = timeline;
        }
        try {
            periodPositionUs = timeline4.getPeriodPositionUs(window, period, wre.rl, wre.f57411t);
            timeline2 = timeline4;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (timeline.equals(timeline2)) {
            return periodPositionUs;
        }
        if (timeline.getIndexOfPeriod(periodPositionUs.first) != -1) {
            return (timeline2.getPeriodByUid(periodPositionUs.first, period).isPlaceholder && timeline2.getWindow(period.windowIndex, window).firstPeriodIndex == timeline2.getIndexOfPeriod(periodPositionUs.first)) ? timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(periodPositionUs.first, period).windowIndex, wre.f57411t) : periodPositionUs;
        }
        if (z2 && (objG7 = G7(window, period, i2, z3, periodPositionUs.first, timeline2, timeline)) != null) {
            return timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(objG7, period).windowIndex, -9223372036854775807L);
        }
        return null;
    }

    private boolean N() {
        C1887t c1887tIk = this.P5.Ik();
        if (!c1887tIk.nr) {
            return false;
        }
        int i2 = 0;
        while (true) {
            Renderer[] rendererArr = this.f57398n;
            if (i2 >= rendererArr.length) {
                return true;
            }
            Renderer renderer = rendererArr[i2];
            SampleStream sampleStream = c1887tIk.f58262t[i2];
            if (renderer.getStream() != sampleStream || (sampleStream != null && !renderer.hasReadStreamToEnd() && !T(renderer, c1887tIk))) {
                break;
            }
            i2++;
        }
        return false;
    }

    private void O(n nVar, int i2) throws Throwable {
        this.f57380FX.incrementPendingOperationAcks(1);
        MediaSourceList mediaSourceList = this.M7;
        if (i2 == -1) {
            i2 = mediaSourceList.Ik();
        }
        iF(mediaSourceList.J2(i2, nVar.f57413n, nVar.rl), false);
    }

    private void P5() throws ExoPlaybackException {
        cA cAVarHI;
        this.P5.aYN(this.ijL);
        if (this.P5.iF() && (cAVarHI = this.P5.HI(this.ijL, this.f57384M)) != null) {
            C1887t c1887tUo = this.P5.Uo(this.f57386O, this.J2, this.f57399o.getAllocator(), this.M7, cAVarHI, this.f57400r);
            c1887tUo.f58261n.prepare(this, cAVarHI.rl);
            if (this.P5.ck() == c1887tUo) {
                eTf(cAVarHI.rl);
            }
            te(false);
        }
        if (!this.f57382I) {
            bzg();
        } else {
            this.f57382I = s7N();
            Zmq();
        }
    }

    private void RQ(int i2) throws ExoPlaybackException {
        this.f57381GR = i2;
        if (!this.P5.e(this.f57384M.f57507n, i2)) {
            ul(true);
        }
        te(false);
    }

    private void T3L(int i2) {
        T t3 = this.f57384M;
        if (t3.f57506O != i2) {
            if (i2 != 2) {
                this.ofS = -9223372036854775807L;
            }
            this.f57384M = t3.KN(i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void U(long j2, long j3) {
        Ml ml;
        if (this.Xw.isEmpty() || this.f57384M.rl.isAd()) {
            return;
        }
        if (this.eTf) {
            j2--;
            this.eTf = false;
        }
        T t3 = this.f57384M;
        int indexOfPeriod = t3.f57507n.getIndexOfPeriod(t3.rl.periodUid);
        int iMin = Math.min(this.f57397m, this.Xw.size());
        Ml ml2 = iMin > 0 ? (Ml) this.Xw.get(iMin - 1) : null;
        while (ml2 != null) {
            int i2 = ml2.f57409t;
            if (i2 <= indexOfPeriod && (i2 != indexOfPeriod || ml2.f57407O <= j2)) {
                break;
            }
            int i3 = iMin - 1;
            ml2 = i3 > 0 ? (Ml) this.Xw.get(iMin - 2) : null;
            iMin = i3;
        }
        if (iMin < this.Xw.size()) {
            ml = (Ml) this.Xw.get(iMin);
            while (ml != null && ml.J2 != null) {
                int i5 = ml.f57409t;
                if (i5 >= indexOfPeriod && (i5 != indexOfPeriod || ml.f57407O > j2)) {
                    break;
                }
                iMin++;
                if (iMin < this.Xw.size()) {
                    ml = (Ml) this.Xw.get(iMin);
                }
            }
            while (ml != null && ml.J2 != null && ml.f57409t == indexOfPeriod) {
                long j4 = ml.f57407O;
                if (j4 <= j2 || j4 > j3) {
                    break;
                }
                try {
                    mYa(ml.f57408n);
                    if (ml.f57408n.getDeleteAfterDelivery() || ml.f57408n.isCanceled()) {
                        this.Xw.remove(iMin);
                    } else {
                        iMin++;
                    }
                    ml = iMin < this.Xw.size() ? (Ml) this.Xw.get(iMin) : null;
                } catch (Throwable th) {
                    if (ml.f57408n.getDeleteAfterDelivery() || ml.f57408n.isCanceled()) {
                        this.Xw.remove(iMin);
                    }
                    throw th;
                }
            }
            this.f57397m = iMin;
            return;
        }
        ml = null;
    }

    private boolean Uf() {
        T t3 = this.f57384M;
        return t3.qie && t3.az == 0;
    }

    private long ViF(long j2) {
        C1887t c1887tMUb = this.P5.mUb();
        if (c1887tMUb == null) {
            return 0L;
        }
        return Math.max(0L, j2 - c1887tMUb.ViF(this.ijL));
    }

    private void Vvq(float f3) {
        for (C1887t c1887tCk = this.P5.ck(); c1887tCk != null; c1887tCk = c1887tCk.mUb()) {
            for (ExoTrackSelection exoTrackSelection : c1887tCk.HI().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlaybackSpeed(f3);
                }
            }
        }
    }

    private T X(MediaSource.MediaPeriodId mediaPeriodId, long j2, long j3, long j4, boolean z2, int i2) {
        List list;
        TrackGroupArray trackGroupArray;
        TrackSelectorResult trackSelectorResult;
        this.eTf = (!this.eTf && j2 == this.f57384M.f57508o && mediaPeriodId.equals(this.f57384M.rl)) ? false : true;
        m();
        T t3 = this.f57384M;
        TrackGroupArray trackGroupArray2 = t3.KN;
        TrackSelectorResult trackSelectorResult2 = t3.xMQ;
        List listR = t3.mUb;
        if (this.M7.o()) {
            C1887t c1887tCk = this.P5.ck();
            TrackGroupArray trackGroupArrayTy = c1887tCk == null ? TrackGroupArray.EMPTY : c1887tCk.ty();
            TrackSelectorResult trackSelectorResultHI = c1887tCk == null ? this.f57400r : c1887tCk.HI();
            com.google.common.collect.nKK nkkIk = Ik(trackSelectorResultHI.selections);
            if (c1887tCk != null) {
                cA cAVar = c1887tCk.J2;
                if (cAVar.f57704t != j3) {
                    c1887tCk.J2 = cAVar.n(j3);
                }
            }
            trackGroupArray = trackGroupArrayTy;
            trackSelectorResult = trackSelectorResultHI;
            list = nkkIk;
        } else {
            if (!mediaPeriodId.equals(this.f57384M.rl)) {
                trackGroupArray2 = TrackGroupArray.EMPTY;
                trackSelectorResult2 = this.f57400r;
                listR = com.google.common.collect.nKK.r();
            }
            list = listR;
            trackGroupArray = trackGroupArray2;
            trackSelectorResult = trackSelectorResult2;
        }
        if (z2) {
            this.f57380FX.setPositionDiscontinuity(i2);
        }
        return this.f57384M.t(mediaPeriodId, j2, j3, j4, aYN(), trackGroupArray, trackSelectorResult, list);
    }

    private void X4T() {
        this.f57402v.J2();
        for (Renderer renderer : this.f57398n) {
            if (wTp(renderer)) {
                ty(renderer);
            }
        }
    }

    private long XQ() {
        C1887t c1887tIk = this.P5.Ik();
        if (c1887tIk == null) {
            return 0L;
        }
        long jQie = c1887tIk.qie();
        if (!c1887tIk.nr) {
            return jQie;
        }
        int i2 = 0;
        while (true) {
            Renderer[] rendererArr = this.f57398n;
            if (i2 >= rendererArr.length) {
                return jQie;
            }
            if (wTp(rendererArr[i2]) && this.f57398n[i2].getStream() == c1887tIk.f58262t[i2]) {
                long readingPositionUs = this.f57398n[i2].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jQie = Math.max(readingPositionUs, jQie);
            }
            i2++;
        }
    }

    private void Xw() {
        this.f57380FX.setPlaybackInfo(this.f57384M);
        if (this.f57380FX.hasPendingChange) {
            this.f57389U.onPlaybackInfoUpdate(this.f57380FX);
            this.f57380FX = new PlaybackInfoUpdate(this.f57384M);
        }
    }

    private long Z(Timeline timeline, Object obj, long j2) {
        timeline.getWindow(timeline.getPeriodByUid(obj, this.f57390X).windowIndex, this.f57394e);
        Timeline.Window window = this.f57394e;
        if (window.windowStartTimeMs != -9223372036854775807L && window.isLive()) {
            Timeline.Window window2 = this.f57394e;
            if (window2.isDynamic) {
                return Util.msToUs(window2.getCurrentUnixTimeMs() - this.f57394e.windowStartTimeMs) - (j2 + this.f57390X.getPositionInWindowUs());
            }
        }
        return -9223372036854775807L;
    }

    private void Zmq() {
        C1887t c1887tMUb = this.P5.mUb();
        boolean z2 = this.f57382I || (c1887tMUb != null && c1887tMUb.f58261n.isLoading());
        T t3 = this.f57384M;
        if (z2 != t3.Uo) {
            this.f57384M = t3.n(z2);
        }
    }

    private long aYN() {
        return ViF(this.f57384M.Ik);
    }

    private void az(boolean[] zArr) throws ExoPlaybackException {
        C1887t c1887tIk = this.P5.Ik();
        TrackSelectorResult trackSelectorResultHI = c1887tIk.HI();
        for (int i2 = 0; i2 < this.f57398n.length; i2++) {
            if (!trackSelectorResultHI.isRendererEnabled(i2) && this.f57401t.remove(this.f57398n[i2])) {
                this.f57398n[i2].reset();
            }
        }
        for (int i3 = 0; i3 < this.f57398n.length; i3++) {
            if (trackSelectorResultHI.isRendererEnabled(i3)) {
                gh(i3, zArr[i3]);
            }
        }
        c1887tIk.Uo = true;
    }

    private void e(PlaybackParameters playbackParameters, boolean z2) throws ExoPlaybackException {
        E2(playbackParameters, playbackParameters.speed, true, z2);
    }

    private void eF() throws ExoPlaybackException {
        C1887t c1887tIk = this.P5.Ik();
        if (c1887tIk == null || this.P5.ck() == c1887tIk || c1887tIk.Uo || !z()) {
            return;
        }
        qie();
    }

    private void eTf(long j2) throws ExoPlaybackException {
        C1887t c1887tCk = this.P5.ck();
        long jNY = c1887tCk == null ? j2 + MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : c1887tCk.nY(j2);
        this.ijL = jNY;
        this.f57402v.t(jNY);
        for (Renderer renderer : this.f57398n) {
            if (wTp(renderer)) {
                renderer.resetPosition(this.ijL);
            }
        }
        B();
    }

    private boolean f(boolean z2) {
        if (this.f57403z == 0) {
            return v();
        }
        if (!z2) {
            return false;
        }
        T t3 = this.f57384M;
        if (!t3.Uo) {
            return true;
        }
        long targetLiveOffsetUs = ub(t3.f57507n, this.P5.ck().J2.f57703n) ? this.p5.getTargetLiveOffsetUs() : -9223372036854775807L;
        C1887t c1887tMUb = this.P5.mUb();
        return (c1887tMUb.Ik() && c1887tMUb.J2.xMQ) || (c1887tMUb.J2.f57703n.isAd() && !c1887tMUb.nr) || this.f57399o.shouldStartPlayback(aYN(), this.f57402v.getPlaybackParameters().speed, this.f57393a, targetLiveOffsetUs);
    }

    private void fD(MediaPeriod mediaPeriod) throws ExoPlaybackException {
        if (this.P5.S(mediaPeriod)) {
            C1887t c1887tMUb = this.P5.mUb();
            c1887tMUb.ck(this.f57402v.getPlaybackParameters().speed, this.f57384M.f57507n);
            JVN(c1887tMUb.ty(), c1887tMUb.HI());
            if (c1887tMUb == this.P5.ck()) {
                eTf(c1887tMUb.J2.rl);
                qie();
                T t3 = this.f57384M;
                MediaSource.MediaPeriodId mediaPeriodId = t3.rl;
                long j2 = c1887tMUb.J2.rl;
                this.f57384M = X(mediaPeriodId, j2, t3.f57510t, j2, false, 5);
            }
            bzg();
        }
    }

    private void fcU(long j2, long j3) {
        this.f57387S.removeMessages(2);
        this.f57387S.sendEmptyMessageAtTime(2, j2 + j3);
    }

    private void gh(int i2, boolean z2) throws ExoPlaybackException {
        Renderer renderer = this.f57398n[i2];
        if (wTp(renderer)) {
            return;
        }
        C1887t c1887tIk = this.P5.Ik();
        boolean z3 = c1887tIk == this.P5.ck();
        TrackSelectorResult trackSelectorResultHI = c1887tIk.HI();
        RendererConfiguration rendererConfiguration = trackSelectorResultHI.rendererConfigurations[i2];
        Format[] formatArrO = o(trackSelectorResultHI.selections[i2]);
        boolean z4 = Uf() && this.f57384M.f57506O == 3;
        boolean z5 = !z2 && z4;
        this.f57403z++;
        this.f57401t.add(renderer);
        renderer.enable(rendererConfiguration, formatArrO, c1887tIk.f58262t[i2], this.ijL, z5, z3, c1887tIk.az(), c1887tIk.qie());
        renderer.handleMessage(11, new j());
        this.f57402v.rl(renderer);
        if (z4) {
            renderer.start();
        }
    }

    private void hRu(n nVar) throws Throwable {
        this.f57380FX.incrementPendingOperationAcks(1);
        if (nVar.f57414t != -1) {
            this.piY = new Wre(new h6y(nVar.f57413n, nVar.rl), nVar.f57414t, nVar.nr);
        }
        iF(this.M7.te(nVar.f57413n, nVar.rl), false);
    }

    private void i(boolean z2) {
        if (z2 == this.dR0) {
            return;
        }
        this.dR0 = z2;
        T t3 = this.f57384M;
        int i2 = t3.f57506O;
        if (z2 || i2 == 4 || i2 == 1) {
            this.f57384M = t3.nr(z2);
        } else {
            this.f57387S.sendEmptyMessage(2);
        }
    }

    private void iF(Timeline timeline, boolean z2) throws Throwable {
        int i2;
        MediaSource.MediaPeriodId mediaPeriodId;
        long j2;
        Timeline timeline2;
        long j3;
        boolean z3;
        Timeline timeline3;
        long j4;
        int i3;
        Timeline timeline4;
        I28 i28C = C(timeline, this.f57384M, this.piY, this.P5, this.f57381GR, this.Nxk, this.f57394e, this.f57390X);
        MediaSource.MediaPeriodId mediaPeriodId2 = i28C.f57405n;
        long j5 = i28C.f57406t;
        boolean z4 = i28C.nr;
        long jJk = i28C.rl;
        int i5 = 1;
        boolean z5 = (this.f57384M.rl.equals(mediaPeriodId2) && jJk == this.f57384M.f57508o) ? false : true;
        Timeline timeline5 = null;
        try {
            if (i28C.f57404O) {
                if (this.f57384M.f57506O != 1) {
                    T3L(4);
                }
                ijL(false, false, false, true);
            }
            try {
                if (z5) {
                    timeline3 = timeline;
                    i5 = -1;
                    i2 = 4;
                    if (!timeline3.isEmpty()) {
                        for (C1887t c1887tCk = this.P5.ck(); c1887tCk != null; c1887tCk = c1887tCk.mUb()) {
                            if (c1887tCk.J2.f57703n.equals(mediaPeriodId2)) {
                                c1887tCk.J2 = this.P5.r(timeline3, c1887tCk.J2);
                                c1887tCk.g();
                            }
                        }
                        jJk = Jk(mediaPeriodId2, jJk, z4);
                    }
                } else {
                    try {
                        try {
                            i2 = 4;
                            try {
                                i5 = -1;
                                try {
                                    timeline3 = timeline;
                                    if (!this.P5.E2(timeline, this.ijL, XQ())) {
                                        ul(false);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    timeline5 = timeline;
                                    mediaPeriodId = mediaPeriodId2;
                                    j2 = j5;
                                    timeline2 = timeline5;
                                    T t3 = this.f57384M;
                                    Timeline timeline6 = t3.f57507n;
                                    MediaSource.MediaPeriodId mediaPeriodId3 = t3.rl;
                                    Timeline timeline7 = timeline2;
                                    uG(timeline7, mediaPeriodId, timeline6, mediaPeriodId3, i28C.J2 ? jJk : -9223372036854775807L);
                                    if (z5 || j2 != this.f57384M.f57510t) {
                                        T t4 = this.f57384M;
                                        Object obj = t4.rl.periodUid;
                                        Timeline timeline8 = t4.f57507n;
                                        if (!z5 || !z2 || timeline8.isEmpty() || timeline8.getPeriodByUid(obj, this.f57390X).isPlaceholder) {
                                            j3 = j2;
                                            z3 = false;
                                        } else {
                                            j3 = j2;
                                            z3 = true;
                                        }
                                        this.f57384M = X(mediaPeriodId, jJk, j3, this.f57384M.nr, z3, timeline7.getIndexOfPeriod(obj) == i5 ? i2 : 3);
                                    }
                                    m();
                                    ofS(timeline7, this.f57384M.f57507n);
                                    this.f57384M = this.f57384M.mUb(timeline7);
                                    if (!timeline7.isEmpty()) {
                                        this.piY = null;
                                    }
                                    te(false);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                timeline5 = timeline;
                                i5 = -1;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            timeline5 = timeline;
                            i5 = -1;
                            i2 = 4;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        timeline5 = timeline;
                        i5 = -1;
                        i2 = 4;
                    }
                }
                T t5 = this.f57384M;
                uG(timeline3, mediaPeriodId2, t5.f57507n, t5.rl, i28C.J2 ? jJk : -9223372036854775807L);
                if (z5 || j5 != this.f57384M.f57510t) {
                    T t6 = this.f57384M;
                    Object obj2 = t6.rl.periodUid;
                    Timeline timeline9 = t6.f57507n;
                    boolean z6 = z5 && z2 && !timeline9.isEmpty() && !timeline9.getPeriodByUid(obj2, this.f57390X).isPlaceholder;
                    long j6 = this.f57384M.nr;
                    if (timeline3.getIndexOfPeriod(obj2) == i5) {
                        j4 = j5;
                        i3 = i2;
                    } else {
                        j4 = j5;
                        i3 = 3;
                    }
                    timeline4 = timeline3;
                    this.f57384M = X(mediaPeriodId2, jJk, j4, j6, z6, i3);
                } else {
                    timeline4 = timeline3;
                }
                m();
                ofS(timeline4, this.f57384M.f57507n);
                this.f57384M = this.f57384M.mUb(timeline4);
                if (!timeline4.isEmpty()) {
                    this.piY = null;
                }
                te(false);
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            i5 = -1;
            i2 = 4;
            mediaPeriodId = mediaPeriodId2;
            j2 = j5;
            timeline2 = timeline;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3 A[PHI: r4 r5 r7
      0x00a3: PHI (r4v3 com.google.android.exoplayer2.source.MediaSource$MediaPeriodId) = 
      (r4v2 com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)
      (r4v8 com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)
     binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r5v2 long) = (r5v1 long), (r5v5 long) binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void ijL(boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        this.f57387S.removeMessages(2);
        this.xg = null;
        this.f57393a = false;
        this.f57402v.J2();
        this.ijL = MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
        for (Renderer renderer : this.f57398n) {
            try {
                xMQ(renderer);
            } catch (ExoPlaybackException | RuntimeException e2) {
                Log.e("ExoPlayerImplInternal", "Disable failed.", e2);
            }
        }
        if (z2) {
            for (Renderer renderer2 : this.f57398n) {
                if (this.f57401t.remove(renderer2)) {
                    try {
                        renderer2.reset();
                    } catch (RuntimeException e3) {
                        Log.e("ExoPlayerImplInternal", "Reset failed.", e3);
                    }
                }
            }
        }
        this.f57403z = 0;
        T t3 = this.f57384M;
        MediaSource.MediaPeriodId mediaPeriodId = t3.rl;
        long jLongValue = t3.f57508o;
        long j2 = (this.f57384M.rl.isAd() || rV9(this.f57384M, this.f57390X)) ? this.f57384M.f57510t : this.f57384M.f57508o;
        if (z3) {
            this.piY = null;
            Pair pairS = S(this.f57384M.f57507n);
            mediaPeriodId = (MediaSource.MediaPeriodId) pairS.first;
            jLongValue = ((Long) pairS.second).longValue();
            j2 = -9223372036854775807L;
            z6 = !mediaPeriodId.equals(this.f57384M.rl);
        }
        long j3 = jLongValue;
        MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodId;
        this.P5.J2();
        this.f57382I = false;
        T t4 = this.f57384M;
        Timeline timeline = t4.f57507n;
        int i2 = t4.f57506O;
        ExoPlaybackException exoPlaybackException = z5 ? null : t4.J2;
        TrackGroupArray trackGroupArray = z6 ? TrackGroupArray.EMPTY : t4.KN;
        TrackSelectorResult trackSelectorResult = z6 ? this.f57400r : t4.xMQ;
        List listR = z6 ? com.google.common.collect.nKK.r() : t4.mUb;
        T t5 = this.f57384M;
        this.f57384M = new T(timeline, mediaPeriodId2, j2, j3, i2, exoPlaybackException, false, trackGroupArray, trackSelectorResult, listR, mediaPeriodId2, t5.qie, t5.az, t5.ty, j3, 0L, j3, this.dR0, false);
        if (z4) {
            this.M7.aYN();
        }
    }

    private boolean jB(long j2, long j3) {
        if (this.dR0 && this.f57396k) {
            return false;
        }
        fcU(j2, j3);
        return true;
    }

    private void k(int i2, int i3, ShuffleOrder shuffleOrder) throws Throwable {
        this.f57380FX.incrementPendingOperationAcks(1);
        iF(this.M7.nY(i2, i3, shuffleOrder), false);
    }

    private void kSg(PlaybackParameters playbackParameters) throws ExoPlaybackException {
        this.f57402v.setPlaybackParameters(playbackParameters);
        e(this.f57402v.getPlaybackParameters(), true);
    }

    private void m() {
        C1887t c1887tCk = this.P5.ck();
        this.f57378D = c1887tCk != null && c1887tCk.J2.KN && this.f57383J;
    }

    private void mI(ShuffleOrder shuffleOrder) throws Throwable {
        this.f57380FX.incrementPendingOperationAcks(1);
        iF(this.M7.iF(shuffleOrder), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void mUb() throws ExoPlaybackException, IOException {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean zJB;
        boolean z5;
        long jUptimeMillis = this.jB.uptimeMillis();
        xVH();
        int i3 = this.f57384M.f57506O;
        boolean z6 = true;
        if (i3 == 1 || i3 == 4) {
            this.f57387S.removeMessages(2);
            return;
        }
        C1887t c1887tCk = this.P5.ck();
        if (c1887tCk == null) {
            fcU(jUptimeMillis, 10L);
            return;
        }
        TraceUtil.beginSection("doSomeWork");
        EF();
        if (c1887tCk.nr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            c1887tCk.f58261n.discardBuffer(this.f57384M.f57508o - this.f57388T, this.f57385N);
            z3 = true;
            z4 = true;
            int i5 = 0;
            while (true) {
                Renderer[] rendererArr = this.f57398n;
                if (i5 >= rendererArr.length) {
                    break;
                }
                Renderer renderer = rendererArr[i5];
                if (wTp(renderer)) {
                    z5 = z6;
                    renderer.render(this.ijL, jElapsedRealtime);
                    z3 = (z3 && renderer.isEnded()) ? z5 : false;
                    boolean z7 = c1887tCk.f58262t[i5] != renderer.getStream() ? z5 : false;
                    boolean z9 = (z7 || ((z7 || !renderer.hasReadStreamToEnd()) ? false : z5) || renderer.isReady() || renderer.isEnded()) ? z5 : false;
                    z4 = (z4 && z9) ? z5 : false;
                    if (!z9) {
                        renderer.maybeThrowStreamError();
                    }
                } else {
                    z5 = z6;
                }
                i5++;
                z6 = z5;
            }
            z2 = z6;
        } else {
            z2 = true;
            c1887tCk.f58261n.maybeThrowPrepareError();
            z3 = true;
            z4 = true;
        }
        long j2 = c1887tCk.J2.f57702O;
        boolean z10 = (z3 && c1887tCk.nr && (j2 == -9223372036854775807L || j2 <= this.f57384M.f57508o)) ? z2 : false;
        if (z10 && this.f57378D) {
            this.f57378D = false;
            ER(false, this.f57384M.az, false, 5);
        }
        if (z10 && c1887tCk.J2.xMQ) {
            T3L(4);
            X4T();
        } else if (this.f57384M.f57506O == 2 && f(z4)) {
            T3L(3);
            this.xg = null;
            if (Uf()) {
                Qu();
            }
        } else if (this.f57384M.f57506O == 3 && (this.f57403z != 0 ? !z4 : !v())) {
            this.f57393a = Uf();
            T3L(2);
            if (this.f57393a) {
                D();
                this.p5.notifyRebuffer();
            }
            X4T();
        }
        if (this.f57384M.f57506O == 2) {
            int i7 = 0;
            while (true) {
                Renderer[] rendererArr2 = this.f57398n;
                if (i7 >= rendererArr2.length) {
                    break;
                }
                if (wTp(rendererArr2[i7]) && this.f57398n[i7].getStream() == c1887tCk.f58262t[i7]) {
                    this.f57398n[i7].maybeThrowStreamError();
                }
                i7++;
            }
            T t3 = this.f57384M;
            if (t3.Uo || t3.f57509r >= 500000 || !s7N()) {
                this.ofS = -9223372036854775807L;
            } else if (this.ofS == -9223372036854775807L) {
                this.ofS = this.jB.elapsedRealtime();
            } else if (this.jB.elapsedRealtime() - this.ofS >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        boolean z11 = this.dR0;
        T t4 = this.f57384M;
        if (z11 != t4.HI) {
            this.f57384M = t4.nr(z11);
        }
        if ((Uf() && this.f57384M.f57506O == 3) || (i2 = this.f57384M.f57506O) == 2) {
            zJB = jB(jUptimeMillis, 10L) ^ z2;
        } else {
            if (this.f57403z == 0 || i2 == 4) {
                this.f57387S.removeMessages(2);
            } else {
                fcU(jUptimeMillis, 1000L);
            }
            zJB = false;
        }
        T t5 = this.f57384M;
        if (t5.ck != zJB) {
            this.f57384M = t5.xMQ(zJB);
        }
        this.f57396k = false;
        TraceUtil.endSection();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #2 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:36:0x00be, B:40:0x00d0, B:44:0x00d8), top: B:94:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void n1(Wre wre) throws Throwable {
        long jLongValue;
        MediaSource.MediaPeriodId mediaPeriodIdG;
        long j2;
        boolean z2;
        long j3;
        boolean z3;
        MediaSource.MediaPeriodId mediaPeriodId;
        long j4;
        MediaSource.MediaPeriodId mediaPeriodId2;
        long adjustedSeekPositionUs;
        T t3;
        int i2;
        int i3;
        boolean z4;
        long j5;
        MediaSource.MediaPeriodId mediaPeriodId3;
        long j6;
        long jJk;
        T t4;
        Timeline timeline;
        MediaSource.MediaPeriodId mediaPeriodId4;
        long j7;
        ExoPlayerImplInternal exoPlayerImplInternal = this;
        exoPlayerImplInternal.f57380FX.incrementPendingOperationAcks(1);
        Pair pairMx = Mx(exoPlayerImplInternal.f57384M.f57507n, wre, true, exoPlayerImplInternal.f57381GR, exoPlayerImplInternal.Nxk, exoPlayerImplInternal.f57394e, exoPlayerImplInternal.f57390X);
        try {
            if (pairMx == null) {
                Pair pairS = exoPlayerImplInternal.S(exoPlayerImplInternal.f57384M.f57507n);
                mediaPeriodIdG = (MediaSource.MediaPeriodId) pairS.first;
                jLongValue = ((Long) pairS.second).longValue();
                z2 = !exoPlayerImplInternal.f57384M.f57507n.isEmpty();
                j3 = -9223372036854775807L;
            } else {
                Object obj = pairMx.first;
                jLongValue = ((Long) pairMx.second).longValue();
                long j9 = wre.f57411t == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                mediaPeriodIdG = exoPlayerImplInternal.P5.g(exoPlayerImplInternal.f57384M.f57507n, obj, jLongValue);
                if (!mediaPeriodIdG.isAd()) {
                    j2 = 0;
                    z2 = wre.f57411t == -9223372036854775807L;
                    j3 = j9;
                    if (!exoPlayerImplInternal.f57384M.f57507n.isEmpty()) {
                        exoPlayerImplInternal.piY = wre;
                    } else if (pairMx == null) {
                        if (exoPlayerImplInternal.f57384M.f57506O != 1) {
                            exoPlayerImplInternal.T3L(4);
                        }
                        exoPlayerImplInternal.ijL(false, true, false, true);
                    } else {
                        try {
                            try {
                                try {
                                    if (mediaPeriodIdG.equals(exoPlayerImplInternal.f57384M.rl)) {
                                        try {
                                            C1887t c1887tCk = exoPlayerImplInternal.P5.ck();
                                            adjustedSeekPositionUs = (c1887tCk == null || !c1887tCk.nr || jLongValue == j2) ? jLongValue : c1887tCk.f58261n.getAdjustedSeekPositionUs(jLongValue, exoPlayerImplInternal.f57379E);
                                            mediaPeriodId2 = mediaPeriodIdG;
                                            try {
                                                if (Util.usToMs(adjustedSeekPositionUs) != Util.usToMs(exoPlayerImplInternal.f57384M.f57508o) || ((i2 = (t3 = exoPlayerImplInternal.f57384M).f57506O) != 2 && i2 != 3)) {
                                                    z3 = z2;
                                                }
                                                long j10 = t3.f57508o;
                                                i3 = 2;
                                                z4 = z2;
                                                j5 = j10;
                                                mediaPeriodId3 = mediaPeriodId2;
                                                j6 = j10;
                                                exoPlayerImplInternal.f57384M = exoPlayerImplInternal.X(mediaPeriodId3, j6, j3, j5, z4, i3);
                                                return;
                                            } catch (Throwable th) {
                                                th = th;
                                                z3 = z2;
                                                mediaPeriodId = mediaPeriodId2;
                                                j4 = jLongValue;
                                                exoPlayerImplInternal.f57384M = exoPlayerImplInternal.X(mediaPeriodId, j4, j3, j4, z3, 2);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            z3 = z2;
                                            mediaPeriodId2 = mediaPeriodIdG;
                                        }
                                    } else {
                                        z3 = z2;
                                        mediaPeriodId2 = mediaPeriodIdG;
                                        adjustedSeekPositionUs = jLongValue;
                                    }
                                    exoPlayerImplInternal.uG(timeline, mediaPeriodId4, timeline, t4.rl, j7);
                                    mediaPeriodId3 = mediaPeriodId4;
                                    j3 = j7;
                                    j6 = jJk;
                                    z4 = z2;
                                    i3 = 2;
                                    j5 = j6;
                                    exoPlayerImplInternal = this;
                                    exoPlayerImplInternal.f57384M = exoPlayerImplInternal.X(mediaPeriodId3, j6, j3, j5, z4, i3);
                                    return;
                                } catch (Throwable th3) {
                                    th = th3;
                                    mediaPeriodId = mediaPeriodId4;
                                    j3 = j7;
                                    z3 = z2;
                                    j4 = jJk;
                                    exoPlayerImplInternal.f57384M = exoPlayerImplInternal.X(mediaPeriodId, j4, j3, j4, z3, 2);
                                    throw th;
                                }
                                t4 = exoPlayerImplInternal.f57384M;
                                timeline = t4.f57507n;
                                mediaPeriodId4 = mediaPeriodId2;
                                j7 = j3;
                            } catch (Throwable th4) {
                                th = th4;
                                mediaPeriodId = mediaPeriodId2;
                            }
                            jJk = exoPlayerImplInternal.Jk(mediaPeriodId2, adjustedSeekPositionUs, exoPlayerImplInternal.f57384M.f57506O == 4);
                            z2 = z3 | (jLongValue != jJk);
                        } catch (Throwable th5) {
                            th = th5;
                            mediaPeriodId = mediaPeriodId2;
                            j4 = jLongValue;
                            exoPlayerImplInternal.f57384M = exoPlayerImplInternal.X(mediaPeriodId, j4, j3, j4, z3, 2);
                            throw th;
                        }
                    }
                    mediaPeriodId3 = mediaPeriodIdG;
                    j6 = jLongValue;
                    z4 = z2;
                    i3 = 2;
                    j5 = j6;
                    exoPlayerImplInternal = this;
                    exoPlayerImplInternal.f57384M = exoPlayerImplInternal.X(mediaPeriodId3, j6, j3, j5, z4, i3);
                    return;
                }
                exoPlayerImplInternal.f57384M.f57507n.getPeriodByUid(mediaPeriodIdG.periodUid, exoPlayerImplInternal.f57390X);
                jLongValue = exoPlayerImplInternal.f57390X.getFirstAdIndexToPlay(mediaPeriodIdG.adGroupIndex) == mediaPeriodIdG.adIndexInAdGroup ? exoPlayerImplInternal.f57390X.getAdResumePositionUs() : 0L;
                z2 = true;
                j3 = j9;
            }
            if (!exoPlayerImplInternal.f57384M.f57507n.isEmpty()) {
            }
            mediaPeriodId3 = mediaPeriodIdG;
            j6 = jLongValue;
            z4 = z2;
            i3 = 2;
            j5 = j6;
            exoPlayerImplInternal = this;
            exoPlayerImplInternal.f57384M = exoPlayerImplInternal.X(mediaPeriodId3, j6, j3, j5, z4, i3);
            return;
        } catch (Throwable th6) {
            th = th6;
            z3 = z2;
            mediaPeriodId = mediaPeriodIdG;
        }
        j2 = 0;
    }

    private void nY(MediaPeriod mediaPeriod) {
        if (this.P5.S(mediaPeriod)) {
            this.P5.aYN(this.ijL);
            bzg();
        }
    }

    private void p5() {
        C1887t c1887tIk = this.P5.Ik();
        if (c1887tIk != null) {
            int i2 = 0;
            if (c1887tIk.mUb() == null || this.f57378D) {
                if (!c1887tIk.J2.xMQ && !this.f57378D) {
                    return;
                }
                while (true) {
                    Renderer[] rendererArr = this.f57398n;
                    if (i2 >= rendererArr.length) {
                        return;
                    }
                    Renderer renderer = rendererArr[i2];
                    SampleStream sampleStream = c1887tIk.f58262t[i2];
                    if (sampleStream != null && renderer.getStream() == sampleStream && renderer.hasReadStreamToEnd()) {
                        long j2 = c1887tIk.J2.f57702O;
                        GD(renderer, (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? -9223372036854775807L : c1887tIk.qie() + c1887tIk.J2.f57702O);
                    }
                    i2++;
                }
            } else if (N() && (c1887tIk.mUb().nr || this.ijL >= c1887tIk.mUb().az())) {
                TrackSelectorResult trackSelectorResultHI = c1887tIk.HI();
                C1887t c1887tT = this.P5.t();
                TrackSelectorResult trackSelectorResultHI2 = c1887tT.HI();
                Timeline timeline = this.f57384M.f57507n;
                uG(timeline, c1887tT.J2.f57703n, timeline, c1887tIk.J2.f57703n, -9223372036854775807L);
                if (c1887tT.nr && c1887tT.f58261n.readDiscontinuity() != -9223372036854775807L) {
                    HV(c1887tT.az());
                    return;
                }
                for (int i3 = 0; i3 < this.f57398n.length; i3++) {
                    boolean zIsRendererEnabled = trackSelectorResultHI.isRendererEnabled(i3);
                    boolean zIsRendererEnabled2 = trackSelectorResultHI2.isRendererEnabled(i3);
                    if (zIsRendererEnabled && !this.f57398n[i3].isCurrentStreamFinal()) {
                        boolean z2 = this.f57386O[i3].getTrackType() == -2;
                        RendererConfiguration rendererConfiguration = trackSelectorResultHI.rendererConfigurations[i3];
                        RendererConfiguration rendererConfiguration2 = trackSelectorResultHI2.rendererConfigurations[i3];
                        if (!zIsRendererEnabled2 || !rendererConfiguration2.equals(rendererConfiguration) || z2) {
                            GD(this.f57398n[i3], c1887tT.az());
                        }
                    }
                }
            }
        }
    }

    private static boolean pJg(Ml ml, Timeline timeline, Timeline timeline2, int i2, boolean z2, Timeline.Window window, Timeline.Period period) {
        Object obj = ml.J2;
        if (obj == null) {
            Pair pairMx = Mx(timeline, new Wre(ml.f57408n.getTimeline(), ml.f57408n.getMediaItemIndex(), ml.f57408n.getPositionMs() == Long.MIN_VALUE ? -9223372036854775807L : Util.msToUs(ml.f57408n.getPositionMs())), false, i2, z2, window, period);
            if (pairMx == null) {
                return false;
            }
            ml.rl(timeline.getIndexOfPeriod(pairMx.first), ((Long) pairMx.second).longValue(), pairMx.first);
            if (ml.f57408n.getPositionMs() == Long.MIN_VALUE) {
                xg(timeline, ml, window, period);
            }
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            return false;
        }
        if (ml.f57408n.getPositionMs() == Long.MIN_VALUE) {
            xg(timeline, ml, window, period);
            return true;
        }
        ml.f57409t = indexOfPeriod;
        timeline2.getPeriodByUid(ml.J2, period);
        if (period.isPlaceholder && timeline2.getWindow(period.windowIndex, window).firstPeriodIndex == timeline2.getIndexOfPeriod(ml.J2)) {
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(ml.J2, period).windowIndex, ml.f57407O + period.getPositionInWindowUs());
            ml.rl(timeline.getIndexOfPeriod(periodPositionUs.first), ((Long) periodPositionUs.second).longValue(), periodPositionUs.first);
        }
        return true;
    }

    private void piY() throws ExoPlaybackException {
        int i2;
        float f3 = this.f57402v.getPlaybackParameters().speed;
        C1887t c1887tIk = this.P5.Ik();
        boolean z2 = true;
        for (C1887t c1887tCk = this.P5.ck(); c1887tCk != null && c1887tCk.nr; c1887tCk = c1887tCk.mUb()) {
            TrackSelectorResult trackSelectorResultS = c1887tCk.S(f3, this.f57384M.f57507n);
            if (!trackSelectorResultS.isEquivalent(c1887tCk.HI())) {
                if (z2) {
                    C1887t c1887tCk2 = this.P5.ck();
                    boolean zViF = this.P5.ViF(c1887tCk2);
                    boolean[] zArr = new boolean[this.f57398n.length];
                    long jRl = c1887tCk2.rl(trackSelectorResultS, this.f57384M.f57508o, zViF, zArr);
                    T t3 = this.f57384M;
                    boolean z3 = (t3.f57506O == 4 || jRl == t3.f57508o) ? false : true;
                    T t4 = this.f57384M;
                    i2 = 4;
                    this.f57384M = X(t4.rl, jRl, t4.f57510t, t4.nr, z3, 5);
                    if (z3) {
                        eTf(jRl);
                    }
                    boolean[] zArr2 = new boolean[this.f57398n.length];
                    int i3 = 0;
                    while (true) {
                        Renderer[] rendererArr = this.f57398n;
                        if (i3 >= rendererArr.length) {
                            break;
                        }
                        Renderer renderer = rendererArr[i3];
                        boolean zWTp = wTp(renderer);
                        zArr2[i3] = zWTp;
                        SampleStream sampleStream = c1887tCk2.f58262t[i3];
                        if (zWTp) {
                            if (sampleStream != renderer.getStream()) {
                                xMQ(renderer);
                            } else if (zArr[i3]) {
                                renderer.resetPosition(this.ijL);
                            }
                        }
                        i3++;
                    }
                    az(zArr2);
                } else {
                    i2 = 4;
                    this.P5.ViF(c1887tCk);
                    if (c1887tCk.nr) {
                        c1887tCk.n(trackSelectorResultS, Math.max(c1887tCk.J2.rl, c1887tCk.ViF(this.ijL)), false);
                    }
                }
                te(true);
                if (this.f57384M.f57506O != i2) {
                    bzg();
                    EF();
                    this.f57387S.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (c1887tCk == c1887tIk) {
                z2 = false;
            }
        }
    }

    private void qie() throws ExoPlaybackException {
        az(new boolean[this.f57398n.length]);
    }

    private long r() {
        T t3 = this.f57384M;
        return Z(t3.f57507n, t3.rl.periodUid, t3.f57508o);
    }

    private static boolean rV9(T t3, Timeline.Period period) {
        MediaSource.MediaPeriodId mediaPeriodId = t3.rl;
        Timeline timeline = t3.f57507n;
        return timeline.isEmpty() || timeline.getPeriodByUid(mediaPeriodId.periodUid, period).isPlaceholder;
    }

    private boolean s7N() {
        C1887t c1887tMUb = this.P5.mUb();
        return (c1887tMUb == null || c1887tMUb.gh() == Long.MIN_VALUE) ? false : true;
    }

    private void tFV(boolean z2) throws ExoPlaybackException {
        this.Nxk = z2;
        if (!this.P5.X(this.f57384M.f57507n, z2)) {
            ul(true);
        }
        te(false);
    }

    private void te(boolean z2) {
        C1887t c1887tMUb = this.P5.mUb();
        MediaSource.MediaPeriodId mediaPeriodId = c1887tMUb == null ? this.f57384M.rl : c1887tMUb.J2.f57703n;
        boolean zEquals = this.f57384M.gh.equals(mediaPeriodId);
        if (!zEquals) {
            this.f57384M = this.f57384M.rl(mediaPeriodId);
        }
        T t3 = this.f57384M;
        t3.Ik = c1887tMUb == null ? t3.f57508o : c1887tMUb.xMQ();
        this.f57384M.f57509r = aYN();
        if ((!zEquals || z2) && c1887tMUb != null && c1887tMUb.nr) {
            JVN(c1887tMUb.ty(), c1887tMUb.HI());
        }
    }

    private void ul(boolean z2) throws ExoPlaybackException {
        MediaSource.MediaPeriodId mediaPeriodId = this.P5.ck().J2.f57703n;
        long jRl = Rl(mediaPeriodId, this.f57384M.f57508o, true, false);
        if (jRl != this.f57384M.f57508o) {
            T t3 = this.f57384M;
            this.f57384M = X(mediaPeriodId, jRl, t3.f57510t, t3.nr, z2, 5);
        }
    }

    private boolean v() {
        C1887t c1887tCk = this.P5.ck();
        long j2 = c1887tCk.J2.f57702O;
        if (c1887tCk.nr) {
            return j2 == -9223372036854775807L || this.f57384M.f57508o < j2 || !Uf();
        }
        return false;
    }

    private void xVH() throws ExoPlaybackException {
        if (this.f57384M.f57507n.isEmpty() || !this.M7.o()) {
            return;
        }
        P5();
        p5();
        eF();
        M7();
    }

    private static void xg(Timeline timeline, Ml ml, Timeline.Window window, Timeline.Period period) {
        int i2 = timeline.getWindow(timeline.getPeriodByUid(ml.J2, period).windowIndex, window).lastPeriodIndex;
        Object obj = timeline.getPeriod(i2, period, true).uid;
        long j2 = period.durationUs;
        ml.rl(i2, j2 != -9223372036854775807L ? j2 - 1 : Long.MAX_VALUE, obj);
    }

    private boolean z() throws ExoPlaybackException {
        C1887t c1887tIk = this.P5.Ik();
        TrackSelectorResult trackSelectorResultHI = c1887tIk.HI();
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            Renderer[] rendererArr = this.f57398n;
            if (i2 >= rendererArr.length) {
                return !z2;
            }
            Renderer renderer = rendererArr[i2];
            if (wTp(renderer)) {
                boolean z3 = renderer.getStream() != c1887tIk.f58262t[i2];
                if (!trackSelectorResultHI.isRendererEnabled(i2) || z3) {
                    if (!renderer.isCurrentStreamFinal()) {
                        renderer.replaceStream(o(trackSelectorResultHI.selections[i2]), c1887tIk.f58262t[i2], c1887tIk.az(), c1887tIk.qie());
                    } else if (renderer.isEnded()) {
                        xMQ(renderer);
                    } else {
                        z2 = true;
                    }
                }
            }
            i2++;
        }
    }

    public void FX(int i2, int i3, int i5, ShuffleOrder shuffleOrder) {
        this.f57387S.obtainMessage(19, new w6(i2, i3, i5, shuffleOrder)).sendToTarget();
    }

    public void HBN() {
        this.f57387S.obtainMessage(6).sendToTarget();
    }

    public void HI(long j2) {
        this.pJg = j2;
    }

    public void I() {
        this.f57387S.obtainMessage(0).sendToTarget();
    }

    public void J2(int i2, List list, ShuffleOrder shuffleOrder) {
        this.f57387S.obtainMessage(18, i2, 0, new n(list, shuffleOrder, -1, -9223372036854775807L, null)).sendToTarget();
    }

    public void K(boolean z2) {
        this.f57387S.obtainMessage(23, z2 ? 1 : 0, 0).sendToTarget();
    }

    public void QZ6(boolean z2) {
        this.f57387S.obtainMessage(12, z2 ? 1 : 0, 0).sendToTarget();
    }

    public void UhV(List list, int i2, long j2, ShuffleOrder shuffleOrder) {
        this.f57387S.obtainMessage(17, new n(list, shuffleOrder, i2, j2, null)).sendToTarget();
    }

    public void VwL(ShuffleOrder shuffleOrder) {
        this.f57387S.obtainMessage(21, shuffleOrder).sendToTarget();
    }

    public void W(int i2) {
        this.f57387S.obtainMessage(11, i2, 0).sendToTarget();
    }

    public Looper WPU() {
        return this.E2;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        this.f57387S.obtainMessage(9, mediaPeriod).sendToTarget();
    }

    public void a63(SeekParameters seekParameters) {
        this.f57387S.obtainMessage(5, seekParameters).sendToTarget();
    }

    public void ck(boolean z2) {
        this.f57387S.obtainMessage(24, z2 ? 1 : 0, 0).sendToTarget();
    }

    public void dR0(int i2, int i3, ShuffleOrder shuffleOrder) {
        this.f57387S.obtainMessage(20, i2, i3, shuffleOrder).sendToTarget();
    }

    public void eWT(Timeline timeline, int i2, long j2) {
        this.f57387S.obtainMessage(3, new Wre(timeline, i2, j2)).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i2;
        C1887t c1887tIk;
        try {
            switch (message.what) {
                case 0:
                    GR();
                    break;
                case 1:
                    ER(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    mUb();
                    break;
                case 3:
                    n1((Wre) message.obj);
                    break;
                case 4:
                    kSg((PlaybackParameters) message.obj);
                    break;
                case 5:
                    F((SeekParameters) message.obj);
                    break;
                case 6:
                    UF(false, true);
                    break;
                case 7:
                    Y();
                    return true;
                case 8:
                    fD((MediaPeriod) message.obj);
                    break;
                case 9:
                    nY((MediaPeriod) message.obj);
                    break;
                case 10:
                    piY();
                    break;
                case 11:
                    RQ(message.arg1);
                    break;
                case 12:
                    tFV(message.arg1 != 0);
                    break;
                case 13:
                    EWS(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    qm((PlayerMessage) message.obj);
                    break;
                case 15:
                    Org((PlayerMessage) message.obj);
                    break;
                case 16:
                    e((PlaybackParameters) message.obj, false);
                    break;
                case 17:
                    hRu((n) message.obj);
                    break;
                case 18:
                    O((n) message.obj, message.arg1);
                    break;
                case 19:
                    M((w6) message.obj);
                    break;
                case 20:
                    k(message.arg1, message.arg2, (ShuffleOrder) message.obj);
                    break;
                case 21:
                    mI((ShuffleOrder) message.obj);
                    break;
                case 22:
                    E();
                    break;
                case 23:
                    How(message.arg1 != 0);
                    break;
                case 24:
                    i(message.arg1 == 1);
                    break;
                case 25:
                    Uo();
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e2) {
            e = e2;
            if (e.type == 1 && (c1887tIk = this.P5.Ik()) != null) {
                e = e.copyWithMediaPeriodId(c1887tIk.J2.f57703n);
            }
            if (e.isRecoverable && this.xg == null) {
                Log.w("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.xg = e;
                HandlerWrapper handlerWrapper = this.f57387S;
                handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.xg;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.xg;
                }
                Log.e("ExoPlayerImplInternal", "Playback error", e);
                UF(true, false);
                this.f57384M = this.f57384M.J2(e);
            }
        } catch (ParserException e3) {
            int i3 = e3.dataType;
            if (i3 == 1) {
                i2 = e3.contentIsMalformed ? 3001 : 3003;
            } else {
                if (i3 == 4) {
                    i2 = e3.contentIsMalformed ? 3002 : 3004;
                }
                g(e3, i);
            }
            i = i2;
            g(e3, i);
        } catch (DrmSession.DrmSessionException e4) {
            g(e4, e4.errorCode);
        } catch (BehindLiveWindowException e5) {
            g(e5, 1002);
        } catch (DataSourceException e6) {
            g(e6, e6.reason);
        } catch (IOException e7) {
            g(e7, 2000);
        } catch (RuntimeException e8) {
            ExoPlaybackException exoPlaybackExceptionCreateForUnexpected = ExoPlaybackException.createForUnexpected(e8, ((e8 instanceof IllegalStateException) || (e8 instanceof IllegalArgumentException)) ? 1004 : 1000);
            Log.e("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionCreateForUnexpected);
            UF(true, false);
            this.f57384M = this.f57384M.J2(exoPlaybackExceptionCreateForUnexpected);
        }
        Xw();
        return true;
    }

    public void lLA(PlaybackParameters playbackParameters) {
        this.f57387S.obtainMessage(4, playbackParameters).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.DefaultMediaClock.PlaybackParametersListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        this.f57387S.obtainMessage(16, playbackParameters).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.MediaSourceList.MediaSourceListInfoRefreshListener
    public void onPlaylistUpdateRequested() {
        this.f57387S.sendEmptyMessage(22);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        this.f57387S.obtainMessage(8, mediaPeriod).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        this.f57387S.sendEmptyMessage(10);
    }

    public void tUK(boolean z2, int i2) {
        this.f57387S.obtainMessage(1, z2 ? 1 : 0, i2).sendToTarget();
    }

    private boolean Bu() {
        C1887t c1887tCk;
        C1887t c1887tMUb;
        if (!Uf() || this.f57378D || (c1887tCk = this.P5.ck()) == null || (c1887tMUb = c1887tCk.mUb()) == null || this.ijL < c1887tMUb.az() || !c1887tMUb.Uo) {
            return false;
        }
        return true;
    }

    static Object G7(Timeline.Window window, Timeline.Period period, int i2, boolean z2, Object obj, Timeline timeline, Timeline timeline2) {
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        int periodCount = timeline.getPeriodCount();
        int i3 = 0;
        int nextPeriodIndex = indexOfPeriod;
        int indexOfPeriod2 = -1;
        while (i3 < periodCount && indexOfPeriod2 == -1) {
            Timeline.Window window2 = window;
            Timeline.Period period2 = period;
            int i5 = i2;
            boolean z3 = z2;
            Timeline timeline3 = timeline;
            nextPeriodIndex = timeline3.getNextPeriodIndex(nextPeriodIndex, period2, window2, i5, z3);
            if (nextPeriodIndex == -1) {
                break;
            }
            indexOfPeriod2 = timeline2.getIndexOfPeriod(timeline3.getUidOfPeriod(nextPeriodIndex));
            i3++;
            timeline = timeline3;
            period = period2;
            window = window2;
            i2 = i5;
            z2 = z3;
        }
        if (indexOfPeriod2 == -1) {
            return null;
        }
        return timeline2.getUidOfPeriod(indexOfPeriod2);
    }

    private void GD(Renderer renderer, long j2) {
        renderer.setCurrentStreamFinal();
        if (renderer instanceof TextRenderer) {
            ((TextRenderer) renderer).setFinalStreamEndPositionUs(j2);
        }
    }

    private void KN(PlayerMessage playerMessage) {
        if (playerMessage.isCanceled()) {
            return;
        }
        try {
            playerMessage.getTarget().handleMessage(playerMessage.getType(), playerMessage.getPayload());
        } finally {
            playerMessage.markAsProcessed(true);
        }
    }

    private void Org(final PlayerMessage playerMessage) {
        Looper looper = playerMessage.getLooper();
        if (!looper.getThread().isAlive()) {
            Log.w("TAG", "Trying to send message on a dead thread.");
            playerMessage.markAsProcessed(false);
        } else {
            this.jB.createHandler(looper, null).post(new Runnable() { // from class: com.google.android.exoplayer2.pq
                @Override // java.lang.Runnable
                public final void run() {
                    ExoPlayerImplInternal.rl(this.f58047n, playerMessage);
                }
            });
        }
    }

    private long Rl(MediaSource.MediaPeriodId mediaPeriodId, long j2, boolean z2, boolean z3) throws ExoPlaybackException {
        X4T();
        this.f57393a = false;
        if (z3 || this.f57384M.f57506O == 3) {
            T3L(2);
        }
        C1887t c1887tCk = this.P5.ck();
        C1887t c1887tMUb = c1887tCk;
        while (c1887tMUb != null && !mediaPeriodId.equals(c1887tMUb.J2.f57703n)) {
            c1887tMUb = c1887tMUb.mUb();
        }
        if (z2 || c1887tCk != c1887tMUb || (c1887tMUb != null && c1887tMUb.nY(j2) < 0)) {
            for (Renderer renderer : this.f57398n) {
                xMQ(renderer);
            }
            if (c1887tMUb != null) {
                while (this.P5.ck() != c1887tMUb) {
                    this.P5.rl();
                }
                this.P5.ViF(c1887tMUb);
                c1887tMUb.aYN(MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US);
                qie();
            }
        }
        if (c1887tMUb != null) {
            this.P5.ViF(c1887tMUb);
            if (!c1887tMUb.nr) {
                c1887tMUb.J2 = c1887tMUb.J2.rl(j2);
            } else if (c1887tMUb.f58260O) {
                j2 = c1887tMUb.f58261n.seekToUs(j2);
                c1887tMUb.f58261n.discardBuffer(j2 - this.f57388T, this.f57385N);
            }
            eTf(j2);
            bzg();
        } else {
            this.P5.J2();
            eTf(j2);
        }
        te(false);
        this.f57387S.sendEmptyMessage(2);
        return j2;
    }

    private Pair S(Timeline timeline) {
        long adResumePositionUs = 0;
        if (timeline.isEmpty()) {
            return Pair.create(T.qie(), 0L);
        }
        Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.f57394e, this.f57390X, timeline.getFirstWindowIndex(this.Nxk), -9223372036854775807L);
        MediaSource.MediaPeriodId mediaPeriodIdG = this.P5.g(timeline, periodPositionUs.first, 0L);
        long jLongValue = ((Long) periodPositionUs.second).longValue();
        if (mediaPeriodIdG.isAd()) {
            timeline.getPeriodByUid(mediaPeriodIdG.periodUid, this.f57390X);
            if (mediaPeriodIdG.adIndexInAdGroup == this.f57390X.getFirstAdIndexToPlay(mediaPeriodIdG.adGroupIndex)) {
                adResumePositionUs = this.f57390X.getAdResumePositionUs();
            }
            jLongValue = adResumePositionUs;
        }
        return Pair.create(mediaPeriodIdG, Long.valueOf(jLongValue));
    }

    private boolean T(Renderer renderer, C1887t c1887t) {
        C1887t c1887tMUb = c1887t.mUb();
        if (c1887t.J2.J2 && c1887tMUb.nr) {
            if ((renderer instanceof TextRenderer) || (renderer instanceof MetadataRenderer) || renderer.getReadingPositionUs() >= c1887tMUb.az()) {
                return true;
            }
            return false;
        }
        return false;
    }

    private void bzg() {
        boolean zP0N = p0N();
        this.f57382I = zP0N;
        if (zP0N) {
            this.P5.mUb().nr(this.ijL);
        }
        Zmq();
    }

    private void g(IOException iOException, int i2) {
        ExoPlaybackException exoPlaybackExceptionCreateForSource = ExoPlaybackException.createForSource(iOException, i2);
        C1887t c1887tCk = this.P5.ck();
        if (c1887tCk != null) {
            exoPlaybackExceptionCreateForSource = exoPlaybackExceptionCreateForSource.copyWithMediaPeriodId(c1887tCk.J2.f57703n);
        }
        Log.e("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionCreateForSource);
        UF(false, false);
        this.f57384M = this.f57384M.J2(exoPlaybackExceptionCreateForSource);
    }

    private void mYa(PlayerMessage playerMessage) {
        if (playerMessage.getLooper() == this.E2) {
            KN(playerMessage);
            int i2 = this.f57384M.f57506O;
            if (i2 != 3 && i2 != 2) {
                return;
            }
            this.f57387S.sendEmptyMessage(2);
            return;
        }
        this.f57387S.obtainMessage(15, playerMessage).sendToTarget();
    }

    private void ofS(Timeline timeline, Timeline timeline2) {
        if (timeline.isEmpty() && timeline2.isEmpty()) {
            return;
        }
        int size = this.Xw.size() - 1;
        while (size >= 0) {
            Timeline timeline3 = timeline;
            Timeline timeline4 = timeline2;
            if (!pJg((Ml) this.Xw.get(size), timeline3, timeline4, this.f57381GR, this.Nxk, this.f57394e, this.f57390X)) {
                ((Ml) this.Xw.get(size)).f57408n.markAsProcessed(false);
                this.Xw.remove(size);
            }
            size--;
            timeline = timeline3;
            timeline2 = timeline4;
        }
        Collections.sort(this.Xw);
    }

    private boolean p0N() {
        long jViF;
        if (!s7N()) {
            return false;
        }
        C1887t c1887tMUb = this.P5.mUb();
        long jViF2 = ViF(c1887tMUb.gh());
        if (c1887tMUb == this.P5.ck()) {
            jViF = c1887tMUb.ViF(this.ijL);
        } else {
            jViF = c1887tMUb.ViF(this.ijL) - c1887tMUb.J2.rl;
        }
        return this.f57399o.shouldContinueLoading(jViF, jViF2, this.f57402v.getPlaybackParameters().speed);
    }

    private void qm(PlayerMessage playerMessage) {
        if (playerMessage.getPositionMs() == -9223372036854775807L) {
            mYa(playerMessage);
            return;
        }
        if (this.f57384M.f57507n.isEmpty()) {
            this.Xw.add(new Ml(playerMessage));
            return;
        }
        Ml ml = new Ml(playerMessage);
        Timeline timeline = this.f57384M.f57507n;
        if (pJg(ml, timeline, timeline, this.f57381GR, this.Nxk, this.f57394e, this.f57390X)) {
            this.Xw.add(ml);
            Collections.sort(this.Xw);
        } else {
            playerMessage.markAsProcessed(false);
        }
    }

    public static /* synthetic */ void rl(ExoPlayerImplInternal exoPlayerImplInternal, PlayerMessage playerMessage) {
        exoPlayerImplInternal.getClass();
        try {
            exoPlayerImplInternal.KN(playerMessage);
        } catch (ExoPlaybackException e2) {
            Log.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    private void ty(Renderer renderer) {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private void uG(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline2, MediaSource.MediaPeriodId mediaPeriodId2, long j2) {
        Object obj;
        PlaybackParameters playbackParameters;
        if (!ub(timeline, mediaPeriodId)) {
            if (mediaPeriodId.isAd()) {
                playbackParameters = PlaybackParameters.DEFAULT;
            } else {
                playbackParameters = this.f57384M.ty;
            }
            if (!this.f57402v.getPlaybackParameters().equals(playbackParameters)) {
                this.f57402v.setPlaybackParameters(playbackParameters);
                return;
            }
            return;
        }
        timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.f57390X).windowIndex, this.f57394e);
        this.p5.setLiveConfiguration((MediaItem.LiveConfiguration) Util.castNonNull(this.f57394e.liveConfiguration));
        if (j2 != -9223372036854775807L) {
            this.p5.setTargetLiveOffsetOverrideUs(Z(timeline, mediaPeriodId.periodUid, j2));
            return;
        }
        Object obj2 = this.f57394e.uid;
        if (!timeline2.isEmpty()) {
            obj = timeline2.getWindow(timeline2.getPeriodByUid(mediaPeriodId2.periodUid, this.f57390X).windowIndex, this.f57394e).uid;
        } else {
            obj = null;
        }
        if (!Util.areEqual(obj, obj2)) {
            this.p5.setTargetLiveOffsetOverrideUs(-9223372036854775807L);
        }
    }

    private boolean ub(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (!mediaPeriodId.isAd() && !timeline.isEmpty()) {
            timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.f57390X).windowIndex, this.f57394e);
            if (this.f57394e.isLive()) {
                Timeline.Window window = this.f57394e;
                if (window.isDynamic && window.windowStartTimeMs != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean wTp(Renderer renderer) {
        if (renderer.getState() != 0) {
            return true;
        }
        return false;
    }

    private void xMQ(Renderer renderer) {
        if (!wTp(renderer)) {
            return;
        }
        this.f57402v.n(renderer);
        ty(renderer);
        renderer.disable();
        this.f57403z--;
    }
}
