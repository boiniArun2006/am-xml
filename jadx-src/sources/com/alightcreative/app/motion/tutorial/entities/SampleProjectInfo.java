package com.alightcreative.app.motion.tutorial.entities;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class SampleProjectInfo {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Map f46435O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f46436n;
    private final int nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f46437t;

    public SampleProjectInfo(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f46436n = jsonObject.getString("projectLink");
        this.rl = jsonObject.getString("image");
        this.f46437t = jsonObject.getString("textColor");
        this.nr = jsonObject.getInt("pos");
        this.f46435O = (Map) new Gson().fromJson(jsonObject.getJSONObject("title").toString(), new TypeToken<Map<String, ? extends String>>() { // from class: com.alightcreative.app.motion.tutorial.entities.SampleProjectInfo.1
        }.getType());
    }

    public final String n() {
        return this.rl;
    }

    public final Map nr() {
        return this.f46435O;
    }

    public final String rl() {
        return this.f46436n;
    }

    public final String t() {
        return this.f46437t;
    }
}
