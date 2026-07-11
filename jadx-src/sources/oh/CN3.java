package oh;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class CN3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences rl(Context context, String str) {
        try {
            return EncryptedSharedPreferences.n(context, str, new MasterKey.Builder(context).rl(MasterKey.KeyScheme.AES256_GCM).n(), EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        } catch (Exception unused) {
            context.deleteSharedPreferences(str);
            return EncryptedSharedPreferences.n(context, str, new MasterKey.Builder(context).rl(MasterKey.KeyScheme.AES256_GCM).n(), EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        }
    }
}
