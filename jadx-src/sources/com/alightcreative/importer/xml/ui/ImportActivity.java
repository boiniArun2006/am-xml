package com.alightcreative.importer.xml.ui;

import D.I28;
import P1.GLd.KDyatQ;
import android.os.Bundle;
import android.widget.Toast;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.view.ComponentActivity;
import androidx.view.ViewModelLazy;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStore;
import androidx.view.viewmodel.CreationExtras;
import com.alightcreative.importer.xml.ui.ImportActivity;
import com.alightcreative.importer.xml.ui.Ml;
import com.alightcreative.importer.xml.ui.n;
import java.lang.reflect.InvocationTargetException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\n\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/alightcreative/importer/xml/ui/ImportActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/alightcreative/importer/xml/ui/w6;", "viewModel", "C", "(Lcom/alightcreative/importer/xml/ui/w6;Landroidx/compose/runtime/Composer;I)V", "r", "Lkotlin/Lazy;", "fcU", "()Lcom/alightcreative/importer/xml/ui/w6;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImportActivity.kt\ncom/alightcreative/importer/xml/ui/ImportActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,64:1\n70#2,11:65\n1247#3,6:76\n*S KotlinDebug\n*F\n+ 1 ImportActivity.kt\ncom/alightcreative/importer/xml/ui/ImportActivity\n*L\n22#1:65,11\n50#1:76,6\n*E\n"})
public final class ImportActivity extends com.alightcreative.importer.xml.ui.j {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final Lazy viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(com.alightcreative.importer.xml.ui.w6.class), new w6(this), new n(this), new Ml(null, this));

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class Ml extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Function0 f46660n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f46661t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f46660n = function0;
            this.f46661t = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f46660n;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f46661t.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static final class j implements Function2 {
        public j() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-661888616, i2, -1, "com.alightcreative.importer.xml.ui.ImportActivity.onCreate.<anonymous> (ImportActivity.kt:29)");
            }
            ImportActivity importActivity = ImportActivity.this;
            importActivity.C(importActivity.fcU(), composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final class n extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f46663n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentActivity componentActivity) {
            super(0);
            this.f46663n = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return this.f46663n.getDefaultViewModelProviderFactory();
        }
    }

    public static final class w6 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f46664n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(ComponentActivity componentActivity) {
            super(0);
            this.f46664n = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f46664n.getViewModelStore();
        }
    }

    public static final Unit G7(ImportActivity importActivity, com.alightcreative.importer.xml.ui.w6 w6Var, int i2, Composer composer, int i3) {
        importActivity.C(w6Var, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    @Override // com.alightcreative.importer.xml.ui.j, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        KDyatQ.CpuCzIwfbrkdid.invoke(null, this, savedInstanceState);
    }

    public static final Unit Mx(ImportActivity importActivity, com.alightcreative.importer.xml.ui.n action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof n.C0663n) {
            n.C0663n c0663n = (n.C0663n) action;
            String strN = c0663n.n();
            if (strN == null) {
                strN = String.valueOf(c0663n.rl());
            }
            Toast.makeText(importActivity, strN, 1).show();
            importActivity.finish();
        } else {
            if (!(action instanceof n.j)) {
                throw new NoWhenBranchMatchedException();
            }
            Toast.makeText(importActivity, ((n.j) action).n(), 1).show();
            importActivity.finish();
        }
        return Unit.INSTANCE;
    }

    public final void C(final com.alightcreative.importer.xml.ui.w6 viewModel, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerKN = composer.KN(1509840832);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerKN.p5(viewModel) : composerKN.E2(viewModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(this) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1509840832, i3, -1, "com.alightcreative.importer.xml.ui.ImportActivity.ImportActivityContent (ImportActivity.kt:43)");
            }
            com.alightcreative.importer.xml.ui.Ml ml = (com.alightcreative.importer.xml.ui.Ml) LiveDataAdapterKt.n(viewModel.t(), composerKN, 0).getValue();
            composerKN.eF(930415975);
            if (ml instanceof Ml.j) {
                I28.rl(0.0f, false, composerKN, 0, 3);
            } else if (ml != null) {
                throw new NoWhenBranchMatchedException();
            }
            composerKN.Xw();
            composerKN.eF(930422449);
            boolean zE2 = composerKN.E2(this);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: C.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ImportActivity.Mx(this.f689n, (com.alightcreative.importer.xml.ui.n) obj);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            uW.I28.nr(viewModel, this, (Function1) objIF);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: C.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ImportActivity.G7(this.f691n, viewModel, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final com.alightcreative.importer.xml.ui.w6 fcU() {
        return (com.alightcreative.importer.xml.ui.w6) this.viewModel.getValue();
    }
}
