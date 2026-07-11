package j;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class C {
    public static final void n() {
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        firebaseCrashlytics.setCustomKey("maxLayers720", jVar.getMaxLayers720());
        firebaseCrashlytics.setCustomKey("maxLayers1080", jVar.getMaxLayers1080());
        firebaseCrashlytics.setCustomKey("maxLayers1440", jVar.getMaxLayers1440());
        firebaseCrashlytics.setCustomKey("maxLayers2160", jVar.getMaxLayers2160());
        firebaseCrashlytics.setCustomKey("maxRes", jVar.getMaxRes());
        firebaseCrashlytics.setCustomKey("maxResWithVideo", jVar.getMaxResWithVideo());
        firebaseCrashlytics.setCustomKey("deviceCapsCheckAttempts", jVar.getDeviceCapsCheckAttempts());
        firebaseCrashlytics.setCustomKey("deviceCapsCheckBypassed", jVar.getDeviceCapsCheckBypassed());
    }
}
