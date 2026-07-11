package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface zzak {
    boolean zzj(String str);

    zzao zzk(String str);

    void zzm(String str, zzao zzaoVar);

    static zzao zzu(zzak zzakVar, zzao zzaoVar, zzg zzgVar, List list) {
        if (zzakVar.zzj(zzaoVar.zzc())) {
            zzao zzaoVarZzk = zzakVar.zzk(zzaoVar.zzc());
            if (zzaoVarZzk instanceof zzai) {
                return ((zzai) zzaoVarZzk).zza(zzgVar, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", zzaoVar.zzc()));
        }
        if ("hasOwnProperty".equals(zzaoVar.zzc())) {
            zzh.zza("hasOwnProperty", 1, list);
            if (zzakVar.zzj(zzgVar.zza((zzao) list.get(0)).zzc())) {
                return zzao.zzk;
            }
            return zzao.zzl;
        }
        throw new IllegalArgumentException(String.format("Object has no function %s", zzaoVar.zzc()));
    }

    static Iterator zzv(Map map) {
        return new zzaj(map.keySet().iterator());
    }
}
