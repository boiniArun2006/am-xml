package com.alightcreative.template.importpreview.ui;

import E.qz;
import E.rv6;
import GJW.vd;
import HI0.M5;
import HI0.Zs;
import HI0.afx;
import HI0.lej;
import QmE.iF;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.os.BundleKt;
import androidx.core.view.WindowCompat;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import androidx.view.OnBackPressedCallback;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.ComponentActivityKt;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.PickVisualMediaRequestKt;
import androidx.view.result.contract.ActivityResultContracts;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import com.alightcreative.app.motion.activities.EditActivity;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.template.importpreview.ui.C;
import com.alightcreative.template.importpreview.ui.CN3;
import com.alightcreative.template.importpreview.ui.Dsr;
import com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity;
import com.alightcreative.template.importpreview.ui.w6;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.utils.Logger;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 I2\u00020\u0001:\u0001JB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\"\u0010\u0011J\u000f\u0010#\u001a\u00020\u0004H\u0014¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0003R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lcom/alightcreative/template/importpreview/ui/TemplateImportPreviewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "kSg", "tFV", "a63", "UhV", "mI", "tUK", "RQ", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "ER", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/alightcreative/template/importpreview/ui/Dsr;", "viewModel", "Landroidx/compose/material/ModalBottomSheetState;", "sheetState", "Jk", "(Lcom/alightcreative/template/importpreview/ui/Dsr;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/runtime/Composer;I)V", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "outState", "onSaveInstanceState", "onPause", "finish", "Lcom/alightcreative/template/importpreview/ui/Dsr$n;", "r", "Lcom/alightcreative/template/importpreview/ui/Dsr$n;", "How", "()Lcom/alightcreative/template/importpreview/ui/Dsr$n;", "setViewModelFactory", "(Lcom/alightcreative/template/importpreview/ui/Dsr$n;)V", "viewModelFactory", "o", "Lcom/alightcreative/template/importpreview/ui/Dsr;", "LQmE/iF;", "Z", "LQmE/iF;", "K", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LLM/Wre;", "S", "LLM/Wre;", "projectHolder", "g", "Landroidx/compose/material/ModalBottomSheetState;", "Lxr/j;", "E2", "Lxr/j;", "origin", "e", "Ljava/lang/String;", "projectPackageId", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/PickVisualMediaRequest;", "X", "Landroidx/activity/result/ActivityResultLauncher;", "pickMedia", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTemplateImportPreviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemplateImportPreviewActivity.kt\ncom/alightcreative/template/importpreview/ui/TemplateImportPreviewActivity\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 ContextUtil.kt\ncom/alightcreative/ext/ContextUtilKt\n*L\n1#1,371:1\n75#2:372\n557#3:373\n554#3,6:374\n1247#4,3:380\n1250#4,3:384\n1247#4,6:388\n555#5:383\n113#6:387\n93#7,3:394\n*S KotlinDebug\n*F\n+ 1 TemplateImportPreviewActivity.kt\ncom/alightcreative/template/importpreview/ui/TemplateImportPreviewActivity\n*L\n165#1:372\n166#1:373\n166#1:374,6\n166#1:380,3\n166#1:384,3\n197#1:388,6\n166#1:383\n179#1:387\n323#1:394,3\n*E\n"})
public final class TemplateImportPreviewActivity extends com.alightcreative.template.importpreview.ui.n {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private xr.j origin;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final LM.Wre projectHolder = new LM.Wre(this);

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher pickMedia = registerForActivityResult(new ActivityResultContracts.PickVisualMedia(), new ActivityResultCallback() { // from class: xr.n
        @Override // androidx.view.result.ActivityResultCallback
        public final void n(Object obj) {
            TemplateImportPreviewActivity.W(this.f75492n, (Uri) obj);
        }
    });

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public iF eventLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String projectPackageId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ModalBottomSheetState sheetState;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Dsr viewModel;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public Dsr.n viewModelFactory;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f46923N = 8;

