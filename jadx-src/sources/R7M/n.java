package R7M;

import TFv.Lu;
import TFv.SPz;
import TFv.rv6;
import androidx.view.ViewModel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n extends ViewModel {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SPz f8684n;
    private final rv6 rl;

    protected final void nr(Object obj) {
        this.f8684n.setValue(obj);
    }

    protected final Object rl() {
        return this.rl.getValue();
    }

    public final rv6 t() {
        return this.rl;
    }

    public n(Object obj) {
        SPz sPzN = Lu.n(obj);
        this.f8684n = sPzN;
        this.rl = sPzN;
    }
}
