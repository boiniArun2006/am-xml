package com.google.android.recaptcha.internal;

import GJW.vd;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzfs extends SuspendLambda implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzgd zzd;
    final /* synthetic */ zzft zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfs(zzgd zzgdVar, zzft zzftVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzd = zzgdVar;
        this.zze = zzftVar;
        this.zzf = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzfs(this.zzd, this.zze, this.zzf, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((vd) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (r1.zzh(r7, r2, r6) != r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzub zzubVar;
        zzjh zzjhVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.zzc;
        try {
        } catch (Exception e2) {
            zzft zzftVar = this.zze;
            zzgd zzgdVar = this.zzd;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            zzjhVar = (zzjh) this.zzb;
            zzubVar = (zzub) this.zza;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            this.zzd.zza = new zzbn();
            zzub zzubVarZzi = zzub.zzi(zzkh.zzh().zzj(this.zzf));
            zzubVarZzi.zzf();
            zztz zztzVarZza = this.zze.zzc.zza(zzubVarZzi);
            zzjh zzjhVarZzb = zzjh.zzb();
            zzft zzftVar2 = this.zze;
            List listZzi = zztzVarZza.zzi();
            zzgd zzgdVar2 = this.zzd;
            this.zza = zzubVarZzi;
            this.zzb = zzjhVarZzb;
            this.zzc = 1;
            if (zzftVar2.zzg(listZzi, zzgdVar2, this) != coroutine_suspended) {
                zzubVar = zzubVarZzi;
                zzjhVar = zzjhVarZzb;
            }
            return coroutine_suspended;
        }
        zzjhVar.zzf();
        Boxing.boxLong(zzjhVar.zza(TimeUnit.MICROSECONDS));
        zzubVar.zzf();
        return Unit.INSTANCE;
    }
}
