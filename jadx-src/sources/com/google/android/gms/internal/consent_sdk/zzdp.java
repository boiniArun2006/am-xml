package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzdp implements zzdo {
    private final Object zza;

    private zzdp(Object obj) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public final Object zza() {
        return this.zza;
    }

    public static zzdo zzb(Object obj) {
        if (obj != null) {
            return new zzdp(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }
}
