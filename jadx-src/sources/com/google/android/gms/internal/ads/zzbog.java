package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbog {
    public static final zzboh zza = zzbof.zza;
    public static final zzboh zzb = zzbnw.zza;
    public static final zzboh zzc = zzbnx.zza;
    public static final zzboh zzd = new zzbno();
    public static final zzboh zze = new zzbnp();
    public static final zzboh zzf = zzboc.zza;
    public static final zzboh zzg = new zzbnq();
    public static final zzboh zzh = new zzbnr();
    public static final zzboh zzi = zzbod.zza;
    public static final zzboh zzj = new zzbns();
    public static final zzboh zzk = new zzbnt();
    public static final zzboh zzl = new zzchf();
    public static final zzboh zzm = new zzchg();
    public static final zzboh zzn = new zzbna();
    public static final zzboy zzo = new zzboy();
    public static final zzboh zzp = new zzbnu();
    public static final zzboh zzq = new zzbnv();
    public static final zzboh zzr = new zzbnb();
    public static final zzboh zzs = new zzbnc();
    public static final zzboh zzt = new zzbnd();
    public static final zzboh zzu = new zzbne();
    public static final zzboh zzv = new zzbnf();
    public static final zzboh zzw = new zzbng();
    public static final zzboh zzx = new zzbnh();
    public static final zzboh zzy = new zzbni();
    public static final zzboh zzz = new zzbnj();
    public static final zzboh zzA = new zzbnk();
    public static final zzboh zzB = new zzbnm();
    public static final zzboh zzC = new zzbnn();

    public static zzboh zzb(final zzdjm zzdjmVar, final zzcrv zzcrvVar) {
        return new zzboh() { // from class: com.google.android.gms.internal.ads.zzbob
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcjl zzcjlVar = (zzcjl) obj;
                zzbog.zzc(map, zzdjmVar);
                final String str = (String) map.get("u");
                if (str == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                final zzcrv zzcrvVar2 = zzcrvVar;
                zzgzg zzgzgVarZzw = zzgzg.zzw(zzbog.zza(zzcjlVar, str));
                zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzboe
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj2) {
                        zzcrv zzcrvVar3;
                        String str2 = (String) obj2;
                        zzboh zzbohVar = zzbog.zza;
                        return (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzly)).booleanValue() && (zzcrvVar3 = zzcrvVar2) != null && zzcrv.zzc(str)) ? zzcrvVar3.zzb(str2, com.google.android.gms.ads.internal.client.zzbb.zzh()) : zzgzo.zza(str2);
                    }
                };
                zzgzy zzgzyVar = zzcei.zza;
                zzgzo.zzr((zzgzg) zzgzo.zzj(zzgzgVarZzw, zzgywVar, zzgzyVar), new zzbnl(zzcjlVar), zzgzyVar);
            }
        };
    }

    public static void zzc(Map map, zzdjm zzdjmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmi)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdjmVar != null) {
            zzdjmVar.zzdu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(15:56|8|9|(12:66|11|12|(10:18|(1:20)|21|(1:23)|24|(1:26)|27|(1:29)|30|(2:32|(1:34)))|35|60|36|(1:41)(1:42)|64|43|71|49)(1:16)|15|(0)|35|60|36|(0)(0)|64|43|71|49|6) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzh().zzg(r0, r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void zze(zzckx zzckxVar, Map map) {
        String strOptString;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        String strOptString5;
        String strOptString6;
        String strOptString7;
        ResolveInfo resolveInfoResolveActivity;
        char c2;
        Intent uri;
        PackageManager packageManager = zzckxVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        strOptString = jSONObject2.optString("id");
                        strOptString2 = jSONObject2.optString("u");
                        strOptString3 = jSONObject2.optString(CmcdData.OBJECT_TYPE_INIT_SEGMENT);
                        strOptString4 = jSONObject2.optString("m");
                        strOptString5 = jSONObject2.optString(TtmlNode.TAG_P);
                        strOptString6 = jSONObject2.optString("c");
                        strOptString7 = jSONObject2.optString("intent_url");
                        resolveInfoResolveActivity = null;
                    } catch (JSONException e2) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the intent data.", e2);
                    }
                    if (TextUtils.isEmpty(strOptString7)) {
                        c2 = 1;
                    } else {
                        try {
                            uri = Intent.parseUri(strOptString7, 0);
                            c2 = 1;
                        } catch (URISyntaxException e3) {
                            String strValueOf = String.valueOf(strOptString7);
                            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                            c2 = 1;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(strValueOf), e3);
                            uri = null;
                        }
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                String[] strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[c2]));
                                }
                            }
                        }
                        Intent intent = uri;
                        resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        jSONObject.put(strOptString, resolveInfoResolveActivity == null ? c2 : 0);
                    }
                    uri = null;
                    if (uri == null) {
                    }
                    Intent intent2 = uri;
                    resolveInfoResolveActivity = packageManager.resolveActivity(intent2, 65536);
                    jSONObject.put(strOptString, resolveInfoResolveActivity == null ? c2 : 0);
                }
                ((zzbrd) zzckxVar).zzd("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbrd) zzckxVar).zzd("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbrd) zzckxVar).zzd("openableIntents", new JSONObject());
        }
    }

    public static com.google.common.util.concurrent.Xo zza(zzcjl zzcjlVar, String str) {
        Uri uriZzd = Uri.parse(str);
        try {
            zzazh zzazhVarZzS = zzcjlVar.zzS();
            zzfjo zzfjoVarZzT = zzcjlVar.zzT();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() && zzfjoVarZzT != null) {
                if (zzazhVarZzS != null && zzazhVarZzS.zza(uriZzd)) {
                    uriZzd = zzfjoVarZzT.zza(uriZzd, zzcjlVar.getContext(), zzcjlVar.zzE(), zzcjlVar.zzj());
                }
            } else if (zzazhVarZzS != null && zzazhVarZzS.zza(uriZzd)) {
                uriZzd = zzazhVarZzS.zzd(uriZzd, zzcjlVar.getContext(), zzcjlVar.zzE(), zzcjlVar.zzj());
            }
        } catch (zzazi unused) {
            String strConcat = "Unable to append parameter to URL: ".concat(str);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        }
        Map map = new HashMap();
        if (zzcjlVar.zzC() != null) {
            map = zzcjlVar.zzC().zzaw;
        }
        final String strZzb = zzccs.zzb(uriZzd, zzcjlVar.getContext(), map);
        long jLongValue = ((Long) zzbjd.zze.zze()).longValue();
        if (jLongValue > 0 && jLongValue <= 254715000) {
            zzgzg zzgzgVarZzw = zzgzg.zzw(zzcjlVar.zzaF());
            zzbny zzbnyVar = zzbny.zza;
            zzgzy zzgzyVar = zzcei.zzg;
            return (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzg(zzgzgVarZzw, Throwable.class, zzbnyVar, zzgzyVar), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzbnz
                /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
                @Override // com.google.android.gms.internal.ads.zzgqt
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final /* synthetic */ Object apply(Object obj) {
                    String str2;
                    String str3;
                    String str4 = (String) obj;
                    zzboh zzbohVar = zzbog.zza;
                    String strReplace = strZzb;
                    if (str4 != null) {
                        if (((Boolean) zzbjd.zzf.zze()).booleanValue()) {
                            String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                            String host = Uri.parse(strReplace).getHost();
                            for (int i3 = 0; i3 < 3; i3++) {
                                if (host.endsWith(strArr[i3])) {
                                    str2 = (String) zzbjd.zza.zze();
                                    str3 = (String) zzbjd.zzb.zze();
                                    if (!TextUtils.isEmpty(str2)) {
                                    }
                                    if (!TextUtils.isEmpty(str3)) {
                                    }
                                }
                            }
                        } else {
                            str2 = (String) zzbjd.zza.zze();
                            str3 = (String) zzbjd.zzb.zze();
                            if (!TextUtils.isEmpty(str2)) {
                                strReplace = strReplace.replace(str2, str4);
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                Uri uri = Uri.parse(strReplace);
                                if (TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                    return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                                }
                            }
                        }
                    }
                    return strReplace;
                }
            }, zzgzyVar), Throwable.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzboa
                @Override // com.google.android.gms.internal.ads.zzgqt
                public final /* synthetic */ Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    zzboh zzbohVar = zzbog.zza;
                    if (((Boolean) zzbjd.zzi.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "prepareClickUrl.attestation2");
                    }
                    return strZzb;
                }
            }, zzgzyVar);
        }
        return zzgzo.zza(strZzb);
    }
}
