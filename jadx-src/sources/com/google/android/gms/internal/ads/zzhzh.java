package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhzh extends zzhys {
    static final zzhzh zza = new zzhzh();

    private zzhzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzhys
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(zzhzs zzhzsVar, zzhyl zzhylVar) throws IOException {
        if (zzhylVar == null || (zzhylVar instanceof zzhym)) {
            zzhzsVar.zzj();
            return;
        }
        if (zzhylVar instanceof zzhyp) {
            zzhyp zzhypVarZzg = zzhylVar.zzg();
            if (zzhypVarZzg.zzc()) {
                zzhzsVar.zzi(zzhypVarZzg.zzh());
                return;
            } else if (zzhypVarZzg.zza()) {
                zzhzsVar.zzh(zzhypVarZzg.zzb());
                return;
            } else {
                zzhzsVar.zzg(zzhypVarZzg.zzd());
                return;
            }
        }
        if (zzhylVar instanceof zzhyk) {
            zzhzsVar.zzb();
            Iterator it = zzhylVar.zzf().iterator();
            while (it.hasNext()) {
                zza(zzhzsVar, (zzhyl) it.next());
            }
            zzhzsVar.zzc();
            return;
        }
        if (!(zzhylVar instanceof zzhyn)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(zzhylVar.getClass())));
        }
        zzhzsVar.zzd();
        for (Map.Entry entry : zzhylVar.zze().zzb()) {
            zzhzsVar.zzf((String) entry.getKey());
            zza(zzhzsVar, (zzhyl) entry.getValue());
        }
        zzhzsVar.zze();
    }
}
