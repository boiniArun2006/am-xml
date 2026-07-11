package com.bendingspoons.secretmenu.ui.mainscreen;

import DSG.Wre;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.NavController;
import androidx.view.fragment.NavHostFragment;
import com.bendingspoons.secretmenu.ui.mainscreen.SecretMenuCustomFragment;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r4.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/bendingspoons/secretmenu/ui/mainscreen/SecretMenuCustomFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroidx/navigation/NavController;", "aYN", "()Landroidx/navigation/NavController;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", c.f62177j, "j", "secretmenu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSecretMenuCustomFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecretMenuCustomFragment.kt\ncom/bendingspoons/secretmenu/ui/mainscreen/SecretMenuCustomFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final class SecretMenuCustomFragment extends Fragment {

    static final class n implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre.w6 f51520n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ SecretMenuCustomFragment f51521t;

        static final class j implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Wre.w6 f51522n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ SecretMenuCustomFragment f51523t;

            /* JADX INFO: renamed from: com.bendingspoons.secretmenu.ui.mainscreen.SecretMenuCustomFragment$n$j$j, reason: collision with other inner class name */
            public /* synthetic */ class C0735j {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Wre.w6.j.values().length];
                    try {
                        iArr[Wre.w6.j.f1453n.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            j(Wre.w6 w6Var, SecretMenuCustomFragment secretMenuCustomFragment) {
                this.f51522n = w6Var;
                this.f51523t = secretMenuCustomFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit t(SecretMenuCustomFragment secretMenuCustomFragment, Wre.w6.j action) {
                Intrinsics.checkNotNullParameter(action, "action");
                if (C0735j.$EnumSwitchMapping$0[action.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                secretMenuCustomFragment.requireActivity().finish();
                return Unit.INSTANCE;
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
                    ComposerKt.p5(694224397, i2, -1, "com.bendingspoons.secretmenu.ui.mainscreen.SecretMenuCustomFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (SecretMenuCustomFragment.kt:42)");
                }
                Function3 function3O = this.f51522n.O();
                composer.eF(1180647375);
                boolean zP5 = composer.p5(this.f51523t);
                final SecretMenuCustomFragment secretMenuCustomFragment = this.f51523t;
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1() { // from class: com.bendingspoons.secretmenu.ui.mainscreen.w6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SecretMenuCustomFragment.n.j.t(secretMenuCustomFragment, (Wre.w6.j) obj);
                        }
                    };
                    composer.o(objIF);
                }
                composer.Xw();
                function3O.invoke((Function1) objIF, composer, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        n(Wre.w6 w6Var, SecretMenuCustomFragment secretMenuCustomFragment) {
            this.f51520n = w6Var;
            this.f51521t = secretMenuCustomFragment;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void t(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(443266219, i2, -1, "com.bendingspoons.secretmenu.ui.mainscreen.SecretMenuCustomFragment.onCreateView.<anonymous> (SecretMenuCustomFragment.kt:32)");
            }
            Wre.w6 w6Var = this.f51520n;
            if (w6Var != null) {
                final SecretMenuCustomFragment secretMenuCustomFragment = this.f51521t;
                E14.n nVar = new E14.n(w6Var.rl() + " " + w6Var.nr(), true);
                Modifier modifierO = WindowInsetsPadding_androidKt.O(Modifier.INSTANCE);
                composer.eF(-231408036);
                boolean zP5 = composer.p5(secretMenuCustomFragment);
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: com.bendingspoons.secretmenu.ui.mainscreen.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SecretMenuCustomFragment.n.nr(secretMenuCustomFragment);
                        }
                    };
                    composer.o(objIF);
                }
                Function0 function0 = (Function0) objIF;
                composer.Xw();
                composer.eF(-231405853);
                boolean zP52 = composer.p5(secretMenuCustomFragment);
                Object objIF2 = composer.iF();
                if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function0() { // from class: com.bendingspoons.secretmenu.ui.mainscreen.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SecretMenuCustomFragment.n.O(secretMenuCustomFragment);
                        }
                    };
                    composer.o(objIF2);
                }
                composer.Xw();
                o.rl(modifierO, nVar, function0, (Function0) objIF2, ComposableLambdaKt.nr(694224397, true, new j(w6Var, secretMenuCustomFragment), composer, 54), composer, 24576, 0);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(SecretMenuCustomFragment secretMenuCustomFragment) {
            secretMenuCustomFragment.aYN().FX();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(SecretMenuCustomFragment secretMenuCustomFragment) {
            secretMenuCustomFragment.requireActivity().finish();
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        DSG.fuX fuxT = DSG.fuX.f1456n.t();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("customItemId") : null;
        if (string == null) {
            throw new IllegalStateException("Custom item id is null");
        }
        DSG.Wre wreRl = fuxT.rl(string);
        return VA.n.rl(this, null, null, ComposableLambdaKt.rl(443266219, true, new n(wreRl instanceof Wre.w6 ? (Wre.w6) wreRl : null, this)), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavController aYN() {
        Fragment fragmentXg = requireActivity().getSupportFragmentManager().xg(bH.w6.f43256n);
        Intrinsics.checkNotNull(fragmentXg, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        return ((NavHostFragment) fragmentXg).g();
    }
}
