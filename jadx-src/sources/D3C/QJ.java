package D3C;

import D3C.n;
import GJW.vd;
import GJW.yg;
import QmE.DAz;
import QmE.Ew;
import QmE.Ln;
import QmE.Z;
import QmE.afx;
import QmE.iF;
import QmE.iwV;
import QmE.lej;
import QmE.nKK;
import QmE.u;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.templates.Template;
import java.util.ArrayList;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import pP.Wre;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\rJ\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\rJ\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\rJ\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LD3C/QJ;", "LuW/w6;", "LD3C/l3D;", "LD3C/Q;", "LD3C/n;", "LpP/Wre;", "templatesRepository", "LQmE/iF;", "eventLogger", "<init>", "(LpP/Wre;LQmE/iF;)V", "", "Uo", "()V", "WPU", "S", "HI", "r", "ck", "Ik", "Lcom/alightcreative/app/motion/project/ProjectInfo;", "project", "o", "(Lcom/alightcreative/app/motion/project/ProjectInfo;)V", "Lcom/alightcreative/app/motion/templates/Template$Tag;", "tag", "Z", "(Ljava/lang/String;)V", "aYN", "LpP/Wre;", "KN", "LQmE/iF;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/alightcreative/app/motion/activities/main/maintabs/home/HomeViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
public final class QJ extends uW.w6 {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final iF eventLogger;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final pP.Wre templatesRepository;

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f1238n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Ml(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return QJ.this.new Ml(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r8 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            x0X.n w6Var;
            l3D l3dRl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1238n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        x0X.n nVar = (x0X.n) obj;
                        if (nVar instanceof n.C1266n) {
                            w6Var = nVar;
                        } else if (nVar instanceof n.w6) {
                            List list = (List) ((n.w6) nVar).n();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                if (((Template) obj2).getVideoUrl().length() > 0) {
                                    arrayList.add(obj2);
                                }
                            }
                            w6Var = new n.w6(com.alightcreative.app.motion.templates.Ml.xMQ(arrayList));
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        QJ qj = QJ.this;
                        l3D l3d = (l3D) qj.nr();
                        if (l3d != null) {
                            l3dRl = l3D.rl(l3d, w6Var, null, false, 2, null);
                        } else {
                            l3dRl = null;
                        }
                        qj.mUb(l3dRl);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(50, DurationUnit.MILLISECONDS);
                this.f1238n = 1;
                if (yg.t(duration, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            pP.Wre wre = QJ.this.templatesRepository;
            this.f1238n = 2;
            obj = wre.O(0, true, this);
        }
    }

    /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f1240n = new j();

        j() {
            super(1, l3D.class, "toViewState", "toViewState()Lcom/alightcreative/app/motion/activities/main/maintabs/home/HomeViewState;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Q invoke(l3D p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.O();
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f1241n;

        static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ QJ f1243n;

            j(QJ qj) {
                this.f1243n = qj;
            }

            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(Set set, Continuation continuation) {
                QJ qj = this.f1243n;
                l3D l3d = (l3D) qj.nr();
                qj.mUb(l3d != null ? l3D.rl(l3d, null, set, false, 5, null) : null);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return QJ.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1241n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreUo = QJ.this.templatesRepository.Uo();
                j jVar = new j(QJ.this);
                this.f1241n = 1;
                if (wreUo.n(jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f1244n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return QJ.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            w6 w6Var;
            x0X.n w6Var2;
            l3D l3dRl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1244n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    w6Var = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                pP.Wre wre = QJ.this.templatesRepository;
                this.f1244n = 1;
                w6Var = this;
                obj = Wre.j.n(wre, 0, false, w6Var, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            if (nVar instanceof n.C1266n) {
                w6Var2 = nVar;
            } else if (nVar instanceof n.w6) {
                List list = (List) ((n.w6) nVar).n();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((Template) obj2).getVideoUrl().length() > 0) {
                        arrayList.add(obj2);
                    }
                }
                w6Var2 = new n.w6(com.alightcreative.app.motion.templates.Ml.xMQ(arrayList));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            QJ qj = QJ.this;
            l3D l3d = (l3D) qj.nr();
            if (l3d != null) {
                l3dRl = l3D.rl(l3d, w6Var2, null, false, 6, null);
            } else {
                l3dRl = null;
            }
            qj.mUb(l3dRl);
            return Unit.INSTANCE;
        }
    }

    @Override // uW.w6
    public void Uo() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QJ(pP.Wre templatesRepository, iF eventLogger) {
        super(j.f1240n);
        Intrinsics.checkNotNullParameter(templatesRepository, "templatesRepository");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.templatesRepository = templatesRepository;
        this.eventLogger = eventLogger;
        mUb(new l3D(null, null, false, 7, null));
        GJW.C.nr(ViewModelKt.n(this), null, null, new n(null), 3, null);
        GJW.C.nr(ViewModelKt.n(this), null, null, new w6(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ViF(QJ qj, l3D state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.nr()) {
            return Unit.INSTANCE;
        }
        qj.eventLogger.n(u.f8620n);
        x0X.n nVarT = state.t();
        qj.mUb(l3D.rl(state, (nVarT == null || !x0X.w6.J2(nVarT)) ? null : nVarT, null, true, 2, null));
        GJW.C.nr(ViewModelKt.n(qj), null, null, qj.new Ml(null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit XQ(QJ qj, String str, l3D state) {
        Intrinsics.checkNotNullParameter(state, "state");
        qj.eventLogger.n(new Ln(str, null));
        qj.xMQ(new n.Ml(str, null));
        return Unit.INSTANCE;
    }

    public final void HI() {
        this.eventLogger.n(afx.f8365n);
        xMQ(n.j.f1282n);
    }

    public final void Ik() {
        this.eventLogger.n(Ew.f8344n);
        xMQ(n.I28.f1279n);
    }

    public final void S() {
        this.eventLogger.n(lej.f8608n);
        xMQ(n.w6.f1284n);
    }

    public final void WPU() {
        this.eventLogger.n(iwV.f8372n);
        xMQ(n.I28.f1279n);
    }

    public final void Z(final String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        gh(new Function1() { // from class: D3C.eO
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QJ.XQ(this.f1257n, tag, (l3D) obj);
            }
        });
    }

    public final void aYN() {
        gh(new Function1() { // from class: D3C.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QJ.ViF(this.f1292n, (l3D) obj);
            }
        });
    }

    public final void ck() {
        this.eventLogger.n(Z.f8361n);
        xMQ(n.j.f1282n);
    }

    public final void o(ProjectInfo project) {
        Intrinsics.checkNotNullParameter(project, "project");
        this.eventLogger.n(DAz.f8342n);
        xMQ(new n.C0046n(project));
    }

    public final void r() {
        this.eventLogger.n(nKK.f8611n);
        xMQ(n.Wre.f1281n);
    }
}
