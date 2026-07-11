package com.alightcreative.app.motion.tutorial.entities;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class TutorialInfo {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Map f46440O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f46441n;
    private final int nr;
    private final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f46442t;

    public TutorialInfo(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f46441n = jsonObject.getString("image");
        this.rl = (Map) new Gson().fromJson(jsonObject.getJSONObject("desc").toString(), new TypeToken<Map<String, ? extends String>>() { // from class: com.alightcreative.app.motion.tutorial.entities.TutorialInfo.1
        }.getType());
        this.f46442t = jsonObject.getString("youtube");
        this.nr = jsonObject.getInt("pos");
        this.f46440O = (Map) new Gson().fromJson(jsonObject.getJSONObject("title").toString(), new TypeToken<Map<String, ? extends String>>() { // from class: com.alightcreative.app.motion.tutorial.entities.TutorialInfo.2
        }.getType());
    }

    public final Map n() {
        return this.rl;
    }

    public final String nr() {
        return this.f46442t;
    }

    public final String rl() {
        return this.f46441n;
    }

    public final Map t() {
        return this.f46440O;
    }
}
