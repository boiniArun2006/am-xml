package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbhf {
    static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbio.zzd("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbjb.zza);
        zzc(arrayList, zzbjb.zzb);
        zzc(arrayList, zzbjb.zzc);
        zzc(arrayList, zzbjb.zzd);
        zzc(arrayList, zzbjb.zze);
        zzc(arrayList, zzbjb.zzu);
        zzc(arrayList, zzbjb.zzf);
        zzc(arrayList, zzbjb.zzm);
        zzc(arrayList, zzbjb.zzn);
        zzc(arrayList, zzbjb.zzo);
        zzc(arrayList, zzbjb.zzp);
        zzc(arrayList, zzbjb.zzq);
        zzc(arrayList, zzbjb.zzr);
        zzc(arrayList, zzbjb.zzs);
        zzc(arrayList, zzbjb.zzt);
        zzc(arrayList, zzbjb.zzg);
        zzc(arrayList, zzbjb.zzh);
        zzc(arrayList, zzbjb.zzi);
        zzc(arrayList, zzbjb.zzj);
        zzc(arrayList, zzbjb.zzk);
        zzc(arrayList, zzbjb.zzl);
        return arrayList;
    }

    static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbjq.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbio zzbioVar) {
        String str = (String) zzbioVar.zze();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
