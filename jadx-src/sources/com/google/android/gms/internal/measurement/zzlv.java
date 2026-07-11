package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzlv {
    private static final zzlv zzd = new zzlv(true);
    final zzod zza = new zznz();
    private boolean zzb;
    private boolean zzc;

    private zzlv() {
    }

    public static zzlv zza() {
        return zzd;
    }

    private zzlv(boolean z2) {
        zzb();
        zzb();
    }

    static void zzf(zzll zzllVar, zzos zzosVar, int i2, Object obj) throws IOException {
        if (zzosVar == zzos.zzj) {
            zznl zznlVar = (zznl) obj;
            zzmo.zzd(zznlVar);
            zzllVar.zza(i2, 3);
            zznlVar.zzcB(zzllVar);
            zzllVar.zza(i2, 4);
            return;
        }
        zzllVar.zza(i2, zzosVar.zzb());
        zzot zzotVar = zzot.INT;
        switch (zzosVar.ordinal()) {
            case 0:
                zzllVar.zzu(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzllVar.zzs(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzllVar.zzt(((Long) obj).longValue());
                break;
            case 3:
                zzllVar.zzt(((Long) obj).longValue());
                break;
            case 4:
                zzllVar.zzq(((Integer) obj).intValue());
                break;
            case 5:
                zzllVar.zzu(((Long) obj).longValue());
                break;
            case 6:
                zzllVar.zzs(((Integer) obj).intValue());
                break;
            case 7:
                zzllVar.zzp(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzlg)) {
                    zzllVar.zzx((String) obj);
                } else {
                    zzllVar.zzj((zzlg) obj);
                }
                break;
            case 9:
                ((zznl) obj).zzcB(zzllVar);
                break;
            case 10:
                zzllVar.zzo((zznl) obj);
                break;
            case 11:
                if (!(obj instanceof zzlg)) {
                    byte[] bArr = (byte[]) obj;
                    zzllVar.zzk(bArr, 0, bArr.length);
                } else {
                    zzllVar.zzj((zzlg) obj);
                }
                break;
            case 12:
                zzllVar.zzr(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzmi)) {
                    zzllVar.zzq(((Integer) obj).intValue());
                } else {
                    zzllVar.zzq(((zzmi) obj).zza());
                }
                break;
            case 14:
                zzllVar.zzs(((Integer) obj).intValue());
                break;
            case 15:
                zzllVar.zzu(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzllVar.zzr((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzllVar.zzt((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    static int zzh(zzos zzosVar, int i2, Object obj) {
        int iZzz = zzll.zzz(i2 << 3);
        if (zzosVar == zzos.zzj) {
            zzmo.zzd((zznl) obj);
            iZzz += iZzz;
        }
        return iZzz + zzi(zzosVar, obj);
    }

    static int zzi(zzos zzosVar, Object obj) {
        int iZzc;
        int iZzz;
        zzos zzosVar2 = zzos.zza;
        zzot zzotVar = zzot.INT;
        switch (zzosVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i2 = zzll.zzb;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i3 = zzll.zzb;
                return 4;
            case 2:
                return zzll.zzA(((Long) obj).longValue());
            case 3:
                return zzll.zzA(((Long) obj).longValue());
            case 4:
                return zzll.zzA(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i5 = zzll.zzb;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i7 = zzll.zzb;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i8 = zzll.zzb;
                return 1;
            case 8:
                if (!(obj instanceof zzlg)) {
                    return zzll.zzB((String) obj);
                }
                int i9 = zzll.zzb;
                iZzc = ((zzlg) obj).zzc();
                iZzz = zzll.zzz(iZzc);
                break;
                break;
            case 9:
                return ((zznl) obj).zzcn();
            case 10:
                if (!(obj instanceof zzmu)) {
                    return zzll.zzC((zznl) obj);
                }
                int i10 = zzll.zzb;
                iZzc = ((zzmu) obj).zzb();
                iZzz = zzll.zzz(iZzc);
                break;
                break;
            case 11:
                if (!(obj instanceof zzlg)) {
                    int i11 = zzll.zzb;
                    iZzc = ((byte[]) obj).length;
                    iZzz = zzll.zzz(iZzc);
                } else {
                    int i12 = zzll.zzb;
                    iZzc = ((zzlg) obj).zzc();
                    iZzz = zzll.zzz(iZzc);
                }
                break;
            case 12:
                return zzll.zzz(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzmi ? zzll.zzA(((zzmi) obj).zza()) : zzll.zzA(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i13 = zzll.zzb;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i14 = zzll.zzb;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzll.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzll.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzz + iZzc;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zznm) {
            return ((zznm) obj).zzcD();
        }
        if (obj instanceof zzmu) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzlv zzlvVar = new zzlv();
        zzod zzodVar = this.zza;
        int iZzc = zzodVar.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            Map.Entry entryZzd = zzodVar.zzd(i2);
            zzlvVar.zzd((zzlu) ((zzoa) entryZzd).zza(), entryZzd.getValue());
        }
        for (Map.Entry entry : zzodVar.zze()) {
            zzlvVar.zzd((zzlu) entry.getKey(), entry.getValue());
        }
        zzlvVar.zzc = this.zzc;
        return zzlvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlv) {
            return this.zza.equals(((zzlv) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzod zzodVar = this.zza;
        int iZzc = zzodVar.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            Object value = zzodVar.zzd(i2).getValue();
            if (value instanceof zzme) {
                ((zzme) value).zzcj();
            }
        }
        Iterator it = zzodVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzme) {
                ((zzme) value2).zzcj();
            }
        }
        zzodVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzod zzodVar = this.zza;
        return zzodVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzmt(zzodVar.entrySet().iterator()) : zzodVar.entrySet().iterator();
    }

    public final boolean zze() {
        zzod zzodVar = this.zza;
        int iZzc = zzodVar.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            if (!zzk(zzodVar.zzd(i2))) {
                return false;
            }
        }
        Iterator it = zzodVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzod zzodVar = this.zza;
        int iZzc = zzodVar.zzc();
        int iZzm = 0;
        for (int i2 = 0; i2 < iZzc; i2++) {
            iZzm += zzm(zzodVar.zzd(i2));
        }
        Iterator it = zzodVar.zze().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    public static int zzj(zzlu zzluVar, Object obj) {
        zzos zzosVarZzb = zzluVar.zzb();
        int iZza = zzluVar.zza();
        if (zzluVar.zzd()) {
            List list = (List) obj;
            int size = list.size();
            int i2 = 0;
            if (zzluVar.zze()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int iZzi = 0;
                while (i2 < size) {
                    iZzi += zzi(zzosVarZzb, list.get(i2));
                    i2++;
                }
                return zzll.zzz(iZza << 3) + iZzi + zzll.zzz(iZzi);
            }
            int iZzh = 0;
            while (i2 < size) {
                iZzh += zzh(zzosVarZzb, iZza, list.get(i2));
                i2++;
            }
            return iZzh;
        }
        return zzh(zzosVarZzb, iZza, obj);
    }

    private static boolean zzk(Map.Entry entry) {
        zzlu zzluVar = (zzlu) entry.getKey();
        if (zzluVar.zzc() == zzot.MESSAGE) {
            if (zzluVar.zzd()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (!zzl(list.get(i2))) {
                        return false;
                    }
                }
                return true;
            }
            return zzl(entry.getValue());
        }
        return true;
    }

    private static final int zzm(Map.Entry entry) {
        int i2;
        int iZzz;
        int iZzz2;
        zzlu zzluVar = (zzlu) entry.getKey();
        Object value = entry.getValue();
        if (zzluVar.zzc() == zzot.MESSAGE && !zzluVar.zzd() && !zzluVar.zze()) {
            if (value instanceof zzmu) {
                int iZza = ((zzlu) entry.getKey()).zza();
                int iZzz3 = zzll.zzz(8);
                i2 = iZzz3 + iZzz3;
                iZzz = zzll.zzz(16) + zzll.zzz(iZza);
                int iZzz4 = zzll.zzz(24);
                int iZzb = ((zzmu) value).zzb();
                iZzz2 = iZzz4 + zzll.zzz(iZzb) + iZzb;
            } else {
                int iZza2 = ((zzlu) entry.getKey()).zza();
                int iZzz5 = zzll.zzz(8);
                i2 = iZzz5 + iZzz5;
                iZzz = zzll.zzz(16) + zzll.zzz(iZza2);
                iZzz2 = zzll.zzz(24) + zzll.zzC((zznl) value);
            }
            return i2 + iZzz + iZzz2;
        }
        return zzj(zzluVar, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzn(zzlu zzluVar, Object obj) {
        boolean z2;
        zzluVar.zzb();
        byte[] bArr = zzmo.zzb;
        obj.getClass();
        zzos zzosVar = zzos.zza;
        zzot zzotVar = zzot.INT;
        switch (r0.zza()) {
            case INT:
                z2 = obj instanceof Integer;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z2 = obj instanceof Long;
                if (z2) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z2 = obj instanceof Float;
                if (z2) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z2 = obj instanceof Double;
                if (z2) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z2 = obj instanceof Boolean;
                if (z2) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z2 = obj instanceof String;
                if (z2) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzlg) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzmi)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zznl) || (obj instanceof zzmu)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final void zzd(zzlu zzluVar, Object obj) {
        if (zzluVar.zzd()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj2 = list.get(i2);
                    zzn(zzluVar, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzn(zzluVar, obj);
        }
        if (obj instanceof zzmu) {
            this.zzc = true;
        }
        this.zza.put(zzluVar, obj);
    }
}
