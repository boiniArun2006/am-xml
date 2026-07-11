package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IUnusedAppRestrictionsBackportService.Stub f36345n;

    /* JADX INFO: renamed from: androidx.core.content.UnusedAppRestrictionsBackportService$1, reason: invalid class name */
    class AnonymousClass1 extends IUnusedAppRestrictionsBackportService.Stub {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ UnusedAppRestrictionsBackportService f36346n;

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        public void U(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
            if (iUnusedAppRestrictionsBackportCallback == null) {
                return;
            }
            this.f36346n.n(new UnusedAppRestrictionsBackportCallback(iUnusedAppRestrictionsBackportCallback));
        }
    }

    protected abstract void n(UnusedAppRestrictionsBackportCallback unusedAppRestrictionsBackportCallback);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f36345n;
    }
}
