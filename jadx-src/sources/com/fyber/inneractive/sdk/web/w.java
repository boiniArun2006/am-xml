package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f57237a;

    public w(x xVar) {
        this.f57237a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f57237a.f57245a.getClass();
        com.fyber.inneractive.sdk.util.r.f57026b.post(new v("Image failed to download."));
        this.f57237a.f57245a.a(com.fyber.inneractive.sdk.mraid.k.STORE_PICTURE, "Error downloading and saving image file.");
        IAlog.a("failed to download and save the image file.", new Object[0]);
    }
}
