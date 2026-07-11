package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzan {
    private final EnumMap zza;

    zzan() {
        this.zza = new EnumMap(zzjj.class);
    }

    private zzan(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzjj.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static zzan zzd(String str) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        if (str.length() >= zzjj.values().length) {
            int i2 = 0;
            if (str.charAt(0) == '1') {
                zzjj[] zzjjVarArrValues = zzjj.values();
                int length = zzjjVarArrValues.length;
                int i3 = 1;
                while (i2 < length) {
                    enumMap.put(zzjjVarArrValues[i2], zzam.zza(str.charAt(i3)));
                    i2++;
                    i3++;
                }
                return new zzan(enumMap);
            }
        }
        return new zzan();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (zzjj zzjjVar : zzjj.values()) {
            zzam zzamVar = (zzam) this.zza.get(zzjjVar);
            if (zzamVar == null) {
                zzamVar = zzam.UNSET;
            }
            sb.append(zzamVar.zzb());
        }
        return sb.toString();
    }

    public final zzam zza(zzjj zzjjVar) {
        zzam zzamVar = (zzam) this.zza.get(zzjjVar);
        return zzamVar == null ? zzam.UNSET : zzamVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(zzjj zzjjVar, int i2) {
        zzam zzamVar = zzam.UNSET;
        if (i2 == -30) {
            zzamVar = zzam.TCF;
        } else if (i2 == -20) {
            zzamVar = zzam.API;
        } else if (i2 == -10) {
            zzamVar = zzam.MANIFEST;
        } else if (i2 != 0) {
            if (i2 == 30) {
                zzamVar = zzam.INITIALIZATION;
            }
        }
        this.zza.put(zzjjVar, zzamVar);
    }

    public final void zzc(zzjj zzjjVar, zzam zzamVar) {
        this.zza.put(zzjjVar, zzamVar);
    }
}
