package uW;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.view.FlowLiveDataConversions;
import androidx.view.LifecycleOwner;
import androidx.view.Observer;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class I28 {

    static final class j implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f74419n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ w6 f74420t;

        j(Function1 function1, w6 w6Var) {
            this.f74419n = function1;
            this.f74420t = w6Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((List) obj);
            return Unit.INSTANCE;
        }

        public final void n(List list) {
            Intrinsics.checkNotNull(list);
            Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) list);
            if (objFirstOrNull != null) {
                Function1 function1 = this.f74419n;
                w6 w6Var = this.f74420t;
                function1.invoke(objFirstOrNull);
                w6Var.J2();
            }
        }
    }

    static final class n implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final /* synthetic */ Function1 f74421n;

        n(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f74421n = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f74421n;
        }

        @Override // androidx.view.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f74421n.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final void nr(w6 w6Var, LifecycleOwner lifecycleOwner, Function1 executeAction) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(executeAction, "executeAction");
        w6Var.rl().mUb(lifecycleOwner, new n(new j(executeAction, w6Var)));
    }

    public static final void rl(final w6 w6Var, final Function1 executeAction, Composer composer, final int i2) {
        int i3;
        Object objFirstOrNull;
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        Intrinsics.checkNotNullParameter(executeAction, "executeAction");
        Composer composerKN = composer.KN(2018668108);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(w6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(executeAction) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(2018668108, i3, -1, "com.alightcreative.common.framework.ObserveActions (ViewModelExtensions.kt:19)");
            }
            List list = (List) SnapshotStateKt.n(FlowLiveDataConversions.n(w6Var.rl()), null, null, composerKN, 48, 2).getValue();
            if (list != null && (objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) list)) != null) {
                executeAction.invoke(objFirstOrNull);
                w6Var.J2();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: uW.Ml
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I28.t(w6Var, executeAction, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(w6 w6Var, Function1 function1, int i2, Composer composer, int i3) {
        rl(w6Var, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
