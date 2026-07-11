package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzehd implements zzfmu {
    private static final Pattern zzd = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zza;
    private final zzfoe zzb;
    private final zzfoo zzc;

    public zzehd(String str, zzfoo zzfooVar, zzfoe zzfoeVar) {
        this.zza = str;
        this.zzc = zzfooVar;
        this.zzb = zzfoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzecr zzecrVar;
        String strJoin;
        byte[] bArr;
        JSONObject jSONObjectZza;
        String strConcat;
        zzehc zzehcVar = (zzehc) obj;
        int iOptInt = zzehcVar.zza().optInt("http_timeout_millis", 60000);
        zzbzw zzbzwVarZzb = zzehcVar.zzb();
        if (zzbzwVarZzb.zza() != -2) {
            if (zzbzwVarZzb.zza() == 1) {
                if (zzbzwVarZzb.zzb() != null) {
                    strJoin = TextUtils.join(", ", zzbzwVarZzb.zzb());
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(strJoin);
                } else {
                    strJoin = "";
                }
                zzecrVar = new zzecr(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzecrVar = new zzecr(1);
            }
            zzfoo zzfooVar = this.zzc;
            zzfoe zzfoeVar = this.zzb;
            zzfoeVar.zzj(zzecrVar);
            zzfoeVar.zzd(false);
            zzfooVar.zza(zzfoeVar);
            throw zzecrVar;
        }
        HashMap map = new HashMap();
        if (zzehcVar.zzb().zzg()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbv)).booleanValue()) {
                    if (TextUtils.isEmpty(str)) {
                        strConcat = "";
                    } else {
                        Matcher matcher = zzd.matcher(str);
                        strConcat = "";
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            if (strGroup != null) {
                                Locale locale = Locale.ROOT;
                                if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(strConcat)) {
                                        strConcat = strConcat.concat("; ");
                                    }
                                    strConcat = strConcat.concat(strGroup);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strConcat)) {
                        map.put("Cookie", strConcat);
                    }
                } else {
                    map.put("Cookie", str);
                }
            }
        }
        if (zzehcVar.zzb().zzf() && (jSONObjectZza = zzehcVar.zza()) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObjectZza.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                String str2 = YmsTEL.weOQMQZKIJtul;
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString(str2, ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString(str2, ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
            }
        }
        byte[] byteArray = new byte[0];
        if (TextUtils.isEmpty(zzehcVar.zzb().zzd())) {
            bArr = byteArray;
        } else {
            byte[] bytes = zzehcVar.zzb().zzd().getBytes(StandardCharsets.UTF_8);
            if (zzehcVar.zzb().zzm()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                    } finally {
                    }
                } catch (IOException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzb("gzip compression failed, sending uncompressed.", e2);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "PrepareRequestFunction.apply");
                    byteArray = null;
                }
                if (byteArray != null) {
                    map.put("Content-Encoding", "gzip");
                    bArr = byteArray;
                }
            }
            bArr = bytes;
        }
        String strZzl = !TextUtils.isEmpty(zzehcVar.zzb().zzl()) ? zzehcVar.zzb().zzl() : "";
        zzfoo zzfooVar2 = this.zzc;
        zzfoe zzfoeVar2 = this.zzb;
        zzfoeVar2.zzd(true);
        zzfooVar2.zza(zzfoeVar2);
        return new zzegy(zzehcVar.zzb().zze(), iOptInt, map, bArr, strZzl, zzehcVar.zzb().zzf());
    }
}
