package androidx.browser.customtabs;

import P.Ml;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class PostMessageService extends Service {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Ml.j f14593n;

    /* JADX INFO: renamed from: androidx.browser.customtabs.PostMessageService$1, reason: invalid class name */
    class AnonymousClass1 extends Ml.j {
        @Override // P.Ml
        public void piY(P.j jVar, String str, Bundle bundle) {
            jVar.m(str, bundle);
        }

        @Override // P.Ml
        public void wTp(P.j jVar, Bundle bundle) {
            jVar.pJg(bundle);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f14593n;
    }
}
