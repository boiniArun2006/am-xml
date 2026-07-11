package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.IOUtils;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeha implements zzfmu {
    protected final Context zza;
    protected final String zzb;

    @Nullable
    private final String zzc;

    public zzeha(Context context, String str, zzcac zzcacVar, int i2, @Nullable String str2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzegz zza(zzegy zzegyVar) throws zzecr {
        return zzc(zzegyVar.zza, zzegyVar.zzb, zzegyVar.zzc, zzegyVar.zzd, zzegyVar.zze, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x029a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bd, code lost:
    
        com.safedk.android.internal.partials.AdMobNetworkBridge.httpUrlConnectionDisconnect(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023f, code lost:
    
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r3.append("Received error HTTP response code: ");
        r3.append(r0);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(r3.toString());
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r4.append("Received error HTTP response code: ");
        r4.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0279, code lost:
    
        throw new com.google.android.gms.internal.ads.zzecr(1, r4.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final zzegz zzc(String str, int i2, Map map, byte[] bArr, String str2, long j2) throws MalformedURLException, zzecr {
        URL url;
        InputStreamReader inputStreamReader;
        try {
            zzegz zzegzVar = new zzegz();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue() && com.google.android.gms.ads.internal.client.zzbb.zze()) {
                zzegzVar.zza = 410;
                return zzegzVar;
            }
            String str3 = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 13);
            sb.append("SDK version: ");
            sb.append(str3);
            String string = sb.toString();
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(string);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 39);
            sb2.append("AdRequestServiceImpl: Sending request: ");
            sb2.append(str);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2.toString());
            URL url2 = new URL(str);
            HashMap map2 = new HashMap();
            int i5 = 0;
            while (true) {
                int i7 = zzfxs.zzb;
                HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
                String str4 = this.zzc;
                if (str4 != null) {
                    httpURLConnection.setRequestMethod(str4);
                }
                try {
                    try {
                        com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zza, str3, false, httpURLConnection, false, i2);
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        BufferedOutputStream bufferedOutputStream = null;
                        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                        try {
                            zzlVar.zza(httpURLConnection, bArr);
                        } catch (Throwable th) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Network request logging failed.", th);
                            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "HttpRequestFunction.logAdRequest");
                        }
                        int length = bArr.length;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(AdMobNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
                                try {
                                    bufferedOutputStream2.write(bArr);
                                    IOUtils.closeQuietly(bufferedOutputStream2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    IOUtils.closeQuietly(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry2.getKey();
                            List<String> value = entry2.getValue();
                            if (map2.containsKey(key)) {
                                ((List) map2.get(key)).addAll(value);
                            } else {
                                map2.put(key, new ArrayList(value));
                            }
                        }
                        zzlVar.zzc(httpURLConnection, iHttpUrlConnectionGetResponseCode);
                        zzegzVar.zza = iHttpUrlConnectionGetResponseCode;
                        zzegzVar.zzb = map2;
                        zzegzVar.zzc = "";
                        if (iHttpUrlConnectionGetResponseCode >= 200 && iHttpUrlConnectionGetResponseCode < 300) {
                            try {
                                InputStreamReader inputStreamReader2 = new InputStreamReader(AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnection));
                                try {
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    StringBuilder sb3 = new StringBuilder(8192);
                                    char[] cArr = new char[2048];
                                    while (true) {
                                        int i8 = inputStreamReader2.read(cArr);
                                        if (i8 == -1) {
                                            break;
                                        }
                                        sb3.append(cArr, 0, i8);
                                    }
                                    String string2 = sb3.toString();
                                    IOUtils.closeQuietly(inputStreamReader2);
                                    zzlVar.zze(string2);
                                    zzegzVar.zzc = string2;
                                    if (TextUtils.isEmpty(string2)) {
                                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgz)).booleanValue()) {
                                            throw new zzecr(3);
                                        }
                                    }
                                    zzegzVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStreamReader = inputStreamReader2;
                                    IOUtils.closeQuietly(inputStreamReader);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                inputStreamReader = null;
                            }
                        } else {
                            if (iHttpUrlConnectionGetResponseCode < 300 || iHttpUrlConnectionGetResponseCode >= 400) {
                                break;
                            }
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (TextUtils.isEmpty(headerField)) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("No location header to follow redirect.");
                                throw new zzecr(1, "No location header to follow redirect");
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzja)).booleanValue()) {
                                try {
                                    url = new URI(headerField).toURL();
                                } catch (URISyntaxException e2) {
                                    throw new zzecr(1, e2.getMessage(), e2);
                                }
                            } else {
                                url = new URL(headerField);
                            }
                            int i9 = i5 + 1;
                            if (i9 > ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgi)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Too many redirects.");
                                throw new zzecr(1, "Too many redirects");
                            }
                            AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            i5 = i9;
                            url2 = url;
                        }
                    } catch (zzecr e3) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjE)).booleanValue()) {
                            throw e3;
                        }
                        zzegzVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j2;
                    }
                } catch (Throwable th6) {
                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    throw th6;
                }
            }
        } catch (IOException e4) {
            String strValueOf = String.valueOf(e4.getMessage());
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            String strConcat = "Error while connecting to ad server: ".concat(strValueOf);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
            throw new zzecr(1, strConcat, e4);
        }
    }
}
