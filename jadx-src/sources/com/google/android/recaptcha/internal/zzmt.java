package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzmt {
    private static final zzmt zzb = new zzmt(true);
    final zzpe zza = new zzoz();
    private boolean zzc;
    private boolean zzd;

    private zzmt() {
    }

    public static zzmt zzd() {
        return zzb;
    }

    public final boolean zzj() {
        return this.zzc;
    }

    private zzmt(boolean z2) {
        zzg();
        zzg();
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzon) {
            return ((zzon) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmt) {
            return this.zza.equals(((zzmt) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int iZzc = this.zza.zzc();
        int iZzo = 0;
        for (int i2 = 0; i2 < iZzc; i2++) {
            iZzo += zzo(this.zza.zzg(i2));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzmt clone() {
        zzmt zzmtVar = new zzmt();
        int iZzc = this.zza.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            Map.Entry entryZzg = this.zza.zzg(i2);
            zzmtVar.zzi((zzms) ((zzpa) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzmtVar.zzi((zzms) entry.getKey(), entry.getValue());
        }
        zzmtVar.zzd = this.zzd;
        return zzmtVar;
    }

    public final Object zze(zzms zzmsVar) {
        Object obj = this.zza.get(zzmsVar);
        if (obj instanceof zzns) {
            throw null;
        }
        return obj;
    }

    public final Iterator zzf() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zznq(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int iZzc = this.zza.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            Object value = this.zza.zzg(i2).getValue();
            if (value instanceof zznd) {
                ((zznd) value).zzG();
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zznd) {
                ((zznd) value2).zzG();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzmt zzmtVar) {
        int iZzc = zzmtVar.zza.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            zzm(zzmtVar.zza.zzg(i2));
        }
        Iterator it = zzmtVar.zza.zzd().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    public final boolean zzk() {
        int iZzc = this.zza.zzc();
        for (int i2 = 0; i2 < iZzc; i2++) {
            if (!zzn(this.zza.zzg(i2))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static int zza(zzms zzmsVar, Object obj) {
        int iZzd;
        int iZzA;
        zzpw zzpwVarZzd = zzmsVar.zzd();
        int iZza = zzmsVar.zza();
        zzmsVar.zzg();
        int iZzA2 = zzln.zzA(iZza << 3);
        if (zzpwVarZzd == zzpw.zzj) {
            byte[] bArr = zznl.zzb;
            if (!(((zzoi) obj) instanceof zzkp)) {
                iZzA2 += iZzA2;
            } else {
                throw null;
            }
        }
        zzpx zzpxVar = zzpx.INT;
        int iZzB = 4;
        switch (zzpwVarZzd.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iZzB = 8;
                return iZzA2 + iZzB;
            case 1:
                ((Float) obj).getClass();
                return iZzA2 + iZzB;
            case 2:
                iZzB = zzln.zzB(((Long) obj).longValue());
                return iZzA2 + iZzB;
            case 3:
                iZzB = zzln.zzB(((Long) obj).longValue());
                return iZzA2 + iZzB;
            case 4:
                iZzB = zzln.zzB(((Integer) obj).intValue());
                return iZzA2 + iZzB;
            case 5:
                ((Long) obj).getClass();
                iZzB = 8;
                return iZzA2 + iZzB;
            case 6:
                ((Integer) obj).getClass();
                return iZzA2 + iZzB;
            case 7:
                ((Boolean) obj).getClass();
                iZzB = 1;
                return iZzA2 + iZzB;
            case 8:
                if (obj instanceof zzle) {
                    iZzd = ((zzle) obj).zzd();
                    iZzA = zzln.zzA(iZzd);
                    iZzB = iZzA + iZzd;
                    return iZzA2 + iZzB;
                }
                iZzB = zzln.zzz((String) obj);
                return iZzA2 + iZzB;
            case 9:
                iZzB = ((zzoi) obj).zzo();
                return iZzA2 + iZzB;
            case 10:
                if (obj instanceof zzns) {
                    iZzd = ((zzns) obj).zza();
                    iZzA = zzln.zzA(iZzd);
                    iZzB = iZzA + iZzd;
                    return iZzA2 + iZzB;
                }
                iZzB = zzln.zzx((zzoi) obj);
                return iZzA2 + iZzB;
            case 11:
                if (obj instanceof zzle) {
                    iZzd = ((zzle) obj).zzd();
                    iZzA = zzln.zzA(iZzd);
                } else {
                    iZzd = ((byte[]) obj).length;
                    iZzA = zzln.zzA(iZzd);
                }
                iZzB = iZzA + iZzd;
                return iZzA2 + iZzB;
            case 12:
                iZzB = zzln.zzA(((Integer) obj).intValue());
                return iZzA2 + iZzB;
            case 13:
                iZzB = obj instanceof zznf ? zzln.zzB(((zznf) obj).zza()) : zzln.zzB(((Integer) obj).intValue());
                return iZzA2 + iZzB;
            case 14:
                ((Integer) obj).getClass();
                return iZzA2 + iZzB;
            case 15:
                ((Long) obj).getClass();
                iZzB = 8;
                return iZzA2 + iZzB;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iZzB = zzln.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iZzA2 + iZzB;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iZzB = zzln.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iZzA2 + iZzB;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private final void zzm(Map.Entry entry) {
        zzoi zzoiVarZzk;
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        boolean z2 = value instanceof zzns;
        zzmsVar.zzg();
        if (zzmsVar.zze() == zzpx.MESSAGE) {
            Object objZze = zze(zzmsVar);
            if (objZze == null) {
                this.zza.put(zzmsVar, zzl(value));
                if (z2) {
                    this.zzd = true;
                    return;
                }
                return;
            }
            if (!z2) {
                if (objZze instanceof zzon) {
                    zzoiVarZzk = zzmsVar.zzc((zzon) objZze, (zzon) value);
                } else {
                    zzoiVarZzk = zzmsVar.zzb(((zzoi) objZze).zzae(), (zzoi) value).zzk();
                }
                this.zza.put(zzmsVar, zzoiVarZzk);
                return;
            }
            throw null;
        }
        if (!z2) {
            this.zza.put(zzmsVar, zzl(value));
            return;
        }
        throw new IllegalStateException("Lazy fields must be message-valued");
    }

    private static boolean zzn(Map.Entry entry) {
        zzms zzmsVar = (zzms) entry.getKey();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            return true;
        }
        zzmsVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzoj) {
            return ((zzoj) value).zzp();
        }
        if (value instanceof zzns) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i2;
        int iZzA;
        int iZzA2;
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        if (zzmsVar.zze() == zzpx.MESSAGE) {
            zzmsVar.zzg();
            zzmsVar.zzf();
            if (value instanceof zzns) {
                int iZza = ((zzms) entry.getKey()).zza();
                int iZzA3 = zzln.zzA(8);
                i2 = iZzA3 + iZzA3;
                iZzA = zzln.zzA(16) + zzln.zzA(iZza);
                int iZzA4 = zzln.zzA(24);
                int iZza2 = ((zzns) value).zza();
                iZzA2 = iZzA4 + zzln.zzA(iZza2) + iZza2;
            } else {
                int iZza3 = ((zzms) entry.getKey()).zza();
                int iZzA5 = zzln.zzA(8);
                i2 = iZzA5 + iZzA5;
                iZzA = zzln.zzA(16) + zzln.zzA(iZza3);
                iZzA2 = zzln.zzA(24) + zzln.zzx((zzoi) value);
            }
            return i2 + iZzA + iZzA2;
        }
        return zza(zzmsVar, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zznf) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzns) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzms zzmsVar, Object obj) {
        boolean z2;
        zzmsVar.zzg();
        zzmsVar.zzd();
        byte[] bArr = zznl.zzb;
        obj.getClass();
        zzpw zzpwVar = zzpw.zza;
        zzpx zzpxVar = zzpx.INT;
        switch (r0.zza()) {
            case INT:
                z2 = obj instanceof Integer;
                break;
            case LONG:
                z2 = obj instanceof Long;
                break;
            case FLOAT:
                z2 = obj instanceof Float;
                break;
            case DOUBLE:
                z2 = obj instanceof Double;
                break;
            case BOOLEAN:
                z2 = obj instanceof Boolean;
                break;
            case STRING:
                z2 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof zzle)) {
                    break;
                }
                if (obj instanceof zzns) {
                    this.zzd = true;
                }
                this.zza.put(zzmsVar, obj);
                return;
            case ENUM:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof zzns) {
                }
                this.zza.put(zzmsVar, obj);
                return;
            case MESSAGE:
                if (!(obj instanceof zzoi)) {
                    break;
                }
                if (obj instanceof zzns) {
                }
                this.zza.put(zzmsVar, obj);
                return;
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzmsVar.zza()), zzmsVar.zzd().zza(), obj.getClass().getName()));
        }
    }
}
