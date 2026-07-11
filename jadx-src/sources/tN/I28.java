package tN;

import android.net.Uri;
import i.C2167j;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class I28 {
    private final Set J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Set f73456O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73457n;
    private final Uri nr;
    private final C2167j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Uri f73458t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I28)) {
            return false;
        }
        I28 i28 = (I28) obj;
        return Intrinsics.areEqual(this.f73457n, i28.f73457n) && Intrinsics.areEqual(this.rl, i28.rl) && Intrinsics.areEqual(this.f73458t, i28.f73458t) && Intrinsics.areEqual(this.nr, i28.nr) && Intrinsics.areEqual(this.f73456O, i28.f73456O) && Intrinsics.areEqual(this.J2, i28.J2);
    }

    public I28(String id, C2167j text, Uri linkUri, Uri thumbnailUri, Set types, Set tags) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(linkUri, "linkUri");
        Intrinsics.checkNotNullParameter(thumbnailUri, "thumbnailUri");
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f73457n = id;
        this.rl = text;
        this.f73458t = linkUri;
        this.nr = thumbnailUri;
        this.f73456O = types;
        this.J2 = tags;
    }

    public final Set J2() {
        return this.f73456O;
    }

    public final Uri O() {
        return this.nr;
    }

    public int hashCode() {
        return (((((((((this.f73457n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f73458t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f73456O.hashCode()) * 31) + this.J2.hashCode();
    }

    public final String n() {
        return this.f73457n;
    }

    public final C2167j nr() {
        return this.rl;
    }

    public final Uri rl() {
        return this.f73458t;
    }

    public final Set t() {
        return this.J2;
    }

    public String toString() {
        return "PremadeContentItem(id=" + this.f73457n + ", text=" + this.rl + ", linkUri=" + this.f73458t + ", thumbnailUri=" + this.nr + ", types=" + this.f73456O + ", tags=" + this.J2 + ")";
    }
}
