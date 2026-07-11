package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhb {
    private static final zzhb zzb = new zzhb(true);
    final zzjf zza = new zzja();
    private boolean zzc;
    private boolean zzd;

    private zzhb() {
    }

    public static zzhb zzd() {
        return zzb;
    }

    private zzhb(boolean z2) {
        zzf();
        zzf();
    }

    static int zza(zzju zzjuVar, int i2, Object obj) {
        zzgr.zzz(i2 << 3);
        if (zzju.zzj == null) {
            byte[] bArr = zzhp.zzb;
            if (((zzim) obj) instanceof zzfw) {
                throw null;
            }
        }
        zzjv zzjvVar = zzjv.zza;
        throw null;
    }

    private static boolean zzj(Object obj) {
        if (obj instanceof zzin) {
            return ((zzin) obj).zzl();
        }
        if (obj instanceof zzhw) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzhb zzhbVar = new zzhb();
        int iZzc = this.zza.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            Map.Entry entryZzg = this.zza.zzg(i2);
            zzhbVar.zzg((zzha) ((zzjb) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzhbVar.zzg((zzha) entry.getKey(), entry.getValue());
        }
        zzhbVar.zzd = this.zzd;
        return zzhbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhb) {
            return this.zza.equals(((zzhb) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        int iZzc = this.zza.zzc();
        int iZzk = 0;
        for (int i2 = 0; i2 < iZzc; i2++) {
            iZzk += zzk(this.zza.zzg(i2));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzk += zzk((Map.Entry) it.next());
        }
        return iZzk;
    }

    public final Iterator zze() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzhu(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzf() {
        if (this.zzc) {
            return;
        }
        int iZzc = this.zza.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            Object value = this.zza.zzg(i2).getValue();
            if (value instanceof zzhk) {
                ((zzhk) value).zzv();
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzhk) {
                ((zzhk) value2).zzv();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final boolean zzh() {
        int iZzc = this.zza.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            if (!zzi(this.zza.zzg(i2))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzi((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static int zzb(zzha zzhaVar, Object obj) {
        zzju zzjuVarZzb = zzhaVar.zzb();
        int iZza = zzhaVar.zza();
        if (zzhaVar.zze()) {
            List list = (List) obj;
            int size = list.size();
            if (zzhaVar.zzd()) {
                if (list.isEmpty()) {
                    return 0;
                }
                if (size <= 0) {
                    return zzgr.zzz(iZza << 3) + zzgr.zzz(0);
                }
                list.get(0);
                zzju zzjuVar = zzju.zza;
                zzjv zzjvVar = zzjv.zza;
                throw null;
            }
            int iZza2 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                iZza2 += zza(zzjuVarZzb, iZza, list.get(i2));
            }
            return iZza2;
        }
        return zza(zzjuVarZzb, iZza, obj);
    }

    private static boolean zzi(Map.Entry entry) {
        zzha zzhaVar = (zzha) entry.getKey();
        if (zzhaVar.zzc() == zzjv.MESSAGE) {
            if (zzhaVar.zze()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (!zzj(list.get(i2))) {
                        return false;
                    }
                }
                return true;
            }
            return zzj(entry.getValue());
        }
        return true;
    }

    private static final int zzk(Map.Entry entry) {
        int i2;
        int iZzz;
        int iZzz2;
        int iZzk;
        int iZzz3;
        zzha zzhaVar = (zzha) entry.getKey();
        Object value = entry.getValue();
        if (zzhaVar.zzc() == zzjv.MESSAGE && !zzhaVar.zze() && !zzhaVar.zzd()) {
            if (value instanceof zzhw) {
                int iZza = ((zzha) entry.getKey()).zza();
                int iZzz4 = zzgr.zzz(8);
                i2 = iZzz4 + iZzz4;
                iZzz = zzgr.zzz(16) + zzgr.zzz(iZza);
                iZzz2 = zzgr.zzz(24);
                iZzk = ((zzhw) value).zza();
                iZzz3 = zzgr.zzz(iZzk);
            } else {
                int iZza2 = ((zzha) entry.getKey()).zza();
                int iZzz5 = zzgr.zzz(8);
                i2 = iZzz5 + iZzz5;
                iZzz = zzgr.zzz(16) + zzgr.zzz(iZza2);
                iZzz2 = zzgr.zzz(24);
                iZzk = ((zzim) value).zzk();
                iZzz3 = zzgr.zzz(iZzk);
            }
            return i2 + iZzz + iZzz2 + iZzz3 + iZzk;
        }
        return zzb(zzhaVar, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzl(zzha zzhaVar, Object obj) {
        boolean z2;
        zzhaVar.zzb();
        byte[] bArr = zzhp.zzb;
        obj.getClass();
        zzju zzjuVar = zzju.zza;
        zzjv zzjvVar = zzjv.zza;
        switch (r0.zza()) {
            case zza:
                z2 = obj instanceof Integer;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z2 = obj instanceof Long;
                if (z2) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z2 = obj instanceof Float;
                if (z2) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z2 = obj instanceof Double;
                if (z2) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z2 = obj instanceof Boolean;
                if (z2) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z2 = obj instanceof String;
                if (z2) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzgk) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzkn)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzim) || (obj instanceof zzhw)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final void zzg(zzha zzhaVar, Object obj) {
        if (zzhaVar.zze()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj2 = list.get(i2);
                    zzl(zzhaVar, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzl(zzhaVar, obj);
        }
        if (obj instanceof zzhw) {
            this.zzd = true;
        }
        this.zza.put(zzhaVar, obj);
    }
}
