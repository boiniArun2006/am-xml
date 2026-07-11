package cIr;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.FirebaseException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f43595n;
    private String rl;

    public static j n(String str) throws FirebaseException {
        JSONObject jSONObject = new JSONObject(str);
        String strEmptyToNull = Strings.emptyToNull(jSONObject.optString("token"));
        String strEmptyToNull2 = Strings.emptyToNull(jSONObject.optString("ttl"));
        if (strEmptyToNull == null || strEmptyToNull2 == null) {
            throw new FirebaseException("Unexpected server response.");
        }
        return new j(strEmptyToNull, strEmptyToNull2);
    }

    public String rl() {
        return this.rl;
    }

    public String t() {
        return this.f43595n;
    }

    private j(String str, String str2) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str2);
        this.f43595n = str;
        this.rl = str2;
    }
}
