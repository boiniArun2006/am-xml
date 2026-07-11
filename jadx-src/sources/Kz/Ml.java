package Kz;

import GJW.C;
import GJW.vd;
import TFv.CN3;
import TFv.Ln;
import TFv.Wre;
import TFv.fuX;
import TFv.rv6;
import android.content.Context;
import androidx.content.core.CorruptionException;
import androidx.content.core.DataStore;
import androidx.content.core.handlers.ReplaceFileCorruptionHandler;
import androidx.content.preferences.PreferenceDataStoreDelegateKt;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesFactory;
import androidx.content.preferences.core.PreferencesKeys;
import androidx.content.preferences.core.PreferencesKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ml implements Kz.n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final rv6 f5903O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DataStore f5904n;
    private final vd nr;
    private final Function2 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f5905t;
    public static final j J2 = new j(null);
    private static final Preferences.Key Uo = PreferencesKeys.n("tracking_consent");
    private static final ReadOnlyProperty KN = PreferenceDataStoreDelegateKt.rl("picox_tracking_consent", new ReplaceFileCorruptionHandler(new Function1() { // from class: Kz.w6
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Ml.KN((CorruptionException) obj);
        }
    }), null, null, 12, null);

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ KProperty[] f5906n = {Reflection.property2(new PropertyReference2Impl(j.class, "datastore", "getDatastore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final Ml n(Context context, Function2 track, vd scope) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(track, "track");
            Intrinsics.checkNotNullParameter(scope, "scope");
            EnumEntries enumEntriesRl = Kz.j.rl();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(enumEntriesRl, 10));
            Iterator<E> it = enumEntriesRl.iterator();
            while (it.hasNext()) {
                arrayList.add(((Kz.j) it.next()).t());
            }
            return new Ml(rl(context), track, CollectionsKt.toMutableList((Collection) arrayList), scope);
        }

        private final DataStore rl(Context context) {
            return (DataStore) Ml.KN.getValue(context, f5906n[0]);
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5907n;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f5909n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f5910t;

            j(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(continuation);
                jVar.f5910t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f5909n == 0) {
                    ResultKt.throwOnFailure(obj);
                    ((MutablePreferences) this.f5910t).mUb(Ml.Uo, Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
                return ((j) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
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
            return Ml.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5907n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = Ml.this.f5904n;
                j jVar = new j(null);
                this.f5907n = 1;
                if (PreferencesKt.n(dataStore, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class w6 implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f5911n;

        public static final class j implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ CN3 f5912n;

            /* JADX INFO: renamed from: Kz.Ml$w6$j$j, reason: collision with other inner class name */
            public static final class C0202j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f5914n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f5915t;

                public C0202j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f5914n = obj;
                    this.f5915t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(CN3 cn3) {
                this.f5912n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0202j c0202j;
                if (continuation instanceof C0202j) {
                    c0202j = (C0202j) continuation;
                    int i2 = c0202j.f5915t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0202j.f5915t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0202j = new C0202j(continuation);
                    }
                }
                Object obj2 = c0202j.f5914n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0202j.f5915t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    CN3 cn3 = this.f5912n;
                    Boolean bool = (Boolean) ((Preferences) obj).rl(Ml.Uo);
                    Boolean boolBoxBoolean = Boxing.boxBoolean(bool != null ? bool.booleanValue() : true);
                    c0202j.f5915t = 1;
                    if (cn3.rl(boolBoxBoolean, c0202j) == coroutine_suspended) {
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

        public w6(Wre wre) {
            this.f5911n = wre;
        }

        @Override // TFv.Wre
        public Object n(CN3 cn3, Continuation continuation) {
            Object objN = this.f5911n.n(new j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public Ml(DataStore dataStore, Function2 track, List technicalEventNames, vd scope) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(technicalEventNames, "technicalEventNames");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f5904n = dataStore;
        this.rl = track;
        this.f5905t = technicalEventNames;
        this.nr = scope;
        this.f5903O = fuX.Xw(new w6(dataStore.getData()), scope, Ln.f10289n.t(), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Preferences KN(CorruptionException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PreferencesFactory.n();
    }

    public final boolean Uo(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (n()) {
            return true;
        }
        return this.f5905t.contains(eventName);
    }

    @Override // Kz.n
    public boolean n() {
        return ((Boolean) this.f5903O.getValue()).booleanValue();
    }

    @Override // Kz.n
    public void rl() {
        C.nr(this.nr, null, null, new n(null), 3, null);
        this.rl.invoke(Kz.j.f5917t.t(), new pq.Ml());
    }
}
