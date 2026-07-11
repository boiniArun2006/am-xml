package Nh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f7093n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ml) && Intrinsics.areEqual(this.f7093n, ((Ml) obj).f7093n);
    }

    public Ml(List questions) {
        Intrinsics.checkNotNullParameter(questions, "questions");
        this.f7093n = questions;
    }

    public int hashCode() {
        return this.f7093n.hashCode();
    }

    public final List n() {
        return this.f7093n;
    }

    public String toString() {
        return "Survey(questions=" + this.f7093n + ")";
    }
}
