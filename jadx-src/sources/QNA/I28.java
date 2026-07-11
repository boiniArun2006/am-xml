package QNA;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Float f8069n;
    private final boolean rl;

    public static I28 n(Context context) {
        boolean zO = false;
        Float fNr = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zO = O(intentRegisterReceiver);
                fNr = nr(intentRegisterReceiver);
            }
        } catch (IllegalStateException e2) {
            h1M.CN3.J2().O("An error occurred getting battery state.", e2);
        }
        return new I28(fNr, zO);
    }

    private static boolean O(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    private static Float nr(Intent intent) {
        int intExtra = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    public Float rl() {
        return this.f8069n;
    }

    public int t() {
        Float f3;
        if (!this.rl || (f3 = this.f8069n) == null) {
            return 1;
        }
        return ((double) f3.floatValue()) < 0.99d ? 2 : 3;
    }

    private I28(Float f3, boolean z2) {
        this.rl = z2;
        this.f8069n = f3;
    }
}
