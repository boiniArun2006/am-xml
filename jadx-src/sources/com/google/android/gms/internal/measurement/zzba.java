package com.google.android.gms.internal.measurement;

import com.caoccao.javet.values.reference.IV8ValueArray;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzba {
    private static zzao zzb(zzae zzaeVar, zzg zzgVar, List list, boolean z2) {
        zzao zzaoVarZza;
        zzh.zzb("reduce", 1, list);
        zzh.zzc("reduce", 2, list);
        zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(0));
        if (!(zzaoVarZza2 instanceof zzai)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            zzaoVarZza = zzgVar.zza((zzao) list.get(1));
            if (zzaoVarZza instanceof zzag) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (zzaeVar.zzh() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            zzaoVarZza = null;
        }
        zzai zzaiVar = (zzai) zzaoVarZza2;
        int iZzh = zzaeVar.zzh();
        int i2 = z2 ? 0 : iZzh - 1;
        int i3 = z2 ? iZzh - 1 : 0;
        int i5 = true == z2 ? 1 : -1;
        if (zzaoVarZza == null) {
            zzaoVarZza = zzaeVar.zzl(i2);
            i2 += i5;
        }
        while ((i3 - i2) * i5 >= 0) {
            if (zzaeVar.zzo(i2)) {
                zzaoVarZza = zzaiVar.zza(zzgVar, Arrays.asList(zzaoVarZza, zzaeVar.zzl(i2), new zzah(Double.valueOf(i2)), zzaeVar));
                if (zzaoVarZza instanceof zzag) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i2 += i5;
            } else {
                i2 += i5;
            }
        }
        return zzaoVarZza;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static zzao zza(String str, zzae zzaeVar, zzg zzgVar, List list) {
        byte b2;
        double dZzi;
        String strZzc;
        double d2;
        double dZzh;
        zzae zzaeVar2;
        zzae zzaeVar3;
        switch (str.hashCode()) {
            case -1776922004:
                b2 = str.equals("toString") ? (byte) 18 : (byte) -1;
                break;
            case -1354795244:
                b2 = str.equals("concat") ? (byte) 0 : (byte) -1;
                break;
            case -1274492040:
                b2 = str.equals("filter") ? (byte) 2 : (byte) -1;
                break;
            case -934873754:
                b2 = str.equals("reduce") ? (byte) 10 : (byte) -1;
                break;
            case -895859076:
                b2 = str.equals("splice") ? (byte) 17 : (byte) -1;
                break;
            case -678635926:
                b2 = str.equals("forEach") ? (byte) 3 : (byte) -1;
                break;
            case -467511597:
                b2 = str.equals("lastIndexOf") ? (byte) 6 : (byte) -1;
                break;
            case -277637751:
                b2 = str.equals(IV8ValueArray.FUNCTION_UNSHIFT) ? (byte) 19 : (byte) -1;
                break;
            case 107868:
                b2 = str.equals("map") ? (byte) 7 : (byte) -1;
                break;
            case 111185:
                b2 = str.equals(IV8ValueArray.FUNCTION_POP) ? (byte) 8 : (byte) -1;
                break;
            case 3267882:
                b2 = str.equals("join") ? (byte) 5 : (byte) -1;
                break;
            case 3452698:
                b2 = str.equals(IV8ValueArray.FUNCTION_PUSH) ? (byte) 9 : (byte) -1;
                break;
            case 3536116:
                b2 = str.equals("some") ? (byte) 15 : (byte) -1;
                break;
            case 3536286:
                b2 = str.equals("sort") ? (byte) 16 : (byte) -1;
                break;
            case 96891675:
                b2 = str.equals("every") ? (byte) 1 : (byte) -1;
                break;
            case 109407362:
                b2 = str.equals(IV8ValueArray.FUNCTION_SHIFT) ? (byte) 13 : (byte) -1;
                break;
            case 109526418:
                b2 = str.equals("slice") ? (byte) 14 : (byte) -1;
                break;
            case 965561430:
                b2 = str.equals("reduceRight") ? (byte) 11 : (byte) -1;
                break;
            case 1099846370:
                b2 = str.equals("reverse") ? (byte) 12 : (byte) -1;
                break;
            case 1943291465:
                b2 = str.equals("indexOf") ? (byte) 4 : (byte) -1;
                break;
            default:
                b2 = -1;
                break;
        }
        zzai zzaiVar = null;
        switch (b2) {
            case 0:
                zzae zzaeVar4 = (zzae) zzaeVar.zzt();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        zzao zzaoVarZza = zzgVar.zza((zzao) it.next());
                        if (zzaoVarZza instanceof zzag) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int iZzh = zzaeVar4.zzh();
                        if (zzaoVarZza instanceof zzae) {
                            zzae zzaeVar5 = (zzae) zzaoVarZza;
                            Iterator itZzg = zzaeVar5.zzg();
                            while (itZzg.hasNext()) {
                                Integer num = (Integer) itZzg.next();
                                zzaeVar4.zzn(num.intValue() + iZzh, zzaeVar5.zzl(num.intValue()));
                            }
                        } else {
                            zzaeVar4.zzn(iZzh, zzaoVarZza);
                        }
                    }
                }
                return zzaeVar4;
            case 1:
                zzh.zza("every", 1, list);
                zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(0));
                if (zzaoVarZza2 instanceof zzan) {
                    return zzaeVar.zzh() == 0 ? zzao.zzk : zzc(zzaeVar, zzgVar, (zzan) zzaoVarZza2, Boolean.FALSE, Boolean.TRUE).zzh() != zzaeVar.zzh() ? zzao.zzl : zzao.zzk;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                zzh.zza("filter", 1, list);
                zzao zzaoVarZza3 = zzgVar.zza((zzao) list.get(0));
                if (!(zzaoVarZza3 instanceof zzan)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzi() == 0) {
                    return new zzae();
                }
                zzae zzaeVar6 = (zzae) zzaeVar.zzt();
                zzae zzaeVarZzc = zzc(zzaeVar, zzgVar, (zzan) zzaoVarZza3, null, Boolean.TRUE);
                zzae zzaeVar7 = new zzae();
                Iterator itZzg2 = zzaeVarZzc.zzg();
                while (itZzg2.hasNext()) {
                    zzaeVar7.zzn(zzaeVar7.zzh(), zzaeVar6.zzl(((Integer) itZzg2.next()).intValue()));
                }
                return zzaeVar7;
            case 3:
                zzh.zza("forEach", 1, list);
                zzao zzaoVarZza4 = zzgVar.zza((zzao) list.get(0));
                if (!(zzaoVarZza4 instanceof zzan)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzi() == 0) {
                    return zzao.zzf;
                }
                zzc(zzaeVar, zzgVar, (zzan) zzaoVarZza4, null, null);
                return zzao.zzf;
            case 4:
                zzh.zzc("indexOf", 2, list);
                zzao zzaoVarZza5 = zzao.zzf;
                if (!list.isEmpty()) {
                    zzaoVarZza5 = zzgVar.zza((zzao) list.get(0));
                }
                if (list.size() > 1) {
                    dZzi = zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue());
                    if (dZzi >= zzaeVar.zzh()) {
                        return new zzah(Double.valueOf(-1.0d));
                    }
                    if (dZzi < 0.0d) {
                        dZzi += (double) zzaeVar.zzh();
                    }
                } else {
                    dZzi = 0.0d;
                }
                Iterator itZzg3 = zzaeVar.zzg();
                while (itZzg3.hasNext()) {
                    int iIntValue = ((Integer) itZzg3.next()).intValue();
                    double d4 = iIntValue;
                    if (d4 >= dZzi && zzh.zzf(zzaeVar.zzl(iIntValue), zzaoVarZza5)) {
                        return new zzah(Double.valueOf(d4));
                    }
                }
                return new zzah(Double.valueOf(-1.0d));
            case 5:
                zzh.zzc("join", 1, list);
                if (zzaeVar.zzh() == 0) {
                    return zzao.zzm;
                }
                if (list.isEmpty()) {
                    strZzc = ",";
                } else {
                    zzao zzaoVarZza6 = zzgVar.zza((zzao) list.get(0));
                    strZzc = ((zzaoVarZza6 instanceof zzam) || (zzaoVarZza6 instanceof zzat)) ? "" : zzaoVarZza6.zzc();
                }
                return new zzas(zzaeVar.zzs(strZzc));
            case 6:
                zzh.zzc("lastIndexOf", 2, list);
                zzao zzaoVarZza7 = zzao.zzf;
                if (!list.isEmpty()) {
                    zzaoVarZza7 = zzgVar.zza((zzao) list.get(0));
                }
                int iZzh2 = zzaeVar.zzh() - 1;
                if (list.size() > 1) {
                    zzao zzaoVarZza8 = zzgVar.zza((zzao) list.get(1));
                    dZzh = Double.isNaN(zzaoVarZza8.zzd().doubleValue()) ? zzaeVar.zzh() - 1 : zzh.zzi(zzaoVarZza8.zzd().doubleValue());
                    d2 = 0.0d;
                    if (dZzh < 0.0d) {
                        dZzh += (double) zzaeVar.zzh();
                    }
                } else {
                    d2 = 0.0d;
                    dZzh = iZzh2;
                }
                if (dZzh < d2) {
                    return new zzah(Double.valueOf(-1.0d));
                }
                for (int iMin = (int) Math.min(zzaeVar.zzh(), dZzh); iMin >= 0; iMin--) {
                    if (zzaeVar.zzo(iMin) && zzh.zzf(zzaeVar.zzl(iMin), zzaoVarZza7)) {
                        return new zzah(Double.valueOf(iMin));
                    }
                }
                return new zzah(Double.valueOf(-1.0d));
            case 7:
                zzh.zza("map", 1, list);
                zzao zzaoVarZza9 = zzgVar.zza((zzao) list.get(0));
                if (zzaoVarZza9 instanceof zzan) {
                    return zzaeVar.zzh() == 0 ? new zzae() : zzc(zzaeVar, zzgVar, (zzan) zzaoVarZza9, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 8:
                zzh.zza(IV8ValueArray.FUNCTION_POP, 0, list);
                int iZzh3 = zzaeVar.zzh();
                if (iZzh3 == 0) {
                    return zzao.zzf;
                }
                int i2 = iZzh3 - 1;
                zzao zzaoVarZzl = zzaeVar.zzl(i2);
                zzaeVar.zzr(i2);
                return zzaoVarZzl;
            case 9:
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        zzaeVar.zzn(zzaeVar.zzh(), zzgVar.zza((zzao) it2.next()));
                    }
                }
                return new zzah(Double.valueOf(zzaeVar.zzh()));
            case 10:
                return zzb(zzaeVar, zzgVar, list, true);
            case 11:
                return zzb(zzaeVar, zzgVar, list, false);
            case 12:
                zzaeVar2 = zzaeVar;
                zzh.zza("reverse", 0, list);
                int iZzh4 = zzaeVar2.zzh();
                if (iZzh4 != 0) {
                    for (int i3 = 0; i3 < iZzh4 / 2; i3++) {
                        if (zzaeVar2.zzo(i3)) {
                            zzao zzaoVarZzl2 = zzaeVar2.zzl(i3);
                            zzaeVar2.zzn(i3, null);
                            int i5 = (iZzh4 - 1) - i3;
                            if (zzaeVar2.zzo(i5)) {
                                zzaeVar2.zzn(i3, zzaeVar2.zzl(i5));
                            }
                            zzaeVar2.zzn(i5, zzaoVarZzl2);
                        }
                    }
                }
                return zzaeVar2;
            case 13:
                zzh.zza(IV8ValueArray.FUNCTION_SHIFT, 0, list);
                if (zzaeVar.zzh() == 0) {
                    return zzao.zzf;
                }
                zzao zzaoVarZzl3 = zzaeVar.zzl(0);
                zzaeVar.zzr(0);
                return zzaoVarZzl3;
            case 14:
                zzh.zzc("slice", 2, list);
                if (list.isEmpty()) {
                    return zzaeVar.zzt();
                }
                double dZzh2 = zzaeVar.zzh();
                double dZzi2 = zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
                double dMax = dZzi2 < 0.0d ? Math.max(dZzi2 + dZzh2, 0.0d) : Math.min(dZzi2, dZzh2);
                if (list.size() == 2) {
                    double dZzi3 = zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue());
                    dZzh2 = dZzi3 < 0.0d ? Math.max(dZzh2 + dZzi3, 0.0d) : Math.min(dZzh2, dZzi3);
                }
                zzae zzaeVar8 = new zzae();
                for (int i7 = (int) dMax; i7 < dZzh2; i7++) {
                    zzaeVar8.zzn(zzaeVar8.zzh(), zzaeVar.zzl(i7));
                }
                return zzaeVar8;
            case 15:
                zzh.zza("some", 1, list);
                zzao zzaoVarZza10 = zzgVar.zza((zzao) list.get(0));
                if (!(zzaoVarZza10 instanceof zzai)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzh() == 0) {
                    return zzao.zzl;
                }
                zzai zzaiVar2 = (zzai) zzaoVarZza10;
                Iterator itZzg4 = zzaeVar.zzg();
                while (itZzg4.hasNext()) {
                    int iIntValue2 = ((Integer) itZzg4.next()).intValue();
                    if (zzaeVar.zzo(iIntValue2) && zzaiVar2.zza(zzgVar, Arrays.asList(zzaeVar.zzl(iIntValue2), new zzah(Double.valueOf(iIntValue2)), zzaeVar)).zze().booleanValue()) {
                        return zzao.zzk;
                    }
                }
                return zzao.zzl;
            case 16:
                zzaeVar2 = zzaeVar;
                zzh.zzc("sort", 1, list);
                if (zzaeVar2.zzh() >= 2) {
                    List listZzb = zzaeVar2.zzb();
                    if (!list.isEmpty()) {
                        zzao zzaoVarZza11 = zzgVar.zza((zzao) list.get(0));
                        if (!(zzaoVarZza11 instanceof zzai)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        zzaiVar = (zzai) zzaoVarZza11;
                    }
                    Collections.sort(listZzb, new zzaz(zzaiVar, zzgVar));
                    zzaeVar2.zzp();
                    Iterator it3 = listZzb.iterator();
                    int i8 = 0;
                    while (it3.hasNext()) {
                        zzaeVar2.zzn(i8, (zzao) it3.next());
                        i8++;
                    }
                }
                return zzaeVar2;
            case 17:
                if (list.isEmpty()) {
                    return new zzae();
                }
                int iZzi = (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
                if (iZzi < 0) {
                    iZzi = Math.max(0, iZzi + zzaeVar.zzh());
                } else if (iZzi > zzaeVar.zzh()) {
                    iZzi = zzaeVar.zzh();
                }
                int iZzh5 = zzaeVar.zzh();
                zzae zzaeVar9 = new zzae();
                if (list.size() > 1) {
                    int iMax = Math.max(0, (int) zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()));
                    if (iMax > 0) {
                        for (int i9 = iZzi; i9 < Math.min(iZzh5, iZzi + iMax); i9++) {
                            zzaeVar9.zzn(zzaeVar9.zzh(), zzaeVar.zzl(iZzi));
                            zzaeVar.zzr(iZzi);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i10 = 2; i10 < list.size(); i10++) {
                            zzao zzaoVarZza12 = zzgVar.zza((zzao) list.get(i10));
                            if (zzaoVarZza12 instanceof zzag) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            zzaeVar.zzq((iZzi + i10) - 2, zzaoVarZza12);
                        }
                    }
                } else {
                    while (iZzi < iZzh5) {
                        zzaeVar9.zzn(zzaeVar9.zzh(), zzaeVar.zzl(iZzi));
                        zzaeVar.zzn(iZzi, null);
                        iZzi++;
                    }
                }
                return zzaeVar9;
            case 18:
                zzh.zza("toString", 0, list);
                return new zzas(zzaeVar.zzs(","));
            case 19:
                if (list.isEmpty()) {
                    zzaeVar3 = zzaeVar;
                } else {
                    zzae zzaeVar10 = new zzae();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        zzao zzaoVarZza13 = zzgVar.zza((zzao) it4.next());
                        if (zzaoVarZza13 instanceof zzag) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        zzaeVar10.zzn(zzaeVar10.zzh(), zzaoVarZza13);
                    }
                    int iZzh6 = zzaeVar10.zzh();
                    Iterator itZzg5 = zzaeVar.zzg();
                    while (itZzg5.hasNext()) {
                        Integer num2 = (Integer) itZzg5.next();
                        zzaeVar10.zzn(num2.intValue() + iZzh6, zzaeVar.zzl(num2.intValue()));
                    }
                    zzaeVar3 = zzaeVar;
                    zzaeVar3.zzp();
                    Iterator itZzg6 = zzaeVar10.zzg();
                    while (itZzg6.hasNext()) {
                        Integer num3 = (Integer) itZzg6.next();
                        zzaeVar3.zzn(num3.intValue(), zzaeVar10.zzl(num3.intValue()));
                    }
                }
                return new zzah(Double.valueOf(zzaeVar3.zzh()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static zzae zzc(zzae zzaeVar, zzg zzgVar, zzai zzaiVar, Boolean bool, Boolean bool2) {
        zzae zzaeVar2 = new zzae();
        Iterator itZzg = zzaeVar.zzg();
        while (itZzg.hasNext()) {
            int iIntValue = ((Integer) itZzg.next()).intValue();
            if (zzaeVar.zzo(iIntValue)) {
                zzao zzaoVarZza = zzaiVar.zza(zzgVar, Arrays.asList(zzaeVar.zzl(iIntValue), new zzah(Double.valueOf(iIntValue)), zzaeVar));
                if (zzaoVarZza.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || zzaoVarZza.zze().equals(bool2)) {
                    zzaeVar2.zzn(iIntValue, zzaoVarZza);
                }
            }
        }
        return zzaeVar2;
    }
}
