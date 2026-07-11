package foC;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n {
    public static final SharedPreferences n(Context context, String name, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        if (z2) {
            SharedPreferences sharedPreferencesN = EncryptedSharedPreferences.n(context, name, new MasterKey.Builder(context).n(), EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
            Intrinsics.checkNotNull(sharedPreferencesN);
            return sharedPreferencesN;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(name, 0);
        Intrinsics.checkNotNull(sharedPreferences);
        return sharedPreferences;
    }
}
