package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import android.net.TrafficStats;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzfxs;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzu implements zze {
    private final Context zza;

    @Nullable
    private final String zzb;

    @Nullable
    private String zzc;

    public zzu(Context context, @Nullable String str) {
        this.zza = context;
        this.zzb = str;
    }

    private final URL zzd(String str) throws MalformedURLException {
        URL urlZze = null;
        try {
            urlZze = new URI(str).toURL();
        } catch (IllegalArgumentException e2) {
            e = e2;
            zzf(str, e);
        } catch (MalformedURLException e3) {
            e = e3;
            zzf(str, e);
        } catch (URISyntaxException e4) {
            zzf(str, e4);
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzf)).booleanValue()) {
                urlZze = zze(str);
            }
        }
        if (urlZze != null) {
            return urlZze;
        }
        StringBuilder sb = new StringBuilder(str.length() + 47);
        sb.append("Falling back to direct new URL(\"");
        sb.append(str);
        sb.append("\") constructor.");
        zzo.zzd(sb.toString());
        return new URL(str);
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    @WorkerThread
    public final zzt zza(String str) {
        return zzc(str, null);
    }

    @Nullable
    public final String zzb() {
        return this.zzc;
    }

    @Nullable
    private final URL zze(String str) {
        URL url;
        URI uri;
        try {
            zzo.zzd("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e2) {
            e = e2;
            url = null;
        }
        try {
            String string = uri.toString();
            StringBuilder sb = new StringBuilder(str.length() + 114 + string.length());
            sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
            sb.append(str);
            sb.append("\" -> encoded URI: ");
            sb.append(string);
            zzo.zzd(sb.toString());
            return url;
        } catch (IllegalArgumentException e3) {
            e = e3;
            zzf(str, e);
            return url;
        } catch (MalformedURLException e4) {
            e = e4;
            zzf(str, e);
            return url;
        } catch (URISyntaxException e5) {
            e = e5;
            zzf(str, e);
            return url;
        }
    }

    @WorkerThread
    public final zzt zzc(String str, @Nullable Map map) {
        zzt zztVar = zzt.PERMANENT_FAILURE;
        if (str != null) {
            if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzg)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue() || !zzbb.zze()) {
                    try {
                        try {
                            if (ClientLibraryUtils.isPackageSide()) {
                                TrafficStats.setThreadStatsTag(263);
                            }
                            StringBuilder sb = new StringBuilder(str.length() + 13);
                            sb.append("Pinging URL: ");
                            sb.append(str);
                            zzo.zzd(sb.toString());
                            URL urlZzd = zzd(str);
                            int i2 = zzfxs.zzb;
                            HttpURLConnection httpURLConnection = (HttpURLConnection) urlZzd.openConnection();
                            try {
                                zzbb.zza();
                                String str2 = this.zzb;
                                httpURLConnection.setConnectTimeout(60000);
                                httpURLConnection.setInstanceFollowRedirects(true);
                                httpURLConnection.setReadTimeout(60000);
                                if (str2 != null) {
                                    httpURLConnection.setRequestProperty("User-Agent", str2);
                                }
                                httpURLConnection.setUseCaches(false);
                                if (map != null) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                    }
                                }
                                zzl zzlVar = new zzl(null);
                                zzlVar.zza(httpURLConnection, null);
                                int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                                zzlVar.zzc(httpURLConnection, iHttpUrlConnectionGetResponseCode);
                                if (iHttpUrlConnectionGetResponseCode < 200 || iHttpUrlConnectionGetResponseCode >= 300) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(iHttpUrlConnectionGetResponseCode).length() + 54 + str.length());
                                    sb2.append("Received non-success response code ");
                                    sb2.append(iHttpUrlConnectionGetResponseCode);
                                    sb2.append(" from pinging URL: ");
                                    sb2.append(str);
                                    zzo.zzi(sb2.toString());
                                    if (iHttpUrlConnectionGetResponseCode == 502) {
                                        zztVar = zzt.RETRIABLE_FAILURE;
                                    }
                                } else {
                                    if (((Boolean) zzbd.zzc().zzd(zzbhe.zzjc)).booleanValue()) {
                                        this.zzc = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                    }
                                    zztVar = zzt.SUCCESS;
                                }
                                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                if (!ClientLibraryUtils.isPackageSide()) {
                                    return zztVar;
                                }
                            } catch (Throwable th) {
                                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            if (ClientLibraryUtils.isPackageSide()) {
                                TrafficStats.clearThreadStatsTag();
                            }
                            throw th2;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        String message = e.getMessage();
                        StringBuilder sb3 = new StringBuilder(str.length() + 27 + String.valueOf(message).length());
                        sb3.append("Error while pinging URL: ");
                        sb3.append(str);
                        sb3.append(". ");
                        sb3.append(message);
                        zzo.zzi(sb3.toString());
                        zztVar = zzt.RETRIABLE_FAILURE;
                        if (ClientLibraryUtils.isPackageSide()) {
                        }
                        return zztVar;
                    } catch (IndexOutOfBoundsException e3) {
                        e = e3;
                        zzf(str, e);
                        if (ClientLibraryUtils.isPackageSide()) {
                        }
                        return zztVar;
                    } catch (RuntimeException e4) {
                        e = e4;
                        String message2 = e.getMessage();
                        StringBuilder sb32 = new StringBuilder(str.length() + 27 + String.valueOf(message2).length());
                        sb32.append("Error while pinging URL: ");
                        sb32.append(str);
                        sb32.append(". ");
                        sb32.append(message2);
                        zzo.zzi(sb32.toString());
                        zztVar = zzt.RETRIABLE_FAILURE;
                        if (ClientLibraryUtils.isPackageSide()) {
                        }
                        return zztVar;
                    } catch (MalformedURLException e5) {
                        e = e5;
                        zzf(str, e);
                        if (ClientLibraryUtils.isPackageSide()) {
                        }
                        return zztVar;
                    }
                    TrafficStats.clearThreadStatsTag();
                    return zztVar;
                }
            }
        }
        return zztVar;
    }

    private final void zzf(String str, Throwable th) {
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        zzo.zzi(sb.toString());
        zzbyp.zza(this.zza).zzi(th, "HttpUrlPinger.pingUrl", ((Integer) zzbd.zzc().zzd(zzbhe.zzoi)).intValue() / 100.0f);
    }
}
