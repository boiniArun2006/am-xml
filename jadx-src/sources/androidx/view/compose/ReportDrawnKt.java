package androidx.view.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.view.FullyDrawnReporter;
import androidx.view.FullyDrawnReporterOwner;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\f\u001a\u00020\u00032\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/Function0;", "", "predicate", "", "t", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", c.f62177j, "(Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "rl", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,153:1\n1225#2,6:154\n1225#2,6:160\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt\n*L\n119#1:154,6\n151#1:160,6\n*E\n"})
public final class ReportDrawnKt {
    public static final void n(Composer composer, final int i2) {
        Composer composerKN = composer.KN(-1357012904);
        if (i2 == 0 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1357012904, i2, -1, "androidx.activity.compose.ReportDrawn (ReportDrawn.kt:135)");
            }
            t(new Function0<Boolean>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawn$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            }, composerKN, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawn$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i3) {
                    ReportDrawnKt.n(composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final void rl(final Function1 function1, Composer composer, final int i2) {
        int i3;
        FullyDrawnReporter fullyDrawnReporter;
        int i5;
        Composer composerKN = composer.KN(945311272);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(function1)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(945311272, i3, -1, "androidx.activity.compose.ReportDrawnAfter (ReportDrawn.kt:148)");
            }
            FullyDrawnReporterOwner fullyDrawnReporterOwnerN = LocalFullyDrawnReporterOwner.f13284n.n(composerKN, 6);
            if (fullyDrawnReporterOwnerN != null && (fullyDrawnReporter = fullyDrawnReporterOwnerN.getFullyDrawnReporter()) != null) {
                boolean zE2 = composerKN.E2(fullyDrawnReporter) | composerKN.E2(function1);
                Object objIF = composerKN.iF();
                if (zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new ReportDrawnKt$ReportDrawnAfter$1$1(fullyDrawnReporter, function1, null);
                    composerKN.o(objIF);
                }
                EffectsKt.nr(function1, fullyDrawnReporter, (Function2) objIF, composerKN, i3 & 14);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1
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
                            ReportDrawnKt.rl(function1, composer2, RecomposeScopeImplKt.n(i2 | 1));
                        }
                    });
                    return;
                }
                return;
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh2 = composerKN.gh();
        if (scopeUpdateScopeGh2 != null) {
            scopeUpdateScopeGh2.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$2
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
                    ReportDrawnKt.rl(function1, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final void t(final Function0 function0, Composer composer, final int i2) {
        int i3;
        final FullyDrawnReporter fullyDrawnReporter;
        boolean z2;
        int i5;
        Composer composerKN = composer.KN(-2047119994);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(function0)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-2047119994, i3, -1, "androidx.activity.compose.ReportDrawnWhen (ReportDrawn.kt:116)");
            }
            FullyDrawnReporterOwner fullyDrawnReporterOwnerN = LocalFullyDrawnReporterOwner.f13284n.n(composerKN, 6);
            if (fullyDrawnReporterOwnerN != null && (fullyDrawnReporter = fullyDrawnReporterOwnerN.getFullyDrawnReporter()) != null) {
                boolean zE2 = composerKN.E2(fullyDrawnReporter);
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z3 = zE2 | z2;
                Object objIF = composerKN.iF();
                if (z3 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            if (fullyDrawnReporter.O()) {
                                return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void n() {
                                    }
                                };
                            }
                            final ReportDrawnComposition reportDrawnComposition = new ReportDrawnComposition(fullyDrawnReporter, function0);
                            return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$2
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void n() {
                                    reportDrawnComposition.nr();
                                }
                            };
                        }
                    };
                    composerKN.o(objIF);
                }
                EffectsKt.n(fullyDrawnReporter, function0, (Function1) objIF, composerKN, (i3 << 3) & 112);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1
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
                            ReportDrawnKt.t(function0, composer2, RecomposeScopeImplKt.n(i2 | 1));
                        }
                    });
                    return;
                }
                return;
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh2 = composerKN.gh();
        if (scopeUpdateScopeGh2 != null) {
            scopeUpdateScopeGh2.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$2
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
                    ReportDrawnKt.t(function0, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }
}
