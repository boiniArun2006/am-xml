package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzibs extends zzhzz implements RandomAccess, zzibz, zzidl {
    private static final int[] zza;
    private static final zzibs zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzibs(iArr, 0, false);
    }

    zzibs() {
        this(zza, 0, true);
    }

    public static zzibs zzd() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int iIntValue = ((Integer) obj).intValue();
        zzdV();
        if (i2 < 0 || i2 > (i3 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzm(i2));
        }
        int i5 = i2 + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i3 < length) {
            System.arraycopy(iArr, i2, iArr, i5, i3 - i2);
        } else {
            int[] iArr2 = new int[zzk(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i2);
            System.arraycopy(this.zzc, i2, iArr2, i5, this.zzd - i2);
            this.zzc = iArr2;
        }
        this.zzc[i2] = iIntValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzibs)) {
            return super.equals(obj);
        }
        zzibs zzibsVar = (zzibs) obj;
        if (this.zzd != zzibsVar.zzd) {
            return false;
        }
        int[] iArr = zzibsVar.zzc;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            if (this.zzc[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.zzd; i3++) {
            i2 = (i2 * 31) + this.zzc[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    private zzibs(int[] iArr, int i2, boolean z2) {
        super(z2);
        this.zzc = iArr;
        this.zzd = i2;
    }

    private static int zzk(int i2) {
        return Math.max(((i2 * 3) / 2) + 1, 10);
    }

    private final void zzl(int i2) {
        if (i2 < 0 || i2 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzm(i2));
        }
    }

    private final String zzm(int i2) {
        int i3 = this.zzd;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 13 + String.valueOf(i3).length());
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i2 = this.zzd;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.zzc[i3] == iIntValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        return Integer.valueOf(zzg(i2, ((Integer) obj).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzicd, com.google.android.gms.internal.ads.zzibt
    /* JADX INFO: renamed from: zze */
    public final zzibz zzh(int i2) {
        if (i2 >= this.zzd) {
            return new zzibs(i2 == 0 ? zza : Arrays.copyOf(this.zzc, i2), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    final void zzj(int i2) {
        int length = this.zzc.length;
        if (i2 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[Math.max(i2, 10)];
            return;
        }
        while (length < i2) {
            length = zzk(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdV();
        byte[] bArr = zzice.zzb;
        collection.getClass();
        if (!(collection instanceof zzibs)) {
            return super.addAll(collection);
        }
        zzibs zzibsVar = (zzibs) collection;
        int i2 = zzibsVar.zzd;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzd;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i5 = i3 + i2;
            int[] iArr = this.zzc;
            if (i5 > iArr.length) {
                this.zzc = Arrays.copyOf(iArr, i5);
            }
            System.arraycopy(zzibsVar.zzc, 0, this.zzc, this.zzd, zzibsVar.zzd);
            this.zzd = i5;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzl(i2);
        return Integer.valueOf(this.zzc[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zzdV();
        zzl(i2);
        int[] iArr = this.zzc;
        int i3 = iArr[i2];
        if (i2 < this.zzd - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        zzdV();
        if (i3 >= i2) {
            int[] iArr = this.zzc;
            System.arraycopy(iArr, i3, iArr, i2, this.zzd - i3);
            this.zzd -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzibz
    public final int zzf(int i2) {
        zzl(i2);
        return this.zzc[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzibz
    public final int zzg(int i2, int i3) {
        zzdV();
        zzl(i2);
        int[] iArr = this.zzc;
        int i5 = iArr[i2];
        iArr[i2] = i3;
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.zzibz
    public final void zzi(int i2) {
        zzdV();
        int i3 = this.zzd;
        int length = this.zzc.length;
        if (i3 == length) {
            int[] iArr = new int[zzk(length)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i5 = this.zzd;
        this.zzd = i5 + 1;
        iArr2[i5] = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzi(((Integer) obj).intValue());
        return true;
    }
}
