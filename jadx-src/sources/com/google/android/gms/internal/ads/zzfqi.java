package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfqi implements zzgzl {
    final /* synthetic */ zzfoe zza;
    final /* synthetic */ zzfoo zzb;
    final /* synthetic */ zzddu zzc;
    final /* synthetic */ zzfqk zzd;

    zzfqi(zzfqk zzfqkVar, zzfoe zzfoeVar, zzfoo zzfooVar, zzddu zzdduVar) {
        this.zza = zzfoeVar;
        this.zzb = zzfooVar;
        this.zzc = zzdduVar;
        Objects.requireNonNull(zzfqkVar);
        this.zzd = zzfqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(@NonNull Throwable th) {
        zzfoe zzfoeVar = this.zza;
        if (zzfoeVar == null) {
            return;
        }
        zzfoeVar.zzd(false);
        zzfoo zzfooVar = this.zzb;
        if (zzfooVar != null) {
            zzfooVar.zza(zzfoeVar);
            zzfooVar.zzh();
        } else {
            zzfqk zzfqkVar = this.zzd;
            zzfqkVar.zze().zzb(zzfoeVar.zzm());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        byte b2;
        int i2;
        zzfoe zzfoeVar = this.zza;
        com.google.android.gms.ads.internal.util.client.zzt zztVar = (com.google.android.gms.ads.internal.util.client.zzt) obj;
        if (zzfoeVar != null) {
            zzfoeVar.zzd(zztVar == com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
            zzfoo zzfooVar = this.zzb;
            if (zzfooVar == null) {
                this.zzd.zze().zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zza(zzfoeVar);
                zzfooVar.zzh();
            }
        }
        zzddu zzdduVar = this.zzc;
        if (zzdduVar != null) {
            String strZzb = this.zzd.zzd().zzb();
            if (TextUtils.isEmpty(strZzb)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(strZzb);
                Parcelable.Creator<com.google.android.gms.ads.internal.client.zzt> creator = com.google.android.gms.ads.internal.client.zzt.CREATOR;
                String strOptString = jSONObject.optString("type");
                String strOptString2 = jSONObject.optString("precision");
                String strOptString3 = jSONObject.optString(AppLovinEventParameters.REVENUE_CURRENCY);
                long jOptLong = jSONObject.optLong("value", 0L);
                int iHashCode = strOptString.hashCode();
                byte b4 = -1;
                if (iHashCode != 66934) {
                    if (iHashCode != 66944) {
                        b2 = (iHashCode == 1349395245 && strOptString.equals("ONE_PIXEL")) ? (byte) 2 : (byte) -1;
                    } else if (strOptString.equals("CPM")) {
                        b2 = 0;
                    }
                } else if (strOptString.equals("CPC")) {
                    b2 = 1;
                }
                if (b2 == 0) {
                    i2 = 1;
                } else if (b2 == 1) {
                    i2 = 2;
                } else if (b2 != 2) {
                    i2 = 0;
                } else {
                    jOptLong /= 1000;
                    i2 = 3;
                }
                int iHashCode2 = strOptString2.hashCode();
                if (iHashCode2 != -2131980260) {
                    if (iHashCode2 != 399232571) {
                        if (iHashCode2 == 1271254246 && strOptString2.equals("PUBLISHER_PROVIDED")) {
                            b4 = 1;
                        }
                    } else if (strOptString2.equals("PRECISE")) {
                        b4 = 2;
                    }
                } else if (strOptString2.equals("ESTIMATED")) {
                    b4 = 0;
                }
                zzdduVar.zza(new com.google.android.gms.ads.internal.client.zzt(i2, b4 != 0 ? b4 != 1 ? b4 != 2 ? 0 : 3 : 2 : 1, strOptString3, jOptLong));
            } catch (JSONException e2) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "UrlPinger.pingUrl");
            }
        }
    }
}
