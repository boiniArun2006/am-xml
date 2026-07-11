package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.Rectangle;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00010B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\fJ\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020 J\u0016\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J1\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001b¨\u00061"}, d2 = {"Lcom/alightcreative/app/motion/scene/Rectangle;", "", TtmlNode.LEFT, "", "top", TtmlNode.RIGHT, "bottom", "<init>", "(FFFF)V", "origin", "Lcom/alightcreative/app/motion/scene/Vector2D;", "size", "(Lcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/Vector2D;)V", "getLeft", "()F", "getTop", "getRight", "getBottom", "width", "getWidth", "height", "getHeight", "cx", "getCx", "cy", "getCy", "getSize", "()Lcom/alightcreative/app/motion/scene/Vector2D;", TtmlNode.CENTER, "getCenter", "getOrigin", "isEmpty", "", "isNotEmpty", "contains", "x", "y", "component1", "component2", "component3", "component4", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Rectangle {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Rectangle EMPTY = new Rectangle(0.0f, 0.0f, 0.0f, 0.0f);
    private static final Rectangle GL_FULLSCREEN = new Rectangle(-1.0f, -1.0f, 1.0f, 1.0f);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u001f\u0010\r\u001a\u00020\u00052\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000f\"\u00020\f¢\u0006\u0002\u0010\u0010J\u0014\u0010\r\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0011J\u0012\u0010\r\u001a\u00020\u00052\n\u0010\u000e\u001a\u00020\u0012\"\u00020\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/alightcreative/app/motion/scene/Rectangle$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/alightcreative/app/motion/scene/Rectangle;", "getEMPTY", "()Lcom/alightcreative/app/motion/scene/Rectangle;", "GL_FULLSCREEN", "getGL_FULLSCREEN", "centeredWithSize", "size", "Lcom/alightcreative/app/motion/scene/Vector2D;", "enclosing", TtmlNode.TAG_P, "", "([Lcom/alightcreative/app/motion/scene/Vector2D;)Lcom/alightcreative/app/motion/scene/Rectangle;", "", "", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nGeometry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Geometry.kt\ncom/alightcreative/app/motion/scene/Rectangle$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,572:1\n1#2:573\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Rectangle enclosing(Vector2D... p2) {
            Float fValueOf;
            Float fValueOf2;
            Float fValueOf3;
            Intrinsics.checkNotNullParameter(p2, "p");
            Float fValueOf4 = null;
            int i2 = 1;
            if (p2.length == 0) {
                fValueOf = null;
            } else {
                float x2 = p2[0].getX();
                int lastIndex = ArraysKt.getLastIndex(p2);
                if (1 <= lastIndex) {
                    int i3 = 1;
                    while (true) {
                        x2 = Math.min(x2, p2[i3].getX());
                        if (i3 == lastIndex) {
                            break;
                        }
                        i3++;
                    }
                }
                fValueOf = Float.valueOf(x2);
            }
            if (p2.length == 0) {
                fValueOf2 = null;
            } else {
                float y2 = p2[0].getY();
                int lastIndex2 = ArraysKt.getLastIndex(p2);
                if (1 <= lastIndex2) {
                    int i5 = 1;
                    while (true) {
                        y2 = Math.min(y2, p2[i5].getY());
                        if (i5 == lastIndex2) {
                            break;
                        }
                        i5++;
                    }
                }
                fValueOf2 = Float.valueOf(y2);
            }
            if (p2.length == 0) {
                fValueOf3 = null;
            } else {
                float x3 = p2[0].getX();
                int lastIndex3 = ArraysKt.getLastIndex(p2);
                if (1 <= lastIndex3) {
                    int i7 = 1;
                    while (true) {
                        x3 = Math.max(x3, p2[i7].getX());
                        if (i7 == lastIndex3) {
                            break;
                        }
                        i7++;
                    }
                }
                fValueOf3 = Float.valueOf(x3);
            }
            if (p2.length != 0) {
                float y3 = p2[0].getY();
                int lastIndex4 = ArraysKt.getLastIndex(p2);
                if (1 <= lastIndex4) {
                    while (true) {
                        y3 = Math.max(y3, p2[i2].getY());
                        if (i2 == lastIndex4) {
                            break;
                        }
                        i2++;
                    }
                }
                fValueOf4 = Float.valueOf(y3);
            }
            return (fValueOf == null || fValueOf2 == null || fValueOf3 == null || fValueOf4 == null) ? getEMPTY() : new Rectangle(fValueOf.floatValue(), fValueOf2.floatValue(), fValueOf3.floatValue(), fValueOf4.floatValue());
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enclosing$lambda$8(float[] fArr, List list, List list2, Float f3, Float f4, Float f5, Float f6) {
            return "Rectangle.enclosing(" + ArraysKt.joinToString$default(fArr, (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + " xcoords=" + CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null) + ") ycoords=" + CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, null, 62, null) + ") lowx=" + f3 + " lowy=" + f4 + " highx=" + f5 + " highy=" + f6;
        }

        public final Rectangle centeredWithSize(Vector2D size) {
            Intrinsics.checkNotNullParameter(size, "size");
            return new Rectangle((-size.getX()) / 2.0f, (-size.getY()) / 2.0f, size.getX() / 2.0f, size.getY() / 2.0f);
        }

        public final Rectangle getEMPTY() {
            return Rectangle.EMPTY;
        }

        public final Rectangle getGL_FULLSCREEN() {
            return Rectangle.GL_FULLSCREEN;
        }

        public final Rectangle enclosing(Iterable<Vector2D> p2) {
            Float fValueOf;
            Float fValueOf2;
            Float fValueOf3;
            Intrinsics.checkNotNullParameter(p2, "p");
            Iterator<Vector2D> it = p2.iterator();
            Float fValueOf4 = null;
            if (it.hasNext()) {
                float x2 = it.next().getX();
                while (it.hasNext()) {
                    x2 = Math.min(x2, it.next().getX());
                }
                fValueOf = Float.valueOf(x2);
            } else {
                fValueOf = null;
            }
            Iterator<Vector2D> it2 = p2.iterator();
            if (it2.hasNext()) {
                float y2 = it2.next().getY();
                while (it2.hasNext()) {
                    y2 = Math.min(y2, it2.next().getY());
                }
                fValueOf2 = Float.valueOf(y2);
            } else {
                fValueOf2 = null;
            }
            Iterator<Vector2D> it3 = p2.iterator();
            if (it3.hasNext()) {
                float x3 = it3.next().getX();
                while (it3.hasNext()) {
                    x3 = Math.max(x3, it3.next().getX());
                }
                fValueOf3 = Float.valueOf(x3);
            } else {
                fValueOf3 = null;
            }
            Iterator<Vector2D> it4 = p2.iterator();
            if (it4.hasNext()) {
                float y3 = it4.next().getY();
                while (it4.hasNext()) {
                    y3 = Math.max(y3, it4.next().getY());
                }
                fValueOf4 = Float.valueOf(y3);
            }
            if (fValueOf != null && fValueOf2 != null && fValueOf3 != null && fValueOf4 != null) {
                return new Rectangle(fValueOf.floatValue(), fValueOf2.floatValue(), fValueOf3.floatValue(), fValueOf4.floatValue());
            }
            return getEMPTY();
        }

        public final Rectangle enclosing(final float... p2) {
            Intrinsics.checkNotNullParameter(p2, "p");
            final List<Float> listSlice = ArraysKt.slice(p2, (Iterable<Integer>) RangesKt.step(new IntRange(0, ArraysKt.getLastIndex(p2)), 2));
            final List<Float> listSlice2 = ArraysKt.slice(p2, (Iterable<Integer>) RangesKt.step(new IntRange(1, ArraysKt.getLastIndex(p2)), 2));
            final Float fMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) listSlice);
            final Float fMinOrNull2 = CollectionsKt.minOrNull((Iterable<? extends Float>) listSlice2);
            final Float fMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) listSlice);
            final Float fMaxOrNull2 = CollectionsKt.maxOrNull((Iterable<? extends Float>) listSlice2);
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.scene.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Rectangle.Companion.enclosing$lambda$8(p2, listSlice, listSlice2, fMinOrNull, fMinOrNull2, fMaxOrNull, fMaxOrNull2);
                }
            });
            if (fMinOrNull != null && fMinOrNull2 != null && fMaxOrNull != null && fMaxOrNull2 != null) {
                return new Rectangle(fMinOrNull.floatValue(), fMinOrNull2.floatValue(), fMaxOrNull.floatValue(), fMaxOrNull2.floatValue());
            }
            return getEMPTY();
        }
    }

    public Rectangle(float f3, float f4, float f5, float f6) {
        this.left = f3;
        this.top = f4;
        this.right = f5;
        this.bottom = f6;
    }

    public static /* synthetic */ Rectangle copy$default(Rectangle rectangle, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = rectangle.left;
        }
        if ((i2 & 2) != 0) {
            f4 = rectangle.top;
        }
        if ((i2 & 4) != 0) {
            f5 = rectangle.right;
        }
        if ((i2 & 8) != 0) {
            f6 = rectangle.bottom;
        }
        return rectangle.copy(f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    public final Rectangle copy(float left, float top, float right, float bottom) {
        return new Rectangle(left, top, right, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) other;
        return Float.compare(this.left, rectangle.left) == 0 && Float.compare(this.top, rectangle.top) == 0 && Float.compare(this.right, rectangle.right) == 0 && Float.compare(this.bottom, rectangle.bottom) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }

    public String toString() {
        return "Rectangle(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ")";
    }

    public final boolean contains(float x2, float y2) {
        float f3 = this.left;
        float f4 = this.right;
        if (f3 >= f4) {
            return false;
        }
        float f5 = this.top;
        float f6 = this.bottom;
        return f5 < f6 && x2 >= f3 && x2 < f4 && y2 >= f5 && y2 < f6;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final Vector2D getCenter() {
        return new Vector2D(getCx(), getCy());
    }

    public final float getCx() {
        return (this.left + this.right) / 2.0f;
    }

    public final float getCy() {
        return (this.top + this.bottom) / 2.0f;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final Vector2D getOrigin() {
        return new Vector2D(this.left, this.top);
    }

    public final float getRight() {
        return this.right;
    }

    public final Vector2D getSize() {
        return new Vector2D(getWidth(), getHeight());
    }

    public final float getTop() {
        return this.top;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final boolean isNotEmpty() {
        return this.left < this.right && this.top < this.bottom;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rectangle(Vector2D origin, Vector2D size) {
        this(origin.getX(), origin.getY(), origin.getX() + size.getX(), origin.getY() + size.getY());
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(size, "size");
    }
}
