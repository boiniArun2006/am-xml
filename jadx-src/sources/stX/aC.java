package stX;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f73359n = new j(null);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final Object n(int i2, Function0 message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return aC.rl(new Dsr(i2, message));
        }

        public final Object rl(int i2) {
            return aC.rl(Integer.valueOf(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object rl(Object obj) {
        return obj;
    }
}
