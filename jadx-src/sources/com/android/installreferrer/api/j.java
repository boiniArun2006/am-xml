package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import ccT.j;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class j extends InstallReferrerClient {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f47661n = 0;
    private ServiceConnection nr;
    private final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ccT.j f47662t;

    private final class n implements ServiceConnection {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final InstallReferrerStateListener f47663n;

        private n(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f47663n = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            DZ.j.n("InstallReferrerClient", "Install Referrer service connected.");
            j.this.f47662t = j.AbstractBinderC0594j.fcU(iBinder);
            j.this.f47661n = 2;
            this.f47663n.n(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            DZ.j.rl("InstallReferrerClient", "Install Referrer service disconnected.");
            j.this.f47662t = null;
            j.this.f47661n = 0;
            this.f47663n.rl();
        }
    }

    public boolean KN() {
        return (this.f47661n != 2 || this.f47662t == null || this.nr == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void n() {
        this.f47661n = 3;
        if (this.nr != null) {
            DZ.j.n("InstallReferrerClient", "Unbinding from service.");
            this.rl.unbindService(this.nr);
            this.nr = null;
        }
        this.f47662t = null;
    }

    private boolean Uo() {
        return this.rl.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
    }

    public j(Context context) {
        this.rl = context.getApplicationContext();
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void nr(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (KN()) {
            DZ.j.n("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.n(0);
            return;
        }
        int i2 = this.f47661n;
        if (i2 == 1) {
            DZ.j.rl("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.n(3);
            return;
        }
        if (i2 == 3) {
            DZ.j.rl("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.n(3);
            return;
        }
        DZ.j.n("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = this.rl.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty() && (serviceInfo = listQueryIntentServices.get(0).serviceInfo) != null) {
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if ("com.android.vending".equals(str) && str2 != null && Uo()) {
                Intent intent2 = new Intent(intent);
                n nVar = new n(installReferrerStateListener);
                this.nr = nVar;
                try {
                    if (this.rl.bindService(intent2, nVar, 1)) {
                        DZ.j.n("InstallReferrerClient", "Service was bonded successfully.");
                        return;
                    }
                    DZ.j.rl("InstallReferrerClient", "Connection to service is blocked.");
                    this.f47661n = 0;
                    installReferrerStateListener.n(1);
                    return;
                } catch (SecurityException unused) {
                    DZ.j.rl("InstallReferrerClient", "No permission to connect to service.");
                    this.f47661n = 0;
                    installReferrerStateListener.n(4);
                    return;
                }
            }
            DZ.j.rl("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.f47661n = 0;
            installReferrerStateListener.n(2);
            return;
        }
        this.f47661n = 0;
        DZ.j.n("InstallReferrerClient", "Install Referrer service unavailable on device.");
        installReferrerStateListener.n(2);
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails rl() throws RemoteException {
        if (KN()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.rl.getPackageName());
            try {
                return new ReferrerDetails(this.f47662t.c(bundle));
            } catch (RemoteException e2) {
                DZ.j.rl("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f47661n = 0;
                throw e2;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }
}
