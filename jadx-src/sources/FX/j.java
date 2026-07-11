package FX;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2629n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f2630t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f2629n, jVar.f2629n) && this.rl == jVar.rl && Intrinsics.areEqual(this.f2630t, jVar.f2630t);
    }

    public j(String profileName, int i2, List socialMediaAccounts) {
        Intrinsics.checkNotNullParameter(profileName, "profileName");
        Intrinsics.checkNotNullParameter(socialMediaAccounts, "socialMediaAccounts");
        this.f2629n = profileName;
        this.rl = i2;
        this.f2630t = socialMediaAccounts;
    }

    public int hashCode() {
        return (((this.f2629n.hashCode() * 31) + Integer.hashCode(this.rl)) * 31) + this.f2630t.hashCode();
    }

    public final int n() {
        return this.rl;
    }

    public final String rl() {
        return this.f2629n;
    }

    public final List t() {
        return this.f2630t;
    }

    public String toString() {
        return "CreatorProfile(profileName=" + this.f2629n + ", importedProjects=" + this.rl + ", socialMediaAccounts=" + this.f2630t + ")";
    }
}
