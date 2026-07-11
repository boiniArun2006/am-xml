package Suk;

import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import com.safedk.android.analytics.events.a;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public enum Pl {
    EVENT(a.f62811a),
    ACTION_SOURCE("action_source"),
    APP(PangleCreativeInfo.f62498a),
    MOBILE_APP_INSTALL("MobileAppInstall"),
    INSTALL_EVENT_TIME("install_timestamp");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f10042n;

    public final String rl() {
        return this.f10042n;
    }

    Pl(String str) {
        this.f10042n = str;
    }
}
