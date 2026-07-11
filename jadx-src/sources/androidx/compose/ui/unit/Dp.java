package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import com.caoccao.javet.values.primitive.V8ValueDouble;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0097\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "", "", "value", "KN", "(F)F", InneractiveMediationNameConsts.OTHER, "", "Uo", "(FF)I", "", "qie", "(F)Ljava/lang/String;", "gh", "(F)I", "", "", "xMQ", "(FLjava/lang/Object;)Z", c.f62177j, "F", "getValue", "()F", "t", "Companion", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,434:1\n102#2:435\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n74#1:435\n*E\n"})
public final class Dp implements Comparable<Dp> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float value;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f34141O = KN(0.0f);
    private static final float J2 = KN(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f34142r = KN(Float.NaN);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/unit/Dp$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "Hairline", "F", c.f62177j, "()F", "getHairline-D9Ej5fM$annotations", V8ValueDouble.INFINITY, "rl", "getInfinity-D9Ej5fM$annotations", "Unspecified", "t", "getUnspecified-D9Ej5fM$annotations", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final float n() {
            return Dp.f34141O;
        }

        public final float rl() {
            return Dp.J2;
        }

        public final float t() {
            return Dp.f34142r;
        }
    }

    public static float KN(float f3) {
        return f3;
    }

    public static int gh(float f3) {
        return Float.hashCode(f3);
    }

    public static final boolean mUb(float f3, float f4) {
        return Float.compare(f3, f4) == 0;
    }

    public static final /* synthetic */ Dp nr(float f3) {
        return new Dp(f3);
    }

    public static boolean xMQ(float f3, Object obj) {
        return (obj instanceof Dp) && Float.compare(f3, ((Dp) obj).getValue()) == 0;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final /* synthetic */ float getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return xMQ(this.value, obj);
    }

    public int hashCode() {
        return gh(this.value);
    }

    public int J2(float f3) {
        return Uo(this.value, f3);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Dp dp) {
        return J2(dp.getValue());
    }

    public String toString() {
        return qie(this.value);
    }

    private /* synthetic */ Dp(float f3) {
        this.value = f3;
    }

    public static int Uo(float f3, float f4) {
        return Float.compare(f3, f4);
    }

    public static String qie(float f3) {
        if (Float.isNaN(f3)) {
            return "Dp.Unspecified";
        }
        return f3 + ".dp";
    }
}
