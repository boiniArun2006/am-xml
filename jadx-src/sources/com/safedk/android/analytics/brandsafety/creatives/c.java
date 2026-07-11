package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.utils.Logger;
import com.safedk.android.utils.n;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62062b = "MraidParser";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62063c = "markup";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f62064d = "advDomain";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f62065e = "creativeId";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f62066f = "content";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected JSONObject f62067a;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f62068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f62069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f62070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f62071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f62072e;

        public a() {
        }
    }

    public c(JSONObject jSONObject) {
        this.f62067a = jSONObject;
    }

    public a a() {
        a aVar = new a();
        JSONObject jSONObject = this.f62067a;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("content");
                aVar.f62068a = this.f62067a.getString(f62065e);
                aVar.f62070c = this.f62067a.optString(f62064d, null);
                aVar.f62071d = a(new JSONObject(string));
                Logger.d(f62062b, "mraid Markup (url encoded)=", aVar.f62071d);
                aVar.f62069b = a(aVar.f62071d);
                Logger.d(f62062b, "mraid clickURL = ", aVar.f62069b);
                aVar.f62072e = b(aVar.f62071d);
                Logger.d(f62062b, "mraid videoUrl = ", aVar.f62072e);
            } catch (JSONException e2) {
                Logger.d(f62062b, "mraid error ", e2.getMessage(), " parsing", this.f62067a.toString());
            }
        }
        return aVar;
    }

    protected String a(JSONObject jSONObject) throws JSONException {
        return jSONObject.getString(f62063c);
    }

    private String a(String str) {
        Matcher matcher = com.safedk.android.utils.g.a("<a.*?id=\"liftoff-link\".*a>", 2).matcher(str);
        if (matcher.find()) {
            return c(matcher.group(0));
        }
        return null;
    }

    private String b(String str) {
        Matcher matcher = com.safedk.android.utils.g.a("videoSrc:%20%22(.*?)%22", 2).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private String c(String str) {
        String strE = n.e(com.safedk.android.utils.g.a("href=\"([^\"]+)\""), str);
        Logger.d(f62062b, "found click url: ", strE);
        return strE;
    }
}
