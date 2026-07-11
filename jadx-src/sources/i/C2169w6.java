package i;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class C2169w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f68050n;
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f68049t = 8;
    private static final C2169w6 nr = new C2169w6(MapsKt.emptyMap());

    /* JADX INFO: renamed from: i.w6$j */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final C2169w6 n() {
            return C2169w6.nr;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2169w6) && Intrinsics.areEqual(this.f68050n, ((C2169w6) obj).f68050n);
    }

    public C2169w6(Map strings) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        this.f68050n = strings;
    }

    public int hashCode() {
        return this.f68050n.hashCode();
    }

    public final Map rl() {
        return this.f68050n;
    }

    public String toString() {
        return "RemoteLocalization(strings=" + this.f68050n + ")";
    }
}
