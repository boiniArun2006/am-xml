package androidx.compose.ui.semantics;

import androidx.compose.runtime.Immutable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/semantics/Role;", "", "", "value", "gh", "(I)I", "", "HI", "(I)Ljava/lang/String;", "ty", InneractiveMediationNameConsts.OTHER, "", "qie", "(ILjava/lang/Object;)Z", c.f62177j, "I", "rl", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class Role {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f33243t = gh(0);
    private static final int nr = gh(1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f33242O = gh(2);
    private static final int J2 = gh(3);
    private static final int Uo = gh(4);
    private static final int KN = gh(5);
    private static final int xMQ = gh(6);
    private static final int mUb = gh(7);
    private static final int gh = gh(8);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/semantics/Role$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/Role;", "Button", "I", c.f62177j, "()I", "Checkbox", "t", "Switch", "Uo", "RadioButton", "J2", "Tab", "KN", "Image", "O", "DropdownList", "nr", "ValuePicker", "xMQ", "Carousel", "rl", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int J2() {
            return Role.J2;
        }

        public final int KN() {
            return Role.Uo;
        }

        public final int O() {
            return Role.KN;
        }

        public final int Uo() {
            return Role.f33242O;
        }

        public final int n() {
            return Role.f33243t;
        }

        public final int nr() {
            return Role.xMQ;
        }

        public final int rl() {
            return Role.gh;
        }

        public final int t() {
            return Role.nr;
        }

        public final int xMQ() {
            return Role.mUb;
        }
    }

    public static final boolean az(int i2, int i3) {
        return i2 == i3;
    }

    private static int gh(int i2) {
        return i2;
    }

    public static final /* synthetic */ Role mUb(int i2) {
        return new Role(i2);
    }

    public static boolean qie(int i2, Object obj) {
        return (obj instanceof Role) && i2 == ((Role) obj).getValue();
    }

    public static int ty(int i2) {
        return Integer.hashCode(i2);
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return qie(this.value, obj);
    }

    public int hashCode() {
        return ty(this.value);
    }

    public static String HI(int i2) {
        return az(i2, f33243t) ? "Button" : az(i2, nr) ? "Checkbox" : az(i2, f33242O) ? "Switch" : az(i2, J2) ? "RadioButton" : az(i2, Uo) ? "Tab" : az(i2, KN) ? "Image" : az(i2, xMQ) ? "DropdownList" : az(i2, mUb) ? "Picker" : az(i2, gh) ? "Carousel" : "Unknown";
    }

    public String toString() {
        return HI(this.value);
    }

    private /* synthetic */ Role(int i2) {
        this.value = i2;
    }
}
