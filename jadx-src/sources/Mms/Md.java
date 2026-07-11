package Mms;

import com.caoccao.javet.values.primitive.V8ValueNull;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.DeepRecursiveFunction;
import kotlin.DeepRecursiveKt;
import kotlin.DeepRecursiveScope;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Md {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Mms.j f6691n;
    private int nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f6692t;

    static final class j extends RestrictedSuspendLambda implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6694n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f6695t;

        j(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(DeepRecursiveScope deepRecursiveScope, Unit unit, Continuation continuation) {
            j jVar = Md.this.new j(continuation);
            jVar.f6695t = deepRecursiveScope;
            return jVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6694n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DeepRecursiveScope deepRecursiveScope = (DeepRecursiveScope) this.f6695t;
                byte bE = Md.this.f6691n.e();
                if (bE == 1) {
                    return Md.this.mUb(true);
                }
                if (bE == 0) {
                    return Md.this.mUb(false);
                }
                if (bE == 6) {
                    Md md = Md.this;
                    this.f6694n = 1;
                    obj = md.KN(deepRecursiveScope, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (bE == 8) {
                        return Md.this.J2();
                    }
                    Mms.j.nY(Md.this.f6691n, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            return (kotlinx.serialization.json.Dsr) obj;
        }
    }

    static final class n extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f6696O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f6697Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f6698n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f6700r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f6701t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6700r = obj;
            this.f6697Z |= Integer.MIN_VALUE;
            return Md.this.KN(null, this);
        }
    }

    public Md(kotlinx.serialization.json.CN3 configuration, Mms.j lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.f6691n = lexer;
        this.rl = configuration.Ik();
        this.f6692t = configuration.nr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.serialization.json.Dsr J2() {
        byte bGh = this.f6691n.gh();
        if (this.f6691n.e() == 4) {
            Mms.j.nY(this.f6691n, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f6691n.J2()) {
            arrayList.add(O());
            bGh = this.f6691n.gh();
            if (bGh != 4) {
                Mms.j jVar = this.f6691n;
                boolean z2 = bGh == 9;
                int i2 = jVar.f6723n;
                if (!z2) {
                    Mms.j.nY(jVar, "Expected end of the array or comma", i2, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bGh == 8) {
            this.f6691n.qie((byte) 9);
        } else if (bGh == 4) {
            if (!this.f6692t) {
                Ew.Uo(this.f6691n, "array");
                throw new KotlinNothingValueException();
            }
            this.f6691n.qie((byte) 9);
        }
        return new kotlinx.serialization.json.w6(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KN(DeepRecursiveScope deepRecursiveScope, Continuation continuation) {
        n nVar;
        Md md;
        LinkedHashMap linkedHashMap;
        n nVar2;
        byte b2;
        DeepRecursiveScope deepRecursiveScope2;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f6697Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f6697Z = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj = nVar.f6700r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f6697Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            byte bQie = this.f6691n.qie((byte) 6);
            if (this.f6691n.e() == 4) {
                Mms.j.nY(this.f6691n, "Unexpected leading comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            md = this;
            linkedHashMap = new LinkedHashMap();
            nVar2 = nVar;
            b2 = bQie;
            deepRecursiveScope2 = deepRecursiveScope;
            if (md.f6691n.J2()) {
            }
            if (b2 == 6) {
            }
            return new kotlinx.serialization.json.nKK(linkedHashMap);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = (String) nVar.J2;
        linkedHashMap = (LinkedHashMap) nVar.f6696O;
        md = (Md) nVar.f6701t;
        DeepRecursiveScope deepRecursiveScope3 = (DeepRecursiveScope) nVar.f6698n;
        ResultKt.throwOnFailure(obj);
        linkedHashMap.put(str, (kotlinx.serialization.json.Dsr) obj);
        byte bGh = md.f6691n.gh();
        if (bGh == 4) {
            if (bGh != 7) {
                Mms.j.nY(md.f6691n, "Expected end of the object or comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            b2 = bGh;
            if (b2 == 6) {
                md.f6691n.qie((byte) 7);
            } else if (b2 == 4) {
                if (!md.f6692t) {
                    Ew.KN(md.f6691n, null, 1, null);
                    throw new KotlinNothingValueException();
                }
                md.f6691n.qie((byte) 7);
            }
            return new kotlinx.serialization.json.nKK(linkedHashMap);
        }
        nVar2 = nVar;
        b2 = bGh;
        deepRecursiveScope2 = deepRecursiveScope3;
        if (md.f6691n.J2()) {
            String strO = md.rl ? md.f6691n.o() : md.f6691n.Ik();
            md.f6691n.qie((byte) 5);
            Unit unit = Unit.INSTANCE;
            nVar2.f6698n = deepRecursiveScope2;
            nVar2.f6701t = md;
            nVar2.f6696O = linkedHashMap;
            nVar2.J2 = strO;
            nVar2.f6697Z = 1;
            Object objCallRecursive = deepRecursiveScope2.callRecursive(unit, nVar2);
            if (objCallRecursive == coroutine_suspended) {
                return coroutine_suspended;
            }
            deepRecursiveScope3 = deepRecursiveScope2;
            obj = objCallRecursive;
            n nVar3 = nVar2;
            str = strO;
            nVar = nVar3;
            linkedHashMap.put(str, (kotlinx.serialization.json.Dsr) obj);
            byte bGh2 = md.f6691n.gh();
            if (bGh2 == 4) {
            }
        }
        if (b2 == 6) {
        }
        return new kotlinx.serialization.json.nKK(linkedHashMap);
    }

    private final kotlinx.serialization.json.Dsr Uo() {
        return (kotlinx.serialization.json.Dsr) DeepRecursiveKt.invoke(new DeepRecursiveFunction(new j(null)), Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.serialization.json.qf mUb(boolean z2) {
        String strO = (this.rl || !z2) ? this.f6691n.o() : this.f6691n.Ik();
        return (z2 || !Intrinsics.areEqual(strO, V8ValueNull.NULL)) ? new kotlinx.serialization.json.r(strO, z2, null, 4, null) : kotlinx.serialization.json.afx.INSTANCE;
    }

    private final kotlinx.serialization.json.Dsr xMQ() {
        byte bQie = this.f6691n.qie((byte) 6);
        if (this.f6691n.e() == 4) {
            Mms.j.nY(this.f6691n, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f6691n.J2()) {
                break;
            }
            String strO = this.rl ? this.f6691n.o() : this.f6691n.Ik();
            this.f6691n.qie((byte) 5);
            linkedHashMap.put(strO, O());
            bQie = this.f6691n.gh();
            if (bQie != 4) {
                if (bQie != 7) {
                    Mms.j.nY(this.f6691n, "Expected end of the object or comma", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bQie == 6) {
            this.f6691n.qie((byte) 7);
        } else if (bQie == 4) {
            if (!this.f6692t) {
                Ew.KN(this.f6691n, null, 1, null);
                throw new KotlinNothingValueException();
            }
            this.f6691n.qie((byte) 7);
        }
        return new kotlinx.serialization.json.nKK(linkedHashMap);
    }

    public final kotlinx.serialization.json.Dsr O() {
        byte bE = this.f6691n.e();
        if (bE == 1) {
            return mUb(true);
        }
        if (bE == 0) {
            return mUb(false);
        }
        if (bE == 6) {
            int i2 = this.nr + 1;
            this.nr = i2;
            this.nr--;
            return i2 == 200 ? Uo() : xMQ();
        }
        if (bE == 8) {
            return J2();
        }
        Mms.j.nY(this.f6691n, "Cannot read Json element because of unexpected " + Mms.n.t(bE), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }
}
