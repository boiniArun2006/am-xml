package Lvl;

import Lvl.Wre;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class fuX implements Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConnectivityManager f6240n;
    private final Wre.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j f6241t;

    public static final class j extends ConnectivityManager.NetworkCallback {
        j() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            fuX.this.nr(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            fuX.this.nr(network, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nr(Network network, boolean z2) {
        Network[] allNetworks = this.f6240n.getAllNetworks();
        int length = allNetworks.length;
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Network network2 = allNetworks[i2];
            if (Intrinsics.areEqual(network2, network) ? z2 : t(network2)) {
                z3 = true;
                break;
            }
            i2++;
        }
        this.rl.n(z3);
    }

    private final boolean t(Network network) {
        NetworkCapabilities networkCapabilities = this.f6240n.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    @Override // Lvl.Wre
    public boolean n() {
        for (Network network : this.f6240n.getAllNetworks()) {
            if (t(network)) {
                return true;
            }
        }
        return false;
    }

    @Override // Lvl.Wre
    public void shutdown() {
        this.f6240n.unregisterNetworkCallback(this.f6241t);
    }

    public fuX(ConnectivityManager connectivityManager, Wre.j jVar) {
        this.f6240n = connectivityManager;
        this.rl = jVar;
        j jVar2 = new j();
        this.f6241t = jVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), jVar2);
    }
}
