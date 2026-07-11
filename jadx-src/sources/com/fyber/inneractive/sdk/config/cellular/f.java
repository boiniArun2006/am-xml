package com.fyber.inneractive.sdk.config.cellular;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.a1;
import com.fyber.inneractive.sdk.util.k;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class f extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f53317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f53318b;

    public final void a() {
        this.f53317a = null;
        ConnectivityManager connectivityManager = this.f53318b;
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
            } catch (Throwable th) {
                IAlog.a("failed to unregister network callback", th, new Object[0]);
            }
        }
    }

    public final void b() {
        ConnectivityManager connectivityManager = this.f53318b;
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(this);
            } catch (Throwable th) {
                IAlog.a("failed to register network callback", th, new Object[0]);
            }
        }
    }

    public final void c() {
        ConnectivityManager connectivityManager = this.f53318b;
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
            } catch (Throwable th) {
                IAlog.a("failed to unregister network callback", th, new Object[0]);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    @Override // android.net.ConnectivityManager.NetworkCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        a1 a1Var = a1.UNKNOWN;
        if (networkCapabilities.hasTransport(3)) {
            a1Var = a1.ETHERNET;
        } else if (networkCapabilities.hasTransport(0)) {
            int iK = k.k();
            if (iK != 0) {
                if (iK == 3) {
                    a1Var = a1.MOBILE_3G;
                } else if (iK == 18) {
                    a1Var = a1.WIFI;
                } else if (iK == 20) {
                    a1Var = a1.MOBILE_5G;
                } else if (iK != 5 && iK != 6) {
                    switch (iK) {
                        default:
                            switch (iK) {
                                case 12:
                                case 14:
                                case 15:
                                    break;
                                case 13:
                                    a1Var = a1.MOBILE_4G;
                                    break;
                                default:
                                    a1Var = a1.CELLULAR;
                                    break;
                            }
                        case 8:
                        case 9:
                        case 10:
                            break;
                    }
                }
            }
        } else if (networkCapabilities.hasTransport(1)) {
            a1Var = a1.WIFI;
        }
        h hVar = this.f53317a;
        if (hVar != null) {
            hVar.a(a1Var);
        }
    }

    public f(ConnectivityManager connectivityManager, h hVar) {
        this.f53317a = hVar;
        this.f53318b = connectivityManager;
    }
}
