package bH;

import android.content.Context;
import androidx.view.ComponentActivity;
import bH.CN3;
import fb.AbstractC2109j;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f43222n = j.rl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class I28 {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ I28[] f43223O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f43224n = new I28("DEVELOPER", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final I28 f43225t = new I28("PUBLIC", 1);

        static {
            I28[] i28ArrN = n();
            f43223O = i28ArrN;
            J2 = EnumEntriesKt.enumEntries(i28ArrN);
        }

        private static final /* synthetic */ I28[] n() {
            return new I28[]{f43224n, f43225t};
        }

        public static I28 valueOf(String str) {
            return (I28) Enum.valueOf(I28.class, str);
        }

        public static I28[] values() {
            return (I28[]) f43223O.clone();
        }

        private I28(String str, int i2) {
        }
    }

    public static abstract class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final j f43226n;

        public static final class j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f43227n;
            private final long nr;
            private final int rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final long f43228t;

            public /* synthetic */ j(int i2, int i3, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
                this(i2, i3, j2, j3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return this.f43227n == jVar.f43227n && this.rl == jVar.rl && Duration.m1657equalsimpl0(this.f43228t, jVar.f43228t) && Duration.m1657equalsimpl0(this.nr, jVar.nr);
            }

            private j(int i2, int i3, long j2, long j3) {
                this.f43227n = i2;
                this.rl = i3;
                this.f43228t = j2;
                this.nr = j3;
            }

            public int hashCode() {
                return (((((Integer.hashCode(this.f43227n) * 31) + Integer.hashCode(this.rl)) * 31) + Duration.m1673hashCodeimpl(this.f43228t)) * 31) + Duration.m1673hashCodeimpl(this.nr);
            }

            public final long n() {
                return this.f43228t;
            }

            public final int nr() {
                return this.rl;
            }

            public final long rl() {
                return this.nr;
            }

            public final int t() {
                return this.f43227n;
            }

            public String toString() {
                return "Gestures(fingersCount=" + this.f43227n + ", fingersCountDevelopment=" + this.rl + ", delay=" + Duration.m1692toStringimpl(this.f43228t) + ", delayDevelopment=" + Duration.m1692toStringimpl(this.nr) + ")";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ j(int i2, int i3, long j2, long j3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
                long duration;
                long duration2;
                int i7 = (i5 & 1) != 0 ? 4 : i2;
                int i8 = (i5 & 2) != 0 ? 2 : i3;
                if ((4 & i5) != 0) {
                    Duration.Companion companion = Duration.INSTANCE;
                    duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
                } else {
                    duration = j2;
                }
                if ((i5 & 8) != 0) {
                    Duration.Companion companion2 = Duration.INSTANCE;
                    duration2 = DurationKt.toDuration(1, DurationUnit.SECONDS);
                } else {
                    duration2 = j3;
                }
                this(i7, i8, duration, duration2, null);
            }
        }

        public static final class n extends Ml {
            private final ComponentActivity rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final j f43229t;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof n)) {
                    return false;
                }
                n nVar = (n) obj;
                return Intrinsics.areEqual(this.rl, nVar.rl) && Intrinsics.areEqual(this.f43229t, nVar.f43229t);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(ComponentActivity activity, j gestures) {
                super(gestures, null);
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(gestures, "gestures");
                this.rl = activity;
                this.f43229t = gestures;
            }

            public int hashCode() {
                return (this.rl.hashCode() * 31) + this.f43229t.hashCode();
            }

            public final ComponentActivity n() {
                return this.rl;
            }

            public j rl() {
                return this.f43229t;
            }

            public String toString() {
                return "InActivity(activity=" + this.rl + ", gestures=" + this.f43229t + ")";
            }
        }

        public /* synthetic */ Ml(j jVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(jVar);
        }

        private Ml(j jVar) {
            this.f43226n = jVar;
        }
    }

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        /* JADX INFO: renamed from: bH.CN3$j$j, reason: collision with other inner class name */
        static final class C0571j extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f43230n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ aC f43231t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0571j(aC aCVar, Continuation continuation) {
                super(1, continuation);
                this.f43231t = aCVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C0571j(this.f43231t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f43230n == 0) {
                    ResultKt.throwOnFailure(obj);
                    return pq.I28.n(pq.n.n("is_spooner", this.f43231t.KN()));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((C0571j) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CN3 nr(Context context, n nVar, rB.Ml ml) {
            aC aCVar = new aC(DSG.fuX.f1456n.t(), LJY.n.f5939n.t(), DSG.Ml.f1440n.t(context, nVar.rl()), ml, context);
            if (ml != null) {
                cbf.Ml.n(aCVar, d3.j.nr(ml, "secret_menu"));
                ml.n(new C0571j(aCVar, null));
            }
            if (Intrinsics.areEqual(nVar.n(), n.w6.j.f43233n)) {
                return aCVar;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final CN3 t(final n config, final Context context, final rB.Ml ml) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(context, "context");
            return (CN3) n(new Function0() { // from class: bH.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CN3.j.nr(context, config, ml);
                }
            });
        }

        private j() {
        }
    }

    public interface n {

        public static final class j {
            public static w6 n(n nVar) {
                return w6.j.f43233n;
            }
        }

        /* JADX INFO: renamed from: bH.CN3$n$n, reason: collision with other inner class name */
        public static final class C0572n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final boolean f43232n;
            private final DSG.j rl;

            public C0572n(boolean z2, DSG.j position) {
                Intrinsics.checkNotNullParameter(position, "position");
                this.f43232n = z2;
                this.rl = position;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0572n)) {
                    return false;
                }
                C0572n c0572n = (C0572n) obj;
                return this.f43232n == c0572n.f43232n && Intrinsics.areEqual(this.rl, c0572n.rl);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.f43232n) * 31) + this.rl.hashCode();
            }

            public final DSG.j n() {
                return this.rl;
            }

            public final boolean rl() {
                return this.f43232n;
            }

            public String toString() {
                return "FloatingButtonConfig(isPinnedByDefault=" + this.f43232n + ", position=" + this.rl + ")";
            }

            public /* synthetic */ C0572n(boolean z2, DSG.j jVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(z2, (i2 & 2) != 0 ? DSG.j.f1458t.n() : jVar);
            }
        }

        public static abstract class w6 {

            public static final class j extends w6 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public static final j f43233n = new j();

                private j() {
                    super(null);
                }
            }

            public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private w6() {
            }
        }

        w6 n();

        C0572n rl();
    }

    public static final class w6 {
        public static /* synthetic */ void n(CN3 cn3, String str, String str2, String str3, DSG.Wre wre, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerSubItem");
            }
            if ((i2 & 4) != 0) {
                str3 = null;
            }
            cn3.O(str, str2, str3, wre);
        }
    }

    void J2(Ml ml);

    void O(String str, String str2, String str3, DSG.Wre wre);

    void n(I28 i28, DSG.Wre wre);

    void nr(boolean z2);

    void rl(Context context);

    void t(I28 i28, List list);
}
