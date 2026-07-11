package Fqb;

import android.content.Context;
import com.bendingspoons.concierge.domain.entities.Id;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0112j f3219n = C0112j.f3220n;

    /* JADX INFO: renamed from: Fqb.j$j, reason: collision with other inner class name */
    public static final class C0112j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ C0112j f3220n = new C0112j();

        public final j n(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new JLh.j(D2t.n.f1180n.rl(context));
        }

        private C0112j() {
        }
    }

    Object n(Id.Predefined.External.j jVar, Continuation continuation);

    Object rl(Id.Predefined.External external, Continuation continuation);

    Object t(Continuation continuation);
}
