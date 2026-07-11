package pq;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f72046n = new ArrayList();

    public final void J2(boolean z2) {
        this.f72046n.add(Boolean.valueOf(z2));
    }

    public final void O(Ml value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f72046n.add(value.n());
    }

    public final List Uo() {
        return this.f72046n;
    }

    public boolean equals(Object obj) {
        return obj instanceof w6 ? Intrinsics.areEqual(this.f72046n, ((w6) obj).f72046n) : super.equals(obj);
    }

    public int hashCode() {
        return this.f72046n.hashCode();
    }

    public final void n(char c2) {
        this.f72046n.add(Character.valueOf(c2));
    }

    public final void nr(w6 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f72046n.add(value.Uo());
    }

    public final void rl(Number value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f72046n.add(value);
    }

    public final void t(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f72046n.add(value);
    }

    public String toString() {
        return Uo().toString();
    }
}
