package La;

import CZF.I28;
import android.content.Context;
import b.InterfaceC1651w6;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f6131n = j.f6132n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f6132n = new j();

        public final Ml n(Context context, n config, rB.Ml spiderSense, OkHttpClient okHttpClient, v8.j localLogger) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(localLogger, "localLogger");
            ao3.w6 w6VarN = ao3.w6.f43084n.n(context);
            ao3.j jVarNr = w6VarN.nr();
            InterfaceC1651w6 interfaceC1651w6T = InterfaceC1651w6.f43133n.t(w6VarN.rl(), config.rl().n(), config.rl().rl(), config.n(), spiderSense, okHttpClient, localLogger);
            interfaceC1651w6T.n();
            return new I28(jVarNr, interfaceC1651w6T);
        }

        private j() {
        }
    }

    public interface n {

        public interface j {

            /* JADX INFO: renamed from: La.Ml$n$j$j, reason: collision with other inner class name */
            public interface InterfaceC0211j {

                /* JADX INFO: renamed from: La.Ml$n$j$j$j, reason: collision with other inner class name */
                public static final class C0212j {

                    /* JADX INFO: renamed from: La.Ml$n$j$j$j$j, reason: collision with other inner class name */
                    static final class C0213j implements Function0 {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        public static final C0213j f6133n = new C0213j();

                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Void invoke() {
                            return null;
                        }

                        C0213j() {
                        }
                    }

                    public static Function0 n(InterfaceC0211j interfaceC0211j) {
                        return C0213j.f6133n;
                    }
                }

                Function0 n();

                PMG.w6 rl();

                Interceptor t();
            }

            InterfaceC0211j n();

            Function0 rl();
        }

        /* JADX INFO: renamed from: La.Ml$n$n, reason: collision with other inner class name */
        public interface InterfaceC0214n {

            /* JADX INFO: renamed from: La.Ml$n$n$j */
            public interface j {
                Function1 n();

                String t();
            }

            /* JADX INFO: renamed from: La.Ml$n$n$n, reason: collision with other inner class name */
            public static abstract class AbstractC0215n {

                /* JADX INFO: renamed from: La.Ml$n$n$n$j */
                public static final class j extends AbstractC0215n {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    private final long f6134n;
                    private final q3M.n rl;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof j)) {
                            return false;
                        }
                        j jVar = (j) obj;
                        return this.f6134n == jVar.f6134n && Intrinsics.areEqual(this.rl, jVar.rl);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public j(long j2, q3M.n networkErrorDelayProvider) {
                        super(null);
                        Intrinsics.checkNotNullParameter(networkErrorDelayProvider, "networkErrorDelayProvider");
                        this.f6134n = j2;
                        this.rl = networkErrorDelayProvider;
                    }

                    public int hashCode() {
                        return (Long.hashCode(this.f6134n) * 31) + this.rl.hashCode();
                    }

                    public final long n() {
                        return this.f6134n;
                    }

                    public final q3M.n rl() {
                        return this.rl;
                    }

                    public String toString() {
                        return "OnDemand(defaultDelayInMillis=" + this.f6134n + ", networkErrorDelayProvider=" + this.rl + ")";
                    }
                }

                /* JADX INFO: renamed from: La.Ml$n$n$n$n, reason: collision with other inner class name */
                public static final class C0216n extends AbstractC0215n {
                    public abstract long n();
                }

                public /* synthetic */ AbstractC0215n(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private AbstractC0215n() {
                }
            }

            AbstractC0215n n();

            j rl();
        }

        j n();

        InterfaceC0214n rl();
    }

    Object n(I28.w6 w6Var, Continuation continuation);

    Object rl(QAv.j jVar, Continuation continuation);
}
