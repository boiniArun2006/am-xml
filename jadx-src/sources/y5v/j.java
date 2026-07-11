package y5v;

import K7m.Wre;
import a88.Ml;
import a88.Pl;
import a88.qz;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import com.safedk.android.analytics.events.base.StatsEvent;
import g4f.CN3;
import g4f.fuX;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {
    private long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private EnumC1279j f75549O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f75550n;
    private VI.n nr;
    private r1j.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a88.j f75551t;

    /* JADX INFO: renamed from: y5v.j$j, reason: collision with other inner class name */
    enum EnumC1279j {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public void J2(Pl pl, Ml ml) {
        Uo(pl, ml, null);
    }

    public void ViF() {
    }

    public void aYN() {
        az(null);
    }

    public void xMQ(String str) {
        gh(str, null);
    }

    public void HI() {
        this.rl.clear();
    }

    void KN(WebView webView) {
        this.rl = new r1j.n(webView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebView WPU() {
        return (WebView) this.rl.get();
    }

    public boolean Z() {
        return this.rl.get() != 0;
    }

    public void ck(String str, long j2) {
        if (j2 >= this.J2) {
            this.f75549O = EnumC1279j.AD_STATE_VISIBLE;
            fuX.n().az(WPU(), this.f75550n, str);
        }
    }

    public void mUb(String str, long j2) {
        if (j2 >= this.J2) {
            EnumC1279j enumC1279j = this.f75549O;
            EnumC1279j enumC1279j2 = EnumC1279j.AD_STATE_NOTVISIBLE;
            if (enumC1279j != enumC1279j2) {
                this.f75549O = enumC1279j2;
                fuX.n().az(WPU(), this.f75550n, str);
            }
        }
    }

    public void nr(a88.j jVar) {
        this.f75551t = jVar;
    }

    public VI.n o() {
        return this.nr;
    }

    public void qie(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        K7m.w6.KN(jSONObject, StatsEvent.f62824A, Long.valueOf(date.getTime()));
        fuX.n().mUb(WPU(), jSONObject);
    }

    public a88.j r() {
        return this.f75551t;
    }

    public void t(VI.n nVar) {
        this.nr = nVar;
    }

    public j(String str) {
        n();
        this.f75550n = str;
        this.rl = new r1j.n(null);
    }

    public void Ik(boolean z2) {
        String str;
        if (Z()) {
            if (z2) {
                str = "locked";
            } else {
                str = "unlocked";
            }
            fuX.n().nr(WPU(), this.f75550n, str);
        }
    }

    public void O(a88.w6 w6Var) {
        fuX.n().J2(WPU(), this.f75550n, w6Var.nr());
    }

    public void S() {
        fuX.n().qie(WPU(), this.f75550n);
    }

    protected void Uo(Pl pl, Ml ml, JSONObject jSONObject) {
        String strAz = pl.az();
        JSONObject jSONObject2 = new JSONObject();
        K7m.w6.KN(jSONObject2, "environment", PangleCreativeInfo.f62498a);
        K7m.w6.KN(jSONObject2, "adSessionType", ml.t());
        K7m.w6.KN(jSONObject2, "deviceInfo", K7m.n.nr());
        K7m.w6.KN(jSONObject2, "deviceCategory", K7m.j.n().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        K7m.w6.KN(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        K7m.w6.KN(jSONObject3, "partnerName", ml.KN().rl());
        K7m.w6.KN(jSONObject3, "partnerVersion", ml.KN().t());
        K7m.w6.KN(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        K7m.w6.KN(jSONObject4, "libraryVersion", "1.5.4-Fyber");
        K7m.w6.KN(jSONObject4, "appId", CN3.t().n().getApplicationContext().getPackageName());
        K7m.w6.KN(jSONObject2, PangleCreativeInfo.f62498a, jSONObject4);
        if (ml.nr() != null) {
            K7m.w6.KN(jSONObject2, "contentUrl", ml.nr());
        }
        if (ml.O() != null) {
            K7m.w6.KN(jSONObject2, "customReferenceData", ml.O());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (qz qzVar : ml.xMQ()) {
            K7m.w6.KN(jSONObject5, qzVar.nr(), qzVar.O());
        }
        fuX.n().Uo(WPU(), strAz, jSONObject2, jSONObject5, jSONObject);
    }

    public void XQ() {
        fuX.n().rl(WPU(), this.f75550n);
    }

    public void az(JSONObject jSONObject) {
        fuX.n().ty(WPU(), this.f75550n, jSONObject);
    }

    public void gh(String str, JSONObject jSONObject) {
        fuX.n().O(WPU(), this.f75550n, str, jSONObject);
    }

    public void n() {
        this.J2 = Wre.rl();
        this.f75549O = EnumC1279j.AD_STATE_IDLE;
    }

    public void rl(float f3) {
        fuX.n().t(WPU(), this.f75550n, f3);
    }

    public void ty(boolean z2) {
        String str;
        if (Z()) {
            if (z2) {
                str = "foregrounded";
            } else {
                str = "backgrounded";
            }
            fuX.n().HI(WPU(), this.f75550n, str);
        }
    }
}
