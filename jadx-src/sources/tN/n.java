package tN;

import android.net.Uri;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class n {
    private final Set J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Set f73462O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73463n;
    private final Uri nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Uri f73464t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f73463n, nVar.f73463n) && Intrinsics.areEqual(this.rl, nVar.rl) && Intrinsics.areEqual(this.f73464t, nVar.f73464t) && Intrinsics.areEqual(this.nr, nVar.nr) && Intrinsics.areEqual(this.f73462O, nVar.f73462O) && Intrinsics.areEqual(this.J2, nVar.J2);
    }

    public n(String id, String text, Uri linkUri, Uri thumbnailUri, Set types, Set tags) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(linkUri, "linkUri");
        Intrinsics.checkNotNullParameter(thumbnailUri, "thumbnailUri");
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f73463n = id;
        this.rl = text;
        this.f73464t = linkUri;
        this.nr = thumbnailUri;
        this.f73462O = types;
        this.J2 = tags;
    }

    public final Set J2() {
        return this.f73462O;
    }

    public final Uri O() {
        return this.nr;
    }

    public int hashCode() {
        return (((((((((this.f73463n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f73464t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f73462O.hashCode()) * 31) + this.J2.hashCode();
    }

    public final String n() {
        return this.f73463n;
    }

    public final String nr() {
        return this.rl;
    }

    public final Uri rl() {
        return this.f73464t;
    }

    public final Set t() {
        return this.J2;
    }

    public String toString() {
        return "LocalizedPremadeContentItem(id=" + this.f73463n + ", text=" + this.rl + ", linkUri=" + this.f73464t + ", thumbnailUri=" + this.nr + ", types=" + this.f73462O + ", tags=" + this.J2 + ")";
    }
}
