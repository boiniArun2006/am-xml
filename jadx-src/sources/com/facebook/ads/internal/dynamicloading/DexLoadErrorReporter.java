package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.caoccao.javet.exceptions.JavetError;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.google.android.exoplayer2.C;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.events.CrashEvent;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class DexLoadErrorReporter {
    public static final double SAMPLING = 0.1d;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AtomicBoolean f52237n = new AtomicBoolean();

    class j extends Thread {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Context f52238n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f52239t;

        j(Context context, String str) {
            this.f52238n = context;
            this.f52239t = str;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(5:69|3|63|4|5)|(4:83|6|77|7)|(5:81|8|(1:10)(1:85)|22|45)|13|75|14|61|18|22|45|(1:(0))) */
        /* JADX WARN: Can't wrap try/catch for region: R(17:0|2|69|3|63|4|5|(4:83|6|77|7)|(5:81|8|(1:10)(1:85)|22|45)|13|75|14|61|18|22|45|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0148, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0149, code lost:
        
            android.util.Log.e(com.facebook.ads.AudienceNetworkAds.TAG, "Can't close connection.", r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0150, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0151, code lost:
        
            android.util.Log.e(com.facebook.ads.AudienceNetworkAds.TAG, "Can't close connection.", r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:67:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            DataOutputStream dataOutputStream;
            InputStream inputStream;
            HttpURLConnection httpURLConnection;
            String string;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            StringBuilder sb;
            DataOutputStream dataOutputStream2;
            byte[] bArr;
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream2;
            super.run();
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://www.facebook.com/adnw_logging/").openConnection()));
                try {
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                    httpURLConnection2.setRequestProperty(com.safedk.android.utils.n.f63222c, "application/json");
                    httpURLConnection2.setRequestProperty("Accept-Charset", C.UTF8_NAME);
                    httpURLConnection2.setRequestProperty("user-agent", "[FBAN/AudienceNetworkForAndroid;FBSN/Android]");
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setDoInput(true);
                    httpURLConnection2.connect();
                    string = UUID.randomUUID().toString();
                    jSONObject = new JSONObject();
                    jSONObject.put("attempt", "0");
                    DexLoadErrorReporter.rl(this.f52238n, jSONObject, string);
                    jSONObject2 = new JSONObject();
                    jSONObject2.put("subtype", "generic");
                    jSONObject2.put("subtype_code", "1320");
                    jSONObject2.put("caught_exception", "1");
                    jSONObject2.put("stacktrace", this.f52239t);
                    jSONObject3 = new JSONObject();
                    jSONObject3.put("id", UUID.randomUUID().toString());
                    jSONObject3.put("type", "debug");
                    sb = new StringBuilder();
                    sb.append("");
                    httpURLConnection = httpURLConnection2;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnection2;
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = null;
                inputStream = null;
                httpURLConnection = null;
            }
            try {
                sb.append(System.currentTimeMillis() / 1000);
                jSONObject3.put("session_time", sb.toString());
                jSONObject3.put("time", "" + (System.currentTimeMillis() / 1000));
                jSONObject3.put("session_id", string);
                jSONObject3.put("data", jSONObject2);
                jSONObject3.put("attempt", "0");
                DexLoadErrorReporter.rl(this.f52238n, jSONObject2, string);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject3);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("data", jSONObject);
                jSONObject4.put(CrashEvent.f62787f, jSONArray);
                String string2 = jSONObject4.toString();
                dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                try {
                    dataOutputStream2.writeBytes("payload=" + URLEncoder.encode(string2, C.UTF8_NAME));
                    dataOutputStream2.flush();
                    bArr = new byte[16384];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    inputStream2 = httpURLConnection.getInputStream();
                } catch (Throwable th3) {
                    th = th3;
                    dataOutputStream = dataOutputStream2;
                    inputStream = null;
                    try {
                        Log.e(AudienceNetworkAds.TAG, "Can't send error.", th);
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (Exception e2) {
                                Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e2);
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception e3) {
                                Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e3);
                            }
                        }
                        if (httpURLConnection == null) {
                            return;
                        }
                        httpURLConnection.disconnect();
                    } finally {
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                dataOutputStream = null;
                inputStream = null;
                Log.e(AudienceNetworkAds.TAG, "Can't send error.", th);
                if (dataOutputStream != null) {
                }
                if (inputStream != null) {
                }
                if (httpURLConnection == null) {
                }
                httpURLConnection.disconnect();
            }
            while (true) {
                try {
                    int i2 = inputStream2.read(bArr);
                    if (i2 == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i2);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = inputStream2;
                    dataOutputStream = dataOutputStream2;
                    Log.e(AudienceNetworkAds.TAG, "Can't send error.", th);
                    if (dataOutputStream != null) {
                    }
                    if (inputStream != null) {
                    }
                    if (httpURLConnection == null) {
                    }
                }
                httpURLConnection.disconnect();
            }
            byteArrayOutputStream.flush();
            dataOutputStream2.close();
            inputStream2.close();
            httpURLConnection.disconnect();
        }
    }

    public static void reportDexLoadingIssue(Context context, String str, double d2) {
        AtomicBoolean atomicBoolean = f52237n;
        if (atomicBoolean.get() || Math.random() >= d2) {
            return;
        }
        atomicBoolean.set(true);
        new j(context, str).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void rl(Context context, JSONObject jSONObject, String str) throws JSONException, PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", AppLovinBridge.f61290h);
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put(JavetError.PARAMETER_OS, "Android");
    }
}
