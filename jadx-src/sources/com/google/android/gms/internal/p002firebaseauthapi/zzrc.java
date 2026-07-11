package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzrj;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzrc extends zzrn {
    private final zzrj zza;
    private final zzaaf zzb;
    private final zzaae zzc;
    private final Integer zzd;

    public static class zza {
        private zzrj zza;
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

        public final zza zza(zzrj zzrjVar) {
            this.zza = zzrjVar;
            return this;
        }

        public final zzrc zza() throws GeneralSecurityException {
            zzaae zzaaeVarZza;
            zzrj zzrjVar = this.zza;
            if (zzrjVar != null && this.zzb != null) {
                if (zzrjVar.zzc() == this.zzb.zza()) {
                    if (this.zza.zza() && this.zzc == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.zza.zza() && this.zzc != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    if (this.zza.zzf() == zzrj.zzb.zzd) {
                        zzaaeVarZza = zzpd.zza;
                    } else if (this.zza.zzf() != zzrj.zzb.zzc && this.zza.zzf() != zzrj.zzb.zzb) {
                        if (this.zza.zzf() == zzrj.zzb.zza) {
                            zzaaeVarZza = zzpd.zzb(this.zzc.intValue());
                        } else {
                            throw new IllegalStateException("Unknown HmacParameters.Variant: " + String.valueOf(this.zza.zzf()));
                        }
                    } else {
                        zzaaeVarZza = zzpd.zza(this.zzc.intValue());
                    }
                    return new zzrc(this.zza, this.zzb, zzaaeVarZza, this.zzc);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
    }

    private zzrc(zzrj zzrjVar, zzaaf zzaafVar, zzaae zzaaeVar, Integer num) {
        this.zza = zzrjVar;
        this.zzb = zzaafVar;
        this.zzc = zzaaeVar;
        this.zzd = num;
    }

    public static zza zzc() {
        return new zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrn
    /* JADX INFO: renamed from: zzd */
    public final /* synthetic */ zzrm zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrn
    public final zzaae zze() {
        return this.zzc;
    }

    public final zzaaf zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrn, com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final /* synthetic */ zzce zza() {
        return (zzrj) zza();
    }
}
