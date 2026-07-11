package ETF;

import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class n implements j {
    @Override // ETF.j
    public HttpURLConnection n(URL url) {
        return (HttpURLConnection) url.openConnection();
    }
}
