package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhzc extends AbstractMap implements Serializable {
    private static final Comparator zze = new zzhyv();
    zzhzb zza;
    int zzb;
    int zzc;
    final zzhzb zzd;
    private final Comparator zzf;
    private final boolean zzg;
    private zzhyx zzh;
    private zzhyz zzi;

    public zzhzc() {
        this(zze, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        zzhzb zzhzbVar = this.zzd;
        zzhzbVar.zze = zzhzbVar;
        zzhzbVar.zzd = zzhzbVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb;
    }

    final zzhzb zzb(Object obj) {
        if (obj != null) {
            try {
                return zza(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public zzhzc(Comparator comparator, boolean z2) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z2;
        this.zzd = new zzhzb(z2);
    }

    private final void zzf(zzhzb zzhzbVar, zzhzb zzhzbVar2) {
        zzhzb zzhzbVar3 = zzhzbVar.zza;
        zzhzbVar.zza = null;
        if (zzhzbVar2 != null) {
            zzhzbVar2.zza = zzhzbVar3;
        }
        if (zzhzbVar3 == null) {
            this.zza = zzhzbVar2;
        } else if (zzhzbVar3.zzb == zzhzbVar) {
            zzhzbVar3.zzb = zzhzbVar2;
        } else {
            zzhzbVar3.zzc = zzhzbVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzg(zzhzb zzhzbVar, boolean z2) {
        while (zzhzbVar != null) {
            zzhzb zzhzbVar2 = zzhzbVar.zzb;
            zzhzb zzhzbVar3 = zzhzbVar.zzc;
            boolean z3 = false;
            int i2 = zzhzbVar2 != null ? zzhzbVar2.zzi : 0;
            int i3 = zzhzbVar3 != null ? zzhzbVar3.zzi : 0;
            int i5 = i2 - i3;
            boolean z4 = true;
            if (i5 == -2) {
                zzhzb zzhzbVar4 = zzhzbVar3.zzb;
                zzhzb zzhzbVar5 = zzhzbVar3.zzc;
                int i7 = (zzhzbVar4 != null ? zzhzbVar4.zzi : 0) - (zzhzbVar5 != null ? zzhzbVar5.zzi : 0);
                if (i7 != -1) {
                    if (i7 == 0) {
                        if (!z2) {
                        }
                        if (z4) {
                            return;
                        }
                    } else {
                        z4 = z2;
                    }
                    zzi(zzhzbVar3);
                    zzh(zzhzbVar);
                    if (z4) {
                    }
                } else {
                    z3 = z2;
                }
                zzh(zzhzbVar);
                z4 = z3;
                if (z4) {
                }
            } else if (i5 == 2) {
                zzhzb zzhzbVar6 = zzhzbVar2.zzb;
                zzhzb zzhzbVar7 = zzhzbVar2.zzc;
                int i8 = (zzhzbVar6 != null ? zzhzbVar6.zzi : 0) - (zzhzbVar7 != null ? zzhzbVar7.zzi : 0);
                if (i8 != 1) {
                    if (i8 == 0) {
                        if (!z2) {
                        }
                        if (z4) {
                            return;
                        }
                    } else {
                        z4 = z2;
                    }
                    zzh(zzhzbVar2);
                    zzi(zzhzbVar);
                    if (z4) {
                    }
                } else {
                    z3 = z2;
                }
                zzi(zzhzbVar);
                z4 = z3;
                if (z4) {
                }
            } else if (i5 == 0) {
                zzhzbVar.zzi = i2 + 1;
                if (z2) {
                    return;
                }
            } else {
                zzhzbVar.zzi = Math.max(i2, i3) + 1;
                if (!z2) {
                    return;
                }
            }
            zzhzbVar = zzhzbVar.zza;
        }
    }

    private final void zzh(zzhzb zzhzbVar) {
        zzhzb zzhzbVar2 = zzhzbVar.zzb;
        zzhzb zzhzbVar3 = zzhzbVar.zzc;
        zzhzb zzhzbVar4 = zzhzbVar3.zzb;
        zzhzb zzhzbVar5 = zzhzbVar3.zzc;
        zzhzbVar.zzc = zzhzbVar4;
        if (zzhzbVar4 != null) {
            zzhzbVar4.zza = zzhzbVar;
        }
        zzf(zzhzbVar, zzhzbVar3);
        zzhzbVar3.zzb = zzhzbVar;
        zzhzbVar.zza = zzhzbVar3;
        int iMax = Math.max(zzhzbVar2 != null ? zzhzbVar2.zzi : 0, zzhzbVar4 != null ? zzhzbVar4.zzi : 0) + 1;
        zzhzbVar.zzi = iMax;
        zzhzbVar3.zzi = Math.max(iMax, zzhzbVar5 != null ? zzhzbVar5.zzi : 0) + 1;
    }

    private final void zzi(zzhzb zzhzbVar) {
        zzhzb zzhzbVar2 = zzhzbVar.zzb;
        zzhzb zzhzbVar3 = zzhzbVar.zzc;
        zzhzb zzhzbVar4 = zzhzbVar2.zzb;
        zzhzb zzhzbVar5 = zzhzbVar2.zzc;
        zzhzbVar.zzb = zzhzbVar5;
        if (zzhzbVar5 != null) {
            zzhzbVar5.zza = zzhzbVar;
        }
        zzf(zzhzbVar, zzhzbVar2);
        zzhzbVar2.zzc = zzhzbVar;
        zzhzbVar.zza = zzhzbVar2;
        int iMax = Math.max(zzhzbVar3 != null ? zzhzbVar3.zzi : 0, zzhzbVar5 != null ? zzhzbVar5.zzi : 0) + 1;
        zzhzbVar.zzi = iMax;
        zzhzbVar2.zzi = Math.max(iMax, zzhzbVar4 != null ? zzhzbVar4.zzi : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzhyx zzhyxVar = this.zzh;
        if (zzhyxVar != null) {
            return zzhyxVar;
        }
        zzhyx zzhyxVar2 = new zzhyx(this);
        this.zzh = zzhyxVar2;
        return zzhyxVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzhyz zzhyzVar = this.zzi;
        if (zzhyzVar != null) {
            return zzhyzVar;
        }
        zzhyz zzhyzVar2 = new zzhyz(this);
        this.zzi = zzhyzVar2;
        return zzhyzVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        zzhzb zzhzbVarZza = zza(obj, true);
        Object obj3 = zzhzbVarZza.zzh;
        zzhzbVarZza.zzh = obj2;
        return obj3;
    }

    final zzhzb zza(Object obj, boolean z2) {
        int iCompareTo;
        zzhzb zzhzbVar;
        Comparator comparator = this.zzf;
        zzhzb zzhzbVar2 = this.zza;
        if (zzhzbVar2 != null) {
            Comparable comparable = comparator == zze ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(zzhzbVar2.zzf) : comparator.compare(obj, zzhzbVar2.zzf);
                if (iCompareTo == 0) {
                    return zzhzbVar2;
                }
                zzhzb zzhzbVar3 = iCompareTo < 0 ? zzhzbVar2.zzb : zzhzbVar2.zzc;
                if (zzhzbVar3 == null) {
                    break;
                }
                zzhzbVar2 = zzhzbVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i2 = iCompareTo;
        if (!z2) {
            return null;
        }
        zzhzb zzhzbVar4 = this.zzd;
        if (zzhzbVar2 != null) {
            zzhzb zzhzbVar5 = zzhzbVar2;
            zzhzbVar = new zzhzb(this.zzg, zzhzbVar5, obj, zzhzbVar4, zzhzbVar4.zze);
            if (i2 < 0) {
                zzhzbVar5.zzb = zzhzbVar;
            } else {
                zzhzbVar5.zzc = zzhzbVar;
            }
            zzg(zzhzbVar5, true);
        } else {
            if (comparator == zze && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            zzhzbVar = new zzhzb(this.zzg, null, obj, zzhzbVar4, zzhzbVar4.zze);
            this.zza = zzhzbVar;
        }
        this.zzb++;
        this.zzc++;
        return zzhzbVar;
    }

    final void zzd(zzhzb zzhzbVar, boolean z2) {
        zzhzb zzhzbVar2;
        zzhzb zzhzbVar3;
        int i2;
        if (z2) {
            zzhzb zzhzbVar4 = zzhzbVar.zze;
            zzhzbVar4.zzd = zzhzbVar.zzd;
            zzhzbVar.zzd.zze = zzhzbVar4;
        }
        zzhzb zzhzbVar5 = zzhzbVar.zzb;
        zzhzb zzhzbVar6 = zzhzbVar.zzc;
        zzhzb zzhzbVar7 = zzhzbVar.zza;
        int i3 = 0;
        if (zzhzbVar5 == null || zzhzbVar6 == null) {
            if (zzhzbVar5 != null) {
                zzf(zzhzbVar, zzhzbVar5);
                zzhzbVar.zzb = null;
            } else if (zzhzbVar6 != null) {
                zzf(zzhzbVar, zzhzbVar6);
                zzhzbVar.zzc = null;
            } else {
                zzf(zzhzbVar, null);
            }
            zzg(zzhzbVar7, false);
            this.zzb--;
            this.zzc++;
            return;
        }
        if (zzhzbVar5.zzi > zzhzbVar6.zzi) {
            do {
                zzhzbVar3 = zzhzbVar5;
                zzhzbVar5 = zzhzbVar5.zzc;
            } while (zzhzbVar5 != null);
        } else {
            do {
                zzhzbVar2 = zzhzbVar6;
                zzhzbVar6 = zzhzbVar6.zzb;
            } while (zzhzbVar6 != null);
            zzhzbVar3 = zzhzbVar2;
        }
        zzd(zzhzbVar3, false);
        zzhzb zzhzbVar8 = zzhzbVar.zzb;
        if (zzhzbVar8 != null) {
            i2 = zzhzbVar8.zzi;
            zzhzbVar3.zzb = zzhzbVar8;
            zzhzbVar8.zza = zzhzbVar3;
            zzhzbVar.zzb = null;
        } else {
            i2 = 0;
        }
        zzhzb zzhzbVar9 = zzhzbVar.zzc;
        if (zzhzbVar9 != null) {
            i3 = zzhzbVar9.zzi;
            zzhzbVar3.zzc = zzhzbVar9;
            zzhzbVar9.zza = zzhzbVar3;
            zzhzbVar.zzc = null;
        }
        zzhzbVar3.zzi = Math.max(i2, i3) + 1;
        zzf(zzhzbVar, zzhzbVar3);
    }

    public zzhzc(boolean z2) {
        this(zze, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (zzb(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzhzb zzhzbVarZzb = zzb(obj);
        if (zzhzbVarZzb != null) {
            return zzhzbVarZzb.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzhzb zzhzbVarZze = zze(obj);
        if (zzhzbVarZze != null) {
            return zzhzbVarZze.zzh;
        }
        return null;
    }

    final zzhzb zzc(Map.Entry entry) {
        zzhzb zzhzbVarZzb = zzb(entry.getKey());
        if (zzhzbVarZzb != null && Objects.equals(zzhzbVarZzb.zzh, entry.getValue())) {
            return zzhzbVarZzb;
        }
        return null;
    }

    final zzhzb zze(Object obj) {
        zzhzb zzhzbVarZzb = zzb(obj);
        if (zzhzbVarZzb != null) {
            zzd(zzhzbVarZzb, true);
        }
        return zzhzbVarZzb;
    }
}
