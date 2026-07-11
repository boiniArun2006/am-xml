package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzahe implements zzaes {
    private String zza;

    @Nullable
    private String zzb;

    @Nullable
    private String zzc;

    @Nullable
    private String zzd;
    private ActionCodeSettings zze;

    @Nullable
    private String zzf;

    @Nullable
    private String zzg;

    public zzahe(int i2) {
        this.zza = zza(i2);
    }

    public static zzahe zza(ActionCodeSettings actionCodeSettings, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(actionCodeSettings);
        return new zzahe(7, actionCodeSettings, null, str2, str, null, null);
    }

    public final ActionCodeSettings zzb() {
        return this.zze;
    }

    public final zzahe zzc(@Nullable String str) {
        this.zzf = str;
        return this;
    }

    public final zzahe zzd(String str) {
        this.zzd = Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzahe zzb(String str) {
        this.zzb = Preconditions.checkNotEmpty(str);
        return this;
    }

    @Nullable
    public final String zzc() {
        return this.zzb;
    }

    @Nullable
    public final String zzd() {
        return this.zzd;
    }

    private zzahe(int i2, ActionCodeSettings actionCodeSettings, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.zza = zza(7);
        this.zze = (ActionCodeSettings) Preconditions.checkNotNull(actionCodeSettings);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public final zzahe zza(ActionCodeSettings actionCodeSettings) {
        this.zze = (ActionCodeSettings) Preconditions.checkNotNull(actionCodeSettings);
        return this;
    }

    public final zzahe zza(@Nullable String str) {
        this.zzg = str;
        return this;
    }

    private static String zza(int i2) {
        if (i2 == 1) {
            return "PASSWORD_RESET";
        }
        if (i2 == 4) {
            return "VERIFY_EMAIL";
        }
        if (i2 == 6) {
            return "EMAIL_SIGNIN";
        }
        if (i2 != 7) {
            return "REQUEST_TYPE_UNSET_ENUM_VALUE";
        }
        return "VERIFY_AND_CHANGE_EMAIL";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza() throws JSONException {
        int i2;
        i2 = 1;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.getClass();
        switch (str) {
            case "PASSWORD_RESET":
                break;
            case "VERIFY_EMAIL":
                i2 = 4;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                i2 = 7;
                break;
            case "EMAIL_SIGNIN":
                i2 = 6;
                break;
            default:
                i2 = 0;
                break;
        }
        jSONObject.put("requestType", i2);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put(Scopes.EMAIL, str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        ActionCodeSettings actionCodeSettings = this.zze;
        if (actionCodeSettings != null) {
            jSONObject.put("androidInstallApp", actionCodeSettings.Bu());
            jSONObject.put("canHandleCodeInApp", this.zze.T3L());
            if (this.zze.Qu() != null) {
                jSONObject.put("continueUrl", this.zze.Qu());
            }
            if (this.zze.f() != null) {
                jSONObject.put("iosBundleId", this.zze.f());
            }
            if (this.zze.zzd() != null) {
                jSONObject.put("iosAppStoreId", this.zze.zzd());
            }
            if (this.zze.Uf() != null) {
                jSONObject.put(YjqZUJsVmhcjko.Bpem, this.zze.Uf());
            }
            if (this.zze.p0N() != null) {
                jSONObject.put("androidMinimumVersion", this.zze.p0N());
            }
            if (this.zze.zzc() != null) {
                jSONObject.put("dynamicLinkDomain", this.zze.zzc());
            }
            if (this.zze.ub() != null) {
                jSONObject.put("linkDomain", this.zze.ub());
            }
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.zzg;
        if (str6 != null) {
            zzajc.zza(jSONObject, "captchaResp", str6);
        } else {
            zzajc.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
