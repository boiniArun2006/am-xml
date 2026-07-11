package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
class GpsStatusWrapper extends GnssStatusCompat {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private GpsSatellite f36464O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final GpsStatus f36465n;
    private int nr;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Iterator f36466t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GpsStatusWrapper) {
            return this.f36465n.equals(((GpsStatusWrapper) obj).f36465n);
        }
        return false;
    }

    public int hashCode() {
        return this.f36465n.hashCode();
    }

    GpsStatusWrapper(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) Preconditions.Uo(gpsStatus);
        this.f36465n = gpsStatus2;
        this.rl = -1;
        this.f36466t = gpsStatus2.getSatellites().iterator();
        this.nr = -1;
        this.f36464O = null;
    }
}
