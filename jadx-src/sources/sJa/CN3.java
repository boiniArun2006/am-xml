package sJa;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f73193n = j.f73194n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f73194n = new j();

        public final CN3 n(Ml dispatcherProvider, Function1 runnable) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            return new p5A.w6(dispatcherProvider, runnable);
        }

        private j() {
        }
    }

    Object n(Continuation continuation);
}
