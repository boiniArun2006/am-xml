package androidx.core.location;

import android.location.GnssStatus;
import android.location.GpsStatus;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class GnssStatusCompat {

    public static abstract class Callback {
        public void n(int i2) {
        }

        public void nr() {
        }

        public void rl(GnssStatusCompat gnssStatusCompat) {
        }

        public void t() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ConstellationType {
    }

    public static GnssStatusCompat n(GnssStatus gnssStatus) {
        return new GnssStatusWrapper(gnssStatus);
    }

    public static GnssStatusCompat rl(GpsStatus gpsStatus) {
        return new GpsStatusWrapper(gpsStatus);
    }

    GnssStatusCompat() {
    }
}
