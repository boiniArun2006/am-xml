package ko7;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.CN3;
import com.google.firebase.remoteconfig.internal.Wre;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Wre f70139n;
    Wre rl;

    public static j n(Wre wre, Wre wre2) {
        return new j(wre, wre2);
    }

    private String t(String str) {
        String strNr = nr(this.f70139n, str);
        if (strNr != null) {
            return strNr;
        }
        String strNr2 = nr(this.rl, str);
        return strNr2 != null ? strNr2 : "";
    }

    j(Wre wre, Wre wre2) {
        this.f70139n = wre;
        this.rl = wre2;
    }

    private static String nr(Wre wre, String str) {
        CN3 cn3J2 = wre.J2();
        if (cn3J2 == null) {
            return null;
        }
        try {
            return cn3J2.Uo().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    q6T.I28 rl(CN3 cn3) throws FirebaseRemoteConfigClientException {
        JSONArray jSONArrayMUb = cn3.mUb();
        long jGh = cn3.gh();
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < jSONArrayMUb.length(); i2++) {
            try {
                JSONObject jSONObject = jSONArrayMUb.getJSONObject(i2);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                String strOptString = jSONArray.optString(0, "");
                hashSet.add(q6T.Ml.n().nr(string).J2(jSONObject.getString("variantId")).rl(strOptString).t(t(strOptString)).O(jGh).n());
            } catch (JSONException e2) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e2);
            }
        }
        return q6T.I28.n(hashSet);
    }
}
