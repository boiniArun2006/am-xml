package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u001c\u001a\u00020\u001b*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "scrollerPosition", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "", "enabled", "nr", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/foundation/interaction/MutableInteractionSource;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "textLayoutResultProvider", "rl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Density;", "", "cursorOffset", "Landroidx/compose/ui/text/input/TransformedText;", "transformedText", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "rtl", "textFieldWidth", "Landroidx/compose/ui/geometry/Rect;", "t", "(Landroidx/compose/ui/unit/Density;ILandroidx/compose/ui/text/input/TransformedText;Landroidx/compose/ui/text/TextLayoutResult;ZI)Landroidx/compose/ui/geometry/Rect;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,396:1\n110#2:397\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n64#1:397\n*E\n"})
public final class TextFieldScrollKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.f16969n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.f16970t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect t(Density density, int i2, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z2, int i3) {
        Rect rectN;
        if (textLayoutResult == null || (rectN = textLayoutResult.O(transformedText.getOffsetMapping().rl(i2))) == null) {
            rectN = Rect.INSTANCE.n();
        }
        Rect rect = rectN;
        int iHow = density.How(TextFieldCursor_androidKt.n());
        return Rect.KN(rect, z2 ? (i3 - rect.getLeft()) - iHow : rect.getLeft(), 0.0f, z2 ? i3 - rect.getLeft() : iHow + rect.getLeft(), 0.0f, 10, null);
    }

    public static final Modifier nr(Modifier modifier, final TextFieldScrollerPosition textFieldScrollerPosition, final MutableInteractionSource mutableInteractionSource, final boolean z2) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    n(inspectorInfo);
                    return Unit.INSTANCE;
                }

                public final void n(InspectorInfo inspectorInfo) {
                    inspectorInfo.rl("textFieldScrollable");
                    inspectorInfo.getProperties().n("scrollerPosition", textFieldScrollerPosition);
                    inspectorInfo.getProperties().n("interactionSource", mutableInteractionSource);
                    inspectorInfo.getProperties().n("enabled", Boolean.valueOf(z2));
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return ComposedModifierKt.rl(modifier, function1N, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                boolean z3;
                boolean z4;
                boolean z5;
                composer.eF(805428266);
                if (ComposerKt.v()) {
                    ComposerKt.p5(805428266, i2, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:71)");
                }
                if (composer.ty(CompositionLocalsKt.az()) == LayoutDirection.f34161t) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (textFieldScrollerPosition.J2() != Orientation.f16969n && z3) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                boolean zP5 = composer.p5(textFieldScrollerPosition);
                final TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1<Float, Float>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f3) {
                            return n(f3.floatValue());
                        }

                        public final Float n(float f3) {
                            float fNr = textFieldScrollerPosition2.nr() + f3;
                            if (fNr > textFieldScrollerPosition2.t()) {
                                f3 = textFieldScrollerPosition2.t() - textFieldScrollerPosition2.nr();
                            } else if (fNr < 0.0f) {
                                f3 = -textFieldScrollerPosition2.nr();
                            }
                            TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2;
                            textFieldScrollerPosition3.KN(textFieldScrollerPosition3.nr() + f3);
                            return Float.valueOf(f3);
                        }
                    };
                    composer.o(objIF);
                }
                final ScrollableState scrollableStateRl = ScrollableStateKt.rl((Function1) objIF, composer, 0);
                boolean zP52 = composer.p5(scrollableStateRl) | composer.p5(textFieldScrollerPosition);
                final TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition;
                Object objIF2 = composer.iF();
                if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new ScrollableState(textFieldScrollerPosition3) { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1

                        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
                        private final State canScrollForward;

                        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
                        private final State canScrollBackward;

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public Object O(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
                            return this.f19890n.O(mutatePriority, function2, continuation);
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public float rl(float delta) {
                            return this.f19890n.rl(delta);
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean t() {
                            return this.f19890n.t();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean J2() {
                            return ((Boolean) this.canScrollForward.getValue()).booleanValue();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean nr() {
                            return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
                        }

                        {
                            this.canScrollForward = SnapshotStateKt.O(new Function0<Boolean>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollForward$2
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke() {
                                    return Boolean.valueOf(textFieldScrollerPosition3.nr() < textFieldScrollerPosition3.t());
                                }
                            });
                            this.canScrollBackward = SnapshotStateKt.O(new Function0<Boolean>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke() {
                                    return Boolean.valueOf(textFieldScrollerPosition3.nr() > 0.0f);
                                }
                            });
                        }
                    };
                    composer.o(objIF2);
                }
                TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 = (TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) objIF2;
                Modifier.Companion companion = Modifier.INSTANCE;
                Orientation orientationJ2 = textFieldScrollerPosition.J2();
                if (z2 && textFieldScrollerPosition.t() != 0.0f) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Modifier modifierGh = ScrollableKt.gh(companion, textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1, orientationJ2, z5, z4, null, mutableInteractionSource, 16, null);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return modifierGh;
            }
        });
    }

    public static final Modifier rl(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Function0 function0) {
        Modifier verticalScrollLayoutModifier;
        Orientation orientationJ2 = textFieldScrollerPosition.J2();
        int iO = textFieldScrollerPosition.O(textFieldValue.getSelection());
        textFieldScrollerPosition.xMQ(textFieldValue.getSelection());
        TransformedText transformedTextT = ValidatingOffsetMappingKt.t(visualTransformation, textFieldValue.getText());
        int i2 = WhenMappings.$EnumSwitchMapping$0[orientationJ2.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(textFieldScrollerPosition, iO, transformedTextT, function0);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(textFieldScrollerPosition, iO, transformedTextT, function0);
        }
        return ClipKt.rl(modifier).Zmq(verticalScrollLayoutModifier);
    }
}
