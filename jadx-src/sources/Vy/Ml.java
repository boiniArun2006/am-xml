package Vy;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ml {
    private final String J2;
    private final I28 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f11382O;
    private final String Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C f11383n;
    private final Map nr;
    private final WebView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f11384t;

    public static Ml rl(C c2, String str, List list, String str2, String str3) {
        return t(c2, str, list, str2, str3, null);
    }

    public o mUb() {
        return null;
    }

    public static Ml n(C c2, WebView webView, String str, String str2) {
        upM.CN3.nr(c2, "Partner is null");
        upM.CN3.nr(webView, "WebView is null");
        if (str2 != null) {
            upM.CN3.O(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new Ml(c2, webView, null, null, str, str2, I28.HTML, null);
    }

    public static Ml t(C c2, String str, List list, String str2, String str3, o oVar) {
        upM.CN3.nr(c2, "Partner is null");
        upM.CN3.nr(str, "OM SDK JS script content is null");
        upM.CN3.nr(list, "VerificationScriptResources is null");
        if (str3 != null) {
            upM.CN3.O(str3, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new Ml(c2, null, str, list, str2, str3, I28.NATIVE, oVar);
    }

    public String J2() {
        return this.J2;
    }

    public String KN() {
        return this.f11382O;
    }

    public String O() {
        return this.Uo;
    }

    public Map Uo() {
        return Collections.unmodifiableMap(this.nr);
    }

    public List gh() {
        return Collections.unmodifiableList(this.f11384t);
    }

    public I28 nr() {
        return this.KN;
    }

    public WebView qie() {
        return this.rl;
    }

    public C xMQ() {
        return this.f11383n;
    }

    private Ml(C c2, WebView webView, String str, List list, String str2, String str3, I28 i28, o oVar) {
        ArrayList arrayList = new ArrayList();
        this.f11384t = arrayList;
        this.nr = new HashMap();
        this.f11383n = c2;
        this.rl = webView;
        this.f11382O = str;
        this.KN = i28;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qz qzVar = (qz) it.next();
                this.nr.put(UUID.randomUUID().toString(), qzVar);
            }
        }
        this.Uo = str2;
        this.J2 = str3;
    }
}
