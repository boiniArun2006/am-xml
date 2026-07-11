package androidx.core.location;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.TimeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class LocationRequestCompat {
    final float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final int f36482O;
    final long Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f36483n;
    final long nr;
    final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final long f36484t;

    private static class Api19Impl {
    }

    @RequiresApi
    private static class Api31Impl {
    }

    public static final class Builder {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Quality {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequestCompat)) {
            return false;
        }
        LocationRequestCompat locationRequestCompat = (LocationRequestCompat) obj;
        return this.f36483n == locationRequestCompat.f36483n && this.rl == locationRequestCompat.rl && this.f36484t == locationRequestCompat.f36484t && this.nr == locationRequestCompat.nr && this.f36482O == locationRequestCompat.f36482O && Float.compare(locationRequestCompat.J2, this.J2) == 0 && this.Uo == locationRequestCompat.Uo;
    }

    public int hashCode() {
        int i2 = this.f36483n * 31;
        long j2 = this.rl;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f36484t;
        return i3 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (this.rl != Long.MAX_VALUE) {
            sb.append("@");
            TimeUtils.rl(this.rl, sb);
            int i2 = this.f36483n;
            if (i2 == 100) {
                sb.append(" HIGH_ACCURACY");
            } else if (i2 == 102) {
                sb.append(" BALANCED");
            } else if (i2 == 104) {
                sb.append(" LOW_POWER");
            }
        } else {
            sb.append("PASSIVE");
        }
        if (this.nr != Long.MAX_VALUE) {
            sb.append(", duration=");
            TimeUtils.rl(this.nr, sb);
        }
        if (this.f36482O != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f36482O);
        }
        long j2 = this.f36484t;
        if (j2 != -1 && j2 < this.rl) {
            sb.append(", minUpdateInterval=");
            TimeUtils.rl(this.f36484t, sb);
        }
        if (this.J2 > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.J2);
        }
        if (this.Uo / 2 > this.rl) {
            sb.append(", maxUpdateDelay=");
            TimeUtils.rl(this.Uo, sb);
        }
        sb.append(']');
        return sb.toString();
    }
}
