package androidx.core.os;

import android.content.Context;
import android.os.UserManager;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class UserManagerCompat {

    @RequiresApi
    static class Api24Impl {
        static boolean n(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean n(Context context) {
        return Api24Impl.n(context);
    }
}
