package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final /* synthetic */ class zzauh implements zzauy {
    public static final /* synthetic */ zzauh zza;
    public static final /* synthetic */ zzauh zzb;
    public static final /* synthetic */ zzauh zzc;
    public static final /* synthetic */ zzauh zzd;
    public static final /* synthetic */ zzauh zze;
    public static final /* synthetic */ zzauh zzf;
    public static final /* synthetic */ zzauh zzg;
    public static final /* synthetic */ zzauh zzh;
    public static final /* synthetic */ zzauh zzi;
    public static final /* synthetic */ zzauh zzj;
    public static final /* synthetic */ zzauh zzk;
    public static final /* synthetic */ zzauh zzl;
    public static final /* synthetic */ zzauh zzm;
    public static final /* synthetic */ zzauh zzn;
    public static final /* synthetic */ zzauh zzo;
    public static final /* synthetic */ zzauh zzp;
    private final /* synthetic */ int zzq;

    static {
        int i2 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i3 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i5 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i7 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i8 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i9 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i10 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i11 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i12 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i13 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i14 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i15 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        zzp = new zzauh((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        zzo = new zzauh((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        zzn = new zzauh(i15);
        zzm = new zzauh(i5);
        zzl = new zzauh(i7);
        zzk = new zzauh(i8);
        zzj = new zzauh(i3);
        zzi = new zzauh(i9);
        zzh = new zzauh(i10);
        zzg = new zzauh(i11);
        zzf = new zzauh(i2);
        zze = new zzauh(i12);
        zzd = new zzauh(i13);
        zzc = new zzauh(i14);
        zzb = new zzauh(1);
        zza = new zzauh(0);
    }

    private /* synthetic */ zzauh(int i2) {
        this.zzq = i2;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzatq zzatqVar;
        zzavg zzavgVarZzc;
        int i2 = ((((~603123090) & 1079339320) | 204100681) + ((603123090 & 1131784560) | 52466888)) - 1316176740;
        int i3 = 1216803069 % 33252481;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.zzq) {
                                case 0:
                                    return ((zzavb) obj).zza();
                                case 1:
                                    try {
                                        zzaux zzauxVar = ((zzavb) obj).zzb;
                                        long jZzm = zzauxVar.zzc().zzm();
                                        zzavg zzavgVarZzc2 = zzauxVar.zzc();
                                        List listZzo = zzavgVarZzc2.zzo();
                                        if (jZzm < 0) {
                                            jZzm += (long) listZzo.size();
                                        }
                                        if (jZzm >= 0 && jZzm < listZzo.size()) {
                                            listZzo.remove((int) jZzm);
                                            zzauxVar.zzb(zzavgVarZzc2);
                                            return Optional.empty();
                                        }
                                        throw new zzave();
                                    } catch (zzave unused) {
                                        zzatqVar = zzatq.zzI;
                                    }
                                    break;
                                case 2:
                                    zzavb zzavbVar = (zzavb) obj;
                                    zzaux zzauxVar2 = zzavbVar.zzb;
                                    zzavg zzavgVarZzc3 = zzauxVar2.zzc();
                                    zzauk zzaukVarZzn = zzauxVar2.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    zzavgVarZzc3.zzk(byteArrayOutputStream);
                                    zzavbVar.zzb.zzb(zzavg.zzd(zzaukVarZzn.zzd(zzauk.zze(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    zzavb zzavbVar2 = (zzavb) obj;
                                    zzaux zzauxVar3 = zzavbVar2.zzb;
                                    zzavg zzavgVarZzc4 = zzauxVar3.zzc();
                                    zzauk zzaukVarZzn2 = zzauxVar3.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    zzaug.zzb(zzavgVarZzc4.zzm(), new zzavf(byteArrayOutputStream2, i2 ^ i3), false);
                                    zzavbVar2.zzb.zzb(zzavg.zzd(zzaukVarZzn2.zzd(zzauk.zze(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    zzavb zzavbVar3 = (zzavb) obj;
                                    zzavbVar3.zzb.zze(-(zzavbVar3.zzc.zzb().zzb + zzavbVar3.zzd.zze()), zzavbVar3.zzb.zzc());
                                    return Optional.empty();
                                case 5:
                                    zzaux zzauxVar4 = ((zzavb) obj).zzb;
                                    zzauxVar4.zzb(zzavg.zzb(zzauxVar4.zzc().zzm() << ((int) zzauxVar4.zzc().zzm())));
                                    return Optional.empty();
                                case 6:
                                    zzaux zzauxVar5 = ((zzavb) obj).zzb;
                                    zzauxVar5.zzb(zzavg.zzb(zzauxVar5.zzc().zzm() >>> ((int) zzauxVar5.zzc().zzm())));
                                    return Optional.empty();
                                case 7:
                                    zzaux zzauxVar6 = ((zzavb) obj).zzb;
                                    zzauxVar6.zzb(zzavg.zzc(zzauxVar6.zzc().zzq() - zzauxVar6.zzc().zzq()));
                                    return Optional.empty();
                                case 8:
                                    zzaux zzauxVar7 = ((zzavb) obj).zzb;
                                    zzauxVar7.zzb(zzavg.zzb(zzauxVar7.zzc().zzm() - zzauxVar7.zzc().zzm()));
                                    return Optional.empty();
                                case 9:
                                    zzavb zzavbVar4 = (zzavb) obj;
                                    zzaux zzauxVar8 = zzavbVar4.zzb;
                                    long jZzm2 = zzauxVar8.zzc().zzm();
                                    zzavg zzavgVarZzc5 = zzauxVar8.zzc();
                                    zzaux zzauxVar9 = zzavbVar4.zzb;
                                    zzavg zzavgVarZzd = zzauxVar9.zzd(jZzm2);
                                    zzauxVar9.zze(jZzm2, zzavgVarZzc5);
                                    zzauxVar9.zzb(zzavgVarZzd);
                                    return Optional.empty();
                                case 10:
                                    zzavb zzavbVar5 = (zzavb) obj;
                                    zzaux zzauxVar10 = zzavbVar5.zzb;
                                    long jZzm3 = zzavbVar5.zzc.zzb().zzb + zzauxVar10.zzc().zzm();
                                    zzavg zzavgVarZzc6 = zzauxVar10.zzc();
                                    zzaux zzauxVar11 = zzavbVar5.zzb;
                                    long j2 = -jZzm3;
                                    zzavg zzavgVarZzd2 = zzauxVar11.zzd(j2);
                                    zzauxVar11.zze(j2, zzavgVarZzc6);
                                    zzauxVar11.zzb(zzavgVarZzd2);
                                    return Optional.empty();
                                case 11:
                                    zzavb zzavbVar6 = (zzavb) obj;
                                    long jZze = zzavbVar6.zzc.zzb().zzb + zzavbVar6.zzd.zze();
                                    zzavg zzavgVarZzc7 = zzavbVar6.zzb.zzc();
                                    zzaux zzauxVar12 = zzavbVar6.zzb;
                                    long j3 = -jZze;
                                    zzavg zzavgVarZzd3 = zzauxVar12.zzd(j3);
                                    zzauxVar12.zze(j3, zzavgVarZzc7);
                                    zzauxVar12.zzb(zzavgVarZzd3);
                                    return Optional.empty();
                                case 12:
                                    zzavb zzavbVar7 = (zzavb) obj;
                                    long jZzm4 = zzavbVar7.zzb.zzc().zzm();
                                    try {
                                        zzaux zzauxVar13 = zzavbVar7.zzb;
                                        int i5 = ((((~1349029729) & 1683806466) | 298308136) + ((1349029729 & (-199751405)) | (-1830723495))) - 438321650;
                                        int i7 = 1478326644 % 593443203;
                                        if (jZzm4 == 0) {
                                            zzavgVarZzc = zzauxVar13.zzc();
                                        } else {
                                            int iZza = zzauxVar13.zza(jZzm4);
                                            zzauxVar13.zzb += i5 ^ i7;
                                            zzavgVarZzc = (zzavg) zzauxVar13.zza.remove(iZza);
                                        }
                                        zzauxVar13.zzb(zzavgVarZzc);
                                        return Optional.empty();
                                    } catch (zzauv unused2) {
                                        zzatqVar = zzatq.zzg;
                                    }
                                    break;
                                case 13:
                                    zzavb zzavbVar8 = (zzavb) obj;
                                    try {
                                        zzaux zzauxVar14 = zzavbVar8.zzb;
                                        long jZzm5 = zzauxVar14.zzc().zzm();
                                        long jZzm6 = zzauxVar14.zzc().zzm();
                                        zzauu zzauuVar = zzavbVar8.zzc;
                                        zzaup zzaupVar = zzavbVar8.zzd;
                                        zzauuVar.zza(zzaupVar.zzb(), jZzm6, zzauuVar.zzb().zzb);
                                        zzaupVar.zza(jZzm5);
                                        return Optional.empty();
                                    } catch (zzaun | zzauo unused3) {
                                        zzatqVar = zzatq.zzr;
                                    } catch (zzaus unused4) {
                                        zzatqVar = zzatq.zzB;
                                    } catch (zzaut unused5) {
                                        zzatqVar = zzatq.zzw;
                                    }
                                    break;
                                case 14:
                                    zzavb zzavbVar9 = (zzavb) obj;
                                    try {
                                        zzavbVar9.zzb.zzb(zzavg.zzg(zzavbVar9.zzb.zzc().zzl()));
                                        return Optional.empty();
                                    } catch (zzavd unused6) {
                                        zzatqVar = zzatq.zzp;
                                    }
                                    break;
                                default:
                                    try {
                                        zzaux zzauxVar15 = ((zzavb) obj).zzb;
                                        Iterator it = zzauxVar15.zzc().zzo().iterator();
                                        while (it.hasNext()) {
                                            zzauxVar15.zzb((zzavg) it.next());
                                            break;
                                        }
                                        return Optional.empty();
                                    } catch (zzauw unused7) {
                                        zzatqVar = zzatq.zza;
                                    }
                                    break;
                            }
                        } catch (zzauv unused8) {
                            zzatqVar = zzatq.zzh;
                        }
                    } catch (zzauw e2) {
                        e = e2;
                        throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
                    }
                } catch (zzaum | zzauo | zzavd unused9) {
                    zzatqVar = zzatq.zzy;
                }
            } catch (zzaut | zzauv unused10) {
                zzatqVar = zzatq.zzx;
            }
        } catch (zzavd unused11) {
            zzatqVar = zzatq.zzk;
        } catch (IOException e3) {
            e = e3;
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
        }
        return Optional.of(zzatqVar);
    }
}
