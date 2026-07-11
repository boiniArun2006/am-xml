package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class c extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f53313d;

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a(a aVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f53316c;
        if (copyOnWriteArrayList != null) {
            try {
                copyOnWriteArrayList.add(aVar);
            } catch (Throwable th) {
                IAlog.a("failed to add networkUpdateListener", th, new Object[0]);
            }
        }
        this.f53313d.b();
    }

    public c(Context context) {
        super(context);
        this.f53313d = new b(this.f53314a, this);
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a(h hVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f53316c;
        if (copyOnWriteArrayList != null) {
            try {
                copyOnWriteArrayList.remove(hVar);
            } catch (Throwable th) {
                IAlog.a("failed to remove networkUpdateListener", th, new Object[0]);
            }
        }
        this.f53313d.c();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a() {
        this.f53313d.a();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f53316c;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.f53316c = null;
        }
    }
}
