package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.Ml;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class zzagp implements zzaes {
    private static final String zza = "zzagp";
    private final String zzb;
    private final String zzc;
    private final EmailAuthCredential zzd;

    @Nullable
    private final String zze;

    @Nullable
    private final String zzf;

    static {
        new Logger(zzagp.class.getSimpleName(), new String[0]);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza() throws JSONException {
        Ml mlT = Ml.t(this.zzc);
        String strN = mlT != null ? mlT.n() : null;
        String strNr = mlT != null ? mlT.nr() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scopes.EMAIL, this.zzb);
        if (strN != null) {
            jSONObject.put("oobCode", strN);
        }
        if (strNr != null) {
            jSONObject.put("tenantId", strNr);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            zzajc.zza(jSONObject, "captchaResp", str2);
        } else {
            zzajc.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final EmailAuthCredential zzb() {
        return this.zzd;
    }

    @Nullable
    public final String zzc() {
        return this.zzf;
    }

    public zzagp(EmailAuthCredential emailAuthCredential, @Nullable String str, @Nullable String str2) {
        this.zzd = (EmailAuthCredential) Preconditions.checkNotNull(emailAuthCredential);
        this.zzb = Preconditions.checkNotEmpty(emailAuthCredential.zzc());
        this.zzc = Preconditions.checkNotEmpty(emailAuthCredential.zze());
        this.zze = str;
        this.zzf = str2;
    }
}
