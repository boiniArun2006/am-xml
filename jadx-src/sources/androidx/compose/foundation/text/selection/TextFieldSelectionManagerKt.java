package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"", "isStartHandle", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "", c.f62177j, "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "t", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Z)Z", "Landroidx/compose/ui/unit/IntSize;", "magnifierSize", "Landroidx/compose/ui/geometry/Offset;", "rl", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;J)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,1123:1\n1247#2,6:1124\n1247#2,6:1130\n1247#2,6:1136\n65#3:1142\n60#4:1143\n85#4:1146\n53#4,3:1148\n22#5:1144\n54#6:1145\n30#7:1147\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n*L\n1031#1:1124,6\n1034#1:1130,6\n1040#1:1136,6\n1091#1:1142\n1091#1:1143\n1111#1:1146\n1121#1:1148,3\n1091#1:1144\n1111#1:1145\n1121#1:1147\n*E\n"})
public final class TextFieldSelectionManagerKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.f19677n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.f19679t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.f19676O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void n(final boolean z2, final ResolvedTextDirection resolvedTextDirection, final TextFieldSelectionManager textFieldSelectionManager, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-1344558920);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(resolvedTextDirection) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(textFieldSelectionManager) ? 256 : 128;
        }
        if (composerKN.HI((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1344558920, i3, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1029)");
            }
            int i5 = i3 & 14;
            boolean zP5 = (i5 == 4) | composerKN.p5(textFieldSelectionManager);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = textFieldSelectionManager.E(z2);
                composerKN.o(objIF);
            }
            final TextDragObserver textDragObserver = (TextDragObserver) objIF;
            boolean zE2 = composerKN.E2(textFieldSelectionManager) | (i5 == 4);
            Object objIF2 = composerKN.iF();
            if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1$1
                    @Override // androidx.compose.foundation.text.selection.OffsetProvider
                    public final long n() {
                        return textFieldSelectionManager.s7N(z2);
                    }
                };
                composerKN.o(objIF2);
            }
            OffsetProvider offsetProvider = (OffsetProvider) objIF2;
            boolean zAz = TextRange.az(textFieldSelectionManager.p5().getSelection());
            float fNHg = textFieldSelectionManager.nHg(z2);
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean zE22 = composerKN.E2(textDragObserver);
            Object objIF3 = composerKN.iF();
            if (zE22 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                        Object objT = LongPressTextDragObserverKt.t(pointerInputScope, textDragObserver, continuation);
                        return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : Unit.INSTANCE;
                    }
                };
                composerKN.o(objIF3);
            }
            AndroidSelectionHandles_androidKt.rl(offsetProvider, z2, resolvedTextDirection, zAz, 0L, fNHg, SuspendingPointerInputFilterKt.nr(companion, textDragObserver, (PointerInputEventHandler) objIF3), composerKN, (i3 << 3) & 1008, 16);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i7) {
                    TextFieldSelectionManagerKt.n(z2, resolvedTextDirection, textFieldSelectionManager, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final long rl(TextFieldSelectionManager textFieldSelectionManager, long j2) {
        int i2;
        int iTy;
        TextLayoutResultProxy textLayoutResultProxyQie;
        TextDelegate textDelegate;
        AnnotatedString text;
        Offset offsetFD = textFieldSelectionManager.fD();
        if (offsetFD != null) {
            long packedValue = offsetFD.getPackedValue();
            AnnotatedString annotatedStringP5 = textFieldSelectionManager.P5();
            if (annotatedStringP5 != null && annotatedStringP5.length() != 0) {
                Handle handleE = textFieldSelectionManager.e();
                if (handleE == null) {
                    i2 = -1;
                } else {
                    i2 = WhenMappings.$EnumSwitchMapping$0[handleE.ordinal()];
                }
                if (i2 != -1) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 == 3) {
                            iTy = TextRange.xMQ(textFieldSelectionManager.p5().getSelection());
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        iTy = TextRange.ty(textFieldSelectionManager.p5().getSelection());
                    }
                    LegacyTextFieldState state = textFieldSelectionManager.getState();
                    if (state != null && (textLayoutResultProxyQie = state.qie()) != null) {
                        LegacyTextFieldState state2 = textFieldSelectionManager.getState();
                        if (state2 != null && (textDelegate = state2.getTextDelegate()) != null && (text = textDelegate.getText()) != null) {
                            int iCoerceIn = RangesKt.coerceIn(textFieldSelectionManager.getOffsetMapping().rl(iTy), 0, text.length());
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (textLayoutResultProxyQie.mUb(packedValue) >> 32));
                            TextLayoutResult value = textLayoutResultProxyQie.getValue();
                            int iIk = value.Ik(iCoerceIn);
                            float fO = value.o(iIk);
                            float fZ = value.Z(iIk);
                            float fCoerceIn = RangesKt.coerceIn(fIntBitsToFloat, Math.min(fO, fZ), Math.max(fO, fZ));
                            if (!IntSize.O(j2, IntSize.INSTANCE.n()) && Math.abs(fIntBitsToFloat - fCoerceIn) > ((int) (j2 >> 32)) / 2) {
                                return Offset.INSTANCE.rl();
                            }
                            float fS = value.S(iIk);
                            return Offset.O((((long) Float.floatToRawIntBits(fCoerceIn)) << 32) | (((long) Float.floatToRawIntBits(((value.az(iIk) - fS) / 2) + fS)) & 4294967295L));
                        }
                        return Offset.INSTANCE.rl();
                    }
                    return Offset.INSTANCE.rl();
                }
                return Offset.INSTANCE.rl();
            }
            return Offset.INSTANCE.rl();
        }
        return Offset.INSTANCE.rl();
    }

    public static final boolean t(TextFieldSelectionManager textFieldSelectionManager, boolean z2) {
        LayoutCoordinates layoutCoordinatesGh;
        Rect rectXMQ;
        LegacyTextFieldState state = textFieldSelectionManager.getState();
        if (state != null && (layoutCoordinatesGh = state.gh()) != null && (rectXMQ = SelectionManagerKt.xMQ(layoutCoordinatesGh)) != null) {
            return SelectionManagerKt.nr(rectXMQ, textFieldSelectionManager.s7N(z2));
        }
        return false;
    }
}
