package Vy;

import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f11407n;
    private final URL rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f11408t;

    public static qz n(String str, URL url, String str2) {
        upM.CN3.J2(str, "VendorKey is null or empty");
        upM.CN3.nr(url, "ResourceURL is null");
        upM.CN3.J2(str2, "VerificationParameters is null or empty");
        return new qz(str, url, str2);
    }

    public JSONObject O() {
        JSONObject jSONObject = new JSONObject();
        upM.w6.xMQ(jSONObject, "vendorKey", this.f11407n);
        upM.w6.xMQ(jSONObject, "resourceUrl", this.rl.toString());
        upM.w6.xMQ(jSONObject, "verificationParameters", this.f11408t);
        return jSONObject;
    }

    public String nr() {
        return this.f11408t;
    }

    public URL rl() {
        return this.rl;
    }

    public String t() {
        return this.f11407n;
    }

    private qz(String str, URL url, String str2) {
        this.f11407n = str;
        this.rl = url;
        this.f11408t = str2;
    }
}
