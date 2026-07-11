package cg;

import android.content.Context;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesKeys;
import androidx.content.preferences.core.PreferencesKt;
import cg.o;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f43825n;

    public static final class j implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f43826n;

        /* JADX INFO: renamed from: cg.qz$j$j, reason: collision with other inner class name */
        public static final class C0599j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f43827n;

            /* JADX INFO: renamed from: cg.qz$j$j$j, reason: collision with other inner class name */
            public static final class C0600j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f43829n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f43830t;

                public C0600j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f43829n = obj;
                    this.f43830t |= Integer.MIN_VALUE;
                    return C0599j.this.rl(null, this);
                }
            }

            public C0599j(TFv.CN3 cn3) {
                this.f43827n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0600j c0600j;
                if (continuation instanceof C0600j) {
                    c0600j = (C0600j) continuation;
                    int i2 = c0600j.f43830t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0600j.f43830t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0600j = new C0600j(continuation);
                    }
                }
                Object obj2 = c0600j.f43829n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0600j.f43830t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f43827n;
                    Preferences preferences = (Preferences) obj;
                    Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                    for (o.fuX fux : o.fuX.values()) {
                        Long l2 = (Long) preferences.rl(PreferencesKeys.J2(fux.rl()));
                        if (l2 != null) {
                            mapCreateMapBuilder.put(fux.rl(), Boxing.boxLong(l2.longValue()));
                        }
                    }
                    Map mapBuild = MapsKt.build(mapCreateMapBuilder);
                    c0600j.f43830t = 1;
                    if (cn3.rl(mapBuild, c0600j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public j(TFv.Wre wre) {
            this.f43826n = wre;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f43826n.n(new C0599j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Map f43831O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43832n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f43833t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Map map, Continuation continuation) {
            super(2, continuation);
            this.f43831O = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.f43831O, continuation);
            nVar.f43833t = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f43832n == 0) {
                ResultKt.throwOnFailure(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.f43833t;
                for (Map.Entry entry : this.f43831O.entrySet()) {
                    mutablePreferences.mUb(PreferencesKeys.J2((String) entry.getKey()), Boxing.boxLong(((Number) entry.getValue()).longValue()));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((n) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public qz(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43825n = context;
    }

    public final TFv.Wre n() {
        return new j(Pl.rl(this.f43825n).getData());
    }

    public final Object rl(Map map, Continuation continuation) {
        Object objN = PreferencesKt.n(Pl.rl(this.f43825n), new n(map, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }
}
