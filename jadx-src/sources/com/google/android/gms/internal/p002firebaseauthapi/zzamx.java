package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzamx {
    private static final zzano<?, ?> zza = new zzanq();

    static int zza(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzakg.zza(i2, true);
    }

    static int zzb(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzakg.zzi(i2));
    }

    static int zzc(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzakg.zzc(i2, 0);
    }

    static int zzd(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzakg.zza(i2, 0L);
    }

    static int zze(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzakg.zzi(i2));
    }

    static int zzf(int i2, List<Long> list, boolean z2) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzakg.zzi(i2));
    }

    static int zzg(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzakg.zzi(i2));
    }

    static int zzh(int i2, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzakg.zzi(i2));
    }

    static int zzi(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzakg.zzi(i2));
    }

    static int zzj(int i2, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzakg.zzi(i2));
    }

    public static void zzk(int i2, List<Integer> list, zzaof zzaofVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzk(i2, list, z2);
    }

    public static void zzl(int i2, List<Long> list, zzaof zzaofVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzl(i2, list, z2);
    }

    public static void zzm(int i2, List<Integer> list, zzaof zzaofVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzm(i2, list, z2);
    }

    public static void zzn(int i2, List<Long> list, zzaof zzaofVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzn(i2, list, z2);
    }

    static int zza(List<?> list) {
        return list.size();
    }

    static int zzc(List<?> list) {
        return list.size() << 2;
    }

    static int zzd(List<?> list) {
        return list.size() << 3;
    }

    static int zza(int i2, List<zzajp> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = size * zzakg.zzi(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzi += zzakg.zza(list.get(i3));
        }
        return iZzi;
    }

    static int zzb(List<Integer> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakz)) {
            int iZzc = 0;
            while (i2 < size) {
                iZzc += zzakg.zzc(list.get(i2).intValue());
                i2++;
            }
            return iZzc;
        }
        zzakz zzakzVar = (zzakz) list;
        int iZzc2 = 0;
        while (i2 < size) {
            iZzc2 += zzakg.zzc(zzakzVar.zzb(i2));
            i2++;
        }
        return iZzc2;
    }

    public static void zzc(int i2, List<Integer> list, zzaof zzaofVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzc(i2, list, z2);
    }

    public static void zzd(int i2, List<Integer> list, zzaof zzaofVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzd(i2, list, z2);
    }

    static int zze(List<Integer> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakz)) {
            int iZze = 0;
            while (i2 < size) {
                iZze += zzakg.zze(list.get(i2).intValue());
                i2++;
            }
            return iZze;
        }
        zzakz zzakzVar = (zzakz) list;
        int iZze2 = 0;
        while (i2 < size) {
            iZze2 += zzakg.zze(zzakzVar.zzb(i2));
            i2++;
        }
        return iZze2;
    }

    static int zzf(List<Long> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzalr)) {
            int iZzd = 0;
            while (i2 < size) {
                iZzd += zzakg.zzd(list.get(i2).longValue());
                i2++;
            }
            return iZzd;
        }
        zzalr zzalrVar = (zzalr) list;
        int iZzd2 = 0;
        while (i2 < size) {
            iZzd2 += zzakg.zzd(zzalrVar.zzb(i2));
            i2++;
        }
        return iZzd2;
    }

    static int zzg(List<Integer> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakz)) {
            int iZzh = 0;
            while (i2 < size) {
                iZzh += zzakg.zzh(list.get(i2).intValue());
                i2++;
            }
            return iZzh;
        }
        zzakz zzakzVar = (zzakz) list;
        int iZzh2 = 0;
        while (i2 < size) {
            iZzh2 += zzakg.zzh(zzakzVar.zzb(i2));
            i2++;
        }
        return iZzh2;
    }

    static int zzh(List<Long> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzalr)) {
            int iZzf = 0;
            while (i2 < size) {
                iZzf += zzakg.zzf(list.get(i2).longValue());
                i2++;
            }
            return iZzf;
        }
        zzalr zzalrVar = (zzalr) list;
        int iZzf2 = 0;
        while (i2 < size) {
            iZzf2 += zzakg.zzf(zzalrVar.zzb(i2));
            i2++;
        }
        return iZzf2;
    }

    static int zzi(List<Integer> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakz)) {
            int iZzj = 0;
            while (i2 < size) {
                iZzj += zzakg.zzj(list.get(i2).intValue());
                i2++;
            }
            return iZzj;
        }
        zzakz zzakzVar = (zzakz) list;
        int iZzj2 = 0;
        while (i2 < size) {
            iZzj2 += zzakg.zzj(zzakzVar.zzb(i2));
            i2++;
        }
        return iZzj2;
    }

    static int zzj(List<Long> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzalr)) {
            int iZzg = 0;
            while (i2 < size) {
                iZzg += zzakg.zzg(list.get(i2).longValue());
                i2++;
            }
            return iZzg;
        }
        zzalr zzalrVar = (zzalr) list;
        int iZzg2 = 0;
        while (i2 < size) {
            iZzg2 += zzakg.zzg(zzalrVar.zzb(i2));
            i2++;
        }
        return iZzg2;
    }

    static int zza(int i2, List<zzamc> list, zzamv<?> zzamvVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZza = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iZza += zzakg.zza(i2, list.get(i3), zzamvVar);
        }
        return iZza;
    }

    static int zzb(int i2, List<?> list, zzamv<?> zzamvVar) {
        int iZza;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = zzakg.zzi(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzalk) {
                iZza = zzakg.zza((zzalk) obj);
            } else {
                iZza = zzakg.zza((zzamc) obj, zzamvVar);
            }
            iZzi += iZza;
        }
        return iZzi;
    }

    public static void zze(int i2, List<Long> list, zzaof zzaofVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zze(i2, list, z2);
    }

    public static void zzf(int i2, List<Float> list, zzaof zzaofVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzf(i2, list, z2);
    }

    public static void zzg(int i2, List<Integer> list, zzaof zzaofVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzg(i2, list, z2);
    }

    public static void zzh(int i2, List<Long> list, zzaof zzaofVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzh(i2, list, z2);
    }

    public static void zzi(int i2, List<Integer> list, zzaof zzaofVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzi(i2, list, z2);
    }

    public static void zzj(int i2, List<Long> list, zzaof zzaofVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzj(i2, list, z2);
    }

    static int zza(int i2, Object obj, zzamv<?> zzamvVar) {
        if (obj instanceof zzalk) {
            return zzakg.zzb(i2, (zzalk) obj);
        }
        return zzakg.zzb(i2, (zzamc) obj, zzamvVar);
    }

    public static zzano<?, ?> zza() {
        return zza;
    }

    static <UT, UB> UB zza(Object obj, int i2, List<Integer> list, zzald zzaldVar, UB ub, zzano<UT, UB> zzanoVar) {
        if (zzaldVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Integer num = list.get(i5);
                int iIntValue = num.intValue();
                if (zzaldVar.zza(iIntValue)) {
                    if (i5 != i3) {
                        list.set(i3, num);
                    }
                    i3++;
                } else {
                    ub = (UB) zza(obj, i2, iIntValue, ub, zzanoVar);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (!zzaldVar.zza(iIntValue2)) {
                ub = (UB) zza(obj, i2, iIntValue2, ub, zzanoVar);
                it.remove();
            }
        }
        return ub;
    }

    static int zzb(int i2, List<?> list) {
        int iZza;
        int iZza2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzi = zzakg.zzi(i2) * size;
        if (!(list instanceof zzaln)) {
            while (i3 < size) {
                Object obj = list.get(i3);
                if (obj instanceof zzajp) {
                    iZza = zzakg.zza((zzajp) obj);
                } else {
                    iZza = zzakg.zza((String) obj);
                }
                iZzi += iZza;
                i3++;
            }
            return iZzi;
        }
        zzaln zzalnVar = (zzaln) list;
        while (i3 < size) {
            Object objZza = zzalnVar.zza(i3);
            if (objZza instanceof zzajp) {
                iZza2 = zzakg.zza((zzajp) objZza);
            } else {
                iZza2 = zzakg.zza((String) objZza);
            }
            iZzi += iZza2;
            i3++;
        }
        return iZzi;
    }

    static <UT, UB> UB zza(Object obj, int i2, int i3, UB ub, zzano<UT, UB> zzanoVar) {
        if (ub == null) {
            ub = zzanoVar.zzc(obj);
        }
        zzanoVar.zzb(ub, i2, i3);
        return ub;
    }

    public static void zzb(int i2, List<Double> list, zzaof zzaofVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzb(i2, list, z2);
    }

    static <T, FT extends zzakt<FT>> void zza(zzakm<FT> zzakmVar, T t3, T t4) {
        zzakr<T> zzakrVarZza = zzakmVar.zza(t4);
        if (zzakrVarZza.zza.isEmpty()) {
            return;
        }
        zzakmVar.zzb(t3).zza((zzakr) zzakrVarZza);
    }

    public static void zzb(int i2, List<?> list, zzaof zzaofVar, zzamv<?> zzamvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzb(i2, list, (zzamv) zzamvVar);
    }

    public static void zzb(int i2, List<String> list, zzaof zzaofVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzb(i2, list);
    }

    static <T> void zza(zzalz zzalzVar, T t3, T t4, long j2) {
        zzanp.zza(t3, j2, zzalzVar.zza(zzanp.zze(t3, j2), zzanp.zze(t4, j2)));
    }

    static <T, UT, UB> void zza(zzano<UT, UB> zzanoVar, T t3, T t4) {
        zzanoVar.zzc(t3, zzanoVar.zza(zzanoVar.zzd(t3), zzanoVar.zzd(t4)));
    }

    public static void zza(Class<?> cls) {
        zzaky.class.isAssignableFrom(cls);
    }

    public static void zza(int i2, List<Boolean> list, zzaof zzaofVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zza(i2, list, z2);
    }

    public static void zza(int i2, List<zzajp> list, zzaof zzaofVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zza(i2, list);
    }

    public static void zza(int i2, List<?> list, zzaof zzaofVar, zzamv<?> zzamvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zza(i2, list, (zzamv) zzamvVar);
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
