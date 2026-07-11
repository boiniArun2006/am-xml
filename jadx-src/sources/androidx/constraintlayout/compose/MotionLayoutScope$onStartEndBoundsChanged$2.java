package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifierKt;
import androidx.compose.ui.node.Ref;
import androidx.constraintlayout.core.state.WidgetFrame;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMotionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutScope$onStartEndBoundsChanged$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1651:1\n1225#2,6:1652\n1225#2,6:1658\n1225#2,3:1664\n1228#2,3:1668\n1225#2,6:1671\n1225#2,6:1677\n1225#2,6:1683\n1#3:1667\n*S KotlinDebug\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutScope$onStartEndBoundsChanged$2\n*L\n715#1:1652,6\n718#1:1658,6\n719#1:1664,3\n719#1:1668,3\n722#1:1671,6\n723#1:1677,6\n727#1:1683,6\n*E\n"})
final class MotionLayoutScope$onStartEndBoundsChanged$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Function2 f34803O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f34804n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ MotionLayoutScope f34805t;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return n(modifier, composer, num.intValue());
    }

    public final Modifier n(Modifier modifier, Composer composer, int i2) {
        composer.eF(-1096247907);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1096247907, i2, -1, "androidx.constraintlayout.compose.MotionLayoutScope.onStartEndBoundsChanged.<anonymous> (MotionLayout.kt:714)");
        }
        boolean zP5 = composer.p5(this.f34804n);
        Object obj = this.f34804n;
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = obj.toString();
            composer.o(objIF);
        }
        final String str = (String) objIF;
        Object objIF2 = composer.iF();
        Object obj2 = objIF2;
        if (objIF2 == Composer.INSTANCE.n()) {
            int[] iArr = new int[4];
            for (int i3 = 0; i3 < 4; i3++) {
                iArr[i3] = 0;
            }
            composer.o(iArr);
            obj2 = iArr;
        }
        final int[] iArr2 = (int[]) obj2;
        Object objIF3 = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        Object obj3 = objIF3;
        if (objIF3 == companion.n()) {
            Ref ref = new Ref();
            ref.rl(Rect.INSTANCE.n());
            composer.o(ref);
            obj3 = ref;
        }
        final Ref ref2 = (Ref) obj3;
        Object objIF4 = composer.iF();
        Object obj4 = objIF4;
        if (objIF4 == companion.n()) {
            int[] iArr3 = new int[4];
            for (int i5 = 0; i5 < 4; i5++) {
                iArr3[i5] = 0;
            }
            composer.o(iArr3);
            obj4 = iArr3;
        }
        final int[] iArr4 = (int[]) obj4;
        Object objIF5 = composer.iF();
        Composer.Companion companion2 = Composer.INSTANCE;
        Object obj5 = objIF5;
        if (objIF5 == companion2.n()) {
            Ref ref3 = new Ref();
            ref3.rl(Rect.INSTANCE.n());
            composer.o(ref3);
            obj5 = ref3;
        }
        final Ref ref4 = (Ref) obj5;
        boolean zE2 = composer.E2(this.f34805t) | composer.p5(str) | composer.E2(iArr2) | composer.E2(ref2) | composer.E2(iArr4) | composer.E2(ref4) | composer.p5(this.f34803O);
        final MotionLayoutScope motionLayoutScope = this.f34805t;
        final Function2 function2 = this.f34803O;
        Object objIF6 = composer.iF();
        if (zE2 || objIF6 == companion2.n()) {
            Object obj6 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutScope$onStartEndBoundsChanged$2$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                    n(layoutCoordinates);
                    return Unit.INSTANCE;
                }

                public final void n(LayoutCoordinates layoutCoordinates) {
                    boolean z2;
                    WidgetFrame widgetFrameTe = motionLayoutScope.measurer.getTransition().te(str);
                    int i7 = widgetFrameTe.rl;
                    int[] iArr5 = iArr2;
                    boolean z3 = true;
                    if (i7 == iArr5[0] && widgetFrameTe.f35465t == iArr5[1] && widgetFrameTe.nr == iArr5[2] && widgetFrameTe.f35460O == iArr5[3]) {
                        z2 = false;
                    } else {
                        iArr5[0] = i7;
                        iArr5[1] = widgetFrameTe.f35465t;
                        iArr5[2] = widgetFrameTe.nr;
                        iArr5[3] = widgetFrameTe.f35460O;
                        Ref ref5 = ref2;
                        int[] iArr6 = iArr2;
                        ref5.rl(new Rect(iArr6[0], iArr6[1], iArr6[2], iArr6[3]));
                        z2 = true;
                    }
                    WidgetFrame widgetFrameO = motionLayoutScope.measurer.getTransition().o(str);
                    int i8 = widgetFrameO.rl;
                    int[] iArr7 = iArr4;
                    if (i8 == iArr7[0] && widgetFrameO.f35465t == iArr7[1] && widgetFrameO.nr == iArr7[2] && widgetFrameO.f35460O == iArr7[3]) {
                        z3 = z2;
                    } else {
                        iArr7[0] = i8;
                        iArr7[1] = widgetFrameO.f35465t;
                        iArr7[2] = widgetFrameO.nr;
                        iArr7[3] = widgetFrameO.f35460O;
                        Ref ref6 = ref4;
                        int[] iArr8 = iArr4;
                        ref6.rl(new Rect(iArr8[0], iArr8[1], iArr8[2], iArr8[3]));
                    }
                    if (z3) {
                        Function2 function22 = function2;
                        Rect rectN = (Rect) ref2.getValue();
                        if (rectN == null) {
                            rectN = Rect.INSTANCE.n();
                        }
                        Rect rectN2 = (Rect) ref4.getValue();
                        if (rectN2 == null) {
                            rectN2 = Rect.INSTANCE.n();
                        }
                        function22.invoke(rectN, rectN2);
                    }
                }
            };
            composer.o(obj6);
            objIF6 = obj6;
        }
        Modifier modifierN = OnPlacedModifierKt.n(modifier, (Function1) objIF6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return modifierN;
    }
}
