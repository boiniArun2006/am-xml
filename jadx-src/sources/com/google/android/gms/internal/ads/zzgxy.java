package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgxy extends AbstractList implements RandomAccess, Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgxy)) {
            return super.equals(obj);
        }
        zzgxy zzgxyVar = (zzgxy) obj;
        int i2 = this.zzc;
        int i3 = this.zzb;
        int i5 = zzgxyVar.zzc;
        int i7 = zzgxyVar.zzb;
        int i8 = i2 - i3;
        if (i5 - i7 != i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.zza[i3 + i9] != zzgxyVar.zza[i7 + i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && zzgxz.zzi(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        int i3 = this.zzc;
        int i5 = this.zzb;
        zzgrc.zzm(i2, i3 - i5, "index");
        return Integer.valueOf(this.zza[i5 + i2]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (int i2 = this.zzb; i2 < this.zzc; i2++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.zza[i2]);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int[] iArr = this.zza;
        int iIntValue = ((Integer) obj).intValue();
        int i2 = this.zzb;
        int iZzi = zzgxz.zzi(iArr, iIntValue, i2, this.zzc);
        if (iZzi >= 0) {
            return iZzi - i2;
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.zzb;
            int i3 = this.zzc - 1;
            while (true) {
                if (i3 < i2) {
                    i3 = -1;
                    break;
                }
                if (iArr[i3] == iIntValue) {
                    break;
                }
                i3--;
            }
            if (i3 >= 0) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int i3 = this.zzc;
        int i5 = this.zzb;
        Integer num = (Integer) obj;
        zzgrc.zzm(i2, i3 - i5, "index");
        int[] iArr = this.zza;
        int i7 = i5 + i2;
        int i8 = iArr[i7];
        num.getClass();
        iArr[i7] = num.intValue();
        return Integer.valueOf(i8);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.zza, this.zzb, this.zzc, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        int i5 = this.zzc;
        int i7 = this.zzb;
        zzgrc.zzo(i2, i3, i5 - i7);
        return i2 == i3 ? Collections.EMPTY_LIST : new zzgxy(this.zza, i2 + i7, i7 + i3);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i2 = this.zzc;
        int i3 = this.zzb;
        StringBuilder sb = new StringBuilder((i2 - i3) * 5);
        sb.append('[');
        int[] iArr = this.zza;
        sb.append(iArr[i3]);
        while (true) {
            i3++;
            if (i3 >= i2) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i3]);
        }
    }

    zzgxy(int[] iArr, int i2, int i3) {
        this.zza = iArr;
        this.zzb = i2;
        this.zzc = i3;
    }
}
