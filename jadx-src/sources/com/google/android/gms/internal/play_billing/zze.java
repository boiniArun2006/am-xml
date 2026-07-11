package com.google.android.gms.internal.play_billing;

import OS.qz;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.android.billingclient.api.Ml;
import com.android.billingclient.api.Purchase;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zze {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzl(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzk(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        zzl(str, jhotmBbwMbr.SqhLlDzC.concat(obj.getClass().getName()));
        return 6;
    }

    public static void zzk(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i2 = 40000;
            while (!str2.isEmpty() && i2 > 0) {
                int iMin = Math.min(str2.length(), Math.min(Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE, i2));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i2 -= iMin;
            }
        }
    }

    public static void zzl(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzm(String str, String str2, @Nullable Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Bundle zzo(Ml ml, int i2, @Nullable String str) {
        Bundle bundleZzn = zzn(ml, 5);
        if (str != null) {
            bundleZzn.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return bundleZzn;
    }

    private static int zzp(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        zzl(str, "Unexpected null bundle received!");
        return 0;
    }

    @Nullable
    private static Purchase zzq(String str, String str2) {
        if (str == null || str2 == null) {
            zzk("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e2) {
            zzl("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e2.toString()));
            return null;
        }
    }

    public static int zza(Intent intent, String str) {
        if (intent != null) {
            return zzp(intent.getExtras(), "ProxyBillingActivity");
        }
        zzl("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static Bundle zzc(Bundle bundle, String str, long j2) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j2);
        return bundle;
    }

    public static Bundle zzd(boolean z2, boolean z3, boolean z4, boolean z5, String str, long j2) {
        Bundle bundle = new Bundle();
        zzc(bundle, str, j2);
        if (z2 && z4) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z3 && z5) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static Bundle zze(String str, long j2) {
        Bundle bundle = new Bundle();
        zzc(bundle, str, j2);
        return bundle;
    }

    public static Ml zzf(Intent intent, String str) {
        if (intent != null) {
            Ml.j jVarT = Ml.t();
            jVarT.t(zzb(intent.getExtras(), str));
            jVarT.rl(zzh(intent.getExtras(), str));
            return jVarT.n();
        }
        zzl("BillingHelper", "Got null intent!");
        Ml.j jVarT2 = Ml.t();
        jVarT2.t(6);
        jVarT2.rl("An internal error occurred.");
        return jVarT2.n();
    }

    public static qz zzg(Bundle bundle, String str) {
        return bundle == null ? new qz(0, null) : new qz(zzp(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static String zzh(Bundle bundle, String str) {
        if (bundle == null) {
            zzl(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzk(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        zzl(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    @Nullable
    public static List zzj(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseZzq = zzq(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseZzq == null) {
                zzk("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseZzq);
            return arrayList;
        }
        zzk("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i2 = 0; i2 < stringArrayList.size() && i2 < stringArrayList2.size(); i2++) {
            Purchase purchaseZzq2 = zzq(stringArrayList.get(i2), stringArrayList2.get(i2));
            if (purchaseZzq2 != null) {
                arrayList.add(purchaseZzq2);
            }
        }
        return arrayList;
    }

    public static Bundle zzn(Ml ml, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", ml.rl());
        bundle.putString("DEBUG_MESSAGE", ml.n());
        bundle.putInt("LOG_REASON", i2 - 1);
        return bundle;
    }

    public static String zzi(int i2) {
        return zzd.zza(i2).toString();
    }
}
