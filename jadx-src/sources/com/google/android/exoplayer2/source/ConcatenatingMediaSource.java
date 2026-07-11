package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractConcatenatedTimeline;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class ConcatenatingMediaSource extends CompositeMediaSource<I28> {
    private static final MediaItem EMPTY_MEDIA_ITEM = new MediaItem.Builder().setUri(Uri.EMPTY).build();
    private static final int MSG_ADD = 0;
    private static final int MSG_MOVE = 2;
    private static final int MSG_ON_COMPLETION = 5;
    private static final int MSG_REMOVE = 1;
    private static final int MSG_SET_SHUFFLE_ORDER = 3;
    private static final int MSG_UPDATE_TIMELINE = 4;
    private final Set<I28> enabledMediaSourceHolders;
    private final boolean isAtomic;
    private final IdentityHashMap<MediaPeriod, I28> mediaSourceByMediaPeriod;
    private final Map<Object, I28> mediaSourceByUid;
    private final List<I28> mediaSourceHolders;

    @GuardedBy
    private final List<I28> mediaSourcesPublic;
    private Set<Ml> nextTimelineUpdateOnCompletionActions;

    @GuardedBy
    private final Set<Ml> pendingOnCompletionActions;

    @Nullable
    @GuardedBy
    private Handler playbackThreadHandler;
    private ShuffleOrder shuffleOrder;
    private boolean timelineUpdateScheduled;
    private final boolean useLazyPreparation;

    static final class I28 {
        public boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f58076O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final MaskingMediaSource f58077n;
        public int nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final List f58078t = new ArrayList();
        public final Object rl = new Object();

        public void n(int i2, int i3) {
            this.nr = i2;
            this.f58076O = i3;
            this.J2 = false;
            this.f58078t.clear();
        }

        public I28(MediaSource mediaSource, boolean z2) {
            this.f58077n = new MaskingMediaSource(mediaSource, z2);
        }
    }

    private static final class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Handler f58079n;
        private final Runnable rl;

        public void n() {
            this.f58079n.post(this.rl);
        }

        public Ml(Handler handler, Runnable runnable) {
            this.f58079n = handler;
            this.rl = runnable;
        }
    }

    private static final class n extends AbstractConcatenatedTimeline {
        private final int[] J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int[] f58082O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private final HashMap f58083Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f58084n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final Object[] f58085o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Timeline[] f58086r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f58087t;

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getChildIndexByChildUid(Object obj) {
            Integer num = (Integer) this.f58083Z.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getChildIndexByPeriodIndex(int i2) {
            return Util.binarySearchFloor(this.f58082O, i2 + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getChildIndexByWindowIndex(int i2) {
            return Util.binarySearchFloor(this.J2, i2 + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected Object getChildUidByChildIndex(int i2) {
            return this.f58085o[i2];
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getFirstPeriodIndexByChildIndex(int i2) {
            return this.f58082O[i2];
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getFirstWindowIndexByChildIndex(int i2) {
            return this.J2[i2];
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return this.f58087t;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected Timeline getTimelineByChildIndex(int i2) {
            return this.f58086r[i2];
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return this.f58084n;
        }

        public n(Collection collection, ShuffleOrder shuffleOrder, boolean z2) {
            super(z2, shuffleOrder);
            int size = collection.size();
            this.f58082O = new int[size];
            this.J2 = new int[size];
            this.f58086r = new Timeline[size];
            this.f58085o = new Object[size];
            this.f58083Z = new HashMap();
            Iterator it = collection.iterator();
            int windowCount = 0;
            int periodCount = 0;
            int i2 = 0;
            while (it.hasNext()) {
                I28 i28 = (I28) it.next();
                this.f58086r[i2] = i28.f58077n.getTimeline();
                this.J2[i2] = windowCount;
                this.f58082O[i2] = periodCount;
                windowCount += this.f58086r[i2].getWindowCount();
                periodCount += this.f58086r[i2].getPeriodCount();
                Object[] objArr = this.f58085o;
                Object obj = i28.rl;
                objArr[i2] = obj;
                this.f58083Z.put(obj, Integer.valueOf(i2));
                i2++;
            }
            this.f58084n = windowCount;
            this.f58087t = periodCount;
        }
    }

    private static final class w6 extends BaseMediaSource {
        private w6() {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public void maybeThrowSourceInfoRefreshError() {
        }

        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        protected void prepareSourceInternal(TransferListener transferListener) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public void releasePeriod(MediaPeriod mediaPeriod) {
        }

        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        protected void releaseSourceInternal() {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public MediaItem getMediaItem() {
            return ConcatenatingMediaSource.EMPTY_MEDIA_ITEM;
        }
    }

    public ConcatenatingMediaSource(MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }

    @GuardedBy
    private void addPublicMediaSources(int i2, Collection<MediaSource> collection, @Nullable Handler handler, @Nullable Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        Iterator<MediaSource> it = collection.iterator();
        while (it.hasNext()) {
            Assertions.checkNotNull(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<MediaSource> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new I28(it2.next(), this.useLazyPreparation));
        }
        this.mediaSourcesPublic.addAll(i2, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new Wre(i2, arrayList, createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private synchronized void dispatchOnCompletionActions(Set<Ml> set) {
        try {
            Iterator<Ml> it = set.iterator();
            while (it.hasNext()) {
                it.next().n();
            }
            this.pendingOnCompletionActions.removeAll(set);
        } catch (Throwable th) {
            throw th;
        }
    }

    @GuardedBy
    private void movePublicMediaSource(int i2, int i3, @Nullable Handler handler, @Nullable Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        List<I28> list = this.mediaSourcesPublic;
        list.add(i3, list.remove(i2));
        if (handler2 != null) {
            handler2.obtainMessage(2, new Wre(i2, Integer.valueOf(i3), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    @GuardedBy
    private void removePublicMediaSources(int i2, int i3, @Nullable Handler handler, @Nullable Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        Util.removeRange(this.mediaSourcesPublic, i2, i3);
        if (handler2 != null) {
            handler2.obtainMessage(1, new Wre(i2, Integer.valueOf(i3), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void scheduleTimelineUpdate() {
        scheduleTimelineUpdate(null);
    }

    @GuardedBy
    private void setPublicShuffleOrder(ShuffleOrder shuffleOrder, @Nullable Handler handler, @Nullable Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        if (handler2 != null) {
            int size = getSize();
            if (shuffleOrder.getLength() != size) {
                shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, size);
            }
            handler2.obtainMessage(3, new Wre(0, shuffleOrder, createOnCompletionAction(handler, runnable))).sendToTarget();
            return;
        }
        if (shuffleOrder.getLength() > 0) {
            shuffleOrder = shuffleOrder.cloneAndClear();
        }
        this.shuffleOrder = shuffleOrder;
        if (runnable == null || handler == null) {
            return;
        }
        handler.post(runnable);
    }

    private void updateTimelineAndScheduleOnCompletionActions() {
        this.timelineUpdateScheduled = false;
        Set<Ml> set = this.nextTimelineUpdateOnCompletionActions;
        this.nextTimelineUpdateOnCompletionActions = new HashSet();
        refreshSourceInfo(new n(this.mediaSourceHolders, this.shuffleOrder, this.isAtomic));
        getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(5, set).sendToTarget();
    }

    public synchronized void addMediaSource(MediaSource mediaSource) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource);
    }

    public synchronized void addMediaSources(Collection<MediaSource> collection) {
        addPublicMediaSources(this.mediaSourcesPublic.size(), collection, null, null);
    }

    public synchronized void clear() {
        removeMediaSourceRange(0, getSize());
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void enableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public synchronized Timeline getInitialTimeline() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new n(this.mediaSourcesPublic, this.shuffleOrder.getLength() != this.mediaSourcesPublic.size() ? this.shuffleOrder.cloneAndClear().cloneAndInsert(0, this.mediaSourcesPublic.size()) : this.shuffleOrder, this.isAtomic);
    }

    public synchronized MediaSource getMediaSource(int i2) {
        return this.mediaSourcesPublic.get(i2).f58077n;
    }

    public synchronized int getSize() {
        return this.mediaSourcesPublic.size();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public boolean isSingleWindow() {
        return false;
    }

    public synchronized void moveMediaSource(int i2, int i3) {
        movePublicMediaSource(i2, i3, null, null);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected synchronized void prepareSourceInternal(@Nullable TransferListener transferListener) {
        try {
            super.prepareSourceInternal(transferListener);
            this.playbackThreadHandler = new Handler(new Handler.Callback() { // from class: com.google.android.exoplayer2.source.n
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return this.f58233n.handleMessage(message);
                }
            });
            if (this.mediaSourcesPublic.isEmpty()) {
                updateTimelineAndScheduleOnCompletionActions();
            } else {
                this.shuffleOrder = this.shuffleOrder.cloneAndInsert(0, this.mediaSourcesPublic.size());
                addMediaSourcesInternal(0, this.mediaSourcesPublic);
                scheduleTimelineUpdate();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected synchronized void releaseSourceInternal() {
        try {
            super.releaseSourceInternal();
            this.mediaSourceHolders.clear();
            this.enabledMediaSourceHolders.clear();
            this.mediaSourceByUid.clear();
            this.shuffleOrder = this.shuffleOrder.cloneAndClear();
            Handler handler = this.playbackThreadHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.playbackThreadHandler = null;
            }
            this.timelineUpdateScheduled = false;
            this.nextTimelineUpdateOnCompletionActions.clear();
            dispatchOnCompletionActions(this.pendingOnCompletionActions);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized MediaSource removeMediaSource(int i2) {
        MediaSource mediaSource;
        mediaSource = getMediaSource(i2);
        removePublicMediaSources(i2, i2 + 1, null, null);
        return mediaSource;
    }

    public synchronized void removeMediaSourceRange(int i2, int i3) {
        removePublicMediaSources(i2, i3, null, null);
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder) {
        setPublicShuffleOrder(shuffleOrder, null, null);
    }

    private static final class Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f58080n;
        public final Object rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Ml f58081t;

        public Wre(int i2, Object obj, Ml ml) {
            this.f58080n = i2;
            this.rl = obj;
            this.f58081t = ml;
        }
    }

    public ConcatenatingMediaSource(boolean z2, MediaSource... mediaSourceArr) {
        this(z2, new ShuffleOrder.DefaultShuffleOrder(0), mediaSourceArr);
    }

    private void addMediaSourceInternal(int i2, I28 i28) {
        if (i2 > 0) {
            I28 i282 = this.mediaSourceHolders.get(i2 - 1);
            i28.n(i2, i282.f58076O + i282.f58077n.getTimeline().getWindowCount());
        } else {
            i28.n(i2, 0);
        }
        correctOffsets(i2, 1, i28.f58077n.getTimeline().getWindowCount());
        this.mediaSourceHolders.add(i2, i28);
        this.mediaSourceByUid.put(i28.rl, i28);
        prepareChildSource(i28, i28.f58077n);
        if (isEnabled() && this.mediaSourceByMediaPeriod.isEmpty()) {
            this.enabledMediaSourceHolders.add(i28);
        } else {
            disableChildSource(i28);
        }
    }

    private void correctOffsets(int i2, int i3, int i5) {
        while (i2 < this.mediaSourceHolders.size()) {
            I28 i28 = this.mediaSourceHolders.get(i2);
            i28.nr += i3;
            i28.f58076O += i5;
            i2++;
        }
    }

    @Nullable
    @GuardedBy
    private Ml createOnCompletionAction(@Nullable Handler handler, @Nullable Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        Ml ml = new Ml(handler, runnable);
        this.pendingOnCompletionActions.add(ml);
        return ml;
    }

    private void disableUnusedMediaSources() {
        Iterator<I28> it = this.enabledMediaSourceHolders.iterator();
        while (it.hasNext()) {
            I28 next = it.next();
            if (next.f58078t.isEmpty()) {
                disableChildSource(next);
                it.remove();
            }
        }
    }

    private void enableMediaSource(I28 i28) {
        this.enabledMediaSourceHolders.add(i28);
        enableChildSource(i28);
    }

    private static Object getPeriodUid(I28 i28, Object obj) {
        return AbstractConcatenatedTimeline.getConcatenatedUid(i28.rl, obj);
    }

    private Handler getPlaybackThreadHandlerOnPlaybackThread() {
        return (Handler) Assertions.checkNotNull(this.playbackThreadHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            Wre wre = (Wre) Util.castNonNull(message.obj);
            this.shuffleOrder = this.shuffleOrder.cloneAndInsert(wre.f58080n, ((Collection) wre.rl).size());
            addMediaSourcesInternal(wre.f58080n, (Collection) wre.rl);
            scheduleTimelineUpdate(wre.f58081t);
        } else if (i2 == 1) {
            Wre wre2 = (Wre) Util.castNonNull(message.obj);
            int i3 = wre2.f58080n;
            int iIntValue = ((Integer) wre2.rl).intValue();
            if (i3 == 0 && iIntValue == this.shuffleOrder.getLength()) {
                this.shuffleOrder = this.shuffleOrder.cloneAndClear();
            } else {
                this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i3, iIntValue);
            }
            for (int i5 = iIntValue - 1; i5 >= i3; i5--) {
                removeMediaSourceInternal(i5);
            }
            scheduleTimelineUpdate(wre2.f58081t);
        } else if (i2 == 2) {
            Wre wre3 = (Wre) Util.castNonNull(message.obj);
            ShuffleOrder shuffleOrder = this.shuffleOrder;
            int i7 = wre3.f58080n;
            ShuffleOrder shuffleOrderCloneAndRemove = shuffleOrder.cloneAndRemove(i7, i7 + 1);
            this.shuffleOrder = shuffleOrderCloneAndRemove;
            this.shuffleOrder = shuffleOrderCloneAndRemove.cloneAndInsert(((Integer) wre3.rl).intValue(), 1);
            moveMediaSourceInternal(wre3.f58080n, ((Integer) wre3.rl).intValue());
            scheduleTimelineUpdate(wre3.f58081t);
        } else if (i2 == 3) {
            Wre wre4 = (Wre) Util.castNonNull(message.obj);
            this.shuffleOrder = (ShuffleOrder) wre4.rl;
            scheduleTimelineUpdate(wre4.f58081t);
        } else if (i2 == 4) {
            updateTimelineAndScheduleOnCompletionActions();
        } else {
            if (i2 != 5) {
                throw new IllegalStateException();
            }
            dispatchOnCompletionActions((Set) Util.castNonNull(message.obj));
        }
        return true;
    }

    private void maybeReleaseChildSource(I28 i28) {
        if (i28.J2 && i28.f58078t.isEmpty()) {
            this.enabledMediaSourceHolders.remove(i28);
            releaseChildSource(i28);
        }
    }

    private void removeMediaSourceInternal(int i2) {
        I28 i28Remove = this.mediaSourceHolders.remove(i2);
        this.mediaSourceByUid.remove(i28Remove.rl);
        correctOffsets(i2, -1, -i28Remove.f58077n.getTimeline().getWindowCount());
        i28Remove.J2 = true;
        maybeReleaseChildSource(i28Remove);
    }

    private void scheduleTimelineUpdate(@Nullable Ml ml) {
        if (!this.timelineUpdateScheduled) {
            getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(4).sendToTarget();
            this.timelineUpdateScheduled = true;
        }
        if (ml != null) {
            this.nextTimelineUpdateOnCompletionActions.add(ml);
        }
    }

    private void updateMediaSourceInternal(I28 i28, Timeline timeline) {
        if (i28.nr + 1 < this.mediaSourceHolders.size()) {
            int windowCount = timeline.getWindowCount() - (this.mediaSourceHolders.get(i28.nr + 1).f58076O - i28.f58076O);
            if (windowCount != 0) {
                correctOffsets(i28.nr + 1, 0, windowCount);
            }
        }
        scheduleTimelineUpdate();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        Object mediaSourceHolderUid = getMediaSourceHolderUid(mediaPeriodId.periodUid);
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid));
        I28 i28 = this.mediaSourceByUid.get(mediaSourceHolderUid);
        if (i28 == null) {
            i28 = new I28(new w6(), this.useLazyPreparation);
            i28.J2 = true;
            prepareChildSource(i28, i28.f58077n);
        }
        enableMediaSource(i28);
        i28.f58078t.add(mediaPeriodIdCopyWithPeriodUid);
        MaskingMediaPeriod maskingMediaPeriodCreatePeriod = i28.f58077n.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, j2);
        this.mediaSourceByMediaPeriod.put(maskingMediaPeriodCreatePeriod, i28);
        disableUnusedMediaSources();
        return maskingMediaPeriodCreatePeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return EMPTY_MEDIA_ITEM;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(I28 i28, MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i2 = 0; i2 < i28.f58078t.size(); i2++) {
            if (((MediaSource.MediaPeriodId) i28.f58078t.get(i2)).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(getPeriodUid(i28, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(I28 i28, int i2) {
        return i2 + i28.f58076O;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public void onChildSourceInfoRefreshed(I28 i28, MediaSource mediaSource, Timeline timeline) {
        updateMediaSourceInternal(i28, timeline);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        I28 i28 = (I28) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod));
        i28.f58077n.releasePeriod(mediaPeriod);
        i28.f58078t.remove(((MaskingMediaPeriod) mediaPeriod).id);
        if (!this.mediaSourceByMediaPeriod.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(i28);
    }

    public ConcatenatingMediaSource(boolean z2, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
        this(z2, false, shuffleOrder, mediaSourceArr);
    }

    private void addMediaSourcesInternal(int i2, Collection<I28> collection) {
        Iterator<I28> it = collection.iterator();
        while (it.hasNext()) {
            addMediaSourceInternal(i2, it.next());
            i2++;
        }
    }

    private static Object getChildPeriodUid(Object obj) {
        return AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(obj);
    }

    private static Object getMediaSourceHolderUid(Object obj) {
        return AbstractConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private void moveMediaSourceInternal(int i2, int i3) {
        int iMin = Math.min(i2, i3);
        int iMax = Math.max(i2, i3);
        int windowCount = this.mediaSourceHolders.get(iMin).f58076O;
        List<I28> list = this.mediaSourceHolders;
        list.add(i3, list.remove(i2));
        while (iMin <= iMax) {
            I28 i28 = this.mediaSourceHolders.get(iMin);
            i28.nr = iMin;
            i28.f58076O = windowCount;
            windowCount += i28.f58077n.getTimeline().getWindowCount();
            iMin++;
        }
    }

    public synchronized void addMediaSource(MediaSource mediaSource, Handler handler, Runnable runnable) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource, handler, runnable);
    }

    public synchronized void clear(Handler handler, Runnable runnable) {
        removeMediaSourceRange(0, getSize(), handler, runnable);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void disableInternal() {
        super.disableInternal();
        this.enabledMediaSourceHolders.clear();
    }

    public synchronized void moveMediaSource(int i2, int i3, Handler handler, Runnable runnable) {
        movePublicMediaSource(i2, i3, handler, runnable);
    }

    public synchronized void removeMediaSourceRange(int i2, int i3, Handler handler, Runnable runnable) {
        removePublicMediaSources(i2, i3, handler, runnable);
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder, Handler handler, Runnable runnable) {
        setPublicShuffleOrder(shuffleOrder, handler, runnable);
    }

    public ConcatenatingMediaSource(boolean z2, boolean z3, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
        for (MediaSource mediaSource : mediaSourceArr) {
            Assertions.checkNotNull(mediaSource);
        }
        this.shuffleOrder = shuffleOrder.getLength() > 0 ? shuffleOrder.cloneAndClear() : shuffleOrder;
        this.mediaSourceByMediaPeriod = new IdentityHashMap<>();
        this.mediaSourceByUid = new HashMap();
        this.mediaSourcesPublic = new ArrayList();
        this.mediaSourceHolders = new ArrayList();
        this.nextTimelineUpdateOnCompletionActions = new HashSet();
        this.pendingOnCompletionActions = new HashSet();
        this.enabledMediaSourceHolders = new HashSet();
        this.isAtomic = z2;
        this.useLazyPreparation = z3;
        addMediaSources(Arrays.asList(mediaSourceArr));
    }

    public synchronized MediaSource removeMediaSource(int i2, Handler handler, Runnable runnable) {
        MediaSource mediaSource;
        mediaSource = getMediaSource(i2);
        removePublicMediaSources(i2, i2 + 1, handler, runnable);
        return mediaSource;
    }

    public synchronized void addMediaSource(int i2, MediaSource mediaSource) {
        addPublicMediaSources(i2, Collections.singletonList(mediaSource), null, null);
    }

    public synchronized void addMediaSources(Collection<MediaSource> collection, Handler handler, Runnable runnable) {
        addPublicMediaSources(this.mediaSourcesPublic.size(), collection, handler, runnable);
    }

    public synchronized void addMediaSources(int i2, Collection<MediaSource> collection) {
        addPublicMediaSources(i2, collection, null, null);
    }

    public synchronized void addMediaSource(int i2, MediaSource mediaSource, Handler handler, Runnable runnable) {
        addPublicMediaSources(i2, Collections.singletonList(mediaSource), handler, runnable);
    }

    public synchronized void addMediaSources(int i2, Collection<MediaSource> collection, Handler handler, Runnable runnable) {
        addPublicMediaSources(i2, collection, handler, runnable);
    }
}
