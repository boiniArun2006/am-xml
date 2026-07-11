package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class zzftx {
    private final String zza;
    private zzfuz zzb;
    private long zzc;
    private int zzd;

    public void zza() {
    }

    public void zzk(zzfsn zzfsnVar, zzfsl zzfslVar) {
        zzl(zzfsnVar, zzfslVar, null);
    }

    public void zzb() {
        this.zzb.clear();
    }

    final void zzc(WebView webView) {
        this.zzb = new zzfuz(webView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView zzd() {
        return (WebView) this.zzb.get();
    }

    public final boolean zze() {
        return this.zzb.get() != 0;
    }

    public final void zzh(String str, long j2) {
        if (j2 >= this.zzc) {
            this.zzd = 2;
            zzfto.zza().zze(zzd(), this.zza, str);
        }
    }

    public final void zzi(String str, long j2) {
        if (j2 < this.zzc || this.zzd == 3) {
            return;
        }
        this.zzd = 3;
        zzfto.zza().zze(zzd(), this.zza, str);
    }

    public final void zzn(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfud.zzc(jSONObject, StatsEvent.f62824A, Long.valueOf(date.getTime()));
        zzfto.zza().zzi(zzd(), jSONObject);
    }

    public zzftx(String str) {
        zzp();
        this.zza = str;
        this.zzb = new zzfuz(null);
    }

    public final void zzf(boolean z2) {
        String str;
        if (zze()) {
            if (true != z2) {
                str = "backgrounded";
            } else {
                str = "foregrounded";
            }
            zzfto.zza().zzf(zzd(), this.zza, str);
        }
    }

    public final void zzg(boolean z2) {
        String str;
        if (zze()) {
            if (true != z2) {
                str = "unlocked";
            } else {
                str = "locked";
            }
            zzfto.zza().zzg(zzd(), this.zza, str);
        }
    }

    public final void zzj(zzfsk zzfskVar) {
        zzfto.zza().zzb(zzd(), this.zza, zzfskVar.zzb());
    }

    protected final void zzl(zzfsn zzfsnVar, zzfsl zzfslVar, JSONObject jSONObject) {
        String strZzh = zzfsnVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfud.zzc(jSONObject2, "environment", PangleCreativeInfo.f62498a);
        zzfud.zzc(jSONObject2, "adSessionType", zzfslVar.zzi());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        zzfud.zzc(jSONObject3, "deviceType", sb.toString());
        zzfud.zzc(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfud.zzc(jSONObject3, "os", "Android");
        zzfud.zzc(jSONObject2, "deviceInfo", jSONObject3);
        zzfud.zzc(jSONObject2, "deviceCategory", zzfuc.zzb().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfud.zzc(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfud.zzc(jSONObject4, "partnerName", zzfslVar.zzc().zzb());
        zzfud.zzc(jSONObject4, "partnerVersion", zzfslVar.zzc().zzc());
        zzfud.zzc(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfud.zzc(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        zzfud.zzc(jSONObject5, "appId", zzftm.zza().zzb().getApplicationContext().getPackageName());
        zzfud.zzc(jSONObject2, PangleCreativeInfo.f62498a, jSONObject5);
        if (zzfslVar.zzg() != null) {
            zzfud.zzc(jSONObject2, "contentUrl", zzfslVar.zzg());
        }
        if (zzfslVar.zzh() != null) {
            zzfud.zzc(jSONObject2, "customReferenceData", zzfslVar.zzh());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfslVar.zzd().iterator();
        if (!it.hasNext()) {
            zzfto.zza().zzc(zzd(), strZzh, jSONObject2, jSONObject6, jSONObject);
        } else {
            throw null;
        }
    }

    public final void zzm() {
        zzfto.zza().zzd(zzd(), this.zza);
    }

    public final void zzo(float f3) {
        zzfto.zza().zzh(zzd(), this.zza, f3);
    }

    public final void zzp() {
        this.zzc = System.nanoTime();
        this.zzd = 1;
    }
}
