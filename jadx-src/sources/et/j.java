package et;

import androidx.content.core.Serializer;
import androidx.tracing.Trace;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import okio.Okio;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j implements Serializer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final et.n f63865n;

    /* JADX INFO: renamed from: et.j$j, reason: collision with other inner class name */
    static final class C0857j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f63866O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f63867Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f63868n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f63870r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f63871t;

        C0857j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63870r = obj;
            this.f63867Z |= Integer.MIN_VALUE;
            return j.this.readFrom(null, this);
        }
    }

    static final class n extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f63872O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f63873S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f63875n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f63876o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f63877r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f63878t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63876o = obj;
            this.f63873S |= Integer.MIN_VALUE;
            return j.this.writeTo(null, null, this);
        }
    }

    @Override // androidx.content.core.Serializer
    public Object getDefaultValue() {
        return null;
    }

    public j(et.n jsonSerializer) {
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        this.f63865n = jsonSerializer;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.content.core.Serializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object readFrom(InputStream inputStream, Continuation continuation) throws Throwable {
        C0857j c0857j;
        String str;
        int iNextInt;
        String str2;
        Throwable th;
        int i2;
        if (continuation instanceof C0857j) {
            c0857j = (C0857j) continuation;
            int i3 = c0857j.f63867Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0857j.f63867Z = i3 - Integer.MIN_VALUE;
            } else {
                c0857j = new C0857j(continuation);
            }
        }
        Object obj = c0857j.f63870r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c0857j.f63867Z;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = c0857j.J2;
            str2 = (String) c0857j.f63866O;
            try {
                ResultKt.throwOnFailure(obj);
                if (str2 != null) {
                    Trace.nr(str2, i2);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (str2 != null) {
                    Trace.nr(str2, i2);
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        Pair pairN = oZ.j.n();
        String str3 = (String) pairN.component1();
        String str4 = (String) pairN.component2();
        if (Trace.KN()) {
            str = "[custom] " + str3 + "." + str4;
            iNextInt = Random.INSTANCE.nextInt();
            Trace.n(str, iNextInt);
        } else {
            str = null;
            iNextInt = 0;
        }
        try {
            c0857j.f63868n = this;
            c0857j.f63871t = inputStream;
            c0857j.f63866O = str;
            c0857j.J2 = iNextInt;
            c0857j.f63867Z = 1;
            Object objNr = x0X.w6.nr(this.f63865n.rl(Okio.buffer(Okio.source(inputStream))));
            if (objNr == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str;
            obj = objNr;
            i2 = iNextInt;
            if (str2 != null) {
            }
            return obj;
        } catch (Throwable th3) {
            str2 = str;
            th = th3;
            i2 = iNextInt;
            if (str2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.content.core.Serializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws Throwable {
        n nVar;
        int i2;
        String str;
        Throwable th;
        int i3;
        String str2;
        x0X.n nVarT;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i5 = nVar.f63873S;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                nVar.f63873S = i5 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj2 = nVar.f63876o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = nVar.f63873S;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = nVar.f63877r;
            str2 = (String) nVar.J2;
            try {
                ResultKt.throwOnFailure(obj2);
                if (str2 != null) {
                    Trace.nr(str2, i3);
                }
                return obj2;
            } catch (Throwable th2) {
                th = th2;
                if (str2 != null) {
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj2);
        Pair pairN = oZ.j.n();
        String str3 = (String) pairN.component1();
        String str4 = (String) pairN.component2();
        String str5 = null;
        if (Trace.KN()) {
            String str6 = "[custom] " + str3 + "." + str4;
            int iNextInt = Random.INSTANCE.nextInt();
            Trace.n(str6, iNextInt);
            str = str6;
            i2 = iNextInt;
        } else {
            i2 = 0;
            str = null;
        }
        try {
            nVar.f63875n = this;
            nVar.f63878t = obj;
            nVar.f63872O = outputStream;
            nVar.J2 = str;
            nVar.f63877r = i2;
            nVar.f63873S = 1;
            if (obj != null && (nVarT = this.f63865n.t(obj)) != null) {
                str5 = (String) x0X.w6.nr(nVarT);
            }
            if (str5 != null) {
                outputStream.write(StringsKt.encodeToByteArray(str5));
            }
            Unit unit = Unit.INSTANCE;
            if (unit == coroutine_suspended) {
                return coroutine_suspended;
            }
            int i8 = i2;
            obj2 = unit;
            i3 = i8;
            str2 = str;
            if (str2 != null) {
            }
            return obj2;
        } catch (Throwable th3) {
            int i9 = i2;
            th = th3;
            i3 = i9;
            str2 = str;
            if (str2 != null) {
                Trace.nr(str2, i3);
            }
            throw th;
        }
    }
}
