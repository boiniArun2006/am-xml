package com.fyber.inneractive.sdk.flow.nativead.trackers;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.sdk.web.m;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w0 f53781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f53782b;

    public final void a(c cVar) {
        for (String str : this.f53781a.f53975w) {
            if (!TextUtils.isEmpty(str)) {
                IAlog.a("%sHitting URL: %s", IAlog.a(this), str);
                z0.b(str);
            }
        }
        b bVar = new b(this.f53781a.f53976x, cVar);
        this.f53782b = bVar;
        if (bVar.f53787d == null || bVar.f53786c == null) {
            IAlog.b("%sWas destroyed, create a new instance", b.f53783e);
        } else {
            bVar.a();
        }
    }

    public a(w0 w0Var) {
        this.f53781a = w0Var;
    }

    public final void a() {
        b bVar = this.f53782b;
        if (bVar != null) {
            IAlog.a("%sDestroy called", b.f53783e);
            Handler handler = bVar.f53787d;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                bVar.f53787d = null;
            }
            m mVar = bVar.f53786c;
            if (mVar != null) {
                v.a(mVar);
                mVar.destroy();
                bVar.f53786c = null;
            }
            bVar.f53785b = null;
            this.f53782b = null;
        }
        this.f53781a = null;
    }
}
