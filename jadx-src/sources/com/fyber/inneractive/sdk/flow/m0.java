package com.fyber.inneractive.sdk.flow;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class m0 extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f53711a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, long j2) {
        super(j2, 1000L);
        this.f53711a = p0Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        m0 m0Var = this.f53711a.f53808w;
        if (m0Var != null) {
            m0Var.cancel();
        }
        this.f53711a.e(false);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j2) {
        int i2 = ((int) j2) / 1000;
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f53711a.f53796k;
        if (eVar != null) {
            eVar.updateCloseCountdown(i2);
        }
    }
}
