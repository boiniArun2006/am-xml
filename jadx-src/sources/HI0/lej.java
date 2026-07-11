package HI0;

import android.content.Intent;
import android.os.Build;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class lej {
    public static final Serializable n(Intent intent, String name, Class clazz) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (Build.VERSION.SDK_INT >= 33) {
            return intent.getSerializableExtra(name, clazz);
        }
        Serializable serializableExtra = intent.getSerializableExtra(name);
        if (serializableExtra != null) {
            return serializableExtra;
        }
        return null;
    }
}
