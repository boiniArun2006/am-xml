package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdz;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzds extends zzcv {
    private final zzdz zza;
    private final zzaaf zzb;
    private final zzaae zzc;
    private final Integer zzd;

    public static class zza {
        private zzdz zza;
        private zzaaf zzb;
        private Integer zzc;

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(zzaaf zzaafVar) {
            this.zzb = zzaafVar;
            return this;
        }

        public final zza zza(zzdz zzdzVar) {
            this.zza = zzdzVar;
            return this;
        }

        public final zzds zza() throws GeneralSecurityException {
            zzaae zzaaeVarZzb;
            zzdz zzdzVar = this.zza;
            if (zzdzVar != null && this.zzb != null) {
                if (zzdzVar.zzc() == this.zzb.zza()) {
                    if (this.zza.zza() && this.zzc == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.zza.zza() && this.zzc != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    if (this.zza.zzf() == zzdz.zzb.zzc) {
                        zzaaeVarZzb = zzpd.zza;
                    } else if (this.zza.zzf() == zzdz.zzb.zzb) {
                        zzaaeVarZzb = zzpd.zza(this.zzc.intValue());
                    } else if (this.zza.zzf() == zzdz.zzb.zza) {
                        zzaaeVarZzb = zzpd.zzb(this.zzc.intValue());
                    } else {
                        throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + String.valueOf(this.zza.zzf()));
                    }
                    return new zzds(this.zza, this.zzb, zzaaeVarZzb, this.zzc);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
    }

    private zzds(zzdz zzdzVar, zzaaf zzaafVar, zzaae zzaaeVar, Integer num) {
        this.zza = zzdzVar;
        this.zzb = zzaafVar;
        this.zzc = zzaaeVar;
        this.zzd = num;
    }

    public static zza zze() {
        return new zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv
    /* JADX INFO: renamed from: zzc */
    public final /* synthetic */ zzcx zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv
    public final zzaae zzd() {
        return this.zzc;
    }

    public final zzaaf zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv, com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final /* synthetic */ zzce zza() {
        return (zzdz) zza();
    }
}
