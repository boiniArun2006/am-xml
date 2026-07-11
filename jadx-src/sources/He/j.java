package He;

import android.content.Context;
import hOy.n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0135j f3928n = C0135j.f3929n;

    /* JADX INFO: renamed from: He.j$j, reason: collision with other inner class name */
    public static final class C0135j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ C0135j f3929n = new C0135j();

        public final j n(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new KjG.j(n.f67957n.rl(context));
        }

        private C0135j() {
        }
    }

    Object n(String str, Continuation continuation);

    Object nr(Continuation continuation);

    Object rl(Continuation continuation);

    Object t(double d2, Continuation continuation);
}
