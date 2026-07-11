package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class g implements AppLovinCommunicatorPublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62535a = "BrandSafetyReporter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f62536b = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f62537c = null;

    private g() {
        d();
    }

    public static g a() {
        if (f62537c == null) {
            f62537c = new g();
        }
        return f62537c;
    }

    private void d() {
        com.safedk.android.analytics.b bVar = new com.safedk.android.analytics.b() { // from class: com.safedk.android.analytics.brandsafety.g.1
            @Override // com.safedk.android.analytics.b
            public void a(String str, Bundle bundle) {
                Logger.d(g.f62535a, "Response received, response=", bundle.toString());
            }
        };
        AppLovinBridge.registerListener(AppLovinBridge.f61285c, bVar);
        AppLovinBridge.registerListener(AppLovinBridge.f61286d, bVar);
    }

    public static void a(final Bundle bundle) {
        Logger.d(f62535a, "report image uploaded to server started");
        try {
            f62536b.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.g.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (bundle == null) {
                            Logger.d(g.f62535a, "Data argument is null, which means that the upload failed or that the validation check has failed. Nothing to report to the server.");
                            return;
                        }
                        if (bundle.size() > 0) {
                            Logger.d(g.f62535a, "Starting image upload report event.");
                            AppLovinBridge.reportImageUploadEvent(bundle, g.f62537c);
                            String string = bundle.getString("image_id");
                            c cVarK = b.k(string);
                            if (cVarK != null) {
                                for (k kVar : cVarK.g()) {
                                    if (string.contains(kVar.f62596a)) {
                                        g.b(kVar, cVarK.f61834p);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        Logger.e(g.f62535a, "Caught exception while creating json data", th);
                        new CrashReporter().caughtException(th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(f62535a, "failed during reportImageUploadedToServer. data: ", bundle.toString(), th);
            new CrashReporter().caughtException(th);
        }
    }

    public static void b(final Bundle bundle) {
        Logger.d(f62535a, "report file uploaded to server started");
        try {
            f62536b.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.g.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (bundle == null || bundle.size() <= 0) {
                            Logger.d(g.f62535a, "Data argument is null, which means that the upload failed or that the validation check has failed. Nothing to report to the server.");
                        } else {
                            Logger.d(g.f62535a, "Starting file upload report event.");
                            AppLovinBridge.reportFileUploadEvent(bundle, g.f62537c);
                        }
                    } catch (Throwable th) {
                        Logger.e(g.f62535a, "Caught exception while creating json data", th);
                        new CrashReporter().caughtException(th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(f62535a, "failed during reportFileUploadedToServer. data: ", bundle, th);
            new CrashReporter().caughtException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(k kVar, BrandSafetyUtils.AdType adType) {
        if (kVar != null) {
            a aVarA = SafeDK.getInstance().a(adType);
            if (aVarA != null) {
                Logger.d(f62535a, "Executing image cleanup request");
                aVarA.b(kVar);
            } else {
                Logger.d(f62535a, "Upload: finder not found for image cleanup request");
            }
        }
    }

    public static void c(final Bundle bundle) {
        try {
            f62536b.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.g.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (bundle == null) {
                            Logger.d(g.f62535a, "Data argument is null, which means reporting a resolved click url is not possible. ");
                        } else if (bundle.size() > 0) {
                            Logger.d(g.f62535a, "Starting url resolution report event.");
                            AppLovinBridge.reportClickUrlResolvedEvent(bundle, g.f62537c);
                        }
                    } catch (Throwable th) {
                        Logger.e(g.f62535a, "Caught exception while creating json data", th);
                        new CrashReporter().caughtException(th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(f62535a, "failed during reportImageUploadedToServer. data: ", bundle.toString(), th);
            new CrashReporter().caughtException(th);
        }
    }

    public String b() {
        return AppLovinBridge.f61283a;
    }
}
