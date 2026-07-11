package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Stable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b#\b\u0001\u0018\u0000 \"2\u00020\u0001:\u00017B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R+\u0010 \u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010#\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR+\u0010)\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010*R(\u00101\u001a\u00020\u00158\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0017\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R+\u0010\b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b2\u00104\"\u0004\b5\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "", "Landroidx/compose/foundation/gestures/Orientation;", "initialOrientation", "", "initial", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;F)V", "orientation", "Landroidx/compose/ui/geometry/Rect;", "cursorRect", "", "containerSize", "textFieldSize", "", "gh", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/geometry/Rect;II)V", "cursorStart", "cursorEnd", "rl", "(FFI)V", "Landroidx/compose/ui/text/TextRange;", "selection", "O", "(J)I", "<set-?>", c.f62177j, "Landroidx/compose/runtime/MutableFloatState;", "nr", "()F", "KN", "(F)V", "offset", "t", "Uo", "maximum", "Landroidx/compose/runtime/MutableIntState;", "getViewportSize", "()I", "mUb", "(I)V", "viewportSize", "Landroidx/compose/ui/geometry/Rect;", "previousCursorRect", "J", "getPreviousSelection-d9O1mEE", "()J", "xMQ", "(J)V", "previousSelection", "J2", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/foundation/gestures/Orientation;", "setOrientation", "(Landroidx/compose/foundation/gestures/Orientation;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,396:1\n79#2:397\n112#2,2:398\n79#2:400\n112#2,2:401\n78#3:403\n107#3,2:404\n85#4:406\n113#4,2:407\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n*L\n277#1:397\n277#1:398,2\n283#1:400\n283#1:401,2\n287#1:403\n287#1:404,2\n302#1:406\n302#1:407,2\n*E\n"})
public final class TextFieldScrollerPosition {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableState orientation;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private long previousSelection;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableFloatState offset;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Rect previousCursorRect;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableFloatState maximum;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableIntState viewportSize;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver KN = ListSaverKt.n(new Function2<SaverScope, TextFieldScrollerPosition, List<? extends Object>>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final List invoke(SaverScope saverScope, TextFieldScrollerPosition textFieldScrollerPosition) {
            boolean z2;
            Float fValueOf = Float.valueOf(textFieldScrollerPosition.nr());
            if (textFieldScrollerPosition.J2() == Orientation.f16969n) {
                z2 = true;
            } else {
                z2 = false;
            }
            return CollectionsKt.listOf(fValueOf, Boolean.valueOf(z2));
        }
    }, new Function1<List<? extends Object>, TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final TextFieldScrollerPosition invoke(List list) {
            Object obj = list.get(1);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            Orientation orientation = ((Boolean) obj).booleanValue() ? Orientation.f16969n : Orientation.f16970t;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new TextFieldScrollerPosition(orientation, ((Float) obj2).floatValue());
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", c.f62177j, "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver n() {
            return TextFieldScrollerPosition.KN;
        }
    }

    public TextFieldScrollerPosition(Orientation orientation, float f3) {
        this.offset = PrimitiveSnapshotStateKt.n(f3);
        this.maximum = PrimitiveSnapshotStateKt.n(0.0f);
        this.viewportSize = SnapshotIntStateKt.n(0);
        this.previousCursorRect = Rect.INSTANCE.n();
        this.previousSelection = TextRange.INSTANCE.n();
        this.orientation = SnapshotStateKt.xMQ(orientation, SnapshotStateKt.r());
    }

    public final void gh(Orientation orientation, Rect cursorRect, int containerSize, int textFieldSize) {
        float f3 = textFieldSize - containerSize;
        Uo(f3);
        if (cursorRect.getLeft() != this.previousCursorRect.getLeft() || cursorRect.getTop() != this.previousCursorRect.getTop()) {
            boolean z2 = orientation == Orientation.f16969n;
            rl(z2 ? cursorRect.getTop() : cursorRect.getLeft(), z2 ? cursorRect.xMQ() : cursorRect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String(), containerSize);
            this.previousCursorRect = cursorRect;
        }
        KN(RangesKt.coerceIn(nr(), 0.0f, f3));
        mUb(containerSize);
    }

    private final void Uo(float f3) {
        this.maximum.Z(f3);
    }

    private final void mUb(int i2) {
        this.viewportSize.KN(i2);
    }

    public final Orientation J2() {
        return (Orientation) this.orientation.getValue();
    }

    public final void KN(float f3) {
        this.offset.Z(f3);
    }

    public final float nr() {
        return this.offset.n();
    }

    public final float t() {
        return this.maximum.n();
    }

    public final void xMQ(long j2) {
        this.previousSelection = j2;
    }

    public final int O(long selection) {
        if (TextRange.ty(selection) != TextRange.ty(this.previousSelection)) {
            return TextRange.ty(selection);
        }
        if (TextRange.xMQ(selection) != TextRange.xMQ(this.previousSelection)) {
            return TextRange.xMQ(selection);
        }
        return TextRange.qie(selection);
    }

    public final void rl(float cursorStart, float cursorEnd, int containerSize) {
        float f3;
        float fNr = nr();
        float f4 = containerSize;
        float f5 = fNr + f4;
        if (cursorEnd > f5 || (cursorStart < fNr && cursorEnd - cursorStart > f4)) {
            f3 = cursorEnd - f5;
        } else if (cursorStart < fNr && cursorEnd - cursorStart <= f4) {
            f3 = cursorStart - fNr;
        } else {
            f3 = 0.0f;
        }
        KN(nr() + f3);
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, (i2 & 2) != 0 ? 0.0f : f3);
    }
}
