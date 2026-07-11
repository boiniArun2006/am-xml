package com.facebook.imagepipeline.producers;

import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class xZD implements l4Z {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f52615t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l4Z f52616n;
    private final M5 rl;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean nr(mz mzVar) {
            if (!mzVar.Uo().getExperiments().mUb() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String t(mz mzVar) {
            if (kd.j.rl()) {
                return "ThreadHandoffProducer_produceResults_" + mzVar.getId();
            }
            return null;
        }
    }

    public static final class n extends Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Mf f52617n;
        final /* synthetic */ xZD rl;

        n(Mf mf, xZD xzd) {
            this.f52617n = mf;
            this.rl = xzd;
        }

        @Override // com.facebook.imagepipeline.producers.OU
        public void rl() {
            this.f52617n.n();
            this.rl.nr().n(this.f52617n);
        }
    }

    public static final class w6 extends Mf {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ mz f52618S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ InterfaceC1866p f52619Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ xZD f52620g;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Pl f52621o;

        @Override // Gs.fuX
        protected void rl(Object obj) {
        }

        @Override // Gs.fuX
        protected Object t() {
            return null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(Pl pl, InterfaceC1866p interfaceC1866p, mz mzVar, xZD xzd) {
            super(pl, interfaceC1866p, mzVar, "BackgroundThreadHandoffProducer");
            this.f52621o = pl;
            this.f52619Z = interfaceC1866p;
            this.f52618S = mzVar;
            this.f52620g = xzd;
        }

        @Override // com.facebook.imagepipeline.producers.Mf, Gs.fuX
        protected void J2(Object obj) {
            this.f52619Z.mUb(this.f52618S, "BackgroundThreadHandoffProducer", null);
            this.f52620g.t().n(this.f52621o, this.f52618S);
        }
    }

    public xZD(l4Z inputProducer, M5 threadHandoffProducerQueue) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        this.f52616n = inputProducer;
        this.rl = threadHandoffProducerQueue;
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl consumer, mz context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!T5.n.nr()) {
            InterfaceC1866p interfaceC1866pM7 = context.M7();
            j jVar = f52615t;
            if (jVar.nr(context)) {
                interfaceC1866pM7.nr(context, "BackgroundThreadHandoffProducer");
                interfaceC1866pM7.mUb(context, "BackgroundThreadHandoffProducer", null);
                this.f52616n.n(consumer, context);
                return;
            } else {
                w6 w6Var = new w6(consumer, interfaceC1866pM7, context, this);
                context.rl(new n(w6Var, this));
                this.rl.rl(kd.j.n(w6Var, jVar.t(context)));
                return;
            }
        }
        T5.n.n("ThreadHandoffProducer#produceResults");
        try {
            InterfaceC1866p interfaceC1866pM72 = context.M7();
            j jVar2 = f52615t;
            if (jVar2.nr(context)) {
                interfaceC1866pM72.nr(context, "BackgroundThreadHandoffProducer");
                interfaceC1866pM72.mUb(context, "BackgroundThreadHandoffProducer", null);
                this.f52616n.n(consumer, context);
            } else {
                w6 w6Var2 = new w6(consumer, interfaceC1866pM72, context, this);
                context.rl(new n(w6Var2, this));
                this.rl.rl(kd.j.n(w6Var2, jVar2.t(context)));
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            T5.n.rl();
        }
    }

    public final M5 nr() {
        return this.rl;
    }

    public final l4Z t() {
        return this.f52616n;
    }
}
