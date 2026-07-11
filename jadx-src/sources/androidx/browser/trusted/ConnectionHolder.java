package androidx.browser.trusted;

import a8o.n;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class ConnectionHolder implements ServiceConnection {
    private TrustedWebActivityServiceConnection J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f14607O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f14608n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Exception f14609o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f14610r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final WrapperFactory f14611t;

    static class WrapperFactory {
        TrustedWebActivityServiceConnection n(ComponentName componentName, IBinder iBinder) {
            return new TrustedWebActivityServiceConnection(n.j.fcU(iBinder), componentName);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.J2 = null;
        this.f14608n.run();
        this.f14607O = 2;
    }

    public void nr(Exception exc) {
        Iterator it = this.f14610r.iterator();
        while (it.hasNext()) {
            ((CallbackToFutureAdapter.Completer) it.next()).J2(exc);
        }
        this.f14610r.clear();
        this.f14608n.run();
        this.f14607O = 3;
        this.f14609o = exc;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.J2 = this.f14611t.n(componentName, iBinder);
        Iterator it = this.f14610r.iterator();
        while (it.hasNext()) {
            ((CallbackToFutureAdapter.Completer) it.next()).t(this.J2);
        }
        this.f14610r.clear();
        this.f14607O = 1;
    }
}
