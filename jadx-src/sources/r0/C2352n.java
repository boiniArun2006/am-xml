package r0;

import Msr.Ml;
import android.text.TextUtils;
import org.json.JSONObject;
import u9n.w6;

/* JADX INFO: renamed from: r0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class C2352n {
    public static w6 n(String str) {
        if (TextUtils.isEmpty(str)) {
            eh.n.rl("%s : empty one dt", "OneDTParser");
            return new w6("", -1L);
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("data");
            if (jSONObjectOptJSONObject != null && "onedtid".equalsIgnoreCase(jSONObjectOptJSONObject.optString("propertyName", ""))) {
                return new w6(jSONObjectOptJSONObject.optString("propertyValue", ""), jSONObjectOptJSONObject.optLong("refreshTime", -1L));
            }
        } catch (Exception e2) {
            Msr.n.n(Ml.ONE_DT_PARSE_ERROR, e2);
            eh.n.rl("%s : failed parse one dt", "OneDTParser");
        }
        return new w6("", -1L);
    }
}
