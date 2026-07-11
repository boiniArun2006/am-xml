package androidx.core.location;

import android.location.GnssStatus;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RequiresApi
@RestrictTo
class GnssStatusWrapper extends GnssStatusCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final GnssStatus f36463n;

    @RequiresApi
    static class Api26Impl {
    }

    @RequiresApi
    static class Api30Impl {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GnssStatusWrapper) {
            return this.f36463n.equals(((GnssStatusWrapper) obj).f36463n);
        }
        return false;
    }

    public int hashCode() {
        return this.f36463n.hashCode();
    }

    GnssStatusWrapper(Object obj) {
        this.f36463n = (GnssStatus) Preconditions.Uo((GnssStatus) obj);
    }
}
