package com.fyber.inneractive.sdk.config.cellular;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.fyber.inneractive.sdk.util.a1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class b extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f53310a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f53311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TelephonyManager f53312c;

    public final void a() {
        this.f53311b = null;
        TelephonyManager telephonyManager = this.f53312c;
        if (telephonyManager != null) {
            telephonyManager.unregisterTelephonyCallback(this);
        }
        this.f53310a.shutdownNow();
    }

    public final void b() {
        TelephonyManager telephonyManager = this.f53312c;
        if (telephonyManager != null) {
            telephonyManager.registerTelephonyCallback(this.f53310a, this);
        }
    }

    public final void c() {
        TelephonyManager telephonyManager = this.f53312c;
        if (telephonyManager != null) {
            telephonyManager.unregisterTelephonyCallback(this);
        }
    }

    public b(TelephonyManager telephonyManager, h hVar) {
        this.f53312c = telephonyManager;
        this.f53311b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        a1 a1Var;
        int networkType = telephonyDisplayInfo.getNetworkType();
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        if (overrideNetworkType != 2 && overrideNetworkType != 3 && overrideNetworkType != 5) {
            if (networkType != 0) {
                if (networkType != 3) {
                    if (networkType != 18) {
                        if (networkType != 20) {
                            if (networkType != 5 && networkType != 6) {
                                switch (networkType) {
                                    default:
                                        switch (networkType) {
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
                        } else {
                            a1Var = a1.MOBILE_5G;
                        }
                    } else {
                        a1Var = a1.WIFI;
                    }
                } else {
                    a1Var = a1.MOBILE_3G;
                }
            } else {
                a1Var = a1.UNKNOWN;
            }
        } else {
            a1Var = a1.MOBILE_5G;
        }
        h hVar = this.f53311b;
        if (hVar != null) {
            hVar.a(a1Var);
        }
    }
}
