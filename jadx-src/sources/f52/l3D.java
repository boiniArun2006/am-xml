package f52;

import GJW.vd;
import GJW.yg;
import QmE.C1434c;
import QmE.ci;
import QmE.g9s;
import QmE.iF;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import com.alightcreative.app.motion.activities.main.maintabs.templates.models.TemplateFiltersItem;
import com.alightcreative.app.motion.templates.Template;
import f52.w6;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0012J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u0012J\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\rJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lf52/l3D;", "LuW/w6;", "Lf52/c;", "Lf52/r;", "Lf52/w6;", "LpP/Wre;", "repository", "LQmE/iF;", "eventLogger", "<init>", "(LpP/Wre;LQmE/iF;)V", "", "Uo", "()V", "te", "Lcom/alightcreative/app/motion/templates/Template$Tag;", "tag", "WPU", "(Ljava/lang/String;)V", "", "templateId", "ViF", "Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content;", "filter", "o", "(Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content;)V", "g", "iF", "XQ", "LpP/Wre;", "KN", "LQmE/iF;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTemplatesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemplatesViewModel.kt\ncom/alightcreative/app/motion/activities/main/maintabs/templates/TemplatesViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,260:1\n1#2:261\n*E\n"})
public final class l3D extends uW.w6 {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final iF eventLogger;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final pP.Wre repository;

