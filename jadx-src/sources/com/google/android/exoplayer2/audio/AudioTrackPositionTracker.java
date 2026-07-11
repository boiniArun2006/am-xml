package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.media3.exoplayer.dash.DashMediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class AudioTrackPositionTracker {
    private long E2;
    private long HI;
    private boolean Ik;
    private o J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f57636O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f57637S;
    private int Uo;
    private long ViF;
    private int WPU;
    private long XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private long f57638Z;
    private long aYN;
    private long az;
    private boolean ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f57639e;
    private boolean fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f57640g;
    private boolean gh;
    private long iF;
    private float mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Listener f57641n;
    private long nY;
    private int nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f57642o;
    private long qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f57643r;
    private final long[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AudioTrack f57644t;
    private long te;
    private Method ty;
    private long xMQ;

    public interface Listener {
        void onInvalidLatency(long j2);

        void onPositionAdvancing(long j2);

        void onPositionFramesMismatch(long j2, long j3, long j4, long j5);

        void onSystemTimeUsMismatch(long j2, long j3, long j4, long j5);

        void onUnderrun(int i2, long j2);
    }

    private static boolean HI(int i2) {
        if (Util.SDK_INT < 23) {
            return i2 == 5 || i2 == 6;
        }
        return false;
    }

    private long O() {
        AudioTrack audioTrack = (AudioTrack) Assertions.checkNotNull(this.f57644t);
        if (this.aYN != -9223372036854775807L) {
            return Math.min(this.f57640g, this.nY + ((((SystemClock.elapsedRealtime() * 1000) - this.aYN) * ((long) this.Uo)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.KN) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.XQ = this.f57642o;
            }
            playbackHeadPosition += this.XQ;
        }
        if (Util.SDK_INT <= 29) {
            if (playbackHeadPosition == 0 && this.f57642o > 0 && playState == 3) {
                if (this.ViF == -9223372036854775807L) {
                    this.ViF = SystemClock.elapsedRealtime();
                }
                return this.f57642o;
            }
            this.ViF = -9223372036854775807L;
        }
        if (this.f57642o > playbackHeadPosition) {
            this.f57638Z++;
        }
        this.f57642o = playbackHeadPosition;
        return playbackHeadPosition + (this.f57638Z << 32);
    }

    private boolean n() {
        return this.KN && ((AudioTrack) Assertions.checkNotNull(this.f57644t)).getPlayState() == 2 && O() == 0;
    }

    private void qie(long j2, long j3) {
        o oVar = (o) Assertions.checkNotNull(this.J2);
        if (oVar.O(j2)) {
            long jT2 = oVar.t();
            long jRl = oVar.rl();
            if (Math.abs(jT2 - j2) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.f57641n.onSystemTimeUsMismatch(jRl, jT2, j2, j3);
                oVar.J2();
            } else if (Math.abs(rl(jRl) - j3) <= DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                oVar.n();
            } else {
                this.f57641n.onPositionFramesMismatch(jRl, jT2, j2, j3);
                oVar.J2();
            }
        }
    }

    private void r() {
        this.qie = 0L;
        this.WPU = 0;
        this.f57637S = 0;
        this.az = 0L;
        this.iF = 0L;
        this.f57639e = 0L;
        this.gh = false;
    }

    private void ty(long j2) {
        Method method;
        if (!this.Ik || (method = this.ty) == null || j2 - this.f57643r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) Util.castNonNull((Integer) method.invoke(Assertions.checkNotNull(this.f57644t), new Object[0]))).intValue()) * 1000) - this.xMQ;
            this.HI = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.HI = jMax;
            if (jMax > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.f57641n.onInvalidLatency(jMax);
                this.HI = 0L;
            }
        } catch (Exception unused) {
            this.ty = null;
        }
        this.f57643r = j2;
    }

    public void XQ() {
        ((o) Assertions.checkNotNull(this.J2)).Uo();
    }

    public void Z(float f3) {
        this.mUb = f3;
        o oVar = this.J2;
        if (oVar != null) {
            oVar.Uo();
        }
    }

    public boolean gh(long j2) {
        int playState = ((AudioTrack) Assertions.checkNotNull(this.f57644t)).getPlayState();
        if (this.KN) {
            if (playState == 2) {
                this.ck = false;
                return false;
            }
            if (playState == 1 && O() == 0) {
                return false;
            }
        }
        boolean z2 = this.ck;
        boolean zKN = KN(j2);
        this.ck = zKN;
        if (z2 && !zKN && playState != 1) {
            this.f57641n.onUnderrun(this.f57636O, Util.usToMs(this.xMQ));
        }
        return true;
    }

    public boolean mUb(long j2) {
        return this.ViF != -9223372036854775807L && j2 > 0 && SystemClock.elapsedRealtime() - this.ViF >= 200;
    }

    public long nr(boolean z2) {
        long jJ2;
        if (((AudioTrack) Assertions.checkNotNull(this.f57644t)).getPlayState() == 3) {
            az();
        }
        long jNanoTime = System.nanoTime() / 1000;
        o oVar = (o) Assertions.checkNotNull(this.J2);
        boolean zNr = oVar.nr();
        if (zNr) {
            jJ2 = rl(oVar.rl()) + Util.getMediaDurationForPlayoutDuration(jNanoTime - oVar.t(), this.mUb);
        } else {
            jJ2 = this.WPU == 0 ? J2() : this.qie + jNanoTime;
            if (!z2) {
                jJ2 = Math.max(0L, jJ2 - this.HI);
            }
        }
        if (this.fD != zNr) {
            this.f57639e = this.iF;
            this.E2 = this.te;
        }
        long j2 = jNanoTime - this.f57639e;
        if (j2 < 1000000) {
            long mediaDurationForPlayoutDuration = this.E2 + Util.getMediaDurationForPlayoutDuration(j2, this.mUb);
            long j3 = (j2 * 1000) / 1000000;
            jJ2 = ((jJ2 * j3) + ((1000 - j3) * mediaDurationForPlayoutDuration)) / 1000;
        }
        if (!this.gh) {
            long j4 = this.te;
            if (jJ2 > j4) {
                this.gh = true;
                this.f57641n.onPositionAdvancing(System.currentTimeMillis() - Util.usToMs(Util.getPlayoutDurationForMediaDuration(Util.usToMs(jJ2 - j4), this.mUb)));
            }
        }
        this.iF = jNanoTime;
        this.te = jJ2;
        this.fD = zNr;
        return jJ2;
    }

    public void o(AudioTrack audioTrack, boolean z2, int i2, int i3, int i5) {
        this.f57644t = audioTrack;
        this.nr = i3;
        this.f57636O = i5;
        this.J2 = new o(audioTrack);
        this.Uo = audioTrack.getSampleRate();
        this.KN = z2 && HI(i2);
        boolean zIsEncodingLinearPcm = Util.isEncodingLinearPcm(i2);
        this.Ik = zIsEncodingLinearPcm;
        this.xMQ = zIsEncodingLinearPcm ? rl(i5 / i3) : -9223372036854775807L;
        this.f57642o = 0L;
        this.f57638Z = 0L;
        this.XQ = 0L;
        this.ck = false;
        this.aYN = -9223372036854775807L;
        this.ViF = -9223372036854775807L;
        this.f57643r = 0L;
        this.HI = 0L;
        this.mUb = 1.0f;
    }

    public boolean xMQ() {
        return ((AudioTrack) Assertions.checkNotNull(this.f57644t)).getPlayState() == 3;
    }

    public AudioTrackPositionTracker(Listener listener) {
        this.f57641n = (Listener) Assertions.checkNotNull(listener);
        if (Util.SDK_INT >= 18) {
            try {
                this.ty = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.rl = new long[10];
    }

    private long J2() {
        return rl(O());
    }

    private void az() {
        long jJ2 = J2();
        if (jJ2 != 0) {
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - this.az >= 30000) {
                long[] jArr = this.rl;
                int i2 = this.f57637S;
                jArr[i2] = jJ2 - jNanoTime;
                this.f57637S = (i2 + 1) % 10;
                int i3 = this.WPU;
                if (i3 < 10) {
                    this.WPU = i3 + 1;
                }
                this.az = jNanoTime;
                this.qie = 0L;
                int i5 = 0;
                while (true) {
                    int i7 = this.WPU;
                    if (i5 >= i7) {
                        break;
                    }
                    this.qie += this.rl[i5] / ((long) i7);
                    i5++;
                }
            }
            if (this.KN) {
                return;
            }
            qie(jNanoTime, jJ2);
            ty(jNanoTime);
        }
    }

    private long rl(long j2) {
        return (j2 * 1000000) / ((long) this.Uo);
    }

    public void Ik() {
        r();
        this.f57644t = null;
        this.J2 = null;
    }

    public boolean KN(long j2) {
        if (j2 <= O() && !n()) {
            return false;
        }
        return true;
    }

    public void Uo(long j2) {
        this.nY = O();
        this.aYN = SystemClock.elapsedRealtime() * 1000;
        this.f57640g = j2;
    }

    public boolean ck() {
        r();
        if (this.aYN == -9223372036854775807L) {
            ((o) Assertions.checkNotNull(this.J2)).Uo();
            return true;
        }
        return false;
    }

    public int t(long j2) {
        return this.f57636O - ((int) (j2 - (O() * ((long) this.nr))));
    }
}
