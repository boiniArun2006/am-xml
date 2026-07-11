package Foy;

import GJW.P;
import GJW.vd;
import com.applovin.mediation.MaxAd;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final vd f3192n;
    private final Map rl;

    /* JADX INFO: renamed from: Foy.j$j, reason: collision with other inner class name */
    public final class C0109j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final MaxAd f3193n;
        private final Object rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ j f3194t;

        public C0109j(j jVar, MaxAd ad, Object obj) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            this.f3194t = jVar;
            this.f3193n = ad;
            this.rl = obj;
        }

        public final MaxAd n() {
            return this.f3193n;
        }

        public final Object rl() {
            return this.rl;
        }
    }

    public j(vd scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f3192n = scope;
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
