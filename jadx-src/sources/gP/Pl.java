package gP;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Pl extends o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f67527n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Pl) && Intrinsics.areEqual(this.f67527n, ((Pl) obj).f67527n);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pl(String filename) {
        super(null);
        Intrinsics.checkNotNullParameter(filename, "filename");
        this.f67527n = filename;
    }

    public int hashCode() {
        return this.f67527n.hashCode();
    }

    public final String n() {
        return this.f67527n;
    }

    public String toString() {
        return "FontSourceLocal(filename=" + this.f67527n + ")";
    }
}
