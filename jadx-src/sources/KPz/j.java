package KPz;

import com.bendingspoons.oracle.models.OracleHttpRequestMethod;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f5303O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f5304n;
    private final Map nr;
    private final OracleHttpRequestMethod rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f5305t;

    public j(String endpoint, OracleHttpRequestMethod method, Map queryParameters, Map headers, Object obj) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f5304n = endpoint;
        this.rl = method;
        this.f5305t = queryParameters;
        this.nr = headers;
        this.f5303O = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f5304n, jVar.f5304n) && this.rl == jVar.rl && Intrinsics.areEqual(this.f5305t, jVar.f5305t) && Intrinsics.areEqual(this.nr, jVar.nr) && Intrinsics.areEqual(this.f5303O, jVar.f5303O);
    }

    public final Map O() {
        return this.f5305t;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f5304n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f5305t.hashCode()) * 31) + this.nr.hashCode()) * 31;
        Object obj = this.f5303O;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final Object n() {
        return this.f5303O;
    }

    public final OracleHttpRequestMethod nr() {
        return this.rl;
    }

    public final String rl() {
        return this.f5304n;
    }

    public final Map t() {
        return this.nr;
    }

    public String toString() {
        return "OracleRequest(endpoint=" + this.f5304n + ", method=" + this.rl + ", queryParameters=" + this.f5305t + ", headers=" + this.nr + ", body=" + this.f5303O + ")";
    }

    public /* synthetic */ j(String str, OracleHttpRequestMethod oracleHttpRequestMethod, Map map, Map map2, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, oracleHttpRequestMethod, (i2 & 4) != 0 ? MapsKt.emptyMap() : map, (i2 & 8) != 0 ? MapsKt.emptyMap() : map2, (i2 & 16) != 0 ? null : obj);
    }
}
