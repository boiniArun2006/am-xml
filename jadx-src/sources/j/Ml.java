package j;

import QmE.iF;
import QmE.j;
import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z8.AbstractC2487Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Ml implements InterfaceC2194j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Activity f69243n;
    private final iF rl;

    public Ml(Activity activity, iF eventLogger) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f69243n = activity;
        this.rl = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Function0 function0) {
        Log.d("CapabilityCheck", "Capability test run completed");
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(aC aCVar, final Function0 function0) {
        Log.d("CapabilityCheck", "Capability test run started");
        aCVar.xMQ(new Function0() { // from class: j.w6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ml.O(function0);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // j.InterfaceC2194j
    public void n(boolean z2, final Function0 onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Xo xo = new Xo(this.f69243n);
        if (z2) {
            xo.rl(false);
        } else {
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            if (jVar.getDeviceCapsCheckSuccess() && jVar.getDeviceCapsCheckVer() == 4) {
                onComplete.invoke();
                return;
            } else if (Xo.t(xo, false, 1, null)) {
                onComplete.invoke();
                return;
            }
        }
        com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (jVar2.getDeviceCapsCheckVer() != 4) {
            jVar2.setDeviceCapsCheckVer(4);
            jVar2.setDeviceCapsCheckAttempts(0);
            jVar2.setDeviceCapsCheckProd("");
            jVar2.setDeviceCapsCheckSuccess(false);
        }
        if (jVar2.getDeviceCapsCheckAttempts() < 3 || z2 || jVar2.getDeviceCapsCheckSuccess()) {
            jVar2.setDeviceCapsCheckAttempts(jVar2.getDeviceCapsCheckAttempts() + 1);
            jVar2.setDeviceCapsCheckSource("Incomplete Check");
            ProgressDialog progressDialog = new ProgressDialog(this.f69243n);
            progressDialog.setTitle(2132017426);
            progressDialog.setMessage(this.f69243n.getString(2132017427));
            progressDialog.setProgressStyle(1);
            progressDialog.setProgressNumberFormat(null);
            progressDialog.setCancelable(false);
            progressDialog.show();
            final aC aCVar = new aC(this.f69243n, progressDialog, this.rl);
            ThreadsKt.thread$default(false, false, null, null, 0, new Function0() { // from class: j.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Ml.nr(aCVar, onComplete);
                }
            }, 31, null);
            return;
        }
        if (Xo.t(xo, false, 1, null)) {
            onComplete.invoke();
            return;
        }
        jVar2.setMaxLayers720(1);
        jVar2.setMaxLayers1080(0);
        jVar2.setMaxLayers1440(-1);
        jVar2.setMaxLayers2160(-1);
        jVar2.setMaxRes(1080);
        jVar2.setMaxResWithVideo(720);
        String str = Build.PRODUCT;
        jVar2.setDeviceCapsCheckProd(str);
        jVar2.setDeviceCapsCheckBypassed(true);
        jVar2.setDeviceCapsCheckVer(4);
        jVar2.setDeviceCapsCheckSource("Guess");
        iF iFVar = this.rl;
        Bundle bundle = new Bundle();
        bundle.putString(AppLovinEventTypes.USER_VIEWED_PRODUCT, str);
        bundle.putString("model", Build.MODEL);
        bundle.putString("manufacturer", Build.MANUFACTURER);
        bundle.putString("chipset", AbstractC2487Wre.mUb().n());
        bundle.putInt("attempts", jVar2.getDeviceCapsCheckAttempts());
        Unit unit = Unit.INSTANCE;
        iFVar.n(new j.fuX("device_caps_check_bypass", bundle));
        C.n();
        onComplete.invoke();
    }
}
