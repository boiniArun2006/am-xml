package com.alightcreative.maineditor.presetpreview.ui;

import GJW.C;
import GJW.vd;
import HI0.afx;
import HI0.rv6;
import QmE.iF;
import QmE.j;
import Si.Xo;
import Si.o;
import a.C1498j;
import android.content.Context;
import androidx.view.ViewModel;
import androidx.view.ViewModelKt;
import androidx.view.ViewModelProvider;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.maineditor.presetpreview.ui.Wre;
import e.C1960j;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rWZ.qz;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class fuX extends uW.w6 {
    public static final j WPU = new j(null);
    public static final int aYN = 8;
    private final Ja.w6 HI;
    private final Ja.j Ik;
    private final String KN;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private SceneElement f46720S;
    private final List Uo;
    private final o XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final SceneHolder f46721Z;
    private final Ko8.Dsr az;
    private final Ko8.w6 ck;
    private final boolean gh;
    private final Long mUb;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final iF f46722o;
    private final Ko8.o qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final kgE.fuX f46723r;
    private final Ko8.Wre ty;
    private final List xMQ;

    public static final class j {

        /* JADX INFO: renamed from: com.alightcreative.maineditor.presetpreview.ui.fuX$j$j, reason: collision with other inner class name */
        public static final class C0667j implements ViewModelProvider.Factory {
            final /* synthetic */ Long J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ List f46733O;
            final /* synthetic */ boolean Uo;
            final /* synthetic */ String nr;
            final /* synthetic */ n rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ List f46734t;

            C0667j(n nVar, List list, String str, List list2, Long l2, boolean z2) {
                this.rl = nVar;
                this.f46734t = list;
                this.nr = str;
                this.f46733O = list2;
                this.J2 = l2;
                this.Uo = z2;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public ViewModel t(Class modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                fuX fuxN = this.rl.n(this.f46734t, this.nr, this.f46733O, this.J2, this.Uo);
                Intrinsics.checkNotNull(fuxN, "null cannot be cast to non-null type T of com.alightcreative.maineditor.presetpreview.ui.PresetPreviewViewModel.Companion.provideFactory.<no name provided>.create");
                return fuxN;
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final ViewModelProvider.Factory n(n assistedFactory, List presetIds, String str, List editingNestedSceneIds, Long l2, boolean z2) {
            Intrinsics.checkNotNullParameter(assistedFactory, "assistedFactory");
            Intrinsics.checkNotNullParameter(presetIds, "presetIds");
            Intrinsics.checkNotNullParameter(editingNestedSceneIds, "editingNestedSceneIds");
            return new C0667j(assistedFactory, presetIds, str, editingNestedSceneIds, l2, z2);
        }
    }

    public interface n {
        fuX n(List list, String str, List list2, Long l2, boolean z2);
    }

    static final class w6 extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f46735O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f46736Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f46737n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f46739r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46740t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f46739r = obj;
            this.f46736Z |= Integer.MIN_VALUE;
            return fuX.this.te(null, this);
        }
    }

    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46724n;

        I28(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return fuX.this.new I28(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C1498j c1498jO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46724n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                fuX fux = fuX.this;
                fux.f46720S = fux.fD();
                fuX fux2 = fuX.this;
                List list = fux2.Uo;
                this.f46724n = 1;
                obj = fux2.te(list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            List list2 = (List) obj;
            fuX fux3 = fuX.this;
            C1498j c1498j = new C1498j(fuX.this.XQ, null, 2, null);
            c1498j.aYN(fuX.this.fD());
            Unit unit = Unit.INSTANCE;
            fux3.mUb(new yvM.aC(list2, null, null, c1498j, null, null, 54, null));
            if (fuX.this.gh) {
                SceneElement sceneElement = fuX.this.f46720S;
                if (sceneElement == null) {
                    return Unit.INSTANCE;
                }
                yvM.aC aCVar = (yvM.aC) fuX.this.nr();
                if (aCVar != null) {
                    fuX fux4 = fuX.this;
                    C1960j c1960j = (C1960j) CollectionsKt.first(list2);
                    fux4.mUb(yvM.aC.rl(aCVar, null, c1960j, null, null, null, null, 61, null));
                    fux4.Ik.n(sceneElement, c1960j.t(), c1960j.nr(), fux4.f46721Z);
                    yvM.aC aCVar2 = (yvM.aC) fux4.nr();
                    if (aCVar2 != null && (c1498jO = aCVar2.O()) != null) {
                        c1498jO.ViF(sceneElement);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f46726O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ List f46727S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f46729n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f46730o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46731r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46732t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(List list, Continuation continuation) {
            super(2, continuation);
            this.f46727S = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return fuX.this.new Ml(this.f46727S, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006c -> B:6:0x0022). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Collection arrayList;
            yvM.aC aCVar;
            fuX fux;
            Iterator it;
            C1498j c1498jO;
            C1960j c1960j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46730o;
            if (i2 != 0) {
                if (i2 == 1) {
                    String str = (String) this.f46731r;
                    it = (Iterator) this.J2;
                    arrayList = (Collection) this.f46726O;
                    aCVar = (yvM.aC) this.f46732t;
                    fuX fux2 = (fuX) this.f46729n;
                    ResultKt.throwOnFailure(obj);
                    String str2 = str;
                    SceneElement sceneElement = (SceneElement) x0X.w6.nr((x0X.n) obj);
                    if (sceneElement == null) {
                        c1960j = new C1960j(str2, sceneElement, null, 4, null);
                    } else {
                        c1960j = null;
                    }
                    if (c1960j != null) {
                        arrayList.add(c1960j);
                    }
                    fux = fux2;
                    if (it.hasNext()) {
                        str = (String) it.next();
                        Ko8.Wre wre = fux.ty;
                        this.f46729n = fux;
                        this.f46732t = aCVar;
                        this.f46726O = arrayList;
                        this.J2 = it;
                        this.f46731r = str;
                        this.f46730o = 1;
                        Object objN = wre.n(str, this);
                        if (objN == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        fux2 = fux;
                        obj = objN;
                        String str22 = str;
                        SceneElement sceneElement2 = (SceneElement) x0X.w6.nr((x0X.n) obj);
                        if (sceneElement2 == null) {
                        }
                        if (c1960j != null) {
                        }
                        fux = fux2;
                        if (it.hasNext()) {
                            List list = (List) arrayList;
                            SceneElement sceneElement3 = fux.f46720S;
                            if (sceneElement3 != null) {
                                C1960j c1960j2 = (C1960j) CollectionsKt.first(list);
                                fux.mUb(yvM.aC.rl(aCVar, CollectionsKt.plus((Collection) list, (Iterable) aCVar.nr()), c1960j2, null, null, null, null, 60, null));
                                fux.Ik.n(sceneElement3, c1960j2.t(), c1960j2.nr(), fux.f46721Z);
                                yvM.aC aCVar2 = (yvM.aC) fux.nr();
                                if (aCVar2 != null && (c1498jO = aCVar2.O()) != null) {
                                    c1498jO.ViF(sceneElement3);
                                }
                            } else {
                                fux.mUb(yvM.aC.rl(aCVar, CollectionsKt.plus((Collection) list, (Iterable) aCVar.nr()), null, null, null, null, null, 62, null));
                            }
                            fuX.this.xMQ(Wre.C0666Wre.f46713n);
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                yvM.aC aCVar3 = (yvM.aC) fuX.this.nr();
                if (aCVar3 != null) {
                    List list2 = this.f46727S;
                    fuX fux3 = fuX.this;
                    arrayList = new ArrayList();
                    aCVar = aCVar3;
                    fux = fux3;
                    it = list2.iterator();
                    if (it.hasNext()) {
                    }
                }
                fuX.this.xMQ(Wre.C0666Wre.f46713n);
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuX(List presetIds, String str, List editingNestedSceneIds, Long l2, boolean z2, gY.j createPlayerHelperUseCase, Ko8.o getSceneByProjectIdUseCase, Ko8.Dsr getSceneByNestedSceneIdPathUseCase, Ko8.Wre getPresetSceneElementByProjectIdUseCase, Ja.w6 savePresetToFileUseCase, Ko8.w6 deleteProjectUseCase, Ja.j applyStyleToLayersUseCase, kgE.fuX iapManager, iF eventLogger) {
        super(new Function1() { // from class: yvM.CN3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.maineditor.presetpreview.ui.fuX.HI((aC) obj);
            }
        });
        Intrinsics.checkNotNullParameter(presetIds, "presetIds");
        Intrinsics.checkNotNullParameter(editingNestedSceneIds, "editingNestedSceneIds");
        Intrinsics.checkNotNullParameter(createPlayerHelperUseCase, "createPlayerHelperUseCase");
        Intrinsics.checkNotNullParameter(getSceneByProjectIdUseCase, "getSceneByProjectIdUseCase");
        Intrinsics.checkNotNullParameter(getSceneByNestedSceneIdPathUseCase, "getSceneByNestedSceneIdPathUseCase");
        Intrinsics.checkNotNullParameter(getPresetSceneElementByProjectIdUseCase, "getPresetSceneElementByProjectIdUseCase");
        Intrinsics.checkNotNullParameter(savePresetToFileUseCase, "savePresetToFileUseCase");
        Intrinsics.checkNotNullParameter(deleteProjectUseCase, "deleteProjectUseCase");
        Intrinsics.checkNotNullParameter(applyStyleToLayersUseCase, "applyStyleToLayersUseCase");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.Uo = presetIds;
        this.KN = str;
        this.xMQ = editingNestedSceneIds;
        this.mUb = l2;
        this.gh = z2;
        this.qie = getSceneByProjectIdUseCase;
        this.az = getSceneByNestedSceneIdPathUseCase;
        this.ty = getPresetSceneElementByProjectIdUseCase;
        this.HI = savePresetToFileUseCase;
        this.ck = deleteProjectUseCase;
        this.Ik = applyStyleToLayersUseCase;
        this.f46723r = iapManager;
        this.f46722o = eventLogger;
        SceneHolder SceneHolder = SceneKt.SceneHolder(nY());
        this.f46721Z = SceneHolder;
        this.XQ = createPlayerHelperUseCase.n(SceneHolder, "preset_preview_player_helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aC HI(yvM.aC it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Dsr.n(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P5(fuX fux, List list, List list2) {
        fux.xMQ(new Wre.w6(list, list2));
        return Unit.INSTANCE;
    }

    private final Scene iF() {
        return this.f46721Z.getScene();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jB(fuX fux, C1960j c1960j, File file, Scene scene, Context context) {
        fux.xMQ(new Wre.w6(CollectionsKt.listOf(c1960j), CollectionsKt.listOf(rWZ.Wre.nr(2131361969, c1960j.t(), file, scene, context, null, fux.f46723r, (128 & 128) != 0 ? false : false))));
        return Unit.INSTANCE;
    }

    private final Scene nY() {
        String str = this.KN;
        if (str == null) {
            return SceneKt.getEMPTY_SCENE();
        }
        x0X.n nVarN = this.qie.n(str);
        if (!(nVarN instanceof n.C1266n)) {
            if (!(nVarN instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            nVarN = this.az.n((Scene) ((n.w6) nVarN).n(), this.xMQ);
        }
        Scene scene = (Scene) x0X.w6.nr(nVarN);
        return scene == null ? SceneKt.getEMPTY_SCENE() : scene;
    }

    public static /* synthetic */ void rV9(fuX fux, C1960j c1960j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c1960j = null;
        }
        fux.v(c1960j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006d -> B:12:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object te(List list, Continuation continuation) {
        w6 w6Var;
        fuX fux;
        Iterator it;
        Collection collection;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f46736Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f46736Z = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objN = w6Var.f46739r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f46736Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            ArrayList arrayList = new ArrayList();
            fux = this;
            it = list.iterator();
            collection = arrayList;
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) w6Var.J2;
            it = (Iterator) w6Var.f46735O;
            collection = (Collection) w6Var.f46740t;
            fux = (fuX) w6Var.f46737n;
            ResultKt.throwOnFailure(objN);
            String str2 = str;
            SceneElement sceneElement = (SceneElement) x0X.w6.nr((x0X.n) objN);
            C1960j c1960j = sceneElement == null ? new C1960j(str2, sceneElement, null, 4, null) : null;
            if (c1960j != null) {
                collection.add(c1960j);
            }
            if (it.hasNext()) {
                str = (String) it.next();
                Ko8.Wre wre = fux.ty;
                w6Var.f46737n = fux;
                w6Var.f46740t = collection;
                w6Var.f46735O = it;
                w6Var.J2 = str;
                w6Var.f46736Z = 1;
                objN = wre.n(str, w6Var);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                String str22 = str;
                SceneElement sceneElement2 = (SceneElement) x0X.w6.nr((x0X.n) objN);
                if (sceneElement2 == null) {
                }
                if (c1960j != null) {
                }
                if (it.hasNext()) {
                    return (List) collection;
                }
            }
        }
    }

    public final void B(C1960j presetData, String newTitle) {
        Intrinsics.checkNotNullParameter(presetData, "presetData");
        Intrinsics.checkNotNullParameter(newTitle, "newTitle");
        this.HI.rl(presetData.t(), newTitle);
        yvM.aC aCVar = (yvM.aC) nr();
        if (aCVar != null) {
            Iterator it = aCVar.nr().iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (Intrinsics.areEqual(((C1960j) it.next()).t(), presetData.t())) {
                    break;
                } else {
                    i2++;
                }
            }
            mUb(yvM.aC.rl(aCVar, rv6.t(aCVar.nr(), i2, C1960j.rl(presetData, null, null, newTitle, 3, null)), null, null, null, null, null, 46, null));
        }
    }

    public final void D(C1960j presetData) {
        Intrinsics.checkNotNullParameter(presetData, "presetData");
        yvM.aC aCVar = (yvM.aC) nr();
        mUb(aCVar != null ? aCVar.J2().contains(presetData) ? yvM.aC.rl(aCVar, null, null, CollectionsKt.minus(aCVar.J2(), presetData), null, null, null, 57, null) : yvM.aC.rl(aCVar, null, null, CollectionsKt.plus((Collection<? extends C1960j>) aCVar.J2(), presetData), null, null, null, 57, null) : null);
    }

    public final void E(tN.n item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f46722o.n(new j.C1441i(item.n(), rWZ.o.f73106t));
        xMQ(new Wre.Ml(item.rl()));
    }

    public final void J(C1960j presetData) {
        Intrinsics.checkNotNullParameter(presetData, "presetData");
        yvM.aC aCVar = (yvM.aC) nr();
        mUb(aCVar != null ? yvM.aC.rl(aCVar, null, null, null, null, presetData, null, 47, null) : null);
    }

    public final void M(C1960j presetData) {
        yvM.aC aCVar;
        C1498j c1498jO;
        C1498j c1498jO2;
        Intrinsics.checkNotNullParameter(presetData, "presetData");
        SceneElement sceneElement = this.f46720S;
        if (sceneElement == null || (aCVar = (yvM.aC) nr()) == null) {
            return;
        }
        C1960j c1960jT = aCVar.t();
        if (!Intrinsics.areEqual(c1960jT != null ? c1960jT.t() : null, presetData.t())) {
            mUb(yvM.aC.rl(aCVar, null, presetData, null, null, null, null, 61, null));
            this.Ik.n(sceneElement, presetData.t(), presetData.nr(), this.f46721Z);
            this.f46722o.n(new j.l(this.KN, presetData.t(), rWZ.j.rl(sceneElement), qz.f73107O));
            yvM.aC aCVar2 = (yvM.aC) nr();
            if (aCVar2 == null || (c1498jO = aCVar2.O()) == null) {
                return;
            }
            c1498jO.ViF(sceneElement);
            return;
        }
        mUb(yvM.aC.rl(aCVar, null, null, null, null, null, null, 61, null));
        SceneElement sceneElement2 = this.f46720S;
        if (sceneElement2 != null) {
            this.f46721Z.update(sceneElement2);
        }
        yvM.aC aCVar3 = (yvM.aC) nr();
        if (aCVar3 == null || (c1498jO2 = aCVar3.O()) == null) {
            return;
        }
        c1498jO2.aYN(fD());
    }

    public final void M7() {
        this.XQ.pause();
        Xo.j.rl(this.XQ, null, 1, null);
    }

    public final void T() {
        xMQ(Wre.j.f46714n);
    }

    public final void U(Context context) {
        rWZ.n nVarNr;
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        final List<C1960j> listE2 = E2();
        if (listE2 == null) {
            return;
        }
        iF iFVar = this.f46722o;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listE2, 10));
        Iterator it = listE2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1960j) it.next()).t());
        }
        iFVar.n(new j.ys8(arrayList));
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C1960j c1960j : listE2) {
            File fileO = afx.o(context2, c1960j.t());
            Scene scene = (Scene) x0X.w6.nr(this.qie.n(c1960j.t()));
            if (scene != null) {
                XoT.qz.rl(arrayList2, c1960j);
                nVarNr = rWZ.Wre.nr(2131361969, c1960j.t(), fileO, scene, context2, null, this.f46723r, (128 & 128) != 0 ? false : false);
            } else {
                nVarNr = null;
            }
            if (nVarNr != null) {
                arrayList4.add(nVarNr);
            }
            context2 = context;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        eF();
        this.XQ.v(new Function0() { // from class: yvM.fuX
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.maineditor.presetpreview.ui.fuX.P5(this.f76199n, listE2, arrayList3);
            }
        });
    }

    public final void Xw(final C1960j presetData, final Context context) {
        Intrinsics.checkNotNullParameter(presetData, "presetData");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46722o.n(new j.ys8(CollectionsKt.listOf(presetData.t())));
        final File fileO = afx.o(context, presetData.t());
        final Scene scene = (Scene) x0X.w6.nr(this.qie.n(presetData.t()));
        if (scene != null) {
            eF();
            this.XQ.v(new Function0() { // from class: yvM.Dsr
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.alightcreative.maineditor.presetpreview.ui.fuX.jB(this.f76189n, presetData, fileO, scene, context);
                }
            });
        }
    }

    public final void bzg() {
        iF iFVar = this.f46722o;
        String str = this.KN;
        if (str == null) {
            str = "";
        }
        iFVar.n(new j.N(str));
        xMQ(Wre.I28.f46711n);
    }

    public final void eF() {
        this.XQ.pause();
    }

    @Override // androidx.view.ViewModel
    protected void onCleared() {
        this.XQ.pause();
        this.XQ.release();
    }

    public final void p5(List newPresetsIds) {
        Intrinsics.checkNotNullParameter(newPresetsIds, "newPresetsIds");
        C.nr(ViewModelKt.n(this), null, null, new Ml(newPresetsIds, null), 3, null);
    }

    public final void v(C1960j c1960j) {
        List listE2;
        if (c1960j == null || (listE2 = CollectionsKt.listOf(c1960j)) == null) {
            listE2 = E2();
        }
        List list = listE2;
        yvM.aC aCVar = (yvM.aC) nr();
        mUb(aCVar != null ? yvM.aC.rl(aCVar, null, null, null, null, null, list, 31, null) : null);
    }

    public final void wTp(List presets) {
        SceneElement sceneElement;
        C1960j c1960jT;
        Intrinsics.checkNotNullParameter(presets, "presets");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(presets, 10));
        Iterator it = presets.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1960j) it.next()).t());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.ck.n((String) it2.next());
        }
        yvM.aC aCVar = (yvM.aC) nr();
        if (CollectionsKt.contains(arrayList, (aCVar == null || (c1960jT = aCVar.t()) == null) ? null : c1960jT.t()) && (sceneElement = this.f46720S) != null) {
            this.f46721Z.update(sceneElement);
        }
        yvM.aC aCVar2 = (yvM.aC) nr();
        if (aCVar2 != null) {
            List listNr = aCVar2.nr();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listNr) {
                if (!arrayList.contains(((C1960j) obj).t())) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                xMQ(new Wre.n(null, true));
                return;
            }
            C1960j c1960jT2 = aCVar2.t();
            C1960j c1960jT3 = aCVar2.t();
            mUb(yvM.aC.rl(aCVar2, arrayList2, !CollectionsKt.contains(arrayList, c1960jT3 != null ? c1960jT3.t() : null) ? c1960jT2 : null, CollectionsKt.emptyList(), null, null, null, 24, null));
        }
    }

    private final List E2() {
        yvM.aC aCVar = (yvM.aC) nr();
        if (aCVar != null) {
            return aCVar.J2();
        }
        return null;
    }

    private final void X() {
        yvM.aC aCVarRl;
        yvM.aC aCVar = (yvM.aC) nr();
        if (aCVar != null) {
            aCVarRl = yvM.aC.rl(aCVar, null, null, CollectionsKt.emptyList(), null, null, null, 59, null);
        } else {
            aCVarRl = null;
        }
        mUb(aCVarRl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SceneElement fD() {
        return SceneKt.elementById(iF(), this.mUb);
    }

    private final C1960j g() {
        yvM.aC aCVar = (yvM.aC) nr();
        if (aCVar != null) {
            return aCVar.t();
        }
        return null;
    }

    private final void nHg(String str) {
        C1498j c1498jO;
        yvM.aC aCVar = (yvM.aC) nr();
        if (aCVar != null && (c1498jO = aCVar.O()) != null) {
            c1498jO.az();
        }
        xMQ(new Wre.n(str, false, 2, null));
    }

    public final void FX() {
        yvM.aC aCVarRl;
        yvM.aC aCVar = (yvM.aC) nr();
        if (aCVar != null) {
            aCVarRl = yvM.aC.rl(aCVar, null, null, null, null, null, null, 47, null);
        } else {
            aCVarRl = null;
        }
        mUb(aCVarRl);
    }

    public final void N() {
        List listEmptyList;
        yvM.aC aCVar = (yvM.aC) nr();
        if (aCVar != null) {
            listEmptyList = aCVar.J2();
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (!listEmptyList.isEmpty()) {
            X();
        } else {
            nHg(null);
        }
    }

    @Override // uW.w6
    public void Uo() {
        C.nr(ViewModelKt.n(this), null, null, new I28(null), 3, null);
    }

    public final void e() {
        String strT;
        C1960j c1960jG = g();
        if (c1960jG != null) {
            strT = c1960jG.t();
        } else {
            strT = null;
        }
        nHg(strT);
    }

    public final void s7N() {
        yvM.aC aCVarRl;
        yvM.aC aCVar = (yvM.aC) nr();
        if (aCVar != null) {
            aCVarRl = yvM.aC.rl(aCVar, null, null, null, null, null, null, 31, null);
        } else {
            aCVarRl = null;
        }
        mUb(aCVarRl);
    }
}
