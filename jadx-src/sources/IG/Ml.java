package IG;

import Fg.afx;
import GJW.C;
import GJW.vd;
import IG.n;
import Ko8.o;
import QmE.iF;
import QmE.j;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneType;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import x0X.n;
import xr.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001Bi\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0010¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u001f¢\u0006\u0004\b%\u0010!J\u0015\u0010(\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b*\u0010)J\u0015\u0010-\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u001f2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b3\u0010)J\u0015\u00106\u001a\u00020\u001f2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u001f¢\u0006\u0004\b8\u0010!J\r\u00109\u001a\u00020\u001f¢\u0006\u0004\b9\u0010!J\r\u0010:\u001a\u00020\u001f¢\u0006\u0004\b:\u0010!J\r\u0010;\u001a\u00020\u001f¢\u0006\u0004\b;\u0010!J9\u0010E\u001a\u00020\u001f2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\u0006\u0010?\u001a\u00020=2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\"2\b\u0010G\u001a\u0004\u0018\u00010=¢\u0006\u0004\bH\u0010IJA\u0010R\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020&0P2\u0006\u0010'\u001a\u00020&2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020=2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020&¢\u0006\u0004\bR\u0010SJ\u001d\u0010U\u001a\u00020\u001f2\u0006\u0010T\u001a\u00020&2\u0006\u0010O\u001a\u00020&¢\u0006\u0004\bU\u0010VJ\u0015\u0010Y\u001a\u00020\u001f2\u0006\u0010X\u001a\u00020W¢\u0006\u0004\bY\u0010ZJ\u0015\u0010[\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b[\u0010)J-\u0010]\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&2\u0006\u0010T\u001a\u00020&2\u0006\u0010\\\u001a\u00020=2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\b]\u0010^R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010_R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010s¨\u0006t"}, d2 = {"LIG/Ml;", "LuW/w6;", "LIG/Wre;", "LIG/aC;", "LIG/n;", "LU/j;", "getProjectListSortOrderUseCase", "LKo8/o;", "getSceneByProjectIdUseCase", "LKo8/Wre;", "getPresetSceneElementByProjectIdUseCase", "Lr53/j;", "createProjectFromTemplateUseCase", "LKo8/j;", "countMediaUseCase", "LA/j;", "isAddTemplateVisitedUseCase", "LA/n;", "setAddTemplateVisitedUseCase", "LJa/j;", "applyStyleToLayersUseCase", "LJa/n;", "isAbleToSavePresetUseCase", "LJa/w6;", "savePresetToFileUseCase", "LWK/I28;", "newFeatureManager", "LQmE/iF;", "eventLogger", "<init>", "(LU/j;LKo8/o;LKo8/Wre;Lr53/j;LKo8/j;LA/j;LA/n;LJa/j;LJa/n;LJa/w6;LWK/I28;LQmE/iF;)V", "", "Uo", "()V", "", "wTp", "()Z", "fD", "", "projectId", "N", "(Ljava/lang/String;)V", "nHg", "LIG/j;", "bottomSheetCollection", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(LIG/j;)V", "Lcom/alightcreative/app/motion/scene/SceneType;", "sceneType", "e", "(Lcom/alightcreative/app/motion/scene/SceneType;)V", "g", "Lcom/alightcreative/app/motion/project/ProjectInfo$n;", "project", "X", "(Lcom/alightcreative/app/motion/project/ProjectInfo$n;)V", "ViF", "te", "nY", "aYN", "", "Lcom/alightcreative/app/motion/scene/SceneElement;", "elements", "styleElement", "", "Lcom/alightcreative/widget/U4;", "optList", "Lcom/alightcreative/app/motion/scene/SceneHolder;", "sceneHolder", "S", "(Ljava/util/List;Lcom/alightcreative/app/motion/scene/SceneElement;Ljava/util/Set;Lcom/alightcreative/app/motion/scene/SceneHolder;)V", "selectedSceneElement", "WPU", "(Lcom/alightcreative/app/motion/scene/SceneElement;)Z", "Lcom/alightcreative/app/motion/scene/Scene;", "scene", "sceneElement", "", "currentTime", "title", "Lx0X/n;", "Lga6/j;", "Z", "(Ljava/lang/String;Lcom/alightcreative/app/motion/scene/Scene;Lcom/alightcreative/app/motion/scene/SceneElement;ILjava/lang/String;)Lx0X/n;", "presetId", "s7N", "(Ljava/lang/String;Ljava/lang/String;)V", "LtN/n;", "item", "E2", "(LtN/n;)V", "iF", "element", "XQ", "(Ljava/lang/String;Ljava/lang/String;Lcom/alightcreative/app/motion/scene/SceneElement;Lcom/alightcreative/app/motion/scene/SceneHolder;)V", "LKo8/o;", "KN", "LKo8/Wre;", "xMQ", "Lr53/j;", "mUb", "LKo8/j;", "gh", "LA/j;", "qie", "LA/n;", "az", "LJa/j;", "ty", "LJa/n;", "HI", "LJa/w6;", "ck", "LWK/I28;", "Ik", "LQmE/iF;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEditViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditViewModel.kt\ncom/alightcreative/maineditor/EditViewModel\n+ 2 Either.kt\ncom/bendingspoons/core/functional/EitherKt\n*L\n1#1,397:1\n180#2,3:398\n180#2,5:401\n184#2:406\n*S KotlinDebug\n*F\n+ 1 EditViewModel.kt\ncom/alightcreative/maineditor/EditViewModel\n*L\n234#1:398,3\n235#1:401,5\n234#1:406\n*E\n"})
public final class Ml extends uW.w6 {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final Ja.w6 savePresetToFileUseCase;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final iF eventLogger;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final Ko8.Wre getPresetSceneElementByProjectIdUseCase;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final o getSceneByProjectIdUseCase;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final Ja.j applyStyleToLayersUseCase;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final WK.I28 newFeatureManager;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final A.j isAddTemplateVisitedUseCase;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final Ko8.j countMediaUseCase;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final A.n setAddTemplateVisitedUseCase;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final Ja.n isAbleToSavePresetUseCase;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final r53.j createProjectFromTemplateUseCase;

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ U.j J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4116n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f4117t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(U.j jVar, Continuation continuation) {
            super(2, continuation);
            this.J2 = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new j(this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ml ml;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f4117t;
            if (i2 != 0) {
                if (i2 == 1) {
                    ml = (Ml) this.f4116n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Ml ml2 = Ml.this;
                A.j jVar = ml2.isAddTemplateVisitedUseCase;
                this.f4116n = ml2;
                this.f4117t = 1;
                Object objN = jVar.n(this);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ml = ml2;
                obj = objN;
            }
            ml.mUb(new Wre(((Boolean) obj).booleanValue(), null, SceneType.ELEMENT, this.J2.invoke(), Ml.this.newFeatureManager.rl(WK.Ml.J2), Ml.this.newFeatureManager.rl(WK.Ml.f11452O)));
            return Unit.INSTANCE;
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ SceneElement J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f4118O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4119n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f4120o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ SceneHolder f4121r;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, SceneElement sceneElement, SceneHolder sceneHolder, String str2, Continuation continuation) {
            super(2, continuation);
            this.f4118O = str;
            this.J2 = sceneElement;
            this.f4121r = sceneHolder;
            this.f4120o = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new n(this.f4118O, this.J2, this.f4121r, this.f4120o, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f4119n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Ko8.Wre wre = Ml.this.getPresetSceneElementByProjectIdUseCase;
                String str = this.f4118O;
                this.f4119n = 1;
                obj = wre.n(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            Ml ml = Ml.this;
            SceneElement sceneElement = this.J2;
            String str2 = this.f4118O;
            SceneHolder sceneHolder = this.f4121r;
            String str3 = this.f4120o;
            if (!(nVar instanceof n.C1266n)) {
                if (nVar instanceof n.w6) {
                    ml.applyStyleToLayersUseCase.n(sceneElement, str2, (SceneElement) ((n.w6) nVar).n(), sceneHolder);
                    ml.eventLogger.n(new j.tmw(str3, str2, rWZ.j.rl(sceneElement)));
                    ml.xMQ(n.Wre.f4140n);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4123n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Wre wreRl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f4123n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                A.n nVar = Ml.this.setAddTemplateVisitedUseCase;
                this.f4123n = 1;
                if (nVar.n(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Ml ml = Ml.this;
            Wre wre = (Wre) ml.nr();
            if (wre != null) {
                wreRl = Wre.rl(wre, true, null, null, null, false, false, 62, null);
            } else {
                wreRl = null;
            }
            ml.mUb(wreRl);
            return Unit.INSTANCE;
        }
    }

    @Override // uW.w6
    public void Uo() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ml(U.j getProjectListSortOrderUseCase, o getSceneByProjectIdUseCase, Ko8.Wre getPresetSceneElementByProjectIdUseCase, r53.j createProjectFromTemplateUseCase, Ko8.j countMediaUseCase, A.j isAddTemplateVisitedUseCase, A.n setAddTemplateVisitedUseCase, Ja.j applyStyleToLayersUseCase, Ja.n isAbleToSavePresetUseCase, Ja.w6 savePresetToFileUseCase, WK.I28 newFeatureManager, iF eventLogger) {
        super(new Function1() { // from class: IG.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ml.az((Wre) obj);
            }
        });
        Intrinsics.checkNotNullParameter(getProjectListSortOrderUseCase, "getProjectListSortOrderUseCase");
        Intrinsics.checkNotNullParameter(getSceneByProjectIdUseCase, "getSceneByProjectIdUseCase");
        Intrinsics.checkNotNullParameter(getPresetSceneElementByProjectIdUseCase, "getPresetSceneElementByProjectIdUseCase");
        Intrinsics.checkNotNullParameter(createProjectFromTemplateUseCase, "createProjectFromTemplateUseCase");
        Intrinsics.checkNotNullParameter(countMediaUseCase, "countMediaUseCase");
        Intrinsics.checkNotNullParameter(isAddTemplateVisitedUseCase, "isAddTemplateVisitedUseCase");
        Intrinsics.checkNotNullParameter(setAddTemplateVisitedUseCase, "setAddTemplateVisitedUseCase");
        Intrinsics.checkNotNullParameter(applyStyleToLayersUseCase, "applyStyleToLayersUseCase");
        Intrinsics.checkNotNullParameter(isAbleToSavePresetUseCase, "isAbleToSavePresetUseCase");
        Intrinsics.checkNotNullParameter(savePresetToFileUseCase, "savePresetToFileUseCase");
        Intrinsics.checkNotNullParameter(newFeatureManager, "newFeatureManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.getSceneByProjectIdUseCase = getSceneByProjectIdUseCase;
        this.getPresetSceneElementByProjectIdUseCase = getPresetSceneElementByProjectIdUseCase;
        this.createProjectFromTemplateUseCase = createProjectFromTemplateUseCase;
        this.countMediaUseCase = countMediaUseCase;
        this.isAddTemplateVisitedUseCase = isAddTemplateVisitedUseCase;
        this.setAddTemplateVisitedUseCase = setAddTemplateVisitedUseCase;
        this.applyStyleToLayersUseCase = applyStyleToLayersUseCase;
        this.isAbleToSavePresetUseCase = isAbleToSavePresetUseCase;
        this.savePresetToFileUseCase = savePresetToFileUseCase;
        this.newFeatureManager = newFeatureManager;
        this.eventLogger = eventLogger;
        C.nr(ViewModelKt.n(this), null, null, new j(getProjectListSortOrderUseCase, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aC az(Wre it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return I28.n(it);
    }

    public final void E2(tN.n item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.eventLogger.n(new j.C1441i(item.n(), rWZ.o.f73106t));
        xMQ(new n.Ml(item.rl()));
    }

    public final void N(String projectId) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        this.eventLogger.n(new j.N(projectId));
        T(IG.j.J2);
    }

    public final void S(List elements, SceneElement styleElement, Set optList, SceneHolder sceneHolder) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(styleElement, "styleElement");
        Intrinsics.checkNotNullParameter(optList, "optList");
        Intrinsics.checkNotNullParameter(sceneHolder, "sceneHolder");
        this.applyStyleToLayersUseCase.rl(elements, styleElement, optList, sceneHolder);
    }

    public final void T(IG.j bottomSheetCollection) {
        Intrinsics.checkNotNullParameter(bottomSheetCollection, "bottomSheetCollection");
        Wre wre = (Wre) nr();
        mUb(wre != null ? Wre.rl(wre, false, bottomSheetCollection, null, null, false, false, 61, null) : null);
    }

    public final boolean WPU(SceneElement selectedSceneElement) {
        if (selectedSceneElement != null) {
            return this.isAbleToSavePresetUseCase.n(selectedSceneElement);
        }
        return false;
    }

    public final void X(ProjectInfo.n project) {
        Intrinsics.checkNotNullParameter(project, "project");
        String strRl = project.rl();
        if (strRl == null) {
            throw new IllegalArgumentException("onTemplateSelected was called on a project that isn't a template.");
        }
        x0X.n nVarN = this.getSceneByProjectIdUseCase.n(project.getId());
        if (nVarN instanceof n.C1266n) {
            return;
        }
        if (!(nVarN instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        Scene scene = (Scene) ((n.w6) nVarN).n();
        x0X.n nVarN2 = this.createProjectFromTemplateUseCase.n(scene, project.getId());
        if (nVarN2 instanceof n.C1266n) {
            return;
        }
        if (!(nVarN2 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = (String) ((n.w6) nVarN2).n();
        Fg.CN3 cn3P5 = afx.p5(strRl);
        String strN = cn3P5 != null ? cn3P5.n() : null;
        if (strN == null) {
            strN = "";
        }
        String str2 = strN;
        int iN = this.countMediaUseCase.n(scene);
        if (iN > 0) {
            this.eventLogger.n(new j.VY8(str2, str, scene.getType(), iN, j.C1276j.f75489n));
            xMQ(new n.I28(str, str2));
        } else {
            xMQ(new n.C0141n(str, str2));
        }
        xMQ(n.w6.f4143n);
    }

    public final void XQ(String projectId, String presetId, SceneElement element, SceneHolder sceneHolder) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(presetId, "presetId");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(sceneHolder, "sceneHolder");
        C.nr(ViewModelKt.n(this), null, null, new n(presetId, element, sceneHolder, projectId, null), 3, null);
    }

    public final x0X.n Z(String projectId, Scene scene, SceneElement sceneElement, int currentTime, String title) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(sceneElement, "sceneElement");
        Intrinsics.checkNotNullParameter(title, "title");
        this.eventLogger.n(new j.op(projectId, rWZ.j.rl(sceneElement)));
        Wre wre = (Wre) nr();
        if (wre != null && wre.KN()) {
            this.newFeatureManager.n(WK.Ml.f11452O);
            Wre wre2 = (Wre) nr();
            mUb(wre2 != null ? Wre.rl(wre2, false, null, null, null, false, false, 31, null) : null);
        }
        return this.savePresetToFileUseCase.n(sceneElement, scene, currentTime, title);
    }

    public final void aYN() {
        xMQ(n.w6.f4143n);
    }

    public final void e(SceneType sceneType) {
        Intrinsics.checkNotNullParameter(sceneType, "sceneType");
        Wre wre = (Wre) nr();
        mUb(wre != null ? Wre.rl(wre, false, null, sceneType, null, false, false, 59, null) : null);
    }

    public final void g(String projectId) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        xMQ(new n.j(projectId));
        xMQ(n.w6.f4143n);
    }

    public final void iF(String projectId) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        this.eventLogger.n(new j.V1(projectId));
        Wre wre = (Wre) nr();
        if (wre == null || !wre.Uo()) {
            return;
        }
        this.newFeatureManager.n(WK.Ml.J2);
        Wre wre2 = (Wre) nr();
        mUb(wre2 != null ? Wre.rl(wre2, false, null, null, null, false, false, 47, null) : null);
    }

    public final void nHg(String projectId) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        this.eventLogger.n(new j.Pp(projectId));
        this.newFeatureManager.n(WK.Ml.f11459t);
        T(IG.j.f4133O);
    }

    public final void nY() {
        xMQ(n.w6.f4143n);
    }

    public final void s7N(String presetId, String title) {
        Intrinsics.checkNotNullParameter(presetId, "presetId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.savePresetToFileUseCase.rl(presetId, title);
    }

    public final void te() {
        xMQ(n.w6.f4143n);
    }

    public final void ViF() {
        IG.j jVarT;
        Wre wre = (Wre) nr();
        Wre wreRl = null;
        if (wre != null) {
            jVarT = wre.t();
        } else {
            jVarT = null;
        }
        if (jVarT != null) {
            Wre wre2 = (Wre) nr();
            if (wre2 != null) {
                wreRl = Wre.rl(wre2, false, null, SceneType.ELEMENT, null, false, false, 57, null);
            }
            mUb(wreRl);
        }
    }

    public final void fD() {
        C.nr(ViewModelKt.n(this), null, null, new w6(null), 3, null);
    }

    public final boolean wTp() {
        Wre wre = (Wre) nr();
        if (wre == null || wre.J2()) {
            return false;
        }
        return true;
    }
}
