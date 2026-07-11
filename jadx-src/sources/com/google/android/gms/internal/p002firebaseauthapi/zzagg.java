package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzagg extends zzahw {
    private final String zza;

    @Nullable
    private final String zzb;
    private final String zzc;
    private final zzagy zzd;
    private final String zze;

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzahw) {
            zzahw zzahwVar = (zzahw) obj;
            if (this.zza.equals(zzahwVar.zzd()) && ((str = this.zzb) != null ? str.equals(zzahwVar.zze()) : zzahwVar.zze() == null) && this.zzc.equals(zzahwVar.zzf()) && this.zzd.equals(zzahwVar.zzb()) && this.zze.equals(zzahwVar.zzc())) {
                return true;
            }
        }
        return false;
    }

    private zzagg(String str, @Nullable String str2, String str3, zzagy zzagyVar, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzagyVar;
        this.zze = str4;
    }

    public final int hashCode() {
        int iHashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        String str = this.zzb;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode();
    }

    public final String toString() {
        return "RevokeTokenRequest{providerId=" + this.zza + ", tenantId=" + this.zzb + ", token=" + this.zzc + ", tokenType=" + String.valueOf(this.zzd) + ", idToken=" + this.zze + "}";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahw
    public final zzagy zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahw
    public final String zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahw
    public final String zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahw
    @Nullable
    public final String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahw
    public final String zzf() {
        return this.zzc;
    }
}
