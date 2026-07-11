package qu;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j extends UX1.j {
    private static j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C1123j f72495O = new C1123j(null);

    /* JADX INFO: renamed from: qu.j$j, reason: collision with other inner class name */
    public static final class C1123j {
        public /* synthetic */ C1123j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1123j() {
        }

        public final j n(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            j jVar = j.J2;
            if (jVar != null) {
                return jVar;
            }
            j jVar2 = new j(context);
            j.J2 = jVar2;
            return jVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context, "oracle");
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
