package androidx.compose.material3.windowsizeclass;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.DpSize;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Immutable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000eR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", "", "Landroidx/compose/material3/windowsizeclass/WindowWidthSizeClass;", "widthSizeClass", "Landroidx/compose/material3/windowsizeclass/WindowHeightSizeClass;", "heightSizeClass", "<init>", "(II)V", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", c.f62177j, "I", "rl", "getHeightSizeClass-Pt018CI", "t", "Companion", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WindowSizeClass {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int widthSizeClass;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int heightSizeClass;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/windowsizeclass/WindowSizeClass$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/DpSize;", "size", "", "Landroidx/compose/material3/windowsizeclass/WindowWidthSizeClass;", "supportedWidthSizeClasses", "Landroidx/compose/material3/windowsizeclass/WindowHeightSizeClass;", "supportedHeightSizeClasses", "Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", c.f62177j, "(JLjava/util/Set;Ljava/util/Set;)Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ WindowSizeClass rl(Companion companion, long j2, Set set, Set set2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                set = WindowWidthSizeClass.INSTANCE.O();
            }
            if ((i2 & 4) != 0) {
                set2 = WindowHeightSizeClass.INSTANCE.nr();
            }
            return companion.n(j2, set, set2);
        }

        public final WindowSizeClass n(long size, Set supportedWidthSizeClasses, Set supportedHeightSizeClasses) {
            return new WindowSizeClass(WindowWidthSizeClass.INSTANCE.t(DpSize.mUb(size), supportedWidthSizeClasses), WindowHeightSizeClass.INSTANCE.t(DpSize.xMQ(size), supportedHeightSizeClasses), null);
        }
    }

    public /* synthetic */ WindowSizeClass(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || WindowSizeClass.class != other.getClass()) {
            return false;
        }
        WindowSizeClass windowSizeClass = (WindowSizeClass) other;
        return WindowWidthSizeClass.qie(this.widthSizeClass, windowSizeClass.widthSizeClass) && WindowHeightSizeClass.gh(this.heightSizeClass, windowSizeClass.heightSizeClass);
    }

    private WindowSizeClass(int i2, int i3) {
        this.widthSizeClass = i2;
        this.heightSizeClass = i3;
    }

    public int hashCode() {
        return (WindowWidthSizeClass.az(this.widthSizeClass) * 31) + WindowHeightSizeClass.qie(this.heightSizeClass);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getWidthSizeClass() {
        return this.widthSizeClass;
    }

    public String toString() {
        return "WindowSizeClass(" + ((Object) WindowWidthSizeClass.ty(this.widthSizeClass)) + ", " + ((Object) WindowHeightSizeClass.az(this.heightSizeClass)) + ')';
    }
}
