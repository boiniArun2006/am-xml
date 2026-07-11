package YSF;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import h1M.CN3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Ml implements n, po.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private po.j f12092n;

    private static String rl(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // YSF.n
    public void O(String str, Bundle bundle) {
        po.j jVar = this.f12092n;
        if (jVar != null) {
            try {
                jVar.n("$A$:" + rl(str, bundle));
            } catch (JSONException unused) {
                CN3.J2().gh("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // po.n
    public void n(po.j jVar) {
        this.f12092n = jVar;
        CN3.J2().rl("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
