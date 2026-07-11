package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.view.WindowManager;
import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f56282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f56283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f56284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f56285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f56286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f56287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f56288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f56289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f56290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f56291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f56292k;

    public h() {
        double refreshRate = ((WindowManager) IAConfigManager.f53260M.f53295u.a().getSystemService("window")).getDefaultDisplay().getRefreshRate();
        this.f56283b = true;
        this.f56282a = g.f56277e;
        long j2 = (long) (1.0E9d / refreshRate);
        this.f56284c = j2;
        this.f56285d = (j2 * 80) / 100;
    }
}
