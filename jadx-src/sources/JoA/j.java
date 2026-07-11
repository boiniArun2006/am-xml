package JoA;

import Dk.InterfaceC1335n;
import GJW.vd;
import android.content.Context;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0162j f4683n = C0162j.f4684n;

    /* JADX INFO: renamed from: JoA.j$j, reason: collision with other inner class name */
    public static final class C0162j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ C0162j f4684n = new C0162j();

        public final j n(Function2 track, InterfaceC1335n concierge, Context context, vd scope, PI.j lifecycleObserver) {
            Intrinsics.checkNotNullParameter(track, "track");
            Intrinsics.checkNotNullParameter(concierge, "concierge");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
            return new I28(track, concierge, context, scope, lifecycleObserver);
        }

        private C0162j() {
        }
    }

    void n();
}
