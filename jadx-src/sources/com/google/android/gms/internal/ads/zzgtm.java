package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgtm extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    zzgtm() {
        zza(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzw, reason: merged with bridge method [inline-methods] */
    public final int zzh() {
        return (1 << (this.zzf & 31)) - 1;
    }

    final void zza(int i2) {
        this.zzf = zzgxz.zzc(i2, 1, 1073741823);
    }

    final boolean zzb() {
        return this.zze == null;
    }

    final void zzd() {
        this.zzf += 32;
    }

    final int zzg(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.zzg) {
            return i3;
        }
        return -1;
    }

    final /* synthetic */ int zzs() {
        return this.zzf;
    }

    final /* synthetic */ int zzt() {
        return this.zzg;
    }

    final /* synthetic */ void zzu(int i2) {
        this.zzg = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final int[] zzl() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
    public final Object[] zzm() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final Object[] zzn() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private final int zzx(int i2, int i3, int i5, int i7) {
        int i8 = i3 - 1;
        Object objZza = zzgtn.zza(i3);
        if (i7 != 0) {
            zzgtn.zzc(objZza, i5 & i8, i7 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzl = zzl();
        for (int i9 = 0; i9 <= i2; i9++) {
            int iZzb = zzgtn.zzb(obj, i9);
            while (iZzb != 0) {
                int i10 = iZzb - 1;
                int i11 = iArrZzl[i10];
                int i12 = ((~i2) & i11) | i9;
                int i13 = i12 & i8;
                int iZzb2 = zzgtn.zzb(objZza, i13);
                zzgtn.zzc(objZza, i13, iZzb);
                iArrZzl[i10] = ((~i8) & i12) | (iZzb2 & i8);
                iZzb = i11 & i2;
            }
        }
        this.zze = objZza;
        zzv(i8);
        return i8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzgth zzgthVar = new zzgth(this, null);
        this.zzi = zzgthVar;
        return zzgthVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzgtj zzgtjVar = new zzgtj(this, null);
        this.zzh = zzgtjVar;
        return zzgtjVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i2;
        if (zzb()) {
            zzgrc.zzj(zzb(), "Arrays already allocated");
            int i3 = this.zzf;
            int iMax = Math.max(i3 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzgtn.zza(iMax2);
            zzv(iMax2 - 1);
            this.zza = new int[i3];
            this.zzb = new Object[i3];
            this.zzc = new Object[i3];
        }
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.put(obj, obj2);
        }
        int[] iArrZzl = zzl();
        Object[] objArrZzm = zzm();
        Object[] objArrZzn = zzn();
        int i5 = this.zzg;
        int i7 = i5 + 1;
        int iZzb = zzgty.zzb(obj);
        int iZzh = zzh();
        int i8 = iZzb & iZzh;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iZzb2 = zzgtn.zzb(obj3, i8);
        if (iZzb2 == 0) {
            if (i7 > iZzh) {
                iZzh = zzx(iZzh, zzgtn.zzd(iZzh), iZzb, i5);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzgtn.zzc(obj4, i8, i7);
            }
            i2 = 1;
        } else {
            int i9 = ~iZzh;
            int i10 = iZzb & i9;
            int i11 = 0;
            while (true) {
                int i12 = iZzb2 - 1;
                int i13 = iArrZzl[i12];
                i2 = 1;
                int i14 = i13 & i9;
                if (i14 == i10 && Objects.equals(obj, objArrZzm[i12])) {
                    Object obj5 = objArrZzn[i12];
                    objArrZzn[i12] = obj2;
                    return obj5;
                }
                int i15 = i13 & iZzh;
                i11++;
                if (i15 != 0) {
                    iZzb2 = i15;
                } else {
                    if (i11 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzh() + 1, 1.0f);
                        int iZzf = zzf();
                        while (iZzf >= 0) {
                            linkedHashMap.put(zzm()[iZzf], zzn()[iZzf]);
                            iZzf = zzg(iZzf);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzd();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i7 > iZzh) {
                        iZzh = zzx(iZzh, zzgtn.zzd(iZzh), iZzb, i5);
                    } else {
                        iArrZzl[i12] = (i7 & iZzh) | i14;
                    }
                }
            }
        }
        int length = zzl().length;
        if (i7 > length) {
            int i16 = i2;
            int iMin = Math.min(1073741823, (Math.max(i16, length >>> 1) + length) | i16);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzl(), iMin);
                this.zzb = Arrays.copyOf(zzm(), iMin);
                this.zzc = Arrays.copyOf(zzn(), iMin);
            }
        }
        zzl()[i5] = (~iZzh) & iZzb;
        zzm()[i5] = obj;
        zzn()[i5] = obj2;
        this.zzg = i7;
        zzd();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzgtl zzgtlVar = new zzgtl(this, null);
        this.zzj = zzgtlVar;
        return zzgtlVar;
    }

    final Map zzc() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void zze(int i2, int i3) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzl = zzl();
        Object[] objArrZzm = zzm();
        Object[] objArrZzn = zzn();
        int size = size();
        int i5 = size - 1;
        if (i2 >= i5) {
            objArrZzm[i2] = null;
            objArrZzn[i2] = null;
            iArrZzl[i2] = 0;
            return;
        }
        int i7 = i2 + 1;
        Object obj2 = objArrZzm[i5];
        objArrZzm[i2] = obj2;
        objArrZzn[i2] = objArrZzn[i5];
        objArrZzm[i5] = null;
        objArrZzn[i5] = null;
        iArrZzl[i2] = iArrZzl[i5];
        iArrZzl[i5] = 0;
        int iZzb = zzgty.zzb(obj2) & i3;
        int iZzb2 = zzgtn.zzb(obj, iZzb);
        if (iZzb2 == size) {
            zzgtn.zzc(obj, iZzb, i7);
            return;
        }
        while (true) {
            int i8 = iZzb2 - 1;
            int i9 = iArrZzl[i8];
            int i10 = i9 & i3;
            if (i10 == size) {
                iArrZzl[i8] = (i9 & (~i3)) | (i3 & i7);
                return;
            }
            iZzb2 = i10;
        }
    }

    final /* synthetic */ Object zzk() {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    zzgtm(int i2) {
        zza(8);
    }

    private final void zzv(int i2) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i2)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzy, reason: merged with bridge method [inline-methods] */
    public final int zzi(Object obj) {
        if (zzb()) {
            return -1;
        }
        int iZzb = zzgty.zzb(obj);
        int iZzh = zzh();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iZzb2 = zzgtn.zzb(obj2, iZzb & iZzh);
        if (iZzb2 != 0) {
            int i2 = ~iZzh;
            int i3 = iZzb & i2;
            do {
                int i5 = iZzb2 - 1;
                int i7 = zzl()[i5];
                if ((i7 & i2) == i3 && Objects.equals(obj, zzm()[i5])) {
                    return i5;
                }
                iZzb2 = i7 & iZzh;
            } while (iZzb2 != 0);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final Object zzj(Object obj) {
        if (!zzb()) {
            int iZzh = zzh();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iZze = zzgtn.zze(obj, null, iZzh, obj2, zzl(), zzm(), null);
            if (iZze != -1) {
                Object obj3 = zzn()[iZze];
                zze(iZze, iZzh);
                this.zzg--;
                zzd();
                return obj3;
            }
        }
        return zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzb()) {
            return;
        }
        zzd();
        Map mapZzc = zzc();
        if (mapZzc != null) {
            this.zzf = zzgxz.zzc(size(), 3, 1073741823);
            mapZzc.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzm(), 0, this.zzg, (Object) null);
        Arrays.fill(zzn(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzl(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.containsKey(obj);
        }
        if (zzi(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc == null) {
            for (int i2 = 0; i2 < this.zzg; i2++) {
                if (Objects.equals(obj, zzn()[i2])) {
                    return true;
                }
            }
            return false;
        }
        return mapZzc.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.get(obj);
        }
        int iZzi = zzi(obj);
        if (iZzi == -1) {
            return null;
        }
        return zzn()[iZzi];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.remove(obj);
        }
        Object objZzj = zzj(obj);
        if (objZzj == zzd) {
            return null;
        }
        return objZzj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.size();
        }
        return this.zzg;
    }

    final int zzf() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    final /* synthetic */ Object zzo(int i2) {
        return zzm()[i2];
    }

    final /* synthetic */ Object zzp(int i2) {
        return zzn()[i2];
    }

    final /* synthetic */ void zzq(int i2, Object obj) {
        zzn()[i2] = obj;
    }
}
