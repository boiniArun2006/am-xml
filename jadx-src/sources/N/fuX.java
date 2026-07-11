package N;

import N.fuX;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class fuX {

    static final class j implements PointerInputEventHandler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ SoftwareKeyboardController f6920n;

        j(SoftwareKeyboardController softwareKeyboardController) {
            this.f6920n = softwareKeyboardController;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit rl(SoftwareKeyboardController softwareKeyboardController, Offset offset) {
            if (softwareKeyboardController != null) {
                softwareKeyboardController.n();
            }
            return Unit.INSTANCE;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            final SoftwareKeyboardController softwareKeyboardController = this.f6920n;
            Object objAz = TapGestureDetectorKt.az(pointerInputScope, null, null, null, new Function1() { // from class: N.CN3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return fuX.j.rl(softwareKeyboardController, (Offset) obj);
                }
            }, continuation, 7, null);
            return objAz == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAz : Unit.INSTANCE;
        }
    }

    public static final void rl(final Function2 content, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerKN = composer.KN(-1193198411);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(content) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1193198411, i3, -1, "com.alightcreative.common.compose.CloseKeyboardOnOutsideTap (CloseKeyboardOnOutsideTap.kt:11)");
            }
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerKN.ty(CompositionLocalsKt.Ik());
            Modifier modifierJ2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
            Unit unit = Unit.INSTANCE;
            composerKN.eF(1880520326);
            boolean zP5 = composerKN.p5(softwareKeyboardController);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(softwareKeyboardController);
                composerKN.o(objIF);
            }
            composerKN.Xw();
            Modifier modifierNr = SuspendingPointerInputFilterKt.nr(modifierJ2, unit, (PointerInputEventHandler) objIF);
            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyUo, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            content.invoke(composerKN, Integer.valueOf(i3 & 14));
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: N.Wre
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return fuX.t(content, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function2 function2, int i2, Composer composer, int i3) {
        rl(function2, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
