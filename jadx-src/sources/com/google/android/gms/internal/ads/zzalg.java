package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzalg implements zzagc {
    public final int zza;
    public final zzgxx zzb;

    public final String toString() {
        zzgxx zzgxxVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzgxxVar.zzc());
        for (int i2 = 0; i2 < zzgxxVar.zzc(); i2++) {
            arrayList.add(zzfj.zzx(zzgxxVar.zzd(i2)));
        }
        String strZzx = zzfj.zzx(this.zza);
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder(strZzx.length() + 37 + string.length() + 1);
        sb.append("UnsupportedBrands{major=");
        sb.append(strZzx);
        sb.append(", compatible=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }

    public zzalg(int i2, @Nullable int[] iArr) {
        zzgxx zzgxxVarZza;
        this.zza = i2;
        if (iArr != null) {
            zzgxxVarZza = zzgxx.zzb(iArr);
        } else {
            zzgxxVarZza = zzgxx.zza();
        }
        this.zzb = zzgxxVarZza;
    }
}
