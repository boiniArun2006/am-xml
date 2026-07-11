package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class FontRequest {
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f36562O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f36563n;
    private final List nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f36564t;

    public FontRequest(String str, String str2, String str3, List list) {
        this.f36563n = (String) Preconditions.Uo(str);
        this.rl = (String) Preconditions.Uo(str2);
        this.f36564t = (String) Preconditions.Uo(str3);
        this.nr = (List) Preconditions.Uo(list);
        this.f36562O = 0;
        this.J2 = n(str, str2, str3);
    }

    private String n(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public String J2() {
        return this.rl;
    }

    public String O() {
        return this.f36563n;
    }

    public String Uo() {
        return this.f36564t;
    }

    String nr() {
        return this.J2;
    }

    public List rl() {
        return this.nr;
    }

    public int t() {
        return this.f36562O;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f36563n + ", mProviderPackage: " + this.rl + ", mQuery: " + this.f36564t + ", mCertificates:");
        for (int i2 = 0; i2 < this.nr.size(); i2++) {
            sb.append(" [");
            List list = (List) this.nr.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f36562O);
        return sb.toString();
    }

    public FontRequest(String str, String str2, String str3, int i2) {
        this.f36563n = (String) Preconditions.Uo(str);
        this.rl = (String) Preconditions.Uo(str2);
        this.f36564t = (String) Preconditions.Uo(str3);
        this.nr = null;
        Preconditions.n(i2 != 0);
        this.f36562O = i2;
        this.J2 = n(str, str2, str3);
    }
}
