package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.u0;
import com.fyber.inneractive.sdk.renderers.x;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class InneractiveAdViewVideoContentController extends u0 {
    public void pauseVideo() {
    }

    public void playVideo() {
    }

    public void setControlledRenderer(x xVar) {
        new WeakReference(xVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.j0
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        if (inneractiveAdSpot.getAdContent() instanceof t0) {
            return true;
        }
        return false;
    }
}
