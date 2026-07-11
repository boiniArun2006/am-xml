package androidx.compose.material3.windowsizeclass;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/windowsizeclass/WindowHeightSizeClass;", "", "", "value", "xMQ", "(I)I", InneractiveMediationNameConsts.OTHER, "KN", "(II)I", "", "az", "(I)Ljava/lang/String;", "qie", "", "", "mUb", "(ILjava/lang/Object;)Z", c.f62177j, "I", "t", "Companion", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@JvmInline
public final class WindowHeightSizeClass implements Comparable<WindowHeightSizeClass> {
    private static final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f30035O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final Set f30036S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final List f30037Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Set f30038o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f30039r;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int value;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/windowsizeclass/WindowHeightSizeClass$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/windowsizeclass/WindowHeightSizeClass;", "Landroidx/compose/ui/unit/Dp;", "rl", "(I)F", "height", "", "supportedSizeClasses", "t", "(FLjava/util/Set;)I", "Medium", "I", "J2", "()I", "Expanded", "O", "DefaultSizeClasses", "Ljava/util/Set;", "nr", "()Ljava/util/Set;", "getDefaultSizeClasses$annotations", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nWindowSizeClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowSizeClass.kt\nandroidx/compose/material3/windowsizeclass/WindowHeightSizeClass$Companion\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,296:1\n154#2:297\n154#2:298\n154#2:299\n154#2:300\n1#3:301\n33#4,6:302\n*S KotlinDebug\n*F\n+ 1 WindowSizeClass.kt\nandroidx/compose/material3/windowsizeclass/WindowHeightSizeClass$Companion\n*L\n265#1:297\n266#1:298\n267#1:299\n279#1:300\n282#1:302,6\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int t(float height, Set supportedSizeClasses) {
            if (Dp.Uo(height, Dp.KN(0)) < 0) {
                throw new IllegalArgumentException("Width must not be negative");
            }
            if (supportedSizeClasses.isEmpty()) {
                throw new IllegalArgumentException("Must support at least one size class");
            }
            int iO = O();
            List list = WindowHeightSizeClass.f30037Z;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                int value = ((WindowHeightSizeClass) list.get(i2)).getValue();
                if (supportedSizeClasses.contains(WindowHeightSizeClass.J2(value))) {
                    if (Dp.Uo(height, WindowHeightSizeClass.INSTANCE.rl(value)) >= 0) {
                        return value;
                    }
                    iO = value;
                }
            }
            return iO;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float rl(int i2) {
            if (WindowHeightSizeClass.gh(i2, O())) {
                return Dp.KN(900);
            }
            if (WindowHeightSizeClass.gh(i2, J2())) {
                return Dp.KN(480);
            }
            return Dp.KN(0);
        }

        public final int J2() {
            return WindowHeightSizeClass.J2;
        }

        public final int O() {
            return WindowHeightSizeClass.f30039r;
        }

        public final Set nr() {
            return WindowHeightSizeClass.f30038o;
        }
    }

    public static final /* synthetic */ WindowHeightSizeClass J2(int i2) {
        return new WindowHeightSizeClass(i2);
    }

    public static final boolean gh(int i2, int i3) {
        return i2 == i3;
    }

    public static boolean mUb(int i2, Object obj) {
        return (obj instanceof WindowHeightSizeClass) && i2 == ((WindowHeightSizeClass) obj).getValue();
    }

    public static int qie(int i2) {
        return Integer.hashCode(i2);
    }

    private static int xMQ(int i2) {
        return i2;
    }

    public boolean equals(Object obj) {
        return mUb(this.value, obj);
    }

    public int hashCode() {
        return qie(this.value);
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    static {
        int iXMQ = xMQ(0);
        f30035O = iXMQ;
        int iXMQ2 = xMQ(1);
        J2 = iXMQ2;
        int iXMQ3 = xMQ(2);
        f30039r = iXMQ3;
        f30038o = SetsKt.setOf((Object[]) new WindowHeightSizeClass[]{J2(iXMQ), J2(iXMQ2), J2(iXMQ3)});
        List listListOf = CollectionsKt.listOf((Object[]) new WindowHeightSizeClass[]{J2(iXMQ3), J2(iXMQ2), J2(iXMQ)});
        f30037Z = listListOf;
        f30036S = CollectionsKt.toSet(listListOf);
    }

    public static int KN(int i2, int i3) {
        Companion companion = INSTANCE;
        return Dp.Uo(companion.rl(i2), companion.rl(i3));
    }

    public static String az(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("WindowHeightSizeClass.");
        sb.append(gh(i2, f30035O) ? "Compact" : gh(i2, J2) ? "Medium" : gh(i2, f30039r) ? "Expanded" : "");
        return sb.toString();
    }

    public int Uo(int i2) {
        return KN(this.value, i2);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(WindowHeightSizeClass windowHeightSizeClass) {
        return Uo(windowHeightSizeClass.getValue());
    }

    public String toString() {
        return az(this.value);
    }

    private /* synthetic */ WindowHeightSizeClass(int i2) {
        this.value = i2;
    }
}
