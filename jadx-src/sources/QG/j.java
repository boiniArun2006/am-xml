package QG;

import Zlm.Wre;
import com.google.android.exoplayer2.C;
import com.safedk.android.analytics.brandsafety.l;
import h1M.CN3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f7958n;
    private final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f7959t = new HashMap();

    private String O(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C.UTF8_NAME));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i2 = bufferedReader.read(cArr);
            if (i2 == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i2);
        }
    }

    private String n(Map map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append(l.ae);
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), C.UTF8_NAME) : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append(l.ae);
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), C.UTF8_NAME) : "");
        }
        return sb.toString();
    }

    public j nr(String str, String str2) {
        this.f7959t.put(str, str2);
        return this;
    }

    public j(String str, Map map) {
        this.f7958n = str;
        this.rl = map;
    }

    private String rl(String str, Map map) {
        String strN = n(map);
        if (strN.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                strN = "&" + strN;
            }
            return str + strN;
        }
        return str + "?" + strN;
    }

    public w6 t() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        Wre.nr();
        InputStream inputStream = null;
        String strO = null;
        inputStream = null;
        try {
            String strRl = rl(this.f7958n, this.rl);
            CN3.J2().xMQ("GET Request URL: " + strRl);
            httpsURLConnection = (HttpsURLConnection) new URL(strRl).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.f7959t.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        strO = O(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new w6(responseCode, strO);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }
}
