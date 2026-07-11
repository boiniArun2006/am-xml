package WoV;

import J2B.CN3;
import J2B.fuX;
import Vy.Ml;
import Vy.Pl;
import Vy.qz;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import upM.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class w6 extends WoV.j {
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
                w6.this.Uo(null);
            }
            webView.destroy();
            return true;
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WebView f11563n;

        n() {
            this.f11563n = w6.this.Uo;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11563n.destroy();
        }
    }

    @Override // WoV.j
    public void O(Pl pl, Ml ml) {
        JSONObject jSONObject = new JSONObject();
        Map mapUo = ml.Uo();
        for (String str : mapUo.keySet()) {
            upM.w6.xMQ(jSONObject, str, ((qz) mapUo.get(str)).O());
        }
        J2(pl, ml, jSONObject);
    }

    void g() {
        WebView webView = new WebView(CN3.t().n());
        this.Uo = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.Uo.getSettings().setAllowContentAccess(false);
        this.Uo.getSettings().setAllowFileAccess(false);
        this.Uo.setWebViewClient(new j());
        Uo(this.Uo);
        fuX.n().ck(this.Uo, this.mUb);
        for (String str : this.xMQ.keySet()) {
            fuX.n().Ik(this.Uo, ((qz) this.xMQ.get(str)).rl().toExternalForm(), str);
        }
        this.KN = Long.valueOf(Wre.rl());
    }

    public w6(String str, Map map, String str2) {
        super(str);
        this.KN = null;
        this.xMQ = map;
        this.mUb = str2;
    }

    @Override // WoV.j
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

    @Override // WoV.j
    public void ViF() {
        super.ViF();
        g();
    }
}
