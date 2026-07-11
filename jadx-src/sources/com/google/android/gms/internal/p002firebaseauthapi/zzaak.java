package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zzc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzaak {
    private final Status zza;
    private final zzc zzb;
    private final String zzc;
    private final String zzd;

    public final Status zza() {
        return this.zza;
    }

    public final zzc zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    @SafeParcelable.Constructor
    public zzaak(Status status, zzc zzcVar, String str, @Nullable String str2) {
        this.zza = status;
        this.zzb = zzcVar;
        this.zzc = str;
        this.zzd = str2;
    }
}
