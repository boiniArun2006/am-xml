package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzibg {
    private static final zzibg zzd = new zzibg(true);
    final zzieb zza = new zzidx();
    boolean zzb;
    boolean zzc;

    private zzibg() {
    }

    public static zzibg zza() {
        return zzd;
    }

    private zzibg(boolean z2) {
        zzb();
        zzb();
    }

    static void zzf(zziaw zziawVar, zzies zziesVar, int i2, Object obj) throws IOException {
        if (zziesVar == zzies.zzj) {
            zziawVar.zzH(i2, 3);
            ((zzidc) obj).zzcX(zziawVar);
            zziawVar.zzH(i2, 4);
            return;
        }
        zziawVar.zzH(i2, zziesVar.zzb());
        zziet zzietVar = zziet.INT;
        switch (zziesVar.ordinal()) {
            case 0:
                zziawVar.zzv(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zziawVar.zzt(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zziawVar.zzu(((Long) obj).longValue());
                break;
            case 3:
                zziawVar.zzu(((Long) obj).longValue());
                break;
            case 4:
                zziawVar.zzr(((Integer) obj).intValue());
                break;
            case 5:
                zziawVar.zzv(((Long) obj).longValue());
                break;
            case 6:
                zziawVar.zzt(((Integer) obj).intValue());
                break;
            case 7:
                zziawVar.zzq(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzian)) {
                    zziawVar.zzx((String) obj);
                } else {
                    zziawVar.zzl((zzian) obj);
                }
                break;
            case 9:
                ((zzidc) obj).zzcX(zziawVar);
                break;
            case 10:
                zziawVar.zzp((zzidc) obj);
                break;
            case 11:
                if (!(obj instanceof zzian)) {
                    byte[] bArr = (byte[]) obj;
                    zziawVar.zzm(bArr, 0, bArr.length);
                } else {
                    zziawVar.zzl((zzian) obj);
                }
                break;
            case 12:
                zziawVar.zzs(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzibv)) {
                    zziawVar.zzr(((Integer) obj).intValue());
                } else {
                    zziawVar.zzr(((zzibv) obj).zza());
                }
                break;
            case 14:
                zziawVar.zzt(((Integer) obj).intValue());
                break;
            case 15:
                zziawVar.zzv(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zziawVar.zzs((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zziawVar.zzu((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    static int zzh(zzies zziesVar, int i2, Object obj) {
        int iZzA = zziaw.zzA(i2 << 3);
        if (zziesVar == zzies.zzj) {
            iZzA += iZzA;
        }
        return iZzA + zzi(zziesVar, obj);
    }

    static int zzi(zzies zziesVar, Object obj) {
        int iZzc;
        int iZzA;
        zzies zziesVar2 = zzies.zza;
        zziet zzietVar = zziet.INT;
        switch (zziesVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i2 = zziaw.zzf;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i3 = zziaw.zzf;
                return 4;
            case 2:
                return zziaw.zzB(((Long) obj).longValue());
            case 3:
                return zziaw.zzB(((Long) obj).longValue());
            case 4:
                return zziaw.zzB(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i5 = zziaw.zzf;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i7 = zziaw.zzf;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i8 = zziaw.zzf;
                return 1;
            case 8:
                if (!(obj instanceof zzian)) {
                    int i9 = zziaw.zzf;
                    iZzc = zzier.zzc((String) obj);
                    iZzA = zziaw.zzA(iZzc);
                } else {
                    int i10 = zziaw.zzf;
                    iZzc = ((zzian) obj).zzc();
                    iZzA = zziaw.zzA(iZzc);
                }
                break;
            case 9:
                return ((zzidc) obj).zzbr();
            case 10:
                if (!(obj instanceof zzicl)) {
                    return zziaw.zzC((zzidc) obj);
                }
                iZzc = ((zzicl) obj).zzb();
                iZzA = zziaw.zzA(iZzc);
                break;
                break;
            case 11:
                if (!(obj instanceof zzian)) {
                    int i11 = zziaw.zzf;
                    iZzc = ((byte[]) obj).length;
                    iZzA = zziaw.zzA(iZzc);
                } else {
                    int i12 = zziaw.zzf;
                    iZzc = ((zzian) obj).zzc();
                    iZzA = zziaw.zzA(iZzc);
                }
                break;
            case 12:
                return zziaw.zzA(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzibv ? zziaw.zzB(((zzibv) obj).zza()) : zziaw.zzB(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i13 = zziaw.zzf;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i14 = zziaw.zzf;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zziaw.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zziaw.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzA + iZzc;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzidd) {
            return ((zzidd) obj).zzbi();
        }
        if (obj instanceof zzicl) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzibg zzibgVar = new zzibg();
        zzieb zziebVar = this.zza;
        int iZzc = zziebVar.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            Map.Entry entryZzd = zziebVar.zzd(i2);
            zzibgVar.zzd((zzibf) ((zzidy) entryZzd).zza(), entryZzd.getValue());
        }
        for (Map.Entry entry : zziebVar.zze()) {
            zzibgVar.zzd((zzibf) entry.getKey(), entry.getValue());
        }
        zzibgVar.zzc = this.zzc;
        return zzibgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzibg) {
            return this.zza.equals(((zzibg) obj).zza);
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
        zzieb zziebVar = this.zza;
        int iZzc = zziebVar.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            Object value = zziebVar.zzd(i2).getValue();
            if (value instanceof zzibr) {
                ((zzibr) value).zzbm();
            }
        }
        Iterator it = zziebVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzibr) {
                ((zzibr) value2).zzbm();
            }
        }
        zziebVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzieb zziebVar = this.zza;
        return zziebVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzick(zziebVar.entrySet().iterator()) : zziebVar.entrySet().iterator();
    }

    public final boolean zze() {
        zzieb zziebVar = this.zza;
        int iZzc = zziebVar.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            if (!zzk(zziebVar.zzd(i2))) {
                return false;
            }
        }
        Iterator it = zziebVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzieb zziebVar = this.zza;
        int iZzc = zziebVar.zzc();
        int iZzm = 0;
        for (int i2 = 0; i2 < iZzc; i2++) {
            iZzm += zzm(zziebVar.zzd(i2));
        }
        Iterator it = zziebVar.zze().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    public static int zzj(zzibf zzibfVar, Object obj) {
        zzies zziesVarZzb = zzibfVar.zzb();
        int iZza = zzibfVar.zza();
        if (zzibfVar.zzd()) {
            List list = (List) obj;
            int size = list.size();
            int i2 = 0;
            if (zzibfVar.zze()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int iZzi = 0;
                while (i2 < size) {
                    iZzi += zzi(zziesVarZzb, list.get(i2));
                    i2++;
                }
                return zziaw.zzA(iZza << 3) + iZzi + zziaw.zzA(iZzi);
            }
            int iZzh = 0;
            while (i2 < size) {
                iZzh += zzh(zziesVarZzb, iZza, list.get(i2));
                i2++;
            }
            return iZzh;
        }
        return zzh(zziesVarZzb, iZza, obj);
    }

    private static boolean zzk(Map.Entry entry) {
        zzibf zzibfVar = (zzibf) entry.getKey();
        if (zzibfVar.zzc() == zziet.MESSAGE) {
            if (zzibfVar.zzd()) {
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
        int iZzA;
        int iZzA2;
        zzibf zzibfVar = (zzibf) entry.getKey();
        Object value = entry.getValue();
        if (zzibfVar.zzc() == zziet.MESSAGE && !zzibfVar.zzd() && !zzibfVar.zze()) {
            if (value instanceof zzicl) {
                int iZza = ((zzibf) entry.getKey()).zza();
                int iZzA3 = zziaw.zzA(8);
                i2 = iZzA3 + iZzA3;
                iZzA = zziaw.zzA(16) + zziaw.zzA(iZza);
                int iZzA4 = zziaw.zzA(24);
                int iZzb = ((zzicl) value).zzb();
                iZzA2 = iZzA4 + zziaw.zzA(iZzb) + iZzb;
            } else {
                int iZza2 = ((zzibf) entry.getKey()).zza();
                int iZzA5 = zziaw.zzA(8);
                i2 = iZzA5 + iZzA5;
                iZzA = zziaw.zzA(16) + zziaw.zzA(iZza2);
                iZzA2 = zziaw.zzA(24) + zziaw.zzC((zzidc) value);
            }
            return i2 + iZzA + iZzA2;
        }
        return zzj(zzibfVar, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzn(zzibf zzibfVar, Object obj) {
        boolean z2;
        zzibfVar.zzb();
        byte[] bArr = zzice.zzb;
        obj.getClass();
        zzies zziesVar = zzies.zza;
        zziet zzietVar = zziet.INT;
        switch (r0.zza()) {
            case INT:
                z2 = obj instanceof Integer;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z2 = obj instanceof Long;
                if (z2) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z2 = obj instanceof Float;
                if (z2) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z2 = obj instanceof Double;
                if (z2) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z2 = obj instanceof Boolean;
                if (z2) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z2 = obj instanceof String;
                if (z2) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzian) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzibv)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzidc) || (obj instanceof zzicl)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final void zzd(zzibf zzibfVar, Object obj) {
        if (zzibfVar.zzd()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj2 = list.get(i2);
                    zzn(zzibfVar, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzn(zzibfVar, obj);
        }
        if (obj instanceof zzicl) {
            this.zzc = true;
        }
        this.zza.put(zzibfVar, obj);
    }
}
