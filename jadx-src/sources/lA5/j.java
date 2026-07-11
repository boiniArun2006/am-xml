package lA5;

import GjB.n;
import com.bendingspoons.spidersense.domain.network.entities.NetworkPacket;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C1047j f70388n = C1047j.f70389n;

    /* JADX INFO: renamed from: lA5.j$j, reason: collision with other inner class name */
    public static final class C1047j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ C1047j f70389n = new C1047j();

        public final j n(String appName, n networkEndpoint, OkHttpClient okHttpClient) {
            Intrinsics.checkNotNullParameter(appName, "appName");
            Intrinsics.checkNotNullParameter(networkEndpoint, "networkEndpoint");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            return new Kre.j(appName, Igx.j.INSTANCE.n(networkEndpoint, okHttpClient));
        }

        private C1047j() {
        }
    }

    Object n(NetworkPacket networkPacket, boolean z2, Continuation continuation);

    Object rl(String str, String str2, Continuation continuation);
}
