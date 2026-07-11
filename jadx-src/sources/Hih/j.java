package Hih;

import Dk.InterfaceC1335n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0137j f3939n = C0137j.f3940n;

    /* JADX INFO: renamed from: Hih.j$j, reason: collision with other inner class name */
    public static final class C0137j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ C0137j f3940n = new C0137j();

        public final j n(InterfaceC1335n concierge) {
            Intrinsics.checkNotNullParameter(concierge, "concierge");
            return new n(concierge);
        }

        private C0137j() {
        }
    }

    Object n(Continuation continuation);
}
