package com.fyber.inneractive.sdk.config;

import android.os.Handler;
import android.os.Message;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class b implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f53303a;

    public b(e eVar) {
        this.f53303a = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 123) {
            return false;
        }
        e eVar = this.f53303a;
        if (eVar.f53323b.compareAndSet(false, true)) {
            if (eVar.f53323b.get() && eVar.f53325d != null) {
                IAlog.a("startCounting", new Object[0]);
                v1 v1Var = eVar.f53325d;
                v1Var.f57049d = false;
                v1Var.f57048c.sendEmptyMessage(1932593528);
            }
            IAlog.a("Pause signal", new Object[0]);
        }
        return true;
    }
}
