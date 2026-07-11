package androidx.compose.foundation.text;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import androidx.media3.exoplayer.RendererCapabilities;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\r\u0010\fJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u0004\u0018\u00010\u0018*\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J@\u0010'\u001a\u00020\u001e2\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010!\"\u0004\u0018\u00010\u00012\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#¢\u0006\u0002\b%H\u0003¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001eH\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0002H\u0000¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010,R/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u00100\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00108\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010.\u001a\u0004\b6\u0010,\"\u0004\b7\u0010\u0005R+\u0010<\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#¢\u0006\u0002\b%098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=8F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Landroidx/compose/foundation/text/TextLinkScope;", "", "Landroidx/compose/ui/text/AnnotatedString;", "initialText", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/foundation/text/LinkRange;", "link", "Z", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/Modifier;", "gh", "Landroidx/compose/ui/graphics/Shape;", "o", "(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/graphics/Path;", "Ik", "(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "mUb", "(Landroidx/compose/ui/text/AnnotatedString$Range;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", InneractiveMediationNameConsts.OTHER, "ck", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/platform/UriHandler;", "uriHandler", "", "HI", "(Landroidx/compose/ui/text/LinkAnnotation;Landroidx/compose/ui/platform/UriHandler;)V", "", IV8ValueMap.FUNCTION_KEYS, "Lkotlin/Function1;", "Landroidx/compose/foundation/text/TextAnnotatorScope;", "Lkotlin/ExtensionFunctionType;", "block", "t", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "rl", "(Landroidx/compose/runtime/Composer;I)V", "xMQ", "()Landroidx/compose/ui/text/AnnotatedString;", c.f62177j, "Landroidx/compose/ui/text/AnnotatedString;", "getInitialText$foundation_release", "<set-?>", "Landroidx/compose/runtime/MutableState;", "ty", "()Landroidx/compose/ui/text/TextLayoutResult;", "r", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "az", "setText$foundation_release", "text", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "nr", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "annotators", "Lkotlin/Function0;", "", "qie", "()Lkotlin/jvm/functions/Function0;", "shouldMeasureLinks", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextLinkScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLinkScope.kt\nandroidx/compose/foundation/text/TextLinkScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,382:1\n85#2:383\n113#2,2:384\n30#3:386\n53#4,3:387\n150#5:390\n75#6:391\n34#7,4:392\n39#7:426\n34#7,6:427\n1247#8,6:396\n1247#8,6:402\n1247#8,6:408\n1247#8,6:414\n1247#8,6:420\n1247#8,6:433\n*S KotlinDebug\n*F\n+ 1 TextLinkScope.kt\nandroidx/compose/foundation/text/TextLinkScope\n*L\n66#1:383\n66#1:384,2\n180#1:386\n180#1:387,3\n180#1:390\n216#1:391\n219#1:392,4\n219#1:426\n307#1:427,6\n221#1:396,6\n235#1:402,6\n244#1:408,6\n247#1:414,6\n257#1:420,6\n317#1:433,6\n*E\n"})
public final class TextLinkScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AnnotatedString initialText;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private AnnotatedString text;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableState textLayoutResult = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final SnapshotStateList annotators = SnapshotStateKt.J2();

    /* JADX INFO: Access modifiers changed from: private */
    public final void HI(LinkAnnotation link, UriHandler uriHandler) {
        LinkInteractionListener linkInteractionListener;
        Unit unit;
        if (!(link instanceof LinkAnnotation.Url)) {
            if (!(link instanceof LinkAnnotation.Clickable) || (linkInteractionListener = link.getLinkInteractionListener()) == null) {
                return;
            }
            linkInteractionListener.n(link);
            return;
        }
        LinkInteractionListener linkInteractionListener2 = link.getLinkInteractionListener();
        if (linkInteractionListener2 != null) {
            linkInteractionListener2.n(link);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            try {
                uriHandler.n(((LinkAnnotation.Url) link).getUrl());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private final Modifier Z(Modifier modifier, final AnnotatedString.Range range) {
        return modifier.Zmq(new TextRangeLayoutModifier(new TextRangeScopeMeasurePolicy() { // from class: androidx.compose.foundation.text.w6
            @Override // androidx.compose.foundation.text.TextRangeScopeMeasurePolicy
            public final TextRangeLayoutMeasureResult n(TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
                return TextLinkScope.XQ(this.f21018n, range, textRangeLayoutMeasureScope);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpanStyle ck(SpanStyle spanStyle, SpanStyle spanStyle2) {
        SpanStyle spanStyleViF;
        return (spanStyle == null || (spanStyleViF = spanStyle.ViF(spanStyle2)) == null) ? spanStyle2 : spanStyleViF;
    }

    private final Modifier gh(Modifier modifier, final AnnotatedString.Range range) {
        return GraphicsLayerModifierKt.n(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.foundation.text.TextLinkScope$clipLink$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                n(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            public final void n(GraphicsLayerScope graphicsLayerScope) {
                Shape shapeO = this.f19927n.o(range);
                if (shapeO != null) {
                    graphicsLayerScope.pS(shapeO);
                    graphicsLayerScope.X(true);
                }
            }
        });
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final AnnotatedString getText() {
        return this.text;
    }

    public final Function0 qie() {
        return new Function0<Boolean>() { // from class: androidx.compose.foundation.text.TextLinkScope$shouldMeasureLinks$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                TextLayoutInput layoutInput;
                AnnotatedString text = this.f19930n.getText();
                TextLayoutResult textLayoutResultTy = this.f19930n.ty();
                return Boolean.valueOf(Intrinsics.areEqual(text, (textLayoutResultTy == null || (layoutInput = textLayoutResultTy.getLayoutInput()) == null) ? null : layoutInput.getText()));
            }
        };
    }

    public final void r(TextLayoutResult textLayoutResult) {
        this.textLayoutResult.setValue(textLayoutResult);
    }

    public final void rl(Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(1154651354);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 1;
        if (composerKN.HI((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(1154651354, i3, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:214)");
            }
            final UriHandler uriHandler = (UriHandler) composerKN.ty(CompositionLocalsKt.Z());
            AnnotatedString annotatedString = this.text;
            List listO = annotatedString.O(0, annotatedString.length());
            int size = listO.size();
            int i7 = 0;
            while (i7 < size) {
                final AnnotatedString.Range range = (AnnotatedString.Range) listO.get(i7);
                if (range.getStart() != range.getEnd()) {
                    composerKN.eF(1386075176);
                    Object objIF = composerKN.iF();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        objIF = InteractionSourceKt.n();
                        composerKN.o(objIF);
                    }
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objIF;
                    Modifier modifierRl = PointerIconKt.rl(HoverableKt.rl(Z(SemanticsModifierKt.nr(gh(Modifier.INSTANCE, range), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            n(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            semanticsPropertyReceiver.t(SemanticsProperties.f33276n.WPU(), Unit.INSTANCE);
                        }
                    }, i5, null), range), mutableInteractionSource, false, 2, null), PointerIcon.INSTANCE.rl(), false, 2, null);
                    boolean zE2 = composerKN.E2(this) | composerKN.p5(range) | composerKN.E2(uriHandler);
                    Object objIF2 = composerKN.iF();
                    if (zE2 || objIF2 == companion.n()) {
                        objIF2 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                this.f19912n.HI((LinkAnnotation) range.getItem(), uriHandler);
                            }
                        };
                        composerKN.o(objIF2);
                    }
                    BoxKt.n(ClickableKt.KN(modifierRl, mutableInteractionSource, null, false, null, null, null, null, null, false, (Function0) objIF2, 508, null), composerKN, 0);
                    if (TextLinkScopeKt.rl(((LinkAnnotation) range.getItem()).getStyles())) {
                        composerKN.eF(1388926990);
                        composerKN.Xw();
                    } else {
                        composerKN.eF(1386898319);
                        Object objIF3 = composerKN.iF();
                        if (objIF3 == companion.n()) {
                            objIF3 = new LinkStateInteractionSourceObserver(mutableInteractionSource);
                            composerKN.o(objIF3);
                        }
                        final LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = (LinkStateInteractionSourceObserver) objIF3;
                        Unit unit = Unit.INSTANCE;
                        Object objIF4 = composerKN.iF();
                        if (objIF4 == companion.n()) {
                            objIF4 = new TextLinkScope$LinksComposables$1$3$1(linkStateInteractionSourceObserver, null);
                            composerKN.o(objIF4);
                        }
                        EffectsKt.O(unit, (Function2) objIF4, composerKN, 6);
                        Boolean boolValueOf = Boolean.valueOf(linkStateInteractionSourceObserver.Uo());
                        Boolean boolValueOf2 = Boolean.valueOf(linkStateInteractionSourceObserver.J2());
                        Boolean boolValueOf3 = Boolean.valueOf(linkStateInteractionSourceObserver.KN());
                        TextLinkStyles styles = ((LinkAnnotation) range.getItem()).getStyles();
                        SpanStyle style = styles != null ? styles.getStyle() : null;
                        TextLinkStyles styles2 = ((LinkAnnotation) range.getItem()).getStyles();
                        SpanStyle focusedStyle = styles2 != null ? styles2.getFocusedStyle() : null;
                        TextLinkStyles styles3 = ((LinkAnnotation) range.getItem()).getStyles();
                        SpanStyle hoveredStyle = styles3 != null ? styles3.getHoveredStyle() : null;
                        TextLinkStyles styles4 = ((LinkAnnotation) range.getItem()).getStyles();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, style, focusedStyle, hoveredStyle, styles4 != null ? styles4.getPressedStyle() : null};
                        boolean zE22 = composerKN.E2(this) | composerKN.p5(range);
                        Object objIF5 = composerKN.iF();
                        if (zE22 || objIF5 == companion.n()) {
                            objIF5 = new Function1<TextAnnotatorScope, Unit>() { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextAnnotatorScope textAnnotatorScope) {
                                    n(textAnnotatorScope);
                                    return Unit.INSTANCE;
                                }

                                public final void n(TextAnnotatorScope textAnnotatorScope) {
                                    TextLinkStyles styles5;
                                    TextLinkStyles styles6;
                                    TextLinkStyles styles7;
                                    TextLinkScope textLinkScope = this.f19917n;
                                    TextLinkStyles styles8 = ((LinkAnnotation) range.getItem()).getStyles();
                                    SpanStyle pressedStyle = null;
                                    SpanStyle spanStyleCk = textLinkScope.ck(textLinkScope.ck(styles8 != null ? styles8.getStyle() : null, (!linkStateInteractionSourceObserver.J2() || (styles7 = ((LinkAnnotation) range.getItem()).getStyles()) == null) ? null : styles7.getFocusedStyle()), (!linkStateInteractionSourceObserver.Uo() || (styles6 = ((LinkAnnotation) range.getItem()).getStyles()) == null) ? null : styles6.getHoveredStyle());
                                    if (linkStateInteractionSourceObserver.KN() && (styles5 = ((LinkAnnotation) range.getItem()).getStyles()) != null) {
                                        pressedStyle = styles5.getPressedStyle();
                                    }
                                    textAnnotatorScope.rl(range, textLinkScope.ck(spanStyleCk, pressedStyle));
                                }
                            };
                            composerKN.o(objIF5);
                        }
                        t(objArr, (Function1) objIF5, composerKN, (i3 << 6) & 896);
                        composerKN.Xw();
                    }
                    composerKN.Xw();
                } else {
                    composerKN.eF(1388940878);
                    composerKN.Xw();
                }
                i7++;
                i5 = 1;
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i8) {
                    this.f19919n.rl(composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public final TextLayoutResult ty() {
        return (TextLayoutResult) this.textLayoutResult.getValue();
    }

    public final AnnotatedString xMQ() {
        AnnotatedString styledText;
        if (this.annotators.isEmpty()) {
            styledText = this.text;
        } else {
            TextAnnotatorScope textAnnotatorScope = new TextAnnotatorScope(this.text);
            SnapshotStateList snapshotStateList = this.annotators;
            int size = snapshotStateList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Function1) snapshotStateList.get(i2)).invoke(textAnnotatorScope);
            }
            styledText = textAnnotatorScope.getStyledText();
        }
        this.text = styledText;
        return styledText;
    }

    public TextLinkScope(AnnotatedString annotatedString) {
        this.initialText = annotatedString;
        this.text = annotatedString.n(new Function1<AnnotatedString.Range<? extends AnnotatedString.Annotation>, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>>>() { // from class: androidx.compose.foundation.text.TextLinkScope.1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final List invoke(AnnotatedString.Range range) {
                SpanStyle spanStyle;
                if (range.getItem() instanceof LinkAnnotation) {
                    Object item = range.getItem();
                    Intrinsics.checkNotNull(item, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                    if (!TextLinkScopeKt.rl(((LinkAnnotation) item).getStyles())) {
                        Object item2 = range.getItem();
                        Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                        TextLinkStyles styles = ((LinkAnnotation) item2).getStyles();
                        if (styles == null || (spanStyle = styles.getStyle()) == null) {
                            spanStyle = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65535, null);
                        }
                        return CollectionsKt.arrayListOf(range, new AnnotatedString.Range(spanStyle, range.getStart(), range.getEnd()));
                    }
                }
                return CollectionsKt.arrayListOf(range);
            }
        });
    }

    private final Path Ik(AnnotatedString.Range link) {
        float fMin;
        Path pathNY = null;
        if (!((Boolean) qie().invoke()).booleanValue()) {
            return null;
        }
        TextLayoutResult textLayoutResultTy = ty();
        if (textLayoutResultTy != null) {
            AnnotatedString.Range rangeMUb = mUb(link, textLayoutResultTy);
            if (rangeMUb == null) {
                return null;
            }
            pathNY = textLayoutResultTy.nY(rangeMUb.getStart(), rangeMUb.getEnd());
            Rect rectNr = textLayoutResultTy.nr(rangeMUb.getStart());
            Rect rectNr2 = textLayoutResultTy.nr(rangeMUb.getEnd() - 1);
            if (textLayoutResultTy.Ik(rangeMUb.getStart()) == textLayoutResultTy.Ik(rangeMUb.getEnd() - 1)) {
                fMin = Math.min(rectNr2.getLeft(), rectNr.getLeft());
            } else {
                fMin = 0.0f;
            }
            pathNY.qie(Offset.O(Offset.O((((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(rectNr.getTop())) & 4294967295L)) ^ (-9223372034707292160L)));
        }
        return pathNY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextRangeLayoutMeasureResult XQ(TextLinkScope textLinkScope, AnnotatedString.Range range, TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
        TextLayoutResult textLayoutResultTy = textLinkScope.ty();
        if (textLayoutResultTy == null) {
            return textRangeLayoutMeasureScope.n(0, 0, new Function0<IntOffset>() { // from class: androidx.compose.foundation.text.TextLinkScope$textRange$1$layoutResult$1
                public final long n() {
                    return IntOffset.INSTANCE.rl();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ IntOffset invoke() {
                    return IntOffset.t(n());
                }
            });
        }
        AnnotatedString.Range rangeMUb = textLinkScope.mUb(range, textLayoutResultTy);
        if (rangeMUb == null) {
            return textRangeLayoutMeasureScope.n(0, 0, new Function0<IntOffset>() { // from class: androidx.compose.foundation.text.TextLinkScope$textRange$1$updatedRange$1
                public final long n() {
                    return IntOffset.INSTANCE.rl();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ IntOffset invoke() {
                    return IntOffset.t(n());
                }
            });
        }
        final IntRect intRectRl = IntRectKt.rl(textLayoutResultTy.nY(rangeMUb.getStart(), rangeMUb.getEnd()).getBounds());
        return textRangeLayoutMeasureScope.n(intRectRl.qie(), intRectRl.J2(), new Function0<IntOffset>() { // from class: androidx.compose.foundation.text.TextLinkScope$textRange$1$1
            {
                super(0);
            }

            public final long n() {
                return intRectRl.gh();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ IntOffset invoke() {
                return IntOffset.t(n());
            }
        });
    }

    private final AnnotatedString.Range mUb(AnnotatedString.Range link, TextLayoutResult textLayoutResult) {
        int iCk = TextLayoutResult.ck(textLayoutResult, textLayoutResult.ty() - 1, false, 2, null);
        if (link.getStart() >= iCk) {
            return null;
        }
        return AnnotatedString.Range.O(link, null, 0, Math.min(link.getEnd(), iCk), null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Shape o(AnnotatedString.Range link) {
        final Path pathIk = Ik(link);
        if (pathIk != null) {
            return new Shape() { // from class: androidx.compose.foundation.text.TextLinkScope$shapeForRange$1$1
                @Override // androidx.compose.ui.graphics.Shape
                public Outline n(long size, LayoutDirection layoutDirection, Density density) {
                    return new Outline.Generic(pathIk);
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(final Object[] objArr, final Function1 function1, Composer composer, final int i2) {
        int i3;
        boolean z2;
        int i5;
        int i7;
        int i8;
        Composer composerKN = composer.KN(-2083052099);
        if ((i2 & 48) == 0) {
            if (composerKN.E2(function1)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(this)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        composerKN.X(-416604407, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            if (composerKN.E2(obj)) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            i3 |= i5;
        }
        composerKN.P5();
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        boolean z3 = true;
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-2083052099, i3, -1, obbPUqyhtS.DsmXfCgjTfUarI);
            }
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(function1);
            spreadBuilder.addSpread(objArr);
            Object[] array = spreadBuilder.toArray(new Object[spreadBuilder.size()]);
            boolean zE2 = composerKN.E2(this);
            if ((i3 & 112) != 32) {
                z3 = false;
            }
            boolean z4 = zE2 | z3;
            Object objIF = composerKN.iF();
            if (z4 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        this.f19921n.annotators.add(function1);
                        final TextLinkScope textLinkScope = this.f19921n;
                        final Function1 function12 = function1;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void n() {
                                textLinkScope.annotators.remove(function12);
                            }
                        };
                    }
                };
                composerKN.o(objIF);
            }
            EffectsKt.t(array, (Function1) objIF, composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    TextLinkScope textLinkScope = this.f19925n;
                    Object[] objArr2 = objArr;
                    textLinkScope.t(Arrays.copyOf(objArr2, objArr2.length), function1, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }
}
