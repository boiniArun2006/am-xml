package com.google.android.gms.internal.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zzah extends zzac implements List, RandomAccess {
    private static final zzal zza = new zzae(zzaj.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < size; i2++) {
                if (!Objects.equals(get(i2), list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: zza */
    public final zzak iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.common.zzac
    @Deprecated
    public final zzah zze() {
        return this;
    }

    public static zzah zzj() {
        return zzaj.zza;
    }

    public static zzah zzp(Collection collection) {
        if (!(collection instanceof zzac)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzai.zza(array, length);
            return zzq(array, length);
        }
        zzah zzahVarZze = ((zzac) collection).zze();
        if (!zzahVarZze.zzf()) {
            return zzahVarZze;
        }
        Object[] array2 = zzahVarZze.toArray();
        return zzq(array2, array2.length);
    }

    static zzah zzq(Object[] objArr, int i2) {
        return i2 == 0 ? zzaj.zza : new zzaj(objArr, i2);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    zzah() {
    }

    public static zzah zzk(Object obj) {
        Object[] objArr = {obj};
        zzai.zza(objArr, 1);
        return zzq(objArr, 1);
    }

    public static zzah zzl(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzai.zza(objArr, 2);
        return zzq(objArr, 2);
    }

    public static zzah zzm(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzai.zza(objArr, 3);
        return zzq(objArr, 3);
    }

    public static zzah zzn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        zzai.zza(objArr, 6);
        return zzq(objArr, 6);
    }

    public static zzah zzo(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return zzp((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return zzaj.zza;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return zzk(next);
        }
        zzad zzadVar = new zzad(4);
        zzadVar.zzb(next);
        zzadVar.zzc(it);
        return zzadVar.zzd();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode = (iHashCode * 31) + get(i2).hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.common.zzac
    int zzg(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = get(i3);
        }
        return size;
    }

    public zzah zzh() {
        if (size() <= 1) {
            return this;
        }
        return new zzaf(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public zzah subList(int i2, int i3) {
        zzr.zzd(i2, i3, size());
        int i5 = i3 - i2;
        if (i5 == size()) {
            return this;
        }
        if (i5 == 0) {
            return zzaj.zza;
        }
        return new zzag(this, i2, i5);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public final zzal listIterator(int i2) {
        zzr.zzc(i2, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzae(this, i2);
    }
}
