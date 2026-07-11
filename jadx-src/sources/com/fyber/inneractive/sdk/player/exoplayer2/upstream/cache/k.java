package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class k extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f56069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f56070b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, ConditionVariable conditionVariable) {
        super("SimpleCache.initialize()");
        this.f56070b = lVar;
        this.f56069a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f56070b) {
            this.f56069a.open();
            try {
                l.a(this.f56070b);
            } catch (a e2) {
                this.f56070b.f56076f = e2;
            }
            this.f56070b.f56072b.getClass();
        }
    }
}
