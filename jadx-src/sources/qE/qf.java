package qE;

import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class qf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f72311n;

    public static String KN(Map map) {
        return "SettingsMap(map=" + map + ")";
    }

    public static final Map Uo(Map map, Map other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return rl(MapsKt.plus(map, other));
    }

    public static final /* synthetic */ qf n(Map map) {
        return new qf(map);
    }

    public static boolean nr(Map map, Object obj) {
        return (obj instanceof qf) && Intrinsics.areEqual(map, ((qf) obj).xMQ());
    }

    public static Map rl(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return map;
    }

    public static Map t(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return rl(MapsKt.mapOf((Pair[]) Arrays.copyOf(pairs, pairs.length)));
    }

    public boolean equals(Object obj) {
        return nr(this.f72311n, obj);
    }

    public int hashCode() {
        return J2(this.f72311n);
    }

    public String toString() {
        return KN(this.f72311n);
    }

    public final /* synthetic */ Map xMQ() {
        return this.f72311n;
    }

    private /* synthetic */ qf(Map map) {
        this.f72311n = map;
    }

    public static int J2(Map map) {
        return map.hashCode();
    }

    public static final boolean O(Map map, Map map2) {
        return Intrinsics.areEqual(map, map2);
    }
}
