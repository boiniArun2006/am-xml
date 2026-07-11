package com.google.android.recaptcha.internal;

import GJW.C;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.UUID;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzdc implements RecaptchaClient, RecaptchaTasksClient {
    private static final Regex zza = new Regex("^[a-zA-Z0-9/_]{0,100}$");
    private final zzcn zzb;
    private final String zzc;
    private final zzek zzd;
    private final zzbi zze;

    public zzdc(zzcn zzcnVar, String str, zzbi zzbiVar, zzek zzekVar) {
        this.zzb = zzcnVar;
        this.zzc = str;
        this.zze = zzbiVar;
        this.zzd = zzekVar;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzas.zza(C.rl(this.zze.zzb(), null, null, new zzda(this, recaptchaAction, 10000L, null), 3, null));
    }

    public final String zzd() {
        return this.zzc;
    }

    public static final /* synthetic */ void zze(zzdc zzdcVar, long j2, RecaptchaAction recaptchaAction) throws zzbd {
        zzbd zzbdVar = !zza.matches(recaptchaAction.getAction()) ? new zzbd(zzbb.zzg, zzba.zzh, null) : null;
        if (j2 < 5000) {
            zzbdVar = new zzbd(zzbb.zzb, zzba.zzI, null);
        }
        if (zzbdVar != null) {
            throw zzbdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(RecaptchaAction recaptchaAction, long j2, Continuation continuation) {
        zzcy zzcyVar;
        String string;
        zzbd zzbdVar;
        if (continuation instanceof zzcy) {
            zzcyVar = (zzcy) continuation;
            int i2 = zzcyVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcyVar.zzc = i2 - Integer.MIN_VALUE;
            } else {
                zzcyVar = new zzcy(this, continuation);
            }
        }
        Object objZzg = zzcyVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzcyVar.zzc;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objZzg);
            try {
                string = UUID.randomUUID().toString();
            } catch (zzbd e2) {
                e = e2;
                zzbdVar = e;
                Result.Companion companion = Result.INSTANCE;
                return Result.m313constructorimpl(ResultKt.createFailure(zzbdVar.zzc()));
            }
            try {
                Function2 zzczVar = new zzcz(this, j2, recaptchaAction, string, null);
                zzcyVar.zzc = 1;
                objZzg = zzg(string, zzczVar, zzcyVar);
                if (objZzg == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (zzbd e3) {
                e = e3;
                zzbdVar = e;
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m313constructorimpl(ResultKt.createFailure(zzbdVar.zzc()));
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                ResultKt.throwOnFailure(objZzg);
            } catch (zzbd e4) {
                zzbdVar = e4;
                Result.Companion companion22 = Result.INSTANCE;
                return Result.m313constructorimpl(ResultKt.createFailure(zzbdVar.zzc()));
            }
        }
        return ((Result) objZzg).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(String str, Function2 function2, Continuation continuation) throws zzbd {
        zzdb zzdbVar;
        if (continuation instanceof zzdb) {
            zzdbVar = (zzdb) continuation;
            int i2 = zzdbVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzdbVar.zzc = i2 - Integer.MIN_VALUE;
            } else {
                zzdbVar = new zzdb(this, continuation);
            }
        }
        Object objInvoke = zzdbVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzdbVar.zzc;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                zzek zzekVarZza = this.zzd.zza();
                zzekVarZza.zzc(str);
                zzen zzenVarZzf = zzekVarZza.zzf(9);
                zzdbVar.zzd = zzenVarZzf;
                zzdbVar.zzc = 1;
                objInvoke = function2.invoke(zzekVarZza, zzdbVar);
                str = zzenVarZzf;
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zzen zzenVar = zzdbVar.zzd;
                ResultKt.throwOnFailure(objInvoke);
                str = zzenVar;
            }
            str.zza();
            return objInvoke;
        } catch (zzbd e2) {
            str.zzb(e2);
            throw e2;
        } catch (Exception e3) {
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzX, e3.getMessage());
            str.zzb(zzbdVar);
            throw zzbdVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo184execute0E7RQCE(RecaptchaAction recaptchaAction, long j2, Continuation<? super Result<String>> continuation) {
        zzcw zzcwVar;
        if (continuation instanceof zzcw) {
            zzcwVar = (zzcw) continuation;
            int i2 = zzcwVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcwVar.zzc = i2 - Integer.MIN_VALUE;
            } else {
                zzcwVar = new zzcw(this, continuation);
            }
        }
        Object obj = zzcwVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzcwVar.zzc;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        zzcwVar.zzc = 1;
        Object objZzf = zzf(recaptchaAction, j2, zzcwVar);
        return objZzf == coroutine_suspended ? coroutine_suspended : objZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo185executegIAlus(RecaptchaAction recaptchaAction, Continuation<? super Result<String>> continuation) {
        zzcx zzcxVar;
        if (continuation instanceof zzcx) {
            zzcxVar = (zzcx) continuation;
            int i2 = zzcxVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcxVar.zzc = i2 - Integer.MIN_VALUE;
            } else {
                zzcxVar = new zzcx(this, continuation);
            }
        }
        Object obj = zzcxVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzcxVar.zzc;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        zzcxVar.zzc = 1;
        Object objMo184execute0E7RQCE = mo184execute0E7RQCE(recaptchaAction, 10000L, zzcxVar);
        return objMo184execute0E7RQCE == coroutine_suspended ? coroutine_suspended : objMo184execute0E7RQCE;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j2) {
        return zzas.zza(C.rl(this.zze.zzb(), null, null, new zzda(this, recaptchaAction, j2, null), 3, null));
    }
}
