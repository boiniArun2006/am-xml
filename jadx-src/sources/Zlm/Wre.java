package Zlm;

import android.os.Looper;
import h1M.CN3;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Wre {
    private static boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f12589O = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final I28 f12590n;
    public final I28 nr;
    public final I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final I28 f12591t;

    public static final class j {

        /* synthetic */ class I28 extends FunctionReferenceImpl implements Function0 {
            I28(Object obj) {
                super(0, obj, j.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((j) this.receiver).az());
            }
        }

        static final class Ml extends Lambda implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final Ml f12592n = new Ml();

            Ml() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Must be called on a blocking thread, was called on " + Wre.f12589O.mUb() + '.';
            }
        }

        /* JADX INFO: renamed from: Zlm.Wre$j$Wre, reason: collision with other inner class name */
        static final class C0454Wre extends Lambda implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0454Wre f12593n = new C0454Wre();

            C0454Wre() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Must not be called on a main thread, was called on " + Wre.f12589O.mUb() + '.';
            }
        }

        /* JADX INFO: renamed from: Zlm.Wre$j$j, reason: collision with other inner class name */
        /* synthetic */ class C0455j extends FunctionReferenceImpl implements Function0 {
            C0455j(Object obj) {
                super(0, obj, j.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((j) this.receiver).gh());
            }
        }

        static final class n extends Lambda implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final n f12594n = new n();

            n() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Must be called on a background thread, was called on " + Wre.f12589O.mUb() + '.';
            }
        }

        /* synthetic */ class w6 extends FunctionReferenceImpl implements Function0 {
            w6(Object obj) {
                super(0, obj, j.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((j) this.receiver).qie());
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final void J2() {
            KN(new w6(this), Ml.f12592n);
        }

        public final void O() {
            KN(new C0455j(this), n.f12594n);
        }

        public final void Uo() {
            KN(new I28(this), C0454Wre.f12593n);
        }

        private final void KN(Function0 function0, Function0 function02) {
            if (!((Boolean) function0.invoke()).booleanValue()) {
                CN3.J2().rl((String) function02.invoke());
                xMQ();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean az() {
            if (!Looper.getMainLooper().isCurrentThread()) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean gh() {
            String threadName = mUb();
            Intrinsics.checkNotNullExpressionValue(threadName, "threadName");
            return StringsKt.contains$default((CharSequence) threadName, (CharSequence) "Firebase Background Thread #", false, 2, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String mUb() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean qie() {
            String threadName = mUb();
            Intrinsics.checkNotNullExpressionValue(threadName, "threadName");
            return StringsKt.contains$default((CharSequence) threadName, (CharSequence) "Firebase Blocking Thread #", false, 2, (Object) null);
        }

        public final void ty(boolean z2) {
            Wre.J2 = z2;
        }

        public final boolean xMQ() {
            return Wre.J2;
        }
    }

    public Wre(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(blockingExecutorService, "blockingExecutorService");
        this.f12590n = new I28(backgroundExecutorService);
        this.rl = new I28(backgroundExecutorService);
        this.f12591t = new I28(backgroundExecutorService);
        this.nr = new I28(blockingExecutorService);
    }

    public static final void J2(boolean z2) {
        f12589O.ty(z2);
    }

    public static final void O() {
        f12589O.Uo();
    }

    public static final void nr() {
        f12589O.J2();
    }

    public static final void t() {
        f12589O.O();
    }
}
