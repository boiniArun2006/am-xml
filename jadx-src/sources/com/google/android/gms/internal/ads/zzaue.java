package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final /* synthetic */ class zzaue implements zzauy {
    public static final /* synthetic */ zzaue zza;
    public static final /* synthetic */ zzaue zzb;
    public static final /* synthetic */ zzaue zzc;
    public static final /* synthetic */ zzaue zzd;
    public static final /* synthetic */ zzaue zze;
    public static final /* synthetic */ zzaue zzf;
    public static final /* synthetic */ zzaue zzg;
    public static final /* synthetic */ zzaue zzh;
    public static final /* synthetic */ zzaue zzi;
    public static final /* synthetic */ zzaue zzj;
    public static final /* synthetic */ zzaue zzk;
    public static final /* synthetic */ zzaue zzl;
    public static final /* synthetic */ zzaue zzm;
    public static final /* synthetic */ zzaue zzn;
    public static final /* synthetic */ zzaue zzo;
    public static final /* synthetic */ zzaue zzp;
    public static final /* synthetic */ zzaue zzq;
    public static final /* synthetic */ zzaue zzr;
    public static final /* synthetic */ zzaue zzs;
    public static final /* synthetic */ zzaue zzt;
    public static final /* synthetic */ zzaue zzu;
    private final /* synthetic */ int zzv;

    static {
        int i2 = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i3 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i5 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i7 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i8 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i9 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i10 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        zzu = new zzaue((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        zzt = new zzaue((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        zzs = new zzaue((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        zzr = new zzaue(i10);
        zzq = new zzaue(i7);
        zzp = new zzaue(i8);
        zzaue zzaueVar = new zzaue(i9);
        int i11 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i12 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i13 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i14 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i15 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i16 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i17 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i18 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i19 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        zzo = zzaueVar;
        zzn = new zzaue(i5);
        zzm = new zzaue(i11);
        zzl = new zzaue(i12);
        zzk = new zzaue(i13);
        zzj = new zzaue(i3);
        zzi = new zzaue(i14);
        zzh = new zzaue(i15);
        zzg = new zzaue(i16);
        zzf = new zzaue(i2);
        zze = new zzaue(i17);
        zzd = new zzaue(i18);
        zzc = new zzaue(i19);
        zzb = new zzaue(1);
        zza = new zzaue(0);
    }

    private /* synthetic */ zzaue(int i2) {
        this.zzv = i2;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzatq zzatqVar;
        long j2 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.zzv) {
                                            case 0:
                                                zzavb zzavbVar = (zzavb) obj;
                                                zzaux zzauxVar = zzavbVar.zzb;
                                                long jZzm = zzauxVar.zzc().zzm();
                                                if (zzauxVar.zzc().zzm() != 0) {
                                                    zzavbVar.zzd.zza(jZzm);
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    zzaux zzauxVar2 = ((zzavb) obj).zzb;
                                                    long jZzm2 = zzauxVar2.zzc().zzm();
                                                    zzavg zzavgVarZzc = zzauxVar2.zzc();
                                                    zzavg zzavgVarZzc2 = zzauxVar2.zzc();
                                                    List listZzo = zzavgVarZzc2.zzo();
                                                    if (jZzm2 < 0) {
                                                        jZzm2 += (long) (listZzo.size() + 1);
                                                    }
                                                    if (jZzm2 >= 0 && jZzm2 < listZzo.size() + 1) {
                                                        listZzo.add((int) jZzm2, zzavgVarZzc);
                                                        zzauxVar2.zzb(zzavgVarZzc2);
                                                        return Optional.empty();
                                                    }
                                                    throw new zzave();
                                                } catch (zzave unused) {
                                                    zzatqVar = zzatq.zzI;
                                                }
                                                break;
                                            case 2:
                                                zzavb zzavbVar2 = (zzavb) obj;
                                                zzaux zzauxVar3 = zzavbVar2.zzb;
                                                long jZzm3 = zzauxVar3.zzc().zzm();
                                                if (zzauxVar3.zzc().zzm() == 0) {
                                                    zzavbVar2.zzd.zza(jZzm3);
                                                }
                                                return Optional.empty();
                                            case 3:
                                                ((zzavb) obj).zzb.zzb(zzavg.zzb(r0.zzc().zzo().size()));
                                                return Optional.empty();
                                            case 4:
                                                ((zzavb) obj).zzb.zzb(zzavg.zzb(r0.zzc().zzn().zza.length));
                                                return Optional.empty();
                                            case 5:
                                                zzaux zzauxVar4 = ((zzavb) obj).zzb;
                                                zzauxVar4.zzb(zzavg.zzc(Math.log(zzauxVar4.zzc().zzq())));
                                                return Optional.empty();
                                            case 6:
                                                zzaux zzauxVar5 = ((zzavb) obj).zzb;
                                                long jZzm4 = zzauxVar5.zzc().zzm();
                                                long jZzm5 = zzauxVar5.zzc().zzm();
                                                if (jZzm4 == 0 || jZzm5 == 0) {
                                                    j2 = 0;
                                                }
                                                zzauxVar5.zzb(zzavg.zzb(j2));
                                                return Optional.empty();
                                            case 7:
                                                zzaux zzauxVar6 = ((zzavb) obj).zzb;
                                                if (zzauxVar6.zzc().zzm() != 0) {
                                                    j2 = 0;
                                                }
                                                zzauxVar6.zzb(zzavg.zzb(j2));
                                                return Optional.empty();
                                            case 8:
                                                zzaux zzauxVar7 = ((zzavb) obj).zzb;
                                                long jZzm6 = zzauxVar7.zzc().zzm();
                                                long jZzm7 = zzauxVar7.zzc().zzm();
                                                if (jZzm6 == 0 && jZzm7 == 0) {
                                                    j2 = 0;
                                                }
                                                zzauxVar7.zzb(zzavg.zzb(j2));
                                                return Optional.empty();
                                            case 9:
                                                zzavb zzavbVar3 = (zzavb) obj;
                                                zzaux zzauxVar8 = zzavbVar3.zzb;
                                                try {
                                                    int iCompare = new zzavc(false).compare(zzauxVar8.zzc(), zzauxVar8.zzc());
                                                    zzaux zzauxVar9 = zzavbVar3.zzb;
                                                    if (iCompare >= 0) {
                                                        j2 = 0;
                                                    }
                                                    zzauxVar9.zzb(zzavg.zzb(j2));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(zzatq.zzd);
                                                }
                                            case 10:
                                                int[] iArr = {1944216249, 348137722, 926438168, 13122018, 1882968836, -1273372307, 246144337, 1723705710, 1677157265};
                                                int i2 = iArr[0];
                                                int i3 = iArr[1];
                                                int i5 = iArr[2];
                                                int i7 = iArr[3];
                                                int i8 = iArr[4];
                                                int i9 = iArr[5];
                                                int i10 = iArr[6];
                                                int i11 = iArr[7];
                                                int i12 = i10 + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9);
                                                int i13 = i11 % 1677157265;
                                                zzavb zzavbVar4 = (zzavb) obj;
                                                try {
                                                    zzaux zzauxVar10 = zzavbVar4.zzb;
                                                    long jZzm8 = zzauxVar10.zzc().zzm();
                                                    zzatw zzatwVar = zzavbVar4.zza;
                                                    zzaux zzauxVar11 = new zzaux(i13 ^ i12);
                                                    for (int i14 = 0; i14 < zzauxVar10.zzb; i14++) {
                                                        try {
                                                            zzauxVar11.zzb(zzavg.zzj((zzavg) zzauxVar10.zza.get(i14)));
                                                        } catch (zzauw e2) {
                                                            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e2);
                                                        }
                                                        break;
                                                    }
                                                    zzaup zzaupVar = zzavbVar4.zzd;
                                                    new zzavb(zzatwVar, zzauxVar11, new zzaup(zzaupVar.zzb, zzaupVar.zza, zzaupVar.zzc.zzc(), zzaupVar.zzd)).zzd.zza(jZzm8);
                                                    zzauxVar10.zzb(zzavg.zza(new zzaug()));
                                                    return Optional.empty();
                                                } catch (zzaun | zzauo unused3) {
                                                    zzatqVar = zzatq.zzt;
                                                }
                                                break;
                                            case 11:
                                                try {
                                                    zzaux zzauxVar12 = ((zzavb) obj).zzb;
                                                    zzauxVar12.zzb(zzavg.zza(zzauxVar12.zzc().zzi((Class) zzauxVar12.zzc().zzl())));
                                                    return Optional.empty();
                                                } catch (zzavd unused4) {
                                                    zzatqVar = zzatq.zzp;
                                                }
                                                break;
                                            case 12:
                                                zzaux zzauxVar13 = ((zzavb) obj).zzb;
                                                long jZzm9 = zzauxVar13.zzc().zzm();
                                                long jZzm10 = zzauxVar13.zzc().zzm();
                                                if (jZzm9 == 0) {
                                                    return Optional.of(zzatq.zzF);
                                                }
                                                zzauxVar13.zzb(zzavg.zzb(jZzm10 % jZzm9));
                                                return Optional.empty();
                                            case 13:
                                                zzaux zzauxVar14 = ((zzavb) obj).zzb;
                                                zzauxVar14.zzb(zzavg.zzc(zzauxVar14.zzc().zzq() * zzauxVar14.zzc().zzq()));
                                                return Optional.empty();
                                            case 14:
                                                zzaux zzauxVar15 = ((zzavb) obj).zzb;
                                                zzauxVar15.zzb(zzavg.zzb(zzauxVar15.zzc().zzm() * zzauxVar15.zzc().zzm()));
                                                return Optional.empty();
                                            case 15:
                                                zzaux zzauxVar16 = ((zzavb) obj).zzb;
                                                long jZzm11 = zzauxVar16.zzc().zzm();
                                                ArrayList arrayList = new ArrayList();
                                                for (long j3 = 0; j3 < jZzm11; j3++) {
                                                    arrayList.add(zzauxVar16.zzc());
                                                }
                                                Collections.reverse(arrayList);
                                                zzauxVar16.zzb(zzavg.zze(arrayList));
                                                return Optional.empty();
                                            case 16:
                                                zzaux zzauxVar17 = ((zzavb) obj).zzb;
                                                zzauxVar17.zzb(zzavg.zzc(Math.pow(zzauxVar17.zzc().zzq(), zzauxVar17.zzc().zzq())));
                                                return Optional.empty();
                                            case 17:
                                                ((zzavb) obj).zzb.zzb(zzavg.zza(null));
                                                return Optional.empty();
                                            case 18:
                                                zzavb zzavbVar5 = (zzavb) obj;
                                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(zzavbVar5.zzd.zzf((((((~1201162069L) & 403189074) | 1043752718) + ((1201162069 & 95979632) | 900760100)) - 1766798336) ^ (507611410 % 329370448)).zza());
                                                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                                                zzavbVar5.zzb.zzb(zzavg.zzc(Double.longBitsToDouble(byteBufferWrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                zzavb zzavbVar6 = (zzavb) obj;
                                                zzavbVar6.zzb.zzb(zzavg.zzb(zzavbVar6.zzd.zze()));
                                                return Optional.empty();
                                            default:
                                                long j4 = ((((~346030096L) & 203234088) | 575197286) + ((346030096 & 2352425736L) | 2745332883L)) - 1505840317;
                                                long j5 = 1246101662 % 372004513;
                                                long j6 = ((((~1810821955L) & 1747262537) | 563863662) + ((1810821955 & 1295301633) | 94020008)) - 1690999106;
                                                long j7 = 1675644664 % 749217043;
                                                zzavb zzavbVar7 = (zzavb) obj;
                                                zzaup zzaupVar2 = zzavbVar7.zzd;
                                                long jZze = zzaupVar2.zze();
                                                if (jZze >= 0 && jZze <= (j4 ^ j5)) {
                                                    if (((j6 ^ j7) & jZze) != 0) {
                                                        return Optional.of(zzatq.zze);
                                                    }
                                                    zzavbVar7.zzb.zzb(zzavg.zzd(zzaupVar2.zzf(jZze)));
                                                    return Optional.empty();
                                                }
                                                return Optional.of(zzatq.zzz);
                                        }
                                    } catch (zzauv unused5) {
                                        zzatqVar = zzatq.zzx;
                                    }
                                } catch (zzaun | zzauo unused6) {
                                    zzatqVar = zzatq.zzi;
                                }
                            } catch (zzavd unused7) {
                                zzatqVar = zzatq.zzy;
                            }
                        } catch (zzauw unused8) {
                            zzatqVar = zzatq.zza;
                        }
                    } catch (zzauo unused9) {
                        zzatqVar = zzatq.zzz;
                    }
                } catch (zzaun e3) {
                    e = e3;
                    throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
                }
            } catch (zzauw e4) {
                e = e4;
                throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
            }
        } catch (zzaum unused10) {
            zzatqVar = zzatq.zzD;
        }
        return Optional.of(zzatqVar);
    }
}
