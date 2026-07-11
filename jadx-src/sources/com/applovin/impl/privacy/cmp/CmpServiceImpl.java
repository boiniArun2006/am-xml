package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.applovin.impl.k0;
import com.applovin.impl.n7;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class CmpServiceImpl implements AppLovinCmpService, a.InterfaceC0707a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f49717a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AppLovinCmpError f49721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f49722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f49723g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f49719c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f49720d = d.NONE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.privacy.cmp.a f49718b = c();

    class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AppLovinCmpService.OnCompletedListener f49724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f49725b;

        /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a, reason: collision with other inner class name */
        class C0706a implements f {
            C0706a() {
            }

            @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
            public void a(AppLovinCmpError appLovinCmpError) {
                a.this.f49724a.onCompleted(appLovinCmpError);
            }
        }

        a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.f49724a = onCompletedListener;
            this.f49725b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.f49724a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.f49725b, new C0706a());
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f49728a;

        b(Activity activity) {
            this.f49728a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f49718b.b(this.f49728a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f49730a;

        c(Activity activity) {
            this.f49730a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f49718b.a(this.f49730a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    private enum d {
        NONE,
        LOADING,
        COMPLETED
    }

    public interface e {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public interface f {
        void a(AppLovinCmpError appLovinCmpError);
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0707a
    public void onFlowHidden(Bundle bundle) {
        b((AppLovinCmpError) null);
        b();
    }

    public void preloadCmp(Activity activity) {
        a(activity, null);
    }

    private void a(AppLovinCmpError appLovinCmpError) {
        e eVar = this.f49722f;
        if (eVar == null) {
            return;
        }
        eVar.a(appLovinCmpError);
        this.f49722f = null;
        this.f49721e = null;
    }

    private void b(AppLovinCmpError appLovinCmpError) {
        f fVar = this.f49723g;
        if (fVar == null) {
            return;
        }
        fVar.a(appLovinCmpError);
        this.f49723g = null;
    }

    private com.applovin.impl.privacy.cmp.a c() {
        if (n7.a("com.google.android.ump.ConsentForm")) {
            return new com.applovin.impl.privacy.cmp.a(this.f49717a);
        }
        if (!this.f49717a.x().j()) {
            return null;
        }
        C1804o.h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public boolean hasSupportedCmp() {
        return this.f49718b != null;
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0707a
    public void onFlowLoaded(Bundle bundle) {
        synchronized (this.f49719c) {
            try {
                if (this.f49722f == null) {
                    this.f49720d = d.COMPLETED;
                } else {
                    this.f49720d = d.NONE;
                    a((AppLovinCmpError) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void showCmp(Activity activity, f fVar) {
        b bVar = new b(activity);
        this.f49723g = fVar;
        if (this.f49718b.e()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public void showCmpForExistingUser(@NonNull Activity activity, @NonNull AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.f49717a.O();
        if (C1804o.a()) {
            this.f49717a.O().a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
        }
        if (!this.f49717a.x().j()) {
            C1804o.h("AppLovinCmpService", "Unable to show CMP for existing user. Please enable the consent flow.");
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "Consent flow is not enabled"));
        } else if (!hasSupportedCmp()) {
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
        } else {
            d();
            loadCmp(activity, new a(onCompletedListener, activity));
        }
    }

    @NonNull
    public String toString() {
        return "[CmpService]";
    }

    public CmpServiceImpl(C1802k c1802k) {
        this.f49717a = c1802k;
    }

    private void d() {
        if (!hasSupportedCmp()) {
            return;
        }
        this.f49718b.c();
    }

    public void loadCmp(Activity activity, e eVar) {
        a(activity, eVar);
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0707a
    public void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl) {
        b();
        synchronized (this.f49719c) {
            try {
                if (this.f49722f == null) {
                    this.f49720d = d.COMPLETED;
                    this.f49721e = cmpErrorImpl;
                } else {
                    this.f49720d = d.NONE;
                    a(cmpErrorImpl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0707a
    public void onFlowShowFailed(CmpErrorImpl cmpErrorImpl) {
        b(cmpErrorImpl);
        b();
    }

    private void b() {
        com.applovin.impl.privacy.cmp.a aVar = this.f49718b;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private void a(Activity activity, e eVar) {
        boolean z2;
        if (!hasSupportedCmp()) {
            if (eVar != null) {
                eVar.a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
                return;
            }
            return;
        }
        synchronized (this.f49719c) {
            if (eVar != null) {
                try {
                    this.f49722f = eVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            d dVar = this.f49720d;
            d dVar2 = d.NONE;
            if (dVar == dVar2) {
                this.f49720d = d.LOADING;
                z2 = false;
            } else {
                if (dVar == d.LOADING) {
                    return;
                }
                this.f49720d = dVar2;
                z2 = true;
            }
            if (z2) {
                a(this.f49721e);
                return;
            }
            c cVar = new c(activity);
            if (this.f49718b.d()) {
                AppLovinSdkUtils.runOnUiThread(cVar);
            } else {
                cVar.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k0 a() {
        return new k0(this.f49717a.x().d());
    }
}
