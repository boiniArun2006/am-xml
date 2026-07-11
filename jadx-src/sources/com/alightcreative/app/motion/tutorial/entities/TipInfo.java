package com.alightcreative.app.motion.tutorial.entities;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class TipInfo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f46438n;
    private final Map nr;
    private final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f46439t;

    public TipInfo(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f46438n = jsonObject.getString("image");
        this.rl = (Map) new Gson().fromJson(jsonObject.getJSONObject("desc").toString(), new TypeToken<Map<String, ? extends String>>() { // from class: com.alightcreative.app.motion.tutorial.entities.TipInfo.1
        }.getType());
        this.f46439t = jsonObject.getInt("pos");
        this.nr = (Map) new Gson().fromJson(jsonObject.getJSONObject("title").toString(), new TypeToken<Map<String, ? extends String>>() { // from class: com.alightcreative.app.motion.tutorial.entities.TipInfo.2
        }.getType());
    }

    public final Map n() {
        return this.rl;
    }

    public final String rl() {
        return this.f46438n;
    }

    public final Map t() {
        return this.nr;
    }
}
