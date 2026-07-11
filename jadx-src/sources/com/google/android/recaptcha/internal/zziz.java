package com.google.android.recaptcha.internal;

import GJW.vd;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zziz extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zziz(zzja zzjaVar, zzen zzenVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzjaVar;
        this.zzd = zzenVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zziz(this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziz) create((vd) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (GJW.Qik.t(20000, r6, r5) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzbd zzbdVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.zzb;
        try {
        } catch (Exception e2) {
            e2.getMessage();
            zzbd zzbdVarZza = zzf.zza(e2, new zzbd(zzbb.zzb, zzba.zzV, e2.getMessage()));
            zzcb zzcbVarZzm = this.zzc.zzm();
            zzje zzjeVar = zzje.zza;
            this.zza = zzbdVarZza;
            this.zzb = 3;
            if (zzcbVarZzm.zzc(zzjeVar, this) != coroutine_suspended) {
                zzbdVar = zzbdVarZza;
            }
            return coroutine_suspended;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    zzbdVar = (zzbd) this.zza;
                    ResultKt.throwOnFailure(obj);
                    this.zzd.zzb(zzbdVar);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            zzja zzjaVar = this.zzc;
            this.zzb = 1;
            if (zzjaVar.zzx(this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        zziy zziyVar = new zziy(this.zzc, this.zzd, null);
        this.zzb = 2;
    }
}
