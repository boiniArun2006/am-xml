package XoT;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function1 f11835n;
    private final ConnectivityManager.NetworkCallback rl;

    public static final class j extends ConnectivityManager.NetworkCallback {
        j() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            Pl.this.n().invoke(Boolean.TRUE);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            Pl.this.n().invoke(Boolean.FALSE);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            Pl.this.n().invoke(Boolean.FALSE);
        }
    }

    public Pl(Function1 cb2) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        this.f11835n = cb2;
        this.rl = new j();
    }

    public final Function1 n() {
        return this.f11835n;
    }

    public final ConnectivityManager.NetworkCallback rl() {
        return this.rl;
    }
}
