package dC;

import Tc.j;
import as.CN3;
import as.eO;
import as.qz;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import xkG.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 implements Ml {
    static final /* synthetic */ KProperty[] J2 = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(w6.class, "channelCount", "getChannelCount-o9ltyNU()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(w6.class, "inputSampleRate", "getInputSampleRate-puQNsbE()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(w6.class, "outputSampleRate", "getOutputSampleRate-puQNsbE()I", 0))};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final ReadWriteProperty f63464O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Tc.j f63465n;
    private final ReadWriteProperty nr;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ReadWriteProperty f63466t;

    public w6(Tc.j processor) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        this.f63465n = processor;
        this.rl = true;
        Delegates delegates = Delegates.INSTANCE;
        this.f63466t = delegates.notNull();
        this.nr = delegates.notNull();
        this.f63464O = delegates.notNull();
    }

    private final int J2() {
        return ((eO) this.nr.getValue(this, J2[1])).mUb();
    }

    private final void KN(int i2) {
        this.f63466t.setValue(this, J2[0], qz.n(i2));
    }

    private final int O() {
        return ((qz) this.f63466t.getValue(this, J2[0])).Uo();
    }

    private final int Uo() {
        return ((eO) this.f63464O.getValue(this, J2[2])).mUb();
    }

    private final void mUb(int i2) {
        this.f63464O.setValue(this, J2[2], eO.n(i2));
    }

    private final void nr(as.n nVar, xkG.j jVar) {
        if (Intrinsics.areEqual(jVar, xkG.j.f75476t.n())) {
            return;
        }
        if (jVar.t() == jVar.rl()) {
            Ea.j.n(nVar, jVar.t());
        } else {
            Ea.j.rl(nVar, jVar.t(), jVar.rl());
        }
    }

    private final void xMQ(int i2) {
        this.nr.setValue(this, J2[1], eO.n(i2));
    }

    @Override // xkG.Ml
    public int n() {
        return this.rl ? as.Ml.t(0) : this.f63465n.n();
    }

    @Override // xkG.Ml
    public void t(as.n fragment, xkG.j amplification, float f3, int i2) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(amplification, "amplification");
        if (this.rl) {
            KN(fragment.nr());
            xMQ(fragment.J2());
            mUb(i2);
            this.f63465n.nr(new j.C0372j(J2(), O(), i2, null));
            this.rl = false;
        }
        CN3 cn3 = new CN3(O(), J2(), null);
        if (!Intrinsics.areEqual(fragment.Uo(), cn3)) {
            throw new IllegalArgumentException(("Receiver (properties: " + cn3 + ") must be reset before a fragment with different stream properties (" + fragment.Uo() + ") can be processed.").toString());
        }
        if (eO.Uo(Uo(), i2)) {
            as.n nVarRl = as.n.rl(fragment, v9.n.t(fragment.O()), null, 2, null);
            nr(nVarRl, amplification);
            gh(this.f63465n, nVarRl, f3);
        } else {
            throw new IllegalArgumentException(("Receiver (sample rate: " + ((Object) eO.xMQ(Uo())) + ") must be reset before a new desired output sample rate (" + ((Object) eO.xMQ(i2)) + ") can be processed.").toString());
        }
    }

    private final void gh(Tc.j jVar, as.n nVar, float f3) {
        jVar.t(f3);
        jVar.queueInput(v9.n.n(nVar.O()));
    }

    @Override // xkG.Ml
    public as.n rl(int i2) {
        if (as.Ml.rl(i2, n()) <= 0) {
            if (!this.rl) {
                return new as.n(v9.n.t(this.f63465n.rl(i2)), new CN3(O(), Uo(), null));
            }
            throw new IllegalArgumentException("Cannot get output from an uninitialized processor.");
        }
        throw new IllegalArgumentException(("Cannot request more frames than available. Requested " + ((Object) as.Ml.mUb(i2)) + ", available " + ((Object) as.Ml.mUb(n())) + ").").toString());
    }
}
