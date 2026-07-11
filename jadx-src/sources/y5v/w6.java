package y5v;

import K7m.Wre;
import a88.Ml;
import a88.Pl;
import a88.qz;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import g4f.CN3;
import g4f.fuX;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class w6 extends y5v.j {
    private Long KN;
    private WebView Uo;
    private final String mUb;
    private final Map xMQ;

    class j extends WebViewClient {
        j() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (w6.this.WPU() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                w6.this.KN(null);
            }
            webView.destroy();
            return true;
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WebView f75556n;

        n() {
            this.f75556n = w6.this.Uo;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f75556n.destroy();
        }
    }

    @Override // y5v.j
    public void J2(Pl pl, Ml ml) {
        JSONObject jSONObject = new JSONObject();
        Map mapJ2 = ml.J2();
        for (String str : mapJ2.keySet()) {
            K7m.w6.KN(jSONObject, str, ((qz) mapJ2.get(str)).J2());
        }
        Uo(pl, ml, jSONObject);
    }

    void g() {
        WebView webView = new WebView(CN3.t().n());
        this.Uo = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.Uo.getSettings().setAllowContentAccess(false);
        this.Uo.getSettings().setAllowFileAccess(false);
        this.Uo.setWebViewClient(new j());
        KN(this.Uo);
        fuX.n().ck(this.Uo, this.mUb);
        for (String str : this.xMQ.keySet()) {
            fuX.n().Ik(this.Uo, ((qz) this.xMQ.get(str)).t().toExternalForm(), str);
        }
        this.KN = Long.valueOf(Wre.rl());
    }

    public w6(String str, Map map, String str2) {
        super(str);
        this.KN = null;
        this.xMQ = map;
        this.mUb = str2;
    }

    @Override // y5v.j
    public void HI() {
        long jConvert;
        super.HI();
        if (this.KN == null) {
            jConvert = 4000;
        } else {
            jConvert = TimeUnit.MILLISECONDS.convert(Wre.rl() - this.KN.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new n(), Math.max(4000 - jConvert, 2000L));
        this.Uo = null;
    }

    @Override // y5v.j
    public void ViF() {
        super.ViF();
        g();
    }
}
