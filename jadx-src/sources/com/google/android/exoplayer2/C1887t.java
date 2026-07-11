package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.ClippingMediaPeriod;
import com.google.android.exoplayer2.source.EmptySampleStream;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: renamed from: com.google.android.exoplayer2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class C1887t {
    private long HI;
    public cA J2;
    private final boolean[] KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f58260O;
    public boolean Uo;
    private TrackGroupArray az;
    private final MediaSourceList gh;
    private final TrackSelector mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MediaPeriod f58261n;
    public boolean nr;
    private C1887t qie;
    public final Object rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SampleStream[] f58262t;
    private TrackSelectorResult ty;
    private final RendererCapabilities[] xMQ;

    private void Uo(SampleStream[] sampleStreamArr) {
        int i2 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.xMQ;
            if (i2 >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i2].getTrackType() == -2) {
                sampleStreamArr[i2] = null;
            }
            i2++;
        }
    }

    private void t(SampleStream[] sampleStreamArr) {
        int i2 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.xMQ;
            if (i2 >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i2].getTrackType() == -2 && this.ty.isRendererEnabled(i2)) {
                sampleStreamArr[i2] = new EmptySampleStream();
            }
            i2++;
        }
    }

    public void ck(float f3, Timeline timeline) throws ExoPlaybackException {
        this.nr = true;
        this.az = this.f58261n.getTrackGroups();
        TrackSelectorResult trackSelectorResultS = S(f3, timeline);
        cA cAVar = this.J2;
        long jMax = cAVar.rl;
        long j2 = cAVar.f57702O;
        if (j2 != -9223372036854775807L && jMax >= j2) {
            jMax = Math.max(0L, j2 - 1);
        }
        long jN = n(trackSelectorResultS, jMax, false);
        long j3 = this.HI;
        cA cAVar2 = this.J2;
        this.HI = j3 + (cAVar2.rl - jN);
        this.J2 = cAVar2.rl(jN);
    }

    public long rl(TrackSelectorResult trackSelectorResult, long j2, boolean z2, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            boolean z3 = true;
            if (i2 >= trackSelectorResult.length) {
                break;
            }
            boolean[] zArr2 = this.KN;
            if (z2 || !trackSelectorResult.isEquivalent(this.ty, i2)) {
                z3 = false;
            }
            zArr2[i2] = z3;
            i2++;
        }
        Uo(this.f58262t);
        J2();
        this.ty = trackSelectorResult;
        KN();
        long jSelectTracks = this.f58261n.selectTracks(trackSelectorResult.selections, this.KN, this.f58262t, zArr, j2);
        t(this.f58262t);
        this.f58260O = false;
        int i3 = 0;
        while (true) {
            SampleStream[] sampleStreamArr = this.f58262t;
            if (i3 >= sampleStreamArr.length) {
                return jSelectTracks;
            }
            if (sampleStreamArr[i3] != null) {
                Assertions.checkState(trackSelectorResult.isRendererEnabled(i3));
                if (this.xMQ[i3].getTrackType() != -2) {
                    this.f58260O = true;
                }
            } else {
                Assertions.checkState(trackSelectorResult.selections[i3] == null);
            }
            i3++;
        }
    }

    private static void XQ(MediaSourceList mediaSourceList, MediaPeriod mediaPeriod) {
        try {
            if (mediaPeriod instanceof ClippingMediaPeriod) {
                mediaSourceList.ViF(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
            } else {
                mediaSourceList.ViF(mediaPeriod);
            }
        } catch (RuntimeException e2) {
            Log.e("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    private boolean r() {
        return this.qie == null;
    }

    public TrackSelectorResult HI() {
        return this.ty;
    }

    public boolean Ik() {
        if (this.nr) {
            return !this.f58260O || this.f58261n.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public TrackSelectorResult S(float f3, Timeline timeline) throws ExoPlaybackException {
        TrackSelectorResult trackSelectorResultSelectTracks = this.mUb.selectTracks(this.xMQ, ty(), this.J2.f57703n, timeline);
        for (ExoTrackSelection exoTrackSelection : trackSelectorResultSelectTracks.selections) {
            if (exoTrackSelection != null) {
                exoTrackSelection.onPlaybackSpeed(f3);
            }
        }
        return trackSelectorResultSelectTracks;
    }

    public void WPU(C1887t c1887t) {
        if (c1887t == this.qie) {
            return;
        }
        J2();
        this.qie = c1887t;
        KN();
    }

    public void aYN(long j2) {
        this.HI = j2;
    }

    public long az() {
        return this.J2.rl + this.HI;
    }

    public void g() {
        MediaPeriod mediaPeriod = this.f58261n;
        if (mediaPeriod instanceof ClippingMediaPeriod) {
            long j2 = this.J2.nr;
            if (j2 == -9223372036854775807L) {
                j2 = Long.MIN_VALUE;
            }
            ((ClippingMediaPeriod) mediaPeriod).updateClipping(0L, j2);
        }
    }

    public long gh() {
        if (this.nr) {
            return this.f58261n.getNextLoadPositionUs();
        }
        return 0L;
    }

    public C1887t mUb() {
        return this.qie;
    }

    public long n(TrackSelectorResult trackSelectorResult, long j2, boolean z2) {
        return rl(trackSelectorResult, j2, z2, new boolean[this.xMQ.length]);
    }

    public long qie() {
        return this.HI;
    }

    public TrackGroupArray ty() {
        return this.az;
    }

    public long xMQ() {
        if (!this.nr) {
            return this.J2.rl;
        }
        long bufferedPositionUs = this.f58260O ? this.f58261n.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.J2.f57702O : bufferedPositionUs;
    }

    public C1887t(RendererCapabilities[] rendererCapabilitiesArr, long j2, TrackSelector trackSelector, Allocator allocator, MediaSourceList mediaSourceList, cA cAVar, TrackSelectorResult trackSelectorResult) {
        this.xMQ = rendererCapabilitiesArr;
        this.HI = j2;
        this.mUb = trackSelector;
        this.gh = mediaSourceList;
        MediaSource.MediaPeriodId mediaPeriodId = cAVar.f57703n;
        this.rl = mediaPeriodId.periodUid;
        this.J2 = cAVar;
        this.az = TrackGroupArray.EMPTY;
        this.ty = trackSelectorResult;
        this.f58262t = new SampleStream[rendererCapabilitiesArr.length];
        this.KN = new boolean[rendererCapabilitiesArr.length];
        this.f58261n = O(mediaPeriodId, mediaSourceList, allocator, cAVar.rl, cAVar.nr);
    }

    private void J2() {
        if (r()) {
            int i2 = 0;
            while (true) {
                TrackSelectorResult trackSelectorResult = this.ty;
                if (i2 < trackSelectorResult.length) {
                    boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i2);
                    ExoTrackSelection exoTrackSelection = this.ty.selections[i2];
                    if (zIsRendererEnabled && exoTrackSelection != null) {
                        exoTrackSelection.disable();
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    private void KN() {
        if (r()) {
            int i2 = 0;
            while (true) {
                TrackSelectorResult trackSelectorResult = this.ty;
                if (i2 < trackSelectorResult.length) {
                    boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i2);
                    ExoTrackSelection exoTrackSelection = this.ty.selections[i2];
                    if (zIsRendererEnabled && exoTrackSelection != null) {
                        exoTrackSelection.enable();
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    private static MediaPeriod O(MediaSource.MediaPeriodId mediaPeriodId, MediaSourceList mediaSourceList, Allocator allocator, long j2, long j3) {
        MediaPeriod mediaPeriodKN = mediaSourceList.KN(mediaPeriodId, allocator, j2);
        if (j3 != -9223372036854775807L) {
            return new ClippingMediaPeriod(mediaPeriodKN, true, 0L, j3);
        }
        return mediaPeriodKN;
    }

    public long ViF(long j2) {
        return j2 - qie();
    }

    public void Z() {
        J2();
        XQ(this.gh, this.f58261n);
    }

    public long nY(long j2) {
        return j2 + qie();
    }

    public void nr(long j2) {
        Assertions.checkState(r());
        this.f58261n.continueLoading(ViF(j2));
    }

    public void o(long j2) {
        Assertions.checkState(r());
        if (this.nr) {
            this.f58261n.reevaluateBuffer(ViF(j2));
        }
    }
}
