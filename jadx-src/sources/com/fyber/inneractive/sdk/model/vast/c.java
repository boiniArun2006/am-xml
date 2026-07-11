package com.fyber.inneractive.sdk.model.vast;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.applovin.sdk.AppLovinEventTypes;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class c implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f54119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f54120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f54123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f54124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f54125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f54126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f54127i = new HashMap();

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f54127i.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f54127i.put(xVar, arrayList);
        }
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Companion:  w:");
        sb.append(this.f54121c);
        sb.append(" h:");
        sb.append(this.f54122d);
        sb.append(" type:");
        sb.append(this.f54119a.toString());
        sb.append(" creativeType: ");
        k kVar = this.f54120b;
        sb.append(kVar != null ? kVar.mimeType : "none");
        sb.append(" ctr:");
        sb.append(this.f54125g);
        sb.append(" events:");
        sb.append(this.f54127i);
        return sb.toString();
    }

    public c(i iVar, int i2, int i3, String str, int i5) {
        this.f54119a = iVar;
        this.f54121c = i2;
        this.f54122d = i3;
        this.f54123e = str;
        this.f54126h = i5;
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        if (xVar == null || this.f54127i.isEmpty()) {
            return null;
        }
        return (List) this.f54127i.get(xVar);
    }

    public final JSONObject a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", this.f54121c);
            jSONObject.put(CmcdData.STREAMING_FORMAT_HLS, this.f54122d);
            jSONObject.put("type", this.f54119a.toString());
            k kVar = this.f54120b;
            if (kVar != null) {
                str = kVar.mimeType;
            } else {
                str = "none";
            }
            jSONObject.put("creativeType", str);
            jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, this.f54124f);
            return jSONObject;
        } catch (JSONException e2) {
            IAlog.a("Vast Parser: Failed creating Companion json object: %s", e2.getMessage());
            return jSONObject;
        }
    }
}
