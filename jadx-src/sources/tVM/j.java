package tVM;

import android.content.Context;
import dVI.n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C1180j f73471n = C1180j.f73472n;

    /* JADX INFO: renamed from: tVM.j$j, reason: collision with other inner class name */
    public static final class C1180j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ C1180j f73472n = new C1180j();

        public final j n(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new wgK.j(n.f63502n.rl(context));
        }

        private C1180j() {
        }
    }

    Object n(Continuation continuation);

    Object rl(Continuation continuation);
}
