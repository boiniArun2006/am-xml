package com.alightcreative.maineditor.presetpreview.ui;

import Fg.afx;
import GJW.vd;
import HI0.M5;
import QmE.iF;
import Vil.C;
import Vil.FKk;
import Vil.mz;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.LazyListState;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.WindowCompat;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import androidx.view.OnBackPressedCallback;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.ComponentActivityKt;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity;
import com.alightcreative.maineditor.presetpreview.ui.Wre;
import com.alightcreative.maineditor.presetpreview.ui.aC;
import com.alightcreative.maineditor.presetpreview.ui.fuX;
import com.google.android.gms.ads.RequestConfiguration;
import e.C1960j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kP.InterfaceC2210n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import six.I28;
import zRY.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0001]B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0004R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\"\u0010[\u001a\u00020T8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010Z¨\u0006^"}, d2 = {"Lcom/alightcreative/maineditor/presetpreview/ui/PresetPreviewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "LPJ9/I28;", "<init>", "()V", "", "selectedPresetId", "", "showDeleteToast", "", "qm", "(Ljava/lang/String;Z)V", "Landroid/net/Uri;", "linkUri", "KN", "(Landroid/net/Uri;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/alightcreative/maineditor/presetpreview/ui/fuX;", "viewModel", "fcU", "(Lcom/alightcreative/maineditor/presetpreview/ui/fuX;Landroidx/compose/runtime/Composer;I)V", "onPause", "finish", "Lcom/alightcreative/maineditor/presetpreview/ui/fuX$n;", "r", "Lcom/alightcreative/maineditor/presetpreview/ui/fuX$n;", "EWS", "()Lcom/alightcreative/maineditor/presetpreview/ui/fuX$n;", "setViewModelFactory", "(Lcom/alightcreative/maineditor/presetpreview/ui/fuX$n;)V", "viewModelFactory", "LzRY/g9s$n;", "o", "LzRY/g9s$n;", "hRu", "()LzRY/g9s$n;", "setViewModelFactoryPremadeContent", "(LzRY/g9s$n;)V", "viewModelFactoryPremadeContent", "LQmE/iF;", "Z", "LQmE/iF;", "Org", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LkgE/fuX;", "S", "LkgE/fuX;", "GD", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LxAo/I28;", "g", "LxAo/I28;", "mYa", "()LxAo/I28;", "setCrisperManager", "(LxAo/I28;)V", "crisperManager", "LnYs/Ml;", "E2", "LnYs/Ml;", "HV", "()LnYs/Ml;", "setGetAlightSettingsUseCase", "(LnYs/Ml;)V", "getAlightSettingsUseCase", "LkP/n;", "e", "LkP/n;", "Po6", "()LkP/n;", "setInjet", "(LkP/n;)V", "injet", "X", "Lcom/alightcreative/maineditor/presetpreview/ui/fuX;", "LPJ9/Ml;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LPJ9/Ml;", "ViF", "()LPJ9/Ml;", "K", "(LPJ9/Ml;)V", "signInLauncher", "N", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPresetPreviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresetPreviewActivity.kt\ncom/alightcreative/maineditor/presetpreview/ui/PresetPreviewActivity\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,279:1\n557#2:280\n554#2,6:281\n1247#3,3:287\n1250#3,3:291\n1247#3,6:294\n1247#3,6:301\n555#4:290\n113#5:300\n1557#6:307\n1628#6,3:308\n*S KotlinDebug\n*F\n+ 1 PresetPreviewActivity.kt\ncom/alightcreative/maineditor/presetpreview/ui/PresetPreviewActivity\n*L\n147#1:280\n147#1:281,6\n147#1:287,3\n147#1:291,3\n153#1:294,6\n219#1:301,6\n147#1:290\n176#1:300\n102#1:307\n102#1:308,3\n*E\n"})
public final class PresetPreviewActivity extends j implements PJ9.I28 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f46683v = 8;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    public PJ9.Ml signInLauncher;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private com.alightcreative.maineditor.presetpreview.ui.fuX viewModel;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public iF eventLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public InterfaceC2210n injet;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public xAo.I28 crisperManager;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public g9s.n viewModelFactoryPremadeContent;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public fuX.n viewModelFactory;

    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetState f46694O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46695n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ I28.n f46696t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new I28(this.f46696t, this.f46694O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(I28.n nVar, ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
            super(2, continuation);
            this.f46696t = nVar;
            this.f46694O = modalBottomSheetState;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (r11.xMQ(r10) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            I28 i28;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46695n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                i28 = this;
            } else {
                ResultKt.throwOnFailure(obj);
                LazyListState lazyListStateGh = this.f46696t.gh();
                this.f46695n = 1;
                i28 = this;
                if (LazyListState.nHg(lazyListStateGh, 0, 0, i28, 2, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            ModalBottomSheetState modalBottomSheetState = i28.f46694O;
            i28.f46695n = 2;
        }
    }

    static final class Ml implements Function2 {
        final /* synthetic */ PresetPreviewActivity J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ I28.n f46697O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ com.alightcreative.maineditor.presetpreview.ui.aC f46698n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ com.alightcreative.maineditor.presetpreview.ui.fuX f46699t;

        /* synthetic */ class CN3 extends FunctionReferenceImpl implements Function1 {
            CN3(Object obj) {
                super(1, obj, com.alightcreative.maineditor.presetpreview.ui.fuX.class, "onSelect", "onSelect(Lcom/alightcreative/maineditor/presets/domain/entities/PresetData;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((C1960j) obj);
                return Unit.INSTANCE;
            }

            public final void n(C1960j p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((com.alightcreative.maineditor.presetpreview.ui.fuX) this.receiver).D(p0);
            }
        }

        /* synthetic */ class Dsr extends FunctionReferenceImpl implements Function1 {
            Dsr(Object obj) {
                super(1, obj, com.alightcreative.maineditor.presetpreview.ui.fuX.class, "onDeleteRequested", "onDeleteRequested(Lcom/alightcreative/maineditor/presets/domain/entities/PresetData;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((C1960j) obj);
                return Unit.INSTANCE;
            }

            public final void n(C1960j c1960j) {
                ((com.alightcreative.maineditor.presetpreview.ui.fuX) this.receiver).v(c1960j);
            }
        }

        /* synthetic */ class I28 extends FunctionReferenceImpl implements Function0 {
            I28(Object obj) {
                super(0, obj, com.alightcreative.maineditor.presetpreview.ui.fuX.class, "onDiscoverMoreClicked", "onDiscoverMoreClicked()V", 0);
            }

            public final void n() {
                ((com.alightcreative.maineditor.presetpreview.ui.fuX) this.receiver).bzg();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity$Ml$Ml, reason: collision with other inner class name */
        /* synthetic */ class C0665Ml extends FunctionReferenceImpl implements Function0 {
            C0665Ml(Object obj) {
                super(0, obj, com.alightcreative.maineditor.presetpreview.ui.fuX.class, "onApplyButtonTapped", "onApplyButtonTapped()V", 0);
            }

            public final void n() {
                ((com.alightcreative.maineditor.presetpreview.ui.fuX) this.receiver).e();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class Wre extends FunctionReferenceImpl implements Function1 {
            Wre(Object obj) {
                super(1, obj, com.alightcreative.maineditor.presetpreview.ui.fuX.class, "onPresetClicked", "onPresetClicked(Lcom/alightcreative/maineditor/presets/domain/entities/PresetData;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((C1960j) obj);
                return Unit.INSTANCE;
            }

            public final void n(C1960j p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((com.alightcreative.maineditor.presetpreview.ui.fuX) this.receiver).M(p0);
            }
        }

        /* synthetic */ class aC extends AdaptedFunctionReference implements Function0 {
            aC(Object obj) {
                super(0, obj, com.alightcreative.maineditor.presetpreview.ui.fuX.class, "onDeleteRequested", "onDeleteRequested(Lcom/alightcreative/maineditor/presets/domain/entities/PresetData;)V", 0);
            }

            public final void n() {
                com.alightcreative.maineditor.presetpreview.ui.fuX.rV9((com.alightcreative.maineditor.presetpreview.ui.fuX) this.receiver, null, 1, null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class fuX extends FunctionReferenceImpl implements Function1 {
            fuX(Object obj) {
                super(1, obj, com.alightcreative.maineditor.presetpreview.ui.fuX.class, "onRenameRequest", "onRenameRequest(Lcom/alightcreative/maineditor/presets/domain/entities/PresetData;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((C1960j) obj);
                return Unit.INSTANCE;
            }

            public final void n(C1960j p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((com.alightcreative.maineditor.presetpreview.ui.fuX) this.receiver).J(p0);
            }
        }

        /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
            j(Object obj) {
                super(0, obj, com.alightcreative.maineditor.presetpreview.ui.fuX.class, "onCloseButtonTapped", "onCloseButtonTapped()V", 0);
            }

            public final void n() {
                ((com.alightcreative.maineditor.presetpreview.ui.fuX) this.receiver).N();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
            n(Object obj) {
                super(0, obj, com.alightcreative.maineditor.presetpreview.ui.fuX.class, "onRenameCanceled", "onRenameCanceled()V", 0);
            }

            public final void n() {
                ((com.alightcreative.maineditor.presetpreview.ui.fuX) this.receiver).FX();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class w6 extends FunctionReferenceImpl implements Function0 {
            w6(Object obj) {
                super(0, obj, com.alightcreative.maineditor.presetpreview.ui.fuX.class, "onDeleteCanceled", "onDeleteCanceled()V", 0);
            }

            public final void n() {
                ((com.alightcreative.maineditor.presetpreview.ui.fuX) this.receiver).s7N();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        Ml(com.alightcreative.maineditor.presetpreview.ui.aC aCVar, com.alightcreative.maineditor.presetpreview.ui.fuX fux, I28.n nVar, PresetPreviewActivity presetPreviewActivity) {
            this.f46698n = aCVar;
            this.f46699t = fux;
            this.f46697O = nVar;
            this.J2 = presetPreviewActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(com.alightcreative.maineditor.presetpreview.ui.fuX fux, C1960j c1960j, String newTitle) {
            Intrinsics.checkNotNullParameter(newTitle, "newTitle");
            fux.B(c1960j, newTitle);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(com.alightcreative.maineditor.presetpreview.ui.fuX fux, PresetPreviewActivity presetPreviewActivity, C1960j it) {
            Intrinsics.checkNotNullParameter(it, "it");
            fux.Xw(it, presetPreviewActivity);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x0327  */
        /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0224  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x028f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void O(Composer composer, int i2) {
            Function0 function0;
            final C1960j c1960jJ2;
            final List listO;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-109898041, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity.PresetPreviewActivityContent.<anonymous> (PresetPreviewActivity.kt:177)");
            }
            aC.j jVar = (aC.j) this.f46698n;
            Object obj = this.f46699t;
            composer.eF(475107262);
            boolean zE2 = composer.E2(obj);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(obj);
                composer.o(objIF);
            }
            KFunction kFunction = (KFunction) objIF;
            composer.Xw();
            Object obj2 = this.f46699t;
            composer.eF(475109790);
            boolean zE22 = composer.E2(obj2);
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new C0665Ml(obj2);
                composer.o(objIF2);
            }
            KFunction kFunction2 = (KFunction) objIF2;
            composer.Xw();
            Object obj3 = this.f46699t;
            composer.eF(475112352);
            boolean zE23 = composer.E2(obj3);
            Object objIF3 = composer.iF();
            if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new I28(obj3);
                composer.o(objIF3);
            }
            KFunction kFunction3 = (KFunction) objIF3;
            composer.Xw();
            List listNr = ((aC.j) this.f46698n).nr();
            boolean z2 = !((aC.j) this.f46698n).nr().isEmpty();
            Object obj4 = this.f46699t;
            composer.eF(475119482);
            boolean zE24 = composer.E2(obj4);
            Object objIF4 = composer.iF();
            if (zE24 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new Wre(obj4);
                composer.o(objIF4);
            }
            KFunction kFunction4 = (KFunction) objIF4;
            composer.Xw();
            Object obj5 = this.f46699t;
            composer.eF(475121491);
            boolean zE25 = composer.E2(obj5);
            Object objIF5 = composer.iF();
            if (zE25 || objIF5 == Composer.INSTANCE.n()) {
                objIF5 = new CN3(obj5);
                composer.o(objIF5);
            }
            KFunction kFunction5 = (KFunction) objIF5;
            composer.Xw();
            Object obj6 = this.f46699t;
            composer.eF(475128154);
            boolean zE26 = composer.E2(obj6);
            Object objIF6 = composer.iF();
            if (zE26 || objIF6 == Composer.INSTANCE.n()) {
                objIF6 = new fuX(obj6);
                composer.o(objIF6);
            }
            KFunction kFunction6 = (KFunction) objIF6;
            composer.Xw();
            Object obj7 = this.f46699t;
            composer.eF(475130172);
            boolean zE27 = composer.E2(obj7);
            Object objIF7 = composer.iF();
            if (zE27 || objIF7 == Composer.INSTANCE.n()) {
                objIF7 = new Dsr(obj7);
                composer.o(objIF7);
            }
            KFunction kFunction7 = (KFunction) objIF7;
            composer.Xw();
            Object obj8 = this.f46699t;
            composer.eF(475132540);
            boolean zE28 = composer.E2(obj8);
            Object objIF8 = composer.iF();
            if (zE28 || objIF8 == Composer.INSTANCE.n()) {
                objIF8 = new aC(obj8);
                composer.o(objIF8);
            }
            Function0 function02 = (Function0) objIF8;
            composer.Xw();
            I28.n nVar = this.f46697O;
            Function0 function03 = (Function0) kFunction;
            Function0 function04 = (Function0) kFunction2;
            Function0 function05 = (Function0) kFunction3;
            Function1 function1 = (Function1) kFunction4;
            Function1 function12 = (Function1) kFunction5;
            composer.eF(475123296);
            boolean zE29 = composer.E2(this.f46699t) | composer.E2(this.J2);
            final com.alightcreative.maineditor.presetpreview.ui.fuX fux = this.f46699t;
            final PresetPreviewActivity presetPreviewActivity = this.J2;
            Object objIF9 = composer.iF();
            if (zE29 || objIF9 == Composer.INSTANCE.n()) {
                objIF9 = new Function1() { // from class: com.alightcreative.maineditor.presetpreview.ui.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        return PresetPreviewActivity.Ml.xMQ(fux, presetPreviewActivity, (C1960j) obj9);
                    }
                };
                composer.o(objIF9);
            }
            Function1 function13 = (Function1) objIF9;
            composer.Xw();
            composer.eF(475125797);
            boolean zE210 = composer.E2(this.f46699t) | composer.E2(this.J2);
            final com.alightcreative.maineditor.presetpreview.ui.fuX fux2 = this.f46699t;
            final PresetPreviewActivity presetPreviewActivity2 = this.J2;
            Object objIF10 = composer.iF();
            if (!zE210) {
                function0 = function05;
                if (objIF10 == Composer.INSTANCE.n()) {
                }
                composer.Xw();
                mz.mUb(jVar, nVar, function03, function04, function0, z2, listNr, function1, function12, function13, (Function0) objIF10, (Function1) kFunction6, (Function1) kFunction7, function02, composer, 0, 0, 0);
                c1960jJ2 = ((aC.j) this.f46698n).J2();
                composer.eF(475136225);
                if (c1960jJ2 != null) {
                    final com.alightcreative.maineditor.presetpreview.ui.fuX fux3 = this.f46699t;
                    String strO = c1960jJ2.O();
                    composer.eF(-1898154630);
                    boolean zE211 = composer.E2(fux3);
                    Object objIF11 = composer.iF();
                    if (zE211 || objIF11 == Composer.INSTANCE.n()) {
                        objIF11 = new n(fux3);
                        composer.o(objIF11);
                    }
                    composer.Xw();
                    Function0 function06 = (Function0) ((KFunction) objIF11);
                    composer.eF(-1898152249);
                    boolean zE212 = composer.E2(fux3) | composer.E2(c1960jJ2);
                    Object objIF12 = composer.iF();
                    if (zE212 || objIF12 == Composer.INSTANCE.n()) {
                        objIF12 = new Function1() { // from class: com.alightcreative.maineditor.presetpreview.ui.Ml
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                return PresetPreviewActivity.Ml.Uo(fux3, c1960jJ2, (String) obj9);
                            }
                        };
                        composer.o(objIF12);
                    }
                    composer.Xw();
                    FKk.t(strO, function06, (Function1) objIF12, composer, 0);
                    Unit unit = Unit.INSTANCE;
                }
                composer.Xw();
                listO = ((aC.j) this.f46698n).O();
                if (listO != null) {
                    com.alightcreative.maineditor.presetpreview.ui.aC aCVar = this.f46698n;
                    final com.alightcreative.maineditor.presetpreview.ui.fuX fux4 = this.f46699t;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listO, 10));
                    Iterator it = listO.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C1960j) it.next()).O());
                    }
                    boolean z3 = listO.size() == ((aC.j) aCVar).rl().size();
                    composer.eF(-1898134246);
                    boolean zE213 = composer.E2(fux4);
                    Object objIF13 = composer.iF();
                    if (zE213 || objIF13 == Composer.INSTANCE.n()) {
                        objIF13 = new w6(fux4);
                        composer.o(objIF13);
                    }
                    composer.Xw();
                    Function0 function07 = (Function0) ((KFunction) objIF13);
                    composer.eF(-1898132030);
                    boolean zE214 = composer.E2(fux4) | composer.E2(listO);
                    Object objIF14 = composer.iF();
                    if (zE214 || objIF14 == Composer.INSTANCE.n()) {
                        objIF14 = new Function0() { // from class: com.alightcreative.maineditor.presetpreview.ui.I28
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PresetPreviewActivity.Ml.KN(fux4, listO);
                            }
                        };
                        composer.o(objIF14);
                    }
                    composer.Xw();
                    C.rl(arrayList, z3, function07, (Function0) objIF14, composer, 0);
                }
                if (ComposerKt.v()) {
                    return;
                }
                ComposerKt.M7();
                return;
            }
            function0 = function05;
            objIF10 = new Function0() { // from class: com.alightcreative.maineditor.presetpreview.ui.w6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PresetPreviewActivity.Ml.J2(fux2, presetPreviewActivity2);
                }
            };
            composer.o(objIF10);
            composer.Xw();
            mz.mUb(jVar, nVar, function03, function04, function0, z2, listNr, function1, function12, function13, (Function0) objIF10, (Function1) kFunction6, (Function1) kFunction7, function02, composer, 0, 0, 0);
            c1960jJ2 = ((aC.j) this.f46698n).J2();
            composer.eF(475136225);
            if (c1960jJ2 != null) {
            }
            composer.Xw();
            listO = ((aC.j) this.f46698n).O();
            if (listO != null) {
            }
            if (ComposerKt.v()) {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            O((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(com.alightcreative.maineditor.presetpreview.ui.fuX fux, PresetPreviewActivity presetPreviewActivity) {
            fux.U(presetPreviewActivity);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit KN(com.alightcreative.maineditor.presetpreview.ui.fuX fux, List list) {
            fux.wTp(list);
            return Unit.INSTANCE;
        }
    }

    static final class fuX implements Function2 {
        final /* synthetic */ List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f46702O;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f46704o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f46705r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f46706t;

        fuX(List list, String str, List list2, long j2, boolean z2) {
            this.f46706t = list;
            this.f46702O = str;
            this.J2 = list2;
            this.f46705r = j2;
            this.f46704o = z2;
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
                ComposerKt.p5(-1259903014, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity.onCreate.<anonymous> (PresetPreviewActivity.kt:123)");
            }
            PresetPreviewActivity presetPreviewActivity = PresetPreviewActivity.this;
            ViewModelProvider.Factory factoryN = com.alightcreative.maineditor.presetpreview.ui.fuX.WPU.n(presetPreviewActivity.EWS(), this.f46706t, this.f46702O, this.J2, Long.valueOf(this.f46705r), this.f46704o);
            composer.eF(297168033);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composer, LocalViewModelStoreOwner.f39077t);
            if (viewModelStoreOwnerT == null) {
                throw new IllegalStateException("Required value was null.");
            }
            uW.w6 w6Var = (uW.w6) new ViewModelProvider(viewModelStoreOwnerT, factoryN).n(com.alightcreative.maineditor.presetpreview.ui.fuX.class);
            composer.eF(-589589419);
            Lifecycle lifecycleRegistry = ((LifecycleOwner) composer.ty(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycleRegistry();
            composer.eF(23938127);
            boolean zE2 = composer.E2(w6Var) | composer.E2(lifecycleRegistry);
            Object objIF = composer.iF();
            com.alightcreative.maineditor.presetpreview.ui.fuX fux = null;
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new uW.Wre(w6Var, lifecycleRegistry, null);
                composer.o(objIF);
            }
            composer.Xw();
            EffectsKt.nr(w6Var, lifecycleRegistry, (Function2) objIF, composer, 0);
            composer.Xw();
            composer.Xw();
            presetPreviewActivity.viewModel = (com.alightcreative.maineditor.presetpreview.ui.fuX) w6Var;
            PresetPreviewActivity presetPreviewActivity2 = PresetPreviewActivity.this;
            com.alightcreative.maineditor.presetpreview.ui.fuX fux2 = presetPreviewActivity2.viewModel;
            if (fux2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                fux = fux2;
            }
            presetPreviewActivity2.fcU(fux, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class w6 implements Function3 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ com.alightcreative.maineditor.presetpreview.ui.fuX f46710t;

        /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
            j(Object obj) {
                super(1, obj, com.alightcreative.maineditor.presetpreview.ui.fuX.class, "onPremadeItemClicked", "onPremadeItemClicked(Lcom/alightcreative/app/motion/premade/domain/entities/LocalizedPremadeContentItem;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((tN.n) obj);
                return Unit.INSTANCE;
            }

            public final void n(tN.n p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((com.alightcreative.maineditor.presetpreview.ui.fuX) this.receiver).E(p0);
            }
        }

        /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
            n(Object obj) {
                super(0, obj, com.alightcreative.maineditor.presetpreview.ui.fuX.class, "onCloseBottomSheetButtonClicked", "onCloseBottomSheetButtonClicked()V", 0);
            }

            public final void n() {
                ((com.alightcreative.maineditor.presetpreview.ui.fuX) this.receiver).T();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        w6(com.alightcreative.maineditor.presetpreview.ui.fuX fux) {
            this.f46710t = fux;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(ColumnScope ModalBottomSheetLayout, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1699603826, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity.PresetPreviewActivityContent.<anonymous> (PresetPreviewActivity.kt:167)");
            }
            g9s.n nVarHRu = PresetPreviewActivity.this.hRu();
            com.alightcreative.maineditor.presetpreview.ui.fuX fux = this.f46710t;
            composer.eF(475088287);
            boolean zE2 = composer.E2(fux);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(fux);
                composer.o(objIF);
            }
            composer.Xw();
            Function1 function1 = (Function1) ((KFunction) objIF);
            com.alightcreative.maineditor.presetpreview.ui.fuX fux2 = this.f46710t;
            composer.eF(475090986);
            boolean zE22 = composer.E2(fux2);
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new n(fux2);
                composer.o(objIF2);
            }
            composer.Xw();
            Vil.Dsr.rl(nVarHRu, function1, (Function0) ((KFunction) objIF2), composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n1(PresetPreviewActivity presetPreviewActivity, com.alightcreative.maineditor.presetpreview.ui.fuX fux, int i2, Composer composer, int i3) {
        presetPreviewActivity.fcU(fux, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    static final class CN3 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46692n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetState f46693t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
            super(2, continuation);
            this.f46693t = modalBottomSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new CN3(this.f46693t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46692n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ModalBottomSheetState modalBottomSheetState = this.f46693t;
                this.f46692n = 1;
                if (modalBottomSheetState.qie(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46700n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetState f46701t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
            super(2, continuation);
            this.f46701t = modalBottomSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Wre(this.f46701t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46700n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ModalBottomSheetState modalBottomSheetState = this.f46701t;
                this.f46700n = 1;
                if (modalBottomSheetState.xMQ(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46707n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetState f46708t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
            super(2, continuation);
            this.f46708t = modalBottomSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f46708t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46707n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ModalBottomSheetState modalBottomSheetState = this.f46708t;
                this.f46707n = 1;
                if (modalBottomSheetState.xMQ(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void KN(final Uri linkUri) {
        XoT.fuX.nY(this, new Function0() { // from class: yvM.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PresetPreviewActivity.UhV(linkUri, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UhV(Uri uri, final PresetPreviewActivity presetPreviewActivity) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        nYs.j jVarInvoke = presetPreviewActivity.HV().invoke();
        afx.ViF(presetPreviewActivity, intent, true, jVarInvoke != null && jVarInvoke.te(), presetPreviewActivity.Org(), presetPreviewActivity.GD(), presetPreviewActivity.mYa(), (64 & 64) != 0 ? false : false, new Function2() { // from class: yvM.I28
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PresetPreviewActivity.i(this.f76192n, (String) obj, (LM.aC) obj2);
            }
        }, presetPreviewActivity.Po6(), presetPreviewActivity.HV());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eWT(ModalBottomSheetState modalBottomSheetState, vd vdVar, com.alightcreative.maineditor.presetpreview.ui.fuX fux, OnBackPressedCallback BackPressHandler) {
        Intrinsics.checkNotNullParameter(BackPressHandler, "$this$BackPressHandler");
        if (modalBottomSheetState.gh()) {
            GJW.C.nr(vdVar, null, null, new n(modalBottomSheetState, null), 3, null);
        } else {
            fux.N();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(PresetPreviewActivity presetPreviewActivity, String str, LM.aC projectImportResult) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(projectImportResult, "projectImportResult");
        com.alightcreative.maineditor.presetpreview.ui.fuX fux = presetPreviewActivity.viewModel;
        if (fux == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fux = null;
        }
        List listNr = projectImportResult.nr();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listNr, 10));
        Iterator it = listNr.iterator();
        while (it.hasNext()) {
            String string = ((UUID) it.next()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList.add(string);
        }
        fux.p5(arrayList);
        return Unit.INSTANCE;
    }

    private final void qm(String selectedPresetId, boolean showDeleteToast) {
        Intent intent = new Intent();
        if (showDeleteToast) {
            intent.putExtra("showDeleteToast", true);
        }
        if (selectedPresetId != null) {
            intent.putExtra("selectedPresetID", selectedPresetId);
        }
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ul(PresetPreviewActivity presetPreviewActivity, vd vdVar, I28.n nVar, ModalBottomSheetState modalBottomSheetState, com.alightcreative.maineditor.presetpreview.ui.Wre action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof Wre.n) {
            Wre.n nVar2 = (Wre.n) action;
            presetPreviewActivity.qm(nVar2.n(), nVar2.rl());
        } else if (action instanceof Wre.w6) {
            Wre.w6 w6Var = (Wre.w6) action;
            gIX.Dsr.J2(presetPreviewActivity, w6Var.rl(), presetPreviewActivity.Org(), presetPreviewActivity.GD(), CollectionsKt.toMutableList((Collection) w6Var.n()));
        } else if (action instanceof Wre.Ml) {
            presetPreviewActivity.KN(((Wre.Ml) action).n());
        } else if (action instanceof Wre.C0666Wre) {
            GJW.C.nr(vdVar, null, null, new I28(nVar, modalBottomSheetState, null), 3, null);
        } else if (action instanceof Wre.j) {
            GJW.C.nr(vdVar, null, null, new Wre(modalBottomSheetState, null), 3, null);
        } else {
            if (!(action instanceof Wre.I28)) {
                throw new NoWhenBranchMatchedException();
            }
            GJW.C.nr(vdVar, null, null, new CN3(modalBottomSheetState, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public final fuX.n EWS() {
        fuX.n nVar = this.viewModelFactory;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final kgE.fuX GD() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public final nYs.Ml HV() {
        nYs.Ml ml = this.getAlightSettingsUseCase;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
        return null;
    }

    public void K(PJ9.Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<set-?>");
        this.signInLauncher = ml;
    }

    public final iF Org() {
        iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final InterfaceC2210n Po6() {
        InterfaceC2210n interfaceC2210n = this.injet;
        if (interfaceC2210n != null) {
            return interfaceC2210n;
        }
        Intrinsics.throwUninitializedPropertyAccessException("injet");
        return null;
    }

    @Override // PJ9.I28
    public PJ9.Ml ViF() {
        PJ9.Ml ml = this.signInLauncher;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("signInLauncher");
        return null;
    }

    public final void fcU(final com.alightcreative.maineditor.presetpreview.ui.fuX viewModel, Composer composer, final int i2) {
        int i3;
        int i5;
        final I28.n nVar;
        final vd vdVar;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerKN = composer.KN(1009494120);
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerKN.E2(viewModel) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(this) ? 32 : 16;
        }
        int i7 = i3;
        if ((i7 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1009494120, i7, -1, "com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity.PresetPreviewActivityContent (PresetPreviewActivity.kt:143)");
            }
            I28.n nVarRl = six.Wre.rl(composerKN, 0);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                composerKN.o(objIF);
            }
            final vd vdVar2 = (vd) objIF;
            final ModalBottomSheetState modalBottomSheetStateMUb = ModalBottomSheetKt.mUb(ModalBottomSheetValue.f22291n, null, null, true, composerKN, 3078, 6);
            composerKN.eF(1556794407);
            boolean zE2 = composerKN.E2(modalBottomSheetStateMUb) | composerKN.E2(vdVar2) | composerKN.E2(viewModel);
            Object objIF2 = composerKN.iF();
            if (zE2 || objIF2 == companion.n()) {
                objIF2 = new Function1() { // from class: yvM.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PresetPreviewActivity.eWT(modalBottomSheetStateMUb, vdVar2, viewModel, (OnBackPressedCallback) obj);
                    }
                };
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            N.I28.O(null, (Function1) objIF2, composerKN, 0, 1);
            aC aCVar = (aC) LiveDataAdapterKt.n(viewModel.t(), composerKN, 0).getValue();
            composerKN.eF(1556804775);
            if (aCVar instanceof aC.j) {
                float f3 = 12;
                i5 = i7;
                vdVar = vdVar2;
                nVar = nVarRl;
                ModalBottomSheetKt.rl(ComposableLambdaKt.nr(-1699603826, true, new w6(viewModel), composerKN, 54), null, modalBottomSheetStateMUb, false, RoundedCornerShapeKt.O(Dp.KN(f3), Dp.KN(f3), 0.0f, 0.0f, 12, null), 0.0f, Color.INSTANCE.J2(), 0L, aD.w6.iF(), ComposableLambdaKt.nr(-109898041, true, new Ml(aCVar, viewModel, nVarRl, this), composerKN, 54), composerKN, (ModalBottomSheetState.f22280O << 6) | 907542534, 170);
                composerKN = composerKN;
            } else {
                i5 = i7;
                nVar = nVarRl;
                vdVar = vdVar2;
            }
            composerKN.Xw();
            composerKN.eF(1556897754);
            boolean zE22 = composerKN.E2(this) | composerKN.E2(vdVar) | composerKN.p5(nVar) | composerKN.E2(modalBottomSheetStateMUb);
            Object objIF3 = composerKN.iF();
            if (zE22 || objIF3 == companion.n()) {
                objIF3 = new Function1() { // from class: yvM.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PresetPreviewActivity.ul(this.f76205n, vdVar, nVar, modalBottomSheetStateMUb, (com.alightcreative.maineditor.presetpreview.ui.Wre) obj);
                    }
                };
                composerKN.o(objIF3);
            }
            composerKN.Xw();
            uW.I28.rl(viewModel, (Function1) objIF3, composerKN, i5 & 14);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: yvM.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PresetPreviewActivity.n1(this.f76208n, viewModel, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // android.app.Activity
    public void finish() {
        com.alightcreative.maineditor.presetpreview.ui.fuX fux = this.viewModel;
        if (fux == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fux = null;
        }
        fux.M7();
        super.finish();
    }

    public final g9s.n hRu() {
        g9s.n nVar = this.viewModelFactoryPremadeContent;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactoryPremadeContent");
        return null;
    }

    public final xAo.I28 mYa() {
        xAo.I28 i28 = this.crisperManager;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        com.alightcreative.maineditor.presetpreview.ui.fuX fux = this.viewModel;
        if (fux != null) {
            if (fux == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                fux = null;
            }
            fux.eF();
        }
        HI0.Ml.nr(this);
        super.onPause();
    }

    @Override // com.alightcreative.maineditor.presetpreview.ui.j, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        List listEmptyList;
        List<Long> listEmptyList2;
        getWindow().setBackgroundDrawableResource(2131099811);
        super.onCreate(savedInstanceState);
        K(new PJ9.Ml(this, Org()));
        String[] stringArrayExtra = getIntent().getStringArrayExtra("presets");
        if (stringArrayExtra == null || (listEmptyList = ArraysKt.toList(stringArrayExtra)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        String stringExtra = getIntent().getStringExtra("projectID");
        long[] longArrayExtra = getIntent().getLongArrayExtra("nestedSceneIdPath");
        if (longArrayExtra == null || (listEmptyList2 = ArraysKt.toList(longArrayExtra)) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        List<Long> list2 = listEmptyList2;
        long longExtra = getIntent().getLongExtra("sceneElementID", -1L);
        boolean booleanExtra = getIntent().getBooleanExtra("appliesFirstPreset", false);
        WindowCompat.rl(getWindow(), false);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        M5.rl(window, 0, getColor(2131099665), false, 4, null);
        ComponentActivityKt.rl(this, null, ComposableLambdaKt.rl(-1259903014, true, new fuX(list, stringExtra, list2, longExtra, booleanExtra)), 1, null);
    }
}
