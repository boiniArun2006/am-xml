package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbsz {

    @VisibleForTesting
    static final com.google.android.gms.ads.internal.util.zzbc zza = new zzbsx();

    @VisibleForTesting
    static final com.google.android.gms.ads.internal.util.zzbc zzb = new zzbsy();
    private final zzbsl zzc;

    public final zzbsp zza(String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        return new zzbtd(this.zzc, str, zzbssVar, zzbsrVar);
    }

    public final zzbti zzb() {
        return new zzbti(this.zzc);
    }

    public final void zzc() {
        this.zzc.zzc();
    }

    public zzbsz(Context context, VersionInfoParcel versionInfoParcel, String str, zzfor zzforVar) {
        this.zzc = new zzbsl(context, versionInfoParcel, str, zza, zzb, zzforVar);
    }
}
