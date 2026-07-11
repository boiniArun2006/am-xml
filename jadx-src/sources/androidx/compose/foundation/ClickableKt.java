package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.ScrollableContainerNode;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aD\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aX\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a~\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0092\u0001\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001b\u001a\u00020\u0001*\u00020\u001aH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"\u0018\u0010 \u001a\u00020\u0001*\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0018\u0010\"\u001a\u00020\u0001*\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001f\"\u0018\u0010$\u001a\u00020\u0001*\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "O", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/Indication;", "indication", "t", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "onLongClickLabel", "onLongClick", "onDoubleClick", "hapticFeedbackEnabled", "xMQ", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Uo", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/node/TraversableNode;", "gh", "(Landroidx/compose/ui/node/TraversableNode;)Z", "Landroidx/compose/ui/input/key/KeyEvent;", "ty", "(Landroid/view/KeyEvent;)Z", "isPress", "qie", "isClick", "az", "isEnter", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1327:1\n457#1,17:1329\n457#1,17:1348\n457#1,17:1365\n110#2:1328\n110#2:1346\n110#2:1347\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n191#1:1329,17\n399#1:1348,17\n429#1:1365,17\n113#1:1328\n253#1:1346\n302#1:1347\n*E\n"})
public final class ClickableKt {
    public static /* synthetic */ Modifier J2(Modifier modifier, boolean z2, String str, Role role, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        return O(modifier, z2, str, role, function0);
    }

