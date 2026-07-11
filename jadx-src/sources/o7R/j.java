package o7R;

import IB.w6;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import fX.InterfaceC2107n;
import h.C2149j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import z.mz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {
    public static final n rl = new n(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final j f71339t = new j(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function2 f71340n;

    /* JADX INFO: renamed from: o7R.j$j, reason: collision with other inner class name */
    /* synthetic */ class C1077j extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1077j f71341n = new C1077j();

        C1077j() {
            super(2, HandlerThread.class, "<init>", "<init>(Ljava/lang/String;I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return n((String) obj, ((Number) obj2).intValue());
        }

        public final HandlerThread n(String str, int i2) {
            return new HandlerThread(str, i2);
        }
    }

    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }

        public final j n() {
            return j.f71339t;
        }
    }

    public j(Function2 handlerThreadFactory) {
        Intrinsics.checkNotNullParameter(handlerThreadFactory, "handlerThreadFactory");
        this.f71340n = handlerThreadFactory;
    }

    public InterfaceC2107n rl(Context context, String tag, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        mz mzVarRl = w6.rl(context, tag, z2, null, 8, null);
        HandlerThread handlerThread = (HandlerThread) this.f71340n.invoke("RenderThread[" + tag + "]", -8);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        Intrinsics.checkNotNull(looper);
        return new C2149j(mzVarRl, looper);
    }

    public /* synthetic */ j(Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C1077j.f71341n : function2);
    }
}
