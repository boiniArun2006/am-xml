package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzgg extends zzcx {
    private final zza zza;

    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("NO_PREFIX");
        private final String zzd;

        public final String toString() {
            return this.zzd;
        }

        private zza(String str) {
            this.zzd = str;
        }
    }

    public static zzgg zza(zza zzaVar) {
        return new zzgg(zzaVar);
    }

    public static zzgg zzc() {
        return new zzgg(zza.zzc);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgg) && ((zzgg) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzgg.class, this.zza);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + String.valueOf(this.zza) + ")";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zza != zza.zzc;
    }

    public final zza zzb() {
        return this.zza;
    }

    private zzgg(zza zzaVar) {
        this.zza = zzaVar;
    }
}
