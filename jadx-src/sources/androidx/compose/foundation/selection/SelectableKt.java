package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aT\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "selected", "enabled", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "t", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/Indication;", "indication", c.f62177j, "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,265:1\n110#2:266\n457#3,17:267\n*S KotlinDebug\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n69#1:266\n142#1:267,17\n*E\n"})
public final class SelectableKt {
    public static final Modifier n(Modifier modifier, final boolean z2, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z3, final Role role, final Function0 function0) {
        return modifier.Zmq(indication instanceof IndicationNodeFactory ? new SelectableElement(z2, mutableInteractionSource, (IndicationNodeFactory) indication, z3, role, function0, null) : indication == null ? new SelectableElement(z2, mutableInteractionSource, null, z3, role, function0, null) : mutableInteractionSource != null ? IndicationKt.rl(Modifier.INSTANCE, mutableInteractionSource, indication).Zmq(new SelectableElement(z2, mutableInteractionSource, null, z3, role, function0, null)) : ComposedModifierKt.t(Modifier.INSTANCE, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
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
                Modifier modifierZmq = IndicationKt.rl(Modifier.INSTANCE, mutableInteractionSource2, indication).Zmq(new SelectableElement(z2, mutableInteractionSource2, null, z3, role, function0, null));
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return modifierZmq;
            }
        }, 1, null));
    }

    public static /* synthetic */ Modifier nr(Modifier modifier, boolean z2, boolean z3, Role role, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z3 = true;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        return t(modifier, z2, z3, role, function0);
    }

    public static /* synthetic */ Modifier rl(Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z3, Role role, Function0 function0, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z3 = true;
        }
        boolean z4 = z3;
        if ((i2 & 16) != 0) {
            role = null;
        }
        return n(modifier, z2, mutableInteractionSource, indication, z4, role, function0);
    }

    public static final Modifier t(Modifier modifier, final boolean z2, final boolean z3, final Role role, final Function0 function0) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-XHw0xAI$$inlined$debugInspectorInfo$1
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
                    inspectorInfo.rl("selectable");
                    inspectorInfo.getProperties().n("selected", Boolean.valueOf(z2));
                    inspectorInfo.getProperties().n("enabled", Boolean.valueOf(z3));
                    inspectorInfo.getProperties().n(jhotmBbwMbr.kBBHOkw, role);
                    inspectorInfo.getProperties().n("onClick", function0);
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return ComposedModifierKt.rl(modifier, function1N, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable$2
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
                composer.eF(-2124609672);
                if (ComposerKt.v()) {
                    ComposerKt.p5(-2124609672, i2, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:76)");
                }
                Indication indication = (Indication) composer.ty(IndicationKt.n());
                if (indication instanceof IndicationNodeFactory) {
                    composer.eF(-1412174474);
                    composer.Xw();
                    mutableInteractionSource = null;
                } else {
                    composer.eF(-1412041856);
                    Object objIF = composer.iF();
                    if (objIF == Composer.INSTANCE.n()) {
                        objIF = InteractionSourceKt.n();
                        composer.o(objIF);
                    }
                    mutableInteractionSource = (MutableInteractionSource) objIF;
                    composer.Xw();
                }
                Modifier modifierN = SelectableKt.n(Modifier.INSTANCE, z2, mutableInteractionSource, indication, z3, role, function0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return modifierN;
            }
        });
    }
}
