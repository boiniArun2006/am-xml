package wa;

import android.app.Application;
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
import com.bendingspoons.injet.module.NativeStorageModule;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class aC extends NativeStorageModule {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DataStore f75057n;
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f75056t = 8;
    private static final ReadOnlyProperty nr = PreferenceDataStoreDelegateKt.rl("injet_native_storage", new ReplaceFileCorruptionHandler(new Function1() { // from class: wa.Dsr
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return aC.xMQ((CorruptionException) obj);
        }
    }), null, null, 12, null);

    static final class Ml extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ aC f75058O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75059n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ NativeStorageModule.SetValueInput f75060t;

        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ String J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ NativeStorageModule.SetValueInput f75061O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f75062n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f75063t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(NativeStorageModule.SetValueInput setValueInput, String str, Continuation continuation) {
                super(2, continuation);
                this.f75061O = setValueInput;
                this.J2 = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f75061O, this.J2, continuation);
                jVar.f75063t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f75062n == 0) {
                    ResultKt.throwOnFailure(obj);
                    ((MutablePreferences) this.f75063t).mUb(PreferencesKeys.Uo(this.f75061O.getKey()), this.J2);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(NativeStorageModule.SetValueInput setValueInput, aC aCVar, Continuation continuation) {
            super(1, continuation);
            this.f75060t = setValueInput;
            this.f75058O = aCVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new Ml(this.f75060t, this.f75058O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String string;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f75059n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Object value = this.f75060t.getValue();
                if (!(value instanceof JSONObject) && !(value instanceof JSONArray)) {
                    if (value instanceof String) {
                        string = JSONObject.quote((String) this.f75060t.getValue());
                    } else {
                        if (!(value instanceof Number) && !(value instanceof Boolean)) {
                            throw new IllegalArgumentException("Unsupported type: " + Reflection.getOrCreateKotlinClass(this.f75060t.getValue().getClass()));
                        }
                        string = this.f75060t.getValue().toString();
                    }
                } else {
                    string = this.f75060t.getValue().toString();
                }
                DataStore dataStore = this.f75058O.f75057n;
                j jVar = new j(this.f75060t, string, null);
                this.f75059n = 1;
                if (PreferencesKt.n(dataStore, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ KProperty[] f75064n = {Reflection.property2(new PropertyReference2Impl(j.class, "datastore", "getDatastore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final NativeStorageModule n(Application context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new aC(rl(context));
        }

        private final DataStore rl(Context context) {
            return (DataStore) aC.nr.getValue(context, f75064n[0]);
        }
    }

    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f75065O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75066n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, Continuation continuation) {
            super(1, continuation);
            this.f75065O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return aC.this.new n(this.f75065O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f75066n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre data = aC.this.f75057n.getData();
                this.f75066n = 1;
                obj = TFv.fuX.ViF(data, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            String str = (String) ((Preferences) obj).rl(PreferencesKeys.Uo(this.f75065O));
            if (str != null) {
                return new JSONTokener(str).nextValue();
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class w6 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f75068O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75069n;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ String f75071O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f75072n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f75073t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(String str, Continuation continuation) {
                super(2, continuation);
                this.f75071O = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f75071O, continuation);
                jVar.f75073t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f75072n == 0) {
                    ResultKt.throwOnFailure(obj);
                    ((MutablePreferences) this.f75073t).xMQ(PreferencesKeys.Uo(this.f75071O));
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(String str, Continuation continuation) {
            super(1, continuation);
            this.f75068O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return aC.this.new w6(this.f75068O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f75069n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = aC.this.f75057n;
                j jVar = new j(this.f75068O, null);
                this.f75069n = 1;
                if (PreferencesKt.n(dataStore, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public aC(DataStore dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f75057n = dataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Preferences xMQ(CorruptionException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PreferencesFactory.n();
    }

    @Override // com.bendingspoons.injet.module.NativeStorageModule
    public Object O(NativeStorageModule.SetValueInput setValueInput, Continuation continuation) {
        return x0X.w6.Uo(new Ml(setValueInput, this, null), continuation);
    }

    @Override // com.bendingspoons.injet.module.NativeStorageModule
    public Object nr(String str, Continuation continuation) {
        return x0X.w6.Uo(new w6(str, null), continuation);
    }

    @Override // com.bendingspoons.injet.module.NativeStorageModule
    public Object t(String str, Continuation continuation) {
        return x0X.w6.Uo(new n(str, null), continuation);
    }
}
