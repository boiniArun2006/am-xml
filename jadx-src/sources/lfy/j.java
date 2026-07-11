package lfy;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final v2a.j f70437n = new v2a.j("SplitInstallHelper");

    public static void n(Context context, String str) {
        synchronized (n.class) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e2) {
                String str2 = context.getApplicationInfo().nativeLibraryDir + "/" + System.mapLibraryName(str);
                if (!new File(str2).exists()) {
                    throw e2;
                }
                System.load(str2);
            }
        }
    }
}
