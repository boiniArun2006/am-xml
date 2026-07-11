package Pjo;

import GJW.vd;
import GJW.xuv;
import GJW.yg;
import Pjo.QJ;
import Pjo.n;
import QmE.C1449m;
import QmE.K;
import QmE.Lu;
import QmE.M;
import QmE.P;
import QmE.Zs;
import QmE.h;
import QmE.iF;
import QmE.rv6;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import com.alightcreative.app.motion.templates.Template;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import pP.Wre;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001,B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0013J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0013J\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u0013J\r\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u0013J\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u0013J\r\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0013J\r\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010\u0013J\u000f\u0010 \u001a\u00020\u000fH\u0010¢\u0006\u0004\b \u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"LPjo/QJ;", "LuW/w6;", "LPjo/C;", "LPjo/r;", "LPjo/n;", "LpP/Wre;", "repository", "LQmE/iF;", "eventLogger", "", "tagName", "<init>", "(LpP/Wre;LQmE/iF;Ljava/lang/String;)V", "", "isSaved", "", "s7N", "(Z)V", "S", "()V", "X", "", "index", "N", "(I)V", "aYN", "g", "fD", "iF", "nY", "ViF", "e", "Uo", "LpP/Wre;", "KN", "LQmE/iF;", "Lcom/alightcreative/app/motion/templates/Template$Tag;", "xMQ", "Ljava/lang/String;", "tag", "LGJW/xuv;", "mUb", "LGJW/xuv;", "hideAddedToFavouritesBannerJob", "w6", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QJ extends uW.w6 {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final iF eventLogger;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final pP.Wre repository;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private xuv hideAddedToFavouritesBannerJob;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final String tag;

    static final class CN3 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7773n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        CN3(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(QJ qj, C c2) {
            qj.mUb(C.rl(c2, null, null, 0, null, false, 15, null));
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return QJ.this.new CN3(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7773n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
                this.f7773n = 1;
                if (yg.t(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            final QJ qj = QJ.this;
            qj.gh(new Function1() { // from class: Pjo.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return QJ.CN3.O(qj, (C) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Template f7775O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7776n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(Template template, Continuation continuation) {
            super(2, continuation);
            this.f7775O = template;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return QJ.this.new I28(this.f7775O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7776n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                pP.Wre wre = QJ.this.repository;
                String templateId = this.f7775O.getTemplateId();
                this.f7776n = 1;
                if (wre.rl(templateId, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Template f7778O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7779n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(Template template, Continuation continuation) {
            super(2, continuation);
            this.f7778O = template;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return QJ.this.new Ml(this.f7778O, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7779n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        boolean zContains = ((Set) obj).contains(this.f7778O.getTemplateId());
                        QJ.this.eventLogger.n(new Zs(this.f7778O.getTrackingValue(), zContains));
                        QJ.this.s7N(zContains);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                pP.Wre wre = QJ.this.repository;
                String templateId = this.f7778O.getTemplateId();
                this.f7779n = 1;
                if (wre.t(templateId, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            TFv.Wre wreKN = QJ.this.repository.KN();
            this.f7779n = 2;
            obj = TFv.fuX.ViF(wreKN, this);
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ QJ f7781O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7782n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ C f7783t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(C c2, QJ qj, Continuation continuation) {
            super(2, continuation);
            this.f7783t = c2;
            this.f7781O = qj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Wre(this.f7783t, this.f7781O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7782n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Template templateT = this.f7783t.t();
                if (templateT != null) {
                    pP.Wre wre = this.f7781O.repository;
                    String templateId = templateT.getTemplateId();
                    this.f7782n = 1;
                    if (wre.nr(templateId, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f7784n = new j();

        j() {
            super(1, C.class, "toViewState", "toViewState()Lcom/alightcreative/app/motion/activities/main/templatepreview/stories/StoriesViewState;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final r invoke(C p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.J2();
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f7785O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7786n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7787t;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ QJ f7788O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f7789n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f7790t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(QJ qj, Continuation continuation) {
                super(2, continuation);
                this.f7788O = qj;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit xMQ(QJ qj, Set set, C c2) {
                qj.mUb(C.rl(c2, null, null, 0, set, false, 23, null));
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f7788O, continuation);
                jVar.f7790t = obj;
                return jVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Set set, Continuation continuation) {
                return ((j) create(set, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7789n == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Set set = (Set) this.f7790t;
                    final QJ qj = this.f7788O;
                    qj.gh(new Function1() { // from class: Pjo.l3D
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return QJ.n.j.xMQ(qj, set, (C) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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

        /* JADX WARN: Code restructure failed: missing block: B:79:0x01cd, code lost:
        
            if (TFv.fuX.gh(r0, r1, r19) == r6) goto L80;
         */
        /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0174  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0165 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objN;
            List listEmptyList;
            Object objViF;
            List listTake;
            Object objViF2;
            List list;
            Set set;
            Iterator it;
            int i2;
            Integer numBoxInt;
            C c2;
            Template templateT;
            pP.Wre wre;
            String templateId;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f7785O;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                pP.Wre wre2 = QJ.this.repository;
                this.f7785O = 1;
                objN = Wre.j.n(wre2, 0, false, this, 2, null);
                if (objN != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 == 1) {
                ResultKt.throwOnFailure(obj);
                objN = obj;
            } else {
                if (i3 == 2) {
                    listEmptyList = (List) this.f7786n;
                    ResultKt.throwOnFailure(obj);
                    objViF = obj;
                    Set set2 = (Set) objViF;
                    TFv.Wre wreUo = QJ.this.repository.Uo();
                    this.f7786n = listEmptyList;
                    this.f7787t = set2;
                    this.f7785O = 3;
                    objViF2 = TFv.fuX.ViF(wreUo, this);
                    if (objViF2 != coroutine_suspended) {
                        list = listEmptyList;
                        set = set2;
                        Set set3 = (Set) objViF2;
                        it = list.iterator();
                        i2 = 0;
                        while (true) {
                            if (it.hasNext()) {
                            }
                            i2++;
                        }
                        numBoxInt = Boxing.boxInt(i2);
                        if (numBoxInt.intValue() == -1) {
                        }
                        if (numBoxInt != null) {
                        }
                        QJ qj = QJ.this;
                        qj.mUb(new C(qj.tag, list, iIntValue, set, false, null));
                        c2 = (C) QJ.this.nr();
                        if (c2 != null) {
                            wre = QJ.this.repository;
                            templateId = templateT.getTemplateId();
                            this.f7786n = null;
                            this.f7787t = null;
                            this.f7785O = 4;
                            if (wre.nr(templateId, this) != coroutine_suspended) {
                            }
                        }
                        TFv.Wre wreKN = QJ.this.repository.KN();
                        j jVar = new j(QJ.this, null);
                        this.f7786n = null;
                        this.f7787t = null;
                        this.f7785O = 5;
                    }
                    return coroutine_suspended;
                }
                if (i3 == 3) {
                    Set set4 = (Set) this.f7787t;
                    List list2 = (List) this.f7786n;
                    ResultKt.throwOnFailure(obj);
                    objViF2 = obj;
                    set = set4;
                    list = list2;
                    Set set32 = (Set) objViF2;
                    it = list.iterator();
                    i2 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (!set32.contains(((Template) it.next()).getTemplateId())) {
                            break;
                        }
                        i2++;
                    }
                    numBoxInt = Boxing.boxInt(i2);
                    if (numBoxInt.intValue() == -1) {
                        numBoxInt = null;
                    }
                    int iIntValue = numBoxInt != null ? numBoxInt.intValue() : 0;
                    QJ qj2 = QJ.this;
                    qj2.mUb(new C(qj2.tag, list, iIntValue, set, false, null));
                    c2 = (C) QJ.this.nr();
                    if (c2 != null && (templateT = c2.t()) != null) {
                        wre = QJ.this.repository;
                        templateId = templateT.getTemplateId();
                        this.f7786n = null;
                        this.f7787t = null;
                        this.f7785O = 4;
                        if (wre.nr(templateId, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    TFv.Wre wreKN2 = QJ.this.repository.KN();
                    j jVar2 = new j(QJ.this, null);
                    this.f7786n = null;
                    this.f7787t = null;
                    this.f7785O = 5;
                } else {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    TFv.Wre wreKN22 = QJ.this.repository.KN();
                    j jVar22 = new j(QJ.this, null);
                    this.f7786n = null;
                    this.f7787t = null;
                    this.f7785O = 5;
                }
            }
            x0X.n w6Var = (x0X.n) objN;
            if (!(w6Var instanceof n.C1266n)) {
                if (!(w6Var instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list3 = (List) ((n.w6) w6Var).n();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list3) {
                    if (((Template) obj2).getVideoUrl().length() > 0) {
                        arrayList.add(obj2);
                    }
                }
                w6Var = new n.w6(arrayList);
            }
            QJ qj3 = QJ.this;
            if (!(w6Var instanceof n.C1266n)) {
                if (!(w6Var instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list4 = (List) ((n.w6) w6Var).n();
                if (Template.Tag.J2(qj3.tag, Template.Tag.INSTANCE.n())) {
                    listTake = CollectionsKt.take(list4, 20);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list4) {
                        if (((Template) obj3).getTags().contains(Template.Tag.rl(qj3.tag))) {
                            arrayList2.add(obj3);
                        }
                    }
                    listTake = arrayList2;
                }
                w6Var = new n.w6(com.alightcreative.app.motion.templates.Ml.xMQ(listTake));
            }
            listEmptyList = (List) x0X.w6.nr(w6Var);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            TFv.Wre wreKN3 = QJ.this.repository.KN();
            this.f7786n = listEmptyList;
            this.f7785O = 2;
            objViF = TFv.fuX.ViF(wreKN3, this);
            if (objViF != coroutine_suspended) {
                Set set22 = (Set) objViF;
                TFv.Wre wreUo2 = QJ.this.repository.Uo();
                this.f7786n = listEmptyList;
                this.f7787t = set22;
                this.f7785O = 3;
                objViF2 = TFv.fuX.ViF(wreUo2, this);
                if (objViF2 != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    public interface w6 {
        QJ create(String str);
    }

    @Override // uW.w6
    public void Uo() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QJ(pP.Wre repository, iF eventLogger, String tagName) {
        super(j.f7784n);
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        this.repository = repository;
        this.eventLogger = eventLogger;
        String strT = Template.Tag.t(tagName);
        this.tag = strT;
        eventLogger.n(new K(new K.j.n(strT, null)));
        GJW.C.nr(ViewModelKt.n(this), null, null, new n(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E2(QJ qj, C state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Template templateT = state.t();
        if (templateT != null) {
            qj.eventLogger.n(new P(templateT.getTrackingValue()));
            qj.xMQ(new n.C0279n(templateT));
            GJW.C.nr(ViewModelKt.n(qj), null, null, qj.new I28(templateT, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    private final void N(final int index) {
        gh(new Function1() { // from class: Pjo.eO
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QJ.nHg(this.f7824n, index, (C) obj);
            }
        });
    }

    private final void S() {
        gh(new Function1() { // from class: Pjo.Pl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QJ.WPU(this.f7771n, (C) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(QJ qj, C state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.nr() > 0) {
            qj.N(state.nr() - 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WPU(QJ qj, C state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.nr() < state.O().size() - 1) {
            qj.N(state.nr() + 1);
        } else {
            qj.eventLogger.n(rv6.f8618n);
            qj.xMQ(n.j.f7832n);
        }
        return Unit.INSTANCE;
    }

    private final void X() {
        gh(new Function1() { // from class: Pjo.qz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QJ.T(this.f7836n, (C) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nHg(QJ qj, int i2, C state) {
        Intrinsics.checkNotNullParameter(state, "state");
        C cRl = C.rl(state, null, null, i2, null, false, 27, null);
        GJW.C.nr(ViewModelKt.n(qj), null, null, new Wre(cRl, qj, null), 3, null);
        qj.mUb(cRl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s7N(final boolean isSaved) {
        gh(new Function1() { // from class: Pjo.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QJ.wTp(this.f7841n, isSaved, (C) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit te(QJ qj, C state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Template templateT = state.t();
        if (templateT != null) {
            GJW.C.nr(ViewModelKt.n(qj), null, null, qj.new Ml(templateT, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wTp(QJ qj, boolean z2, C state) {
        Intrinsics.checkNotNullParameter(state, "state");
        xuv xuvVar = qj.hideAddedToFavouritesBannerJob;
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
        qj.mUb(C.rl(state, null, null, 0, null, z2, 15, null));
        if (z2) {
            qj.hideAddedToFavouritesBannerJob = GJW.C.nr(ViewModelKt.n(qj), null, null, qj.new CN3(null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public final void ViF() {
        this.eventLogger.n(Lu.f8349n);
        X();
    }

    public final void aYN() {
        this.eventLogger.n(M.f8350n);
        xMQ(n.j.f7832n);
    }

    public final void fD() {
        gh(new Function1() { // from class: Pjo.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QJ.E2(this.f7835n, (C) obj);
            }
        });
    }

    public final void g() {
        gh(new Function1() { // from class: Pjo.Xo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QJ.te(this.f7815n, (C) obj);
            }
        });
    }

    public final void iF() {
        this.eventLogger.n(h.f8371n);
        xMQ(n.w6.f7834n);
    }

    public final void nY() {
        this.eventLogger.n(QmE.vd.f8621n);
        S();
    }

    public final void e() {
        Template templateT;
        String trackingValue;
        C c2 = (C) nr();
        if (c2 != null && (templateT = c2.t()) != null && (trackingValue = templateT.getTrackingValue()) != null) {
            this.eventLogger.n(new C1449m(trackingValue));
        }
        S();
    }
}
