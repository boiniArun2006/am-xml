package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzazn {
    private NetworkCapabilities zza;

    public final NetworkCapabilities zzb() {
        return this.zza;
    }

    final /* synthetic */ void zzd(NetworkCapabilities networkCapabilities) {
        this.zza = networkCapabilities;
    }

    public static zzazn zza(Context context) {
        if (context != null) {
            return new zzazn((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long zzc() {
        synchronized (zzazn.class) {
            try {
                NetworkCapabilities networkCapabilities = this.zza;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.zza.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.zza.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    zzazn(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new zzazm(this));
            } catch (RuntimeException unused) {
                synchronized (zzazn.class) {
                    this.zza = null;
                }
            }
        }
    }
}
