package uF;

import Dk.InterfaceC1335n;
import QmE.iF;
import android.net.Uri;
import com.bendingspoons.concierge.domain.entities.Id;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import ga6.j;
import i.C2164I28;
import i.C2167j;
import i.C2169w6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import uF.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n implements uF.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final nYs.Ml f74333n;
    private final InterfaceC1335n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final iF f74334t;

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74336n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f74337t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74337t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return n.this.n(this);
        }
    }

    /* JADX INFO: renamed from: uF.n$n, reason: collision with other inner class name */
    static final class C1221n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f74338O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74339n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f74340t;

        /* JADX INFO: Access modifiers changed from: private */
        public static final String ck(String str) {
            return str;
        }

        C1221n(Continuation continuation) {
            super(1, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tN.j Ik(boolean z2, Random random, C2169w6 c2169w6, final List list, JSONObject jSONObject) throws JSONException {
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            List listT = WK.w6.t(jSONArray, new Function1() { // from class: uF.I28
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n.C1221n.Z(list, (String) obj);
                }
            });
            String string = jSONObject.getString("id");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = jSONObject.getString("key");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = jSONObject.getString("default");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            C2167j c2167j = new C2167j(string2, string3);
            if (z2) {
                listT = CollectionsKt.shuffled(listT, random);
            }
            return tN.Ml.n(new tN.w6(string, c2167j, listT), c2169w6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tN.I28 az(JSONObject jSONObject) throws JSONException {
            String string = jSONObject.getString("id");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = jSONObject.getString("key");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = jSONObject.getString("default");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            C2167j c2167j = new C2167j(string2, string3);
            Uri uri = Uri.parse(jSONObject.getString("link"));
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            Uri uri2 = Uri.parse(jSONObject.getString("thumbnail"));
            Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
            JSONArray jSONArray = jSONObject.getJSONArray("types");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            Set set = CollectionsKt.toSet(WK.w6.t(jSONArray, new Function1() { // from class: uF.Wre
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n.C1221n.ty((String) obj);
                }
            }));
            JSONArray jSONArray2 = jSONObject.getJSONArray("tags");
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "getJSONArray(...)");
            return new tN.I28(string, c2167j, uri, uri2, set, CollectionsKt.toSet(WK.w6.t(jSONArray2, new Function1() { // from class: uF.CN3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n.C1221n.ck((String) obj);
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tN.CN3 ty(String str) {
            if (Intrinsics.areEqual(str, "preset")) {
                return tN.CN3.f73455t;
            }
            if (Intrinsics.areEqual(str, c.f62175h)) {
                return tN.CN3.f73454n;
            }
            return null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return n.this.new C1221n(continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tN.I28 Z(List list, String str) {
            Object next;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.areEqual(((tN.I28) next).n(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            return (tN.I28) next;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            final C2169w6 c2169w6;
            long jHashCode;
            final boolean zS;
            String value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f74338O;
            if (i2 != 0) {
                if (i2 == 1) {
                    c2169w6 = (C2169w6) this.f74340t;
                    jSONObject2 = (JSONObject) this.f74339n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                JSONObject jSONObjectT = n.this.f74333n.t();
                if (jSONObjectT == null || (jSONObject = jSONObjectT.getJSONObject("mdt_content_library_descriptor")) == null) {
                    jSONObject = new JSONObject();
                }
                jSONObject2 = jSONObject;
                JSONObject jSONObjectT2 = n.this.f74333n.t();
                if (jSONObjectT2 == null || (jSONObject3 = jSONObjectT2.getJSONObject("mdt_content_library_localization")) == null) {
                    jSONObject3 = new JSONObject();
                }
                C2169w6 c2169w6T = Iy.j.t(Iy.j.f4399n, C2164I28.f68045n.rl(jSONObject3), null, 2, null);
                if (c2169w6T == null) {
                    c2169w6T = C2169w6.rl.n();
                }
                InterfaceC1335n interfaceC1335n = n.this.rl;
                Id.Predefined.Internal.j jVar = Id.Predefined.Internal.j.f51217O;
                this.f74339n = jSONObject2;
                this.f74340t = c2169w6T;
                this.f74338O = 1;
                Object objO = interfaceC1335n.O(jVar, this);
                if (objO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c2169w6 = c2169w6T;
                obj = objO;
            }
            Id.Predefined.Internal internal = (Id.Predefined.Internal) x0X.w6.nr((x0X.n) obj);
            if (internal != null && (value = internal.getValue()) != null) {
                jHashCode = value.hashCode();
            } else {
                jHashCode = 0;
            }
            final Random random = new Random(jHashCode);
            nYs.j jVarInvoke = n.this.f74333n.invoke();
            if (jVarInvoke != null) {
                zS = jVarInvoke.S();
            } else {
                zS = false;
            }
            JSONArray jSONArray = jSONObject2.getJSONArray("items");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            final List listRl = WK.w6.rl(jSONArray, new Function1() { // from class: uF.w6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return n.C1221n.az((JSONObject) obj2);
                }
            });
            JSONArray jSONArray2 = jSONObject2.getJSONArray("categories");
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "getJSONArray(...)");
            List listRl2 = WK.w6.rl(jSONArray2, new Function1() { // from class: uF.Ml
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return n.C1221n.Ik(zS, random, c2169w6, listRl, (JSONObject) obj2);
                }
            });
            if (zS) {
                return CollectionsKt.plus((Collection) CollectionsKt.listOf(listRl2.get(0)), (Iterable) CollectionsKt.shuffled(listRl2.subList(1, listRl2.size()), random));
            }
            return listRl2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C1221n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public n(nYs.Ml getAlightSettingsUseCase, InterfaceC1335n concierge, iF eventLogger) {
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(concierge, "concierge");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f74333n = getAlightSettingsUseCase;
        this.rl = concierge;
        this.f74334t = eventLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // uF.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        j jVar;
        n nVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objUo = jVar.f74337t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            C1221n c1221n = new C1221n(null);
            jVar.f74336n = this;
            jVar.J2 = 1;
            objUo = x0X.w6.Uo(c1221n, jVar);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            nVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (n) jVar.f74336n;
            ResultKt.throwOnFailure(objUo);
        }
        return M3.j.rl(M3.n.rl((x0X.n) objUo, j.w6.f67628O, j.EnumC0949j.f67616g, null, null, 12, null), nVar.f74334t);
    }
}
