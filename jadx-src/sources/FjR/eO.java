package FjR;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class eO {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final eO f3020t = new eO(MapsKt.emptyMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f3021n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final eO n(Map map) {
            return new eO(kYF.w6.rl(map), null);
        }
    }

    public /* synthetic */ eO(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eO) && Intrinsics.areEqual(this.f3021n, ((eO) obj).f3021n);
    }

    private eO(Map map) {
        this.f3021n = map;
    }

    public int hashCode() {
        return this.f3021n.hashCode();
    }

    public final Map n() {
        return this.f3021n;
    }

    public String toString() {
        return "Tags(tags=" + this.f3021n + ')';
    }
}
