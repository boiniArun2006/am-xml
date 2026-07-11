package tN;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73460n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f73461t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f73460n, jVar.f73460n) && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f73461t, jVar.f73461t);
    }

    public j(String id, String text, List items) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f73460n = id;
        this.rl = text;
        this.f73461t = items;
    }

    public int hashCode() {
        return (((this.f73460n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f73461t.hashCode();
    }

    public final String n() {
        return this.f73460n;
    }

    public final List rl() {
        return this.f73461t;
    }

    public final String t() {
        return this.rl;
    }

    public String toString() {
        return "LocalizedPremadeContentCategory(id=" + this.f73460n + ", text=" + this.rl + ", items=" + this.f73461t + ")";
    }
}