    static final class CN3 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66522n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        CN3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return l3D.this.new CN3(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r11 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            x0X.n w6Var;
            C2101c c2101cRl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66522n;
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
                            w6Var = new n.w6(CollectionsKt.listOf(com.alightcreative.app.motion.templates.Ml.xMQ(arrayList)));
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        l3D l3d = l3D.this;
                        C2101c c2101c = (C2101c) l3d.nr();
                        if (c2101c != null) {
                            c2101cRl = C2101c.rl(c2101c, w6Var, null, null, null, false, false, 30, null);
                        } else {
                            c2101cRl = null;
                        }
                        l3d.mUb(c2101cRl);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(50, DurationUnit.MILLISECONDS);
                this.f66522n = 1;
                if (yg.t(duration, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            pP.Wre wre = l3D.this.repository;
            this.f66522n = 2;
            obj = wre.O(0, true, this);
        }
    }

    static final class I28 extends SuspendLambda implements Function2 {
        final /* synthetic */ List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f66524O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66525n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(int i2, List list, Continuation continuation) {
            super(2, continuation);
            this.f66524O = i2;
            this.J2 = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return l3D.this.new I28(this.f66524O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objN;
            x0X.n nVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66525n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    objN = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                pP.Wre wre = l3D.this.repository;
                int i3 = this.f66524O;
                this.f66525n = 1;
                objN = Wre.j.n(wre, i3, false, this, 2, null);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVarO = (x0X.n) objN;
            List list = this.J2;
            if (!(nVarO instanceof n.C1266n)) {
                if (nVarO instanceof n.w6) {
                    List list2 = (List) ((n.w6) nVarO).n();
                    List listCreateListBuilder = CollectionsKt.createListBuilder();
                    listCreateListBuilder.addAll(list);
                    listCreateListBuilder.add(com.alightcreative.app.motion.templates.Ml.xMQ(list2));
                    nVarO = new n.w6(CollectionsKt.build(listCreateListBuilder));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            l3D l3d = l3D.this;
            C2101c c2101c = (C2101c) l3d.nr();
            C2101c c2101cRl = null;
            if (c2101c != null) {
                if (x0X.w6.J2(nVarO)) {
                    nVar = nVarO;
                    c2101cRl = C2101c.rl(c2101c, nVar, null, null, null, false, false, 46, null);
                } else {
                    C2101c c2101c2 = (C2101c) l3d.nr();
                    if (c2101c2 != null) {
                        nVarO = c2101c2.O();
                        nVar = nVarO;
                        c2101cRl = C2101c.rl(c2101c, nVar, null, null, null, false, false, 46, null);
                    } else {
                        nVar = null;
                        c2101cRl = C2101c.rl(c2101c, nVar, null, null, null, false, false, 46, null);
                    }
                }
            }
            l3d.mUb(c2101cRl);
            return Unit.INSTANCE;
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66527n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Ml(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return l3D.this.new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objN;
            x0X.n w6Var;
            C2101c c2101cRl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66527n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    objN = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                pP.Wre wre = l3D.this.repository;
                this.f66527n = 1;
                objN = Wre.j.n(wre, 0, false, this, 2, null);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) objN;
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
                w6Var = new n.w6(CollectionsKt.listOf(com.alightcreative.app.motion.templates.Ml.xMQ(arrayList)));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            l3D l3d = l3D.this;
            C2101c c2101c = (C2101c) l3d.nr();
            if (c2101c != null) {
                c2101cRl = C2101c.rl(c2101c, w6Var, null, null, null, false, false, 62, null);
            } else {
                c2101cRl = null;
            }
            l3d.mUb(c2101cRl);
            return Unit.INSTANCE;
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f66529O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66530n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(String str, Continuation continuation) {
            super(2, continuation);
            this.f66529O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return l3D.this.new Wre(this.f66529O, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List listT;
            Object next;
            String trackingValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66530n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        boolean zContains = ((Set) obj).contains(this.f66529O);
                        C2101c c2101c = (C2101c) l3D.this.nr();
                        if (c2101c != null && (listT = c2101c.t()) != null) {
                            String str = this.f66529O;
                            Iterator it = listT.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (Intrinsics.areEqual(((Template) next).getTemplateId(), str)) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            Template template = (Template) next;
                            if (template != null && (trackingValue = template.getTrackingValue()) != null) {
                                l3D.this.eventLogger.n(new QmE.r(trackingValue, zContains));
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                pP.Wre wre = l3D.this.repository;
                String str2 = this.f66529O;
                this.f66530n = 1;
                if (wre.t(str2, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            TFv.Wre wreKN = l3D.this.repository.KN();
            this.f66530n = 2;
            obj = TFv.fuX.ViF(wreKN, this);
        }
    }

    /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f66532n = new j();

        j() {
            super(1, C2101c.class, "toViewState", "toViewState()Lcom/alightcreative/app/motion/activities/main/maintabs/templates/TemplatesViewState;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final r invoke(C2101c p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.KN();
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66533n;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ l3D f66535O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f66536n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f66537t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(l3D l3d, Continuation continuation) {
                super(2, continuation);
                this.f66535O = l3d;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f66535O, continuation);
                jVar.f66537t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C2101c c2101cRl;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f66536n == 0) {
                    ResultKt.throwOnFailure(obj);
                    Set set = (Set) this.f66537t;
                    l3D l3d = this.f66535O;
                    C2101c c2101c = (C2101c) l3d.nr();
                    if (c2101c != null) {
                        c2101cRl = C2101c.rl(c2101c, null, set, null, null, false, false, 61, null);
                    } else {
                        c2101cRl = null;
                    }
                    l3d.mUb(c2101cRl);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Set set, Continuation continuation) {
                return ((j) create(set, continuation)).invokeSuspend(Unit.INSTANCE);
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
            return l3D.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66533n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreUo = l3D.this.repository.Uo();
                j jVar = new j(l3D.this, null);
                this.f66533n = 1;
                if (TFv.fuX.gh(wreUo, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66538n;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ l3D f66540O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f66541n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f66542t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(l3D l3d, Continuation continuation) {
                super(2, continuation);
                this.f66540O = l3d;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f66540O, continuation);
                jVar.f66542t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C2101c c2101cRl;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f66541n == 0) {
                    ResultKt.throwOnFailure(obj);
                    Set set = (Set) this.f66542t;
                    l3D l3d = this.f66540O;
                    C2101c c2101c = (C2101c) l3d.nr();
                    if (c2101c != null) {
                        c2101cRl = C2101c.rl(c2101c, null, null, set, null, false, false, 59, null);
                    } else {
                        c2101cRl = null;
                    }
                    l3d.mUb(c2101cRl);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Set set, Continuation continuation) {
                return ((j) create(set, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return l3D.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66538n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreKN = l3D.this.repository.KN();
                j jVar = new j(l3D.this, null);
                this.f66538n = 1;
                if (TFv.fuX.gh(wreKN, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // uW.w6
    public void Uo() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3D(pP.Wre repository, iF eventLogger) {
        super(j.f66532n);
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.repository = repository;
        this.eventLogger = eventLogger;
        mUb(new C2101c(null, null, null, null, false, false, 63, null));
        GJW.C.nr(ViewModelKt.n(this), null, null, new n(null), 3, null);
        GJW.C.nr(ViewModelKt.n(this), null, null, new w6(null), 3, null);
        GJW.C.nr(ViewModelKt.n(this), null, null, new Ml(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(l3D l3d, C2101c state) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.J2() || state.Uo()) {
            return Unit.INSTANCE;
        }
        x0X.n nVarO = state.O();
        if (nVarO == null || (listEmptyList = (List) x0X.w6.nr(nVarO)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        int size = listEmptyList.size();
        l3d.eventLogger.n(new QmE.l3D(size));
        l3d.mUb(C2101c.rl(state, null, null, null, null, true, false, 47, null));
        GJW.C.nr(ViewModelKt.n(l3d), null, null, l3d.new I28(size, listEmptyList, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(TemplateFiltersItem.Content content, l3D l3d, C2101c state) {
        QmE.j sPz;
        Intrinsics.checkNotNullParameter(state, "state");
        boolean zAreEqual = Intrinsics.areEqual(content, state.nr());
        boolean z2 = !zAreEqual;
        TemplateFiltersItem.Content.AllTemplates allTemplates = TemplateFiltersItem.Content.AllTemplates.f45446O;
        if (Intrinsics.areEqual(content, allTemplates)) {
            sPz = QmE.QJ.f8356n;
        } else if (Intrinsics.areEqual(content, TemplateFiltersItem.Content.Saved.f45448O)) {
            sPz = QmE.s4.f8619n;
        } else {
            if (!(content instanceof TemplateFiltersItem.Content.Tag)) {
                throw new NoWhenBranchMatchedException();
            }
            sPz = new QmE.SPz(((TemplateFiltersItem.Content.Tag) content).getTag(), z2, null);
        }
        l3d.eventLogger.n(sPz);
        l3d.mUb(C2101c.rl(state, null, null, null, !zAreEqual ? content : allTemplates, false, false, 55, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit aYN(l3D l3d, String str, C2101c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        l3d.eventLogger.n(new QmE.Q(str, null));
        l3d.xMQ(new w6.n(str, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fD(l3D l3d, C2101c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.J2() || state.Uo()) {
            return Unit.INSTANCE;
        }
        l3d.eventLogger.n(C1434c.f8366n);
        x0X.n nVarO = state.O();
        l3d.mUb(C2101c.rl(state, (nVarO == null || !x0X.w6.J2(nVarO)) ? null : nVarO, null, null, null, false, true, 30, null));
        GJW.C.nr(ViewModelKt.n(l3d), null, null, l3d.new CN3(null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nY(l3D l3d, String str, C2101c state) {
        List list;
        Object next;
        String trackingValue;
        Intrinsics.checkNotNullParameter(state, "state");
        List listT = state.t();
        if (listT != null) {
            Iterator it = listT.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((Template) next).getTemplateId(), str)) {
                    break;
                }
            }
            Template template = (Template) next;
            if (template != null && (trackingValue = template.getTrackingValue()) != null) {
                l3d.eventLogger.n(new ci(trackingValue));
            }
        }
        TemplateFiltersItem.Content contentNr = state.nr();
        x0X.n nVarO = state.O();
        l3d.xMQ(new w6.j(str, contentNr, (nVarO == null || (list = (List) x0X.w6.nr(nVarO)) == null) ? 0 : list.size()));
        return Unit.INSTANCE;
    }

    public final void ViF(final String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        gh(new Function1() { // from class: f52.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l3D.nY(this.f66569n, templateId, (C2101c) obj);
            }
        });
    }

    public final void WPU(final String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        gh(new Function1() { // from class: f52.Pl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l3D.aYN(this.f66490n, tag, (C2101c) obj);
            }
        });
    }

    public final void XQ() {
        gh(new Function1() { // from class: f52.eO
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l3D.S(this.f66505n, (C2101c) obj);
            }
        });
    }

    public final void g(String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        GJW.C.nr(ViewModelKt.n(this), null, null, new Wre(templateId, null), 3, null);
    }

    public final void iF() {
        gh(new Function1() { // from class: f52.Xo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l3D.fD(this.f66500n, (C2101c) obj);
            }
        });
    }

    public final void o(final TemplateFiltersItem.Content filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        gh(new Function1() { // from class: f52.QJ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l3D.Z(filter, this, (C2101c) obj);
            }
        });
    }

    public final void te() {
        this.eventLogger.n(g9s.f8370n);
        xMQ(w6.C0916w6.f66568n);
    }
}
