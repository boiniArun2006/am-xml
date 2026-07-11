package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.zzc;
import java.util.List;
import oW.afx;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzaaj {

    @SafeParcelable.Field(getter = "getMfaPendingCredential", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getMfaInfoList", id = 2)
    private List<zzahq> zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", id = 3)
    private zzc zzc;

    @Nullable
    public final zzc zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final List<MultiFactorInfo> zzc() {
        return afx.rl(this.zzb);
    }

    @SafeParcelable.Constructor
    public zzaaj(String str, List<zzahq> list, @Nullable zzc zzcVar) {
        this.zza = str;
        this.zzb = list;
        this.zzc = zzcVar;
    }
}
