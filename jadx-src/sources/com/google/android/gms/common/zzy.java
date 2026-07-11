package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@ShowFirstParty
public class zzy {
    private static final zzy zze = new zzy(true, 3, 1, null, null, -1);
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    private zzy(boolean z2, int i2, int i3, String str, Throwable th, long j2) {
        this.zza = z2;
        this.zzd = i2;
        this.zzb = str;
        this.zzc = th;
    }

    @Deprecated
    static zzy zzb() {
        return zze;
    }

    static zzy zzc(@NonNull String str) {
        return new zzy(false, 1, 5, str, null, -1L);
    }

    static zzy zzd(@NonNull String str, @NonNull Throwable th) {
        return new zzy(false, 1, 5, str, th, -1L);
    }

    @VisibleForTesting
    public static zzy zzf(int i2, long j2) {
        return new zzy(true, i2, 1, null, null, j2);
    }

    static zzy zzg(int i2, int i3, @NonNull String str, Throwable th) {
        return new zzy(false, i2, i3, str, th, -1L);
    }

    String zza() {
        return this.zzb;
    }

    /* synthetic */ zzy(boolean z2, int i2, int i3, String str, Throwable th, long j2, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }

    final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.zzc;
        if (th != null) {
            Log.d("GoogleCertificatesRslt", zza(), th);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }
}
