package com.google.android.gms.ads.identifier;

import android.util.Log;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.ads_identifier.zzh;
import com.google.android.gms.internal.ads_identifier.zzk;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zze {
    @WorkerThread
    public static final void zza(String str) {
        try {
            try {
                zzk.zzb(263);
                URL url = new URL(str);
                int i2 = zzh.zzb;
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    if (iHttpUrlConnectionGetResponseCode < 200 || iHttpUrlConnectionGetResponseCode >= 300) {
                        Log.w("HttpUrlPinger", "Received non-success response code " + iHttpUrlConnectionGetResponseCode + " from pinging URL: " + str);
                    }
                    zzk.zza();
                } finally {
                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                }
            } catch (Throwable th) {
                zzk.zza();
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
            zzk.zza();
        } catch (IndexOutOfBoundsException e3) {
            Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + e3.getMessage(), e3);
            zzk.zza();
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
            zzk.zza();
        }
    }
}
