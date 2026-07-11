package SFf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Ew {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f8968O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8969n;
    private final com.bendingspoons.legal.privacy.j nr;
    private final Pr.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f8970t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ew)) {
            return false;
        }
        Ew ew = (Ew) obj;
        return Intrinsics.areEqual(this.f8969n, ew.f8969n) && this.rl == ew.rl && Intrinsics.areEqual(this.f8970t, ew.f8970t) && Intrinsics.areEqual(this.nr, ew.nr) && Intrinsics.areEqual(this.f8968O, ew.f8968O);
    }

    public Ew(String name, Pr.Ml category, String description, com.bendingspoons.legal.privacy.j retentionDuration, List privacyPolicyEntries) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(retentionDuration, "retentionDuration");
        Intrinsics.checkNotNullParameter(privacyPolicyEntries, "privacyPolicyEntries");
        this.f8969n = name;
        this.rl = category;
        this.f8970t = description;
        this.nr = retentionDuration;
        this.f8968O = privacyPolicyEntries;
    }

    public final com.bendingspoons.legal.privacy.j O() {
        return this.nr;
    }

    public int hashCode() {
        return (((((((this.f8969n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f8970t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f8968O.hashCode();
    }

    public final Pr.Ml n() {
        return this.rl;
    }

    public final List nr() {
        return this.f8968O;
    }

    public final String rl() {
        return this.f8970t;
    }

    public final String t() {
        return this.f8969n;
    }

    public String toString() {
        return "TrackerListItem(name=" + this.f8969n + ", category=" + this.rl + ", description=" + this.f8970t + ", retentionDuration=" + this.nr + ", privacyPolicyEntries=" + this.f8968O + ")";
    }
}
