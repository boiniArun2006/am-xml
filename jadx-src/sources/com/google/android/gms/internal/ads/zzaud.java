package com.google.android.gms.internal.ads;

import com.safedk.android.analytics.brandsafety.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final /* synthetic */ class zzaud implements zzauy {
    public static final /* synthetic */ zzaud zza;
    public static final /* synthetic */ zzaud zzb;
    public static final /* synthetic */ zzaud zzc;
    public static final /* synthetic */ zzaud zzd;
    public static final /* synthetic */ zzaud zze;
    public static final /* synthetic */ zzaud zzf;
    public static final /* synthetic */ zzaud zzg;
    public static final /* synthetic */ zzaud zzh;
    public static final /* synthetic */ zzaud zzi;
    public static final /* synthetic */ zzaud zzj;
    public static final /* synthetic */ zzaud zzk;
    public static final /* synthetic */ zzaud zzl;
    public static final /* synthetic */ zzaud zzm;
    public static final /* synthetic */ zzaud zzn;
    public static final /* synthetic */ zzaud zzo;
    public static final /* synthetic */ zzaud zzp;
    public static final /* synthetic */ zzaud zzq;
    public static final /* synthetic */ zzaud zzr;
    public static final /* synthetic */ zzaud zzs;
    public static final /* synthetic */ zzaud zzt;
    public static final /* synthetic */ zzaud zzu;
    private final /* synthetic */ int zzv;

    static {
        int i2 = (((((~1272469786) & 1097507524) | 723881402) + ((1272469786 & 1078604356) | 746642480)) - (-1830851820)) ^ (1544617505 % 243268139);
        int i3 = (((((~1722060049) & 1087578905) | 70644109) + ((1722060049 & 1625428690) | 673239279)) - 1747544094) ^ (860516127 % 777720504);
        int i5 = (((((~168057522) & 567809569) | 2007585082) + ((168057522 & 1112917761) | 1200484666)) - (-1753249985)) ^ (1761250573 % 1089653714);
        int i7 = (((((~386839851) & 502322088) | 1879579687) + ((386839851 & 1341449096) | 1376723987)) - (-1804183292)) ^ (2118801173 % 1119399015);
        int i8 = (((((~627992393) & 399075139) | 1263590114) + ((627992393 & 1418280193) | 1644468862)) - (-1502362592)) ^ (1449228398 % 989241888);
        int i9 = (((((~1687776787) & 1627592001) | 771768986) + ((1687776787 & 1226806633) | 136094264)) - 1910482017) ^ (992028067 % 180785147);
        int i10 = (((((~1111088131) & 1881672142) | 1222111317) + ((1111088131 & 807995786) | 38123124)) - 1508183881) ^ (1348361729 % 788380902);
        zzu = new zzaud((((((~636453333) & 363983206) | 1075208291) + ((636453333 & 2146013964) | 1783382730)) - (-1139191409)) ^ (1564003050 % 99885196));
        zzt = new zzaud((((((~338346092) & 646267944) | 2030210865) + ((338346092 & 109431182) | 1768591350)) - (-956795148)) ^ (1912163036 % 671068506));
        zzs = new zzaud((((((~1374600938) & 269492393) | 962980710) + ((1374600938 & (-2079309685)) | (-1096234186))) - (-724963331)) ^ (1587992726 % 995234140));
        zzr = new zzaud(i10);
        zzq = new zzaud(i7);
        zzp = new zzaud(i8);
        zzaud zzaudVar = new zzaud(i9);
        int i11 = (((((~406011017) & 1269108768) | 73167649) + ((406011017 & 2074166272) | 872470299)) - 1878158194) ^ (1615935710 % 639806732);
        int i12 = (((((~257675105) & 286888065) | 1680106172) + ((257675105 & 353998857) | 216033710)) - (-2120570644)) ^ (2033505236 % 29777560);
        int i13 = (((((~2137100237) & 243279585) | 1476690352) + ((2137100237 & 1182836297) | 1215531406)) - (-1785612177)) ^ (1251300606 % 959372260);
        int i14 = (((((~1280321648) & 1509448282) | 1074834725) + ((1280321648 & 434689663) | 67544101)) - 1396684682) ^ (1309383303 % 1129033333);
        int i15 = (((((~1635905385) & 436500164) | 1627617040) + ((1635905385 & 1527677388) | 1092341018)) - (-1251599253)) ^ (1253207672 % 570073850);
        int i16 = (((((~2058657199) & 1077280871) | 426331554) + ((2058657199 & 1242960213) | 260153146)) - 1453981149) ^ (711845894 % 404158660);
        int i17 = (((((~2077486715) & 1348527492) | 196553360) + ((2077486715 & 1547749134) | 218380923)) - 1621461405) ^ (1713258270 % 1573363368);
        int i18 = (((((~1194953865) & 541827704) | 1410336387) + ((1194953865 & 676044922) | 221517442)) - 2090845028) ^ (485560280 % 402724286);
        int i19 = (((((~1424268980) & 433259076) | 136627722) + ((1424268980 & 299303110) | 33824130)) - 448747429) ^ (1129566413 % 184803526);
        zzo = zzaudVar;
        zzn = new zzaud(i5);
        zzm = new zzaud(i11);
        zzl = new zzaud(i12);
        zzk = new zzaud(i13);
        zzj = new zzaud(i3);
        zzi = new zzaud(i14);
        zzh = new zzaud(i15);
        zzg = new zzaud(i16);
        zzf = new zzaud(i2);
        zze = new zzaud(i17);
        zzd = new zzaud(i18);
        zzc = new zzaud(i19);
        zzb = new zzaud(1);
        zza = new zzaud(0);
    }

    private /* synthetic */ zzaud(int i2) {
        this.zzv = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e3 A[Catch: zzauw -> 0x0061, zzaut | zzauv -> 0x00f2, ClassNotFoundException -> 0x01f3, zzavd -> 0x01f7, TryCatch #9 {zzauw -> 0x0061, blocks: (B:5:0x0036, B:9:0x0052, B:11:0x005a, B:16:0x0068, B:18:0x0071, B:32:0x00e3, B:19:0x007a, B:20:0x007f, B:21:0x0080, B:24:0x00a8, B:25:0x00ad, B:29:0x00b6, B:31:0x00be, B:35:0x00eb, B:36:0x00f0, B:37:0x00f1, B:42:0x0101, B:43:0x0111, B:45:0x0117, B:47:0x0125, B:48:0x0127, B:50:0x012c, B:51:0x0132, B:53:0x014a, B:54:0x014d, B:61:0x016c, B:66:0x018a, B:99:0x01e7, B:70:0x0195, B:74:0x01a0, B:81:0x01b4, B:85:0x01bf, B:89:0x01ca, B:93:0x01d5, B:97:0x01e0, B:98:0x01e3, B:105:0x01ff, B:109:0x0216, B:114:0x0239, B:121:0x0267, B:126:0x0288, B:135:0x02b0, B:137:0x02c6, B:138:0x02c8, B:140:0x02cd, B:144:0x02de, B:146:0x02f6, B:147:0x02f9, B:166:0x041b, B:192:0x04c9, B:194:0x04d1, B:198:0x04db, B:199:0x04e1, B:200:0x04e5, B:201:0x04ec, B:214:0x0532, B:218:0x0555, B:222:0x05a6, B:226:0x05c3, B:239:0x060e, B:243:0x0634, B:247:0x0657), top: B:252:0x000f }] */
    @Override // java.util.function.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object apply(Object obj) throws zzaum, zzauo {
        zzatq zzatqVar;
        long j2;
        zzaux zzauxVar;
        zzavg zzavgVarZza;
        zzatq zzatqVar2;
        zzatq zzatqVar3;
        int i2 = this.zzv;
        long j3 = 1;
        Class<?> cls = Void.TYPE;
        long j4 = 0;
        int i3 = 0;
        try {
            try {
                try {
                    try {
                        switch (i2) {
                            case 0:
                                zzaux zzauxVar2 = ((zzavb) obj).zzb;
                                zzauxVar2.zzb(zzavg.zzb(zzauxVar2.zzc().zzm() + zzauxVar2.zzc().zzm()));
                                return Optional.empty();
                            case 1:
                                zzaux zzauxVar3 = ((zzavb) obj).zzb;
                                zzauxVar3.zzb(zzavg.zzc(zzauxVar3.zzc().zzq() + zzauxVar3.zzc().zzq()));
                                return Optional.empty();
                            case 2:
                                zzaux zzauxVar4 = ((zzavb) obj).zzb;
                                zzauxVar4.zzb(zzavg.zzd(zzauxVar4.zzc().zzn().zzd(zzauxVar4.zzc().zzn())));
                                return Optional.empty();
                            case 3:
                                zzavb zzavbVar = (zzavb) obj;
                                try {
                                    long jZze = zzavbVar.zzd.zze();
                                    for (long j5 = 0; j5 < jZze; j5++) {
                                        zzavbVar.zzb.zzb(zzavg.zza(null));
                                    }
                                    return Optional.empty();
                                } catch (zzauw unused) {
                                    zzatqVar = zzatq.zza;
                                    return Optional.of(zzatqVar);
                                }
                            case 4:
                                zzaux zzauxVar5 = ((zzavb) obj).zzb;
                                zzauxVar5.zzb(zzavg.zzb(zzauxVar5.zzc().zzm() & zzauxVar5.zzc().zzm()));
                                return Optional.empty();
                            case 5:
                                long[] jArr = {916768482, 1259538933, 805446160, -15648283, -1266372608, 883303887, 6538657, 384868448, 102194872};
                                long j6 = jArr[0];
                                long j7 = jArr[1];
                                long j9 = jArr[2];
                                long j10 = jArr[3];
                                long j11 = jArr[4];
                                long j12 = jArr[5];
                                long j13 = jArr[6];
                                long j14 = jArr[7];
                                long j15 = j13 + (((((~j6) & j7) | j9) + ((j6 & j10) | j11)) - j12);
                                long j16 = j14 % 102194872;
                                zzaux zzauxVar6 = ((zzavb) obj).zzb;
                                zzauxVar6.zzb(zzavg.zzb(zzauxVar6.zzc().zzm() ^ (j15 ^ j16)));
                                return Optional.empty();
                            case 6:
                                zzaux zzauxVar7 = ((zzavb) obj).zzb;
                                zzauxVar7.zzb(zzavg.zzb(zzauxVar7.zzc().zzm() | zzauxVar7.zzc().zzm()));
                                return Optional.empty();
                            case 7:
                                zzaux zzauxVar8 = ((zzavb) obj).zzb;
                                zzauxVar8.zzb(zzavg.zzb(zzauxVar8.zzc().zzm() ^ zzauxVar8.zzc().zzm()));
                                return Optional.empty();
                            case 8:
                                zzavb zzavbVar2 = (zzavb) obj;
                                try {
                                    long jZzm = zzavbVar2.zzb.zzc().zzm();
                                    zzauu zzauuVar = zzavbVar2.zzc;
                                    zzaup zzaupVar = zzavbVar2.zzd;
                                    zzauuVar.zza(zzaupVar.zzb(), 0L, r1.zzb);
                                    zzaupVar.zza(jZzm);
                                    return Optional.empty();
                                } catch (zzaun | zzauo unused2) {
                                    zzatqVar = zzatq.zzr;
                                    return Optional.of(zzatqVar);
                                } catch (zzaus unused3) {
                                    zzatqVar = zzatq.zzB;
                                    return Optional.of(zzatqVar);
                                }
                            case 9:
                                zzavb zzavbVar3 = (zzavb) obj;
                                try {
                                    zzaux zzauxVar9 = zzavbVar3.zzb;
                                    long jZzm2 = zzauxVar9.zzc().zzm();
                                    List listZzo = zzauxVar9.zzc().zzo();
                                    int size = listZzo.size();
                                    Object objZzh = zzauxVar9.zzc().zzh();
                                    Object objZzl = zzauxVar9.zzc().zzl();
                                    if (objZzl instanceof Method) {
                                        Method method = (Method) objZzl;
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        if (parameterTypes.length == size) {
                                            Object[] objArr = new Object[size];
                                            if (objZzh instanceof Constructor) {
                                                Class<?>[] parameterTypes2 = ((Constructor) objZzh).getParameterTypes();
                                                int length = parameterTypes2.length;
                                                Object[] objArr2 = new Object[length];
                                                List listZzo2 = ((zzavg) listZzo.get(0)).zzo();
                                                if (listZzo2.size() == length) {
                                                    int i5 = 0;
                                                    while (i5 < listZzo2.size()) {
                                                        objArr2[i5] = ((zzavg) listZzo2.get(i5)).zzi(parameterTypes2[i5]);
                                                        i5++;
                                                        j4 = j4;
                                                    }
                                                    j2 = j4;
                                                    objArr[0] = objArr2;
                                                }
                                            } else {
                                                j2 = 0;
                                                while (i3 < size) {
                                                    objArr[i3] = ((zzavg) listZzo.get(i3)).zzi(parameterTypes[i3]);
                                                    i3++;
                                                }
                                            }
                                            try {
                                                Object objInvoke = method.invoke(objZzh, objArr);
                                                if (method.getReturnType() == Void.class || method.getReturnType() == cls) {
                                                    zzauxVar = zzavbVar3.zzb;
                                                    zzavgVarZza = zzavg.zza(null);
                                                } else if (jZzm2 != j2) {
                                                    zzauxVar = zzavbVar3.zzb;
                                                    zzavgVarZza = zzavg.zzg(objInvoke);
                                                } else {
                                                    zzauxVar = zzavbVar3.zzb;
                                                    zzavgVarZza = zzavg.zza(objInvoke);
                                                }
                                                zzauxVar.zzb(zzavgVarZza);
                                                return Optional.empty();
                                            } catch (Throwable unused4) {
                                                zzatqVar = zzatq.zzq;
                                                return Optional.of(zzatqVar);
                                            }
                                        }
                                    }
                                    return Optional.of(zzatq.zzp);
                                } catch (zzavd unused5) {
                                    zzatqVar = zzatq.zzp;
                                }
                                break;
                            case 10:
                                int i7 = ((((~2084546560) & 73475461) | 438076064) + ((2084546560 & 611428101) | 2023412224)) - (-1830321789);
                                int i8 = 1073781763 % 1003463633;
                                int i9 = ((((~461273879) & 107429921) | 378966045) + ((461273879 & 283197472) | 1937909388)) - 2133058944;
                                int i10 = 1917305981 % 575705360;
                                zzavb zzavbVar4 = (zzavb) obj;
                                zzaux zzauxVar10 = zzavbVar4.zzb;
                                int intExact = Math.toIntExact(zzauxVar10.zzc().zzm());
                                zzauk zzaukVarZzn = zzauxVar10.zzc().zzn();
                                zzauk zzaukVarZzn2 = zzauxVar10.zzc().zzn();
                                if (zzaukVarZzn.zza.length != (i7 ^ i8)) {
                                    return Optional.of(zzatq.zzH);
                                }
                                int[] iArr = new int[i9 ^ i10];
                                ByteBuffer.wrap(zzaukVarZzn.zza()).asIntBuffer().get(iArr);
                                zzauc zzaucVar = new zzauc(intExact, iArr);
                                int i11 = ((((~1183912267) & 781500673) | 1683555012) + ((1183912267 & 180666625) | 541077750)) - (-1949988574);
                                int i12 = 1527793660 % 245277883;
                                int i13 = ((((~95266356) & 568641509) | 183483904) + ((95266356 & 553669093) | 504469010)) - 874379764;
                                int i14 = 2026478004 % 1659239833;
                                byte[] bArrZza = zzaukVarZzn2.zza();
                                int i15 = (((((~1787189168) & 1360184381) | 611517270) + ((1787189168 & 1426637867) | 612056018)) - 1771476931) ^ (1821115873 % 1010014811);
                                byte[] bArr = new byte[i15];
                                int i16 = 0;
                                while (i16 < bArrZza.length) {
                                    if (i16 % i15 == 0) {
                                        zzaucVar.zza(i16 >>> (i11 ^ i12), bArr);
                                    } else if (i16 == 0) {
                                        i16 = 0;
                                        zzaucVar.zza(i16 >>> (i11 ^ i12), bArr);
                                    }
                                    int i17 = i13 ^ i14;
                                    bArrZza[i16] = (byte) (((bArrZza[i16] ^ bArr[i16 % i15]) << i17) >> i17);
                                    i16++;
                                }
                                zzavbVar4.zzb.zzb(zzavg.zzd(zzauk.zze(bArrZza)));
                                return Optional.empty();
                            case 11:
                                zzaux zzauxVar11 = ((zzavb) obj).zzb;
                                double dZzq = zzauxVar11.zzc().zzq();
                                double dZzq2 = zzauxVar11.zzc().zzq();
                                if (dZzq == 0.0d) {
                                    zzatqVar2 = zzatq.zzF;
                                    return Optional.of(zzatqVar2);
                                }
                                zzauxVar11.zzb(zzavg.zzc(dZzq2 / dZzq));
                                return Optional.empty();
                            case 12:
                                zzaux zzauxVar12 = ((zzavb) obj).zzb;
                                long jZzm3 = zzauxVar12.zzc().zzm();
                                long jZzm4 = zzauxVar12.zzc().zzm();
                                if (jZzm3 == 0) {
                                    zzatqVar2 = zzatq.zzF;
                                    return Optional.of(zzatqVar2);
                                }
                                zzauxVar12.zzb(zzavg.zzb(jZzm4 / jZzm3));
                                return Optional.empty();
                            case 13:
                                try {
                                    ((zzavb) obj).zzb.zzc();
                                    return Optional.empty();
                                } catch (zzauv unused6) {
                                    zzatqVar = zzatq.zzA;
                                    return Optional.of(zzatqVar);
                                }
                            case 14:
                                zzavb zzavbVar5 = (zzavb) obj;
                                long jZzm5 = zzavbVar5.zzb.zzc().zzm();
                                zzaux zzauxVar13 = zzavbVar5.zzb;
                                zzauxVar13.zzb(zzavg.zzj(zzauxVar13.zzd(jZzm5)));
                                return Optional.empty();
                            case 15:
                                zzavb zzavbVar6 = (zzavb) obj;
                                long jZzm6 = zzavbVar6.zzc.zzb().zzb + zzavbVar6.zzb.zzc().zzm();
                                zzaux zzauxVar14 = zzavbVar6.zzb;
                                zzauxVar14.zzb(zzavg.zzj(zzauxVar14.zzd(-jZzm6)));
                                return Optional.empty();
                            case 16:
                                zzavb zzavbVar7 = (zzavb) obj;
                                long jZze2 = zzavbVar7.zzc.zzb().zzb + zzavbVar7.zzd.zze();
                                zzaux zzauxVar15 = zzavbVar7.zzb;
                                zzauxVar15.zzb(zzavg.zzj(zzauxVar15.zzd(-jZze2)));
                                return Optional.empty();
                            case 17:
                                try {
                                    zzaux zzauxVar16 = ((zzavb) obj).zzb;
                                    if (new zzavc(true).compare(zzauxVar16.zzc(), zzauxVar16.zzc()) != 0) {
                                        j3 = 0;
                                    }
                                    zzauxVar16.zzb(zzavg.zzb(j3));
                                    return Optional.empty();
                                } catch (IllegalArgumentException unused7) {
                                    zzatqVar = zzatq.zzd;
                                    return Optional.of(zzatqVar);
                                }
                            case 18:
                                try {
                                    zzaux zzauxVar17 = ((zzavb) obj).zzb;
                                    String strZzc = zzauxVar17.zzc().zzn().zzc();
                                    switch (strZzc.hashCode()) {
                                        case -1325958191:
                                            cls = strZzc.equals("double") ? Double.TYPE : Class.forName(strZzc);
                                            break;
                                        case 104431:
                                            if (strZzc.equals(l.f62668w)) {
                                                cls = Integer.TYPE;
                                                break;
                                            }
                                            break;
                                        case 3039496:
                                            if (strZzc.equals("byte")) {
                                                cls = Byte.TYPE;
                                                break;
                                            }
                                            break;
                                        case 3052374:
                                            if (strZzc.equals("char")) {
                                                cls = Character.TYPE;
                                                break;
                                            }
                                            break;
                                        case 3327612:
                                            if (strZzc.equals("long")) {
                                                cls = Long.TYPE;
                                                break;
                                            }
                                            break;
                                        case 3625364:
                                            if (!strZzc.equals("void")) {
                                            }
                                            break;
                                        case 64711720:
                                            if (strZzc.equals("boolean")) {
                                                cls = Boolean.TYPE;
                                                break;
                                            }
                                            break;
                                        case 97526364:
                                            if (strZzc.equals("float")) {
                                                cls = Float.TYPE;
                                                break;
                                            }
                                            break;
                                        case 109413500:
                                            if (strZzc.equals("short")) {
                                                cls = Short.TYPE;
                                                break;
                                            }
                                            break;
                                    }
                                    zzauxVar17.zzb(zzavg.zza(cls));
                                    return Optional.empty();
                                } catch (zzavd unused8) {
                                    zzatqVar = zzatq.zzl;
                                    return Optional.of(zzatqVar);
                                } catch (ClassNotFoundException unused9) {
                                    zzatqVar = zzatq.zzm;
                                    return Optional.of(zzatqVar);
                                }
                            case 19:
                                try {
                                    zzaux zzauxVar18 = ((zzavb) obj).zzb;
                                    List listZzo3 = zzauxVar18.zzc().zzo();
                                    Class<?>[] clsArr = new Class[listZzo3.size()];
                                    while (true) {
                                        if (i3 < listZzo3.size()) {
                                            Object objZzl2 = ((zzavg) listZzo3.get(i3)).zzl();
                                            if (objZzl2 instanceof Class) {
                                                clsArr[i3] = (Class) objZzl2;
                                                i3++;
                                            } else {
                                                zzatqVar3 = zzatq.zzn;
                                            }
                                        } else {
                                            String strZzc2 = zzauxVar18.zzc().zzn().zzc();
                                            Object objZzl3 = zzauxVar18.zzc().zzl();
                                            if (objZzl3 instanceof Class) {
                                                zzauxVar18.zzb(zzavg.zza(((Class) objZzl3).getMethod(strZzc2, clsArr)));
                                                return Optional.empty();
                                            }
                                            zzatqVar3 = zzatq.zzn;
                                        }
                                    }
                                    return Optional.of(zzatqVar3);
                                } catch (zzavd unused10) {
                                    zzatqVar = zzatq.zzn;
                                    return Optional.of(zzatqVar);
                                } catch (NoSuchMethodException unused11) {
                                    zzatqVar = zzatq.zzo;
                                    return Optional.of(zzatqVar);
                                } catch (SecurityException unused12) {
                                    zzatqVar = zzatq.zzC;
                                    return Optional.of(zzatqVar);
                                }
                            default:
                                int i18 = ((((~306851320) & 2040670728) | 1372152390) + ((306851320 & (-1473639347)) | (-2036492681))) - 244167092;
                                int i19 = 1764892438 % 764851988;
                                zzaux zzauxVar19 = ((zzavb) obj).zzb;
                                long jZzm7 = zzauxVar19.zzc().zzm();
                                zzavg zzavgVarZzc = zzauxVar19.zzc();
                                zzavg zzavgVarZzc2 = zzauxVar19.zzc();
                                int i20 = zzavgVarZzc2.zza;
                                int i21 = (i18 ^ i19) + i20;
                                if (i20 == 0) {
                                    throw null;
                                }
                                if (i21 == 3) {
                                    zzauk zzaukVarZzn3 = zzavgVarZzc2.zzn();
                                    int i22 = ((((~284327308) & 44384696) | 1708231444) + ((284327308 & 1647591593) | 1951966997)) - (-1088446899);
                                    int i23 = 2085308422 % 531900034;
                                    if (jZzm7 < 0) {
                                        jZzm7 += (long) zzaukVarZzn3.zza.length;
                                    }
                                    if (zzavgVarZzc.zza != (i22 ^ i23)) {
                                        throw new zzavd();
                                    }
                                    if (jZzm7 >= 0 && jZzm7 < zzaukVarZzn3.zza.length) {
                                        char cCharAt = zzaukVarZzn3.zzc().charAt((int) jZzm7);
                                        StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length());
                                        sb.append(cCharAt);
                                        zzavgVarZzc = zzavg.zzd(zzauk.zzf(sb.toString()));
                                    }
                                } else {
                                    if (i21 != 4) {
                                        throw new zzavd();
                                    }
                                    List listZzo4 = zzavgVarZzc2.zzo();
                                    if (jZzm7 < 0) {
                                        jZzm7 += (long) listZzo4.size();
                                    }
                                    if (jZzm7 >= 0 && jZzm7 < listZzo4.size()) {
                                        zzavgVarZzc = (zzavg) listZzo4.get((int) jZzm7);
                                    }
                                }
                                zzauxVar19.zzb(zzavgVarZzc);
                                return Optional.empty();
                        }
                    } catch (zzauv unused13) {
                        zzatqVar = zzatq.zzf;
                    }
                } catch (zzauw e2) {
                    throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e2);
                }
            } catch (zzaum | zzauo | zzavd unused14) {
                zzatqVar = zzatq.zzy;
            }
        } catch (zzaut | zzauv unused15) {
            zzatqVar = zzatq.zzx;
        }
    }
}
