package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class p implements com.fyber.inneractive.sdk.player.controller.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.measurement.f f56392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56393b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56394c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f56395d = false;

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void c(boolean z2) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void d() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("MeasurementHelper onPlayerStateChanged=%s mBuffering=%s mPrepared=%s", bVar, String.valueOf(this.f56393b), String.valueOf(this.f56395d));
        if (this.f56392a != null) {
            int i2 = o.f56391a[bVar.ordinal()];
            if (i2 == 1) {
                this.f56395d = true;
                return;
            }
            if (i2 == 2) {
                if (this.f56395d) {
                    com.fyber.inneractive.sdk.measurement.f fVar = this.f56392a;
                    if (fVar.f54048c != null) {
                        IAlog.a("%s bufferStart", "OMVideo");
                        try {
                            fVar.f54048c.t();
                        } catch (Throwable th) {
                            fVar.a(th);
                        }
                    }
                    this.f56393b = true;
                    return;
                }
                return;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    com.fyber.inneractive.sdk.measurement.f fVar2 = this.f56392a;
                    if (fVar2.f54048c != null) {
                        IAlog.a("%s pause", "OMVideo");
                        try {
                            fVar2.f54048c.mUb();
                        } catch (Throwable th2) {
                            fVar2.a(th2);
                        }
                    }
                    this.f56394c = true;
                    return;
                }
                if (i2 != 5) {
                    return;
                }
                com.fyber.inneractive.sdk.measurement.f fVar3 = this.f56392a;
                if (fVar3.f54048c != null) {
                    IAlog.a("%s complete", "OMVideo");
                    try {
                        fVar3.f54048c.nr();
                        return;
                    } catch (Throwable th3) {
                        fVar3.a(th3);
                        return;
                    }
                }
                return;
            }
            if (this.f56393b) {
                this.f56393b = false;
                com.fyber.inneractive.sdk.measurement.f fVar4 = this.f56392a;
                if (fVar4.f54048c != null) {
                    IAlog.a("%s bufferEnd", "OMVideo");
                    try {
                        fVar4.f54048c.rl();
                        return;
                    } catch (Throwable th4) {
                        fVar4.a(th4);
                        return;
                    }
                }
                return;
            }
            if (this.f56394c) {
                com.fyber.inneractive.sdk.measurement.f fVar5 = this.f56392a;
                if (fVar5.f54048c != null) {
                    IAlog.a("%s resume", "OMVideo");
                    try {
                        fVar5.f54048c.gh();
                    } catch (Throwable th5) {
                        fVar5.a(th5);
                    }
                }
                this.f56394c = false;
            }
        }
    }

    public p(com.fyber.inneractive.sdk.measurement.f fVar) {
        this.f56392a = fVar;
    }
}
