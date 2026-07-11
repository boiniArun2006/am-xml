package oW;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class psW implements BackgroundDetector.BackgroundStateChangeListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ h f71509n;

    psW(h hVar) {
        this.f71509n = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z2) {
        if (z2) {
            this.f71509n.f71499t = true;
            this.f71509n.rl();
        } else {
            this.f71509n.f71499t = false;
            if (this.f71509n.J2()) {
                this.f71509n.rl.t();
            }
        }
    }
}
