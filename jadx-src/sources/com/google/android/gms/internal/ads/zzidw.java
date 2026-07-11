package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzidw {
    public static final /* synthetic */ int zza = 0;
    private static final zzief zzb;

    public static zzief zzF() {
        return zzb;
    }

    static boolean zzG(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static {
        int i2 = zziaa.zza;
        zzb = new zzieh();
    }

    static int zzD(int i2, Object obj, zzidu zziduVar) {
        int iZzA;
        int iZzaT;
        int iZzA2;
        int i3 = i2 << 3;
        if (obj instanceof zzicm) {
            iZzA = zziaw.zzA(i3);
            iZzaT = ((zzicm) obj).zzb();
            iZzA2 = zziaw.zzA(iZzaT);
        } else {
            iZzA = zziaw.zzA(i3);
            iZzaT = ((zzhzw) obj).zzaT(zziduVar);
            iZzA2 = zziaw.zzA(iZzaT);
        }
        return iZzA + iZzA2 + iZzaT;
    }

    @Deprecated
    static int zzE(int i2, zzidc zzidcVar, zzidu zziduVar) {
        int iZzA = zziaw.zzA(i2 << 3);
        return iZzA + iZzA + ((zzhzw) zzidcVar).zzaT(zziduVar);
    }

    static void zzH(zzibc zzibcVar, Object obj, Object obj2) {
        if (((zzibn) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzI(zzief zziefVar, Object obj, Object obj2) {
        zzibr zzibrVar = (zzibr) obj;
        zzieg zziegVarZzc = zzibrVar.zzt;
        zzieg zziegVar = ((zzibr) obj2).zzt;
        if (!zzieg.zza().equals(zziegVar)) {
            if (zzieg.zza().equals(zziegVarZzc)) {
                zziegVarZzc = zzieg.zzc(zziegVarZzc, zziegVar);
            } else {
                zziegVarZzc.zzm(zziegVar);
            }
        }
        zzibrVar.zzt = zziegVarZzc;
    }

    static Object zzJ(Object obj, int i2, List list, zzibx zzibxVar, Object obj2, zzief zziefVar) {
        if (zzibxVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzibxVar.zza(iIntValue)) {
                    obj2 = zzK(obj, i2, iIntValue, obj2, zziefVar);
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
            if (zzibxVar.zza(iIntValue2)) {
                if (i5 != i3) {
                    list.set(i3, num);
                }
                i3++;
            } else {
                obj2 = zzK(obj, i2, iIntValue2, obj2, zziefVar);
            }
        }
        if (i3 != size) {
            list.subList(i3, size).clear();
        }
        return obj2;
    }

    static Object zzK(Object obj, int i2, int i3, Object obj2, zzief zziefVar) {
        if (obj2 == null) {
            obj2 = zziefVar.zzh(obj);
        }
        zziefVar.zza(obj2, i2, i3);
        return obj2;
    }

    public static void zza(int i2, List list, zzieu zzieuVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzC(i2, list, z2);
    }

    public static void zzb(int i2, List list, zzieu zzieuVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzB(i2, list, z2);
    }

    public static void zzc(int i2, List list, zzieu zzieuVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzy(i2, list, z2);
    }

    public static void zzd(int i2, List list, zzieu zzieuVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzz(i2, list, z2);
    }

    public static void zze(int i2, List list, zzieu zzieuVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzL(i2, list, z2);
    }

    public static void zzf(int i2, List list, zzieu zzieuVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzA(i2, list, z2);
    }

    public static void zzg(int i2, List list, zzieu zzieuVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzJ(i2, list, z2);
    }

    public static void zzh(int i2, List list, zzieu zzieuVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzw(i2, list, z2);
    }

    public static void zzi(int i2, List list, zzieu zzieuVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzH(i2, list, z2);
    }

    public static void zzj(int i2, List list, zzieu zzieuVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzK(i2, list, z2);
    }

    public static void zzk(int i2, List list, zzieu zzieuVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzx(i2, list, z2);
    }

    public static void zzl(int i2, List list, zzieu zzieuVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzI(i2, list, z2);
    }

    public static void zzm(int i2, List list, zzieu zzieuVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzD(i2, list, z2);
    }

    public static void zzn(int i2, List list, zzieu zzieuVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzE(i2, list, z2);
    }

    public static void zzo(int i2, List list, zzieu zzieuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzF(i2, list);
    }

    public static void zzp(int i2, List list, zzieu zzieuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzG(i2, list);
    }

    public static void zzq(int i2, List list, zzieu zzieuVar, zzidu zziduVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((zziax) zzieuVar).zzr(i2, list.get(i3), zziduVar);
        }
    }

    public static void zzr(int i2, List list, zzieu zzieuVar, zzidu zziduVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((zziax) zzieuVar).zzs(i2, list.get(i3), zziduVar);
        }
    }

    static int zzA(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zziaw.zzA(i2 << 3) + 4);
    }

    static int zzB(List list) {
        return list.size() * 8;
    }

    static int zzC(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zziaw.zzA(i2 << 3) + 8);
    }

    static int zzs(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            int iZzB = 0;
            while (i2 < size) {
                iZzB += zziaw.zzB(zzicqVar.zzc(i2));
                i2++;
            }
            return iZzB;
        }
        int iZzB2 = 0;
        while (i2 < size) {
            iZzB2 += zziaw.zzB(((Long) list.get(i2)).longValue());
            i2++;
        }
        return iZzB2;
    }

    static int zzt(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            int iZzB = 0;
            while (i2 < size) {
                iZzB += zziaw.zzB(zzicqVar.zzc(i2));
                i2++;
            }
            return iZzB;
        }
        int iZzB2 = 0;
        while (i2 < size) {
            iZzB2 += zziaw.zzB(((Long) list.get(i2)).longValue());
            i2++;
        }
        return iZzB2;
    }

    static int zzu(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            int iZzB = 0;
            while (i2 < size) {
                long jZzc = zzicqVar.zzc(i2);
                iZzB += zziaw.zzB((jZzc >> 63) ^ (jZzc + jZzc));
                i2++;
            }
            return iZzB;
        }
        int iZzB2 = 0;
        while (i2 < size) {
            long jLongValue = ((Long) list.get(i2)).longValue();
            iZzB2 += zziaw.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
            i2++;
        }
        return iZzB2;
    }

    static int zzv(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            int iZzB = 0;
            while (i2 < size) {
                iZzB += zziaw.zzB(zzibsVar.zzf(i2));
                i2++;
            }
            return iZzB;
        }
        int iZzB2 = 0;
        while (i2 < size) {
            iZzB2 += zziaw.zzB(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iZzB2;
    }

    static int zzw(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            int iZzB = 0;
            while (i2 < size) {
                iZzB += zziaw.zzB(zzibsVar.zzf(i2));
                i2++;
            }
            return iZzB;
        }
        int iZzB2 = 0;
        while (i2 < size) {
            iZzB2 += zziaw.zzB(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iZzB2;
    }

    static int zzx(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            int iZzA = 0;
            while (i2 < size) {
                iZzA += zziaw.zzA(zzibsVar.zzf(i2));
                i2++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i2 < size) {
            iZzA2 += zziaw.zzA(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iZzA2;
    }

    static int zzy(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            int iZzA = 0;
            while (i2 < size) {
                int iZzf = zzibsVar.zzf(i2);
                iZzA += zziaw.zzA((iZzf >> 31) ^ (iZzf + iZzf));
                i2++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i2 < size) {
            int iIntValue = ((Integer) list.get(i2)).intValue();
            iZzA2 += zziaw.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
            i2++;
        }
        return iZzA2;
    }

    static int zzz(List list) {
        return list.size() * 4;
    }
}
