package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class zzahk implements zzaer<zzahk> {
    private static final String zza = "zzahk";

    @Nullable
    private String zzb;
    private zzaj<zzahv> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahk zza(String str) throws zzaci {
        zzaj<zzahv> zzajVarZza;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzajVarZza = zzaj.zza(new ArrayList());
                } else {
                    zzam zzamVarZzg = zzaj.zzg();
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                        zzamVarZzg.zza(jSONObject2 == null ? zzahv.zza(null, null) : zzahv.zza(Strings.emptyToNull(jSONObject2.optString("provider")), Strings.emptyToNull(jSONObject2.optString("enforcementState"))));
                    }
                    zzajVarZza = zzamVarZzg.zza();
                }
                this.zzc = zzajVarZza;
            }
            return this;
        } catch (NullPointerException e2) {
            e = e2;
            throw zzajc.zza(e, zza, str);
        } catch (JSONException e3) {
            e = e3;
            throw zzajc.zza(e, zza, str);
        }
    }

    @Nullable
    public final String zza() {
        return this.zzb;
    }

    @Nullable
    public final String zzb(String str) {
        Preconditions.checkNotEmpty(str);
        zzaj<zzahv> zzajVar = this.zzc;
        if (zzajVar != null && !zzajVar.isEmpty()) {
            zzaj<zzahv> zzajVar2 = this.zzc;
            int size = zzajVar2.size();
            int i2 = 0;
            while (i2 < size) {
                zzahv zzahvVar = zzajVar2.get(i2);
                i2++;
                zzahv zzahvVar2 = zzahvVar;
                String strZza = zzahvVar2.zza();
                String strZzb = zzahvVar2.zzb();
                if (strZza != null && strZzb != null && strZzb.equals(str)) {
                    return zzahvVar2.zza();
                }
            }
        }
        return null;
    }

    public final boolean zzc(String str) {
        String strZzb = zzb(str);
        if (strZzb == null) {
            return false;
        }
        if (!strZzb.equals("ENFORCE") && !strZzb.equals("AUDIT")) {
            return false;
        }
        return true;
    }
}
