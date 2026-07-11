package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzibd extends zzibc {
    zzibd() {
    }

    @Override // com.google.android.gms.internal.ads.zzibc
    final void zza(Object obj) {
        ((zzibn) obj).zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzibc
    final void zzb(zzieu zzieuVar, Map.Entry entry) throws IOException {
        zzibo zziboVar = (zzibo) entry.getKey();
        if (zziboVar.zzc) {
            zzies zziesVar = zzies.zza;
            switch (zziboVar.zzb.ordinal()) {
                case 0:
                    zzidw.zza(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                    break;
                case 1:
                    zzidw.zzb(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                    break;
                case 2:
                    zzidw.zzc(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                    break;
                case 3:
                    zzidw.zzd(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                    break;
                case 4:
                    zzidw.zzh(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                    break;
                case 5:
                    zzidw.zzf(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                    break;
                case 6:
                    zzidw.zzk(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                    break;
                case 7:
                    zzidw.zzn(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                    break;
                case 8:
                    zzidw.zzo(zziboVar.zza, (List) entry.getValue(), zzieuVar);
                    break;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        zzidw.zzr(zziboVar.zza, (List) entry.getValue(), zzieuVar, zzidm.zza().zzb(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        zzidw.zzq(zziboVar.zza, (List) entry.getValue(), zzieuVar, zzidm.zza().zzb(list2.get(0).getClass()));
                        break;
                    }
                    break;
                case 11:
                    zzidw.zzp(zziboVar.zza, (List) entry.getValue(), zzieuVar);
                    break;
                case 12:
                    zzidw.zzi(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                    break;
                case 13:
                    zzidw.zzh(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                    break;
                case 14:
                    zzidw.zzl(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                    break;
                case 15:
                    zzidw.zzg(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                    break;
                case 16:
                    zzidw.zzj(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                    break;
                case 17:
                    zzidw.zze(zziboVar.zza, (List) entry.getValue(), zzieuVar, zziboVar.zzd);
                    break;
            }
        }
        zzies zziesVar2 = zzies.zza;
        switch (zziboVar.zzb.ordinal()) {
            case 0:
                zzieuVar.zzf(zziboVar.zza, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                zzieuVar.zze(zziboVar.zza, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                zzieuVar.zzc(zziboVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                zzieuVar.zzh(zziboVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                zzieuVar.zzi(zziboVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                zzieuVar.zzj(zziboVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                zzieuVar.zzk(zziboVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                zzieuVar.zzl(zziboVar.zza, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                zzieuVar.zzm(zziboVar.zza, (String) entry.getValue());
                break;
            case 9:
                zzieuVar.zzs(zziboVar.zza, entry.getValue(), zzidm.zza().zzb(entry.getValue().getClass()));
                break;
            case 10:
                zzieuVar.zzr(zziboVar.zza, entry.getValue(), zzidm.zza().zzb(entry.getValue().getClass()));
                break;
            case 11:
                zzieuVar.zzn(zziboVar.zza, (zzian) entry.getValue());
                break;
            case 12:
                zzieuVar.zzo(zziboVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                zzieuVar.zzi(zziboVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                zzieuVar.zzb(zziboVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                zzieuVar.zzd(zziboVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                zzieuVar.zzp(zziboVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                zzieuVar.zzq(zziboVar.zza, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}
