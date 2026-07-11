package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdba {
    @Nullable
    public static final zzcce zza(Context context, VersionInfoParcel versionInfoParcel, zzfir zzfirVar, zzcca zzccaVar) {
        zzccb zzccbVar = zzfirVar.zzA;
        if (zzccbVar == null) {
            return null;
        }
        zzfiw zzfiwVar = zzfirVar.zzs;
        return new zzcbz(context, versionInfoParcel, zzccbVar, zzfiwVar != null ? zzfiwVar.zzb : null, zzccaVar);
    }
}
