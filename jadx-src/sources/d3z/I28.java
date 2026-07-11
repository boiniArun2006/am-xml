package d3z;

import DSG.Wre;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.compose.FlowExtKt;
import bH.CN3;
import com.safedk.android.analytics.brandsafety.b;
import d3z.I28;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class I28 {

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ YV.Wre f63388n;

        j(YV.Wre wre) {
            this.f63388n = wre;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1238998862, i2, -1, "com.bendingspoons.monopoly.secretmenu.registerMonopolyItems.<anonymous> (MonopolySecretMenuItemsProvider.kt:28)");
            }
            final State stateRl = FlowExtKt.rl(this.f63388n.KN(), Boolean.FALSE, null, null, null, composer, 48, 14);
            Modifier modifierXMQ = PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(2));
            boolean zT2 = t(stateRl);
            composer.eF(-2055719206);
            boolean zE2 = composer.E2(this.f63388n) | composer.p5(stateRl);
            final YV.Wre wre = this.f63388n;
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: d3z.Ml
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return I28.j.nr(wre, stateRl, ((Boolean) obj).booleanValue());
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            SwitchKt.n(zT2, (Function1) objIF, modifierXMQ, null, false, null, null, composer, RendererCapabilities.DECODER_SUPPORT_MASK, b.f61769v);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(YV.Wre wre, State state, boolean z2) {
            wre.ck(Boolean.valueOf(!t(state)));
            return Unit.INSTANCE;
        }

        private static final boolean t(State state) {
            return ((Boolean) state.getValue()).booleanValue();
        }
    }

    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f63389O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f63390n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ YV.Wre f63391t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(YV.Wre wre, Context context, Continuation continuation) {
            super(1, continuation);
            this.f63391t = wre;
            this.f63389O = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new n(this.f63391t, this.f63389O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f63390n == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f63391t.n().getValue() == null) {
                    str = "Nothing to restore.";
                } else {
                    this.f63391t.ck(null);
                    str = "Success.";
                }
                Toast.makeText(this.f63389O, str, 0).show();
                return Wre.j.EnumC0054j.f1447n;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class w6 implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ YV.Wre f63392n;

        w6(YV.Wre wre) {
            this.f63392n = wre;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((Function1) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Function1 it, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1326286259, i2, -1, "com.bendingspoons.monopoly.secretmenu.registerMonopolyItems.<anonymous> (MonopolySecretMenuItemsProvider.kt:57)");
            }
            QJ.ck(this.f63392n, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void n(bH.CN3 cn3, Context context, YV.Wre monopoly) {
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(monopoly, "monopoly");
        cn3.n(CN3.I28.f43224n, new Wre.Ml("Monetization", "💸", null, CollectionsKt.listOf((Object[]) new DSG.Wre[]{new Wre.n("Force isPremium", "💸", null, ComposableLambdaKt.rl(1238998862, true, new j(monopoly)), 4, null), new Wre.j("Restore isPremium", "💸", null, new n(monopoly, context, null), 4, null), new Wre.w6("Active purchases", "💰", "See active purchases, manage subscriptions, and revoke refunded one-time purchases.", ComposableLambdaKt.rl(-1326286259, true, new w6(monopoly)))}), 4, null));
    }
}
