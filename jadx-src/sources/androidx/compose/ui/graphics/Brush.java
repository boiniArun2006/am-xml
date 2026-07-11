package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u00020\u00048\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0012\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/Brush;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/Paint;", TtmlNode.TAG_P, "", "alpha", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(JLandroidx/compose/ui/graphics/Paint;F)V", "J", "rl", "()J", "intrinsicSize", "Companion", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/SolidColor;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Brush {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long intrinsicSize;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u000f\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\\\u0010\u0019\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\\\u0010\u001d\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ>\u0010\u001f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/Brush$Companion;", "", "<init>", "()V", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "Landroidx/compose/ui/geometry/Offset;", TtmlNode.START, TtmlNode.END, "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "Landroidx/compose/ui/graphics/Brush;", "rl", "([Lkotlin/Pair;JJI)Landroidx/compose/ui/graphics/Brush;", "", "colors", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Ljava/util/List;JJI)Landroidx/compose/ui/graphics/Brush;", "startY", "endY", "Uo", "(Ljava/util/List;FFI)Landroidx/compose/ui/graphics/Brush;", "KN", "([Lkotlin/Pair;FFI)Landroidx/compose/ui/graphics/Brush;", TtmlNode.CENTER, "radius", "nr", "([Lkotlin/Pair;JFI)Landroidx/compose/ui/graphics/Brush;", "t", "(Ljava/util/List;JFI)Landroidx/compose/ui/graphics/Brush;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,658:1\n1#2:659\n30#3:660\n30#3:664\n30#3:668\n30#3:672\n30#3:676\n30#3:680\n53#4,3:661\n53#4,3:665\n53#4,3:669\n53#4,3:673\n53#4,3:677\n53#4,3:681\n*S KotlinDebug\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n*L\n149#1:660\n186#1:664\n187#1:668\n218#1:672\n255#1:676\n256#1:680\n149#1:661,3\n186#1:665,3\n187#1:669,3\n218#1:673,3\n255#1:677,3\n256#1:681,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Brush KN(Pair[] colorStops, float startY, float endY, int tileMode) {
            return rl((Pair[]) Arrays.copyOf(colorStops, colorStops.length), Offset.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(startY)) & 4294967295L)), Offset.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(endY)) & 4294967295L)), tileMode);
        }

        public final Brush Uo(List colors, float startY, float endY, int tileMode) {
            return n(colors, Offset.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(startY)) & 4294967295L)), Offset.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(endY)) & 4294967295L)), tileMode);
        }

        public final Brush nr(Pair[] colorStops, long center, float radius, int tileMode) {
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair pair : colorStops) {
                arrayList.add(Color.xMQ(((Color) pair.getSecond()).getValue()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair pair2 : colorStops) {
                arrayList2.add(Float.valueOf(((Number) pair2.getFirst()).floatValue()));
            }
            return new RadialGradient(arrayList, arrayList2, center, radius, tileMode, null);
        }

        public final Brush rl(Pair[] colorStops, long start, long end, int tileMode) {
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair pair : colorStops) {
                arrayList.add(Color.xMQ(((Color) pair.getSecond()).getValue()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair pair2 : colorStops) {
                arrayList2.add(Float.valueOf(((Number) pair2.getFirst()).floatValue()));
            }
            return new LinearGradient(arrayList, arrayList2, start, end, tileMode, null);
        }

        private Companion() {
        }

        public static /* synthetic */ Brush J2(Companion companion, Pair[] pairArr, long j2, float f3, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                j2 = Offset.INSTANCE.rl();
            }
            long j3 = j2;
            if ((i3 & 4) != 0) {
                f3 = Float.POSITIVE_INFINITY;
            }
            float f4 = f3;
            if ((i3 & 8) != 0) {
                i2 = TileMode.INSTANCE.n();
            }
            return companion.nr(pairArr, j3, f4, i2);
        }

        public static /* synthetic */ Brush O(Companion companion, List list, long j2, float f3, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                j2 = Offset.INSTANCE.rl();
            }
            long j3 = j2;
            if ((i3 & 4) != 0) {
                f3 = Float.POSITIVE_INFINITY;
            }
            float f4 = f3;
            if ((i3 & 8) != 0) {
                i2 = TileMode.INSTANCE.n();
            }
            return companion.t(list, j3, f4, i2);
        }

        public static /* synthetic */ Brush mUb(Companion companion, Pair[] pairArr, float f3, float f4, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                f3 = 0.0f;
            }
            if ((i3 & 4) != 0) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if ((i3 & 8) != 0) {
                i2 = TileMode.INSTANCE.n();
            }
            return companion.KN(pairArr, f3, f4, i2);
        }

        public static /* synthetic */ Brush xMQ(Companion companion, List list, float f3, float f4, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                f3 = 0.0f;
            }
            if ((i3 & 4) != 0) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if ((i3 & 8) != 0) {
                i2 = TileMode.INSTANCE.n();
            }
            return companion.Uo(list, f3, f4, i2);
        }

        public final Brush n(List colors, long start, long end, int tileMode) {
            return new LinearGradient(colors, null, start, end, tileMode, null);
        }

        public final Brush t(List colors, long center, float radius, int tileMode) {
            return new RadialGradient(colors, null, center, radius, tileMode, null);
        }
    }

    public /* synthetic */ Brush(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void n(long size, Paint p2, float alpha);

    private Brush() {
        this.intrinsicSize = Size.INSTANCE.n();
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public long getIntrinsicSize() {
        return this.intrinsicSize;
    }
}
