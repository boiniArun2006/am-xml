package JWs;

import GJW.vd;
import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nKt.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0159j f4601n = C0159j.f4602n;

    /* JADX INFO: renamed from: JWs.j$j, reason: collision with other inner class name */
    public static final class C0159j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ C0159j f4602n = new C0159j();

        public final j n(Context context, n.InterfaceC1063n config, PI.j lifecycleObserver, vd scope) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
            Intrinsics.checkNotNullParameter(scope, "scope");
            return new n(context, config, lifecycleObserver, scope);
        }

        private C0159j() {
        }
    }

    Object n(Continuation continuation);
}
