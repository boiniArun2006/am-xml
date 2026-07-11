package TFv;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class w6 extends teV.Ml {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10492o = AtomicIntegerFieldUpdater.newUpdater(w6.class, "consumed$volatile");
    private final ILs.Q J2;
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f10493r;

    public /* synthetic */ w6(ILs.Q q2, boolean z2, CoroutineContext coroutineContext, int i2, ILs.j jVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(q2, z2, (i3 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i3 & 8) != 0 ? -3 : i2, (i3 & 16) != 0 ? ILs.j.f4185n : jVar);
    }

    private final void Ik() {
        if (this.f10493r && f10492o.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    @Override // teV.Ml
    protected String J2() {
        return "channel=" + this.J2;
    }

    @Override // teV.Ml
    protected teV.Ml gh(CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        return new w6(this.J2, this.f10493r, coroutineContext, i2, jVar);
    }

    @Override // teV.Ml
    protected Object mUb(ILs.s4 s4Var, Continuation continuation) {
        Object objNr = aC.nr(new teV.Q(s4Var), this.J2, this.f10493r, continuation);
        return objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNr : Unit.INSTANCE;
    }

    @Override // teV.Ml, TFv.Wre
    public Object n(CN3 cn3, Continuation continuation) {
        if (this.f73609t != -3) {
            Object objN = super.n(cn3, continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
        Ik();
        Object objNr = aC.nr(cn3, this.J2, this.f10493r, continuation);
        return objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNr : Unit.INSTANCE;
    }

    @Override // teV.Ml
    public Wre qie() {
        return new w6(this.J2, this.f10493r, null, 0, null, 28, null);
    }

    @Override // teV.Ml
    public ILs.Q HI(GJW.vd vdVar) {
        Ik();
        if (this.f73609t == -3) {
            return this.J2;
        }
        return super.HI(vdVar);
    }

    public w6(ILs.Q q2, boolean z2, CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        super(coroutineContext, i2, jVar);
        this.J2 = q2;
        this.f10493r = z2;
    }
}
