package WoV;

import J2B.CN3;
import J2B.fuX;
import Vy.Ml;
import Vy.Pl;
import Vy.qz;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;
import upM.Wre;
import vv.C2410n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {
    private long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private EnumC0420j f11556O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f11557n;
    private C2410n nr;
    private pLC.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Vy.j f11558t;

    /* JADX INFO: renamed from: WoV.j$j, reason: collision with other inner class name */
    enum EnumC0420j {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public void KN(String str) {
        mUb(str, null);
    }

    public void O(Pl pl, Ml ml) {
        J2(pl, ml, null);
    }

    public void ViF() {
    }

    public void aYN() {
        qie(null);
    }

    public void HI() {
        this.rl.clear();
    }

    void Uo(WebView webView) {
        this.rl = new pLC.n(webView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebView WPU() {
        return (WebView) this.rl.get();
    }

    public boolean Z() {
        return this.rl.get() != 0;
    }

    public void az(C2410n c2410n) {
        this.nr = c2410n;
    }

    public void ck(String str, long j2) {
        if (j2 >= this.J2) {
            this.f11556O = EnumC0420j.AD_STATE_VISIBLE;
            fuX.n().az(WPU(), this.f11557n, str);
        }
    }

    public void gh(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        upM.w6.xMQ(jSONObject, StatsEvent.f62824A, Long.valueOf(date.getTime()));
        fuX.n().mUb(WPU(), jSONObject);
    }

    public C2410n o() {
        return this.nr;
    }

    public Vy.j r() {
        return this.f11558t;
    }

    public void t(Vy.j jVar) {
        this.f11558t = jVar;
    }

    public void xMQ(String str, long j2) {
        if (j2 >= this.J2) {
            EnumC0420j enumC0420j = this.f11556O;
            EnumC0420j enumC0420j2 = EnumC0420j.AD_STATE_NOTVISIBLE;
            if (enumC0420j != enumC0420j2) {
                this.f11556O = enumC0420j2;
                fuX.n().az(WPU(), this.f11557n, str);
            }
        }
    }

    public j(String str) {
        n();
        this.f11557n = str;
        this.rl = new pLC.n(null);
    }

    public void Ik(boolean z2) {
        String str;
        if (Z()) {
            if (z2) {
                str = "locked";
            } else {
                str = "unlocked";
            }
            fuX.n().nr(WPU(), this.f11557n, str);
        }
    }

    protected void J2(Pl pl, Ml ml, JSONObject jSONObject) {
        String strGh = pl.gh();
        JSONObject jSONObject2 = new JSONObject();
        upM.w6.xMQ(jSONObject2, "environment", PangleCreativeInfo.f62498a);
        upM.w6.xMQ(jSONObject2, "adSessionType", ml.nr());
        upM.w6.xMQ(jSONObject2, "deviceInfo", upM.n.nr());
        upM.w6.xMQ(jSONObject2, "deviceCategory", upM.j.n().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        upM.w6.xMQ(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        upM.w6.xMQ(jSONObject3, "partnerName", ml.xMQ().rl());
        upM.w6.xMQ(jSONObject3, "partnerVersion", ml.xMQ().t());
        upM.w6.xMQ(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        upM.w6.xMQ(jSONObject4, "libraryVersion", "1.5.7-Vungle");
        upM.w6.xMQ(jSONObject4, "appId", CN3.t().n().getApplicationContext().getPackageName());
        upM.w6.xMQ(jSONObject2, PangleCreativeInfo.f62498a, jSONObject4);
        if (ml.O() != null) {
            upM.w6.xMQ(jSONObject2, "contentUrl", ml.O());
        }
        if (ml.J2() != null) {
            upM.w6.xMQ(jSONObject2, "customReferenceData", ml.J2());
        }
        ml.mUb();
        JSONObject jSONObject5 = new JSONObject();
        for (qz qzVar : ml.gh()) {
            upM.w6.xMQ(jSONObject5, qzVar.t(), qzVar.nr());
        }
        fuX.n().Uo(WPU(), strGh, jSONObject2, jSONObject5, jSONObject);
    }

    public void S() {
        fuX.n().qie(WPU(), this.f11557n);
    }

    public void XQ() {
        fuX.n().rl(WPU(), this.f11557n);
    }

    public void mUb(String str, JSONObject jSONObject) {
        fuX.n().O(WPU(), this.f11557n, str, jSONObject);
    }

    public void n() {
        this.J2 = Wre.rl();
        this.f11556O = EnumC0420j.AD_STATE_IDLE;
    }

    public void nr(Vy.w6 w6Var) {
        fuX.n().J2(WPU(), this.f11557n, w6Var.nr());
    }

    public void qie(JSONObject jSONObject) {
        fuX.n().ty(WPU(), this.f11557n, jSONObject);
    }

    public void rl(float f3) {
        fuX.n().t(WPU(), this.f11557n, f3);
    }

    public void ty(boolean z2) {
        String str;
        if (Z()) {
            if (z2) {
                str = "foregrounded";
            } else {
                str = "backgrounded";
            }
            fuX.n().HI(WPU(), this.f11557n, str);
        }
    }
}
