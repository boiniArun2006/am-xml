package nl4;

import R0.CN3;
import com.google.firebase.perf.util.Timer;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class w6 implements ResponseHandler {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ResponseHandler f71228n;
    private final Timer rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CN3 f71229t;

    @Override // org.apache.http.client.ResponseHandler
    public Object handleResponse(HttpResponse httpResponse) {
        this.f71229t.r(this.rl.t());
        this.f71229t.gh(httpResponse.getStatusLine().getStatusCode());
        Long lN2 = Ml.n(httpResponse);
        if (lN2 != null) {
            this.f71229t.ck(lN2.longValue());
        }
        String strRl = Ml.rl(httpResponse);
        if (strRl != null) {
            this.f71229t.HI(strRl);
        }
        this.f71229t.rl();
        return this.f71228n.handleResponse(httpResponse);
    }

    public w6(ResponseHandler responseHandler, Timer timer, CN3 cn3) {
        this.f71228n = responseHandler;
        this.rl = timer;
        this.f71229t = cn3;
    }
}
