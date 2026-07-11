package a88;

import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f12727n;
    private final URL rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f12728t;

    public static qz n(String str, URL url, String str2) {
        K7m.CN3.J2(str, "VendorKey is null or empty");
        K7m.CN3.nr(url, "ResourceURL is null");
        K7m.CN3.J2(str2, "VerificationParameters is null or empty");
        return new qz(str, url, str2);
    }

    public static qz rl(URL url) {
        K7m.CN3.nr(url, "ResourceURL is null");
        return new qz(null, url, null);
    }

    public JSONObject J2() {
        JSONObject jSONObject = new JSONObject();
        K7m.w6.KN(jSONObject, "vendorKey", this.f12727n);
        K7m.w6.KN(jSONObject, "resourceUrl", this.rl.toString());
        K7m.w6.KN(jSONObject, "verificationParameters", this.f12728t);
        return jSONObject;
    }

    public String O() {
        return this.f12728t;
    }

    public String nr() {
        return this.f12727n;
    }

    public URL t() {
        return this.rl;
    }

    private qz(String str, URL url, String str2) {
        this.f12727n = str;
        this.rl = url;
        this.f12728t = str2;
    }
}
