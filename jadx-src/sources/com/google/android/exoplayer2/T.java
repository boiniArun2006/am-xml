package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class T {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final MediaSource.MediaPeriodId f57505Z = new MediaSource.MediaPeriodId(new Object());
    public final boolean HI;
    public volatile long Ik;
    public final ExoPlaybackException J2;
    public final TrackGroupArray KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f57506O;
    public final boolean Uo;
    public final int az;
    public final boolean ck;
    public final MediaSource.MediaPeriodId gh;
    public final List mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Timeline f57507n;
    public final long nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile long f57508o;
    public final boolean qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f57509r;
    public final MediaSource.MediaPeriodId rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f57510t;
    public final PlaybackParameters ty;
    public final TrackSelectorResult xMQ;

    public T(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j2, long j3, int i2, ExoPlaybackException exoPlaybackException, boolean z2, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult, List list, MediaSource.MediaPeriodId mediaPeriodId2, boolean z3, int i3, PlaybackParameters playbackParameters, long j4, long j5, long j6, boolean z4, boolean z5) {
        this.f57507n = timeline;
        this.rl = mediaPeriodId;
        this.f57510t = j2;
        this.nr = j3;
        this.f57506O = i2;
        this.J2 = exoPlaybackException;
        this.Uo = z2;
        this.KN = trackGroupArray;
        this.xMQ = trackSelectorResult;
        this.mUb = list;
        this.gh = mediaPeriodId2;
        this.qie = z3;
        this.az = i3;
        this.ty = playbackParameters;
        this.Ik = j4;
        this.f57509r = j5;
        this.f57508o = j6;
        this.HI = z4;
        this.ck = z5;
    }

    public static T gh(TrackSelectorResult trackSelectorResult) {
        Timeline timeline = Timeline.EMPTY;
        MediaSource.MediaPeriodId mediaPeriodId = f57505Z;
        return new T(timeline, mediaPeriodId, -9223372036854775807L, 0L, 1, null, false, TrackGroupArray.EMPTY, trackSelectorResult, com.google.common.collect.nKK.r(), mediaPeriodId, false, 0, PlaybackParameters.DEFAULT, 0L, 0L, 0L, false, false);
    }

    public static MediaSource.MediaPeriodId qie() {
        return f57505Z;
    }

    public T J2(ExoPlaybackException exoPlaybackException) {
        return new T(this.f57507n, this.rl, this.f57510t, this.nr, this.f57506O, exoPlaybackException, this.Uo, this.KN, this.xMQ, this.mUb, this.gh, this.qie, this.az, this.ty, this.Ik, this.f57509r, this.f57508o, this.HI, this.ck);
    }

    public T KN(int i2) {
        return new T(this.f57507n, this.rl, this.f57510t, this.nr, i2, this.J2, this.Uo, this.KN, this.xMQ, this.mUb, this.gh, this.qie, this.az, this.ty, this.Ik, this.f57509r, this.f57508o, this.HI, this.ck);
    }

    public T O(boolean z2, int i2) {
        return new T(this.f57507n, this.rl, this.f57510t, this.nr, this.f57506O, this.J2, this.Uo, this.KN, this.xMQ, this.mUb, this.gh, z2, i2, this.ty, this.Ik, this.f57509r, this.f57508o, this.HI, this.ck);
    }

    public T Uo(PlaybackParameters playbackParameters) {
        return new T(this.f57507n, this.rl, this.f57510t, this.nr, this.f57506O, this.J2, this.Uo, this.KN, this.xMQ, this.mUb, this.gh, this.qie, this.az, playbackParameters, this.Ik, this.f57509r, this.f57508o, this.HI, this.ck);
    }

    public T mUb(Timeline timeline) {
        return new T(timeline, this.rl, this.f57510t, this.nr, this.f57506O, this.J2, this.Uo, this.KN, this.xMQ, this.mUb, this.gh, this.qie, this.az, this.ty, this.Ik, this.f57509r, this.f57508o, this.HI, this.ck);
    }

    public T n(boolean z2) {
        return new T(this.f57507n, this.rl, this.f57510t, this.nr, this.f57506O, this.J2, z2, this.KN, this.xMQ, this.mUb, this.gh, this.qie, this.az, this.ty, this.Ik, this.f57509r, this.f57508o, this.HI, this.ck);
    }

    public T nr(boolean z2) {
        return new T(this.f57507n, this.rl, this.f57510t, this.nr, this.f57506O, this.J2, this.Uo, this.KN, this.xMQ, this.mUb, this.gh, this.qie, this.az, this.ty, this.Ik, this.f57509r, this.f57508o, z2, this.ck);
    }

    public T rl(MediaSource.MediaPeriodId mediaPeriodId) {
        return new T(this.f57507n, this.rl, this.f57510t, this.nr, this.f57506O, this.J2, this.Uo, this.KN, this.xMQ, this.mUb, mediaPeriodId, this.qie, this.az, this.ty, this.Ik, this.f57509r, this.f57508o, this.HI, this.ck);
    }

    public T t(MediaSource.MediaPeriodId mediaPeriodId, long j2, long j3, long j4, long j5, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult, List list) {
        return new T(this.f57507n, mediaPeriodId, j3, j4, this.f57506O, this.J2, this.Uo, trackGroupArray, trackSelectorResult, list, this.gh, this.qie, this.az, this.ty, this.Ik, j5, j2, this.HI, this.ck);
    }

    public T xMQ(boolean z2) {
        return new T(this.f57507n, this.rl, this.f57510t, this.nr, this.f57506O, this.J2, this.Uo, this.KN, this.xMQ, this.mUb, this.gh, this.qie, this.az, this.ty, this.Ik, this.f57509r, this.f57508o, this.HI, z2);
    }
}
