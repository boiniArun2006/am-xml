package com.google.android.recaptcha.internal;

import GJW.Lu;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzfj {
    private final Lazy zza;

    public final Object zzb(zzbr zzbrVar, zzsp zzspVar, Continuation continuation) {
        return zzc(this, zzbrVar, zzspVar, continuation);
    }

    public static final /* synthetic */ zzex zza(zzfj zzfjVar) {
        return (zzex) zzfjVar.zza.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object zzc(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, Continuation continuation) {
        zzfg zzfgVar;
        if (continuation instanceof zzfg) {
            zzfgVar = (zzfg) continuation;
            int i2 = zzfgVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfgVar.zzc = i2 - Integer.MIN_VALUE;
            } else {
                zzfgVar = new zzfg(zzfjVar, continuation);
            }
        }
        Object obj = zzfgVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzfgVar.zzc;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        zzfh zzfhVar = new zzfh(zzfjVar, zzbrVar, zzspVar, null);
        zzfgVar.zzc = 1;
        Object objJ2 = Lu.J2(zzfhVar, zzfgVar);
        return objJ2 == coroutine_suspended ? coroutine_suspended : objJ2;
    }

    public zzfj() {
        int i2 = zzav.zza;
        this.zza = LazyKt.lazy(zzfi.zza);
    }
}