    static final class CN3 implements Function2 {
        CN3() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(TemplateImportPreviewActivity templateImportPreviewActivity, OnBackPressedCallback BackPressHandler) {
            Intrinsics.checkNotNullParameter(BackPressHandler, "$this$BackPressHandler");
            templateImportPreviewActivity.ER();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean nr(TemplateImportPreviewActivity templateImportPreviewActivity, ModalBottomSheetValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == ModalBottomSheetValue.f22291n && templateImportPreviewActivity.viewModel != null) {
                Dsr dsr = templateImportPreviewActivity.viewModel;
                if (dsr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    dsr = null;
                }
                Dsr.nHg(dsr, false, 1, null);
            }
            return true;
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
                ComposerKt.p5(-375141428, i2, -1, "com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity.onCreate.<anonymous> (TemplateImportPreviewActivity.kt:128)");
            }
            TemplateImportPreviewActivity templateImportPreviewActivity = TemplateImportPreviewActivity.this;
            Dsr.j jVar = Dsr.HI;
            Dsr.n nVarHow = templateImportPreviewActivity.How();
            LM.Wre wre = TemplateImportPreviewActivity.this.projectHolder;
            String str = TemplateImportPreviewActivity.this.projectPackageId;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("projectPackageId");
                str = null;
            }
            xr.j jVar2 = TemplateImportPreviewActivity.this.origin;
            if (jVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("origin");
                jVar2 = null;
            }
            ViewModelProvider.Factory factoryN = jVar.n(nVarHow, wre, str, jVar2);
            composer.eF(297168033);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composer, LocalViewModelStoreOwner.f39077t);
            if (viewModelStoreOwnerT == null) {
                throw new IllegalStateException("Required value was null.");
            }
            uW.w6 w6Var = (uW.w6) new ViewModelProvider(viewModelStoreOwnerT, factoryN).n(Dsr.class);
            composer.eF(-589589419);
            Lifecycle lifecycleRegistry = ((LifecycleOwner) composer.ty(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycleRegistry();
            composer.eF(23938127);
            boolean zE2 = composer.E2(w6Var) | composer.E2(lifecycleRegistry);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new uW.Wre(w6Var, lifecycleRegistry, null);
                composer.o(objIF);
            }
            composer.Xw();
            EffectsKt.nr(w6Var, lifecycleRegistry, (Function2) objIF, composer, 0);
            composer.Xw();
            composer.Xw();
            templateImportPreviewActivity.viewModel = (Dsr) w6Var;
            ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.f22291n;
            composer.eF(988062033);
            boolean zE22 = composer.E2(TemplateImportPreviewActivity.this);
            final TemplateImportPreviewActivity templateImportPreviewActivity2 = TemplateImportPreviewActivity.this;
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function1() { // from class: com.alightcreative.template.importpreview.ui.I28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(TemplateImportPreviewActivity.CN3.nr(templateImportPreviewActivity2, (ModalBottomSheetValue) obj));
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            ModalBottomSheetState modalBottomSheetStateMUb = ModalBottomSheetKt.mUb(modalBottomSheetValue, null, (Function1) objIF2, true, composer, 3078, 2);
            TemplateImportPreviewActivity.this.sheetState = modalBottomSheetStateMUb;
            TemplateImportPreviewActivity templateImportPreviewActivity3 = TemplateImportPreviewActivity.this;
            Dsr dsr = templateImportPreviewActivity3.viewModel;
            if (dsr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                dsr = null;
            }
            templateImportPreviewActivity3.Jk(dsr, modalBottomSheetStateMUb, composer, ModalBottomSheetState.f22280O << 3);
            composer.eF(988079677);
            boolean zE23 = composer.E2(TemplateImportPreviewActivity.this);
            final TemplateImportPreviewActivity templateImportPreviewActivity4 = TemplateImportPreviewActivity.this;
            Object objIF3 = composer.iF();
            if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function1() { // from class: com.alightcreative.template.importpreview.ui.Wre
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TemplateImportPreviewActivity.CN3.O(templateImportPreviewActivity4, (OnBackPressedCallback) obj);
                    }
                };
                composer.o(objIF3);
            }
            composer.Xw();
            N.I28.O(null, (Function1) objIF3, composer, 0, 1);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ TemplateImportPreviewActivity f46939O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ C f46940n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Dsr f46941t;

        /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
            j(Object obj) {
                super(0, obj, Dsr.class, "onCloseTrimButtonClicked", "onCloseTrimButtonClicked()V", 0);
            }

            public final void n() {
                ((Dsr) this.receiver).Z();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        n(C c2, Dsr dsr, TemplateImportPreviewActivity templateImportPreviewActivity) {
            this.f46940n = c2;
            this.f46941t = dsr;
            this.f46939O = templateImportPreviewActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            rl((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(ColumnScope ModalBottomSheetLayout, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(2112892926, i2, -1, "com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity.TemplateImportPreviewActivityContent.<anonymous> (TemplateImportPreviewActivity.kt:172)");
            }
            C.j jVar = (C.j) this.f46940n;
            Dsr dsr = this.f46941t;
            composer.eF(-1450537903);
            boolean zE2 = composer.E2(dsr);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(dsr);
                composer.o(objIF);
            }
            composer.Xw();
            Function0 function0 = (Function0) ((KFunction) objIF);
            composer.eF(-1450534998);
            boolean zE22 = composer.E2(this.f46941t) | composer.E2(this.f46939O);
            final Dsr dsr2 = this.f46941t;
            final TemplateImportPreviewActivity templateImportPreviewActivity = this.f46939O;
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0() { // from class: com.alightcreative.template.importpreview.ui.Ml
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TemplateImportPreviewActivity.n.t(dsr2, templateImportPreviewActivity);
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            rv6.t(jVar, function0, (Function0) objIF2, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Dsr dsr, TemplateImportPreviewActivity templateImportPreviewActivity) {
            Context applicationContext = templateImportPreviewActivity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            dsr.S(applicationContext);
            return Unit.INSTANCE;
        }
    }

    static final class w6 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ C f46942n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Dsr f46943t;

        /* synthetic */ class I28 extends FunctionReferenceImpl implements Function0 {
            I28(Object obj) {
                super(0, obj, Dsr.class, "onTextureCropButtonClicked", "onTextureCropButtonClicked()V", 0);
            }

            public final void n() {
                ((Dsr) this.receiver).fD();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class Ml extends FunctionReferenceImpl implements Function0 {
            Ml(Object obj) {
                super(0, obj, Dsr.class, "onReplaceMediaTooltipDismissed", "onReplaceMediaTooltipDismissed()V", 0);
            }

            public final void n() {
                ((Dsr) this.receiver).iF();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class Wre extends FunctionReferenceImpl implements Function0 {
            Wre(Object obj) {
                super(0, obj, Dsr.class, "onCropTooltipDismissed", "onCropTooltipDismissed()V", 0);
            }

            public final void n() {
                ((Dsr) this.receiver).WPU();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
            j(Object obj) {
                super(1, obj, Dsr.class, "onMediaClicked", "onMediaClicked(I)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void n(int i2) {
                ((Dsr) this.receiver).ViF(i2);
            }
        }

        /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
            n(Object obj) {
                super(0, obj, Dsr.class, "onCloseButtonClicked", "onCloseButtonClicked()V", 0);
            }

            public final void n() {
                ((Dsr) this.receiver).o();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity$w6$w6, reason: collision with other inner class name */
        /* synthetic */ class C0682w6 extends FunctionReferenceImpl implements Function0 {
            C0682w6(Object obj) {
                super(0, obj, Dsr.class, "onNextButtonClicked", "onNextButtonClicked()V", 0);
            }

            public final void n() {
                ((Dsr) this.receiver).nY();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        w6(C c2, Dsr dsr) {
            this.f46942n = c2;
            this.f46943t = dsr;
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
                ComposerKt.p5(897364407, i2, -1, "com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity.TemplateImportPreviewActivityContent.<anonymous> (TemplateImportPreviewActivity.kt:181)");
            }
            C.j jVar = (C.j) this.f46942n;
            Dsr dsr = this.f46943t;
            composer.eF(-1450521977);
            boolean zE2 = composer.E2(dsr);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(dsr);
                composer.o(objIF);
            }
            composer.Xw();
            Function1 function1 = (Function1) ((KFunction) objIF);
            Dsr dsr2 = this.f46943t;
            composer.eF(-1450519603);
            boolean zE22 = composer.E2(dsr2);
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new n(dsr2);
                composer.o(objIF2);
            }
            composer.Xw();
            Function0 function0 = (Function0) ((KFunction) objIF2);
            Dsr dsr3 = this.f46943t;
            composer.eF(-1450517076);
            boolean zE23 = composer.E2(dsr3);
            Object objIF3 = composer.iF();
            if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new C0682w6(dsr3);
                composer.o(objIF3);
            }
            composer.Xw();
            Function0 function02 = (Function0) ((KFunction) objIF3);
            Dsr dsr4 = this.f46943t;
            composer.eF(-1450514217);
            boolean zE24 = composer.E2(dsr4);
            Object objIF4 = composer.iF();
            if (zE24 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new Ml(dsr4);
                composer.o(objIF4);
            }
            composer.Xw();
            Function0 function03 = (Function0) ((KFunction) objIF4);
            Dsr dsr5 = this.f46943t;
            composer.eF(-1450511149);
            boolean zE25 = composer.E2(dsr5);
            Object objIF5 = composer.iF();
            if (zE25 || objIF5 == Composer.INSTANCE.n()) {
                objIF5 = new I28(dsr5);
                composer.o(objIF5);
            }
            composer.Xw();
            Function0 function04 = (Function0) ((KFunction) objIF5);
            Dsr dsr6 = this.f46943t;
            composer.eF(-1450508337);
            boolean zE26 = composer.E2(dsr6);
            Object objIF6 = composer.iF();
            if (zE26 || objIF6 == Composer.INSTANCE.n()) {
                objIF6 = new Wre(dsr6);
                composer.o(objIF6);
            }
            composer.Xw();
            qz.nr(jVar, function1, function0, function02, function03, function04, (Function0) ((KFunction) objIF6), composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    private final void i() {
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qm(TemplateImportPreviewActivity templateImportPreviewActivity, Dsr dsr, ModalBottomSheetState modalBottomSheetState, int i2, Composer composer, int i3) {
        templateImportPreviewActivity.Jk(dsr, modalBottomSheetState, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46933n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetState f46934t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
            super(2, continuation);
            this.f46934t = modalBottomSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new I28(this.f46934t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46933n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ModalBottomSheetState modalBottomSheetState = this.f46934t;
                this.f46933n = 1;
                if (modalBottomSheetState.xMQ(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46935n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetState f46936t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
            super(2, continuation);
            this.f46936t = modalBottomSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Ml(this.f46936t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46935n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ModalBottomSheetState modalBottomSheetState = this.f46936t;
                this.f46935n = 1;
                if (modalBottomSheetState.qie(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46937n;

        Wre(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TemplateImportPreviewActivity.this.new Wre(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46937n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SceneHolder sceneHolderKN = TemplateImportPreviewActivity.this.projectHolder.KN();
                TemplateImportPreviewActivity templateImportPreviewActivity = TemplateImportPreviewActivity.this;
                this.f46937n = 1;
                if (LM.Dsr.O(sceneHolderKN, templateImportPreviewActivity, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ER() {
        if (this.viewModel == null) {
            i();
            return;
        }
        ModalBottomSheetState modalBottomSheetState = this.sheetState;
        Dsr dsr = null;
        if (modalBottomSheetState == null || !modalBottomSheetState.gh()) {
            Dsr dsr2 = this.viewModel;
            if (dsr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                dsr = dsr2;
            }
            dsr.o();
            return;
        }
        Dsr dsr3 = this.viewModel;
        if (dsr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            dsr = dsr3;
        }
        dsr.Z();
    }

    private final void RQ() {
        Dsr dsr = this.viewModel;
        if (dsr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            dsr = null;
        }
        dsr.g();
        Pair[] pairArr = {TuplesKt.to("projectID", this.projectHolder.Uo().toString())};
        Intent intent = new Intent(this, (Class<?>) EditActivity.class);
        intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr, 1)));
        Intent intentAddFlags = intent.addFlags(335544320);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intentAddFlags);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Rl(Context context, TemplateImportPreviewActivity templateImportPreviewActivity, vd vdVar, ModalBottomSheetState modalBottomSheetState, com.alightcreative.template.importpreview.ui.CN3 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof CN3.I28) {
            afx.iF(context, 0L, 1, null);
        } else if (action instanceof CN3.Wre) {
            templateImportPreviewActivity.kSg();
        } else if (Intrinsics.areEqual(action, CN3.Dsr.f46910n)) {
            templateImportPreviewActivity.mI();
        } else if (Intrinsics.areEqual(action, CN3.Ml.f46912n)) {
            templateImportPreviewActivity.tUK();
        } else if (Intrinsics.areEqual(action, CN3.C0680CN3.f46909n)) {
            templateImportPreviewActivity.RQ();
        } else if (Intrinsics.areEqual(action, CN3.w6.f46917n)) {
            GJW.C.nr(vdVar, null, null, new Ml(modalBottomSheetState, null), 3, null);
        } else if (Intrinsics.areEqual(action, CN3.n.f46916n)) {
            GJW.C.nr(vdVar, null, null, new I28(modalBottomSheetState, null), 3, null);
        } else if (Intrinsics.areEqual(action, CN3.fuX.f46914n)) {
            templateImportPreviewActivity.a63();
        } else {
            if (!Intrinsics.areEqual(action, CN3.j.f46915n)) {
                throw new NoWhenBranchMatchedException();
            }
            templateImportPreviewActivity.UhV();
        }
        return Unit.INSTANCE;
    }

    private final void UhV() {
        String string = this.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        GWY.j.t(this, string);
        Dsr dsr = this.viewModel;
        if (dsr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            dsr = null;
        }
        dsr.XQ();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(TemplateImportPreviewActivity templateImportPreviewActivity, Uri uri) {
        if (uri != null) {
            Dsr dsr = templateImportPreviewActivity.viewModel;
            Dsr dsr2 = null;
            if (dsr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                dsr = null;
            }
            com.alightcreative.template.importpreview.ui.w6 w6VarCk = dsr.ck(templateImportPreviewActivity, uri);
            if (w6VarCk instanceof w6.j) {
                Dsr dsr3 = templateImportPreviewActivity.viewModel;
                if (dsr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    dsr2 = dsr3;
                }
                w6.j jVar = (w6.j) w6VarCk;
                long jRl = jVar.rl();
                long jN = jVar.n();
                Context applicationContext = templateImportPreviewActivity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                dsr2.T(jRl, jN, applicationContext, uri);
                return;
            }
            if (Intrinsics.areEqual(w6VarCk, w6.C0683w6.f46952n)) {
                templateImportPreviewActivity.tFV();
                Dsr dsr4 = templateImportPreviewActivity.viewModel;
                if (dsr4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    dsr4 = null;
                }
                Context applicationContext2 = templateImportPreviewActivity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                Dsr.e(dsr4, applicationContext2, uri, 0L, 4, null);
                return;
            }
            if (!Intrinsics.areEqual(w6VarCk, w6.n.f46951n)) {
                throw new NoWhenBranchMatchedException();
            }
            Dsr dsr5 = templateImportPreviewActivity.viewModel;
            if (dsr5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                dsr5 = null;
            }
            Context applicationContext3 = templateImportPreviewActivity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
            Dsr.e(dsr5, applicationContext3, uri, 0L, 4, null);
        }
    }

    private final void a63() {
        new AlertDialog.Builder(this).setTitle(2132020298).setMessage(2132020295).setPositiveButton(2132020296, new DialogInterface.OnClickListener() { // from class: xr.CN3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                TemplateImportPreviewActivity.F(dialogInterface, i2);
            }
        }).setNegativeButton(2132020297, new DialogInterface.OnClickListener() { // from class: xr.fuX
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                TemplateImportPreviewActivity.QZ6(this.f75488n, dialogInterface, i2);
            }
        }).create().show();
    }

    private final void kSg() {
        this.pickMedia.n(PickVisualMediaRequestKt.rl(ActivityResultContracts.PickVisualMedia.ImageAndVideo.f13379n, 0, false, null, 14, null));
    }

    private final void mI() {
        new AlertDialog.Builder(this).setTitle(2132020302).setMessage(2132020299).setPositiveButton(2132020300, new DialogInterface.OnClickListener() { // from class: xr.Dsr
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                TemplateImportPreviewActivity.Bu(dialogInterface, i2);
            }
        }).setNegativeButton(2132020301, new DialogInterface.OnClickListener() { // from class: xr.aC
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                TemplateImportPreviewActivity.T3L(this.f75487n, dialogInterface, i2);
            }
        }).create().show();
    }

    private final void tFV() {
        new AlertDialog.Builder(this).setTitle(2132020309).setMessage(2132020308).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: xr.Wre
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                TemplateImportPreviewActivity.VwL(dialogInterface, i2);
            }
        }).create().show();
    }

    private final void tUK() {
        Dsr dsr = this.viewModel;
        String str = null;
        if (dsr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            dsr = null;
        }
        dsr.g();
        Intent intent = new Intent();
        Pair pair = TuplesKt.to("projectID", this.projectHolder.Uo().toString());
        String str2 = this.projectPackageId;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("projectPackageId");
        } else {
            str = str2;
        }
        setResult(-1, intent.putExtras(BundleKt.n(pair, TuplesKt.to("projectPackageID", str))));
        finish();
    }

    public final Dsr.n How() {
        Dsr.n nVar = this.viewModelFactory;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final void Jk(Dsr viewModel, final ModalBottomSheetState sheetState, Composer composer, final int i2) {
        int i3;
        final Context context;
        int i5;
        vd vdVar;
        boolean z2;
        boolean z3;
        final Dsr dsr;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Composer composerKN = composer.KN(480797912);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(viewModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerKN.p5(sheetState) : composerKN.E2(sheetState) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(this) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            dsr = viewModel;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(480797912, i3, -1, "com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity.TemplateImportPreviewActivityContent (TemplateImportPreviewActivity.kt:163)");
            }
            Context context2 = (Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo());
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                composerKN.o(objIF);
            }
            vd vdVar2 = (vd) objIF;
            C c2 = (C) LiveDataAdapterKt.n(viewModel.t(), composerKN, 0).getValue();
            composerKN.eF(-501703459);
            if (c2 instanceof C.j) {
                float f3 = 20;
                i5 = i3;
                z2 = false;
                z3 = true;
                context = context2;
                vdVar = vdVar2;
                ModalBottomSheetKt.rl(ComposableLambdaKt.nr(2112892926, true, new n(c2, viewModel, this), composerKN, 54), null, sheetState, false, RoundedCornerShapeKt.O(Dp.KN(f3), Dp.KN(f3), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, aD.w6.iF(), ComposableLambdaKt.nr(897364407, true, new w6(c2, viewModel), composerKN, 54), composerKN, (ModalBottomSheetState.f22280O << 6) | 905969670 | ((i3 << 3) & 896), 234);
            } else {
                context = context2;
                i5 = i3;
                vdVar = vdVar2;
                z2 = false;
                z3 = true;
            }
            composerKN.Xw();
            composerKN.eF(-501655803);
            final vd vdVar3 = vdVar;
            boolean zE2 = composerKN.E2(context) | composerKN.E2(this) | composerKN.E2(vdVar3) | (((i5 & 112) == 32 || ((i5 & 64) != 0 && composerKN.E2(sheetState))) ? z3 : z2);
            Object objIF2 = composerKN.iF();
            if (zE2 || objIF2 == companion.n()) {
                objIF2 = new Function1() { // from class: xr.Ml
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TemplateImportPreviewActivity.Rl(context, this, vdVar3, sheetState, (com.alightcreative.template.importpreview.ui.CN3) obj);
                    }
                };
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            dsr = viewModel;
            uW.I28.rl(dsr, (Function1) objIF2, composerKN, i5 & 14);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: xr.I28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TemplateImportPreviewActivity.qm(this.f75479n, dsr, sheetState, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final iF K() {
        iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    @Override // android.app.Activity
    public void finish() {
        Dsr dsr = this.viewModel;
        if (dsr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            dsr = null;
        }
        dsr.aYN();
        super.finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Dsr dsr = this.viewModel;
        if (dsr != null) {
            if (dsr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                dsr = null;
            }
            dsr.te();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (requestCode == 1) {
            Zs.t(K(), !(grantResults.length == 0) && grantResults[0] == 0, rWZ.fuX.f73090r, new String[]{this.projectHolder.Uo().toString()}, null, null, new Function0() { // from class: xr.w6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TemplateImportPreviewActivity.lLA(this.f75494n);
                }
            }, 48, null);
        } else {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.projectHolder.gh(outState, isFinishing());
        super.onSaveInstanceState(outState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bu(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void QZ6(TemplateImportPreviewActivity templateImportPreviewActivity, DialogInterface dialogInterface, int i2) {
        templateImportPreviewActivity.UhV();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3L(TemplateImportPreviewActivity templateImportPreviewActivity, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        templateImportPreviewActivity.RQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VwL(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lLA(TemplateImportPreviewActivity templateImportPreviewActivity) {
        templateImportPreviewActivity.kSg();
        return Unit.INSTANCE;
    }

    @Override // com.alightcreative.template.importpreview.ui.n, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.projectHolder.mUb(savedInstanceState, getIntent());
        GJW.aC.rl(null, new Wre(null), 1, null);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        xr.j jVar = (xr.j) lej.n(intent, "template_editor_origin", xr.j.class);
        if (jVar != null) {
            this.origin = jVar;
            String stringExtra = getIntent().getStringExtra("projectPackageID");
            if (stringExtra == null) {
                stringExtra = "lost_template_pp_id";
            }
            this.projectPackageId = stringExtra;
            WindowCompat.rl(getWindow(), false);
            Window window = getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            M5.n(window, 0, getColor(2131099665), true);
            ComponentActivityKt.rl(this, null, ComposableLambdaKt.rl(-375141428, true, new CN3()), 1, null);
            return;
        }
        throw new IllegalArgumentException("Intent to open TemplateImportPreviewActivity missing TEMPLATE_EDITOR_ORIGIN_TAG extra.");
    }
}
