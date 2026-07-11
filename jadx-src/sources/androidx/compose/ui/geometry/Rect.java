package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001UB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010#J8\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b'\u0010\u0019J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010+\u001a\u00020\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010#R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010#R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010.\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010#R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010.\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010#R\u001b\u0010:\u001a\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b9\u00101\u001a\u0004\b8\u0010#R\u001b\u0010=\u001a\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b<\u00101\u001a\u0004\b;\u0010#R \u0010B\u001a\u00020>8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bA\u00101\u001a\u0004\b?\u0010@R\u001a\u0010F\u001a\u00020\u001a8FX\u0087\u0004¢\u0006\f\u0012\u0004\bE\u00101\u001a\u0004\bC\u0010DR\u0017\u0010H\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bG\u0010@R\u0017\u0010J\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bI\u0010@R\u0017\u0010L\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bK\u0010@R\u0017\u0010N\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bM\u0010@R\u0017\u0010P\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bO\u0010@R\u0017\u0010R\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bQ\u0010@R\u0017\u0010T\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bS\u0010@\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "<init>", "(FFFF)V", "Landroidx/compose/ui/geometry/Offset;", "offset", "te", "(J)Landroidx/compose/ui/geometry/Rect;", "translateX", "translateY", "g", "(FF)Landroidx/compose/ui/geometry/Rect;", InneractiveMediationNameConsts.OTHER, "aYN", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "otherLeft", "otherTop", "otherRight", "otherBottom", "WPU", "(FFFF)Landroidx/compose/ui/geometry/Rect;", "", "nY", "(Landroidx/compose/ui/geometry/Rect;)Z", "J2", "(J)Z", "", "toString", "()Ljava/lang/String;", "rl", "()F", "t", "nr", "O", "Uo", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "F", "HI", "getLeft$annotations", "()V", "r", "getTop$annotations", "ck", "getRight$annotations", "xMQ", "getBottom$annotations", "S", "getWidth$annotations", "width", "ty", "getHeight$annotations", "height", "Landroidx/compose/ui/geometry/Size;", "Ik", "()J", "getSize-NH-jbRc$annotations", "size", "ViF", "()Z", "isEmpty$annotations", "isEmpty", "Z", "topLeft", "o", "topCenter", "XQ", "topRight", "az", TtmlNode.CENTER, "gh", "bottomLeft", "mUb", "bottomCenter", "qie", "bottomRight", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,287:1\n56#1,6:288\n56#1,6:303\n56#1,6:309\n56#1:319\n61#1:328\n56#1,6:333\n61#1:343\n56#1:352\n33#2:294\n53#3,3:295\n60#3:299\n70#3:302\n53#3,3:316\n53#3,3:321\n53#3,3:325\n53#3,3:330\n53#3,3:340\n53#3,3:345\n53#3,3:349\n53#3,3:354\n53#3,3:358\n60#3:362\n70#3:365\n65#4:298\n69#4:301\n65#4:361\n69#4:364\n22#5:300\n22#5:363\n22#5:366\n30#6:315\n30#6:320\n30#6:324\n30#6:329\n30#6:339\n30#6:344\n30#6:348\n30#6:353\n30#6:357\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/compose/ui/geometry/Rect\n*L\n66#1:288,6\n161#1:303,6\n165#1:309,6\n173#1:319\n181#1:328\n190#1:333,6\n194#1:343\n203#1:352\n66#1:294\n66#1:295,3\n100#1:299\n100#1:302\n169#1:316,3\n173#1:321,3\n177#1:325,3\n181#1:330,3\n190#1:340,3\n194#1:345,3\n198#1:349,3\n203#1:354,3\n209#1:358,3\n219#1:362\n220#1:365\n100#1:298\n100#1:301\n219#1:361\n220#1:364\n100#1:300\n219#1:363\n220#1:366\n169#1:315\n173#1:320\n177#1:324\n181#1:329\n190#1:339\n194#1:344\n198#1:348\n203#1:353\n209#1:357\n*E\n"})
public final /* data */ class Rect {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float left;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float bottom;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float top;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float right;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Rect J2 = new Rect(0.0f, 0.0f, 0.0f, 0.0f);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/geometry/Rect$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Rect;", "Zero", "Landroidx/compose/ui/geometry/Rect;", c.f62177j, "()Landroidx/compose/ui/geometry/Rect;", "getZero$annotations", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Rect n() {
            return Rect.J2;
        }
    }

    public static /* synthetic */ Rect KN(Rect rect, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = rect.left;
        }
        if ((i2 & 2) != 0) {
            f4 = rect.top;
        }
        if ((i2 & 4) != 0) {
            f5 = rect.right;
        }
        if ((i2 & 8) != 0) {
            f6 = rect.bottom;
        }
        return rect.Uo(f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    public final Rect Uo(float left, float top, float right, float bottom) {
        return new Rect(left, top, right, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) other;
        return Float.compare(this.left, rect.left) == 0 && Float.compare(this.top, rect.top) == 0 && Float.compare(this.right, rect.right) == 0 && Float.compare(this.bottom, rect.bottom) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }

    public final float nr() {
        return this.right;
    }

    public final float rl() {
        return this.left;
    }

    public final float t() {
        return this.top;
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    public final boolean J2(long offset) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (offset >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (offset & 4294967295L));
        return (fIntBitsToFloat >= this.left) & (fIntBitsToFloat < this.right) & (fIntBitsToFloat2 >= this.top) & (fIntBitsToFloat2 < this.bottom);
    }

    public final boolean ViF() {
        return (this.left >= this.right) | (this.top >= this.bottom);
    }

    public final Rect WPU(float otherLeft, float otherTop, float otherRight, float otherBottom) {
        return new Rect(Math.max(this.left, otherLeft), Math.max(this.top, otherTop), Math.min(this.right, otherRight), Math.min(this.bottom, otherBottom));
    }

    public final long XQ() {
        float f3 = this.right;
        return Offset.O((((long) Float.floatToRawIntBits(this.top)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
    }

    public final long Z() {
        float f3 = this.left;
        return Offset.O((((long) Float.floatToRawIntBits(this.top)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
    }

    public final Rect aYN(Rect other) {
        return new Rect(Math.max(this.left, other.left), Math.max(this.top, other.top), Math.min(this.right, other.right), Math.min(this.bottom, other.bottom));
    }

    public final long az() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        return Offset.O((((long) Float.floatToRawIntBits(this.top + ((xMQ() - getTop()) / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    public final Rect g(float translateX, float translateY) {
        return new Rect(this.left + translateX, this.top + translateY, this.right + translateX, this.bottom + translateY);
    }

    public final long gh() {
        float f3 = this.left;
        return Offset.O((((long) Float.floatToRawIntBits(this.bottom)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
    }

    public final long mUb() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        return Offset.O((((long) Float.floatToRawIntBits(this.bottom)) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    public final boolean nY(Rect other) {
        return (this.left < other.right) & (other.left < this.right) & (this.top < other.bottom) & (other.top < this.bottom);
    }

    public final long o() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        return Offset.O((((long) Float.floatToRawIntBits(this.top)) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    public final long qie() {
        float f3 = this.right;
        return Offset.O((((long) Float.floatToRawIntBits(this.bottom)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    public final Rect te(long offset) {
        int i2 = (int) (offset >> 32);
        int i3 = (int) (offset & 4294967295L);
        return new Rect(this.left + Float.intBitsToFloat(i2), this.top + Float.intBitsToFloat(i3), this.right + Float.intBitsToFloat(i2), this.bottom + Float.intBitsToFloat(i3));
    }

    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.n(this.left, 1) + ", " + GeometryUtilsKt.n(this.top, 1) + ", " + GeometryUtilsKt.n(this.right, 1) + ", " + GeometryUtilsKt.n(this.bottom, 1) + ')';
    }

    public final float xMQ() {
        return this.bottom;
    }

    public Rect(float f3, float f4, float f5, float f6) {
        this.left = f3;
        this.top = f4;
        this.right = f5;
        this.bottom = f6;
    }

    public final long Ik() {
        float right = getRight() - getLeft();
        return Size.nr((((long) Float.floatToRawIntBits(xMQ() - getTop())) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    public final float S() {
        return getRight() - getLeft();
    }

    public final float ty() {
        return xMQ() - getTop();
    }
}
