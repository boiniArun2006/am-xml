package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzoy {
    public static final /* synthetic */ int zza = 0;
    private static final zzpl zzb;

    static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static zzpl zzm() {
        return zzb;
    }

    static {
        int i2 = zzos.zza;
        zzb = new zzpn();
    }

    public static void zzA(int i2, List list, zzpy zzpyVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzA(i2, list, z2);
    }

    public static void zzB(int i2, List list, zzpy zzpyVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzC(i2, list, z2);
    }

    public static void zzC(int i2, List list, zzpy zzpyVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzE(i2, list, z2);
    }

    public static void zzD(int i2, List list, zzpy zzpyVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzJ(i2, list, z2);
    }

    public static void zzE(int i2, List list, zzpy zzpyVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzL(i2, list, z2);
    }

    static int zzh(int i2, Object obj, zzow zzowVar) {
        int i3 = i2 << 3;
        if (!(obj instanceof zznt)) {
            return zzln.zzA(i3) + zzln.zzy((zzoi) obj, zzowVar);
        }
        int iZzA = zzln.zzA(i3);
        int iZza = ((zznt) obj).zza();
        return iZzA + zzln.zzA(iZza) + iZza;
    }

    static Object zzn(Object obj, int i2, List list, zznh zznhVar, Object obj2, zzpl zzplVar) {
        if (zznhVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zznhVar.zza(iIntValue)) {
                    obj2 = zzo(obj, i2, iIntValue, obj2, zzplVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i3 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Integer num = (Integer) list.get(i5);
            int iIntValue2 = num.intValue();
            if (zznhVar.zza(iIntValue2)) {
                if (i5 != i3) {
                    list.set(i3, num);
                }
                i3++;
            } else {
                obj2 = zzo(obj, i2, iIntValue2, obj2, zzplVar);
            }
        }
        if (i3 != size) {
            list.subList(i3, size).clear();
        }
        return obj2;
    }

    static Object zzo(Object obj, int i2, int i3, Object obj2, zzpl zzplVar) {
        if (obj2 == null) {
            obj2 = zzplVar.zza(obj);
        }
        zzplVar.zzh(obj2, i2, i3);
        return obj2;
    }

    static void zzp(zzmp zzmpVar, Object obj, Object obj2) {
        zzmt zzmtVar = ((zzna) obj2).zzb;
        if (zzmtVar.zza.isEmpty()) {
            return;
        }
        ((zzna) obj).zzi().zzh(zzmtVar);
    }

    static void zzq(zzpl zzplVar, Object obj, Object obj2) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVarZze = zzndVar.zzc;
        zzpm zzpmVar = ((zznd) obj2).zzc;
        if (!zzpm.zzc().equals(zzpmVar)) {
            if (zzpm.zzc().equals(zzpmVarZze)) {
                zzpmVarZze = zzpm.zze(zzpmVarZze, zzpmVar);
            } else {
                zzpmVarZze.zzd(zzpmVar);
            }
        }
        zzndVar.zzc = zzpmVarZze;
    }

    public static void zzr(int i2, List list, zzpy zzpyVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzc(i2, list, z2);
    }

    public static void zzs(int i2, List list, zzpy zzpyVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzg(i2, list, z2);
    }

    public static void zzt(int i2, List list, zzpy zzpyVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzj(i2, list, z2);
    }

    public static void zzu(int i2, List list, zzpy zzpyVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzl(i2, list, z2);
    }

    public static void zzv(int i2, List list, zzpy zzpyVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzn(i2, list, z2);
    }

    public static void zzw(int i2, List list, zzpy zzpyVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzp(i2, list, z2);
    }

    public static void zzx(int i2, List list, zzpy zzpyVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzs(i2, list, z2);
    }

    public static void zzy(int i2, List list, zzpy zzpyVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzu(i2, list, z2);
    }

    public static void zzz(int i2, List list, zzpy zzpyVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzy(i2, list, z2);
    }

    static int zza(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            int iZzB = 0;
            while (i2 < size) {
                iZzB += zzln.zzB(zzneVar.zze(i2));
                i2++;
            }
            return iZzB;
        }
        int iZzB2 = 0;
        while (i2 < size) {
            iZzB2 += zzln.zzB(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iZzB2;
    }

    static int zzb(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzln.zzA(i2 << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzln.zzA(i2 << 3) + 8);
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
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            int iZzB = 0;
            while (i2 < size) {
                iZzB += zzln.zzB(zzneVar.zze(i2));
                i2++;
            }
            return iZzB;
        }
        int iZzB2 = 0;
        while (i2 < size) {
            iZzB2 += zzln.zzB(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iZzB2;
    }

    static int zzg(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            int iZzB = 0;
            while (i2 < size) {
                iZzB += zzln.zzB(zznxVar.zze(i2));
                i2++;
            }
            return iZzB;
        }
        int iZzB2 = 0;
        while (i2 < size) {
            iZzB2 += zzln.zzB(((Long) list.get(i2)).longValue());
            i2++;
        }
        return iZzB2;
    }

    static int zzi(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            int iZzA = 0;
            while (i2 < size) {
                int iZze = zzneVar.zze(i2);
                iZzA += zzln.zzA((iZze >> 31) ^ (iZze + iZze));
                i2++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i2 < size) {
            int iIntValue = ((Integer) list.get(i2)).intValue();
            iZzA2 += zzln.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
            i2++;
        }
        return iZzA2;
    }

    static int zzj(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            int iZzB = 0;
            while (i2 < size) {
                long jZze = zznxVar.zze(i2);
                iZzB += zzln.zzB((jZze >> 63) ^ (jZze + jZze));
                i2++;
            }
            return iZzB;
        }
        int iZzB2 = 0;
        while (i2 < size) {
            long jLongValue = ((Long) list.get(i2)).longValue();
            iZzB2 += zzln.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
            i2++;
        }
        return iZzB2;
    }

    static int zzk(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            int iZzA = 0;
            while (i2 < size) {
                iZzA += zzln.zzA(zzneVar.zze(i2));
                i2++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i2 < size) {
            iZzA2 += zzln.zzA(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iZzA2;
    }

    static int zzl(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            int iZzB = 0;
            while (i2 < size) {
                iZzB += zzln.zzB(zznxVar.zze(i2));
                i2++;
            }
            return iZzB;
        }
        int iZzB2 = 0;
        while (i2 < size) {
            iZzB2 += zzln.zzB(((Long) list.get(i2)).longValue());
            i2++;
        }
        return iZzB2;
    }
}
