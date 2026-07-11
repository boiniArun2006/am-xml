package cb;

import HX.Wre;
import android.content.Context;
import cb.InterfaceC1682w6;
import com.bendingspoons.concierge.domain.entities.Id;
import java.util.Date;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cb.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface InterfaceC1682w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f43659n = j.f43660n;

    /* JADX INFO: renamed from: cb.w6$j */
    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f43660n = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final long t() {
            return new Date().getTime();
        }

        public final InterfaceC1682w6 rl(Context context, Map mockedIds, Function0 isUserAtLeast13) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mockedIds, "mockedIds");
            Intrinsics.checkNotNullParameter(isUserAtLeast13, "isUserAtLeast13");
            return new bV.Ml(isUserAtLeast13, Wre.f3910n.nr(context, mockedIds), Fqb.j.f3219n.n(context), new Function0() { // from class: cb.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Long.valueOf(InterfaceC1682w6.j.t());
                }
            }, sJa.w6.rl);
        }

        private j() {
        }
    }

    Object n(Continuation continuation);

    Object nr(Continuation continuation);

    Object rl(Continuation continuation);

    Object t(Id.Predefined.External.j jVar, Continuation continuation);
}
