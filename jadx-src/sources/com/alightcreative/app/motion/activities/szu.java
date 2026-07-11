package com.alightcreative.app.motion.activities;

import com.caoccao.javet.exceptions.JavetError;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class szu {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f45670n;
    private final String rl;

    public szu(JSONObject jsonObj) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObj, "jsonObj");
        String string = jsonObj.getString("status");
        string = string == null ? MRAIDPresenter.ERROR : string;
        this.rl = string;
        this.f45670n = Intrinsics.areEqual(string, MRAIDPresenter.ERROR) ? 0 : jsonObj.getInt(JavetError.PARAMETER_COUNT);
    }

    public final int n() {
        return this.f45670n;
    }

    public final String rl() {
        return this.rl;
    }
}
