package androidx.compose.ui.graphics;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u001eB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment;", "", "Landroidx/compose/ui/graphics/PathSegment$Type;", "type", "", "points", "", "weight", "<init>", "(Landroidx/compose/ui/graphics/PathSegment$Type;[FF)V", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/ui/graphics/PathSegment$Type;", "rl", "()Landroidx/compose/ui/graphics/PathSegment$Type;", "[F", "()[F", "t", "F", "getWeight", "()F", "Type", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PathSegment {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Type type;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final float[] points;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final float weight;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment$Type;", "", "<init>", "(Ljava/lang/String;I)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "t", "O", "J2", "r", "o", "Z", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private static final /* synthetic */ Type[] f31521S;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f31523g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Type f31524n = new Type("Move", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Type f31527t = new Type("Line", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final Type f31520O = new Type("Quadratic", 2);
        public static final Type J2 = new Type("Conic", 3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final Type f31526r = new Type("Cubic", 4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final Type f31525o = new Type("Close", 5);

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final Type f31522Z = new Type("Done", 6);

        private static final /* synthetic */ Type[] n() {
            return new Type[]{f31524n, f31527t, f31520O, J2, f31526r, f31525o, f31522Z};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f31521S.clone();
        }

        static {
            Type[] typeArrN = n();
            f31521S = typeArrN;
            f31523g = EnumEntriesKt.enumEntries(typeArrN);
        }

        private Type(String str, int i2) {
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && PathSegment.class == other.getClass()) {
            PathSegment pathSegment = (PathSegment) other;
            if (this.type == pathSegment.type && Arrays.equals(this.points, pathSegment.points) && this.weight == pathSegment.weight) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Arrays.hashCode(this.points)) * 31) + Float.hashCode(this.weight);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float[] getPoints() {
        return this.points;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PathSegment(type=");
        sb.append(this.type);
        sb.append(", points=");
        String string = Arrays.toString(this.points);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb.append(string);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(')');
        return sb.toString();
    }

    public PathSegment(Type type, float[] fArr, float f3) {
        this.type = type;
        this.points = fArr;
        this.weight = f3;
    }
}
