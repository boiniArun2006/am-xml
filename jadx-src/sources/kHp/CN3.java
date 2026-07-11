package kHp;

import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesKeys;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class CN3 implements kHp.Wre {
    private final Preferences.Key J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Preferences.Key f69761O;
    private final Preferences.Key nr;
    private final kHp.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final rB.Ml f69762t;
    public static final j Uo = new j(null);
    public static final int KN = 8;

    static final class C extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f69763O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69764n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(int i2, Continuation continuation) {
            super(1, continuation);
            this.f69763O = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return CN3.this.new C(this.f69763O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f69764n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                kHp.Ml ml = CN3.this.rl;
                Preferences.Key key = CN3.this.J2;
                Integer numBoxInt = Boxing.boxInt(this.f69763O);
                this.f69764n = 1;
                if (ml.rl(key, numBoxInt, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: kHp.CN3$CN3, reason: collision with other inner class name */
    static final class C1017CN3 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69766n;

        C1017CN3(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return CN3.this.new C1017CN3(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f69766n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                kHp.Ml ml = CN3.this.rl;
                Preferences.Key key = CN3.this.f69761O;
                this.f69766n = 1;
                obj = ml.n(key, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            String str = (String) obj;
            if (str != null) {
                Map mapAz = CN3.this.az(new JSONObject(str));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Pr.Ml ml2 : Pr.Ml.values()) {
                    Boolean bool = (Boolean) mapAz.get(ml2.name());
                    if (bool != null) {
                        linkedHashMap.put(ml2, Boxing.boxBoolean(bool.booleanValue()));
                    }
                }
                return linkedHashMap;
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C1017CN3) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Dsr extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69768n;

        Dsr(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return CN3.this.new Dsr(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f69768n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                kHp.Ml ml = CN3.this.rl;
                Preferences.Key key = CN3.this.nr;
                this.f69768n = 1;
                obj = ml.n(key, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return CN3.this.az(new JSONObject(str));
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Dsr) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class I28 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69770n;

        I28(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return CN3.this.new I28(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f69770n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            kHp.Ml ml = CN3.this.rl;
            Preferences.Key key = CN3.this.J2;
            this.f69770n = 1;
            Object objN = ml.n(key, this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objN;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Ml extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f69773n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f69774t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f69774t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return CN3.this.Uo(this);
        }
    }

    static final class Pl extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f69776n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f69777t;

        Pl(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f69777t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return CN3.this.nr(null, 0, this);
        }
    }

    static final class Wre extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f69779n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f69780t;

        Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f69780t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return CN3.this.rl(this);
        }
    }

    static final class Xo extends SuspendLambda implements Function1 {
        final /* synthetic */ int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Map f69781O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69782n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Xo(Map map, int i2, Continuation continuation) {
            super(1, continuation);
            this.f69781O = map;
            this.J2 = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return CN3.this.new Xo(this.f69781O, this.J2, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
        
            if (r7.rl(r1, r3, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f69782n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                kHp.Ml ml = CN3.this.rl;
                Preferences.Key key = CN3.this.nr;
                String string = new JSONObject(this.f69781O).toString();
                this.f69782n = 1;
                if (ml.rl(key, string, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            kHp.Ml ml2 = CN3.this.rl;
            Preferences.Key key2 = CN3.this.J2;
            Integer numBoxInt = Boxing.boxInt(this.J2);
            this.f69782n = 2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Xo) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class aC extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f69785n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f69786t;

        aC(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f69786t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return CN3.this.J2(0, this);
        }
    }

    static final class fuX extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f69788n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f69789t;

        fuX(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f69789t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return CN3.this.t(this);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f69791n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f69792t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f69792t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return CN3.this.n(this);
        }
    }

    static final class o extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f69794n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f69795t;

        o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f69795t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return CN3.this.O(null, this);
        }
    }

    static final class qz extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Map f69796O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69797n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        qz(Map map, Continuation continuation) {
            super(1, continuation);
            this.f69796O = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return CN3.this.new qz(this.f69796O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f69797n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                kHp.Ml ml = CN3.this.rl;
                Preferences.Key key = CN3.this.f69761O;
                Map map = this.f69796O;
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(((Pr.Ml) entry.getKey()).name(), entry.getValue());
                }
                String string = new JSONObject(linkedHashMap).toString();
                this.f69797n = 1;
                if (ml.rl(key, string, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((qz) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    static final class w6 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69799n;

        w6(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return CN3.this.new w6(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
        
            if (r5 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f69799n;
            boolean z2 = true;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        if (obj == null) {
                            z2 = false;
                        }
                        return Boxing.boxBoolean(z2);
                    }
                    throw new IllegalStateException(QiDPjiOCZHDS.MJR);
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                kHp.Ml ml = CN3.this.rl;
                Preferences.Key key = CN3.this.nr;
                this.f69799n = 1;
                obj = ml.n(key, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (obj != null) {
                kHp.Ml ml2 = CN3.this.rl;
                Preferences.Key key2 = CN3.this.f69761O;
                this.f69799n = 2;
                obj = ml2.n(key2, this);
            }
            z2 = false;
            return Boxing.boxBoolean(z2);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public CN3(kHp.Ml datastore, rB.Ml spiderSense) {
        Intrinsics.checkNotNullParameter(datastore, "datastore");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        this.rl = datastore;
        this.f69762t = spiderSense;
        this.nr = PreferencesKeys.Uo("privacy-settings-json");
        this.f69761O = PreferencesKeys.Uo("category-settings-json");
        this.J2 = PreferencesKeys.O("trackers-version");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map az(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                linkedHashMap.put(next, Boolean.valueOf(jSONObject.getBoolean(next)));
            } catch (JSONException unused) {
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kHp.Wre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object J2(int i2, Continuation continuation) {
        aC aCVar;
        CN3 cn3;
        if (continuation instanceof aC) {
            aCVar = (aC) continuation;
            int i3 = aCVar.J2;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aCVar.J2 = i3 - Integer.MIN_VALUE;
            } else {
                aCVar = new aC(continuation);
            }
        }
        Object objUo = aCVar.f69786t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = aCVar.J2;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objUo);
            C c2 = new C(i2, null);
            aCVar.f69785n = this;
            aCVar.J2 = 1;
            objUo = x0X.w6.Uo(c2, aCVar);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            cn3 = this;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cn3 = (CN3) aCVar.f69785n;
            ResultKt.throwOnFailure(objUo);
        }
        x0X.n nVar = (x0X.n) objUo;
        if (nVar instanceof n.C1266n) {
            cn3.f69762t.t(kHp.j.f69817n.nr((Throwable) ((n.C1266n) nVar).n()));
        } else if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kHp.Wre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object O(Map map, Continuation continuation) {
        o oVar;
        CN3 cn3;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i2 = oVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(continuation);
            }
        }
        Object objUo = oVar.f69795t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            qz qzVar = new qz(map, null);
            oVar.f69794n = this;
            oVar.J2 = 1;
            objUo = x0X.w6.Uo(qzVar, oVar);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            cn3 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cn3 = (CN3) oVar.f69794n;
            ResultKt.throwOnFailure(objUo);
        }
        x0X.n nVar = (x0X.n) objUo;
        if (nVar instanceof n.C1266n) {
            cn3.f69762t.t(kHp.j.f69817n.O((Throwable) ((n.C1266n) nVar).n()));
        } else if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kHp.Wre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Uo(Continuation continuation) {
        Ml ml;
        CN3 cn3;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.J2 = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objUo = ml.f69774t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            I28 i28 = new I28(null);
            ml.f69773n = this;
            ml.J2 = 1;
            objUo = x0X.w6.Uo(i28, ml);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            cn3 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cn3 = (CN3) ml.f69773n;
            ResultKt.throwOnFailure(objUo);
        }
        x0X.n nVar = (x0X.n) objUo;
        if (nVar instanceof n.C1266n) {
            cn3.f69762t.t(kHp.j.f69817n.n((Throwable) ((n.C1266n) nVar).n()));
        } else if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        return x0X.w6.nr(nVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kHp.Wre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        n nVar;
        CN3 cn3;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objUo = nVar.f69792t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            w6 w6Var = new w6(null);
            nVar.f69791n = this;
            nVar.J2 = 1;
            objUo = x0X.w6.Uo(w6Var, nVar);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            cn3 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cn3 = (CN3) nVar.f69791n;
            ResultKt.throwOnFailure(objUo);
        }
        x0X.n nVar2 = (x0X.n) objUo;
        if (nVar2 instanceof n.C1266n) {
            cn3.f69762t.t(kHp.j.f69817n.t((Throwable) ((n.C1266n) nVar2).n()));
        } else if (!(nVar2 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        Boolean bool = (Boolean) x0X.w6.nr(nVar2);
        return Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kHp.Wre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object nr(Map map, int i2, Continuation continuation) {
        Pl pl;
        CN3 cn3;
        if (continuation instanceof Pl) {
            pl = (Pl) continuation;
            int i3 = pl.J2;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pl.J2 = i3 - Integer.MIN_VALUE;
            } else {
                pl = new Pl(continuation);
            }
        }
        Object objUo = pl.f69777t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = pl.J2;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objUo);
            Xo xo = new Xo(map, i2, null);
            pl.f69776n = this;
            pl.J2 = 1;
            objUo = x0X.w6.Uo(xo, pl);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            cn3 = this;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cn3 = (CN3) pl.f69776n;
            ResultKt.throwOnFailure(objUo);
        }
        x0X.n nVar = (x0X.n) objUo;
        if (nVar instanceof n.C1266n) {
            cn3.f69762t.t(kHp.j.f69817n.J2((Throwable) ((n.C1266n) nVar).n()));
        } else if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kHp.Wre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Continuation continuation) {
        Wre wre;
        CN3 cn3;
        if (continuation instanceof Wre) {
            wre = (Wre) continuation;
            int i2 = wre.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wre.J2 = i2 - Integer.MIN_VALUE;
            } else {
                wre = new Wre(continuation);
            }
        }
        Object objUo = wre.f69780t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = wre.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            C1017CN3 c1017cn3 = new C1017CN3(null);
            wre.f69779n = this;
            wre.J2 = 1;
            objUo = x0X.w6.Uo(c1017cn3, wre);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            cn3 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cn3 = (CN3) wre.f69779n;
            ResultKt.throwOnFailure(objUo);
        }
        x0X.n nVar = (x0X.n) objUo;
        if (nVar instanceof n.C1266n) {
            cn3.f69762t.t(kHp.j.f69817n.rl((Throwable) ((n.C1266n) nVar).n()));
        } else if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        Map map = (Map) x0X.w6.nr(nVar);
        return map == null ? MapsKt.mapOf(TuplesKt.to(Pr.Ml.f7844n, Boxing.boxBoolean(true)), TuplesKt.to(Pr.Ml.f7843O, Boxing.boxBoolean(false)), TuplesKt.to(Pr.Ml.f7846t, Boxing.boxBoolean(false))) : map;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kHp.Wre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(Continuation continuation) {
        fuX fux;
        CN3 cn3;
        if (continuation instanceof fuX) {
            fux = (fuX) continuation;
            int i2 = fux.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fux.J2 = i2 - Integer.MIN_VALUE;
            } else {
                fux = new fuX(continuation);
            }
        }
        Object objUo = fux.f69789t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = fux.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            Dsr dsr = new Dsr(null);
            fux.f69788n = this;
            fux.J2 = 1;
            objUo = x0X.w6.Uo(dsr, fux);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            cn3 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cn3 = (CN3) fux.f69788n;
            ResultKt.throwOnFailure(objUo);
        }
        x0X.n nVar = (x0X.n) objUo;
        if (nVar instanceof n.C1266n) {
            cn3.f69762t.t(kHp.j.f69817n.t((Throwable) ((n.C1266n) nVar).n()));
        } else if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        Map map = (Map) x0X.w6.nr(nVar);
        return map == null ? MapsKt.emptyMap() : map;
    }
}
