package com.google.android.gms.ads.internal.util.client;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzm extends zzw {
    private final int zza;
    private final int zzb;
    private final boolean zzc;

    zzm(int i2, int i3, boolean z2) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzwVar = (zzw) obj;
            if (this.zza == zzwVar.zza() && this.zzb == zzwVar.zzb() && this.zzc == zzwVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.zzc ? 1237 : 1231) ^ ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003);
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final boolean zzc() {
        return this.zzc;
    }

    public final String toString() {
        int i2 = this.zza;
        int length = String.valueOf(i2).length();
        int i3 = this.zzb;
        int length2 = String.valueOf(i3).length();
        boolean z2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z2).length() + 1);
        sb.append("OfflineAdConfig{impressionPrerequisite=");
        sb.append(i2);
        sb.append(", clickPrerequisite=");
        sb.append(i3);
        sb.append(", notificationFlowEnabled=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
