package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f61076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f61077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f61078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f61079d;

    private VastProperties(boolean z2, Float f3, boolean z3, Position position) {
        this.f61076a = z2;
        this.f61077b = f3;
        this.f61078c = z3;
        this.f61079d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z2, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z2, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f3, boolean z2, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f3), z2, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f61076a);
            if (this.f61076a) {
                jSONObject.put("skipOffset", this.f61077b);
            }
            jSONObject.put("autoPlay", this.f61078c);
            jSONObject.put("position", this.f61079d);
            return jSONObject;
        } catch (JSONException e2) {
            d.a("VastProperties: JSON error", e2);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f61079d;
    }

    public Float getSkipOffset() {
        return this.f61077b;
    }

    public boolean isAutoPlay() {
        return this.f61078c;
    }

    public boolean isSkippable() {
        return this.f61076a;
    }
}
