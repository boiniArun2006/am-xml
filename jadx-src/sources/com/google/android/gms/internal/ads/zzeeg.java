package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzeeg {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcma zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzfjk zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfoo zzi;
    private final zzdxt zzj;
    private final zzfqk zzk;
    private final zzdej zzl;
    private final Object zzm = new Object();
    private String zzn;
    private List zzo;

    @Nullable
    private Bundle zzp;
    private final zzcac zzq;

    final /* synthetic */ zzdej zzf() {
        return this.zzl;
    }

    private final com.google.common.util.concurrent.Xo zzg(@Nullable String str, final String str2) {
        com.google.common.util.concurrent.Xo xoZza;
        String str3;
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            return zzgzo.zzc(new zzenv(15, "Invalid ad string."));
        }
        Context context = this.zzc;
        zzfoe zzfoeVarZzn = zzfoe.zzn(context, 11);
        zzfoeVarZzn.zza();
        zzbsz zzbszVarZzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(context, this.zzd, this.zzb.zzx());
        zzbst zzbstVar = zzbsw.zza;
        final zzbsp zzbspVarZza = zzbszVarZzb.zza("google.afma.response.normalize", zzbstVar, zzbstVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzia)).booleanValue()) {
            try {
                str3 = str;
            } catch (JSONException unused) {
                str3 = str;
            }
            try {
                JSONObject jSONObject = new JSONObject(str3);
                this.zzn = jSONObject.optString("fetch_url", "");
                this.zzo = com.google.android.gms.ads.internal.util.zzbp.zza(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
            } catch (JSONException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid ad response.");
            }
            String string = this.zzn;
            final List list = this.zzo;
            if (TextUtils.isEmpty(string)) {
                xoZza = zzgzo.zza(str3);
                this.zzj.zzd("sst", "1");
            } else {
                this.zzj.zzd("sst", "2");
                String str5 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzic);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzib)).booleanValue()) {
                    List listZze = zzgrr.zzb(zza).zze(string);
                    if (listZze.size() < 2) {
                        xoZza = zzgzo.zzc(new zzenv(1, "Invalid fetch URL."));
                    } else {
                        str4 = (String) listZze.get(1);
                        com.google.android.gms.ads.internal.zzt.zzc();
                        string = Uri.parse(string).buildUpon().query(null).build().toString();
                        final zzegy zzegyVar = new zzegy(string, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5, false);
                        xoZza = (zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzi(zzgzg.zzw(zzcei.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeed
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return this.zza.zzd(zzegyVar);
                            }
                        })), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzid)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeee
                            @Override // com.google.android.gms.internal.ads.zzgyw
                            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                                return this.zza.zze(list, (Exception) obj);
                            }
                        }, this.zzf);
                    }
                } else {
                    final zzegy zzegyVar2 = new zzegy(string, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5, false);
                    xoZza = (zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzi(zzgzg.zzw(zzcei.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeed
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return this.zza.zzd(zzegyVar2);
                        }
                    })), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzid)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeee
                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                            return this.zza.zze(list, (Exception) obj);
                        }
                    }, this.zzf);
                }
            }
        } else {
            xoZza = zzgzo.zza(str);
            this.zzj.zzd("sst", "1");
        }
        zzgyw zzgywVar = new zzgyw(this) { // from class: com.google.android.gms.internal.ads.zzeef
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) throws JSONException {
                String str6 = (String) obj;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                String str7 = str2;
                try {
                    jSONObject4.put("headers", new JSONObject());
                    jSONObject4.put("body", str6);
                    jSONObject3.put("base_url", "");
                    jSONObject3.put("signals", new JSONObject(str7));
                    jSONObject2.put(AdActivity.REQUEST_KEY_EXTRA, jSONObject3);
                    jSONObject2.put("response", jSONObject4);
                    jSONObject2.put("flags", new JSONObject());
                    return zzgzo.zza(jSONObject2);
                } catch (JSONException e2) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e2.getCause())));
                }
            }
        };
        Executor executor = this.zzf;
        com.google.common.util.concurrent.Xo xoZzj = zzgzo.zzj(zzgzo.zzj(zzgzo.zzj(xoZza, zzgywVar, executor), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeeb
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzb(zzbspVarZza, (JSONObject) obj);
            }
        }, executor), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeec
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzc((JSONObject) obj);
            }
        }, executor);
        zzfon.zzd(xoZzj, this.zzi, zzfoeVarZzn);
        zzgzo.zzr(xoZzj, new zzeea(this), zzcei.zzg);
        return xoZzj;
    }

    private final void zzh(zzdxh zzdxhVar) {
        Bundle bundleZze = this.zzj.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzif)).booleanValue()) {
            bundleZze.putLong(zzdxhVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
    }

    private final String zzi(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            String strConcat = "Failed to update the ad types for rendering. ".concat(e2.toString());
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
            return str;
        }
    }

    private static final String zzj(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01ee A[Catch: all -> 0x00e4, TryCatch #3 {all -> 0x00e4, blocks: (B:21:0x0080, B:23:0x009e, B:25:0x00a6, B:27:0x00b3, B:29:0x00cd, B:33:0x00fd, B:36:0x0109, B:38:0x0111, B:40:0x0117, B:44:0x0120, B:53:0x0158, B:47:0x0134, B:52:0x0143, B:55:0x015d, B:32:0x00e7, B:56:0x0171, B:63:0x018e, B:66:0x0196, B:70:0x01b8, B:72:0x01cd, B:76:0x01ee, B:78:0x0203, B:81:0x0217, B:83:0x021d, B:84:0x022a, B:86:0x022c, B:89:0x0235, B:88:0x0232, B:77:0x01f8, B:73:0x01e0, B:69:0x01a4, B:60:0x017e, B:61:0x0183), top: B:119:0x0080, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f8 A[Catch: all -> 0x00e4, TryCatch #3 {all -> 0x00e4, blocks: (B:21:0x0080, B:23:0x009e, B:25:0x00a6, B:27:0x00b3, B:29:0x00cd, B:33:0x00fd, B:36:0x0109, B:38:0x0111, B:40:0x0117, B:44:0x0120, B:53:0x0158, B:47:0x0134, B:52:0x0143, B:55:0x015d, B:32:0x00e7, B:56:0x0171, B:63:0x018e, B:66:0x0196, B:70:0x01b8, B:72:0x01cd, B:76:0x01ee, B:78:0x0203, B:81:0x0217, B:83:0x021d, B:84:0x022a, B:86:0x022c, B:89:0x0235, B:88:0x0232, B:77:0x01f8, B:73:0x01e0, B:69:0x01a4, B:60:0x017e, B:61:0x0183), top: B:119:0x0080, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0232 A[Catch: all -> 0x00e4, TryCatch #3 {all -> 0x00e4, blocks: (B:21:0x0080, B:23:0x009e, B:25:0x00a6, B:27:0x00b3, B:29:0x00cd, B:33:0x00fd, B:36:0x0109, B:38:0x0111, B:40:0x0117, B:44:0x0120, B:53:0x0158, B:47:0x0134, B:52:0x0143, B:55:0x015d, B:32:0x00e7, B:56:0x0171, B:63:0x018e, B:66:0x0196, B:70:0x01b8, B:72:0x01cd, B:76:0x01ee, B:78:0x0203, B:81:0x0217, B:83:0x021d, B:84:0x022a, B:86:0x022c, B:89:0x0235, B:88:0x0232, B:77:0x01f8, B:73:0x01e0, B:69:0x01a4, B:60:0x017e, B:61:0x0183), top: B:119:0x0080, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.common.util.concurrent.Xo zza() {
        String strOptString;
        int i2;
        String str;
        String string;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzp = this.zze.zzt;
            this.zzj.zze().putLong(zzdxh.SCAR_PRELOADER_READY.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        String strZzb = this.zze.zzd.zzx;
        if (!TextUtils.isEmpty(strZzb)) {
            String strZzj = zzj(strZzb);
            zzbgv zzbgvVar = zzbhe.zzhW;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && strZzj.isEmpty()) {
                int iLastIndexOf = strZzb.lastIndexOf("&request_id=");
                strZzj = iLastIndexOf != -1 ? strZzb.substring(iLastIndexOf + 12) : "";
            }
            if (TextUtils.isEmpty(strZzj)) {
                return zzgzo.zzc(new zzenv(15, "Invalid ad string."));
            }
            synchronized (this.zzm) {
                try {
                    com.google.android.gms.ads.nonagon.signalgeneration.zzv zzvVarZzt = this.zzb.zzt();
                    zzdxt zzdxtVar = this.zzj;
                    String strZzb2 = zzvVarZzt.zzb(strZzj, zzdxtVar);
                    String str2 = null;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && !TextUtils.isEmpty(strZzb2)) {
                        try {
                            JSONObject jSONObjectOptJSONObject = new JSONObject(strZzb2).optJSONObject("extras");
                            if (jSONObjectOptJSONObject != null) {
                                if ((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhY)).booleanValue() ? Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhZ)).split(",")) : Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhX)).split(","))).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(jSONObjectOptJSONObject.optString("query_info_type", "")))) {
                                    int iLastIndexOf2 = strZzb.lastIndexOf("&");
                                    String strSubstring = iLastIndexOf2 != -1 ? strZzb.substring(0, iLastIndexOf2) : null;
                                    if (!TextUtils.isEmpty(strSubstring)) {
                                        try {
                                            byte[] bArrDecode = Base64.decode(strSubstring, 11);
                                            byte[] bytes = strZzj.getBytes(StandardCharsets.UTF_8);
                                            if (TextUtils.isEmpty(strZzb2)) {
                                                string = null;
                                                strZzb = zzfka.zzb(bArrDecode, bytes, string, zzdxtVar);
                                            } else {
                                                try {
                                                    string = new JSONObject(strZzb2).getString("arek");
                                                } catch (JSONException e2) {
                                                    com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e2.toString()));
                                                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "CryptoUtils.getKeyFromQueryJsonMap");
                                                    string = null;
                                                }
                                                strZzb = zzfka.zzb(bArrDecode, bytes, string, zzdxtVar);
                                            }
                                        } catch (IllegalArgumentException e3) {
                                            com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e3.toString()));
                                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "PreloadedLoader.decryptAdResponseIfNecessary");
                                        }
                                    }
                                }
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    if (TextUtils.isEmpty(strZzb)) {
                        strOptString = "";
                    } else {
                        try {
                            strOptString = new JSONObject(strZzb).optString("render_id", "");
                        } catch (JSONException unused2) {
                            strOptString = "";
                        }
                    }
                    if (TextUtils.isEmpty(strOptString)) {
                        i2 = 0;
                        if (str2 != null) {
                        }
                        str = (String) pair.first;
                        int iIntValue = ((Integer) pair.second).intValue();
                        if (TextUtils.isEmpty(str)) {
                        }
                    } else {
                        String str3 = "";
                        try {
                            str3 = new String(Base64.decode(strOptString, 0), StandardCharsets.UTF_8);
                        } catch (IllegalArgumentException e4) {
                            com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(strOptString)));
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "PreloadedLoader.decodeRenderId");
                        }
                        List listZze = zzgrr.zza(zzgqq.zzc(':')).zze(str3);
                        if (listZze.size() == 2) {
                            str2 = (String) listZze.get(0);
                            i2 = Integer.parseInt((String) listZze.get(1));
                            Pair pair = str2 != null ? new Pair(str2, Integer.valueOf(i2)) : new Pair("", 0);
                            str = (String) pair.first;
                            int iIntValue2 = ((Integer) pair.second).intValue();
                            if (TextUtils.isEmpty(str) || iIntValue2 <= 0) {
                                zzvVarZzt.zzc(strZzj);
                                if (!TextUtils.isEmpty(strZzb2)) {
                                    return zzg(strZzb, zzi(strZzb2));
                                }
                            } else {
                                if (zzvVarZzt.zzd(strZzj, str)) {
                                    return zzgzo.zzc(new zzenv(10, "The ad has already been shown."));
                                }
                                if (!zzvVarZzt.zze(strZzj, str, iIntValue2)) {
                                }
                                if (!TextUtils.isEmpty(strZzb2)) {
                                }
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(strOptString)));
                            i2 = 0;
                            if (str2 != null) {
                            }
                            str = (String) pair.first;
                            int iIntValue22 = ((Integer) pair.second).intValue();
                            if (TextUtils.isEmpty(str)) {
                                zzvVarZzt.zzc(strZzj);
                                if (!TextUtils.isEmpty(strZzb2)) {
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zze.zzd.zzs;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhO)).booleanValue()) {
                String str4 = zzcVar.zza;
                String str5 = zzcVar.zzb;
                String strZzj2 = zzj(str4);
                String strZzj3 = zzj(str5);
                if (TextUtils.isEmpty(strZzj3) || !strZzj2.equals(strZzj3)) {
                    this.zzj.zzc().put("ridmm", "true");
                } else {
                    this.zzb.zzt().zzc(strZzj2);
                    this.zzj.zzc().put("request_id", strZzj2);
                }
            }
            return zzg(zzcVar.zza, zzi(zzcVar.zzb));
        }
        return zzgzo.zzc(new zzenv(14, "Mismatch request IDs."));
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzb(zzbsp zzbspVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzj.zze().putLong(zzdxh.SCAR_PRELOADER_PROCESSING_DONE.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzbspVar.zzb(jSONObject);
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzc(JSONObject jSONObject) {
        zzfiz zzfizVar = new zzfiz(this.zze);
        String string = jSONObject.toString();
        return zzgzo.zza(new zzfjc(zzfizVar, zzfjb.zza(new StringReader(string), this.zzp)));
    }

    final /* synthetic */ String zzd(zzegy zzegyVar) throws zzenv {
        zzh(zzdxh.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i2 = 0;
        int i3 = -1;
        while (true) {
            try {
                if (i2 >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzie)).intValue()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 40);
                    sb.append("Received HTTP error code from ad server:");
                    sb.append(i3);
                    throw new zzenv(1, sb.toString());
                }
                zzegz zzegzVarZzb = new zzeha(this.zzc, this.zzd.afmaVersion, this.zzq, Binder.getCallingUid(), null).zza(zzegyVar);
                int i5 = zzegzVarZzb.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzif)).booleanValue()) {
                    this.zzj.zzd("fr", String.valueOf(i2));
                }
                if (i5 == 200) {
                    zzh(zzdxh.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zzegzVarZzb.zzc;
                }
                i2++;
                i3 = i5;
            } catch (Exception e2) {
                throw new zzenv(1, e2.getMessage() == null ? "Fetch failed." : e2.getMessage(), e2);
            }
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zze(List list, Exception exc) {
        zzenv zzenvVar;
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzenvVar = new zzenv(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzenv) {
            zzenvVar = (zzenv) exc;
        } else {
            zzenvVar = new zzenv(1, exc.getMessage() == null ? FijIa.zwTrngFLzxS : exc.getMessage());
        }
        String message = zzenvVar.getMessage() == null ? "" : zzenvVar.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List listZze = zzgrr.zza(zzgqq.zzc(':')).zze(message);
                    if (listZze.size() == 2) {
                        message = (String) listZze.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfqg.zzd(zzfqg.zzd((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            this.zzk.zza(arrayList, null);
        }
        return zzgzo.zzc(zzenvVar);
    }

    zzeeg(zzcma zzcmaVar, Context context, VersionInfoParcel versionInfoParcel, zzfjk zzfjkVar, Executor executor, String str, zzfoo zzfooVar, zzdxt zzdxtVar, zzcac zzcacVar, zzehb zzehbVar, ScheduledExecutorService scheduledExecutorService, zzfqk zzfqkVar, zzdej zzdejVar) {
        this.zzb = zzcmaVar;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzfjkVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfooVar;
        zzcmaVar.zzB();
        this.zzj = zzdxtVar;
        this.zzq = zzcacVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfqkVar;
        this.zzl = zzdejVar;
    }
}
