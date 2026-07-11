package rH;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile fuX f72978n;
    private static SharedPreferences rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f72979t = new j(null);

    public static final class j {
        private j() {
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final fuX n(Context context) {
            fuX fux;
            Intrinsics.checkNotNullParameter(context, "context");
            fuX fux2 = fuX.f72978n;
            if (fux2 != null) {
                return fux2;
            }
            synchronized (this) {
                fux = fuX.f72978n;
                if (fux == null) {
                    fux = new fuX();
                    fuX.f72978n = fux;
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.skydoves.balloon", 0);
                    Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…n\", Context.MODE_PRIVATE)");
                    fuX.rl = sharedPreferences;
                }
            }
            return fux;
        }

        public final String rl(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return "SHOWED_UP" + name;
        }
    }

    private final void O(String str, int i2) {
        SharedPreferences sharedPreferences = rl;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferenceManager");
        }
        sharedPreferences.edit().putInt(f72979t.rl(str), i2).apply();
    }

    private final int nr(String str) {
        SharedPreferences sharedPreferences = rl;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferenceManager");
        }
        return sharedPreferences.getInt(f72979t.rl(str), 0);
    }

    public final void J2(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        O(name, nr(name) + 1);
    }

    public final boolean Uo(String name, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        return nr(name) < i2;
    }
}
