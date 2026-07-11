package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzamt implements zzamf {
    private final zzer zza = new zzer();
    private final zzer zzb = new zzer();
    private final zzams zzc = new zzams();

    @Nullable
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i2, int i3, zzame zzameVar, zzdr zzdrVar) {
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i3 + i2);
        zzerVar.zzh(i2);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzer zzerVar2 = this.zzb;
        if (zzfj.zzL(zzerVar, zzerVar2, this.zzd)) {
            zzerVar.zzb(zzerVar2.zzi(), zzerVar2.zze());
        }
        zzams zzamsVar = this.zzc;
        zzamsVar.zzb();
        ArrayList arrayList = new ArrayList();
        while (zzerVar.zzd() >= 3) {
            int iZze = zzerVar.zze();
            int iZzs = zzerVar.zzs();
            int iZzt = zzerVar.zzt();
            int iZzg = zzerVar.zzg() + iZzt;
            zzcx zzcxVarZza = null;
            if (iZzg > iZze) {
                zzerVar.zzh(iZze);
            } else {
                if (iZzs != 128) {
                    switch (iZzs) {
                        case 20:
                            zzamsVar.zzc(zzerVar, iZzt);
                            break;
                        case 21:
                            zzamsVar.zzd(zzerVar, iZzt);
                            break;
                        case 22:
                            zzamsVar.zze(zzerVar, iZzt);
                            break;
                    }
                } else {
                    zzcxVarZza = zzamsVar.zza();
                    zzamsVar.zzb();
                }
                zzerVar.zzh(iZzg);
            }
            if (zzcxVarZza != null) {
                arrayList.add(zzcxVarZza);
            }
        }
        zzdrVar.zza(new zzalx(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
