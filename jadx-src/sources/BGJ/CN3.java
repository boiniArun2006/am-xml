package BGJ;

import androidx.view.SavedStateHandle;
import androidx.view.viewmodel.CreationExtras;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CreationExtras f408n;
    private SavedStateHandle rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f409t;

    public void n() {
        this.f408n = null;
    }

    public boolean rl() {
        return this.rl == null && this.f408n == null;
    }

    public void t(CreationExtras creationExtras) {
        if (this.rl != null) {
            return;
        }
        this.f408n = creationExtras;
    }

    CN3(CreationExtras creationExtras) {
        boolean z2;
        if (creationExtras == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f409t = z2;
        this.f408n = creationExtras;
    }
}