    public static /* synthetic */ Modifier KN(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, String str, Role role, String str2, Function0 function0, Function0 function02, boolean z3, Function0 function03, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            role = null;
        }
        if ((i2 & 32) != 0) {
            str2 = null;
        }
        if ((i2 & 64) != 0) {
            function0 = null;
        }
        if ((i2 & 128) != 0) {
            function02 = null;
        }
        if ((i2 & 256) != 0) {
            z3 = true;
        }
        return Uo(modifier, mutableInteractionSource, indication, z2, str, role, str2, function0, function02, z3, function03);
    }

    public static final Modifier Uo(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z2, final String str, final Role role, final String str2, final Function0 function0, final Function0 function02, final boolean z3, final Function0 function03) {
        Modifier modifierT;
        if (indication instanceof IndicationNodeFactory) {
            modifierT = new CombinedClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, z2, str, role, function03, str2, function0, function02, z3, null);
        } else if (indication == null) {
            modifierT = new CombinedClickableElement(mutableInteractionSource, null, z2, str, role, function03, str2, function0, function02, z3, null);
        } else if (mutableInteractionSource != null) {
            modifierT = IndicationKt.rl(Modifier.INSTANCE, mutableInteractionSource, indication).Zmq(new CombinedClickableElement(mutableInteractionSource, null, z2, str, role, function03, str2, function0, function02, z3, null));
        } else {
            modifierT = ComposedModifierKt.t(Modifier.INSTANCE, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-auXiCPI$$inlined$clickableWithIndicationIfNeeded$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                    return n(modifier2, composer, num.intValue());
                }

                public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                    composer.eF(-1525724089);
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1525724089, i2, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:473)");
                    }
                    Object objIF = composer.iF();
                    if (objIF == Composer.INSTANCE.n()) {
                        objIF = InteractionSourceKt.n();
                        composer.o(objIF);
                    }
                    MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objIF;
                    Modifier modifierZmq = IndicationKt.rl(Modifier.INSTANCE, mutableInteractionSource2, indication).Zmq(new CombinedClickableElement(mutableInteractionSource2, null, z2, str, role, function03, str2, function0, function02, z3, null));
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composer.Xw();
                    return modifierZmq;
                }
            }, 1, null);
        }
        return modifier.Zmq(modifierT);
    }

    public static final boolean gh(TraversableNode traversableNode) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        TraversableNodeKt.t(traversableNode, ScrollableContainerNode.INSTANCE, new Function1<TraversableNode, Boolean>() { // from class: androidx.compose.foundation.ClickableKt$hasScrollableContainer$1
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke(TraversableNode traversableNode2) {
                boolean z2;
                Ref.BooleanRef booleanRef2 = booleanRef;
                if (!booleanRef2.element) {
                    Intrinsics.checkNotNull(traversableNode2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                    z2 = ((ScrollableContainerNode) traversableNode2).getEnabled();
                }
                booleanRef2.element = z2;
                return Boolean.valueOf(!booleanRef.element);
            }
        });
        return booleanRef.element;
    }

    public static /* synthetic */ Modifier mUb(Modifier modifier, boolean z2, String str, Role role, String str2, Function0 function0, Function0 function02, boolean z3, Function0 function03, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            function0 = null;
        }
        if ((i2 & 32) != 0) {
            function02 = null;
        }
        if ((i2 & 64) != 0) {
            z3 = true;
        }
        return xMQ(modifier, z2, str, role, str2, function0, function02, z3, function03);
    }

    public static /* synthetic */ Modifier nr(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, String str, Role role, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        return t(modifier, mutableInteractionSource, indication, z2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : role, function0);
    }

    public static final Modifier t(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z2, final String str, final Role role, final Function0 function0) {
        Modifier modifierT;
        if (indication instanceof IndicationNodeFactory) {
            modifierT = new ClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, z2, str, role, function0, null);
        } else if (indication == null) {
            modifierT = new ClickableElement(mutableInteractionSource, null, z2, str, role, function0, null);
        } else if (mutableInteractionSource != null) {
            modifierT = IndicationKt.rl(Modifier.INSTANCE, mutableInteractionSource, indication).Zmq(new ClickableElement(mutableInteractionSource, null, z2, str, role, function0, null));
        } else {
            modifierT = ComposedModifierKt.t(Modifier.INSTANCE, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                    return n(modifier2, composer, num.intValue());
                }

                public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                    composer.eF(-1525724089);
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1525724089, i2, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:473)");
                    }
                    Object objIF = composer.iF();
                    if (objIF == Composer.INSTANCE.n()) {
                        objIF = InteractionSourceKt.n();
                        composer.o(objIF);
                    }
                    MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objIF;
                    Modifier modifierZmq = IndicationKt.rl(Modifier.INSTANCE, mutableInteractionSource2, indication).Zmq(new ClickableElement(mutableInteractionSource2, null, z2, str, role, function0, null));
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composer.Xw();
                    return modifierZmq;
                }
            }, 1, null);
        }
        return modifier.Zmq(modifierT);
    }

    public static final Modifier O(Modifier modifier, final boolean z2, final String str, final Role role, final Function0 function0) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1
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
                    inspectorInfo.rl("clickable");
                    inspectorInfo.getProperties().n("enabled", Boolean.valueOf(z2));
                    inspectorInfo.getProperties().n("onClickLabel", str);
                    inspectorInfo.getProperties().n("role", role);
                    inspectorInfo.getProperties().n("onClick", function0);
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return ComposedModifierKt.rl(modifier, function1N, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                MutableInteractionSource mutableInteractionSource;
                composer.eF(-756081143);
                if (ComposerKt.v()) {
                    ComposerKt.p5(-756081143, i2, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:120)");
                }
                Indication indication = (Indication) composer.ty(IndicationKt.n());
                if (indication instanceof IndicationNodeFactory) {
                    composer.eF(617653824);
                    composer.Xw();
                    mutableInteractionSource = null;
                } else {
                    composer.eF(617786442);
                    Object objIF = composer.iF();
                    if (objIF == Composer.INSTANCE.n()) {
                        objIF = InteractionSourceKt.n();
                        composer.o(objIF);
                    }
                    mutableInteractionSource = (MutableInteractionSource) objIF;
                    composer.Xw();
                }
                Modifier modifierT = ClickableKt.t(Modifier.INSTANCE, mutableInteractionSource, indication, z2, str, role, function0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return modifierT;
            }
        });
    }

    private static final boolean az(KeyEvent keyEvent) {
        boolean zR;
        boolean zR2;
        long jN = KeyEvent_androidKt.n(keyEvent);
        Key.Companion companion = Key.INSTANCE;
        if (Key.r(jN, companion.rl())) {
            zR = true;
        } else {
            zR = Key.r(jN, companion.Uo());
        }
        if (zR) {
            zR2 = true;
        } else {
            zR2 = Key.r(jN, companion.gh());
        }
        if (zR2) {
            return true;
        }
        return Key.r(jN, companion.ty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean qie(KeyEvent keyEvent) {
        if (KeyEventType.J2(KeyEvent_androidKt.rl(keyEvent), KeyEventType.INSTANCE.rl()) && az(keyEvent)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ty(KeyEvent keyEvent) {
        if (KeyEventType.J2(KeyEvent_androidKt.rl(keyEvent), KeyEventType.INSTANCE.n()) && az(keyEvent)) {
            return true;
        }
        return false;
    }

    public static final Modifier xMQ(Modifier modifier, final boolean z2, final String str, final Role role, final String str2, final Function0 function0, final Function0 function02, final boolean z3, final Function0 function03) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-f5TDLPQ$$inlined$debugInspectorInfo$1
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
                    inspectorInfo.rl("combinedClickable");
                    inspectorInfo.getProperties().n("enabled", Boolean.valueOf(z2));
                    inspectorInfo.getProperties().n("onClickLabel", str);
                    inspectorInfo.getProperties().n("role", role);
                    inspectorInfo.getProperties().n("onClick", function03);
                    inspectorInfo.getProperties().n("onDoubleClick", function02);
                    inspectorInfo.getProperties().n("onLongClick", function0);
                    inspectorInfo.getProperties().n("onLongClickLabel", str2);
                    inspectorInfo.getProperties().n("hapticFeedbackEnabled", Boolean.valueOf(z3));
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return ComposedModifierKt.rl(modifier, function1N, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                MutableInteractionSource mutableInteractionSource;
                composer.eF(-1534186401);
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1534186401, i2, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:264)");
                }
                Indication indication = (Indication) composer.ty(IndicationKt.n());
                if (indication instanceof IndicationNodeFactory) {
                    composer.eF(-1726068379);
                    composer.Xw();
                    mutableInteractionSource = null;
                } else {
                    composer.eF(-1725935761);
                    Object objIF = composer.iF();
                    if (objIF == Composer.INSTANCE.n()) {
                        objIF = InteractionSourceKt.n();
                        composer.o(objIF);
                    }
                    mutableInteractionSource = (MutableInteractionSource) objIF;
                    composer.Xw();
                }
                Modifier modifierUo = ClickableKt.Uo(Modifier.INSTANCE, mutableInteractionSource, indication, z2, str, role, str2, function0, function02, z3, function03);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return modifierUo;
            }
        });
    }
}
