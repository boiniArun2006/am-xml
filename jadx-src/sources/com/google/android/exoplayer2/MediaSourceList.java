package com.google.android.exoplayer2;

import android.os.Handler;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MaskingMediaPeriod;
import com.google.android.exoplayer2.source.MaskingMediaSource;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class MediaSourceList {
    private final MediaSourceEventListener.EventDispatcher J2;
    private final HashMap KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final MediaSourceListInfoRefreshListener f57466O;
    private final DrmSessionEventListener.EventDispatcher Uo;
    private boolean gh;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PlayerId f57467n;
    private TransferListener qie;
    private final Set xMQ;
    private ShuffleOrder mUb = new ShuffleOrder.DefaultShuffleOrder(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final IdentityHashMap f57468t = new IdentityHashMap();
    private final Map nr = new HashMap();
    private final List rl = new ArrayList();

    public interface MediaSourceListInfoRefreshListener {
        void onPlaylistUpdateRequested();
    }

    private final class j implements MediaSourceEventListener, DrmSessionEventListener {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private DrmSessionEventListener.EventDispatcher f57469O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final w6 f57470n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private MediaSourceEventListener.EventDispatcher f57471t;

        public j(w6 w6Var) {
            this.f57471t = MediaSourceList.this.J2;
            this.f57469O = MediaSourceList.this.Uo;
            this.f57470n = w6Var;
        }

        private boolean n(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodIdTy;
            if (mediaPeriodId != null) {
                mediaPeriodIdTy = MediaSourceList.ty(this.f57470n, mediaPeriodId);
                if (mediaPeriodIdTy == null) {
                    return false;
                }
            } else {
                mediaPeriodIdTy = null;
            }
            int iR = MediaSourceList.r(this.f57470n, i2);
            MediaSourceEventListener.EventDispatcher eventDispatcher = this.f57471t;
            if (eventDispatcher.windowIndex != iR || !Util.areEqual(eventDispatcher.mediaPeriodId, mediaPeriodIdTy)) {
                this.f57471t = MediaSourceList.this.J2.withParameters(iR, mediaPeriodIdTy, 0L);
            }
            DrmSessionEventListener.EventDispatcher eventDispatcher2 = this.f57469O;
            if (eventDispatcher2.windowIndex == iR && Util.areEqual(eventDispatcher2.mediaPeriodId, mediaPeriodIdTy)) {
                return true;
            }
            this.f57469O = MediaSourceList.this.Uo.withParameters(iR, mediaPeriodIdTy);
            return true;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (n(i2, mediaPeriodId)) {
                this.f57471t.downstreamFormatChanged(mediaLoadData);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (n(i2, mediaPeriodId)) {
                this.f57469O.drmKeysLoaded();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (n(i2, mediaPeriodId)) {
                this.f57469O.drmKeysRemoved();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (n(i2, mediaPeriodId)) {
                this.f57469O.drmKeysRestored();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionAcquired(int i2, MediaSource.MediaPeriodId mediaPeriodId, int i3) {
            if (n(i2, mediaPeriodId)) {
                this.f57469O.drmSessionAcquired(i3);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int i2, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            if (n(i2, mediaPeriodId)) {
                this.f57469O.drmSessionManagerError(exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionReleased(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
            if (n(i2, mediaPeriodId)) {
                this.f57469O.drmSessionReleased();
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCanceled(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (n(i2, mediaPeriodId)) {
                this.f57471t.loadCanceled(loadEventInfo, mediaLoadData);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCompleted(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (n(i2, mediaPeriodId)) {
                this.f57471t.loadCompleted(loadEventInfo, mediaLoadData);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadError(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
            if (n(i2, mediaPeriodId)) {
                this.f57471t.loadError(loadEventInfo, mediaLoadData, iOException, z2);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadStarted(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (n(i2, mediaPeriodId)) {
                this.f57471t.loadStarted(loadEventInfo, mediaLoadData);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (n(i2, mediaPeriodId)) {
                this.f57471t.upstreamDiscarded(mediaLoadData);
            }
        }
    }

    static final class w6 implements CM {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public boolean f57474O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final MaskingMediaSource f57475n;
        public int nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final List f57476t = new ArrayList();
        public final Object rl = new Object();

        @Override // com.google.android.exoplayer2.CM
        public Timeline getTimeline() {
            return this.f57475n.getTimeline();
        }

        @Override // com.google.android.exoplayer2.CM
        public Object getUid() {
            return this.rl;
        }

        public void n(int i2) {
            this.nr = i2;
            this.f57474O = false;
            this.f57476t.clear();
        }

        public w6(MediaSource mediaSource, boolean z2) {
            this.f57475n = new MaskingMediaSource(mediaSource, z2);
        }
    }

    private void g(int i2, int i3) {
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            w6 w6Var = (w6) this.rl.remove(i5);
            this.nr.remove(w6Var.rl);
            Uo(i5, -w6Var.f57475n.getTimeline().getWindowCount());
            w6Var.f57474O = true;
            if (this.gh) {
                Z(w6Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.MediaPeriodId ty(w6 w6Var, MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i2 = 0; i2 < w6Var.f57476t.size(); i2++) {
            if (((MediaSource.MediaPeriodId) w6Var.f57476t.get(i2)).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(ck(w6Var, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    public Timeline XQ(int i2, int i3, int i5, ShuffleOrder shuffleOrder) {
        Assertions.checkArgument(i2 >= 0 && i2 <= i3 && i3 <= Ik() && i5 >= 0);
        this.mUb = shuffleOrder;
        if (i2 == i3 || i2 == i5) {
            return xMQ();
        }
        int iMin = Math.min(i2, i5);
        int iMax = Math.max(((i3 - i2) + i5) - 1, i3 - 1);
        int windowCount = ((w6) this.rl.get(iMin)).nr;
        Util.moveItems(this.rl, i2, i3, i5);
        while (iMin <= iMax) {
            w6 w6Var = (w6) this.rl.get(iMin);
            w6Var.nr = windowCount;
            windowCount += w6Var.f57475n.getTimeline().getWindowCount();
            iMin++;
        }
        return xMQ();
    }

    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final MediaSource f57472n;
        public final MediaSource.MediaSourceCaller rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final j f57473t;

        public n(MediaSource mediaSource, MediaSource.MediaSourceCaller mediaSourceCaller, j jVar) {
            this.f57472n = mediaSource;
            this.rl = mediaSourceCaller;
            this.f57473t = jVar;
        }
    }

    private void Uo(int i2, int i3) {
        while (i2 < this.rl.size()) {
            ((w6) this.rl.get(i2)).nr += i3;
            i2++;
        }
    }

    private void WPU(w6 w6Var) {
        MaskingMediaSource maskingMediaSource = w6Var.f57475n;
        MediaSource.MediaSourceCaller mediaSourceCaller = new MediaSource.MediaSourceCaller() { // from class: com.google.android.exoplayer2.crp
            @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
            public final void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
                this.f57706n.f57466O.onPlaylistUpdateRequested();
            }
        };
        j jVar = new j(w6Var);
        this.KN.put(w6Var, new n(maskingMediaSource, mediaSourceCaller, jVar));
        maskingMediaSource.addEventListener(Util.createHandlerForCurrentOrMainLooper(), jVar);
        maskingMediaSource.addDrmEventListener(Util.createHandlerForCurrentOrMainLooper(), jVar);
        maskingMediaSource.prepareSource(mediaSourceCaller, this.qie, this.f57467n);
    }

    private void Z(w6 w6Var) {
        if (w6Var.f57474O && w6Var.f57476t.isEmpty()) {
            n nVar = (n) Assertions.checkNotNull((n) this.KN.remove(w6Var));
            nVar.f57472n.releaseSource(nVar.rl);
            nVar.f57472n.removeEventListener(nVar.f57473t);
            nVar.f57472n.removeDrmEventListener(nVar.f57473t);
            this.xMQ.remove(w6Var);
        }
    }

    private static Object ck(w6 w6Var, Object obj) {
        return AbstractConcatenatedTimeline.getConcatenatedUid(w6Var.rl, obj);
    }

    private void gh() {
        Iterator it = this.xMQ.iterator();
        while (it.hasNext()) {
            w6 w6Var = (w6) it.next();
            if (w6Var.f57476t.isEmpty()) {
                mUb(w6Var);
                it.remove();
            }
        }
    }

    private void mUb(w6 w6Var) {
        n nVar = (n) this.KN.get(w6Var);
        if (nVar != null) {
            nVar.f57472n.disable(nVar.rl);
        }
    }

    private void qie(w6 w6Var) {
        this.xMQ.add(w6Var);
        n nVar = (n) this.KN.get(w6Var);
        if (nVar != null) {
            nVar.f57472n.enable(nVar.rl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(w6 w6Var, int i2) {
        return i2 + w6Var.nr;
    }

    public int Ik() {
        return this.rl.size();
    }

    public MediaPeriod KN(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        Object objHI = HI(mediaPeriodId.periodUid);
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(az(mediaPeriodId.periodUid));
        w6 w6Var = (w6) Assertions.checkNotNull((w6) this.nr.get(objHI));
        qie(w6Var);
        w6Var.f57476t.add(mediaPeriodIdCopyWithPeriodUid);
        MaskingMediaPeriod maskingMediaPeriodCreatePeriod = w6Var.f57475n.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, j2);
        this.f57468t.put(maskingMediaPeriodCreatePeriod, w6Var);
        gh();
        return maskingMediaPeriodCreatePeriod;
    }

    public void S(TransferListener transferListener) {
        Assertions.checkState(!this.gh);
        this.qie = transferListener;
        for (int i2 = 0; i2 < this.rl.size(); i2++) {
            w6 w6Var = (w6) this.rl.get(i2);
            WPU(w6Var);
            this.xMQ.add(w6Var);
        }
        this.gh = true;
    }

    public void ViF(MediaPeriod mediaPeriod) {
        w6 w6Var = (w6) Assertions.checkNotNull((w6) this.f57468t.remove(mediaPeriod));
        w6Var.f57475n.releasePeriod(mediaPeriod);
        w6Var.f57476t.remove(((MaskingMediaPeriod) mediaPeriod).id);
        if (!this.f57468t.isEmpty()) {
            gh();
        }
        Z(w6Var);
    }

    public void aYN() {
        for (n nVar : this.KN.values()) {
            try {
                nVar.f57472n.releaseSource(nVar.rl);
            } catch (RuntimeException e2) {
                Log.e("MediaSourceList", "Failed to release child source.", e2);
            }
            nVar.f57472n.removeEventListener(nVar.f57473t);
            nVar.f57472n.removeDrmEventListener(nVar.f57473t);
        }
        this.KN.clear();
        this.xMQ.clear();
        this.gh = false;
    }

    public Timeline nY(int i2, int i3, ShuffleOrder shuffleOrder) {
        Assertions.checkArgument(i2 >= 0 && i2 <= i3 && i3 <= Ik());
        this.mUb = shuffleOrder;
        g(i2, i3);
        return xMQ();
    }

    public boolean o() {
        return this.gh;
    }

    public Timeline te(List list, ShuffleOrder shuffleOrder) {
        g(0, this.rl.size());
        return J2(this.rl.size(), list, shuffleOrder);
    }

    public Timeline xMQ() {
        if (this.rl.isEmpty()) {
            return Timeline.EMPTY;
        }
        int windowCount = 0;
        for (int i2 = 0; i2 < this.rl.size(); i2++) {
            w6 w6Var = (w6) this.rl.get(i2);
            w6Var.nr = windowCount;
            windowCount += w6Var.f57475n.getTimeline().getWindowCount();
        }
        return new h6y(this.rl, this.mUb);
    }

    public MediaSourceList(MediaSourceListInfoRefreshListener mediaSourceListInfoRefreshListener, AnalyticsCollector analyticsCollector, Handler handler, PlayerId playerId) {
        this.f57467n = playerId;
        this.f57466O = mediaSourceListInfoRefreshListener;
        MediaSourceEventListener.EventDispatcher eventDispatcher = new MediaSourceEventListener.EventDispatcher();
        this.J2 = eventDispatcher;
        DrmSessionEventListener.EventDispatcher eventDispatcher2 = new DrmSessionEventListener.EventDispatcher();
        this.Uo = eventDispatcher2;
        this.KN = new HashMap();
        this.xMQ = new HashSet();
        eventDispatcher.addEventListener(handler, analyticsCollector);
        eventDispatcher2.addEventListener(handler, analyticsCollector);
    }

    private static Object HI(Object obj) {
        return AbstractConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private static Object az(Object obj) {
        return AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(obj);
    }

    public Timeline J2(int i2, List list, ShuffleOrder shuffleOrder) {
        if (!list.isEmpty()) {
            this.mUb = shuffleOrder;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                w6 w6Var = (w6) list.get(i3 - i2);
                if (i3 > 0) {
                    w6 w6Var2 = (w6) this.rl.get(i3 - 1);
                    w6Var.n(w6Var2.nr + w6Var2.f57475n.getTimeline().getWindowCount());
                } else {
                    w6Var.n(0);
                }
                Uo(i3, w6Var.f57475n.getTimeline().getWindowCount());
                this.rl.add(i3, w6Var);
                this.nr.put(w6Var.rl, w6Var);
                if (this.gh) {
                    WPU(w6Var);
                    if (this.f57468t.isEmpty()) {
                        this.xMQ.add(w6Var);
                    } else {
                        mUb(w6Var);
                    }
                }
            }
        }
        return xMQ();
    }

    public Timeline iF(ShuffleOrder shuffleOrder) {
        int iIk = Ik();
        if (shuffleOrder.getLength() != iIk) {
            shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, iIk);
        }
        this.mUb = shuffleOrder;
        return xMQ();
    }
}
