package F5;

import QNA.ci;
import android.text.TextUtils;
import com.safedk.android.analytics.AppLovinBridge;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class w6 implements o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2510n;
    private final QG.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final h1M.CN3 f2511t;

    public w6(String str, QG.n nVar) {
        this(str, nVar, h1M.CN3.J2());
    }

    w6(String str, QG.n nVar, h1M.CN3 cn3) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f2511t = cn3;
        this.rl = nVar;
        this.f2510n = str;
    }

    private Map J2(C c2) {
        HashMap map = new HashMap();
        map.put("build_version", c2.KN);
        map.put("display_version", c2.Uo);
        map.put("source", Integer.toString(c2.xMQ));
        String str = c2.J2;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    private JSONObject O(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e2) {
            this.f2511t.qie("Failed to parse settings JSON from " + this.f2510n, e2);
            this.f2511t.gh("Settings response " + str);
            return null;
        }
    }

    private QG.j rl(QG.j jVar, C c2) {
        t(jVar, "X-CRASHLYTICS-GOOGLE-APP-ID", c2.f2492n);
        t(jVar, "X-CRASHLYTICS-API-CLIENT-TYPE", AppLovinBridge.f61290h);
        t(jVar, "X-CRASHLYTICS-API-CLIENT-VERSION", ci.Ik());
        t(jVar, com.safedk.android.utils.n.f63222c, "application/json");
        t(jVar, "X-CRASHLYTICS-DEVICE-MODEL", c2.rl);
        t(jVar, "X-CRASHLYTICS-OS-BUILD-VERSION", c2.f2493t);
        t(jVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", c2.nr);
        t(jVar, "X-CRASHLYTICS-INSTALLATION-ID", c2.f2491O.n().t());
        return jVar;
    }

    private void t(QG.j jVar, String str, String str2) {
        if (str2 != null) {
            jVar.nr(str, str2);
        }
    }

    boolean KN(int i2) {
        return i2 == 200 || i2 == 201 || i2 == 202 || i2 == 203;
    }

    protected QG.j nr(Map map) {
        return this.rl.n(this.f2510n, map).nr("User-Agent", "Crashlytics Android SDK/" + ci.Ik()).nr("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject Uo(QG.w6 w6Var) {
        int iRl = w6Var.rl();
        this.f2511t.xMQ("Settings response code was: " + iRl);
        if (KN(iRl)) {
            return O(w6Var.n());
        }
        this.f2511t.nr("Settings request failed; (status: " + iRl + ") from " + this.f2510n);
        return null;
    }

    @Override // F5.o
    public JSONObject n(C c2, boolean z2) {
        Zlm.Wre.nr();
        if (z2) {
            try {
                Map mapJ2 = J2(c2);
                QG.j jVarRl = rl(nr(mapJ2), c2);
                this.f2511t.rl("Requesting settings from " + this.f2510n);
                this.f2511t.xMQ("Settings query params were: " + mapJ2);
                return Uo(jVarRl.t());
            } catch (IOException e2) {
                this.f2511t.O("Settings request failed.", e2);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }
}
