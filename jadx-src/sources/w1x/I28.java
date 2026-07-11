package w1x;

import UiE.fuX;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.internal.C;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import sI.InterfaceC2360j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f74780n = new I28();
    private static final String rl = I28.class.getSimpleName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Boolean f74781t;

    public enum j {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f74784n;

        @Override // java.lang.Enum
        public String toString() {
            return this.f74784n;
        }

        j(String str) {
            this.f74784n = str;
        }
    }

    private static final class n implements ServiceConnection {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final CountDownLatch f74785n = new CountDownLatch(1);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private IBinder f74786t;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }

        public final IBinder nr() throws InterruptedException {
            this.f74785n.await(5L, TimeUnit.SECONDS);
            return this.f74786t;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f74785n.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder serviceBinder) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(serviceBinder, "serviceBinder");
            this.f74786t = serviceBinder;
            this.f74785n.countDown();
        }
    }

    public enum w6 {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    public static final w6 O(String applicationId) {
        if (VmF.j.nr(I28.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            return f74780n.nr(j.MOBILE_APP_INSTALL, applicationId, CollectionsKt.emptyList());
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
            return null;
        }
    }

    private final Intent n(Context context) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage(FbValidationUtils.FB_PACKAGE);
                if (packageManager.resolveService(intent, 0) != null && C.n(context, FbValidationUtils.FB_PACKAGE)) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage(FbValidationUtils.DEBUG_FB_PACKAGE);
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (C.n(context, FbValidationUtils.DEBUG_FB_PACKAGE)) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final w6 nr(j jVar, String str, List list) {
        w6 w6Var;
        String str2;
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            w6 w6Var2 = w6.SERVICE_NOT_AVAILABLE;
            fuX.rl();
            Context contextQie = s4.qie();
            Intent intentN = n(contextQie);
            if (intentN == null) {
                return w6Var2;
            }
            n nVar = new n();
            try {
                if (!contextQie.bindService(intentN, nVar, 1)) {
                    return w6.SERVICE_ERROR;
                }
                try {
                    IBinder iBinderNr = nVar.nr();
                    if (iBinderNr != null) {
                        InterfaceC2360j interfaceC2360jFcU = InterfaceC2360j.AbstractBinderC1162j.fcU(iBinderNr);
                        Bundle bundleN = Ml.n(jVar, str, list);
                        if (bundleN != null) {
                            interfaceC2360jFcU.xMQ(bundleN);
                            vd.piY(rl, "Successfully sent events to the remote service: " + bundleN);
                        }
                        w6Var2 = w6.OPERATION_SUCCESS;
                    }
                    contextQie.unbindService(nVar);
                    vd.piY(rl, "Unbound from the remote service");
                    return w6Var2;
                } catch (RemoteException e2) {
                    w6Var = w6.SERVICE_ERROR;
                    str2 = rl;
                    vd.z(str2, e2);
                    contextQie.unbindService(nVar);
                    vd.piY(str2, "Unbound from the remote service");
                    return w6Var;
                } catch (InterruptedException e3) {
                    w6Var = w6.SERVICE_ERROR;
                    str2 = rl;
                    vd.z(str2, e3);
                    contextQie.unbindService(nVar);
                    vd.piY(str2, "Unbound from the remote service");
                    return w6Var;
                }
            } catch (Throwable th) {
                contextQie.unbindService(nVar);
                vd.piY(rl, "Unbound from the remote service");
                throw th;
            }
        } catch (Throwable th2) {
            VmF.j.rl(th2, this);
            return null;
        }
    }

    public static final boolean rl() {
        if (VmF.j.nr(I28.class)) {
            return false;
        }
        try {
            if (f74781t == null) {
                f74781t = Boolean.valueOf(f74780n.n(s4.qie()) != null);
            }
            Boolean bool = f74781t;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
            return false;
        }
    }

    public static final w6 t(String applicationId, List appEvents) {
        if (VmF.j.nr(I28.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            return f74780n.nr(j.CUSTOM_APP_EVENTS, applicationId, appEvents);
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
            return null;
        }
    }

    private I28() {
    }
}
