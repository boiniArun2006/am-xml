package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001bø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0000ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(RC\u00102\u001a#\u0012\u0004\u0012\u00020\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180+\u0012\u0004\u0012\u00020\r\u0018\u00010*¢\u0006\u0002\b,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001d\u00106\u001a\u0004\u0018\u00010\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u00105R/\u0010?\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u0001078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R/\u0010B\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u0001078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\b9\u0010<\"\u0004\bA\u0010>R/\u0010D\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u0001078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010:\u001a\u0004\b@\u0010<\"\u0004\bC\u0010>R1\u0010J\u001a\u00020E2\u0006\u00108\u001a\u00020E8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bF\u0010:\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0017\u0010N\u001a\u00020K8\u0006¢\u0006\f\n\u0004\b\u001f\u0010L\u001a\u0004\b3\u0010M\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "", "<init>", "()V", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "singleLine", "softWrap", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "", "r", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZZLandroidx/compose/foundation/text/KeyboardOptions;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/text/TextLayoutResult;", "qie", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/geometry/Offset;", "position", "coerceInVisibleBounds", "", "KN", "(JZ)I", "offset", "gh", "(J)Z", "rl", "(J)J", "Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache;", "layoutCache", "Lkotlin/Function2;", "Lkotlin/Function0;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function2;", "getOnTextLayout", "()Lkotlin/jvm/functions/Function2;", "ck", "(Lkotlin/jvm/functions/Function2;)V", "onTextLayout", "t", "J2", "()Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/layout/LayoutCoordinates;", "<set-?>", "nr", "Landroidx/compose/runtime/MutableState;", "mUb", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Ik", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "textLayoutNodeCoordinates", "O", "az", "coreNodeCoordinates", "ty", "decoratorNodeCoordinates", "Landroidx/compose/ui/unit/Dp;", "Uo", "()F", "HI", "(F)V", "minHeightForSingleLineField", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "()Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "bringIntoViewRequester", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,250:1\n113#2:251\n85#3:252\n85#3:253\n113#3,2:254\n85#3:256\n113#3,2:257\n85#3:259\n113#3,2:260\n85#3:262\n113#3,2:263\n69#4:265\n65#4:268\n65#4:271\n70#5:266\n60#5:269\n60#5:272\n22#6:267\n22#6:270\n22#6:273\n*S KotlinDebug\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutState\n*L\n71#1:251\n45#1:252\n66#1:253\n66#1:254,2\n67#1:256\n67#1:257,2\n68#1:259\n68#1:260,2\n71#1:262\n71#1:263,2\n174#1:265\n175#1:268\n176#1:271\n174#1:266\n175#1:269\n176#1:272\n174#1:267\n175#1:270\n176#1:273\n*E\n"})
public final class TextLayoutState {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableState decoratorNodeCoordinates;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final BringIntoViewRequester bringIntoViewRequester;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableState coreNodeCoordinates;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MutableState minHeightForSingleLineField;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private TextFieldLayoutStateCache layoutCache;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableState textLayoutNodeCoordinates;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Function2 onTextLayout;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final TextFieldLayoutStateCache layoutResult;

    public static /* synthetic */ int xMQ(TextLayoutState textLayoutState, long j2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return textLayoutState.KN(j2, z2);
    }

    public final void HI(float f3) {
        this.minHeightForSingleLineField.setValue(Dp.nr(f3));
    }

    public final void Ik(LayoutCoordinates layoutCoordinates) {
        this.textLayoutNodeCoordinates.setValue(layoutCoordinates);
    }

    public final TextLayoutResult J2() {
        return (TextLayoutResult) this.layoutResult.getValue();
    }

    public final LayoutCoordinates O() {
        return (LayoutCoordinates) this.decoratorNodeCoordinates.getValue();
    }

    public final float Uo() {
        return ((Dp) this.minHeightForSingleLineField.getValue()).getValue();
    }

    public final void az(LayoutCoordinates layoutCoordinates) {
        this.coreNodeCoordinates.setValue(layoutCoordinates);
    }

    public final void ck(Function2 function2) {
        this.onTextLayout = function2;
    }

    public final LayoutCoordinates mUb() {
        return (LayoutCoordinates) this.textLayoutNodeCoordinates.getValue();
    }

    public final LayoutCoordinates nr() {
        return (LayoutCoordinates) this.coreNodeCoordinates.getValue();
    }

    public final TextLayoutResult qie(Density density, LayoutDirection layoutDirection, FontFamily.Resolver fontFamilyResolver, long constraints) {
        TextLayoutResult textLayoutResultX = this.layoutCache.X(density, layoutDirection, fontFamilyResolver, constraints);
        Function2 function2 = this.onTextLayout;
        if (function2 != null) {
            function2.invoke(density, new Function0<TextLayoutResult>() { // from class: androidx.compose.foundation.text.input.internal.TextLayoutState$layoutWithNewMeasureInputs$1$textLayoutProvider$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final TextLayoutResult invoke() {
                    return this.f20359n.layoutCache.getValue();
                }
            });
        }
        return textLayoutResultX;
    }

    public final void r(TransformedTextFieldState textFieldState, TextStyle textStyle, boolean singleLine, boolean softWrap, KeyboardOptions keyboardOptions) {
        this.layoutCache.s7N(textFieldState, textStyle, singleLine, softWrap, keyboardOptions);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final BringIntoViewRequester getBringIntoViewRequester() {
        return this.bringIntoViewRequester;
    }

    public final void ty(LayoutCoordinates layoutCoordinates) {
        this.decoratorNodeCoordinates.setValue(layoutCoordinates);
    }

    public TextLayoutState() {
        TextFieldLayoutStateCache textFieldLayoutStateCache = new TextFieldLayoutStateCache();
        this.layoutCache = textFieldLayoutStateCache;
        this.layoutResult = textFieldLayoutStateCache;
        this.textLayoutNodeCoordinates = SnapshotStateKt.xMQ(null, SnapshotStateKt.gh());
        this.coreNodeCoordinates = SnapshotStateKt.xMQ(null, SnapshotStateKt.gh());
        this.decoratorNodeCoordinates = SnapshotStateKt.xMQ(null, SnapshotStateKt.gh());
        this.minHeightForSingleLineField = SnapshotStateKt__SnapshotStateKt.O(Dp.nr(Dp.KN(0)), null, 2, null);
        this.bringIntoViewRequester = BringIntoViewRequesterKt.n();
    }

    public final int KN(long position, boolean coerceInVisibleBounds) {
        TextLayoutResult textLayoutResultJ2 = J2();
        if (textLayoutResultJ2 == null) {
            return -1;
        }
        if (coerceInVisibleBounds) {
            position = rl(position);
        }
        return textLayoutResultJ2.aYN(TextLayoutStateKt.rl(this, position));
    }

    public final boolean gh(long offset) {
        TextLayoutResult textLayoutResultJ2 = J2();
        if (textLayoutResultJ2 == null) {
            return false;
        }
        long jRl = TextLayoutStateKt.rl(this, rl(offset));
        int iR = textLayoutResultJ2.r(Float.intBitsToFloat((int) (4294967295L & jRl)));
        int i2 = (int) (jRl >> 32);
        if (Float.intBitsToFloat(i2) < textLayoutResultJ2.o(iR) || Float.intBitsToFloat(i2) > textLayoutResultJ2.Z(iR)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long rl(long offset) {
        Rect rectN;
        LayoutCoordinates layoutCoordinatesMUb = mUb();
        if (layoutCoordinatesMUb != null) {
            if (layoutCoordinatesMUb.nr()) {
                LayoutCoordinates layoutCoordinatesO = O();
                rectN = null;
                if (layoutCoordinatesO != null) {
                    rectN = LayoutCoordinates.N(layoutCoordinatesO, layoutCoordinatesMUb, false, 2, null);
                }
            } else {
                rectN = Rect.INSTANCE.n();
            }
            if (rectN == null) {
            }
        } else {
            rectN = Rect.INSTANCE.n();
        }
        return TextLayoutStateKt.n(offset, rectN);
    }
}
