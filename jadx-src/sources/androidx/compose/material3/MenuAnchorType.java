package androidx.compose.material3;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/MenuAnchorType;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "O", "(Ljava/lang/String;)Ljava/lang/String;", "xMQ", "", "KN", "(Ljava/lang/String;)I", InneractiveMediationNameConsts.OTHER, "", "J2", "(Ljava/lang/String;Ljava/lang/Object;)Z", c.f62177j, "Ljava/lang/String;", "rl", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
public final class MenuAnchorType {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f26183t = O("PrimaryNotEditable");
    private static final String nr = O("PrimaryEditable");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String f26182O = O("SecondaryEditable");

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/material3/MenuAnchorType$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/MenuAnchorType;", "PrimaryNotEditable", "Ljava/lang/String;", "rl", "()Ljava/lang/String;", "PrimaryEditable", c.f62177j, "SecondaryEditable", "t", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String n() {
            return MenuAnchorType.nr;
        }

        public final String rl() {
            return MenuAnchorType.f26183t;
        }

        public final String t() {
            return MenuAnchorType.f26182O;
        }
    }

    public static boolean J2(String str, Object obj) {
        return (obj instanceof MenuAnchorType) && Intrinsics.areEqual(str, ((MenuAnchorType) obj).getName());
    }

    public static int KN(String str) {
        return str.hashCode();
    }

    private static String O(String str) {
        return str;
    }

    public static final boolean Uo(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    public static final /* synthetic */ MenuAnchorType nr(String str) {
        return new MenuAnchorType(str);
    }

    public static String xMQ(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        return J2(this.name, obj);
    }

    public int hashCode() {
        return KN(this.name);
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final /* synthetic */ String getName() {
        return this.name;
    }

    public String toString() {
        return xMQ(this.name);
    }

    private /* synthetic */ MenuAnchorType(String str) {
        this.name = str;
    }
}
