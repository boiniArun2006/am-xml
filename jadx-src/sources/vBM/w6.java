package vBM;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import cB.C1677j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w6 f74692n = new w6();

    private final SharedPreferences nr(Context context, String str, boolean z2) {
        if (z2) {
            SharedPreferences sharedPreferencesN = EncryptedSharedPreferences.n(context, str, new MasterKey.Builder(context).n(), EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
            Intrinsics.checkNotNull(sharedPreferencesN);
            return sharedPreferencesN;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        Intrinsics.checkNotNull(sharedPreferences);
        return sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences t(Context context, String str, boolean z2) {
        return f74692n.nr(context, str, z2);
    }

    public final C1677j rl(final Context context, final String sharedPrefsName, final boolean z2, Function2 shouldRunMigration, Function3 migration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPrefsName, "sharedPrefsName");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migration, "migration");
        return new C1677j(new Function0() { // from class: vBM.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.t(context, sharedPrefsName, z2);
            }
        }, shouldRunMigration, migration);
    }

    private w6() {
    }
}
