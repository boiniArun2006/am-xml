package com.google.firebase.perf.application;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.application.j;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n implements j.n {
    private final WeakReference<j.n> appStateCallback;
    private final j appStateMonitor;
    private oK9.Ml currentAppState;
    private boolean isRegisteredForAppState;

    protected n() {
        this(j.rl());
    }

    protected n(j jVar) {
        this.isRegisteredForAppState = false;
        this.currentAppState = oK9.Ml.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = jVar;
        this.appStateCallback = new WeakReference<>(this);
    }

    public oK9.Ml getAppState() {
        return this.currentAppState;
    }

    @VisibleForTesting
    public WeakReference<j.n> getAppStateCallback() {
        return this.appStateCallback;
    }

    protected void incrementTsnsCount(int i2) {
        this.appStateMonitor.O(i2);
    }

    @Override // com.google.firebase.perf.application.j.n
    public void onUpdateAppState(oK9.Ml ml) {
        oK9.Ml ml2 = this.currentAppState;
        oK9.Ml ml3 = oK9.Ml.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (ml2 == ml3) {
            this.currentAppState = ml;
        } else {
            if (ml2 == ml || ml == ml3) {
                return;
            }
            this.currentAppState = oK9.Ml.FOREGROUND_BACKGROUND;
        }
    }

    protected void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        this.currentAppState = this.appStateMonitor.n();
        this.appStateMonitor.gh(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    protected void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.ck(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }
}
