package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zziz {
    public static final /* synthetic */ int zza = 0;
    private static final zzjj zzb;

    static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static zzjj zzm() {
        return zzb;
    }

    static {
        int i2 = zziu.zza;
        zzb = new zzjl();
    }

    public static void zzA(int i2, List list, zzjw zzjwVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzC(i2, list, z2);
    }

    public static void zzB(int i2, List list, zzjw zzjwVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzE(i2, list, z2);
    }

    public static void zzC(int i2, List list, zzjw zzjwVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzJ(i2, list, z2);
    }

    public static void zzD(int i2, List list, zzjw zzjwVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzL(i2, list, z2);
    }

    static int zzh(int i2, Object obj, zzix zzixVar) {
        int i3 = i2 << 3;
        if (!(obj instanceof zzhx)) {
            return zzgr.zzz(i3) + zzgr.zzx((zzim) obj, zzixVar);
        }
        int iZzz = zzgr.zzz(i3);
        int iZza = ((zzhx) obj).zza();
        return iZzz + zzgr.zzz(iZza) + iZza;
    }

    static Object zzn(Object obj, int i2, int i3, Object obj2, zzjj zzjjVar) {
        Object obj3 = obj2;
        if (obj2 == null) {
            zzhk zzhkVar = (zzhk) obj;
            zzjk zzjkVar = zzhkVar.zzc;
            obj3 = zzjkVar;
            if (zzjkVar == zzjk.zzc()) {
                zzjk zzjkVarZzf = zzjk.zzf();
                zzhkVar.zzc = zzjkVarZzf;
                obj3 = zzjkVarZzf;
            }
        }
        ((zzjk) obj3).zzj(i2 << 3, Long.valueOf(i3));
        return obj3;
    }

    static void zzo(zzgx zzgxVar, Object obj, Object obj2) {
        if (((zzhh) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzp(zzjj zzjjVar, Object obj, Object obj2) {
        zzhk zzhkVar = (zzhk) obj;
        zzjk zzjkVarZze = zzhkVar.zzc;
        zzjk zzjkVar = ((zzhk) obj2).zzc;
        if (!zzjk.zzc().equals(zzjkVar)) {
            if (zzjk.zzc().equals(zzjkVarZze)) {
                zzjkVarZze = zzjk.zze(zzjkVarZze, zzjkVar);
            } else {
                zzjkVarZze.zzd(zzjkVar);
            }
        }
        zzhkVar.zzc = zzjkVarZze;
    }

    public static void zzq(int i2, List list, zzjw zzjwVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzc(i2, list, z2);
    }

    public static void zzr(int i2, List list, zzjw zzjwVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzg(i2, list, z2);
    }

    public static void zzs(int i2, List list, zzjw zzjwVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzj(i2, list, z2);
    }

    public static void zzt(int i2, List list, zzjw zzjwVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzl(i2, list, z2);
    }

    public static void zzu(int i2, List list, zzjw zzjwVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzn(i2, list, z2);
    }

    public static void zzv(int i2, List list, zzjw zzjwVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzp(i2, list, z2);
    }

    public static void zzw(int i2, List list, zzjw zzjwVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzs(i2, list, z2);
    }

    public static void zzx(int i2, List list, zzjw zzjwVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzu(i2, list, z2);
    }

    public static void zzy(int i2, List list, zzjw zzjwVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzy(i2, list, z2);
    }

    public static void zzz(int i2, List list, zzjw zzjwVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzA(i2, list, z2);
    }

    static int zza(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhl) {
            zzhl zzhlVar = (zzhl) list;
            int iZzA = 0;
            while (i2 < size) {
                iZzA += zzgr.zzA(zzhlVar.zze(i2));
                i2++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i2 < size) {
            iZzA2 += zzgr.zzA(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iZzA2;
    }

    static int zzb(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgr.zzz(i2 << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgr.zzz(i2 << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhl) {
            zzhl zzhlVar = (zzhl) list;
            int iZzA = 0;
            while (i2 < size) {
                iZzA += zzgr.zzA(zzhlVar.zze(i2));
                i2++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i2 < size) {
            iZzA2 += zzgr.zzA(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iZzA2;
    }

    static int zzg(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzib) {
            zzib zzibVar = (zzib) list;
            int iZzA = 0;
            while (i2 < size) {
                iZzA += zzgr.zzA(zzibVar.zze(i2));
                i2++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i2 < size) {
            iZzA2 += zzgr.zzA(((Long) list.get(i2)).longValue());
            i2++;
        }
        return iZzA2;
    }

    static int zzi(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhl) {
            zzhl zzhlVar = (zzhl) list;
            int iZzz = 0;
            while (i2 < size) {
                int iZze = zzhlVar.zze(i2);
                iZzz += zzgr.zzz((iZze >> 31) ^ (iZze + iZze));
                i2++;
            }
            return iZzz;
        }
        int iZzz2 = 0;
        while (i2 < size) {
            int iIntValue = ((Integer) list.get(i2)).intValue();
            iZzz2 += zzgr.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
            i2++;
        }
        return iZzz2;
    }

    static int zzj(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzib) {
            zzib zzibVar = (zzib) list;
            int iZzA = 0;
            while (i2 < size) {
                long jZze = zzibVar.zze(i2);
                iZzA += zzgr.zzA((jZze >> 63) ^ (jZze + jZze));
                i2++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i2 < size) {
            long jLongValue = ((Long) list.get(i2)).longValue();
            iZzA2 += zzgr.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
            i2++;
        }
        return iZzA2;
    }

    static int zzk(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhl) {
            zzhl zzhlVar = (zzhl) list;
            int iZzz = 0;
            while (i2 < size) {
                iZzz += zzgr.zzz(zzhlVar.zze(i2));
                i2++;
            }
            return iZzz;
        }
        int iZzz2 = 0;
        while (i2 < size) {
            iZzz2 += zzgr.zzz(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iZzz2;
    }

    static int zzl(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzib) {
            zzib zzibVar = (zzib) list;
            int iZzA = 0;
            while (i2 < size) {
                iZzA += zzgr.zzA(zzibVar.zze(i2));
                i2++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i2 < size) {
            iZzA2 += zzgr.zzA(((Long) list.get(i2)).longValue());
            i2++;
        }
        return iZzA2;
    }
}
