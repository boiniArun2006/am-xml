package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class zzeng implements zzekg {
    protected abstract com.google.common.util.concurrent.Xo zzc(zzfjk zzfjkVar, Bundle bundle, zzfir zzfirVar, zzfjc zzfjcVar);

    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        return !TextUtils.isEmpty(zzfirVar.zzv.optString("pubid", ""));
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final com.google.common.util.concurrent.Xo zzb(zzfjc zzfjcVar, zzfir zzfirVar) {
        JSONObject jSONObject = zzfirVar.zzv;
        String strOptString = jSONObject.optString("pubid", "");
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        zzfjj zzfjjVar = new zzfjj();
        zzfjjVar.zzz(zzfjkVar);
        zzfjjVar.zzg(strOptString);
        zzfjjVar.zzy(true);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfjkVar.zzd;
        Bundle bundleZzd = zzd(zzmVar.zzm);
        Bundle bundleZzd2 = zzd(bundleZzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleZzd2.putInt("gw", 1);
        String strOptString2 = jSONObject.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleZzd2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = jSONObject.optString("adJson", null);
        if (strOptString3 != null) {
            bundleZzd2.putString("_ad", strOptString3);
        }
        bundleZzd2.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = zzfirVar.zzD;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundleZzd2.putString(next, strOptString4);
            }
        }
        bundleZzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleZzd2);
        zzfjjVar.zza(new com.google.android.gms.ads.internal.client.zzm(zzmVar.zza, zzmVar.zzb, bundleZzd2, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, bundleZzd, zzmVar.zzn, zzmVar.zzo, zzmVar.zzp, zzmVar.zzq, zzmVar.zzr, zzmVar.zzs, zzmVar.zzt, zzmVar.zzu, zzmVar.zzv, zzmVar.zzw, zzmVar.zzx, zzmVar.zzy, zzmVar.zzz, zzmVar.zzA));
        zzfjk zzfjkVarZzA = zzfjjVar.zzA();
        Bundle bundle = new Bundle();
        zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfiuVar.zza));
        bundle2.putInt("refresh_interval", zzfiuVar.zzc);
        bundle2.putString("gws_query_id", zzfiuVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzfjkVar.zzg;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzfirVar.zzw);
        bundle3.putString("ad_source_name", zzfirVar.zzF);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzfirVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzfirVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfirVar.zzp));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzfirVar.zzm));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzfirVar.zzg));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzfirVar.zzh));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzfirVar.zzi));
        bundle3.putString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, zzfirVar.zzj);
        bundle3.putString("valid_from_timestamp", zzfirVar.zzk);
        bundle3.putBoolean("is_closable_area_disabled", zzfirVar.zzP);
        bundle3.putString("recursive_server_response_data", zzfirVar.zzao);
        bundle3.putBoolean("is_analytics_logging_enabled", zzfirVar.zzW);
        zzcas zzcasVar = zzfirVar.zzl;
        if (zzcasVar != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzcasVar.zzb);
            bundle4.putString("rb_type", zzcasVar.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzfjkVarZzA, bundle, zzfirVar, zzfjcVar);
    }
}
