package Dj7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class FKk {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f1615n;
    private final Object rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f1616t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FKk)) {
            return false;
        }
        FKk fKk = (FKk) obj;
        return Intrinsics.areEqual(this.f1615n, fKk.f1615n) && Intrinsics.areEqual(this.rl, fKk.rl) && this.f1616t == fKk.f1616t;
    }

    public FKk(String text, Object obj, boolean z2) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f1615n = text;
        this.rl = obj;
        this.f1616t = z2;
    }

    public int hashCode() {
        int iHashCode = this.f1615n.hashCode() * 31;
        Object obj = this.rl;
        return ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + Boolean.hashCode(this.f1616t);
    }

    public final Object n() {
        return this.rl;
    }

    public final String rl() {
        return this.f1615n;
    }

    public final boolean t() {
        return this.f1616t;
    }

    public String toString() {
        return "TabButtonOption(text=" + this.f1615n + ", option=" + this.rl + ", isNew=" + this.f1616t + ")";
    }
}
