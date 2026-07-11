package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzavg {
    public int zza = 1;
    private Object zzb;
    private long zzc;
    private double zzd;
    private zzauk zze;
    private List zzf;
    private zzauy zzg;

    private zzavg() {
    }

    public static zzavg zza(Object obj) {
        zzavg zzavgVar = new zzavg();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        zzavgVar.zzr();
        zzavgVar.zza = (i10 + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9)) ^ (i11 % 1937477084);
        zzavgVar.zzb = obj;
        return zzavgVar;
    }

    public static zzavg zzb(long j2) {
        zzavg zzavgVar = new zzavg();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        zzavgVar.zzr();
        zzavgVar.zza = (i10 + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9)) ^ (i11 % 327254586);
        zzavgVar.zzc = j2;
        return zzavgVar;
    }

    public static zzavg zzc(double d2) {
        zzavg zzavgVar = new zzavg();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        zzavgVar.zzr();
        zzavgVar.zza = (i10 + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9)) ^ (i11 % 1605908235);
        zzavgVar.zzd = d2;
        return zzavgVar;
    }

    public static zzavg zzd(zzauk zzaukVar) {
        zzavg zzavgVar = new zzavg();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        zzavgVar.zzr();
        zzavgVar.zza = (i10 + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9)) ^ (i11 % 1402586708);
        zzavgVar.zze = zzaukVar;
        return zzavgVar;
    }

    public static zzavg zze(List list) {
        zzavg zzavgVar = new zzavg();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        zzavgVar.zzr();
        zzavgVar.zza = (i10 + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9)) ^ (i11 % 324763920);
        zzavgVar.zzf = list;
        return zzavgVar;
    }

    public static zzavg zzf(zzauy zzauyVar) {
        zzavg zzavgVar = new zzavg();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        zzavgVar.zzr();
        zzavgVar.zza = (i10 + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9)) ^ (i11 % 474613996);
        zzavgVar.zzg = zzauyVar;
        return zzavgVar;
    }

    public static zzavg zzg(Object obj) {
        if (obj instanceof Long) {
            return zzb(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return zzb(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return zzb(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return zzc(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return zzc(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return zzb(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return zzb(((Byte) obj).byteValue());
        }
        if (obj instanceof zzauk) {
            return zzd((zzauk) obj);
        }
        if (obj instanceof String) {
            return zzd(zzauk.zzf((String) obj));
        }
        if (!(obj instanceof ArrayList)) {
            return zza(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(zzg(arrayList2.get(i2)));
        }
        return zze(arrayList);
    }

    public static zzavg zzj(zzavg zzavgVar) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int i12 = i10 + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9);
        int i13 = i11 % 552812661;
        try {
            int i14 = zzavgVar.zza;
            int i15 = (i13 ^ i12) + i14;
            if (i14 == 0) {
                throw null;
            }
            switch (i15) {
                case 0:
                    return new zzavg();
                case 1:
                    return zza(zzavgVar.zzl());
                case 2:
                    return zzb(zzavgVar.zzm());
                case 3:
                    return zzd(zzavgVar.zzn());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    Iterator it = zzavgVar.zzo().iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzj((zzavg) it.next()));
                    }
                    return zze(arrayList);
                case 5:
                    return zzf(zzavgVar.zzp());
                case 6:
                    return zzc(zzavgVar.zzq());
                default:
                    throw new AssertionError(zzaui.zza("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
            }
        } catch (zzavd e2) {
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e2);
        }
    }

    private final void zzr() {
        this.zza = 1;
        this.zzc = 0L;
        this.zzb = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
    }

    private final void zzs(int i2) throws zzavd {
        if (i2 != this.zza) {
            throw new zzavd();
        }
    }

    public final Object zzh() throws zzavd {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int i12 = i10 + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9);
        int i13 = this.zza;
        int i14 = ((i11 % 473891334) ^ i12) + i13;
        if (i13 == 0) {
            throw null;
        }
        switch (i14) {
            case 0:
            case 5:
                throw new zzavd();
            case 1:
                return zzl();
            case 2:
                return Long.valueOf(zzm());
            case 3:
                return zzn().zza();
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = zzo().iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzavg) it.next()).zzh());
                }
                return arrayList;
            case 6:
                return Double.valueOf(zzq());
            default:
                throw new AssertionError(zzaui.zza("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0252, code lost:
    
        if (r19.equals(java.lang.Object.class) != false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(Class cls) throws zzavd {
        int i2 = ((((~849876229) & 176298782) | 901785696) + ((849876229 & 1241658174) | 1140858976)) - 1963068318;
        int i3 = 1297046355 % 1049561859;
        int i5 = ((((~1123716509) & 1768229282) | 106234960) + ((1123716509 & 1830821282) | 337466384)) - (-2089431944);
        int i7 = 878786386 % 19063328;
        int i8 = this.zza;
        int i9 = ((((((~104451352) & 1645008493) | 1535758986) + ((104451352 & (-1340865435)) | (-650413174))) - (-2144387213)) ^ (1862140492 % 1134040403)) + i8;
        if (i8 == 0) {
            throw null;
        }
        int i10 = i5 ^ i7;
        int i11 = i2 ^ i3;
        Class cls2 = Double.TYPE;
        Class cls3 = Short.TYPE;
        Class cls4 = Byte.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        Class cls7 = Float.TYPE;
        switch (i9) {
            case 0:
                break;
            case 1:
                return zzl();
            case 2:
                long jZzm = zzm();
                if (!cls.equals(Byte.class) && !cls.equals(cls4)) {
                    if (cls.equals(Short.class) || cls.equals(cls3)) {
                        return Short.valueOf((short) ((((int) jZzm) << i11) >> i11));
                    }
                    if (cls.equals(Integer.class) || cls.equals(cls6)) {
                        return Integer.valueOf(Math.toIntExact(jZzm));
                    }
                    if (!cls.equals(Long.class) && !cls.equals(cls5)) {
                        if (cls.equals(Float.class) || cls.equals(cls7)) {
                            return Float.valueOf(jZzm);
                        }
                        if (cls.equals(Double.class) || cls.equals(cls2)) {
                            return Double.valueOf(jZzm);
                        }
                        if (cls.equals(Boolean.class) || cls.equals(Boolean.TYPE)) {
                            return Boolean.valueOf(jZzm != 0);
                        }
                        if (!cls.equals(Character.class) && !cls.equals(Character.TYPE)) {
                        }
                        break;
                    }
                    return Long.valueOf(jZzm);
                }
                return Byte.valueOf((byte) ((((int) jZzm) << i10) >> i10));
            case 3:
                zzauk zzaukVarZzn = zzn();
                if (cls.equals(zzauk.class)) {
                    return zzaukVarZzn;
                }
                if (cls.equals(Object.class) || cls.equals(String.class)) {
                    return zzaukVarZzn.zzc();
                }
                if (cls.equals(byte[].class)) {
                    return zzaukVarZzn.zza();
                }
                break;
            case 4:
                if (cls.equals(ArrayList.class) || cls.equals(Object.class) || cls.equals(AbstractList.class) || cls.equals(AbstractCollection.class) || cls.equals(Serializable.class) || cls.equals(Cloneable.class) || cls.equals(Iterable.class) || cls.equals(Collection.class) || cls.equals(List.class) || cls.equals(RandomAccess.class)) {
                    return zzh();
                }
                if (cls.isArray()) {
                    List listZzo = zzo();
                    Class<?> componentType = cls.getComponentType();
                    Object objNewInstance = Array.newInstance(componentType, listZzo.size());
                    for (int i12 = 0; i12 < listZzo.size(); i12++) {
                        Array.set(objNewInstance, i12, ((zzavg) listZzo.get(i12)).zzi(componentType));
                    }
                    return objNewInstance;
                }
                break;
            case 5:
                return zzp();
            case 6:
                double dZzq = zzq();
                if (cls.equals(Float.class) || cls.equals(cls7)) {
                    return Float.valueOf((float) dZzq);
                }
                if (cls.equals(Integer.class) || cls.equals(cls6)) {
                    return Integer.valueOf((int) dZzq);
                }
                if (cls.equals(Long.class) || cls.equals(cls5)) {
                    return Long.valueOf((long) dZzq);
                }
                if (cls.equals(Byte.class) || cls.equals(cls4)) {
                    return Byte.valueOf((byte) ((((int) dZzq) << i10) >> i10));
                }
                if (cls.equals(Short.class) || cls.equals(cls3)) {
                    return Short.valueOf((short) ((((int) dZzq) << i11) >> i11));
                }
                if (cls.equals(Double.class) || cls.equals(cls2) || cls.equals(Object.class)) {
                    return Double.valueOf(dZzq);
                }
                break;
            default:
                throw new AssertionError(zzaui.zza("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
        throw new zzavd();
    }

    public final Object zzl() throws zzavd {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        zzs((iArr[6] + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9)) ^ (iArr[7] % 235745791));
        return this.zzb;
    }

    public final long zzm() throws zzavd {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        zzs((iArr[6] + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9)) ^ (iArr[7] % 733327814));
        return this.zzc;
    }

    public final zzauk zzn() throws zzavd {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        zzs((iArr[6] + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9)) ^ (iArr[7] % 1140384172));
        return this.zze;
    }

    public final List zzo() throws zzavd {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        zzs((iArr[6] + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9)) ^ (iArr[7] % 1250801052));
        return this.zzf;
    }

    public final zzauy zzp() throws zzavd {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        zzs((iArr[6] + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9)) ^ (iArr[7] % 395191309));
        return this.zzg;
    }

    public final double zzq() throws zzavd {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        zzs((iArr[6] + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9)) ^ (iArr[7] % 846930886));
        return this.zzd;
    }

    public final void zzk(OutputStream outputStream) throws zzavd, IOException {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j9 = jArr[6];
        long j10 = jArr[7];
        long j11 = j9 + (((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7);
        long j12 = j10 % 297598514;
        int i2 = ((((~136416008) & 1315652152) | 568681609) + ((136416008 & 1310591536) | 838183178)) - (-1654427070);
        int i3 = 1414460396 % 78756298;
        int i5 = ((((~1202640845) & 472047875) | 1135942642) + ((1202640845 & 1006822481) | 585369424)) - 1952913860;
        int i7 = 1225708428 % 987359759;
        int i8 = this.zza;
        int i9 = ((((((~1959970879) & 1489831444) | 1998984087) + ((1959970879 & (-1446423480)) | (-182037905))) - (-2117037800)) ^ (1544048623 % 665228399)) + i8;
        if (i8 == 0) {
            throw null;
        }
        switch (i9) {
            case 0:
            case 1:
            case 5:
                throw new zzavd();
            case 2:
                zzaug.zzb(zzm(), new zzavf(outputStream, 1), true);
                return;
            case 3:
                byte[] bArr = zzn().zza;
                zzaug.zzb(((long) bArr.length) * (j11 ^ j12), new zzavf(outputStream, 0), true);
                outputStream.write(bArr);
                return;
            case 4:
                List listZzo = zzo();
                zzaug.zzb(listZzo.size(), new zzavf(outputStream, i5 ^ i7), true);
                Iterator it = listZzo.iterator();
                while (it.hasNext()) {
                    ((zzavg) it.next()).zzk(outputStream);
                }
                return;
            case 6:
                int i10 = i2 ^ i3;
                double dZzq = zzq();
                zzavf zzavfVar = new zzavf(outputStream, i10);
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(dZzq);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate((((((~1470558289) & 1721781326) | 2037102441) + ((1470558289 & 109139991) | 560281113)) - (-1975232131)) ^ (1043353969 % 656635246));
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.putLong(jDoubleToRawLongBits);
                for (byte b2 : byteBufferAllocate.array()) {
                    zzavfVar.zza(b2);
                }
                int length = byteBufferAllocate.array().length;
                return;
            default:
                return;
        }
    }
}
