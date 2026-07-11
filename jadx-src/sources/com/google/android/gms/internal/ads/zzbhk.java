package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Deprecated
public final class zzbhk {
    public static final void zza(zzbhj zzbhjVar, @Nullable zzbhh zzbhhVar) {
        if (zzbhhVar.zzb() != null) {
            if (!TextUtils.isEmpty(zzbhhVar.zzc())) {
                zzbhjVar.zza(zzbhhVar.zzb(), zzbhhVar.zzc(), zzbhhVar.zza(), zzbhhVar.zzd());
                return;
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
}
