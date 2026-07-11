package juU;

import android.content.Context;
import com.bendingspoons.pico.domain.entities.PicoEvent;
import java.util.Date;
import juU.w6;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lt.InterfaceC2271j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f69635n = j.f69636n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f69636n = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final Date t() {
            return new Date();
        }

        public final w6 rl(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Egr.j(He.j.f3928n.n(context), InterfaceC2271j.f70573n.n(context), new Function0() { // from class: juU.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w6.j.t();
                }
            }, sJa.w6.rl);
        }

        private j() {
        }
    }

    public interface n {
        void n(PicoEvent picoEvent);
    }

    void n(Ml ml);

    void rl(n nVar);

    Object t(Continuation continuation);
}
