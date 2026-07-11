package com.google.android.gms.internal.ads;

import com.caoccao.javet.values.primitive.V8ValueNull;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzfxk extends zzfxq {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    /* synthetic */ zzfxk(String str, boolean z2, int i2, zzfxi zzfxiVar, int i3, byte[] bArr) {
        this.zzb = str;
        this.zzc = i2;
        this.zzd = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfxq) {
            zzfxq zzfxqVar = (zzfxq) obj;
            if (this.zzb.equals(zzfxqVar.zza())) {
                zzfxqVar.zzb();
                int i2 = this.zzc;
                int iZzd = zzfxqVar.zzd();
                if (i2 == 0) {
                    throw null;
                }
                if (i2 == iZzd) {
                    zzfxqVar.zzc();
                    int i3 = this.zzd;
                    int iZze = zzfxqVar.zze();
                    if (i3 == 0) {
                        throw null;
                    }
                    if (iZze == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final zzfxi zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final int zze() {
        return this.zzd;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        int i2 = this.zzc;
        if (i2 == 0) {
            throw null;
        }
        int i3 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i2;
        if (this.zzd != 0) {
            return (i3 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i2 = this.zzc;
        String str = V8ValueNull.NULL;
        String str2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? V8ValueNull.NULL : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        if (this.zzd == 1) {
            str = "READ_AND_WRITE";
        }
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 73 + str2.length() + 52 + str.length() + 1);
        sb.append("FileComplianceOptions{fileOwner=");
        sb.append(str3);
        sb.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb.append(str2);
        sb.append(", multipleProductIdGroupsResolver=null, filePurpose=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
