package i;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i.Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C2165Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f68047n;
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f68046t = 8;
    private static final C2165Ml nr = new C2165Ml(MapsKt.emptyMap());

    /* JADX INFO: renamed from: i.Ml$j */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2165Ml) && Intrinsics.areEqual(this.f68047n, ((C2165Ml) obj).f68047n);
    }

    public C2165Ml(Map languages) {
        Intrinsics.checkNotNullParameter(languages, "languages");
        this.f68047n = languages;
    }

    public int hashCode() {
        return this.f68047n.hashCode();
    }

    public final Map n() {
        return this.f68047n;
    }

    public String toString() {
        return "RemoteMultiLocalization(languages=" + this.f68047n + ")";
    }
}
