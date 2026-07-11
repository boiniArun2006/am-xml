package com.google.android.recaptcha.internal;

import GJW.r;
import GJW.vd;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzeb extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ r zzc;
    final /* synthetic */ long zzd;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzeb(this.zzb, this.zzc, this.zzd, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeb(zzec zzecVar, r rVar, long j2, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzecVar;
        this.zzc = rVar;
        this.zzd = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((vd) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        zzbd zzbdVar;
        zzeb zzebVar;
        zzbd e2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zza != 0) {
            try {
                ResultKt.throwOnFailure(obj);
                zzebVar = this;
            } catch (zzbd e3) {
                zzbdVar = e3;
                zzebVar = this;
                zzebVar.zzb.zzf = zzcm.zzd;
                zzebVar.zzc.n(zzbdVar);
            }
        } else {
            ResultKt.throwOnFailure(obj);
            try {
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                zzebVar = this;
                try {
                    obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, zzebVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (zzbd e4) {
                    e2 = e4;
                    zzbdVar = e2;
                    zzebVar.zzb.zzf = zzcm.zzd;
                    zzebVar.zzc.n(zzbdVar);
                }
            } catch (zzbd e5) {
                e2 = e5;
                zzebVar = this;
                zzbdVar = e2;
                zzebVar.zzb.zzf = zzcm.zzd;
                zzebVar.zzc.n(zzbdVar);
            }
        }
        ((Boolean) obj).getClass();
        return Unit.INSTANCE;
    }
}
