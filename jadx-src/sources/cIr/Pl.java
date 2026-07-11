package cIr;

import com.vungle.ads.internal.presenter.MRAIDPresenter;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f43579n;
    private String rl;

    public static Pl n(String str) {
        JSONObject jSONObject = new JSONObject(new JSONObject(str).optString(MRAIDPresenter.ERROR));
        return new Pl(jSONObject.optInt("code"), jSONObject.optString("message"));
    }

    public int rl() {
        return this.f43579n;
    }

    public String t() {
        return this.rl;
    }

    private Pl(int i2, String str) {
        this.f43579n = i2;
        this.rl = str;
    }
}
