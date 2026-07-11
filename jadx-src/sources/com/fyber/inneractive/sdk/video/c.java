package com.fyber.inneractive.sdk.video;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.g;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.interfaces.f;
import com.fyber.inneractive.sdk.renderers.s;
import com.fyber.inneractive.sdk.renderers.x;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class c implements g {
    @Override // com.fyber.inneractive.sdk.factories.g
    public final boolean a(InneractiveAdSpot inneractiveAdSpot) {
        if (inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof t0)) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.factories.g
    public final f b(InneractiveAdSpot inneractiveAdSpot) {
        boolean z2;
        InneractiveAdRequest inneractiveAdRequest = inneractiveAdSpot.getAdContent().f53977a;
        if (inneractiveAdRequest != null && !inneractiveAdRequest.getAllowFullscreen()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (inneractiveAdSpot.getAdContent().b() && z2) {
            return new x();
        }
        return new s();
    }
}
