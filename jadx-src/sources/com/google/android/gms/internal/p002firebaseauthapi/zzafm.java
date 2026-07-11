package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.exoplayer2.C;
import com.google.android.gms.common.internal.Preconditions;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzafm {
    private static final boolean zza(int i2) {
        return i2 >= 200 && i2 < 300;
    }

    private static void zza(HttpURLConnection httpURLConnection, zzafn<?> zzafnVar, Type type) {
        try {
            try {
                int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                InputStream inputStreamUrlConnectionGetInputStream = zza(iHttpUrlConnectionGetResponseCode) ? AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnection) : httpURLConnection.getErrorStream();
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamUrlConnectionGetInputStream, C.UTF8_NAME));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb.append(line);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String string = sb.toString();
                if (zza(iHttpUrlConnectionGetResponseCode)) {
                    zzafnVar.zza((zzaer) zzaep.zza(string, type));
                } else {
                    zzafnVar.zza((String) zzaep.zza(string, String.class));
                }
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (zzaci e2) {
                e = e2;
                zzafnVar.zza(e.getMessage());
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (SocketTimeoutException unused) {
                zzafnVar.zza("TIMEOUT");
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (IOException e3) {
                e = e3;
                zzafnVar.zza(e.getMessage());
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            }
        } catch (Throwable th3) {
            AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            throw th3;
        }
    }

    public static void zza(String str, zzafn<?> zzafnVar, Type type, zzaew zzaewVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            zzaewVar.zza(httpURLConnection);
            zza(httpURLConnection, zzafnVar, type);
        } catch (SocketTimeoutException unused) {
            zzafnVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzafnVar.zza("<<Network Error>>");
        } catch (IOException e2) {
            zzafnVar.zza(e2.getMessage());
        }
    }

    public static void zza(String str, zzaes zzaesVar, zzafn<?> zzafnVar, Type type, zzaew zzaewVar) {
        try {
            Preconditions.checkNotNull(zzaesVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzaesVar.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzaewVar.zza(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(AdMobNetworkBridge.urlConnectionGetOutputStream(httpURLConnection), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                zza(httpURLConnection, zzafnVar, type);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            zzafnVar.zza("TIMEOUT");
        } catch (IOException e2) {
            e = e2;
            zzafnVar.zza(e.getMessage());
        } catch (NullPointerException e3) {
            e = e3;
            zzafnVar.zza(e.getMessage());
        } catch (UnknownHostException unused2) {
            zzafnVar.zza("<<Network Error>>");
        } catch (JSONException e4) {
            e = e4;
            zzafnVar.zza(e.getMessage());
        }
    }
}
