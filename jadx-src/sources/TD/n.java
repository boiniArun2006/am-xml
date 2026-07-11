package TD;

import TD.j;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class n extends TD.j {
    private final Object rl = new Object();
    private final Runnable J2 = new j();
    private ArrayList nr = new ArrayList();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ArrayList f10227O = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Handler f10228t = new Handler(Looper.getMainLooper());

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (n.this.rl) {
                ArrayList arrayList = n.this.f10227O;
                n nVar = n.this;
                nVar.f10227O = nVar.nr;
                n.this.nr = arrayList;
            }
            int size = n.this.f10227O.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((j.InterfaceC0359j) n.this.f10227O.get(i2)).release();
            }
            n.this.f10227O.clear();
        }
    }

    @Override // TD.j
    public void n(j.InterfaceC0359j interfaceC0359j) {
        synchronized (this.rl) {
            this.nr.remove(interfaceC0359j);
        }
    }

    @Override // TD.j
    public void nr(j.InterfaceC0359j interfaceC0359j) {
        if (!TD.j.t()) {
            interfaceC0359j.release();
            return;
        }
        synchronized (this.rl) {
            try {
                if (this.nr.contains(interfaceC0359j)) {
                    return;
                }
                this.nr.add(interfaceC0359j);
                boolean z2 = true;
                if (this.nr.size() != 1) {
                    z2 = false;
                }
                if (z2) {
                    this.f10228t.post(this.J2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
