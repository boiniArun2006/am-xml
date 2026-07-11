package tN;

import i.C2167j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73465n;
    private final C2167j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f73466t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f73465n, w6Var.f73465n) && Intrinsics.areEqual(this.rl, w6Var.rl) && Intrinsics.areEqual(this.f73466t, w6Var.f73466t);
    }

    public w6(String id, C2167j text, List items) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f73465n = id;
        this.rl = text;
        this.f73466t = items;
    }

    public int hashCode() {
        return (((this.f73465n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f73466t.hashCode();
    }

    public final String n() {
        return this.f73465n;
    }

    public final List rl() {
        return this.f73466t;
    }

    public final C2167j t() {
        return this.rl;
    }

    public String toString() {
        return "PremadeContentCategory(id=" + this.f73465n + ", text=" + this.rl + ", items=" + this.f73466t + ")";
    }
}
