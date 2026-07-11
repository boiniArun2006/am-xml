package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzoh extends zzce {
    private final zzqd zza;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzoh)) {
            return false;
        }
        zzqd zzqdVar = ((zzoh) obj).zza;
        return this.zza.zza().zzd().equals(zzqdVar.zza().zzd()) && this.zza.zza().zzf().equals(zzqdVar.zza().zzf()) && this.zza.zza().zze().equals(zzqdVar.zza().zze());
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzb());
    }

    public final String toString() {
        String strZzf = this.zza.zza().zzf();
        int i2 = zzok.zza[this.zza.zza().zzd().ordinal()];
        return String.format("(typeUrl=%s, outputPrefixType=%s)", strZzf, i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zza.zza().zzd() != zzxu.RAW;
    }

    public final zzqd zzb() {
        return this.zza;
    }

    public zzoh(zzqd zzqdVar) {
        this.zza = zzqdVar;
    }
}
