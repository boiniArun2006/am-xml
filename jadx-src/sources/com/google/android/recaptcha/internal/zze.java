package com.google.android.recaptcha.internal;

import GJW.Qik;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zze {
    private boolean zza;

    protected zzen zza(String str) {
        throw null;
    }

    protected zzen zzb() {
        throw null;
    }

    protected abstract Object zzd(String str, Continuation continuation);

    protected abstract Object zzf(String str, Continuation continuation) throws zzbd;

    protected abstract Object zzh(zzsc zzscVar, Continuation continuation) throws zzbd;

    protected void zzk(zzsr zzsrVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dc, code lost:
    
        if (r0 != r5) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, long j2, Continuation continuation) throws zzbd {
        zza zzaVar;
        zzen zzenVarZza;
        Exception exc;
        long j3;
        zzen zzenVar;
        zze zzeVar;
        zze zzeVar2;
        String str2;
        zze zzeVar3;
        String str3;
        long j4;
        Exception e2;
        String str4 = str;
        long j5 = j2;
        if (continuation instanceof zza) {
            zzaVar = (zza) continuation;
            int i2 = zzaVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzaVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzaVar = new zza(this, continuation);
            }
        }
        zza zzaVar2 = zzaVar;
        Object objT = zzaVar2.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzaVar2.zze;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            zzenVarZza = zza(str);
            try {
                zzb zzbVar = new zzb(this, str4, null);
                zzaVar2.zza = this;
                zzaVar2.zzf = str4;
                zzaVar2.zzg = zzenVarZza;
                zzaVar2.zzb = j5;
                zzaVar2.zze = 1;
                objT = Qik.t(j5, zzbVar, zzaVar2);
                if (objT != coroutine_suspended) {
                    zzeVar2 = this;
                }
            } catch (Exception e3) {
                exc = e3;
                j3 = j5;
                zzenVar = zzenVarZza;
                zzeVar = this;
                zzbd zzbdVarZza = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
                if (zzenVar != null) {
                }
                zzaVar2.zza = zzeVar;
                zzaVar2.zzf = str4;
                zzaVar2.zzg = null;
                zzaVar2.zze = 2;
                str2 = str4;
                if (zzeVar.zzi(str2, j3, exc, zzaVar2) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            long j6 = zzaVar2.zzb;
            zzenVar = zzaVar2.zzg;
            String str5 = zzaVar2.zzf;
            zzeVar2 = (zze) zzaVar2.zza;
            try {
                ResultKt.throwOnFailure(objT);
                zzenVarZza = zzenVar;
                j5 = j6;
                str4 = str5;
            } catch (Exception e4) {
                e2 = e4;
                j4 = j6;
                str4 = str5;
                zzeVar = zzeVar2;
                j3 = j4;
                exc = e2;
                zzbd zzbdVarZza2 = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
                if (zzenVar != null) {
                }
                zzaVar2.zza = zzeVar;
                zzaVar2.zzf = str4;
                zzaVar2.zzg = null;
                zzaVar2.zze = 2;
                str2 = str4;
                if (zzeVar.zzi(str2, j3, exc, zzaVar2) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objT);
                return Result.m313constructorimpl(objT);
            }
            str3 = zzaVar2.zzf;
            zzeVar3 = (zze) zzaVar2.zza;
            ResultKt.throwOnFailure(objT);
            Result.Companion companion = Result.INSTANCE;
            zzaVar2.zza = null;
            zzaVar2.zzf = null;
            zzaVar2.zze = 3;
            objT = zzeVar3.zzd(str3, zzaVar2);
        }
        try {
            Object value = ((Result) objT).getValue();
            ResultKt.throwOnFailure(value);
            zzsi zzsiVar = (zzsi) value;
            if (zzenVarZza != null) {
                zzenVarZza.zza();
            }
            return Result.m313constructorimpl(zzsiVar);
        } catch (Exception e5) {
            e2 = e5;
            j4 = j5;
            zzenVar = zzenVarZza;
            zzeVar = zzeVar2;
            j3 = j4;
            exc = e2;
            zzbd zzbdVarZza22 = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVarZza22);
            }
            zzaVar2.zza = zzeVar;
            zzaVar2.zzf = str4;
            zzaVar2.zzg = null;
            zzaVar2.zze = 2;
            str2 = str4;
            if (zzeVar.zzi(str2, j3, exc, zzaVar2) != coroutine_suspended) {
                zzeVar3 = zzeVar;
                str3 = str2;
                Result.Companion companion2 = Result.INSTANCE;
                zzaVar2.zza = null;
                zzaVar2.zzf = null;
                zzaVar2.zze = 3;
                objT = zzeVar3.zzd(str3, zzaVar2);
            }
            return coroutine_suspended;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9 A[PHI: r8 r9 r11
      0x00a9: PHI (r8v12 com.google.android.recaptcha.internal.zzen) = (r8v8 com.google.android.recaptcha.internal.zzen), (r8v19 com.google.android.recaptcha.internal.zzen) binds: [B:37:0x00a7, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r9v6 com.google.android.recaptcha.internal.zze) = (r9v3 com.google.android.recaptcha.internal.zze), (r9v11 com.google.android.recaptcha.internal.zze) binds: [B:37:0x00a7, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r11v8 java.lang.Object) = (r11v5 java.lang.Object), (r11v1 java.lang.Object) binds: [B:37:0x00a7, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(long j2, zzsc zzscVar, Continuation continuation) throws zzbd {
        zzc zzcVar;
        Exception e2;
        zze zzeVar;
        zzen zzenVar;
        zzbd zzbdVar;
        zzbd zzbdVar2;
        if (continuation instanceof zzc) {
            zzcVar = (zzc) continuation;
            int i2 = zzcVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcVar.zzd = i2 - Integer.MIN_VALUE;
            } else {
                zzcVar = new zzc(this, continuation);
            }
        }
        Object objZzj = zzcVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzcVar.zzd;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objZzj);
            zzen zzenVarZzb = zzb();
            if (this.zza) {
                zzenVarZzb.zza();
                Result.Companion companion = Result.INSTANCE;
                return Result.m313constructorimpl(Unit.INSTANCE);
            }
            try {
                zzd zzdVar = new zzd(this, zzscVar, null);
                zzcVar.zza = this;
                zzcVar.zze = zzenVarZzb;
                zzcVar.zzd = 1;
                Object objT = Qik.t(j2, zzdVar, zzcVar);
                if (objT != coroutine_suspended) {
                    objZzj = objT;
                    zzenVar = zzenVarZzb;
                    zzeVar = this;
                }
            } catch (Exception e3) {
                e2 = e3;
                zzeVar = this;
                zzenVar = zzenVarZzb;
                zzeVar.zza = false;
                zzcVar.zza = zzeVar;
                zzcVar.zze = zzenVar;
                zzcVar.zzd = 2;
                objZzj = zzeVar.zzj(e2, zzcVar);
                if (objZzj != coroutine_suspended) {
                    zzbdVar = (zzbd) objZzj;
                    if (zzenVar != null) {
                    }
                    zzcVar.zza = zzbdVar;
                    zzcVar.zze = null;
                    zzcVar.zzd = 3;
                    if (zzeVar.zzg(zzbdVar, zzcVar) != coroutine_suspended) {
                    }
                }
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zzbdVar2 = (zzbd) zzcVar.zza;
                ResultKt.throwOnFailure(objZzj);
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m313constructorimpl(ResultKt.createFailure(zzbdVar2));
            }
            zzenVar = zzcVar.zze;
            zzeVar = (zze) zzcVar.zza;
            ResultKt.throwOnFailure(objZzj);
            zzbdVar = (zzbd) objZzj;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            zzcVar.zza = zzbdVar;
            zzcVar.zze = null;
            zzcVar.zzd = 3;
            if (zzeVar.zzg(zzbdVar, zzcVar) != coroutine_suspended) {
                zzbdVar2 = zzbdVar;
                Result.Companion companion22 = Result.INSTANCE;
                return Result.m313constructorimpl(ResultKt.createFailure(zzbdVar2));
            }
            return coroutine_suspended;
        }
        zzenVar = zzcVar.zze;
        zzeVar = (zze) zzcVar.zza;
        try {
            ResultKt.throwOnFailure(objZzj);
        } catch (Exception e4) {
            e2 = e4;
            zzeVar.zza = false;
            zzcVar.zza = zzeVar;
            zzcVar.zze = zzenVar;
            zzcVar.zzd = 2;
            objZzj = zzeVar.zzj(e2, zzcVar);
            if (objZzj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        ResultKt.throwOnFailure(((Result) objZzj).getValue());
        Unit unit = Unit.INSTANCE;
        zzeVar.zza = true;
        if (zzenVar != null) {
            zzenVar.zza();
        }
        return Result.m313constructorimpl(unit);
    }

    protected Object zzg(zzbd zzbdVar, Continuation continuation) {
        return Unit.INSTANCE;
    }

    protected Object zzi(String str, long j2, Exception exc, Continuation continuation) {
        return Unit.INSTANCE;
    }

    protected Object zzj(Exception exc, Continuation continuation) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }
}
