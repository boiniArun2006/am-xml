package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzef implements zzcn {
    private final zzdt zza;
    private zzcm zzb = zzcm.zza;
    private zzsc zzc;

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j2, Continuation continuation) throws zzbd {
        zzed zzedVar;
        String str2;
        RecaptchaAction recaptchaAction2;
        double d2;
        zzef zzefVar;
        String str3;
        zzef zzefVar2;
        if (continuation instanceof zzed) {
            zzedVar = (zzed) continuation;
            int i2 = zzedVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzedVar.zzd = i2 - Integer.MIN_VALUE;
            } else {
                zzedVar = new zzed(this, continuation);
            }
        }
        zzed zzedVar2 = zzedVar;
        Object objZzl = zzedVar2.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzedVar2.zzd;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objZzl);
                if (!Intrinsics.areEqual(this.zzb, zzcm.zzb)) {
                    throw new zzbd(zzbb.zzb, zzba.zzar, null);
                }
                double d4 = j2;
                zzdt zzdtVar = this.zza;
                double d5 = 0.45d * d4;
                zzedVar2.zze = this;
                zzedVar2.zzf = str;
                zzedVar2.zzg = recaptchaAction;
                double d6 = d4 * 0.55d;
                zzedVar2.zza = d6;
                zzedVar2.zzd = 1;
                objZzl = zzdtVar.zzl(str, (long) d5, zzedVar2);
                if (objZzl != coroutine_suspended) {
                    str2 = str;
                    recaptchaAction2 = recaptchaAction;
                    d2 = d6;
                    zzefVar = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = zzedVar2.zzf;
                zzefVar2 = zzedVar2.zze;
                ResultKt.throwOnFailure(objZzl);
                zzsr zzsrVar = (zzsr) objZzl;
                zzefVar2.zza.zzq(str3, zzsrVar);
                return zzsrVar.zzj();
            }
            double d7 = zzedVar2.zza;
            recaptchaAction2 = zzedVar2.zzg;
            String str4 = zzedVar2.zzf;
            zzef zzefVar3 = zzedVar2.zze;
            ResultKt.throwOnFailure(objZzl);
            d2 = d7;
            zzefVar = zzefVar3;
            str2 = str4;
            zzsi zzsiVar = (zzsi) objZzl;
            zzdt zzdtVar2 = zzefVar.zza;
            zzsc zzscVar = zzefVar.zzc;
            if (zzscVar == null) {
                zzscVar = null;
            }
            zzsp zzspVarZzi = zzdtVar2.zzi(recaptchaAction2, zzsiVar, zzscVar);
            zzedVar2.zze = zzefVar;
            zzedVar2.zzf = str2;
            zzedVar2.zzg = null;
            zzedVar2.zzd = 2;
            objZzl = zzefVar.zza.zzm(zzspVarZzi, str2, (long) d2, zzedVar2);
            if (objZzl != coroutine_suspended) {
                str3 = str2;
                zzefVar2 = zzefVar;
                zzsr zzsrVar2 = (zzsr) objZzl;
                zzefVar2.zza.zzq(str3, zzsrVar2);
                return zzsrVar2.zzj();
            }
            return coroutine_suspended;
        } catch (zzbd e2) {
            throw e2;
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzb, zzba.zzaz, e3.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r12 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.google.android.recaptcha.internal.zzef] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(long j2, Continuation continuation) throws zzbd {
        zzee zzeeVar;
        Object obj;
        double d2;
        zzef zzefVar;
        if (continuation instanceof zzee) {
            zzeeVar = (zzee) continuation;
            int i2 = zzeeVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzeeVar.zzd = i2 - Integer.MIN_VALUE;
            } else {
                zzeeVar = new zzee(this, continuation);
            }
        }
        Object obj2 = zzeeVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzeeVar.zzd;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj2);
                if (Intrinsics.areEqual(this.zzb, zzcm.zzb) || Intrinsics.areEqual(this.zzb, zzcm.zzd)) {
                    return Unit.INSTANCE;
                }
                this.zzb = zzcm.zzc;
                double d4 = j2;
                try {
                    zzdt zzdtVar = this.zza;
                    double d5 = 0.6d * d4;
                    zzeeVar.zze = this;
                    double d6 = d4 * 0.4d;
                    zzeeVar.zza = d6;
                    zzeeVar.zzd = 1;
                    Object objZzo = zzdtVar.zzo((long) d5, zzeeVar);
                    if (objZzo != coroutine_suspended) {
                        obj = objZzo;
                        d2 = d6;
                        zzefVar = this;
                        zzsc zzscVar = (zzsc) obj;
                        zzefVar.zzc = zzscVar;
                        zzeeVar.zze = zzefVar;
                        zzeeVar.zzd = 2;
                        Object objZzn = zzefVar.zza.zzn(zzscVar, (long) d2, zzeeVar);
                        j2 = zzefVar;
                    }
                    return coroutine_suspended;
                } catch (zzbd e2) {
                    e = e2;
                    j2 = this;
                    j2.zzb = zzcm.zzd;
                    throw e;
                }
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zzef zzefVar2 = zzeeVar.zze;
                ResultKt.throwOnFailure(obj2);
                j2 = zzefVar2;
                j2.zzb = zzcm.zzb;
                return Unit.INSTANCE;
            }
            double d7 = zzeeVar.zza;
            zzef zzefVar3 = zzeeVar.zze;
            try {
                ResultKt.throwOnFailure(obj2);
                obj = obj2;
                d2 = d7;
                zzefVar = zzefVar3;
                zzsc zzscVar2 = (zzsc) obj;
                zzefVar.zzc = zzscVar2;
                zzeeVar.zze = zzefVar;
                zzeeVar.zzd = 2;
                Object objZzn2 = zzefVar.zza.zzn(zzscVar2, (long) d2, zzeeVar);
                j2 = zzefVar;
            } catch (zzbd e3) {
                e = e3;
                j2 = zzefVar3;
                j2.zzb = zzcm.zzd;
                throw e;
            }
        } catch (zzbd e4) {
            e = e4;
        }
    }

    public zzef(zzdt zzdtVar) {
        this.zza = zzdtVar;
    }
}
