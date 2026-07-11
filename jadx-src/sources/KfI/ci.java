package KfI;

import XE.n;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class ci {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ci f5695n = new ci();
    private static final WkR.j rl;

    static {
        WkR.j jVarXMQ = new nS.Ml().mUb(w6.f5744n).gh(true).xMQ();
        Intrinsics.checkNotNullExpressionValue(jVarXMQ, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        rl = jVarXMQ;
    }

    private final Ml nr(XE.n nVar) {
        return nVar == null ? Ml.COLLECTION_SDK_NOT_INSTALLED : nVar.n() ? Ml.COLLECTION_ENABLED : Ml.COLLECTION_DISABLED;
    }

    public final SPz n(com.google.firebase.Wre firebaseApp, r sessionDetails, pu.Dsr sessionsSettings, Map subscribers, String firebaseInstallationId, String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        Intrinsics.checkNotNullParameter(sessionsSettings, "sessionsSettings");
        Intrinsics.checkNotNullParameter(subscribers, "subscribers");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new SPz(aC.SESSION_START, new Ew(sessionDetails.rl(), sessionDetails.n(), sessionDetails.t(), sessionDetails.nr(), new I28(nr((XE.n) subscribers.get(n.j.PERFORMANCE)), nr((XE.n) subscribers.get(n.j.CRASHLYTICS)), sessionsSettings.n()), firebaseInstallationId, firebaseAuthenticationToken), rl(firebaseApp));
    }

    public final n rl(com.google.firebase.Wre firebaseApp) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Context contextQie = firebaseApp.qie();
        Intrinsics.checkNotNullExpressionValue(contextQie, "firebaseApp.applicationContext");
        String packageName = contextQie.getPackageName();
        PackageInfo packageInfo = contextQie.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String strT = firebaseApp.ck().t();
        Intrinsics.checkNotNullExpressionValue(strT, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        QJ qj = QJ.LOG_ENVIRONMENT_PROD;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        String str = packageInfo.versionName;
        String str2 = str == null ? strValueOf : str;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        C1395c c1395c = C1395c.f5694n;
        Context contextQie2 = firebaseApp.qie();
        Intrinsics.checkNotNullExpressionValue(contextQie2, "firebaseApp.applicationContext");
        l3D l3dNr = c1395c.nr(contextQie2);
        Context contextQie3 = firebaseApp.qie();
        Intrinsics.checkNotNullExpressionValue(contextQie3, "firebaseApp.applicationContext");
        return new n(strT, MODEL, "2.1.2", RELEASE, qj, new j(packageName, str2, strValueOf, MANUFACTURER, l3dNr, c1395c.t(contextQie3)));
    }

    public final WkR.j t() {
        return rl;
    }

    private ci() {
    }
}
