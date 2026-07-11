package Fyf;

import Dk.InterfaceC1335n;
import Fyf.w6;
import android.content.Context;
import fb.AbstractC2109j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f3379n = j.rl;

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final w6 nr(Context context, InterfaceC1335n interfaceC1335n, n nVar) {
            return new Ml(context, interfaceC1335n, nVar);
        }

        public final w6 t(final n config, final Context context, final InterfaceC1335n concierge) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(concierge, "concierge");
            return (w6) n(new Function0() { // from class: Fyf.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w6.j.nr(context, concierge, config);
                }
            });
        }

        private j() {
        }
    }

    public interface n {
        Object n(Continuation continuation);
    }

    Object n(Continuation continuation);

    Object rl(Continuation continuation);
}
