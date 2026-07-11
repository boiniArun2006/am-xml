package androidx.core.content;

import android.content.LocusId;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class LocusIdCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f36343n;
    private final LocusId rl;

    @RequiresApi
    private static class Api29Impl {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LocusIdCompat.class != obj.getClass()) {
            return false;
        }
        LocusIdCompat locusIdCompat = (LocusIdCompat) obj;
        String str = this.f36343n;
        return str == null ? locusIdCompat.f36343n == null : str.equals(locusIdCompat.f36343n);
    }

    private String n() {
        return this.f36343n.length() + "_chars";
    }

    public int hashCode() {
        String str = this.f36343n;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public LocusId rl() {
        return this.rl;
    }

    public String toString() {
        return "LocusIdCompat[" + n() + "]";
    }
}
