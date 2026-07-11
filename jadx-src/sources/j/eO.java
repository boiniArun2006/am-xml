package j;

import android.os.Build;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class eO implements InterfaceC2194j {
    @Override // j.InterfaceC2194j
    public void n(boolean z2, Function0 onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        jVar.setMaxLayers720(4);
        jVar.setMaxLayers1080(4);
        jVar.setMaxLayers1440(3);
        jVar.setMaxLayers2160(-1);
        jVar.setMaxRes(1440);
        jVar.setMaxResWithVideo(1440);
        jVar.setDeviceCapsCheckProd(Build.PRODUCT);
        jVar.setDeviceCapsCheckBypassed(true);
        jVar.setDeviceCapsCheckSuccess(true);
        jVar.setDeviceCapsCheckSource("Mocked emulator values");
        jVar.setDeviceCapsCheckVer(4);
        jVar.setDeviceCapsCheckAttempts(0);
    }
}
