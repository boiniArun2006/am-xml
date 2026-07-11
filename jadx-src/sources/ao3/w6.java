package ao3;

import android.content.Context;
import com.bendingspoons.pico.data.repository.internal.PicoEventDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface w6 extends ao3.j, ao3.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f43084n = j.f43085n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f43085n = new j();

        public final w6 n(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new fwX.j(PicoEventDatabase.INSTANCE.n(context).p5(), 100);
        }

        private j() {
        }
    }

    public static final class n {
        public static ao3.j n(w6 w6Var) {
            Intrinsics.checkNotNull(w6Var, "null cannot be cast to non-null type com.bendingspoons.pico.domain.eventManager.internal.repository.PicoEventDepositManager");
            return w6Var;
        }

        public static ao3.n rl(w6 w6Var) {
            Intrinsics.checkNotNull(w6Var, "null cannot be cast to non-null type com.bendingspoons.pico.domain.eventManager.internal.repository.PicoEventRetriever");
            return w6Var;
        }
    }

    ao3.j nr();

    ao3.n rl();
}
