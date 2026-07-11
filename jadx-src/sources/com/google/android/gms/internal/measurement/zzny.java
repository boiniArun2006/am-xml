package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzny {
    public static final /* synthetic */ int zza = 0;
    private static final zzoh zzb;

    public static zzoh zzA() {
        return zzb;
    }

    static boolean zzB(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static {
        int i2 = zznt.zza;
        zzb = new zzoj();
    }

    static void zzC(zzlr zzlrVar, Object obj, Object obj2) {
        if (((zzmb) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzD(zzoh zzohVar, Object obj, Object obj2) {
        zzme zzmeVar = (zzme) obj;
        zzoi zzoiVarZzc = zzmeVar.zzc;
        zzoi zzoiVar = ((zzme) obj2).zzc;
        if (!zzoi.zza().equals(zzoiVar)) {
            if (zzoi.zza().equals(zzoiVarZzc)) {
                zzoiVarZzc = zzoi.zzc(zzoiVarZzc, zzoiVar);
            } else {
                zzoiVarZzc.zzl(zzoiVar);
            }
        }
        zzmeVar.zzc = zzoiVarZzc;
    }

    static Object zzE(Object obj, int i2, int i3, Object obj2, zzoh zzohVar) {
        if (obj2 == null) {
            obj2 = zzohVar.zza(obj);
        }
        ((zzoi) obj2).zzk(i2 << 3, Long.valueOf(i3));
        return obj2;
    }

    public static void zza(int i2, List list, zzou zzouVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzC(i2, list, z2);
    }

    public static void zzb(int i2, List list, zzou zzouVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzB(i2, list, z2);
    }

    public static void zzc(int i2, List list, zzou zzouVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzy(i2, list, z2);
    }

    public static void zzd(int i2, List list, zzou zzouVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzz(i2, list, z2);
    }

    public static void zze(int i2, List list, zzou zzouVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzL(i2, list, z2);
    }

    public static void zzf(int i2, List list, zzou zzouVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzA(i2, list, z2);
    }

    public static void zzg(int i2, List list, zzou zzouVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzJ(i2, list, z2);
    }

    public static void zzh(int i2, List list, zzou zzouVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzw(i2, list, z2);
    }

    public static void zzi(int i2, List list, zzou zzouVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzH(i2, list, z2);
    }

    public static void zzj(int i2, List list, zzou zzouVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzK(i2, list, z2);
    }

    public static void zzk(int i2, List list, zzou zzouVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzx(i2, list, z2);
    }

    public static void zzl(int i2, List list, zzou zzouVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzI(i2, list, z2);
    }

    public static void zzm(int i2, List list, zzou zzouVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzD(i2, list, z2);
    }

    public static void zzn(int i2, List list, zzou zzouVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzE(i2, list, z2);
    }

    static int zzz(int i2, Object obj, zznw zznwVar) {
        int i3 = i2 << 3;
        if (!(obj instanceof zzmv)) {
            return zzll.zzz(i3) + zzll.zzD((zznl) obj, zznwVar);
        }
        int iZzz = zzll.zzz(i3);
        int iZzb = ((zzmv) obj).zzb();
        return iZzz + zzll.zzz(iZzb) + iZzb;
    }

    static int zzo(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmz) {
            zzmz zzmzVar = (zzmz) list;
            int iZzA = 0;
            while (i2 < size) {
                iZzA += zzll.zzA(zzmzVar.zzc(i2));
                i2++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i2 < size) {
            iZzA2 += zzll.zzA(((Long) list.get(i2)).longValue());
            i2++;
        }
        return iZzA2;
    }

    static int zzp(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmz) {
            zzmz zzmzVar = (zzmz) list;
            int iZzA = 0;
            while (i2 < size) {
                iZzA += zzll.zzA(zzmzVar.zzc(i2));
                i2++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i2 < size) {
            iZzA2 += zzll.zzA(((Long) list.get(i2)).longValue());
            i2++;
        }
        return iZzA2;
    }

    static int zzq(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmz) {
            zzmz zzmzVar = (zzmz) list;
            int iZzA = 0;
            while (i2 < size) {
                long jZzc = zzmzVar.zzc(i2);
                iZzA += zzll.zzA((jZzc >> 63) ^ (jZzc + jZzc));
                i2++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i2 < size) {
            long jLongValue = ((Long) list.get(i2)).longValue();
            iZzA2 += zzll.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
            i2++;
        }
        return iZzA2;
    }

    static int zzr(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmf) {
            zzmf zzmfVar = (zzmf) list;
            int iZzA = 0;
            while (i2 < size) {
                iZzA += zzll.zzA(zzmfVar.zzf(i2));
                i2++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i2 < size) {
            iZzA2 += zzll.zzA(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iZzA2;
    }

    static int zzs(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmf) {
            zzmf zzmfVar = (zzmf) list;
            int iZzA = 0;
            while (i2 < size) {
                iZzA += zzll.zzA(zzmfVar.zzf(i2));
                i2++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i2 < size) {
            iZzA2 += zzll.zzA(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iZzA2;
    }

    static int zzt(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmf) {
            zzmf zzmfVar = (zzmf) list;
            int iZzz = 0;
            while (i2 < size) {
                iZzz += zzll.zzz(zzmfVar.zzf(i2));
                i2++;
            }
            return iZzz;
        }
        int iZzz2 = 0;
        while (i2 < size) {
            iZzz2 += zzll.zzz(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iZzz2;
    }

    static int zzu(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmf) {
            zzmf zzmfVar = (zzmf) list;
            int iZzz = 0;
            while (i2 < size) {
                int iZzf = zzmfVar.zzf(i2);
                iZzz += zzll.zzz((iZzf >> 31) ^ (iZzf + iZzf));
                i2++;
            }
            return iZzz;
        }
        int iZzz2 = 0;
        while (i2 < size) {
            int iIntValue = ((Integer) list.get(i2)).intValue();
            iZzz2 += zzll.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
            i2++;
        }
        return iZzz2;
    }

    static int zzv(List list) {
        return list.size() * 4;
    }

    static int zzw(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzll.zzz(i2 << 3) + 4);
    }

    static int zzx(List list) {
        return list.size() * 8;
    }

    static int zzy(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzll.zzz(i2 << 3) + 8);
    }
}
