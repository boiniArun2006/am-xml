package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzidr {
    private static final int zzc(int i2, ArrayDeque arrayDeque) {
        int iBinarySearch = Arrays.binarySearch(zzidt.zzb, i2);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    static final /* synthetic */ zzian zza(zzian zzianVar, zzian zzianVar2, ArrayDeque arrayDeque) {
        zzb(zzianVar, arrayDeque);
        zzb(zzianVar2, arrayDeque);
        zzian zzidtVar = (zzian) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzidtVar = new zzidt((zzian) arrayDeque.pop(), zzidtVar, null);
        }
        return zzidtVar;
    }

    private static final void zzb(zzian zzianVar, ArrayDeque arrayDeque) {
        byte[] bArr;
        if (zzianVar.zzq()) {
            int iZzc = zzc(zzianVar.zzc(), arrayDeque);
            int iZzn = zzidt.zzn(iZzc + 1);
            if (!arrayDeque.isEmpty() && ((zzian) arrayDeque.peek()).zzc() < iZzn) {
                int iZzn2 = zzidt.zzn(iZzc);
                zzian zzidtVar = (zzian) arrayDeque.pop();
                while (true) {
                    bArr = null;
                    if (arrayDeque.isEmpty() || ((zzian) arrayDeque.peek()).zzc() >= iZzn2) {
                        break;
                    } else {
                        zzidtVar = new zzidt((zzian) arrayDeque.pop(), zzidtVar, bArr);
                    }
                }
                zzidt zzidtVar2 = new zzidt(zzidtVar, zzianVar, bArr);
                while (!arrayDeque.isEmpty()) {
                    if (((zzian) arrayDeque.peek()).zzc() >= zzidt.zzn(zzc(zzidtVar2.zzc(), arrayDeque) + 1)) {
                        break;
                    } else {
                        zzidtVar2 = new zzidt((zzian) arrayDeque.pop(), zzidtVar2, bArr);
                    }
                }
                arrayDeque.push(zzidtVar2);
                return;
            }
            arrayDeque.push(zzianVar);
            return;
        }
        if (zzianVar instanceof zzidt) {
            zzidt zzidtVar3 = (zzidt) zzianVar;
            zzb(zzidtVar3.zzo(), arrayDeque);
            zzb(zzidtVar3.zzE(), arrayDeque);
            return;
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzianVar.getClass())));
    }
}
