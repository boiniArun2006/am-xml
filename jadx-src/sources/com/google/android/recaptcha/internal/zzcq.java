package com.google.android.recaptcha.internal;

import GJW.C;
import android.app.Application;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j2, Continuation continuation) throws RecaptchaException, TimeoutCancellationException, ApiException {
        return zzcv.zzh(zza(application), str, j2, null, null, null, continuation, 28, null);
    }

    public static final Task zzc(Application application, String str, long j2) throws RecaptchaException, TimeoutCancellationException, ApiException {
        return zzas.zza(C.rl(zza(application).zzd().zza(), null, null, new zzco(application, str, j2, null), 3, null));
    }

    public static final Object zzd(Application application, String str, Continuation continuation) throws RecaptchaException, ApiException {
        zzcv zzcvVarZza = zza(application);
        return zzcv.zzh(zzcvVarZza, str, 0L, null, zzcvVarZza.zzf, zzch.zzb, continuation, 2, null);
    }

    public static final Task zze(Application application, String str) throws RecaptchaException, ApiException {
        return zzas.zza(C.rl(zza(application).zzd().zza(), null, null, new zzcp(application, str, null), 3, null));
    }
}
