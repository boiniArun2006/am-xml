package oLx;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f71428n;

    public String n() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("playIntegrityToken", this.f71428n);
        return jSONObject.toString();
    }

    public j(String str) {
        this.f71428n = str;
    }
}
