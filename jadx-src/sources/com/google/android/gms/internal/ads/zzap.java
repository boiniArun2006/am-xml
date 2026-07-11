package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzap {
    private final zzao[] zza;

    public zzap(long j2, zzao... zzaoVarArr) {
        this.zza = zzaoVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzap.class == obj.getClass() && Arrays.equals(this.zza, ((zzap) obj).zza);
    }

    public final zzap zzg(zzao... zzaoVarArr) {
        int length = zzaoVarArr.length;
        if (length == 0) {
            return this;
        }
        zzao[] zzaoVarArr2 = this.zza;
        String str = zzfj.zza;
        int length2 = zzaoVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zzaoVarArr2, length2 + length);
        System.arraycopy(zzaoVarArr, 0, objArrCopyOf, length2, length);
        return new zzap(-9223372036854775807L, (zzao[]) objArrCopyOf);
    }

    public zzap(List list) {
        this.zza = (zzao[]) list.toArray(new zzao[0]);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zza) * 31) + Long.hashCode(-9223372036854775807L);
    }

    public final String toString() {
        String string = Arrays.toString(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 8);
        sb.append("entries=");
        sb.append(string);
        sb.append("");
        return sb.toString();
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzao zzb(int i2) {
        return this.zza[i2];
    }

    @Nullable
    public final zzao zzc(Class cls, zzgrd zzgrdVar) {
        for (zzao zzaoVar : this.zza) {
            zzao zzaoVarZzh = zzh(zzaoVar, cls, zzgrdVar);
            if (zzaoVarZzh != null) {
                return zzaoVarZzh;
            }
        }
        return null;
    }

    public final zzguf zzd(Class cls) {
        int i2 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        for (zzao zzaoVar : this.zza) {
            if (cls.isAssignableFrom(zzaoVar.getClass())) {
                zzgucVar.zzf((zzao) cls.cast(zzaoVar));
            }
        }
        return zzgucVar.zzi();
    }

    public final zzguf zze(Class cls, zzgrd zzgrdVar) {
        int i2 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        for (zzao zzaoVar : this.zza) {
            zzao zzaoVarZzh = zzh(zzaoVar, cls, zzgrdVar);
            if (zzaoVarZzh != null) {
                zzgucVar.zzf(zzaoVarZzh);
            }
        }
        return zzgucVar.zzi();
    }

    public final zzap zzf(@Nullable zzap zzapVar) {
        return zzapVar == null ? this : zzg(zzapVar.zza);
    }

    @Nullable
    private static final zzao zzh(zzao zzaoVar, Class cls, zzgrd zzgrdVar) {
        if (cls.isAssignableFrom(zzaoVar.getClass())) {
            zzao zzaoVar2 = (zzao) cls.cast(zzaoVar);
            if (zzgrdVar.zza(zzaoVar2)) {
                return zzaoVar2;
            }
            return null;
        }
        return null;
    }
}
