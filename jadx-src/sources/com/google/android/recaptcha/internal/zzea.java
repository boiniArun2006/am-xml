package com.google.android.recaptcha.internal;

import GJW.r;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzea extends SuspendLambda implements Function1 {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ r zze;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new zzea(this.zzc, this.zzd, this.zze, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzea(zzec zzecVar, long j2, r rVar, Continuation continuation) {
        super(1, continuation);
        this.zzc = zzecVar;
        this.zzd = j2;
        this.zze = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzen zzenVar;
        zzbd e2;
        zzen zzenVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.zzb;
        if (i2 != 0) {
            if (i2 != 1) {
                zzenVar = (zzen) this.zza;
                try {
                    ResultKt.throwOnFailure(obj);
                    zzenVar.zza();
                    this.zzc.zzf = zzcm.zzb;
                    return Boxing.boxBoolean(this.zze.eF(Unit.INSTANCE));
                } catch (zzbd e3) {
                    e2 = e3;
                    this.zzc.zzd = e2;
                    zzenVar.zzb(e2);
                    throw e2;
                }
            }
            zzenVar2 = (zzen) this.zza;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (zzbd e4) {
                e2 = e4;
                zzenVar = zzenVar2;
                this.zzc.zzd = e2;
                zzenVar.zzb(e2);
                throw e2;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            zzen zzenVarZzf = this.zzc.zzb.zzf(41);
            try {
                zzdt zzdtVar = this.zzc.zza;
                long j2 = this.zzd;
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objZzo = zzdtVar.zzo(j2, this);
                if (objZzo != coroutine_suspended) {
                    zzenVar2 = zzenVarZzf;
                    obj = objZzo;
                }
                return coroutine_suspended;
            } catch (zzbd e5) {
                zzenVar = zzenVarZzf;
                e2 = e5;
                this.zzc.zzd = e2;
                zzenVar.zzb(e2);
                throw e2;
            }
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zze = zzscVar;
        zzdt zzdtVar2 = this.zzc.zza;
        long j3 = this.zzd;
        this.zza = zzenVar2;
        this.zzb = 2;
        if (zzdtVar2.zzn(zzscVar, j3, this) != coroutine_suspended) {
            zzenVar = zzenVar2;
            zzenVar.zza();
            this.zzc.zzf = zzcm.zzb;
            return Boxing.boxBoolean(this.zze.eF(Unit.INSTANCE));
        }
        return coroutine_suspended;
    }
}
