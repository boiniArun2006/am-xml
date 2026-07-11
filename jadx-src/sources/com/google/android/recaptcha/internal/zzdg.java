package com.google.android.recaptcha.internal;

import GJW.Qik;
import GJW.vd;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzdg extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdg(zzdt zzdtVar, String str, long j2, zzsp zzspVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j2;
        this.zzf = zzspVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((vd) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzen zzenVar;
        Exception e2;
        TimeoutCancellationException e3;
        zzbd e4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (zzbd e5) {
                e4 = e5;
                zzbd zzbdVarZzs = this.zzc.zzs(e4, e4);
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (TimeoutCancellationException e6) {
                e3 = e6;
                zzbd zzbdVarZzs2 = this.zzc.zzs(e3, new zzbd(zzbb.zzc, zzba.zzb, e3.getMessage()));
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            } catch (Exception e7) {
                e2 = e7;
                zzbd zzbdVarZzs3 = this.zzc.zzs(e2, new zzbd(zzbb.zzc, zzba.zzZ, e2.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            zzen zzenVarZzf = this.zzc.zzu(this.zzd).zzf(28);
            try {
                long j2 = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzenVarZzf, null);
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objT = Qik.t(j2, zzdfVar, this);
                if (objT != coroutine_suspended) {
                    zzenVar = zzenVarZzf;
                    obj = objT;
                } else {
                    return coroutine_suspended;
                }
            } catch (zzbd e8) {
                zzenVar = zzenVarZzf;
                e4 = e8;
                zzbd zzbdVarZzs4 = this.zzc.zzs(e4, e4);
                zzenVar.zzb(zzbdVarZzs4);
                throw zzbdVarZzs4;
            } catch (TimeoutCancellationException e9) {
                zzenVar = zzenVarZzf;
                e3 = e9;
                zzbd zzbdVarZzs22 = this.zzc.zzs(e3, new zzbd(zzbb.zzc, zzba.zzb, e3.getMessage()));
                zzenVar.zzb(zzbdVarZzs22);
                throw zzbdVarZzs22;
            } catch (Exception e10) {
                zzenVar = zzenVarZzf;
                e2 = e10;
                zzbd zzbdVarZzs32 = this.zzc.zzs(e2, new zzbd(zzbb.zzc, zzba.zzZ, e2.getMessage()));
                zzenVar.zzb(zzbdVarZzs32);
                throw zzbdVarZzs32;
            }
        }
        return (zzsr) obj;
    }
}
