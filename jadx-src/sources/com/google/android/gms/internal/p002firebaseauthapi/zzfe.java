package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzfe extends zzcx {
    private final zzb zza;
    private final String zzb;
    private final zzc zzc;
    private final zzcx zzd;

    public static class zza {
        private zzb zza;
        private String zzb;
        private zzc zzc;
        private zzcx zzd;

        private zza() {
        }

        public final zza zza(zzcx zzcxVar) {
            this.zzd = zzcxVar;
            return this;
        }

        public final zza zza(zzc zzcVar) {
            this.zzc = zzcVar;
            return this;
        }

        public final zza zza(String str) {
            this.zzb = str;
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zza = zzbVar;
            return this;
        }

        public final zzfe zza() throws GeneralSecurityException {
            if (this.zza == null) {
                this.zza = zzb.zzb;
            }
            if (this.zzb != null) {
                if (this.zzc != null) {
                    zzcx zzcxVar = this.zzd;
                    if (zzcxVar != null) {
                        if (!zzcxVar.zza()) {
                            zzc zzcVar = this.zzc;
                            zzcx zzcxVar2 = this.zzd;
                            if ((zzcVar.equals(zzc.zza) && (zzcxVar2 instanceof zzdz)) || ((zzcVar.equals(zzc.zzc) && (zzcxVar2 instanceof zzem)) || ((zzcVar.equals(zzc.zzb) && (zzcxVar2 instanceof zzgg)) || ((zzcVar.equals(zzc.zzd) && (zzcxVar2 instanceof zzdk)) || ((zzcVar.equals(zzc.zze) && (zzcxVar2 instanceof zzdq)) || (zzcVar.equals(zzc.zzf) && (zzcxVar2 instanceof zzeg))))))) {
                                return new zzfe(this.zza, this.zzb, this.zzc, this.zzd);
                            }
                            throw new GeneralSecurityException("Cannot use parsing strategy " + this.zzc.toString() + " when new keys are picked according to " + String.valueOf(this.zzd) + ".");
                        }
                        throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
                    }
                    throw new GeneralSecurityException("dekParametersForNewKeys must be set");
                }
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
            throw new GeneralSecurityException("kekUri must be set");
        }
    }

    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("NO_PREFIX");
        private final String zzc;

        public final String toString() {
            return this.zzc;
        }

        private zzb(String str) {
            this.zzc = str;
        }
    }

    public static final class zzc {
        public static final zzc zza = new zzc("ASSUME_AES_GCM");
        public static final zzc zzb = new zzc("ASSUME_XCHACHA20POLY1305");
        public static final zzc zzc = new zzc("ASSUME_CHACHA20POLY1305");
        public static final zzc zzd = new zzc("ASSUME_AES_CTR_HMAC");
        public static final zzc zze = new zzc("ASSUME_AES_EAX");
        public static final zzc zzf = new zzc("ASSUME_AES_GCM_SIV");
        private final String zzg;

        public final String toString() {
            return this.zzg;
        }

        private zzc(String str) {
            this.zzg = str;
        }
    }

    private zzfe(zzb zzbVar, String str, zzc zzcVar, zzcx zzcxVar) {
        this.zza = zzbVar;
        this.zzb = str;
        this.zzc = zzcVar;
        this.zzd = zzcxVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfe)) {
            return false;
        }
        zzfe zzfeVar = (zzfe) obj;
        return zzfeVar.zzc.equals(this.zzc) && zzfeVar.zzd.equals(this.zzd) && zzfeVar.zzb.equals(this.zzb) && zzfeVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzfe.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.zzb + ", dekParsingStrategy: " + String.valueOf(this.zzc) + ", dekParametersForNewKeys: " + String.valueOf(this.zzd) + ", variant: " + String.valueOf(this.zza) + ")";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zza != zzb.zzb;
    }

    public final zzcx zzb() {
        return this.zzd;
    }

    public final zzb zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }
}
