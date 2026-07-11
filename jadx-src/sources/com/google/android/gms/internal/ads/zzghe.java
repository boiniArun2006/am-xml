package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzghe extends zzghb {
    private final Map zza;
    private final zzgfx zzb;
    private final DisplayMetrics zzc;

    zzghe(zzawg zzawgVar, zzgfx zzgfxVar, Map map, DisplayMetrics displayMetrics, zzgoe zzgoeVar) {
        super("HAMf3XP8KIibPGIFc5yJF+oNVlSUbFLkUHSZdrZ2Dhl4Bh9ge4/6z6Usrb+mfprj", "vYv0JfNJ2rw4TIvbzqBhbKW0tXWLxxqXfI+gpZUSK1Y=", zzawgVar, zzgfxVar, zzgoeVar.zza(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE));
        this.zzb = zzgfxVar;
        this.zza = map;
        this.zzc = displayMetrics;
    }

    private static long zzb(double d2, DisplayMetrics displayMetrics) {
        return Math.round(d2 / ((double) displayMetrics.density));
    }

    private static boolean zzc(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr;
        Map map = this.zza;
        MotionEvent motionEvent = (MotionEvent) map.get("nv");
        DisplayMetrics displayMetrics = this.zzc;
        Object[] objArr2 = (Object[]) method.invoke("", motionEvent, displayMetrics);
        objArr2.getClass();
        zzaxc zzaxcVarZza = zzaxd.zza();
        Object obj = objArr2[0];
        if (obj != null && objArr2[1] != null) {
            zzaxcVarZza.zza(((Long) obj).longValue());
            zzaxcVarZza.zzb(((Long) objArr2[1]).longValue());
        }
        Object obj2 = objArr2[2];
        if (obj2 != null) {
            zzaxcVarZza.zzh(((Long) obj2).longValue());
        }
        Object obj3 = objArr2[3];
        if (obj3 != null) {
            zzaxcVarZza.zzf(((Long) obj3).longValue());
        }
        Object obj4 = objArr2[4];
        if (obj4 != null) {
            zzaxcVarZza.zzc(((Long) obj4).longValue());
        }
        Object obj5 = objArr2[5];
        if (obj5 != null) {
            zzaxcVarZza.zzs(((Long) obj5).longValue() != 0 ? 2 : 1);
        }
        Object obj6 = objArr2[6];
        if (obj6 != null) {
            zzaxcVarZza.zzj(((Long) obj6).longValue());
        }
        Object obj7 = objArr2[7];
        if (obj7 != null) {
            zzaxcVarZza.zzi(((Long) obj7).longValue());
        }
        Object obj8 = objArr2[8];
        if (obj8 != null) {
            zzaxcVarZza.zzt(((Long) obj8).longValue() != 0 ? 2 : 1);
        }
        synchronized (zzawgVar) {
            try {
                Method methodZzc = this.zzb.zzc("LTqeYOkKjRvgMVLXGWwl9QUpPl0hs86RILvnzsnpkgBkbbANt+0KM6wwB7tA8s8M", "qJFn6bhMeF50E1eku7tYH88ZkNeM8ctWC3me80VkO1s=");
                if (methodZzc == null || (objArr = (Object[]) methodZzc.invoke("", (MotionEvent) map.get("nv"), displayMetrics)) == null) {
                    throw null;
                }
                Object obj9 = objArr[0];
                if (obj9 != null) {
                    zzawgVar.zzh(((Long) obj9).longValue());
                }
                Object obj10 = objArr[1];
                if (obj10 != null) {
                    zzawgVar.zzi(((Long) obj10).longValue());
                }
                Object obj11 = objArr[2];
                if (obj11 != null) {
                    zzawgVar.zzj(((Long) obj11).longValue());
                }
                Object obj12 = objArr[3];
                if (obj12 != null) {
                    zzawgVar.zzv(((Long) obj12).longValue());
                }
                Object obj13 = objArr[4];
                if (obj13 != null) {
                    zzawgVar.zzw(((Long) obj13).longValue());
                }
                zzger zzgerVar = (zzger) map.get("oe");
                if (zzgerVar != null) {
                    long j2 = zzgerVar.zza;
                    if (j2 > 0) {
                        zzawgVar.zzz(j2);
                    }
                    long j3 = zzgerVar.zzb;
                    if (j3 > 0) {
                        zzawgVar.zzy(j3);
                    }
                    long j4 = zzgerVar.zzc;
                    if (j4 > 0) {
                        zzawgVar.zzx(j4);
                    }
                    long j5 = zzgerVar.zzd;
                    if (j5 > 0) {
                        zzawgVar.zzA(j5);
                    }
                }
                zzger zzgerVar2 = (zzger) map.get("oe");
                if (zzgerVar2 != null && zzgerVar2.zza != 0 && zzc(displayMetrics)) {
                    double d2 = zzgerVar2.zze;
                    if (displayMetrics == null) {
                        throw null;
                    }
                    zzaxcVarZza.zzl(zzb(d2, displayMetrics));
                    zzaxcVarZza.zzm(zzb(zzgerVar2.zzh - zzgerVar2.zzf, displayMetrics));
                    zzaxcVarZza.zzn(zzb(zzgerVar2.zzi - zzgerVar2.zzg, displayMetrics));
                    zzaxcVarZza.zzq(zzb(zzgerVar2.zzf, displayMetrics));
                    zzaxcVarZza.zzr(zzb(zzgerVar2.zzg, displayMetrics));
                    if (((MotionEvent) map.get("nv")) != null) {
                        long jZzb = zzb(((zzgerVar2.zzf - zzgerVar2.zzh) + r4.getRawX()) - r4.getX(), displayMetrics);
                        if (jZzb != 0) {
                            zzaxcVarZza.zzo(jZzb);
                        }
                        long jZzb2 = zzb(((zzgerVar2.zzg - zzgerVar2.zzi) + r4.getRawY()) - r4.getY(), displayMetrics);
                        if (jZzb2 != 0) {
                            zzaxcVarZza.zzp(jZzb2);
                        }
                    }
                }
                zzawgVar.zzJ(zzaxcVarZza);
                zzges[] zzgesVarArr = (zzges[]) map.get("ro");
                if (zzgesVarArr != null && zzc(displayMetrics)) {
                    for (int i2 = 0; i2 <= zzgesVarArr.length - 2; i2++) {
                        zzges zzgesVar = zzgesVarArr[i2];
                        zzaxc zzaxcVarZza2 = zzaxd.zza();
                        double d4 = zzgesVar.zza;
                        if (displayMetrics == null) {
                            throw null;
                        }
                        zzaxcVarZza2.zza(zzb(d4, displayMetrics));
                        zzaxcVarZza2.zzb(zzb(zzgesVar.zzb, displayMetrics));
                        zzawgVar.zzK((zzaxd) zzaxcVarZza2.zzbu());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
