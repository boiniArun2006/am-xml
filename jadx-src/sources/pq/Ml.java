package pq;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f72040n = new LinkedHashMap();

    public final void J2(String key, w6 value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f72040n.put(key, value.Uo());
    }

    public final void KN(String key, boolean z2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f72040n.put(key, Boolean.valueOf(z2));
    }

    public final void O(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f72040n.put(key, value);
    }

    public final void Uo(String key, Ml value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f72040n.put(key, value.n());
    }

    public boolean equals(Object obj) {
        return obj instanceof Ml ? Intrinsics.areEqual(this.f72040n, ((Ml) obj).f72040n) : super.equals(obj);
    }

    public int hashCode() {
        return this.f72040n.hashCode();
    }

    public final Map n() {
        return this.f72040n;
    }

    public final void nr(String key, Number value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f72040n.put(key, value);
    }

    public final Ml rl(Ml second) {
        Intrinsics.checkNotNullParameter(second, "second");
        Ml ml = new Ml();
        ml.f72040n.putAll(MapsKt.plus(this.f72040n, second.f72040n));
        return ml;
    }

    public final void t(String key, char c2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f72040n.put(key, Character.valueOf(c2));
    }

    public final void xMQ(Ml from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.f72040n.putAll(from.f72040n);
    }

    public String toString() {
        return n().toString();
    }
}
