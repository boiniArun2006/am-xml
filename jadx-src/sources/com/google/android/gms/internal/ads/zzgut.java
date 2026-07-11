package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzgut {
    private static boolean zzc(List list, zzgrd zzgrdVar) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            Object obj = list.get(i2);
            if (!zzgrdVar.zza(obj)) {
                if (i2 > i3) {
                    try {
                        list.set(i3, obj);
                    } catch (IllegalArgumentException unused) {
                        zzd(list, zzgrdVar, i3, i2);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzd(list, zzgrdVar, i3, i2);
                        return true;
                    }
                }
                i3++;
            }
            i2++;
        }
        list.subList(i3, list.size()).clear();
        return i2 != i3;
    }

    public static boolean zza(Iterable iterable, zzgrd zzgrdVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzgrdVar.getClass();
            return zzc((List) iterable, zzgrdVar);
        }
        Iterator it = iterable.iterator();
        zzgrdVar.getClass();
        boolean z2 = false;
        while (it.hasNext()) {
            if (zzgrdVar.zza(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static Object zzb(Iterable iterable, Object obj) {
        zzgwt it = ((zzgwk) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    private static void zzd(List list, zzgrd zzgrdVar, int i2, int i3) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i3) {
                break;
            } else if (zzgrdVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i3--;
            if (i3 >= i2) {
                list.remove(i3);
            } else {
                return;
            }
        }
    }
}
