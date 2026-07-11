package androidx.constraintlayout.compose;

import ILs.CN3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.Ref;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", c.f62177j, "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2303:1\n1225#2,6:2304\n*S KotlinDebug\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n*L\n384#1:2304,6\n*E\n"})
public final class ConstraintLayoutKt$ConstraintLayout$contentDelegate$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function3 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ ConstraintLayoutScope f34477O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ MutableState f34478Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ MutableState f34479n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ MutableState f34480o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ CN3 f34481r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Ref f34482t;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        n(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void n(Composer composer, int i2) {
        if ((i2 & 3) == 2 && composer.xMQ()) {
            composer.wTp();
            return;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-74958949, i2, -1, obbPUqyhtS.QjQjLz);
        }
        this.f34479n.setValue(Unit.INSTANCE);
        if (this.f34482t.getValue() == CompositionSource.Unknown) {
            this.f34482t.rl(CompositionSource.Content);
        }
        this.f34477O.Uo();
        this.J2.invoke(this.f34477O, composer, 0);
        boolean zE2 = composer.E2(this.f34477O) | composer.E2(this.f34481r);
        final ConstraintLayoutScope constraintLayoutScope = this.f34477O;
        final MutableState mutableState = this.f34480o;
        final MutableState mutableState2 = this.f34478Z;
        final CN3 cn3 = this.f34481r;
        Object objIF = composer.iF();
        if (zE2 || objIF == Composer.INSTANCE.n()) {
            objIF = new Function0<Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$contentDelegate$1$1$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    RawConstraintSet rawConstraintSet = new RawConstraintSet(constraintLayoutScope.getContainerObject().rl());
                    if (mutableState.getValue() != null && mutableState2.getValue() != null) {
                        cn3.nr(rawConstraintSet);
                    } else {
                        mutableState.setValue(rawConstraintSet);
                        mutableState2.setValue(mutableState.getValue());
                    }
                }
            };
            composer.o(objIF);
        }
        EffectsKt.KN((Function0) objIF, composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
