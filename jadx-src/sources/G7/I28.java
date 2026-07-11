package G7;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class I28 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f3380O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f3381n;
    private int nr;
    private long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TimeInterpolator f3382t;

    public I28(long j2, long j3) {
        this.f3382t = null;
        this.nr = 0;
        this.f3380O = 1;
        this.f3381n = j2;
        this.rl = j3;
    }

    static I28 n(ValueAnimator valueAnimator) {
        I28 i28 = new I28(valueAnimator.getStartDelay(), valueAnimator.getDuration(), O(valueAnimator));
        i28.nr = valueAnimator.getRepeatCount();
        i28.f3380O = valueAnimator.getRepeatMode();
        return i28;
    }

    public int J2() {
        return this.nr;
    }

    public int Uo() {
        return this.f3380O;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I28)) {
            return false;
        }
        I28 i28 = (I28) obj;
        if (rl() == i28.rl() && t() == i28.t() && J2() == i28.J2() && Uo() == i28.Uo()) {
            return nr().getClass().equals(i28.nr().getClass());
        }
        return false;
    }

    public TimeInterpolator nr() {
        TimeInterpolator timeInterpolator = this.f3382t;
        return timeInterpolator != null ? timeInterpolator : j.rl;
    }

    public long rl() {
        return this.f3381n;
    }

    public long t() {
        return this.rl;
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + rl() + " duration: " + t() + " interpolator: " + nr().getClass() + " repeatCount: " + J2() + " repeatMode: " + Uo() + QiDPjiOCZHDS.TjzM;
    }

    private static TimeInterpolator O(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return j.f3386t;
            }
            if (interpolator instanceof DecelerateInterpolator) {
                return j.nr;
            }
            return interpolator;
        }
        return j.rl;
    }

    public int hashCode() {
        return (((((((((int) (rl() ^ (rl() >>> 32))) * 31) + ((int) (t() ^ (t() >>> 32)))) * 31) + nr().getClass().hashCode()) * 31) + J2()) * 31) + Uo();
    }

    public I28(long j2, long j3, TimeInterpolator timeInterpolator) {
        this.nr = 0;
        this.f3380O = 1;
        this.f3381n = j2;
        this.rl = j3;
        this.f3382t = timeInterpolator;
    }
}
