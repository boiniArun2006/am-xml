package X3O;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.StorageException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class I28 {
    public static final Uri gh = Uri.parse("https://firebasestorage.googleapis.com/v0");
    static ETF.j qie = new ETF.n();
    private String J2;
    private InputStream KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f11738O;
    private int Uo;
    private Map mUb = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Exception f11739n;
    private Map nr;
    private O6.fuX rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Context f11740t;
    private HttpURLConnection xMQ;

    protected byte[] KN() {
        return null;
    }

    protected abstract String O();

    protected JSONObject Uo() {
        return null;
    }

    public final void e() {
        this.f11739n = null;
        this.f11738O = 0;
    }

    protected Map qie() {
        return null;
    }

    protected int xMQ() {
        return 0;
    }

    private void aYN(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C.UTF8_NAME));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        sb.append(line);
                    }
                } finally {
                    bufferedReader.close();
                }
            }
        }
        this.J2 = sb.toString();
        if (S()) {
            return;
        }
        this.f11739n = new IOException(this.J2);
    }

    private boolean nr(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(HrvQKfmFZJudBc.TPJmiL)).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        this.f11739n = new SocketException("Network subsystem is unavailable");
        this.f11738O = -2;
        return false;
    }

    public int HI() {
        return this.f11738O;
    }

    public Exception J2() {
        return this.f11739n;
    }

    public boolean S() {
        int i2 = this.f11738O;
        return i2 >= 200 && i2 < 300;
    }

    public void X(String str, String str2) {
        this.mUb.put(str, str2);
    }

    public Uri XQ() {
        return this.rl.t();
    }

    public InputStream Z() {
        return this.KN;
    }

    public String az() {
        return this.J2;
    }

    public Map ck() {
        return this.nr;
    }

    public void fD(String str, String str2) {
        if (this.f11739n != null) {
            this.f11738O = -1;
            return;
        }
        if (Log.isLoggable("NetworkRequest", 3)) {
            Log.d("NetworkRequest", "sending network request " + O() + " " + XQ());
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f11740t.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f11738O = -2;
            this.f11739n = new SocketException("Network subsystem is unavailable");
            return;
        }
        try {
            HttpURLConnection httpURLConnectionT = t();
            this.xMQ = httpURLConnectionT;
            httpURLConnectionT.setRequestMethod(O());
            rl(this.xMQ, str, str2);
            ViF(this.xMQ);
            if (Log.isLoggable("NetworkRequest", 3)) {
                Log.d("NetworkRequest", "network request result " + this.f11738O);
            }
        } catch (IOException e2) {
            Log.w("NetworkRequest", "error sending network request " + O() + " " + XQ(), e2);
            this.f11739n = e2;
            this.f11738O = -2;
        }
    }

    public void iF() {
        HttpURLConnection httpURLConnection = this.xMQ;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    String mUb() {
        return gh(this.rl.n());
    }

    protected O6.fuX o() {
        return this.rl;
    }

    public int r() {
        return this.Uo;
    }

    public JSONObject ty() {
        if (TextUtils.isEmpty(this.J2)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(this.J2);
        } catch (JSONException e2) {
            Log.e("NetworkRequest", "error parsing result into JSON:" + this.J2, e2);
            return new JSONObject();
        }
    }

    public I28(O6.fuX fux, com.google.firebase.Wre wre) {
        Preconditions.checkNotNull(fux);
        Preconditions.checkNotNull(wre);
        this.rl = fux;
        this.f11740t = wre.qie();
        X("x-firebase-gmpid", wre.ck().t());
    }

    private void E2() throws IOException {
        if (S()) {
            nY(this.KN);
        } else {
            WPU(this.KN);
        }
    }

    private void ViF(HttpURLConnection httpURLConnection) {
        Preconditions.checkNotNull(httpURLConnection);
        this.f11738O = httpURLConnection.getResponseCode();
        this.nr = httpURLConnection.getHeaderFields();
        this.Uo = httpURLConnection.getContentLength();
        if (S()) {
            this.KN = httpURLConnection.getInputStream();
        } else {
            this.KN = httpURLConnection.getErrorStream();
        }
    }

    private final void g(String str, String str2) {
        fD(str, str2);
        try {
            E2();
        } catch (IOException e2) {
            Log.w("NetworkRequest", "error sending network request " + O() + " " + XQ(), e2);
            this.f11739n = e2;
            this.f11738O = -2;
        }
        iF();
    }

    private static String gh(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return "";
        }
        if (path.startsWith("/")) {
            return path.substring(1);
        }
        return path;
    }

    private void rl(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        byte[] bArrKN;
        int iXMQ;
        Preconditions.checkNotNull(httpURLConnection);
        if (!TextUtils.isEmpty(str)) {
            httpURLConnection.setRequestProperty("Authorization", "Firebase " + str);
        } else {
            Log.w("NetworkRequest", "no auth token for request");
        }
        if (!TextUtils.isEmpty(str2)) {
            httpURLConnection.setRequestProperty("x-firebase-appcheck", str2);
        } else {
            Log.w("NetworkRequest", "No App Check token for request.");
        }
        httpURLConnection.setRequestProperty("X-Firebase-Storage-Version", "Android/21.0.2");
        for (Map.Entry entry : this.mUb.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject jSONObjectUo = Uo();
        if (jSONObjectUo != null) {
            bArrKN = jSONObjectUo.toString().getBytes(C.UTF8_NAME);
            iXMQ = bArrKN.length;
        } else {
            bArrKN = KN();
            iXMQ = xMQ();
            if (iXMQ == 0 && bArrKN != null) {
                iXMQ = bArrKN.length;
            }
        }
        if (bArrKN != null && bArrKN.length > 0) {
            if (jSONObjectUo != null) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
            }
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(iXMQ));
        } else {
            httpURLConnection.setRequestProperty("Content-Length", "0");
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (bArrKN != null && bArrKN.length > 0) {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            if (outputStream != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                try {
                    bufferedOutputStream.write(bArrKN, 0, iXMQ);
                    return;
                } finally {
                    bufferedOutputStream.close();
                }
            }
            Log.e("NetworkRequest", "Unable to write to the http request!");
        }
    }

    private HttpURLConnection t() {
        Uri uriXQ = XQ();
        Map mapQie = qie();
        if (mapQie != null) {
            Uri.Builder builderBuildUpon = uriXQ.buildUpon();
            for (Map.Entry entry : mapQie.entrySet()) {
                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            uriXQ = builderBuildUpon.build();
        }
        return qie.n(new URL(uriXQ.toString()));
    }

    public String Ik(String str) {
        List list;
        Map mapCk = ck();
        if (mapCk != null && (list = (List) mapCk.get(str)) != null && list.size() > 0) {
            return (String) list.get(0);
        }
        return null;
    }

    protected void WPU(InputStream inputStream) throws IOException {
        aYN(inputStream);
    }

    public void n(TaskCompletionSource taskCompletionSource, Object obj) {
        Exception excJ2 = J2();
        if (S() && excJ2 == null) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(StorageException.O(excJ2, HI()));
        }
    }

    protected void nY(InputStream inputStream) throws IOException {
        aYN(inputStream);
    }

    public void te(String str, String str2, Context context) {
        if (!nr(context)) {
            return;
        }
        g(str, str2);
    }
}
