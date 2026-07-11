package androidx.compose.runtime;

import GJW.Lu;
import GJW.cA;
import GJW.g9s;
import GJW.vd;
import GJW.xuv;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a2\u0010\u000b\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a<\u0010\u000e\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a@\u0010\u0012\u001a\u00020\u00012\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0010\"\u0004\u0018\u00010\u00052\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a8\u0010\u0018\u001a\u00020\u00012'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0014¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aB\u0010\u001a\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0014¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aL\u0010\u001c\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0014¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aP\u0010\u001e\u001a\u00020\u00012\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0010\"\u0004\u0018\u00010\u00052'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0014¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001f\u0010$\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b$\u0010%\"\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&¨\u0006("}, d2 = {"Lkotlin/Function0;", "", "effect", "KN", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "key1", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectScope;", "Landroidx/compose/runtime/DisposableEffectResult;", "Lkotlin/ExtensionFunctionType;", "rl", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key2", c.f62177j, "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", IV8ValueMap.FUNCTION_KEYS, "t", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function2;", "LGJW/vd;", "Lkotlin/coroutines/Continuation;", "block", "J2", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "O", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "nr", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Uo", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/compose/runtime/Composer;", "composer", "mUb", "(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)LGJW/vd;", "Landroidx/compose/runtime/DisposableEffectScope;", "InternalDisposableEffectScope", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,561:1\n1247#2,6:562\n1247#2,6:568\n1247#2,6:574\n1247#2,6:584\n1247#2,6:590\n1247#2,6:596\n1247#2,6:602\n1247#2,6:612\n1247#2,6:618\n82#3,4:580\n82#3,4:608\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n*L\n150#1:562,6\n187#1:568,6\n225#1:574,6\n261#1:584,6\n319#1:590,6\n338#1:596,6\n357#1:602,6\n380#1:612,6\n559#1:618,6\n261#1:580,4\n380#1:608,4\n*E\n"})
public final class EffectsKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final DisposableEffectScope f30166n = new DisposableEffectScope();

    public static final vd mUb(CoroutineContext coroutineContext, Composer composer) {
        if (coroutineContext.get(xuv.nr) == null) {
            return new RememberedCoroutineScope(composer.ck(), coroutineContext);
        }
        g9s g9sVarRl = cA.rl(null, 1, null);
        g9sVarRl.n(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return Lu.n(g9sVarRl);
    }

    public static final void J2(final Function2 function2, Composer composer, final int i2) {
        boolean z2;
        Composer composerKN = composer.KN(-805415771);
        int i3 = i2 & 1;
        if (i3 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-805415771, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:300)");
            }
            throw new IllegalStateException("LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.");
        }
        composerKN.wTp();
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.EffectsKt$LaunchedEffect$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    EffectsKt.J2(function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final void KN(Function0 function0, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1288466761, i2, -1, "androidx.compose.runtime.SideEffect (Effects.kt:49)");
        }
        composer.aYN(function0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }

    public static final void O(Object obj, Function2 function2, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1179185413, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:316)");
        }
        CoroutineContext coroutineContextCk = composer.ck();
        boolean zP5 = composer.p5(obj);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = new LaunchedEffectImpl(coroutineContextCk, function2);
            composer.o(objIF);
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }

    public static final void Uo(Object[] objArr, Function2 function2, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-139560008, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:377)");
        }
        CoroutineContext coroutineContextCk = composer.ck();
        boolean zP5 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zP5 |= composer.p5(obj);
        }
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            composer.o(new LaunchedEffectImpl(coroutineContextCk, function2));
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }

    public static final void n(Object obj, Object obj2, Function1 function1, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1429097729, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:185)");
        }
        boolean zP5 = composer.p5(obj) | composer.p5(obj2);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = new DisposableEffectImpl(function1);
            composer.o(objIF);
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }

    public static final void nr(Object obj, Object obj2, Function2 function2, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(590241125, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:335)");
        }
        CoroutineContext coroutineContextCk = composer.ck();
        boolean zP5 = composer.p5(obj) | composer.p5(obj2);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = new LaunchedEffectImpl(coroutineContextCk, function2);
            composer.o(objIF);
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }

    public static final void rl(Object obj, Function1 function1, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1371986847, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:148)");
        }
        boolean zP5 = composer.p5(obj);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = new DisposableEffectImpl(function1);
            composer.o(objIF);
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }

    public static final void t(Object[] objArr, Function1 function1, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1307627122, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:259)");
        }
        boolean zP5 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zP5 |= composer.p5(obj);
        }
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            composer.o(new DisposableEffectImpl(function1));
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
