package JR;

import SpD.Dsr;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nKt.n;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0158j f4570n = C0158j.f4571n;

    /* JADX INFO: renamed from: JR.j$j, reason: collision with other inner class name */
    public static final class C0158j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ C0158j f4571n = new C0158j();

        public static /* synthetic */ j rl(C0158j c0158j, n.InterfaceC1063n interfaceC1063n, v8.j jVar, OkHttpClient okHttpClient, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                okHttpClient = new OkHttpClient();
            }
            return c0158j.n(interfaceC1063n, jVar, okHttpClient);
        }

        public final j n(n.InterfaceC1063n config, v8.j localLogger, OkHttpClient client) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(localLogger, "localLogger");
            Intrinsics.checkNotNullParameter(client, "client");
            return new w6(config.rl(), config.t(), config.J2(), client, localLogger);
        }

        private C0158j() {
        }
    }

    Object n(List list, Dsr dsr, Continuation continuation);
}
