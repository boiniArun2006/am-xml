package l;

import GJW.h;
import GJW.vd;
import GJW.xuv;
import QmE.iF;
import QmE.j;
import TFv.rv6;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ComponentActivity;
import androidx.view.ViewModelKt;
import com.alightcreative.account.CloudStorageStatus;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.List;
import kP.InterfaceC2210n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.AbstractC2254j;
import l.CN3;
import rWZ.eO;
import wtO.n;
import x0X.n;
import xAo.DAz;
import xAo.Q;
import xAo.afx;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001Ba\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0010¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&JA\u00102\u001a\u00020 2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b2\u00103J?\u00107\u001a\u00020 2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u00104\u001a\u00020)2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001d2\f\u00106\u001a\b\u0012\u0004\u0012\u00020 05¢\u0006\u0004\b7\u00108J \u00109\u001a\u00020 2\u0006\u0010*\u001a\u00020)2\u0006\u00104\u001a\u00020)H\u0086@¢\u0006\u0004\b9\u0010:J+\u0010?\u001a\u00020 2\u0006\u0010<\u001a\u00020;2\u0006\u00104\u001a\u00020)2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020+0=¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020 ¢\u0006\u0004\bA\u0010\"J\u0015\u0010B\u001a\u00020 2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\bB\u0010CJ\u0019\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0=0D¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010HR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006]"}, d2 = {"Ll/CN3;", "LuW/w6;", "Ll/C;", "Ll/Xo;", "Ll/j;", "LwtO/j;", "buildAndUploadProjectToCloudUseCase", "LwtO/w6;", "deleteFromCloudUseCase", "LwtO/Ml;", "downloadFromCloudUseCase", "LwtO/Dsr;", "linkLocalAndCloudProjectUseCase", "LwtO/Wre;", "getCloudProjectsUseCase", "LwtO/CN3;", "getCurrentCloudStorageStatusUseCase", "LwtO/n;", "cleanUpFailedUploadsUseCase", "LQmE/iF;", "eventLogger", "LxAo/I28;", "crisperManager", "LnYs/Ml;", "getAlightSettingsUseCase", "LkP/n;", "injet", "<init>", "(LwtO/j;LwtO/w6;LwtO/Ml;LwtO/Dsr;LwtO/Wre;LwtO/CN3;LwtO/n;LQmE/iF;LxAo/I28;LnYs/Ml;LkP/n;)V", "", "WPU", "()Z", "", "Uo", "()V", "Lcom/google/firebase/auth/FirebaseAuth;", "auth", "ViF", "(Lcom/google/firebase/auth/FirebaseAuth;)V", "Landroid/content/Context;", "context", "", "uid", "Lcom/alightcreative/app/motion/project/ProjectInfo$n;", "projectInfo", "Lcom/alightcreative/app/motion/scene/SceneThumbnailMaker;", "thumbnailMaker", "LrWZ/eO;", "requestTriggerPoint", "overwritePrevious", "X", "(Landroid/content/Context;Ljava/lang/String;Lcom/alightcreative/app/motion/project/ProjectInfo$n;Lcom/alightcreative/app/motion/scene/SceneThumbnailMaker;LrWZ/eO;Ljava/lang/Boolean;)V", "cloudProjectId", "Lkotlin/Function0;", "onSuccess", "iF", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;)V", "g", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVi/CN3;", "projectListHost", "", "localProjects", "te", "(LVi/CN3;Ljava/lang/String;Ljava/util/List;)V", "e", "nY", "(Ljava/lang/String;)V", "LTFv/rv6;", "Lcom/alightcreative/app/motion/project/ProjectInfo$j;", "aYN", "()LTFv/rv6;", "LwtO/j;", "KN", "LwtO/w6;", "xMQ", "LwtO/Ml;", "mUb", "LwtO/Dsr;", "gh", "LwtO/Wre;", "qie", "LwtO/CN3;", "az", "LwtO/n;", "ty", "LQmE/iF;", "HI", "LxAo/I28;", "ck", "LnYs/Ml;", "Ik", "LkP/n;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCloudBackupViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudBackupViewModel.kt\ncom/alightcreative/backup/CloudBackupViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,305:1\n295#2,2:306\n*S KotlinDebug\n*F\n+ 1 CloudBackupViewModel.kt\ncom/alightcreative/backup/CloudBackupViewModel\n*L\n279#1:306,2\n*E\n"})
public final class CN3 extends uW.w6 {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final xAo.I28 crisperManager;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final InterfaceC2210n injet;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final wtO.w6 deleteFromCloudUseCase;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final wtO.j buildAndUploadProjectToCloudUseCase;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final wtO.n cleanUpFailedUploadsUseCase;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final wtO.Wre getCloudProjectsUseCase;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final wtO.Dsr linkLocalAndCloudProjectUseCase;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final wtO.CN3 getCurrentCloudStorageStatusUseCase;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final iF eventLogger;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final wtO.Ml downloadFromCloudUseCase;

