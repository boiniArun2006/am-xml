package com.google.android.gms.internal.ads;

import GJW.vd;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzfzu extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzgaf zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfzu(zzgaf zzgafVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzgafVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzfzu(this.zzb, this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfzu) create((vd) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i2 == 0) {
            zzgaf zzgafVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            if (zzgafVar.zzi(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
