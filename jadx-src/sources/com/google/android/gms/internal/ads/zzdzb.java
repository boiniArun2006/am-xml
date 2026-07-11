package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzdzb extends zzdzf {
    private final long zza;
    private final int zzb;

    /* synthetic */ zzdzb(long j2, int i2, byte[] bArr) {
        this.zza = j2;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdzf) {
            zzdzf zzdzfVar = (zzdzf) obj;
            if (this.zza == zzdzfVar.zza() && this.zzb == zzdzfVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.zza;
        return ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdzf
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdzf
    public final int zzb() {
        return this.zzb;
    }

    public final String toString() {
        long j2 = this.zza;
        int length = String.valueOf(j2).length();
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i2).length() + 1);
        sb.append("OnDeviceStorageKey{id=");
        sb.append(j2);
        sb.append(", eventType=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
