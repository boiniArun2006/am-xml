package ILs;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C {
    public static final n rl = new n(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final w6 f4145t = new w6();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f4146n;

    public static final class j extends w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Throwable f4147n;

        public boolean equals(Object obj) {
            return (obj instanceof j) && Intrinsics.areEqual(this.f4147n, ((j) obj).f4147n);
        }

        public int hashCode() {
            Throwable th = this.f4147n;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // ILs.C.w6
        public String toString() {
            return "Closed(" + this.f4147n + ')';
        }

        public j(Throwable th) {
            this.f4147n = th;
        }
    }

    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }

        public final Object n(Throwable th) {
            return C.t(new j(th));
        }

        public final Object rl() {
            return C.t(C.f4145t);
        }

        public final Object t(Object obj) {
            return C.t(obj);
        }
    }

    public static class w6 {
        public String toString() {
            return "Failed";
        }
    }

    public static Object t(Object obj) {
        return obj;
    }

    public static final Object J2(Object obj) {
        if (obj instanceof w6) {
            return null;
        }
        return obj;
    }

    public static int KN(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final Throwable O(Object obj) {
        j jVar = obj instanceof j ? (j) obj : null;
        if (jVar != null) {
            return jVar.f4147n;
        }
        return null;
    }

    public static final Object Uo(Object obj) throws Throwable {
        if (!(obj instanceof w6)) {
            return obj;
        }
        if (!(obj instanceof j)) {
            throw new IllegalStateException("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
        }
        Throwable th = ((j) obj).f4147n;
        if (th != null) {
            throw th;
        }
        throw new IllegalStateException("Trying to call 'getOrThrow' on a channel closed without a cause");
    }

    public static final boolean gh(Object obj) {
        return !(obj instanceof w6);
    }

    public static final boolean mUb(Object obj) {
        return obj instanceof w6;
    }

    public static boolean nr(Object obj, Object obj2) {
        return (obj2 instanceof C) && Intrinsics.areEqual(obj, ((C) obj2).az());
    }

    public static String qie(Object obj) {
        if (obj instanceof j) {
            return ((j) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public static final /* synthetic */ C rl(Object obj) {
        return new C(obj);
    }

    public static final boolean xMQ(Object obj) {
        return obj instanceof j;
    }

    public final /* synthetic */ Object az() {
        return this.f4146n;
    }

    public boolean equals(Object obj) {
        return nr(this.f4146n, obj);
    }

    public int hashCode() {
        return KN(this.f4146n);
    }

    public String toString() {
        return qie(this.f4146n);
    }

    private /* synthetic */ C(Object obj) {
        this.f4146n = obj;
    }
}
