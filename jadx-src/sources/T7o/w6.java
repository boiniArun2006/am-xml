package T7o;

import Ip.Dsr;
import T7o.Ml;
import T7o.Wre;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.alightcreative.time.Kw.znsSxz;
import com.google.android.exoplayer2.C;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f10217n;
    private final oSp.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final I28 f10218t = new I28();
    private static final Pattern nr = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Charset f10216O = Charset.forName(C.UTF8_NAME);

    private String J2() {
        try {
            Context context = this.f10217n;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f10217n.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("ContentValues", "No such package: " + this.f10217n.getPackageName(), e2);
            return null;
        }
    }

    private URL Uo(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e2) {
            throw new FirebaseInstallationsException(e2.getMessage(), FirebaseInstallationsException.j.UNAVAILABLE);
        }
    }

    static long az(String str) {
        Preconditions.checkArgument(nr.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private static void mUb() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private HttpURLConnection qie(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty(com.safedk.android.utils.n.f63222c, "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f10217n.getPackageName());
            Dsr dsr = (Dsr) this.rl.get();
            if (dsr != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(dsr.n()));
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                } catch (ExecutionException e3) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e3);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", J2());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.j.UNAVAILABLE);
        }
    }

    private static JSONObject rl(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            return jSONObject;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static JSONObject t() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static boolean xMQ(int i2) {
        return i2 >= 200 && i2 < 300;
    }

    public Wre O(String str, String str2, String str3, String str4) {
        int responseCode;
        Wre wreCk;
        if (!this.f10218t.rl()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.j.UNAVAILABLE);
        }
        URL urlUo = Uo(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i2 = 0; i2 <= 1; i2++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionQie = qie(urlUo, str);
            try {
                try {
                    httpURLConnectionQie.setRequestMethod("POST");
                    httpURLConnectionQie.addRequestProperty("Authorization", znsSxz.JijjF + str4);
                    httpURLConnectionQie.setDoOutput(true);
                    r(httpURLConnectionQie);
                    responseCode = httpURLConnectionQie.getResponseCode();
                    this.f10218t.J2(responseCode);
                } finally {
                    httpURLConnectionQie.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (xMQ(responseCode)) {
                wreCk = ck(httpURLConnectionQie);
            } else {
                gh(httpURLConnectionQie, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    wreCk = Wre.n().rl(Wre.n.AUTH_ERROR).n();
                } else {
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.j.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        mUb();
                        wreCk = Wre.n().rl(Wre.n.BAD_CONFIG).n();
                    }
                }
            }
            return wreCk;
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.j.UNAVAILABLE);
    }

    public Ml nr(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        Ml mlTy;
        if (!this.f10218t.rl()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.j.UNAVAILABLE);
        }
        URL urlUo = Uo(String.format("projects/%s/installations", str3));
        for (int i2 = 0; i2 <= 1; i2++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionQie = qie(urlUo, str);
            try {
                try {
                    httpURLConnectionQie.setRequestMethod("POST");
                    httpURLConnectionQie.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionQie.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    Ik(httpURLConnectionQie, str2, str4);
                    responseCode = httpURLConnectionQie.getResponseCode();
                    this.f10218t.J2(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (xMQ(responseCode)) {
                    mlTy = ty(httpURLConnectionQie);
                } else {
                    gh(httpURLConnectionQie, str4, str, str3);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.j.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        mUb();
                        mlTy = Ml.n().O(Ml.n.BAD_CONFIG).n();
                    }
                    httpURLConnectionQie.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                httpURLConnectionQie.disconnect();
                TrafficStats.clearThreadStatsTag();
                return mlTy;
            } catch (Throwable th) {
                httpURLConnectionQie.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.j.UNAVAILABLE);
    }

    public w6(Context context, oSp.n nVar) {
        this.f10217n = context;
        this.rl = nVar;
    }

    private static String HI(HttpURLConnection httpURLConnection) {
        StringBuilder sb;
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f10216O));
        try {
            try {
                sb = new StringBuilder();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
            sb.append('\n');
            return null;
        }
        String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
        try {
            bufferedReader.close();
        } catch (IOException unused4) {
        }
        return str;
    }

    private void Ik(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        o(httpURLConnection, KN(rl(str, str2)));
    }

    private static byte[] KN(JSONObject jSONObject) {
        return jSONObject.toString().getBytes(C.UTF8_NAME);
    }

    private Wre ck(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f10216O));
        Wre.j jVarN = Wre.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                jVarN.t(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                jVarN.nr(az(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return jVarN.rl(Wre.n.OK).n();
    }

    private static void gh(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String strHI = HI(httpURLConnection);
        if (!TextUtils.isEmpty(strHI)) {
            Log.w("Firebase-Installations", strHI);
            Log.w("Firebase-Installations", n(str, str2, str3));
        }
    }

    private static String n(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    private static void o(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    private void r(HttpURLConnection httpURLConnection) throws IOException {
        o(httpURLConnection, KN(t()));
    }

    private Ml ty(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f10216O));
        Wre.j jVarN = Wre.n();
        Ml.j jVarN2 = Ml.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                jVarN2.J2(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                jVarN2.t(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                jVarN2.nr(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        jVarN.t(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        jVarN.nr(az(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jVarN2.rl(jVarN.n());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return jVarN2.O(Ml.n.OK).n();
    }
}
