package GW;

import GJW.vd;
import GJW.xuv;
import GJW.yg;
import GW.n;
import GW.r;
import QmE.K;
import QmE.M;
import QmE.Md;
import QmE.P;
import QmE.Zs;
import QmE.h;
import QmE.iF;
import QmE.psW;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import com.alightcreative.app.motion.activities.main.maintabs.templates.models.TemplateFiltersItem;
import com.alightcreative.app.motion.templates.Template;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import pP.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002./B-\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u0015J\u001f\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\"\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u00060"}, d2 = {"LGW/r;", "LuW/w6;", "LGW/s4;", "LGW/nKK;", "LGW/n;", "LpP/Wre;", "repository", "LQmE/iF;", "eventLogger", "Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content;", "filter", "", "pagesLoaded", "<init>", "(LpP/Wre;LQmE/iF;Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content;I)V", "", "isSaved", "", "aYN", "(Z)V", "r", "()V", "Lcom/alightcreative/app/motion/templates/Template;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62175h, "XQ", "(Lcom/alightcreative/app/motion/templates/Template;)V", "WPU", "S", "", "templateId", "LGW/r$Wre;", "swipeDirection", "o", "(Ljava/lang/String;LGW/r$Wre;)V", "Uo", "LpP/Wre;", "KN", "LQmE/iF;", "xMQ", "Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content;", "mUb", "I", "LGJW/xuv;", "gh", "LGJW/xuv;", "hideAddedToFavouritesBannerJob", "Wre", "I28", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReelsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReelsViewModel.kt\ncom/alightcreative/app/motion/activities/main/templatepreview/reels/ReelsViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
public final class r extends uW.w6 {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final iF eventLogger;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final pP.Wre repository;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private xuv hideAddedToFavouritesBannerJob;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final int pagesLoaded;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final TemplateFiltersItem.Content filter;

    static final class C extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Template f3658O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3659n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(Template template, Continuation continuation) {
            super(2, continuation);
            this.f3658O = template;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return r.this.new C(this.f3658O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3659n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                pP.Wre wre = r.this.repository;
                String templateId = this.f3658O.getTemplateId();
                this.f3659n = 1;
                if (wre.rl(templateId, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Dsr extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3661n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Dsr) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Dsr(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return r.this.new Dsr(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3661n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                pP.Wre wre = r.this.repository;
                this.f3661n = 1;
                if (wre.n(true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public interface I28 {
        r n(TemplateFiltersItem.Content content, int i2);
    }

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3663n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Ml(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(r rVar, boolean z2, s4 s4Var) {
            rVar.mUb(s4.rl(s4Var, null, null, null, false, !z2, null, 47, null));
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return r.this.new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3663n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreJ2 = r.this.repository.J2();
                this.f3663n = 1;
                obj = TFv.fuX.ViF(wreJ2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            final boolean zBooleanValue = ((Boolean) obj).booleanValue();
            final r rVar = r.this;
            rVar.gh(new Function1() { // from class: GW.ci
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return r.Ml.O(rVar, zBooleanValue, (s4) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Wre {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ Wre[] f3665O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Wre f3666n = new Wre("UP", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Wre f3667t = new Wre("DOWN", 1);

        static {
            Wre[] wreArrN = n();
            f3665O = wreArrN;
            J2 = EnumEntriesKt.enumEntries(wreArrN);
        }

        private static final /* synthetic */ Wre[] n() {
            return new Wre[]{f3666n, f3667t};
        }

        public static Wre valueOf(String str) {
            return (Wre) Enum.valueOf(Wre.class, str);
        }

        public static Wre[] values() {
            return (Wre[]) f3665O.clone();
        }

        private Wre(String str, int i2) {
        }
    }

    static final class aC extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Template f3668O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3669n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((aC) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        aC(Template template, Continuation continuation) {
            super(2, continuation);
            this.f3668O = template;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return r.this.new aC(this.f3668O, continuation);
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
            int i2 = this.f3669n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        boolean zContains = ((Set) obj).contains(this.f3668O.getTemplateId());
                        r.this.eventLogger.n(new Zs(this.f3668O.getTrackingValue(), zContains));
                        r.this.aYN(zContains);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                pP.Wre wre = r.this.repository;
                String templateId = this.f3668O.getTemplateId();
                this.f3669n = 1;
                if (wre.t(templateId, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            TFv.Wre wreKN = r.this.repository.KN();
            this.f3669n = 2;
            obj = TFv.fuX.ViF(wreKN, this);
        }
    }

    static final class fuX extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f3671O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3672n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((fuX) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        fuX(String str, Continuation continuation) {
            super(2, continuation);
            this.f3671O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return r.this.new fuX(this.f3671O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3672n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                pP.Wre wre = r.this.repository;
                String str = this.f3671O;
                this.f3672n = 1;
                if (wre.nr(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f3674n = new j();

        j() {
            super(1, s4.class, "toViewState", "toViewState()Lcom/alightcreative/app/motion/activities/main/templatepreview/reels/ReelsViewState;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final nKK invoke(s4 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.nr();
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f3675O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3676n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3678t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return r.this.new n(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0067 -> B:14:0x006a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Iterator<Integer> it;
            r rVar;
            Collection collection;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.J2;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                IntRange intRangeUntil = RangesKt.until(0, r.this.pagesLoaded);
                r rVar2 = r.this;
                ArrayList arrayList = new ArrayList();
                it = intRangeUntil.iterator();
                rVar = rVar2;
                collection = arrayList;
                if (it.hasNext()) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Iterator<Integer> it2 = (Iterator) this.f3675O;
                Collection collection2 = (Collection) this.f3678t;
                r rVar3 = (r) this.f3676n;
                ResultKt.throwOnFailure(obj);
                it = it2;
                collection = collection2;
                rVar = rVar3;
                Object objN = obj;
                List list = (List) x0X.w6.nr((x0X.n) objN);
                List listXMQ = list == null ? com.alightcreative.app.motion.templates.Ml.xMQ(list) : null;
                if (listXMQ != null) {
                    collection.add(listXMQ);
                }
                if (it.hasNext()) {
                    int iNextInt = ((IntIterator) it).nextInt();
                    pP.Wre wre = rVar.repository;
                    this.f3676n = rVar;
                    this.f3678t = collection;
                    this.f3675O = it;
                    this.J2 = 1;
                    objN = Wre.j.n(wre, iNextInt, false, this, 2, null);
                    if (objN == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    List list2 = (List) x0X.w6.nr((x0X.n) objN);
                    if (list2 == null) {
                    }
                    if (listXMQ != null) {
                    }
                    if (it.hasNext()) {
                        List listFlatten = CollectionsKt.flatten((List) collection);
                        r rVar4 = r.this;
                        s4 s4Var = (s4) rVar4.nr();
                        rVar4.mUb(s4Var != null ? s4.rl(s4Var, listFlatten, null, null, false, false, null, 62, null) : null);
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    static final class o extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3679n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((o) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        o(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(r rVar, s4 s4Var) {
            rVar.mUb(s4.rl(s4Var, null, null, null, false, false, null, 55, null));
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return r.this.new o(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3679n;
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
                this.f3679n = 1;
                if (yg.t(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            final r rVar = r.this;
            rVar.gh(new Function1() { // from class: GW.g9s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return r.o.O(rVar, (s4) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3681n;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ r f3683O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f3684n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f3685t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(r rVar, Continuation continuation) {
                super(2, continuation);
                this.f3683O = rVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit xMQ(r rVar, Set set, s4 s4Var) {
                rVar.mUb(s4.rl(s4Var, null, null, set, false, false, null, 59, null));
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f3683O, continuation);
                jVar.f3685t = obj;
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
                if (this.f3684n == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Set set = (Set) this.f3685t;
                    final r rVar = this.f3683O;
                    rVar.gh(new Function1() { // from class: GW.SPz
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return r.w6.j.xMQ(rVar, set, (s4) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            return r.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3681n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreKN = r.this.repository.KN();
                j jVar = new j(r.this, null);
                this.f3681n = 1;
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

    public /* synthetic */ class CN3 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Wre.values().length];
            try {
                iArr[Wre.f3666n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Wre.f3667t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(pP.Wre repository, iF eventLogger, TemplateFiltersItem.Content filter, int i2) {
        super(j.f3674n);
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.repository = repository;
        this.eventLogger = eventLogger;
        this.filter = filter;
        this.pagesLoaded = i2;
        eventLogger.n(new K(K.j.C0291j.rl));
        mUb(new s4(null, filter, null, false, false, null, 61, null));
        GJW.C.nr(ViewModelKt.n(this), null, null, new n(null), 3, null);
        GJW.C.nr(ViewModelKt.n(this), null, null, new w6(null), 3, null);
        GJW.C.nr(ViewModelKt.n(this), null, null, new Ml(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ViF(r rVar, boolean z2, s4 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        xuv xuvVar = rVar.hideAddedToFavouritesBannerJob;
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
        rVar.mUb(s4.rl(state, null, null, null, z2, false, null, 55, null));
        if (z2) {
            rVar.hideAddedToFavouritesBannerJob = GJW.C.nr(ViewModelKt.n(rVar), null, null, rVar.new o(null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(Wre wre, r rVar, String str, s4 state) {
        QmE.j jVar;
        Intrinsics.checkNotNullParameter(state, "state");
        int i2 = wre == null ? -1 : CN3.$EnumSwitchMapping$0[wre.ordinal()];
        if (i2 == -1) {
            jVar = null;
        } else if (i2 == 1) {
            jVar = Md.f8351n;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            jVar = psW.f8613n;
        }
        if (jVar != null) {
            rVar.eventLogger.n(jVar);
        }
        rVar.mUb(s4.rl(state, null, null, null, false, wre != null ? false : state.t(), str, 15, null));
        GJW.C.nr(ViewModelKt.n(rVar), null, null, rVar.new fuX(str, null), 3, null);
        if (wre != null) {
            GJW.C.nr(ViewModelKt.n(rVar), null, null, rVar.new Dsr(null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aYN(final boolean isSaved) {
        gh(new Function1() { // from class: GW.Q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.ViF(this.f3573n, isSaved, (s4) obj);
            }
        });
    }

    public final void S() {
        this.eventLogger.n(h.f8371n);
        xMQ(n.w6.f3651n);
    }

    public final void WPU(Template template) {
        Intrinsics.checkNotNullParameter(template, "template");
        this.eventLogger.n(new P(template.getTrackingValue()));
        xMQ(new n.C0128n(template));
        GJW.C.nr(ViewModelKt.n(this), null, null, new C(template, null), 3, null);
    }

    public final void XQ(Template template) {
        Intrinsics.checkNotNullParameter(template, "template");
        GJW.C.nr(ViewModelKt.n(this), null, null, new aC(template, null), 3, null);
    }

    public final void o(final String templateId, final Wre swipeDirection) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        gh(new Function1() { // from class: GW.UGc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.Z(swipeDirection, this, templateId, (s4) obj);
            }
        });
    }

    public final void r() {
        this.eventLogger.n(M.f8350n);
        xMQ(n.j.f3649n);
    }
}
