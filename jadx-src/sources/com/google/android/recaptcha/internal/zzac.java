package com.google.android.recaptcha.internal;

import GJW.vd;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzac extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzae zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzac(zzae zzaeVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzaeVar;
        this.zzd = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzac(this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzac) create((vd) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r7 != r0) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzy zzyVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        zzen zzenVar = this.zzb;
        try {
        } catch (Exception e2) {
            zzenVar.zzb(new zzbd(zzbb.zzb, zzba.zzaa, e2.getMessage()));
            zzae zzaeVar = this.zzc;
            this.zza = zzaeVar;
            int i2 = 2;
            this.zzb = 2;
            if (e2 instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) e2).getErrorCode();
                if (errorCode != -100) {
                    if (errorCode != -12) {
                        if (errorCode != -3) {
                            if (errorCode != -2) {
                                if (errorCode != -1) {
                                    switch (errorCode) {
                                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                                            i2 = 54;
                                            break;
                                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                                            i2 = 53;
                                            break;
                                        case -17:
                                            i2 = 52;
                                            break;
                                        case -16:
                                            i2 = 43;
                                            break;
                                        case -15:
                                            i2 = 42;
                                            break;
                                        case -14:
                                            i2 = 41;
                                            break;
                                        default:
                                            switch (errorCode) {
                                                case -9:
                                                    i2 = 36;
                                                    break;
                                                case -8:
                                                    i2 = 35;
                                                    break;
                                                case -7:
                                                    i2 = 34;
                                                    break;
                                                case -6:
                                                    i2 = 33;
                                                    break;
                                                case -5:
                                                    i2 = 32;
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    i2 = 28;
                                }
                            } else {
                                i2 = 29;
                            }
                        } else {
                            i2 = 30;
                        }
                    } else {
                        i2 = 39;
                    }
                } else {
                    i2 = 44;
                }
            } else {
                i2 = 45;
            }
            zztd zztdVarZzf = zzte.zzf();
            zztdVarZzf.zzq(i2);
            zztdVarZzf.zzr(15);
            obj = zztdVarZzf.zzk();
            if (obj != coroutine_suspended) {
                zzyVar = zzaeVar;
            }
            return coroutine_suspended;
        }
        if (zzenVar != 0) {
            if (zzenVar != 1) {
                zzyVar = (zzy) this.zza;
                ResultKt.throwOnFailure(obj);
                int iZza = zzyVar.zza();
                zztd zztdVar = (zztd) ((zzte) obj).zzr();
                zztdVar.zzf(zzyVar.zza());
                return new zzw(iZza, (zzte) zztdVar.zzk());
            }
            zzen zzenVar2 = (zzen) this.zza;
            ResultKt.throwOnFailure(obj);
            zzenVar = zzenVar2;
        } else {
            ResultKt.throwOnFailure(obj);
            zzen zzenVarZzb = zzz.zzb(this.zzc, this.zzd);
            zzae zzaeVar2 = this.zzc;
            zzan zzanVar = zzaeVar2.zzc;
            String str = zzaeVar2.zze;
            this.zza = zzenVarZzb;
            this.zzb = 1;
            obj = zzanVar.zzc(str, this);
            zzenVar = zzenVarZzb;
        }
        zzenVar.zza();
        zzae zzaeVar3 = this.zzc;
        zztf zztfVarZzf = zzti.zzf();
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzw((String) obj);
        zztfVarZzf.zzf((zzth) zztgVarZzf.zzk());
        return zzz.zza(zzaeVar3, (zzti) zztfVarZzf.zzk());
    }
}
