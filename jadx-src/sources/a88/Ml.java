package a88;

import android.webkit.WebView;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class Ml {
    private final String J2;
    private final I28 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f12706O;
    private final String Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final o f12707n;
    private final Map nr;
    private final WebView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f12708t;

    public static Ml n(o oVar, WebView webView, String str, String str2) {
        K7m.CN3.nr(oVar, "Partner is null");
        K7m.CN3.nr(webView, KfLR.XiXUTvRn);
        if (str2 != null) {
            K7m.CN3.O(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new Ml(oVar, webView, null, null, str, str2, I28.HTML);
    }

    public static Ml rl(o oVar, String str, List list, String str2, String str3) {
        K7m.CN3.nr(oVar, "Partner is null");
        K7m.CN3.nr(str, "OM SDK JS script content is null");
        K7m.CN3.nr(list, "VerificationScriptResources is null");
        if (str3 != null) {
            K7m.CN3.O(str3, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new Ml(oVar, null, str, list, str2, str3, I28.NATIVE);
    }

    public Map J2() {
        return Collections.unmodifiableMap(this.nr);
    }

    public o KN() {
        return this.f12707n;
    }

    public String O() {
        return this.J2;
    }

    public String Uo() {
        return this.f12706O;
    }

    public WebView mUb() {
        return this.rl;
    }

    public String nr() {
        return this.Uo;
    }

    public I28 t() {
        return this.KN;
    }

    public List xMQ() {
        return Collections.unmodifiableList(this.f12708t);
    }

    private Ml(o oVar, WebView webView, String str, List list, String str2, String str3, I28 i28) {
        ArrayList arrayList = new ArrayList();
        this.f12708t = arrayList;
        this.nr = new HashMap();
        this.f12707n = oVar;
        this.rl = webView;
        this.f12706O = str;
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
