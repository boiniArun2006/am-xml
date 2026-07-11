package com.google.android.recaptcha.internal;

import GJW.r;
import GJW.vd;
import android.webkit.WebView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zziy extends SuspendLambda implements Function2 {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    int zze;
    final /* synthetic */ zzja zzf;
    final /* synthetic */ zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zziy(zzja zzjaVar, zzen zzenVar, Continuation continuation) {
        super(2, continuation);
        this.zzf = zzjaVar;
        this.zzg = zzenVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zziy(this.zzf, this.zzg, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziy) create((vd) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (r9.zzc(r1, r8) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzja zzjaVar;
        zzsc zzscVar;
        zzcg zzcgVar;
        zzja zzjaVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.zze;
        if (i2 != 0) {
            if (i2 != 1) {
                ResultKt.throwOnFailure(obj);
                if (i2 != 2) {
                    if (i2 == 3) {
                    }
                    this.zzg.zza();
                    return Unit.INSTANCE;
                }
                Boxing.boxInt(this.zzf.zzA().hashCode());
                r rVarZzA = this.zzf.zzA();
                this.zze = 3;
                if (rVarZzA.await(this) != coroutine_suspended) {
                }
                return coroutine_suspended;
                zzcb zzcbVarZzm = this.zzf.zzm();
                zzje zzjeVar = zzje.zzc;
                this.zze = 4;
            } else {
                zzcgVar = (zzcg) this.zzd;
                zzscVar = (zzsc) this.zzc;
                zzjaVar = (zzja) this.zzb;
                zzjaVar2 = (zzja) this.zza;
                ResultKt.throwOnFailure(obj);
            }
        } else {
            ResultKt.throwOnFailure(obj);
            zzjaVar = this.zzf;
            zzsc zzscVar2 = zzjaVar.zzf;
            if (zzscVar2 == null) {
                zzscVar2 = null;
            }
            zzsc zzscVar3 = this.zzf.zzf;
            if (zzscVar3 == null) {
                zzscVar3 = null;
            }
            zzcg zzcgVar2 = new zzcg(zzscVar3.zzf());
            zzja zzjaVar3 = this.zzf;
            this.zza = zzjaVar;
            this.zzb = zzjaVar;
            this.zzc = zzscVar2;
            this.zzd = zzcgVar2;
            this.zze = 1;
            Object objZzw = zzjaVar3.zzw(this);
            if (objZzw != coroutine_suspended) {
                zzscVar = zzscVar2;
                obj = objZzw;
                zzcgVar = zzcgVar2;
                zzjaVar2 = zzjaVar;
            }
            return coroutine_suspended;
        }
        zzjaVar2.zzb = zzjaVar.zzC(zzscVar, zzcgVar, (WebView) obj);
        Boxing.boxInt(this.zzf.zzA().hashCode());
        this.zzf.zzh.zzd();
        this.zzf.zzh.zze();
        zzja zzjaVar4 = this.zzf;
        zzsc zzscVar4 = zzjaVar4.zzf;
        if (zzscVar4 == null) {
            zzscVar4 = null;
        }
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = 2;
        if (zzjaVar4.zzE(zzscVar4, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
