package androidx.compose.ui.tooling;

import aUP.QIQ.OAxfmSwmk;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.FloatingActionButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.view.ComponentActivity;
import androidx.view.compose.ComponentActivityKt;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "composableFqn", "", "GR", "(Ljava/lang/String;)V", "className", JavetError.PARAMETER_METHOD_NAME, "parameterProvider", "Nxk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", c.f62177j, "Ljava/lang/String;", "TAG", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPreviewActivity.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewActivity.android.kt\nandroidx/compose/ui/tooling/PreviewActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
public final class PreviewActivity extends ComponentActivity {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final String TAG = "PreviewActivity";

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        OAxfmSwmk.ZDQRJE.invoke(null, this, savedInstanceState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void GR(String composableFqn) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Log.d(this.TAG, "PreviewActivity has composable " + composableFqn);
        final String strSubstringBeforeLast$default = StringsKt.substringBeforeLast$default(composableFqn, '.', (String) null, 2, (Object) null);
        final String strSubstringAfterLast$default = StringsKt.substringAfterLast$default(composableFqn, '.', (String) null, 2, (Object) null);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra != null) {
            Nxk(strSubstringBeforeLast$default, strSubstringAfterLast$default, stringExtra);
            return;
        }
        Log.d(this.TAG, "Previewing '" + strSubstringAfterLast$default + "' without a parameter provider.");
        ComponentActivityKt.rl(this, null, ComposableLambdaKt.rl(-840626948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setComposableContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                n(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void n(Composer composer, int i2) {
                if (!composer.HI((i2 & 3) != 2, i2 & 1)) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-840626948, i2, -1, "androidx.compose.ui.tooling.PreviewActivity.setComposableContent.<anonymous> (PreviewActivity.android.kt:74)");
                }
                ComposableInvoker.f33936n.Uo(strSubstringBeforeLast$default, strSubstringAfterLast$default, composer, new Object[0]);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }), 1, null);
    }

    private final void Nxk(final String className, final String methodName, String parameterProvider) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Log.d(this.TAG, "Previewing '" + methodName + "' with parameter provider: '" + parameterProvider + '\'');
        final Object[] objArrJ2 = PreviewUtils_androidKt.J2(PreviewUtils_androidKt.n(parameterProvider), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (objArrJ2.length > 1) {
            ComponentActivityKt.rl(this, null, ComposableLambdaKt.rl(-861939235, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    n(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer, int i2) {
                    if (!composer.HI((i2 & 3) != 2, i2 & 1)) {
                        composer.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-861939235, i2, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:103)");
                    }
                    Object objIF = composer.iF();
                    if (objIF == Composer.INSTANCE.n()) {
                        objIF = SnapshotIntStateKt.n(0);
                        composer.o(objIF);
                    }
                    final MutableIntState mutableIntState = (MutableIntState) objIF;
                    final Object[] objArr = objArrJ2;
                    ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(958604965, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void n(Composer composer2, int i3) {
                            if (!composer2.HI((i3 & 3) != 2, i3 & 1)) {
                                composer2.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(958604965, i3, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:117)");
                            }
                            Function2 function2N = ComposableSingletons$PreviewActivity_androidKt.f33942n.n();
                            boolean zE2 = composer2.E2(objArr);
                            final MutableIntState mutableIntState2 = mutableIntState;
                            final Object[] objArr2 = objArr;
                            Object objIF2 = composer2.iF();
                            if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                                objIF2 = new Function0<Unit>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1$1$1$1
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
                                        MutableIntState mutableIntState3 = mutableIntState2;
                                        mutableIntState3.KN((mutableIntState3.J2() + 1) % objArr2.length);
                                    }
                                };
                                composer2.o(objIF2);
                            }
                            FloatingActionButtonKt.n(function2N, (Function0) objIF2, null, null, null, null, 0L, 0L, null, composer2, 6, 508);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer, 54);
                    final String str = className;
                    final String str2 = methodName;
                    final Object[] objArr2 = objArrJ2;
                    ScaffoldKt.n(null, null, null, null, null, composableLambdaNr, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.nr(57310875, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        public final void n(PaddingValues paddingValues, Composer composer2, int i3) {
                            if ((i3 & 6) == 0) {
                                i3 |= composer2.p5(paddingValues) ? 4 : 2;
                            }
                            if (!composer2.HI((i3 & 19) != 18, 1 & i3)) {
                                composer2.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(57310875, i3, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:107)");
                            }
                            Modifier modifierKN = PaddingKt.KN(Modifier.INSTANCE, paddingValues);
                            String str3 = str;
                            String str4 = str2;
                            Object[] objArr3 = objArr2;
                            MutableIntState mutableIntState2 = mutableIntState;
                            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                            int iN = ComposablesKt.n(composer2, 0);
                            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                            Modifier modifierO = ComposedModifierKt.O(composer2, modifierKN);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0 function0N = companion.n();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.t();
                            }
                            composer2.T();
                            if (composer2.getInserting()) {
                                composer2.s7N(function0N);
                            } else {
                                composer2.r();
                            }
                            Composer composerN = Updater.n(composer2);
                            Updater.O(composerN, measurePolicyUo, companion.t());
                            Updater.O(composerN, compositionLocalMapIk, companion.O());
                            Function2 function2Rl = companion.rl();
                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                            }
                            Updater.O(composerN, modifierO, companion.nr());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                            ComposableInvoker.f33936n.Uo(str3, str4, composer2, objArr3[mutableIntState2.J2()]);
                            composer2.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                            n(paddingValues, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer, 54), composer, 196608, 12582912, 131039);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }), 1, null);
        } else {
            ComponentActivityKt.rl(this, null, ComposableLambdaKt.rl(-1901447514, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    n(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer, int i2) {
                    if (!composer.HI((i2 & 3) != 2, i2 & 1)) {
                        composer.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1901447514, i2, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:128)");
                    }
                    ComposableInvoker composableInvoker = ComposableInvoker.f33936n;
                    String str = className;
                    String str2 = methodName;
                    Object[] objArr = objArrJ2;
                    composableInvoker.Uo(str, str2, composer, Arrays.copyOf(objArr, objArr.length));
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }), 1, null);
        }
    }
}
