package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.l;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Deprecated
public class zzaib implements zzao {
    public final String zza;
    public final String zzb;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaib zzaibVar = (zzaib) obj;
            if (this.zza.equals(zzaibVar.zza) && this.zzb.equals(zzaibVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append(l.ae);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzam zzamVar) {
        switch (this.zza) {
            case "TITLE":
                zzamVar.zza(this.zzb);
                break;
            case "ARTIST":
                zzamVar.zzb(this.zzb);
                break;
            case "ALBUM":
                zzamVar.zzc(this.zzb);
                break;
            case "ALBUMARTIST":
                zzamVar.zzd(this.zzb);
                break;
            case "TRACKNUMBER":
                Integer numZzh = zzgxz.zzh(this.zzb, 10);
                if (numZzh != null) {
                    zzamVar.zzg(numZzh);
                    break;
                }
                break;
            case "TOTALTRACKS":
                Integer numZzh2 = zzgxz.zzh(this.zzb, 10);
                if (numZzh2 != null) {
                    zzamVar.zzh(numZzh2);
                    break;
                }
                break;
            case "DISCNUMBER":
                Integer numZzh3 = zzgxz.zzh(this.zzb, 10);
                if (numZzh3 != null) {
                    zzamVar.zzr(numZzh3);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numZzh4 = zzgxz.zzh(this.zzb, 10);
                if (numZzh4 != null) {
                    zzamVar.zzs(numZzh4);
                    break;
                }
                break;
            case "GENRE":
                zzamVar.zzt(this.zzb);
                break;
            case "DESCRIPTION":
                zzamVar.zze(this.zzb);
                break;
        }
    }

    public zzaib(String str, String str2) {
        this.zza = zzgql.zzb(str);
        this.zzb = str2;
    }
}
