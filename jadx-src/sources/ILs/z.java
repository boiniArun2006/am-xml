package ILs;

import ILs.C;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class z extends I28 {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final j f4196N;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final int f4197T;

    static /* synthetic */ Object uG(z zVar, Object obj, Continuation continuation) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionT;
        Object objY = zVar.y(obj, true);
        if (!(objY instanceof C.j)) {
            return Unit.INSTANCE;
        }
        C.O(objY);
        Function1 function1 = zVar.f4158t;
        if (function1 == null || (undeliveredElementExceptionT = dzu.r.t(function1, obj, null, 2, null)) == null) {
            throw zVar.k();
        }
        ExceptionsKt.addSuppressed(undeliveredElementExceptionT, zVar.k());
        throw undeliveredElementExceptionT;
    }

    @Override // ILs.I28, ILs.r
    public Object nr(Object obj) {
        return y(obj, false);
    }

    private final Object y(Object obj, boolean z2) {
        return this.f4196N == j.f4184O ? Vvq(obj, z2) : f(obj);
    }

    @Override // ILs.I28
    protected boolean eWT() {
        return this.f4196N == j.f4187t;
    }

    public z(int i2, j jVar, Function1 function1) {
        super(i2, function1);
        this.f4197T = i2;
        this.f4196N = jVar;
        if (jVar != j.f4185n) {
            if (i2 >= 1) {
                return;
            }
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i2 + " was specified").toString());
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(I28.class).getSimpleName() + " instead").toString());
    }

    private final Object Vvq(Object obj, boolean z2) {
        Function1 function1;
        UndeliveredElementException undeliveredElementExceptionT;
        Object objNr = super.nr(obj);
        if (!C.gh(objNr) && !C.xMQ(objNr)) {
            if (z2 && (function1 = this.f4158t) != null && (undeliveredElementExceptionT = dzu.r.t(function1, obj, null, 2, null)) != null) {
                throw undeliveredElementExceptionT;
            }
            return C.rl.t(Unit.INSTANCE);
        }
        return objNr;
    }

    @Override // ILs.I28, ILs.r
    public Object mUb(Object obj, Continuation continuation) {
        return uG(this, obj, continuation);
    }
}
