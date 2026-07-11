package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0016H&¢\u0006\u0004\b\u001a\u0010\u001bR0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\bR\u0018\u0010#\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/compose/foundation/RectListNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "rect", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Rect;", "newRect", "", "poH", "(Landroid/graphics/Rect;)V", "layoutCoordinates", "UR", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/Rect;", "coordinates", "P5", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Sax", "()V", "Landroidx/compose/runtime/collection/MutableVector;", "W5k", "()Landroidx/compose/runtime/collection/MutableVector;", "rects", CmcdConfiguration.KEY_PLAYBACK_RATE, "(Landroidx/compose/runtime/collection/MutableVector;)V", "v", "Lkotlin/jvm/functions/Function1;", "NC9", "()Lkotlin/jvm/functions/Function1;", "W1c", "Xw", "Landroid/graphics/Rect;", "androidRect", "Landroid/view/View;", "ex", "()Landroid/view/View;", "view", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRectListNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,98:1\n1#2:99\n641#3,2:100\n65#4:102\n69#4:105\n65#4:108\n69#4:111\n60#5:103\n70#5:106\n60#5:109\n70#5:112\n22#6:104\n22#6:107\n22#6:110\n22#6:113\n*S KotlinDebug\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n*L\n68#1:100,2\n85#1:102\n86#1:105\n87#1:108\n88#1:111\n85#1:103\n86#1:106\n87#1:109\n88#1:112\n85#1:104\n86#1:107\n87#1:110\n88#1:113\n*E\n"})
public abstract class RectListNode extends Modifier.Node implements GlobalPositionAwareModifierNode {

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private Rect androidRect;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Function1 rect;

    public abstract MutableVector W5k();

    public abstract void pr(MutableVector rects);

    private final Rect UR(LayoutCoordinates layoutCoordinates, androidx.compose.ui.geometry.Rect rect) {
        LayoutCoordinates layoutCoordinatesNr = LayoutCoordinatesKt.nr(layoutCoordinates);
        long jNHg = layoutCoordinatesNr.nHg(layoutCoordinates, rect.Z());
        long jNHg2 = layoutCoordinatesNr.nHg(layoutCoordinates, rect.XQ());
        long jNHg3 = layoutCoordinatesNr.nHg(layoutCoordinates, rect.gh());
        long jNHg4 = layoutCoordinatesNr.nHg(layoutCoordinates, rect.qie());
        int i2 = (int) (jNHg >> 32);
        int i3 = (int) (jNHg2 >> 32);
        int i5 = (int) (jNHg3 >> 32);
        int i7 = (int) (jNHg4 >> 32);
        int i8 = (int) (jNHg & 4294967295L);
        int i9 = (int) (jNHg2 & 4294967295L);
        int i10 = (int) (jNHg3 & 4294967295L);
        int i11 = (int) (jNHg4 & 4294967295L);
        return new Rect(MathKt.roundToInt(ComparisonsKt.minOf(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i5), Float.intBitsToFloat(i7))), MathKt.roundToInt(ComparisonsKt.minOf(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9), Float.intBitsToFloat(i10), Float.intBitsToFloat(i11))), MathKt.roundToInt(ComparisonsKt.maxOf(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i5), Float.intBitsToFloat(i7))), MathKt.roundToInt(ComparisonsKt.maxOf(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9), Float.intBitsToFloat(i10), Float.intBitsToFloat(i11))));
    }

    /* JADX INFO: renamed from: NC9, reason: from getter */
    public Function1 getRect() {
        return this.rect;
    }

    public void W1c(Function1 function1) {
        this.rect = function1;
    }

    public RectListNode(Function1 function1) {
        this.rect = function1;
    }

    private final void poH(Rect newRect) {
        MutableVector mutableVectorW5k = W5k();
        Rect rect = this.androidRect;
        if (rect != null) {
            mutableVectorW5k.ck(rect);
        }
        if (newRect != null && !newRect.isEmpty()) {
            mutableVectorW5k.rl(newRect);
        }
        pr(mutableVectorW5k);
        this.androidRect = newRect;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void P5(LayoutCoordinates coordinates) {
        Rect rectUR;
        if (getRect() == null) {
            androidx.compose.ui.geometry.Rect rectRl = LayoutCoordinatesKt.rl(coordinates);
            rectUR = new Rect(MathKt.roundToInt(rectRl.getLeft()), MathKt.roundToInt(rectRl.getTop()), MathKt.roundToInt(rectRl.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String()), MathKt.roundToInt(rectRl.xMQ()));
        } else {
            Function1 rect = getRect();
            Intrinsics.checkNotNull(rect);
            rectUR = UR(coordinates, (androidx.compose.ui.geometry.Rect) rect.invoke(coordinates));
        }
        poH(rectUR);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        super.Sax();
        poH(null);
    }

    protected final View ex() {
        return DelegatableNode_androidKt.n(this);
    }
}