    /* JADX INFO: renamed from: l.CN3$CN3, reason: collision with other inner class name */
    static final class C1044CN3 extends SuspendLambda implements Function2 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f70347O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ SceneThumbnailMaker f70348Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70349n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Boolean f70350o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ ProjectInfo.n f70351r;

        /* JADX INFO: renamed from: l.CN3$CN3$j */
        /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
            j(Object obj) {
                super(0, obj, CN3.class, "onGetMoreSpaceClicked", "onGetMoreSpaceClicked()V", 0);
            }

            public final void n() {
                ((CN3) this.receiver).e();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C1044CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1044CN3(Context context, String str, ProjectInfo.n nVar, Boolean bool, SceneThumbnailMaker sceneThumbnailMaker, Continuation continuation) {
            super(2, continuation);
            this.f70347O = context;
            this.J2 = str;
            this.f70351r = nVar;
            this.f70350o = bool;
            this.f70348Z = sceneThumbnailMaker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CN3.this.new C1044CN3(this.f70347O, this.J2, this.f70351r, this.f70350o, this.f70348Z, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(CN3 cn3, float f3) {
            C cRl;
            C c2 = (C) cn3.nr();
            if (c2 != null) {
                cRl = C.rl(c2, null, Float.valueOf(f3), null, 5, null);
            } else {
                cRl = null;
            }
            cn3.mUb(cRl);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            C1044CN3 c1044cn3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f70349n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    c1044cn3 = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                wtO.j jVar = CN3.this.buildAndUploadProjectToCloudUseCase;
                Context context = this.f70347O;
                String str = this.J2;
                ProjectInfo.n nVar = this.f70351r;
                Boolean bool = this.f70350o;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                boolean z2 = zBooleanValue;
                SceneThumbnailMaker sceneThumbnailMaker = this.f70348Z;
                final CN3 cn3 = CN3.this;
                Function1 function1 = new Function1() { // from class: l.Dsr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CN3.C1044CN3.O(cn3, ((Float) obj2).floatValue());
                    }
                };
                j jVar2 = new j(CN3.this);
                if (!CN3.this.WPU()) {
                    jVar2 = null;
                }
                j jVar3 = jVar2;
                this.f70349n = 1;
                c1044cn3 = this;
                if (jVar.n(context, str, nVar, z2, sceneThumbnailMaker, function1, jVar3, c1044cn3) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            CN3.this.mUb(new C(null, null, null, 7, null));
            return Unit.INSTANCE;
        }
    }

    static final class I28 extends SuspendLambda implements Function2 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f70353O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function0 f70354Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70355n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Boolean f70356o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f70357r;

        /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
            j(Object obj) {
                super(0, obj, CN3.class, "onGetMoreSpaceClicked", "onGetMoreSpaceClicked()V", 0);
            }

            public final void n() {
                ((CN3) this.receiver).e();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(Context context, String str, String str2, Boolean bool, Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f70353O = context;
            this.J2 = str;
            this.f70357r = str2;
            this.f70356o = bool;
            this.f70354Z = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CN3.this.new I28(this.f70353O, this.J2, this.f70357r, this.f70356o, this.f70354Z, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(CN3 cn3, float f3) {
            C cRl;
            C c2 = (C) cn3.nr();
            if (c2 != null) {
                cRl = C.rl(c2, null, Float.valueOf(f3), null, 5, null);
            } else {
                cRl = null;
            }
            cn3.mUb(cRl);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            I28 i28;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f70355n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    i28 = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                wtO.Ml ml = CN3.this.downloadFromCloudUseCase;
                Context context = this.f70353O;
                String str = this.J2;
                String str2 = this.f70357r;
                Boolean bool = this.f70356o;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                boolean z2 = zBooleanValue;
                final CN3 cn3 = CN3.this;
                Function1 function1 = new Function1() { // from class: l.fuX
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CN3.I28.O(cn3, ((Float) obj2).floatValue());
                    }
                };
                j jVar = new j(CN3.this);
                if (!CN3.this.WPU()) {
                    jVar = null;
                }
                j jVar2 = jVar;
                this.f70355n = 1;
                i28 = this;
                obj = ml.n(context, str, str2, z2, function1, jVar2, i28);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            CN3.this.mUb(new C(null, null, null, 7, null));
            if (zBooleanValue2) {
                i28.f70354Z.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f70359O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70360n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f70359O = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CN3.this.new Ml(this.f70359O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f70360n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC2210n interfaceC2210n = CN3.this.injet;
                Eu.I28 i28 = Eu.I28.f2390v;
                this.f70360n = 1;
                obj = Eu.Wre.n(interfaceC2210n, i28, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            Function0 function0 = this.f70359O;
            if (!(nVar instanceof n.C1266n)) {
                if (nVar instanceof n.w6) {
                    if (((Boolean) ((n.w6) nVar).n()).booleanValue()) {
                        function0.invoke();
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Eu.I28 f70362O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70363n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(Eu.I28 i28, Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f70362O = i28;
            this.J2 = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CN3.this.new Wre(this.f70362O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f70363n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC2210n interfaceC2210n = CN3.this.injet;
                Eu.I28 i28 = this.f70362O;
                this.f70363n = 1;
                obj = Eu.Wre.n(interfaceC2210n, i28, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            Function0 function0 = this.J2;
            if (!(nVar instanceof n.C1266n)) {
                if (nVar instanceof n.w6) {
                    if (((Boolean) ((n.w6) nVar).n()).booleanValue()) {
                        function0.invoke();
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ FirebaseAuth f70365O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70366n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(FirebaseAuth firebaseAuth, Continuation continuation) {
            super(2, continuation);
            this.f70365O = firebaseAuth;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CN3.this.new n(this.f70365O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f70366n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                wtO.n nVar = CN3.this.cleanUpFailedUploadsUseCase;
                String uid = this.f70365O.getUid();
                this.f70366n = 1;
                if (n.j.n(nVar, uid, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f70368O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70369n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(String str, Continuation continuation) {
            super(2, continuation);
            this.f70368O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CN3.this.new w6(this.f70368O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f70369n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                wtO.n nVar = CN3.this.cleanUpFailedUploadsUseCase;
                String str = this.f70368O;
                Long lBoxLong = Boxing.boxLong(1000L);
                this.f70369n = 1;
                if (nVar.n(str, lBoxLong, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean WPU() {
        return false;
    }

    @Override // uW.w6
    public void Uo() {
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[eO.values().length];
            try {
                iArr[eO.f73082n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eO.f73085t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eO.J2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[eO.f73081O.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CN3(wtO.j buildAndUploadProjectToCloudUseCase, wtO.w6 deleteFromCloudUseCase, wtO.Ml downloadFromCloudUseCase, wtO.Dsr linkLocalAndCloudProjectUseCase, wtO.Wre getCloudProjectsUseCase, wtO.CN3 getCurrentCloudStorageStatusUseCase, wtO.n cleanUpFailedUploadsUseCase, iF eventLogger, xAo.I28 crisperManager, nYs.Ml getAlightSettingsUseCase, InterfaceC2210n injet) {
        super(new Function1() { // from class: l.Wre
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CN3.Ik((C) obj);
            }
        });
        Intrinsics.checkNotNullParameter(buildAndUploadProjectToCloudUseCase, "buildAndUploadProjectToCloudUseCase");
        Intrinsics.checkNotNullParameter(deleteFromCloudUseCase, "deleteFromCloudUseCase");
        Intrinsics.checkNotNullParameter(downloadFromCloudUseCase, "downloadFromCloudUseCase");
        Intrinsics.checkNotNullParameter(linkLocalAndCloudProjectUseCase, "linkLocalAndCloudProjectUseCase");
        Intrinsics.checkNotNullParameter(getCloudProjectsUseCase, "getCloudProjectsUseCase");
        Intrinsics.checkNotNullParameter(getCurrentCloudStorageStatusUseCase, "getCurrentCloudStorageStatusUseCase");
        Intrinsics.checkNotNullParameter(cleanUpFailedUploadsUseCase, "cleanUpFailedUploadsUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(crisperManager, "crisperManager");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(injet, "injet");
        this.buildAndUploadProjectToCloudUseCase = buildAndUploadProjectToCloudUseCase;
        this.deleteFromCloudUseCase = deleteFromCloudUseCase;
        this.downloadFromCloudUseCase = downloadFromCloudUseCase;
        this.linkLocalAndCloudProjectUseCase = linkLocalAndCloudProjectUseCase;
        this.getCloudProjectsUseCase = getCloudProjectsUseCase;
        this.getCurrentCloudStorageStatusUseCase = getCurrentCloudStorageStatusUseCase;
        this.cleanUpFailedUploadsUseCase = cleanUpFailedUploadsUseCase;
        this.eventLogger = eventLogger;
        this.crisperManager = crisperManager;
        this.getAlightSettingsUseCase = getAlightSettingsUseCase;
        this.injet = injet;
        mUb(new C(null, null, null, 7, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E2(Function0 function0, ComponentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xo Ik(C it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return aC.n(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(Function0 function0, ComponentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void ViF(FirebaseAuth auth) {
        Intrinsics.checkNotNullParameter(auth, "auth");
        this.getCloudProjectsUseCase.rl(auth.getUid());
        GJW.C.nr(ViewModelKt.n(this), null, null, new n(auth, null), 3, null);
    }

    public final void X(Context context, String uid, ProjectInfo.n projectInfo, SceneThumbnailMaker thumbnailMaker, eO requestTriggerPoint, Boolean overwritePrevious) {
        sqD.CN3 afxVar;
        Eu.I28 i28;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(projectInfo, "projectInfo");
        Intrinsics.checkNotNullParameter(thumbnailMaker, "thumbnailMaker");
        Intrinsics.checkNotNullParameter(requestTriggerPoint, "requestTriggerPoint");
        if (this.linkLocalAndCloudProjectUseCase.t(uid, projectInfo.getId()) != null && overwritePrevious == null) {
            xMQ(new AbstractC2254j.w6(projectInfo, requestTriggerPoint));
            return;
        }
        this.eventLogger.n(new j.UGc(requestTriggerPoint));
        nY(uid);
        final xuv xuvVarNr = GJW.C.nr(ViewModelKt.n(this), null, h.f3489t, new C1044CN3(context, uid, projectInfo, overwritePrevious, thumbnailMaker, null), 1, null);
        final Function0 function0 = new Function0() { // from class: l.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(CN3.T(this.f70382n, xuvVarNr));
            }
        };
        nYs.j jVarInvoke = this.getAlightSettingsUseCase.invoke();
        if (jVarInvoke == null || !jVarInvoke.Xw()) {
            int i2 = j.$EnumSwitchMapping$0[requestTriggerPoint.ordinal()];
            if (i2 == 1) {
                afxVar = new afx(DAz.f75218O);
            } else if (i2 == 2) {
                afxVar = new Q(DAz.f75218O);
            } else {
                if (i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                afxVar = xAo.Xo.f75269n;
            }
            this.crisperManager.r(afxVar, new Function1() { // from class: l.w6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CN3.N(function0, (ComponentActivity) obj);
                }
            });
            return;
        }
        int i3 = j.$EnumSwitchMapping$0[requestTriggerPoint.ordinal()];
        if (i3 == 1) {
            i28 = Eu.I28.f2380T;
        } else if (i3 == 2) {
            i28 = Eu.I28.f2382X;
        } else {
            if (i3 != 3 && i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i28 = Eu.I28.Xw;
        }
        GJW.C.nr(ViewModelKt.n(this), null, null, new Wre(i28, function0, null), 3, null);
    }

    public final rv6 aYN() {
        return this.getCloudProjectsUseCase.n();
    }

    public final void e() {
        xAo.I28.o(this.crisperManager, xAo.qz.f75308n, null, 2, null);
    }

    public final Object g(String str, String str2, Continuation continuation) {
        Object objN = this.deleteFromCloudUseCase.n(str, str2, continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    public final void iF(Context context, String uid, String cloudProjectId, Boolean overwritePrevious, Function0 onSuccess) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(cloudProjectId, "cloudProjectId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        String strRl = this.linkLocalAndCloudProjectUseCase.rl(cloudProjectId);
        CloudStorageStatus cloudStorageStatus = (CloudStorageStatus) this.getCurrentCloudStorageStatusUseCase.invoke().getValue();
        if (strRl != null && overwritePrevious == null) {
            xMQ(new AbstractC2254j.n(cloudProjectId));
            return;
        }
        if (cloudStorageStatus != null && 0 < cloudStorageStatus.getAllowedStorage() && cloudStorageStatus.getAllowedStorage() < cloudStorageStatus.getUsedStorage()) {
            xMQ(new AbstractC2254j.C1045j(cloudStorageStatus.getAllowedStorage(), WPU()));
            return;
        }
        this.eventLogger.n(j.Xo.f8469n);
        nY(uid);
        final xuv xuvVarNr = GJW.C.nr(ViewModelKt.n(this), null, h.f3489t, new I28(context, uid, cloudProjectId, overwritePrevious, onSuccess, null), 1, null);
        final Function0 function0 = new Function0() { // from class: l.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(CN3.fD(this.f70373n, xuvVarNr));
            }
        };
        nYs.j jVarInvoke = this.getAlightSettingsUseCase.invoke();
        if (jVarInvoke == null || !jVarInvoke.Xw()) {
            this.crisperManager.r(xAo.Pl.f75264n, new Function1() { // from class: l.I28
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CN3.E2(function0, (ComponentActivity) obj);
                }
            });
        } else {
            GJW.C.nr(ViewModelKt.n(this), null, null, new Ml(function0, null), 3, null);
        }
    }

    public final void nY(String uid) {
        xuv xuvVarT;
        Intrinsics.checkNotNullParameter(uid, "uid");
        C c2 = (C) nr();
        if (c2 == null || (xuvVarT = c2.t()) == null) {
            return;
        }
        mUb(new C(null, null, null, 7, null));
        xuv.j.rl(xuvVarT, null, 1, null);
        GJW.C.nr(ViewModelKt.n(this), null, null, new w6(uid, null), 3, null);
    }

    public final void te(Vi.CN3 projectListHost, String cloudProjectId, List localProjects) {
        Object next;
        Intrinsics.checkNotNullParameter(projectListHost, "projectListHost");
        Intrinsics.checkNotNullParameter(cloudProjectId, "cloudProjectId");
        Intrinsics.checkNotNullParameter(localProjects, "localProjects");
        String strRl = this.linkLocalAndCloudProjectUseCase.rl(cloudProjectId);
        if (strRl != null) {
            Iterator it = localProjects.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.areEqual(((ProjectInfo.n) next).getId(), strRl)) {
                        break;
                    }
                }
            }
            ProjectInfo.n nVar = (ProjectInfo.n) next;
            if (nVar != null) {
                projectListHost.r(six.Dsr.rl(nVar.getType(), null, 1, null), nVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean T(CN3 cn3, xuv xuvVar) {
        C cN;
        C c2 = (C) cn3.nr();
        if (c2 != null) {
            cN = c2.n(okd.j.f71566n, Float.valueOf(0.0f), xuvVar);
        } else {
            cN = null;
        }
        cn3.mUb(cN);
        return xuvVar.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fD(CN3 cn3, xuv xuvVar) {
        C cN;
        C c2 = (C) cn3.nr();
        if (c2 != null) {
            cN = c2.n(okd.j.f71567t, Float.valueOf(0.0f), xuvVar);
        } else {
            cN = null;
        }
        cn3.mUb(cN);
        return xuvVar.start();
    }
}
