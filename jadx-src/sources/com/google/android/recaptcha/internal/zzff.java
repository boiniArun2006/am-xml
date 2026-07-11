package com.google.android.recaptcha.internal;

import GJW.Lu;
import com.google.android.recaptcha.RecaptchaException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzff {
    private final Lazy zza;
    private final Lazy zzb;
    private final Lazy zzc;

    public final Object zzd(zzsc zzscVar, zzek zzekVar, Continuation continuation) throws zzbd {
        return zze(this, zzscVar, zzekVar, continuation);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    public final Object zzc(String str, zzto zztoVar, Continuation continuation) throws RecaptchaException {
        return Lu.J2(new zzfb(this, str, zztoVar, null), continuation);
    }

    public zzff() {
        int i2 = zzav.zza;
        this.zza = LazyKt.lazy(zzfc.zza);
        this.zzb = LazyKt.lazy(zzfd.zza);
        this.zzc = LazyKt.lazy(zzfe.zza);
    }

    static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, Continuation continuation) throws Exception {
        String strZza;
        try {
            String strZzl = zzscVar.zzl();
            String strZzM = zzscVar.zzM();
            zzaq zzaqVarZzf = zzffVar.zzf();
            String str = null;
            if (zzaqVarZzf != null && zzaqVarZzf.zzd(strZzM)) {
                zzen zzenVarZzf = zzekVar.zzf(25);
                try {
                    strZza = zzffVar.zzf().zza(strZzM);
                } catch (Exception e2) {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzR, e2.getMessage()));
                }
                if (strZza != null) {
                    zzenVarZzf.zza();
                    str = strZza;
                } else {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
                }
            }
            if (str == null) {
                zzaq zzaqVarZzf2 = zzffVar.zzf();
                if (zzaqVarZzf2 != null) {
                    zzaqVarZzf2.zzb();
                }
                zzen zzenVarZzf2 = zzekVar.zzf(23);
                try {
                    String strZzb = zzffVar.zzg().zzb(strZzl);
                    zzenVarZzf2.zza();
                    zzen zzenVarZzf3 = zzekVar.zzf(24);
                    try {
                        zzaq zzaqVarZzf3 = zzffVar.zzf();
                        if (zzaqVarZzf3 != null) {
                            zzaqVarZzf3.zzc(strZzM, strZzb);
                        }
                        zzenVarZzf3.zza();
                    } catch (Exception e3) {
                        zzenVarZzf3.zzb(new zzbd(zzbb.zzk, zzba.zzT, e3.getMessage()));
                    }
                    str = strZzb;
                } catch (zzbd e4) {
                    zzenVarZzf2.zzb(e4);
                    throw e4;
                }
            }
            return StringsKt.replace$default(zzscVar.zzk(), "JAVASCRIPT_TAG", str, false, 4, (Object) null);
        } catch (Exception e5) {
            if (e5 instanceof zzbd) {
                throw e5;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e5.getMessage());
        }
    }
}
