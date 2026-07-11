package com.fyber.inneractive.sdk.util;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public enum a1 {
    UNKNOWN(""),
    ETHERNET("3g"),
    WIFI("wifi"),
    MOBILE_3G("3g"),
    MOBILE_4G("4g"),
    MOBILE_5G("5g"),
    CELLULAR("Cellular");

    public final String key;

    /* JADX WARN: Removed duplicated region for block: B:46:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006e A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a1 a() {
        a1 a1Var;
        NetworkInfo activeNetworkInfo;
        int type = (!o.a("android.permission.ACCESS_NETWORK_STATE") || (activeNetworkInfo = ((ConnectivityManager) o.f57018a.getSystemService("connectivity")).getActiveNetworkInfo()) == null) ? 8 : activeNetworkInfo.getType();
        if (type == 9) {
            return ETHERNET;
        }
        if (type != 0) {
            if (type == 1) {
                return WIFI;
            }
            if (type != 2 && type != 3 && type != 4 && type != 5) {
                return UNKNOWN;
            }
        }
        com.fyber.inneractive.sdk.config.cellular.a aVar = IAConfigManager.f53260M.f53274L;
        if (aVar == null || aVar.f53307a == null) {
            int iK = k.k();
            if (iK == 0) {
                a1Var = UNKNOWN;
            } else if (iK == 3) {
                a1Var = MOBILE_3G;
            } else if (iK == 18) {
                a1Var = WIFI;
            } else if (iK == 20) {
                a1Var = MOBILE_5G;
            } else if (iK != 5 && iK != 6) {
                switch (iK) {
                    default:
                        switch (iK) {
                            case 12:
                            case 14:
                            case 15:
                                break;
                            case 13:
                                a1Var = MOBILE_4G;
                                break;
                            default:
                                a1Var = CELLULAR;
                                break;
                        }
                    case 8:
                    case 9:
                    case 10:
                        break;
                }
            }
        } else {
            a1Var = aVar.f53308b;
        }
        return a1Var == UNKNOWN ? k.k() == 13 ? MOBILE_4G : MOBILE_3G : a1Var;
    }

    public final String b() {
        return this.key;
    }

    a1(String str) {
        this.key = str;
    }
}
