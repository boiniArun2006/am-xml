package Fqb;

import I3c.Ml;
import android.content.Context;
import com.bendingspoons.concierge.domain.entities.Id;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f3221n = j.f3222n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f3222n = new j();

        public final n n(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new JLh.n(I3c.n.f4013n.rl(context), Ml.rl.rl(context));
        }

        private j() {
        }
    }

    Object n(Id.Predefined.Internal.j jVar, Continuation continuation);

    Object rl(Id.Predefined.Internal internal, Continuation continuation);

    Object t(Continuation continuation);
}
