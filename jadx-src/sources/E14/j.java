package E14;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: E14.j$j, reason: collision with other inner class name */
    public static final class C0078j extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Function2 f2243n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0078j(Function2 content) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.f2243n = content;
        }

        public final Function2 n() {
            return this.f2243n;
        }
    }

    public static final class n extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f2244n = new n();

        private n() {
            super(null);
        }
    }

    public static final class w6 extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f2245n = new w6();

        private w6() {
            super(null);
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private j() {
    }
}
