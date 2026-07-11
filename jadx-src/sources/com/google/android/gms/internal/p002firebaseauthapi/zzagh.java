package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzagh extends zzahv {

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzahv) {
            zzahv zzahvVar = (zzahv) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzahvVar.zzb()) : zzahvVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzahvVar.zza()) : zzahvVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.zzb;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "RecaptchaEnforcementState{provider=" + this.zza + ", enforcementState=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahv
    @Nullable
    final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahv
    @Nullable
    final String zzb() {
        return this.zza;
    }

    zzagh(@Nullable String str, @Nullable String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
