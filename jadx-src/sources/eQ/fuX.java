package eQ;

import VyM.j;
import VyM.w6;
import android.content.Context;
import coil.memory.MemoryCache;
import eQ.fuX;
import eQ.w6;
import kYF.UGc;
import kYF.ci;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface fuX {

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Context f63702n;
        private FjR.w6 rl = kYF.aC.rl();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Lazy f63703t = null;
        private Lazy nr = null;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Lazy f63701O = null;
        private w6.InterfaceC0848w6 J2 = null;
        private n Uo = null;
        private UGc KN = new UGc(false, false, false, 0, null, 31, null);

        /* JADX INFO: Access modifiers changed from: private */
        public static final r1.j J2(j jVar) {
            return ci.f69944n.n(jVar.f63702n);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MemoryCache O(j jVar) {
            return new MemoryCache.j(jVar.f63702n).n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OkHttpClient Uo() {
            return new OkHttpClient();
        }

        public final j KN(n nVar) {
            this.Uo = nVar;
            return this;
        }

        public final j az(w6.j jVar) {
            FjR.w6 w6Var = this.rl;
            this.rl = w6Var.n((32751 & 1) != 0 ? w6Var.f3062n : null, (32751 & 2) != 0 ? w6Var.rl : null, (32751 & 4) != 0 ? w6Var.f3063t : null, (32751 & 8) != 0 ? w6Var.nr : null, (32751 & 16) != 0 ? w6Var.f3061O : jVar, (32751 & 32) != 0 ? w6Var.J2 : null, (32751 & 64) != 0 ? w6Var.Uo : null, (32751 & 128) != 0 ? w6Var.KN : false, (32751 & 256) != 0 ? w6Var.xMQ : false, (32751 & 512) != 0 ? w6Var.mUb : null, (32751 & 1024) != 0 ? w6Var.gh : null, (32751 & 2048) != 0 ? w6Var.qie : null, (32751 & 4096) != 0 ? w6Var.az : null, (32751 & 8192) != 0 ? w6Var.ty : null, (32751 & 16384) != 0 ? w6Var.HI : null);
            return this;
        }

        public final j mUb(boolean z2) {
            return xMQ(z2 ? 100 : 0);
        }

        public final fuX nr() {
            Context context = this.f63702n;
            FjR.w6 w6Var = this.rl;
            Lazy lazy = this.f63703t;
            if (lazy == null) {
                lazy = LazyKt.lazy(new Function0() { // from class: eQ.I28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return fuX.j.O(this.f63680n);
                    }
                });
            }
            Lazy lazy2 = this.nr;
            if (lazy2 == null) {
                lazy2 = LazyKt.lazy(new Function0() { // from class: eQ.Wre
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return fuX.j.J2(this.f63681n);
                    }
                });
            }
            Lazy lazy3 = this.f63701O;
            if (lazy3 == null) {
                lazy3 = LazyKt.lazy(new Function0() { // from class: eQ.CN3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return fuX.j.Uo();
                    }
                });
            }
            w6.InterfaceC0848w6 interfaceC0848w6 = this.J2;
            if (interfaceC0848w6 == null) {
                interfaceC0848w6 = w6.InterfaceC0848w6.rl;
            }
            n nVar = this.Uo;
            if (nVar == null) {
                nVar = new n();
            }
            return new aC(context, w6Var, lazy, lazy2, lazy3, interfaceC0848w6, nVar, this.KN, null);
        }

        public final j xMQ(int i2) {
            w6.j c0408j;
            if (i2 > 0) {
                c0408j = new j.C0408j(i2, false, 2, null);
            } else {
                c0408j = w6.j.rl;
            }
            az(c0408j);
            return this;
        }

        public j(Context context) {
            this.f63702n = context.getApplicationContext();
        }

        public final j gh(Function0 function0) {
            this.nr = LazyKt.lazy(function0);
            return this;
        }

        public final j qie(Function0 function0) {
            this.f63703t = LazyKt.lazy(function0);
            return this;
        }
    }

    n getComponents();

    FjR.w6 n();

    Object rl(FjR.fuX fux, Continuation continuation);

    MemoryCache t();
}
