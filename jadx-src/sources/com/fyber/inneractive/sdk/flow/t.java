package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.exoplayer2.C;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class t implements com.fyber.inneractive.sdk.network.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f53924a;

    public t(u uVar) {
        this.f53924a = uVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z2) {
        String str = (String) obj;
        IAlog.a("IAVideoContentLoader : Remote ui template callback onNetworkResult from cache: %s", Boolean.valueOf(z2));
        if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            return;
        }
        u uVar = this.f53924a;
        uVar.getClass();
        if (TextUtils.isEmpty(str) && z2) {
            uVar.a(exc, "Fetched cached template is ".concat(str == null ? V8ValueNull.NULL : "empty"), true);
            return;
        }
        com.fyber.inneractive.sdk.player.ui.remote.g gVarI = uVar.i();
        if (gVarI == null) {
            uVar.a(null, "Flow Manager is null", z2);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            boolean z3 = gVarI.f56502a.f56481i;
            StringBuilder sb = new StringBuilder("Unknown error while receiving template: templateContent is: ");
            sb.append(TextUtils.isEmpty(str) ? "null or empty" : "not null and not empty");
            sb.append(" isFromCache: ");
            sb.append(z3);
            uVar.a(exc, sb.toString(), z3);
            return;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = gVarI.f56502a;
        dVar.f56481i = z2;
        IAlog.a("%s : schedule UI load timeout task with delay: %d", "RemoteUIWebviewController", 10000);
        com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(dVar.f56483k, 10000);
        try {
            DTExchangeNetworkBridge.webviewLoadData(dVar.f56474b, str, "text/html", C.UTF8_NAME);
        } catch (Throwable th) {
            IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
            com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(dVar.f56483k);
            dVar.a(com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR, "Unable load data: " + th.getMessage(), true, null);
        }
    }
}
