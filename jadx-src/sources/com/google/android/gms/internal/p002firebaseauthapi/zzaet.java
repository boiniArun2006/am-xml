package com.google.android.gms.internal.p002firebaseauthapi;

import android.graphics.Trmy.yioUaKMByL;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzaet extends zzafl implements zzagf {
    private zzaen zza;
    private zzaeq zzb;
    private zzafq zzc;
    private final zzaeu zzd;
    private final Wre zze;
    private String zzf;

    @VisibleForTesting
    private zzaew zzg;

    zzaet(Wre wre, zzaeu zzaeuVar) {
        this(wre, zzaeuVar, null, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzagk zzagkVar, zzafn<zzagn> zzafnVar) {
        Preconditions.checkNotNull(zzagkVar);
        Preconditions.checkNotNull(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/createAuthUri", this.zzf), zzagkVar, zzafnVar, zzagn.class, zzaenVar.zza);
    }

    @VisibleForTesting
    private zzaet(Wre wre, zzaeu zzaeuVar, zzafq zzafqVar, zzaen zzaenVar, zzaeq zzaeqVar) {
        this.zze = wre;
        this.zzf = wre.ck().rl();
        this.zzd = (zzaeu) Preconditions.checkNotNull(zzaeuVar);
        zza(null, null, null);
        zzagd.zza(this.zzf, this);
    }

    @NonNull
    private final zzaew zzb() {
        if (this.zzg == null) {
            this.zzg = new zzaew(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzagm zzagmVar, zzafn<Void> zzafnVar) {
        Preconditions.checkNotNull(zzagmVar);
        Preconditions.checkNotNull(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/deleteAccount", this.zzf), zzagmVar, zzafnVar, Void.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzagp zzagpVar, zzafn<zzago> zzafnVar) {
        Preconditions.checkNotNull(zzagpVar);
        Preconditions.checkNotNull(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/emailLinkSignin", this.zzf), zzagpVar, zzafnVar, zzago.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzagr zzagrVar, zzafn<zzagq> zzafnVar) {
        Preconditions.checkNotNull(zzagrVar);
        Preconditions.checkNotNull(zzafnVar);
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzagrVar, zzafnVar, zzagq.class, zzaeqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzagt zzagtVar, zzafn<zzags> zzafnVar) {
        Preconditions.checkNotNull(zzagtVar);
        Preconditions.checkNotNull(zzafnVar);
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts/mfaSignIn:finalize", this.zzf), zzagtVar, zzafnVar, zzags.class, zzaeqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahb zzahbVar, zzafn<zzahn> zzafnVar) {
        Preconditions.checkNotNull(zzahbVar);
        Preconditions.checkNotNull(zzafnVar);
        zzafq zzafqVar = this.zzc;
        zzafm.zza(zzafqVar.zza("/token", this.zzf), zzahbVar, zzafnVar, zzahn.class, zzafqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaha zzahaVar, zzafn<zzahd> zzafnVar) {
        Preconditions.checkNotNull(zzahaVar);
        Preconditions.checkNotNull(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/getAccountInfo", this.zzf), zzahaVar, zzafnVar, zzahd.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahe zzaheVar, zzafn<zzahh> zzafnVar) {
        Preconditions.checkNotNull(zzaheVar);
        Preconditions.checkNotNull(zzafnVar);
        if (zzaheVar.zzb() != null) {
            zzb().zzb(zzaheVar.zzb().zze());
        }
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/getOobConfirmationCode", this.zzf), zzaheVar, zzafnVar, zzahh.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahg zzahgVar, zzafn<zzahj> zzafnVar) {
        Preconditions.checkNotNull(zzahgVar);
        Preconditions.checkNotNull(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/getRecaptchaParam", this.zzf), zzafnVar, zzahj.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahl zzahlVar, zzafn<zzahk> zzafnVar) {
        Preconditions.checkNotNull(zzahlVar);
        Preconditions.checkNotNull(zzafnVar);
        zzaeq zzaeqVar = this.zzb;
        String str = zzaeqVar.zza("/recaptchaConfig", this.zzf) + "&clientType=" + zzahlVar.zzb() + "&version=" + zzahlVar.zzc();
        if (!zzae.zzc(zzahlVar.zzd())) {
            str = str + "&tenantId=" + zzahlVar.zzd();
        }
        zzafm.zza(str, zzafnVar, zzahk.class, zzaeqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagf
    public final void zza() {
        zza(null, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahu zzahuVar, zzafn<zzahx> zzafnVar) {
        Preconditions.checkNotNull(zzahuVar);
        Preconditions.checkNotNull(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/resetPassword", this.zzf), zzahuVar, zzafnVar, zzahx.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahw zzahwVar, zzafn<zzahy> zzafnVar) {
        Preconditions.checkNotNull(zzahwVar);
        Preconditions.checkNotNull(zzafnVar);
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts:revokeToken", this.zzf), zzahwVar, zzafnVar, zzahy.class, zzaeqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaib zzaibVar, zzafn<zzaia> zzafnVar) {
        Preconditions.checkNotNull(zzaibVar);
        Preconditions.checkNotNull(zzafnVar);
        if (!TextUtils.isEmpty(zzaibVar.zzc())) {
            zzb().zzb(zzaibVar.zzc());
        }
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/sendVerificationCode", this.zzf), zzaibVar, zzafnVar, zzaia.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaid zzaidVar, zzafn<zzaic> zzafnVar) {
        Preconditions.checkNotNull(zzaidVar);
        Preconditions.checkNotNull(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/setAccountInfo", this.zzf), zzaidVar, zzafnVar, zzaic.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(@Nullable String str, zzafn<Void> zzafnVar) {
        Preconditions.checkNotNull(zzafnVar);
        zzb().zza(str);
        zzafnVar.zza((Void) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaie zzaieVar, zzafn<zzaih> zzafnVar) {
        Preconditions.checkNotNull(zzaieVar);
        Preconditions.checkNotNull(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/signupNewUser", this.zzf), zzaieVar, zzafnVar, zzaih.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaig zzaigVar, zzafn<zzaij> zzafnVar) {
        Preconditions.checkNotNull(zzaigVar);
        Preconditions.checkNotNull(zzafnVar);
        if (zzaigVar instanceof zzaik) {
            zzaik zzaikVar = (zzaik) zzaigVar;
            if (!TextUtils.isEmpty(zzaikVar.zzb())) {
                zzb().zzb(zzaikVar.zzb());
            }
        }
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts/mfaEnrollment:start", this.zzf), zzaigVar, zzafnVar, zzaij.class, zzaeqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaii zzaiiVar, zzafn<zzail> zzafnVar) {
        Preconditions.checkNotNull(zzaiiVar);
        Preconditions.checkNotNull(zzafnVar);
        if (!TextUtils.isEmpty(zzaiiVar.zzb())) {
            zzb().zzb(zzaiiVar.zzb());
        }
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts/mfaSignIn:start", this.zzf), zzaiiVar, zzafnVar, zzail.class, zzaeqVar.zza);
    }

    private final void zza(zzafq zzafqVar, zzaen zzaenVar, zzaeq zzaeqVar) {
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        String strZza = zzaga.zza("firebear.secureToken");
        if (TextUtils.isEmpty(strZza)) {
            strZza = zzagd.zzd(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: " + strZza);
        }
        if (this.zzc == null) {
            this.zzc = new zzafq(strZza, zzb());
        }
        String strZza2 = zzaga.zza(yioUaKMByL.RYH);
        if (TextUtils.isEmpty(strZza2)) {
            strZza2 = zzagd.zzb(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: " + strZza2);
        }
        if (this.zza == null) {
            this.zza = new zzaen(strZza2, zzb());
        }
        String strZza3 = zzaga.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(strZza3)) {
            strZza3 = zzagd.zzc(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: " + strZza3);
        }
        if (this.zzb == null) {
            this.zzb = new zzaeq(strZza3, zzb());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzait zzaitVar, zzafn<zzaiv> zzafnVar) {
        Preconditions.checkNotNull(zzaitVar);
        Preconditions.checkNotNull(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/verifyAssertion", this.zzf), zzaitVar, zzafnVar, zzaiv.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaiu zzaiuVar, zzafn<zzaix> zzafnVar) {
        Preconditions.checkNotNull(zzaiuVar);
        Preconditions.checkNotNull(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/verifyCustomToken", this.zzf), zzaiuVar, zzafnVar, zzaix.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaiw zzaiwVar, zzafn<zzaiz> zzafnVar) {
        Preconditions.checkNotNull(zzaiwVar);
        Preconditions.checkNotNull(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/verifyPassword", this.zzf), zzaiwVar, zzafnVar, zzaiz.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaiy zzaiyVar, zzafn<zzajb> zzafnVar) {
        Preconditions.checkNotNull(zzaiyVar);
        Preconditions.checkNotNull(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/verifyPhoneNumber", this.zzf), zzaiyVar, zzafnVar, zzajb.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaja zzajaVar, zzafn<zzajd> zzafnVar) {
        Preconditions.checkNotNull(zzajaVar);
        Preconditions.checkNotNull(zzafnVar);
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzajaVar, zzafnVar, zzajd.class, zzaeqVar.zza);
    }
}
