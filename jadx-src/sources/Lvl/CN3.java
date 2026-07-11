package Lvl;

import Lvl.Wre;
import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import kYF.Dsr;
import kYF.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class CN3 {
    public static final Wre n(Context context, Wre.j jVar, SPz sPz) {
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager == null || !kYF.Ml.O(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (sPz != null && sPz.rl() <= 5) {
                sPz.n("NetworkObserver", 5, "Unable to register network observer.", null);
            }
            return new I28();
        }
        try {
            return new fuX(connectivityManager, jVar);
        } catch (Exception e2) {
            if (sPz != null) {
                Dsr.n(sPz, "NetworkObserver", new RuntimeException("Failed to register network observer.", e2));
            }
            return new I28();
        }
    }
}
