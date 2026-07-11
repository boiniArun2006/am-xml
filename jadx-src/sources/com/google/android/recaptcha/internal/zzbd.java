package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzbd extends Exception {
    public static final /* synthetic */ int zza = 0;
    private static final Map zzb;
    private final zzbb zzc;
    private final zzba zzd;
    private final String zze;
    private final Map zzf;

    public final zzba zza() {
        return this.zzd;
    }

    public final zzbb zzb() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zze;
    }

    static {
        Pair pair = TuplesKt.to(zztv.JS_NETWORK_ERROR, new zzbd(zzbb.zzc, zzba.zzd, null));
        zztv zztvVar = zztv.JS_INTERNAL_ERROR;
        zzbb zzbbVar = zzbb.zzb;
        zzb = MapsKt.mapOf(pair, TuplesKt.to(zztvVar, new zzbd(zzbbVar, zzba.zzc, null)), TuplesKt.to(zztv.JS_INVALID_SITE_KEY, new zzbd(zzbb.zzd, zzba.zze, null)), TuplesKt.to(zztv.JS_INVALID_SITE_KEY_TYPE, new zzbd(zzbb.zze, zzba.zzf, null)), TuplesKt.to(zztv.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzbd(zzbb.zzf, zzba.zzg, null)), TuplesKt.to(zztv.JS_INVALID_ACTION, new zzbd(zzbb.zzg, zzba.zzh, null)), TuplesKt.to(zztv.JS_PROGRAM_ERROR, new zzbd(zzbbVar, zzba.zzj, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RecaptchaException zzc() {
        zzba zzbaVar = this.zzd;
        int i2 = 2;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (Intrinsics.areEqual(zzbaVar, zzba.zzI)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, str, i2, objArr5 == true ? 1 : 0);
        }
        if (Intrinsics.areEqual(zzbaVar, zzba.zzao)) {
            return new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, objArr4 == true ? 1 : 0, i2, objArr3 == true ? 1 : 0);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0) : recaptchaException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzbd(zzbb zzbbVar, zzba zzbaVar, String str) {
        this.zzc = zzbbVar;
        this.zzd = zzbaVar;
        this.zze = str;
        zzbb zzbbVar2 = zzbb.zzc;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        int i2 = 2;
        this.zzf = MapsKt.mapOf(TuplesKt.to(zzbbVar2, new RecaptchaException(recaptchaErrorCode, null, i2, 0 == true ? 1 : 0)), TuplesKt.to(zzbb.zzh, new RecaptchaException(recaptchaErrorCode, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0)), TuplesKt.to(zzbb.zzi, new RecaptchaException(recaptchaErrorCode, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0)), TuplesKt.to(zzbb.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0)), TuplesKt.to(zzbb.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0)), TuplesKt.to(zzbb.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0)), TuplesKt.to(zzbb.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0)), TuplesKt.to(zzbb.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0)), TuplesKt.to(zzbb.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0)));
    }
}
