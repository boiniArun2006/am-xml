package k6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class j implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HttpURLConnection f69654n;

    @Override // k6.Ml
    public boolean isSuccessful() {
        try {
            return this.f69654n.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    private String n(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    @Override // k6.Ml
    public InputStream bzg() {
        return this.f69654n.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f69654n.disconnect();
    }

    @Override // k6.Ml
    public String nHg() {
        return this.f69654n.getContentType();
    }

    public j(HttpURLConnection httpURLConnection) {
        this.f69654n = httpURLConnection;
    }

    @Override // k6.Ml
    public String ul() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f69654n.getURL() + ". Failed with " + this.f69654n.getResponseCode() + "\n" + n(this.f69654n);
        } catch (IOException e2) {
            x0.CN3.nr("get error failed ", e2);
            return e2.getMessage();
        }
    }
}
