package IRN;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f4242n;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f4243t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w6(String sessionId, long j2) {
        this(sessionId, j2, null, 4, null);
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f4242n, w6Var.f4242n) && this.rl == w6Var.rl && Intrinsics.areEqual(this.f4243t, w6Var.f4243t);
    }

    public w6(String sessionId, long j2, Map additionalCustomKeys) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(additionalCustomKeys, "additionalCustomKeys");
        this.f4242n = sessionId;
        this.rl = j2;
        this.f4243t = additionalCustomKeys;
    }

    public int hashCode() {
        return (((this.f4242n.hashCode() * 31) + Long.hashCode(this.rl)) * 31) + this.f4243t.hashCode();
    }

    public final Map n() {
        return this.f4243t;
    }

    public final String rl() {
        return this.f4242n;
    }

    public final long t() {
        return this.rl;
    }

    public String toString() {
        return "EventMetadata(sessionId=" + this.f4242n + ", timestamp=" + this.rl + ", additionalCustomKeys=" + this.f4243t + ')';
    }

    public /* synthetic */ w6(String str, long j2, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, (i2 & 4) != 0 ? MapsKt.emptyMap() : map);
    }
}
