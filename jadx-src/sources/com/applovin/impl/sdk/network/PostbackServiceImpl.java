package com.applovin.impl.sdk.network;

import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.d6;
import com.applovin.impl.q5;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f50362a;

    public void dispatchPostbackRequest(e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(eVar, d6.b.OTHER, appLovinPostbackListener);
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(e.b(this.f50362a).b(str).a(false).a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(e eVar, d6.b bVar, AppLovinPostbackListener appLovinPostbackListener) {
        q5 q5Var = new q5(eVar, bVar, this.f50362a, appLovinPostbackListener);
        q5Var.a(a(eVar));
        this.f50362a.q0().a((AbstractRunnableC1782i5) q5Var, bVar);
    }

    public String toString() {
        return "PostbackService{}";
    }

    public PostbackServiceImpl(C1802k c1802k) {
        this.f50362a = c1802k;
    }

    private boolean a(e eVar) {
        Map mapI = eVar.i();
        if (mapI == null) {
            return false;
        }
        Object obj = mapI.get(com.safedk.android.analytics.events.a.f62811a);
        if ("postinstall".equals(obj)) {
            obj = mapI.get("sub_event");
        }
        return EventServiceImpl.ALLOW_PRE_INIT_EVENT_TYPES.contains(obj);
    }
}
