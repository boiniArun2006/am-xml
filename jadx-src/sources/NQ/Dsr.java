package NQ;

import GJW.P;
import GJW.vd;
import com.google.android.gms.ads.ResponseInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final vd f7002n;
    private final Map rl;

    public final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f7003n;
        private final ResponseInfo rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final long f7004t;

        public j(Object obj, ResponseInfo responseInfo, long j2) {
            this.f7003n = obj;
            this.rl = responseInfo;
            this.f7004t = j2;
        }

        public final Object n() {
            return this.f7003n;
        }

        public final ResponseInfo rl() {
            return this.rl;
        }

        public final long t() {
            return this.f7004t;
        }
    }

    public Dsr(vd scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f7002n = scope;
        this.rl = new LinkedHashMap();
    }

    public final void nr(String unitId) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
    }

    public final Object t(String str, Continuation continuation) {
        P p2 = (P) this.rl.get(str);
        if (p2 == null) {
            return null;
        }
        if (!p2.isActive() && !p2.isCompleted()) {
            return null;
        }
        Object objAwait = p2.await(continuation);
        return objAwait == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwait : (x0X.n) objAwait;
    }
}
