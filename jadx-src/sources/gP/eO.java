package gP;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f67551n;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Uri f67552t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eO)) {
            return false;
        }
        eO eOVar = (eO) obj;
        return this.f67551n == eOVar.f67551n && this.rl == eOVar.rl && Intrinsics.areEqual(this.f67552t, eOVar.f67552t);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f67551n) * 31) + Boolean.hashCode(this.rl)) * 31;
        Uri uri = this.f67552t;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }

    public final Uri n() {
        return this.f67552t;
    }

    public final boolean rl() {
        return this.rl;
    }

    public final int t() {
        return this.f67551n;
    }

    public String toString() {
        return "FontVariant(weight=" + this.f67551n + ", italic=" + this.rl + ", downloadUri=" + this.f67552t + ")";
    }

    public eO(int i2, boolean z2, Uri uri) {
        this.f67551n = i2;
        this.rl = z2;
        this.f67552t = uri;
    }
}
