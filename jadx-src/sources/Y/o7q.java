package Y;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class o7q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f11972n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f11973t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7q)) {
            return false;
        }
        o7q o7qVar = (o7q) obj;
        return Intrinsics.areEqual(this.f11972n, o7qVar.f11972n) && Intrinsics.areEqual(this.rl, o7qVar.rl) && Intrinsics.areEqual(this.f11973t, o7qVar.f11973t);
    }

    public o7q(String id, String label, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f11972n = id;
        this.rl = label;
        this.f11973t = str;
    }

    public int hashCode() {
        int iHashCode = ((this.f11972n.hashCode() * 31) + this.rl.hashCode()) * 31;
        String str = this.f11973t;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String n() {
        return this.f11972n;
    }

    public final String rl() {
        return this.rl;
    }

    public final String t() {
        return this.f11973t;
    }

    public String toString() {
        return "EffectSimpleData(id=" + this.f11972n + ", label=" + this.rl + ", presetCode=" + this.f11973t + ")";
    }
}
