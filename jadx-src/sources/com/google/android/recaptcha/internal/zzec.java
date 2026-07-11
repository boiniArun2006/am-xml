package com.google.android.recaptcha.internal;

import GJW.C;
import GJW.ci;
import GJW.r;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzec implements zzcn {
    private final zzdt zza;
    private final zzek zzb;
    private zzbd zzd;
    private zzsc zze;
    private final zzbi zzg;
    private r zzc = ci.t(null, 1, null);
    private zzcm zzf = zzcm.zza;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(Function1 function1, Continuation continuation) {
        zzdv zzdvVar;
        zzbn zzbnVar;
        if (continuation instanceof zzdv) {
            zzdvVar = (zzdv) continuation;
            int i2 = zzdvVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzdvVar.zzc = i2 - Integer.MIN_VALUE;
            } else {
                zzdvVar = new zzdv(this, continuation);
            }
        }
        Object obj = zzdvVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzdvVar.zzc;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            zzbn zzbnVar2 = new zzbn();
            zzdvVar.zzd = zzbnVar2;
            zzdvVar.zzc = 1;
            if (function1.invoke(zzdvVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzbnVar = zzbnVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzbnVar = zzdvVar.zzd;
            ResultKt.throwOnFailure(obj);
        }
        zzbnVar.zzc();
        return Boxing.boxLong(zzbnVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[Catch: Exception -> 0x0031, TRY_ENTER, TryCatch #1 {Exception -> 0x0031, blocks: (B:13:0x002d, B:26:0x0065, B:31:0x0077, B:32:0x0080), top: B:53:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzm(long j2, Continuation continuation) throws zzbd {
        zzdw zzdwVar;
        zzec zzecVar;
        zzec zzecVar2;
        zzbd zzbdVar;
        zzbd zzbdVar2;
        long jLongValue;
        if (continuation instanceof zzdw) {
            zzdwVar = (zzdw) continuation;
            int i2 = zzdwVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzdwVar.zzd = i2 - Integer.MIN_VALUE;
            } else {
                zzdwVar = new zzdw(this, continuation);
            }
        }
        Object objZzl = zzdwVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzdwVar.zzd;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objZzl);
                zzdwVar.zze = this;
                zzdwVar.zza = j2;
                zzdwVar.zzd = 1;
                if (zzn(j2, zzdwVar) != coroutine_suspended) {
                    zzecVar = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = zzdwVar.zza;
                zzecVar2 = zzdwVar.zze;
                try {
                    ResultKt.throwOnFailure(objZzl);
                    jLongValue = j2 - ((Number) objZzl).longValue();
                    if (jLongValue < 500) {
                        return Boxing.boxLong(jLongValue);
                    }
                    throw new zzbd(zzbb.zzc, zzba.zzar, null);
                } catch (Exception e2) {
                    e = e2;
                    if (e instanceof zzbd) {
                    }
                    if (zzbdVar == null) {
                    }
                    if (Intrinsics.areEqual(zzecVar2.zzf, zzcm.zzd)) {
                    }
                    throw zzbdVar2;
                }
            }
            j2 = zzdwVar.zza;
            zzecVar = zzdwVar.zze;
            ResultKt.throwOnFailure(objZzl);
            zzdy zzdyVar = new zzdy(j2, zzecVar, null);
            zzdwVar.zze = zzecVar;
            zzdwVar.zza = j2;
            zzdwVar.zzd = 2;
            objZzl = zzecVar.zzl(zzdyVar, zzdwVar);
            if (objZzl != coroutine_suspended) {
                zzecVar2 = zzecVar;
                jLongValue = j2 - ((Number) objZzl).longValue();
                if (jLongValue < 500) {
                }
            }
            return coroutine_suspended;
        } catch (Exception e3) {
            e = e3;
            zzecVar2 = zzecVar;
            zzbdVar = e instanceof zzbd ? (zzbd) e : null;
            if (zzbdVar == null) {
                zzbdVar = new zzbd(zzbb.zzc, zzba.zzar, e.getMessage());
            }
            if ((!Intrinsics.areEqual(zzecVar2.zzf, zzcm.zzd) || Intrinsics.areEqual(zzecVar2.zzf, zzcm.zzc)) && (zzbdVar2 = zzecVar2.zzd) != null) {
                throw zzbdVar2;
            }
            throw zzbdVar;
        }
    }

    private final Object zzn(long j2, Continuation continuation) {
        if (Intrinsics.areEqual(this.zzf, zzcm.zzb) || Intrinsics.areEqual(this.zzf, zzcm.zzc)) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(this.zzf, zzcm.zzd) && !zzo(this.zzd)) {
            return Unit.INSTANCE;
        }
        this.zzf = zzcm.zzc;
        r rVarT = ci.t(null, 1, null);
        this.zzc = rVarT;
        C.nr(this.zzg.zza(), null, null, new zzeb(this, rVarT, j2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzo(Exception exc) {
        if (!(exc instanceof zzbd)) {
            return true;
        }
        zzbd zzbdVar = (zzbd) exc;
        return (Intrinsics.areEqual(zzbdVar.zzb(), zzbb.zzd) || Intrinsics.areEqual(zzbdVar.zzb(), zzbb.zze) || Intrinsics.areEqual(zzbdVar.zzb(), zzbb.zzf)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j2, Continuation continuation) throws zzbd {
        zzdu zzduVar;
        String str2;
        RecaptchaAction recaptchaAction2;
        Object objZzm;
        zzec zzecVar;
        String str3;
        double d2;
        zzec zzecVar2;
        zzsc zzscVar;
        String str4;
        zzec zzecVar3;
        if (continuation instanceof zzdu) {
            zzduVar = (zzdu) continuation;
            int i2 = zzduVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzduVar.zzd = i2 - Integer.MIN_VALUE;
            } else {
                zzduVar = new zzdu(this, continuation);
            }
        }
        zzdu zzduVar2 = zzduVar;
        Object objZzm2 = zzduVar2.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzduVar2.zzd;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objZzm2);
                zzduVar2.zze = this;
                str2 = str;
                zzduVar2.zzf = str2;
                recaptchaAction2 = recaptchaAction;
                zzduVar2.zzg = recaptchaAction2;
                zzduVar2.zzd = 1;
                objZzm = zzm(j2, zzduVar2);
                if (objZzm == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zzecVar = this;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str4 = zzduVar2.zzf;
                        zzecVar3 = zzduVar2.zze;
                        ResultKt.throwOnFailure(objZzm2);
                        zzsr zzsrVar = (zzsr) objZzm2;
                        zzecVar3.zza.zzq(str4, zzsrVar);
                        return zzsrVar.zzj();
                    }
                    d2 = zzduVar2.zza;
                    recaptchaAction2 = zzduVar2.zzg;
                    str3 = zzduVar2.zzf;
                    zzecVar2 = zzduVar2.zze;
                    ResultKt.throwOnFailure(objZzm2);
                    zzsi zzsiVar = (zzsi) objZzm2;
                    zzdt zzdtVar = zzecVar2.zza;
                    zzscVar = zzecVar2.zze;
                    if (zzscVar == null) {
                        zzscVar = null;
                    }
                    zzsp zzspVarZzi = zzdtVar.zzi(recaptchaAction2, zzsiVar, zzscVar);
                    zzdt zzdtVar2 = zzecVar2.zza;
                    long j3 = (long) d2;
                    zzduVar2.zze = zzecVar2;
                    zzduVar2.zzf = str3;
                    zzduVar2.zzg = null;
                    zzduVar2.zzd = 3;
                    String str5 = str3;
                    objZzm2 = zzdtVar2.zzm(zzspVarZzi, str5, j3, zzduVar2);
                    if (objZzm2 != coroutine_suspended) {
                        str4 = str5;
                        zzecVar3 = zzecVar2;
                        zzsr zzsrVar2 = (zzsr) objZzm2;
                        zzecVar3.zza.zzq(str4, zzsrVar2);
                        return zzsrVar2.zzj();
                    }
                    return coroutine_suspended;
                }
                recaptchaAction2 = zzduVar2.zzg;
                String str6 = zzduVar2.zzf;
                zzecVar = zzduVar2.zze;
                ResultKt.throwOnFailure(objZzm2);
                objZzm = objZzm2;
                str2 = str6;
            }
            double dLongValue = ((Number) objZzm).longValue();
            zzdt zzdtVar3 = zzecVar.zza;
            double d4 = 0.45d * dLongValue;
            zzduVar2.zze = zzecVar;
            zzduVar2.zzf = str2;
            zzduVar2.zzg = recaptchaAction2;
            double d5 = dLongValue * 0.55d;
            zzduVar2.zza = d5;
            zzduVar2.zzd = 2;
            Object objZzl = zzdtVar3.zzl(str2, (long) d4, zzduVar2);
            if (objZzl != coroutine_suspended) {
                zzec zzecVar4 = zzecVar;
                str3 = str2;
                objZzm2 = objZzl;
                d2 = d5;
                zzecVar2 = zzecVar4;
                zzsi zzsiVar2 = (zzsi) objZzm2;
                zzdt zzdtVar4 = zzecVar2.zza;
                zzscVar = zzecVar2.zze;
                if (zzscVar == null) {
                }
                zzsp zzspVarZzi2 = zzdtVar4.zzi(recaptchaAction2, zzsiVar2, zzscVar);
                zzdt zzdtVar22 = zzecVar2.zza;
                long j32 = (long) d2;
                zzduVar2.zze = zzecVar2;
                zzduVar2.zzf = str3;
                zzduVar2.zzg = null;
                zzduVar2.zzd = 3;
                String str52 = str3;
                objZzm2 = zzdtVar22.zzm(zzspVarZzi2, str52, j32, zzduVar2);
                if (objZzm2 != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        } catch (zzbd e2) {
            throw e2;
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzb, zzba.zzay, e3.getMessage());
        }
    }

    public zzec(zzdt zzdtVar, zzbi zzbiVar, zzek zzekVar, zzbo zzboVar) {
        this.zza = zzdtVar;
        this.zzg = zzbiVar;
        this.zzb = zzekVar;
    }

    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zzb(long j2, Continuation continuation) {
        Object objZzn = zzn(j2, continuation);
        if (objZzn == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objZzn;
        }
        return Unit.INSTANCE;
    }
}
