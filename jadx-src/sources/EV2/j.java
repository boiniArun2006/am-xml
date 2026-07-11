package EV2;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.rv6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j {
    public static final C0080j rl = new C0080j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final boolean f2323t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final rv6 f2324n;

    /* JADX INFO: renamed from: EV2.j$j, reason: collision with other inner class name */
    public static final class C0080j {
        public /* synthetic */ C0080j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0080j() {
        }
    }

    private final boolean n(String str) {
        if (str != null) {
            return StringsKt.contains$default((CharSequence) str, (CharSequence) "gps", false, 2, (Object) null);
        }
        return false;
    }

    static {
        f2323t = Random.INSTANCE.nextDouble() <= 1.0E-4d;
    }

    public j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f2324n = new rv6(context);
    }

    public final void rl(String str, Bundle bundle) {
        if (f2323t && n(str)) {
            this.f2324n.Uo(str, bundle);
        }
    }
}
