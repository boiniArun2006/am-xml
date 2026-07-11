package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.Ml;
import com.google.android.gms.internal.play_billing.zze;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class h {
    static Lu n(Bundle bundle, String str, String str2) {
        Ml ml = Ln.gh;
        if (bundle == null) {
            zze.zzl("BillingClient", String.format("%s got null owned items list", str2));
            return new Lu(ml, 54);
        }
        int iZzb = zze.zzb(bundle, "BillingClient");
        String strZzh = zze.zzh(bundle, "BillingClient");
        Ml.j jVarT = Ml.t();
        jVarT.t(iZzb);
        jVarT.rl(strZzh);
        Ml mlN = jVarT.n();
        if (iZzb != 0) {
            zze.zzl("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(iZzb)));
            return new Lu(mlN, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            zze.zzl("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new Lu(ml, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            zze.zzl("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new Lu(ml, 56);
        }
        if (stringArrayList2 == null) {
            zze.zzl("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new Lu(ml, 57);
        }
        if (stringArrayList3 != null) {
            return new Lu(Ln.qie, 1);
        }
        zze.zzl("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new Lu(ml, 58);
    }
}
