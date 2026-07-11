package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.PlatformMagnifierFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "t", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.android.kt\nandroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,91:1\n75#2:92\n1247#3,6:93\n1247#3,6:99\n1247#3,6:105\n85#4:111\n113#4,2:112\n*S KotlinDebug\n*F\n+ 1 SelectionManager.android.kt\nandroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1\n*L\n50#1:92\n51#1:93,6\n53#1:99,6\n54#1:105,6\n51#1:111\n51#1:112,2\n*E\n"})
final class SelectionManager_androidKt$selectionMagnifier$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ SelectionManager f20924n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionManager_androidKt$selectionMagnifier$1(SelectionManager selectionManager) {
        super(3);
        this.f20924n = selectionManager;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return t(modifier, composer, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(MutableState mutableState, long j2) {
        mutableState.setValue(IntSize.rl(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long nr(MutableState mutableState) {
        return ((IntSize) mutableState.getValue()).getPackedValue();
    }

    public final Modifier t(Modifier modifier, Composer composer, int i2) {
        composer.eF(-1914520728);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1914520728, i2, -1, "androidx.compose.foundation.text.selection.selectionMagnifier.<anonymous> (SelectionManager.android.kt:49)");
        }
        final Density density = (Density) composer.ty(CompositionLocalsKt.J2());
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            objIF = SnapshotStateKt__SnapshotStateKt.O(IntSize.rl(IntSize.INSTANCE.n()), null, 2, null);
            composer.o(objIF);
        }
        final MutableState mutableState = (MutableState) objIF;
        boolean zE2 = composer.E2(this.f20924n);
        final SelectionManager selectionManager = this.f20924n;
        Object objIF2 = composer.iF();
        if (zE2 || objIF2 == companion.n()) {
            objIF2 = new Function0<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public final long n() {
                    return SelectionManagerKt.t(selectionManager, SelectionManager_androidKt$selectionMagnifier$1.nr(mutableState));
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Offset invoke() {
                    return Offset.nr(n());
                }
            };
            composer.o(objIF2);
        }
        Function0 function0 = (Function0) objIF2;
        boolean zP5 = composer.p5(density);
        Object objIF3 = composer.iF();
        if (zP5 || objIF3 == companion.n()) {
            objIF3 = new Function1<Function0<? extends Offset>, Modifier>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Modifier invoke(final Function0 function02) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Function1<Density, Offset> function1 = new Function1<Density, Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Offset invoke(Density density2) {
                            return Offset.nr(n(density2));
                        }

                        public final long n(Density density2) {
                            return ((Offset) function02.invoke()).getPackedValue();
                        }
                    };
                    final Density density2 = density;
                    final MutableState mutableState2 = mutableState;
                    return Magnifier_androidKt.J2(companion2, function1, null, new Function1<DpSize, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DpSize dpSize) {
                            n(dpSize.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(long j2) {
                            MutableState mutableState3 = mutableState2;
                            Density density3 = density2;
                            int iHow = density3.How(DpSize.mUb(j2));
                            SelectionManager_androidKt$selectionMagnifier$1.O(mutableState3, IntSize.t((((long) density3.How(DpSize.xMQ(j2))) & 4294967295L) | (((long) iHow) << 32)));
                        }
                    }, 0.0f, true, 0L, 0.0f, 0.0f, false, PlatformMagnifierFactory.INSTANCE.n(), 490, null);
                }
            };
            composer.o(objIF3);
        }
        Modifier modifierNr = SelectionMagnifierKt.nr(modifier, function0, (Function1) objIF3);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return modifierNr;
    }
}
