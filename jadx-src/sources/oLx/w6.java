package oLx;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.firebase.FirebaseException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f71429n;
    private String rl;

    public static w6 n(String str) throws FirebaseException {
        JSONObject jSONObject = new JSONObject(str);
        String strEmptyToNull = Strings.emptyToNull(jSONObject.optString(ClientData.KEY_CHALLENGE));
        String strEmptyToNull2 = Strings.emptyToNull(jSONObject.optString("ttl"));
        if (strEmptyToNull == null || strEmptyToNull2 == null) {
            throw new FirebaseException("Unexpected server response.");
        }
        return new w6(strEmptyToNull, strEmptyToNull2);
    }

    public String rl() {
        return this.f71429n;
    }

    private w6(String str, String str2) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str2);
        this.f71429n = str;
        this.rl = str2;
    }
}
