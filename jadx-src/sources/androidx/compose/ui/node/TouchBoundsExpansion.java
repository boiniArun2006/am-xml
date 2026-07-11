package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.utils.Float16;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.l;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087@\u0018\u0000 \t2\u00020\u0001:\u0001\"B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u001c\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0010R\u0011\u0010\u001e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0010R\u0011\u0010!\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006#"}, d2 = {"Landroidx/compose/ui/node/TouchBoundsExpansion;", "", "", "packedValue", "nr", "(J)J", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "rl", "(JLandroidx/compose/ui/unit/LayoutDirection;)I", "t", "", "qie", "(J)Ljava/lang/String;", "mUb", "(J)I", InneractiveMediationNameConsts.OTHER, "", "O", "(JLjava/lang/Object;)Z", c.f62177j, "J", "KN", TtmlNode.START, "xMQ", "top", "Uo", TtmlNode.END, "J2", "bottom", "gh", "(J)Z", "isLayoutDirectionAware", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class TouchBoundsExpansion {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f32648t = TouchBoundsExpansionKt.t(0, 0, 0, 0, 14, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\u00020\u00158\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/node/TouchBoundsExpansion$Companion;", "", "<init>", "()V", "", "packedValue", "", "position", "O", "(JI)I", l.f62668w, "nr", "(II)J", TtmlNode.START, "top", TtmlNode.END, "bottom", "", "isLayoutDirectionAware", "t", "(IIIIZ)J", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "None", "J", "rl", "()J", "IS_LAYOUT_DIRECTION_AWARE", "MASK", "I", "MAX_VALUE", "SHIFT", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTouchBoundsExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansion$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,248:1\n102#2,5:249\n102#2,5:254\n102#2,5:259\n102#2,5:264\n*S KotlinDebug\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansion$Companion\n*L\n49#1:249,5\n52#1:254,5\n55#1:259,5\n58#1:264,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int O(long packedValue, int position) {
            return ((int) (packedValue >> (position * 15))) & Float16.EXPONENT_SIGNIFICAND_MASK;
        }

        private final long nr(int i2, int position) {
            return ((long) (i2 & Float16.EXPONENT_SIGNIFICAND_MASK)) << (position * 15);
        }

        public final long t(int start, int top, int end, int bottom, boolean isLayoutDirectionAware) {
            return nr(top, 1) | nr(start, 0) | nr(end, 2) | nr(bottom, 3) | (isLayoutDirectionAware ? Long.MIN_VALUE : 0L);
        }

        private Companion() {
        }

        public final long rl() {
            return TouchBoundsExpansion.f32648t;
        }
    }

    public static boolean O(long j2, Object obj) {
        return (obj instanceof TouchBoundsExpansion) && j2 == ((TouchBoundsExpansion) obj).getPackedValue();
    }

    public static final boolean gh(long j2) {
        return (j2 & Long.MIN_VALUE) != 0;
    }

    public static int mUb(long j2) {
        return Long.hashCode(j2);
    }

    public static long nr(long j2) {
        return j2;
    }

    public static String qie(long j2) {
        return "TouchBoundsExpansion(packedValue=" + j2 + ')';
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public boolean equals(Object obj) {
        return O(this.packedValue, obj);
    }

    public int hashCode() {
        return mUb(this.packedValue);
    }

    public String toString() {
        return qie(this.packedValue);
    }

    public static final int J2(long j2) {
        return INSTANCE.O(j2, 3);
    }

    public static final int KN(long j2) {
        return INSTANCE.O(j2, 0);
    }

    public static final int Uo(long j2) {
        return INSTANCE.O(j2, 2);
    }

    public static final int xMQ(long j2) {
        return INSTANCE.O(j2, 1);
    }

    public static final int rl(long j2, LayoutDirection layoutDirection) {
        if (gh(j2) && layoutDirection != LayoutDirection.f34160n) {
            return Uo(j2);
        }
        return KN(j2);
    }

    public static final int t(long j2, LayoutDirection layoutDirection) {
        if (gh(j2) && layoutDirection != LayoutDirection.f34160n) {
            return KN(j2);
        }
        return Uo(j2);
    }
}
