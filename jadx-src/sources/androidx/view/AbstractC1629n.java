package androidx.view;

import androidx.view.NavType;

/* JADX INFO: renamed from: androidx.navigation.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract /* synthetic */ class AbstractC1629n {
    public static /* synthetic */ NavType n(NavType.Companion companion, String str, String str2) {
        if (str == null || !str.startsWith("java")) {
            return companion.n(str, str2);
        }
        try {
            return companion.n("j$" + str.substring(4), str2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof ClassNotFoundException) {
                return companion.n(str, str2);
            }
            throw e2;
        }
    }
}
