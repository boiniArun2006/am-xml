package T1;

import TFv.Wre;
import TFv.fuX;
import android.content.Context;
import androidx.content.core.DataStore;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesKeys;
import androidx.content.preferences.core.PreferencesKt;
import java.util.LinkedHashMap;
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
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DataStore f10128n;

    /* JADX INFO: renamed from: T1.j$j, reason: collision with other inner class name */
    static final class C0350j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f10129O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f10130n;

        C0350j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10130n = obj;
            this.f10129O |= Integer.MIN_VALUE;
            return j.this.n(this);
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Map f10132O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10133n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f10134t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Map map, Continuation continuation) {
            super(2, continuation);
            this.f10132O = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.f10132O, continuation);
            nVar.f10134t = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10133n == 0) {
                ResultKt.throwOnFailure(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.f10134t;
                for (Map.Entry entry : this.f10132O.entrySet()) {
                    mutablePreferences.mUb(PreferencesKeys.O((String) entry.getKey()), Boxing.boxInt(((Number) entry.getValue()).intValue()));
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

    public j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10128n = Ml.t(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Continuation continuation) {
        C0350j c0350j;
        Map mapN;
        if (continuation instanceof C0350j) {
            c0350j = (C0350j) continuation;
            int i2 = c0350j.f10129O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0350j.f10129O = i2 - Integer.MIN_VALUE;
            } else {
                c0350j = new C0350j(continuation);
            }
        }
        Object objG = c0350j.f10130n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0350j.f10129O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objG);
            Wre data = this.f10128n.getData();
            c0350j.f10129O = 1;
            objG = fuX.g(data, c0350j);
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objG);
        }
        Preferences preferences = (Preferences) objG;
        if (preferences == null || (mapN = preferences.n()) == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapN.size()));
        for (Map.Entry entry : mapN.entrySet()) {
            linkedHashMap.put(((Preferences.Key) entry.getKey()).getName(), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
            linkedHashMap2.put(key, Boxing.boxInt(((Integer) value).intValue()));
        }
        return linkedHashMap2;
    }

    public final Object rl(Map map, Continuation continuation) {
        Object objN = PreferencesKt.n(this.f10128n, new n(map, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }
}
