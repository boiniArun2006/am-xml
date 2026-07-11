package com.google.android.gms.internal.measurement;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzs extends zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ zzt zzc;

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    @Override // com.google.android.gms.internal.measurement.zzai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzao zza(zzg zzgVar, List list) {
        int i2;
        int i3;
        zzh.zzb(CreativeInfo.f62442f, 1, list);
        if (list.size() == 1) {
            zzt zztVar = this.zzc;
            zztVar.zzb().zza(3, zzgVar.zza((zzao) list.get(0)).zzc(), Collections.EMPTY_LIST, this.zza, this.zzb);
            return zzao.zzf;
        }
        int iZzg = zzh.zzg(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
        if (iZzg != 2) {
            i2 = 3;
            if (iZzg == 3) {
                i3 = 1;
            } else if (iZzg == 5) {
                i3 = 5;
            } else if (iZzg == 6) {
                i3 = 2;
            }
            String strZzc = zzgVar.zza((zzao) list.get(1)).zzc();
            if (list.size() != 2) {
                zzt zztVar2 = this.zzc;
                zztVar2.zzb().zza(i3, strZzc, Collections.EMPTY_LIST, this.zza, this.zzb);
                return zzao.zzf;
            }
            ArrayList arrayList = new ArrayList();
            for (int i5 = 2; i5 < Math.min(list.size(), 5); i5++) {
                arrayList.add(zzgVar.zza((zzao) list.get(i5)).zzc());
            }
            this.zzc.zzb().zza(i3, strZzc, arrayList, this.zza, this.zzb);
            return zzao.zzf;
        }
        i2 = 4;
        i3 = i2;
        String strZzc2 = zzgVar.zza((zzao) list.get(1)).zzc();
        if (list.size() != 2) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z2, boolean z3) {
        super(CreativeInfo.f62442f);
        Objects.requireNonNull(zztVar);
        this.zzc = zztVar;
        this.zza = z2;
        this.zzb = z3;
    }
}
