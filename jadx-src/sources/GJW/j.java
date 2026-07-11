package GJW;

import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class j extends L0y implements xuv, Continuation, vd {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final CoroutineContext f3492O;

    protected void W(Object obj) {
    }

    protected void kSg(Throwable th, boolean z2) {
    }

    @Override // GJW.L0y
    public final void Nxk(Throwable th) {
        M.n(this.f3492O, th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // GJW.L0y
    public String X() {
        return psW.n(this) + " was cancelled";
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f3492O;
    }

    @Override // GJW.vd
    public CoroutineContext getCoroutineContext() {
        return this.f3492O;
    }

    @Override // GJW.L0y
    protected final void n1(Object obj) {
        if (!(obj instanceof Z)) {
            W(obj);
        } else {
            Z z2 = (Z) obj;
            kSg(z2.f3468n, z2.n());
        }
    }

    @Override // GJW.L0y
    public String xg() {
        String strUo = qf.Uo(this.f3492O);
        if (strUo == null) {
            return super.xg();
        }
        return Typography.quote + strUo + HrvQKfmFZJudBc.fZaJDAvBaFD + super.xg();
    }

    public j(CoroutineContext coroutineContext, boolean z2, boolean z3) {
        super(z3);
        if (z2) {
            Y((xuv) coroutineContext.get(xuv.nr));
        }
        this.f3492O = coroutineContext.plus(this);
    }

    public final void RQ(h hVar, Object obj, Function2 function2) {
        hVar.rl(function2, obj, this);
    }

    @Override // GJW.L0y, GJW.xuv
    public boolean isActive() {
        return super.isActive();
    }

    protected void lLA(Object obj) {
        S(obj);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Object objETf = eTf(Ew.rl(obj));
        if (objETf == CM.rl) {
            return;
        }
        lLA(objETf);
    }
}
