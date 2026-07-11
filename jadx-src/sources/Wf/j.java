package Wf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f11550n;
    private final List rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f11550n, jVar.f11550n) && Intrinsics.areEqual(this.rl, jVar.rl);
    }

    public j(String privacyRequestEmail, List privacyRequestEmailCC) {
        Intrinsics.checkNotNullParameter(privacyRequestEmail, "privacyRequestEmail");
        Intrinsics.checkNotNullParameter(privacyRequestEmailCC, "privacyRequestEmailCC");
        this.f11550n = privacyRequestEmail;
        this.rl = privacyRequestEmailCC;
    }

    public int hashCode() {
        return (this.f11550n.hashCode() * 31) + this.rl.hashCode();
    }

    public final String n() {
        return this.f11550n;
    }

    public final List rl() {
        return this.rl;
    }

    public String toString() {
        return "EmailTargets(privacyRequestEmail=" + this.f11550n + ", privacyRequestEmailCC=" + this.rl + ")";
    }
}
