package com.google.android.recaptcha.internal;

import android.app.Application;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.api.ApiException;
import com.google.android.recaptcha.RecaptchaException;
import java.util.UUID;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;
import yB.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcv {
    private final Application zza;
    private zzdc zzc;
    private final zzl zze;
    private final yB.j zzb = CN3.rl(false, 1, null);
    private final String zzd = UUID.randomUUID().toString();
    private zzbi zzf = new zzbi();

    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzcv(Application application) {
        this.zza = application;
        int i2 = 1;
        this.zze = new zzl(null, i2, 0 == true ? 1 : 0);
        int i3 = zzav.zza;
        zzaw[] zzawVarArr = {new zzaw(zzaz.class.getName().hashCode(), new zzaz(null, 1, null)), new zzaw(zzfu.class.getName().hashCode(), new zzfu()), new zzaw(zzbe.class.getName().hashCode(), new zzbe()), new zzaw(zzjd.class.getName().hashCode(), new zzjd()), new zzaw(zzbr.class.getName().hashCode(), new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(zzex.class.getName().hashCode(), new zzex(0 == true ? 1 : 0, i2, 0 == true ? 1 : 0)), new zzaw(zzfk.class.getName().hashCode(), new zzfk(true)), new zzaw(Application.class.getName().hashCode(), application), new zzaw(zzbf.class.getName().hashCode(), new zzbf(application)), new zzaw(zzfj.class.getName().hashCode(), new zzfj()), new zzaw(zzaq.class.getName().hashCode(), new zzbm(application)), new zzaw(zzey.class.getName().hashCode(), new zzfa()), new zzaw(zzff.class.getName().hashCode(), new zzff())};
        for (int i5 = 0; i5 < 13; i5++) {
            zzaw zzawVar = zzawVarArr[i5];
            if (!zzav.zzc.containsKey(Integer.valueOf(zzawVar.zza()))) {
                zzav.zzc.put(Integer.valueOf(zzawVar.zza()), zzawVar);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcvVar, String str) throws zzbd {
        zzdc zzdcVar = zzcvVar.zzc;
        if (zzdcVar == null) {
            return null;
        }
        if (Intrinsics.areEqual(zzdcVar.zzd(), str)) {
            return zzdcVar;
        }
        throw new zzbd(zzbb.zzd, zzba.zzam, null);
    }

    public static final /* synthetic */ void zzc(zzcv zzcvVar, long j2) throws zzbd {
        if (j2 < 5000) {
            throw new zzbd(zzbb.zzj, zzba.zzI, null);
        }
        if (ContextCompat.checkSelfPermission(zzcvVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzbd(zzbb.zzc, zzba.zzao, null);
        }
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcvVar, String str, zzbi zzbiVar, zzch zzchVar, zzek zzekVar) {
        zzdt zzdtVar = new zzdt(str, zzbiVar, zzekVar, zzcvVar.zze);
        return Intrinsics.areEqual(zzchVar, zzch.zza) ? new zzef(zzdtVar) : new zzec(zzdtVar, zzbiVar, zzekVar, new zzbo());
    }

    public static /* synthetic */ Object zzh(zzcv zzcvVar, String str, long j2, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, Continuation continuation, int i2, Object obj) throws RecaptchaException, TimeoutCancellationException, ApiException {
        if ((i2 & 8) != 0) {
            zzbiVar = zzcvVar.zzf;
        }
        zzbi zzbiVar2 = zzbiVar;
        if ((i2 & 16) != 0) {
            zzchVar = zzch.zza;
        }
        zzch zzchVar2 = zzchVar;
        if ((i2 & 2) != 0) {
            j2 = 10000;
        }
        return zzcvVar.zzg(str, j2, null, zzbiVar2, zzchVar2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, int i2, Function2 function2, Continuation continuation) throws RecaptchaException {
        zzcu zzcuVar;
        Exception e2;
        zzen zzenVar;
        zzbd e3;
        if (continuation instanceof zzcu) {
            zzcuVar = (zzcu) continuation;
            int i3 = zzcuVar.zzc;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zzcuVar.zzc = i3 - Integer.MIN_VALUE;
            } else {
                zzcuVar = new zzcu(this, continuation);
            }
        }
        Object objInvoke = zzcuVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = zzcuVar.zzc;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            zzek zzekVarZzk = zzk(str, this.zzf, i2);
            zzen zzenVarZzf = zzekVarZzk.zzf(6);
            try {
                zzcuVar.zzd = zzenVarZzf;
                zzcuVar.zzc = 1;
                objInvoke = function2.invoke(zzekVarZzk, zzcuVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zzenVar = zzenVarZzf;
            } catch (zzbd e4) {
                e3 = e4;
                zzenVar = zzenVarZzf;
                zzenVar.zzb(e3);
                throw e3.zzc();
            } catch (Exception e5) {
                e2 = e5;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zza, e2.getMessage());
                zzenVar.zzb(zzbdVar);
                throw zzbdVar.zzc();
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzenVar = zzcuVar.zzd;
            try {
                ResultKt.throwOnFailure(objInvoke);
            } catch (zzbd e6) {
                e3 = e6;
                zzenVar.zzb(e3);
                throw e3.zzc();
            } catch (Exception e7) {
                e2 = e7;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zza, e2.getMessage());
                zzenVar.zzb(zzbdVar2);
                throw zzbdVar2.zzc();
            }
        }
        zzenVar.zza();
        return objInvoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(String str, long j2, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, Continuation continuation) throws Throwable {
        zzcs zzcsVar;
        zzbi zzbiVar2;
        zzch zzchVar2;
        long j3;
        zzcv zzcvVar;
        String str2;
        yB.j jVar;
        yB.j jVar2;
        if (continuation instanceof zzcs) {
            zzcsVar = (zzcs) continuation;
            int i2 = zzcsVar.zzg;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcsVar.zzg = i2 - Integer.MIN_VALUE;
            } else {
                zzcsVar = new zzcs(this, continuation);
            }
        }
        Object objZzj = zzcsVar.zze;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzcsVar.zzg;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objZzj);
                yB.j jVar3 = this.zzb;
                zzcsVar.zza = this;
                zzcsVar.zzh = str;
                zzcsVar.zzb = null;
                zzcsVar.zzj = zzbiVar;
                zzcsVar.zzi = zzchVar;
                zzcsVar.zzc = jVar3;
                zzcsVar.zzd = j2;
                zzcsVar.zzg = 1;
                if (jVar3.Z(null, zzcsVar) != coroutine_suspended) {
                    zzbiVar2 = zzbiVar;
                    zzchVar2 = zzchVar;
                    j3 = j2;
                    zzcvVar = this;
                    str2 = str;
                    jVar = jVar3;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar2 = (yB.j) zzcsVar.zza;
                try {
                    ResultKt.throwOnFailure(objZzj);
                    zzdc zzdcVar = (zzdc) objZzj;
                    jVar2.T(null);
                    return zzdcVar;
                } catch (Throwable th) {
                    th = th;
                    jVar2.T(null);
                    throw th;
                }
            }
            long j4 = zzcsVar.zzd;
            yB.j jVar4 = (yB.j) zzcsVar.zzc;
            zzch zzchVar3 = zzcsVar.zzi;
            zzbi zzbiVar3 = zzcsVar.zzj;
            String str3 = zzcsVar.zzh;
            zzcv zzcvVar2 = (zzcv) zzcsVar.zza;
            ResultKt.throwOnFailure(objZzj);
            zzchVar2 = zzchVar3;
            zzbiVar2 = zzbiVar3;
            str2 = str3;
            zzcvVar = zzcvVar2;
            j3 = j4;
            jVar = jVar4;
            int i5 = Intrinsics.areEqual(zzchVar2, zzch.zza) ? 3 : Intrinsics.areEqual(zzchVar2, zzch.zzb) ? 4 : 2;
            zzct zzctVar = new zzct(zzcvVar, str2, j3, null, zzbiVar2, zzchVar2, null);
            zzcsVar.zza = jVar;
            zzcsVar.zzh = null;
            zzcsVar.zzb = null;
            zzcsVar.zzj = null;
            zzcsVar.zzi = null;
            zzcsVar.zzc = null;
            zzcsVar.zzg = 2;
            objZzj = zzcvVar.zzj(str2, i5, zzctVar, zzcsVar);
            if (objZzj != coroutine_suspended) {
                jVar2 = jVar;
                zzdc zzdcVar2 = (zzdc) objZzj;
                jVar2.T(null);
                return zzdcVar2;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            jVar2 = jVar;
            jVar2.T(null);
            throw th;
        }
    }

    private final zzek zzk(String str, zzbi zzbiVar, int i2) {
        String string = UUID.randomUUID().toString();
        int i3 = zzav.zza;
        zzes zzesVar = new zzes(this.zza, new zzeu(((zzbr) LazyKt.lazy(zzcr.zza).getValue()).zzc()), zzbiVar.zza());
        zzek zzekVar = new zzek(str, this.zzd, string, i2, this.zza, zzesVar, null);
        zzekVar.zzc(string);
        return zzekVar;
    }
}
