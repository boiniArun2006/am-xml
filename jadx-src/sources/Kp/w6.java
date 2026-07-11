package Kp;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 implements VD.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w6 f5865n = new w6();

    private static final class j extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String tag, String message, Throwable th) {
            super("[" + tag + "] " + message, th);
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    @Override // VD.j
    public void n(String tag, String message, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        firebaseCrashlytics.log("Fellini [" + tag + "] " + message + " - Throwable: " + th);
        firebaseCrashlytics.setCustomKey("tag", tag);
        firebaseCrashlytics.recordException(new j(tag, message, th));
        firebaseCrashlytics.setCustomKey("tag", "");
    }

    private w6() {
    }
}
