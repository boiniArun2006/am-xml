package vyd;

import Hh.C;
import com.facebook.imagepipeline.producers.KH;
import com.facebook.imagepipeline.producers.Pl;
import com.facebook.imagepipeline.producers.l4Z;
import com.facebook.imagepipeline.producers.mz;
import com.facebook.imagepipeline.producers.w6;
import java.util.Map;
import jl.Ml;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j extends com.facebook.datasource.j {
    private final KH KN;
    private final Ml xMQ;

    /* JADX INFO: renamed from: vyd.j$j, reason: collision with other inner class name */
    public static final class C1245j extends w6 {
        C1245j() {
        }

        @Override // com.facebook.imagepipeline.producers.w6
        protected void J2() {
            j.this.iF();
        }

        @Override // com.facebook.imagepipeline.producers.w6
        protected void KN(Object obj, int i2) {
            j jVar = j.this;
            jVar.E2(obj, i2, jVar.te());
        }

        @Override // com.facebook.imagepipeline.producers.w6
        protected void Uo(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            j.this.fD(throwable);
        }

        @Override // com.facebook.imagepipeline.producers.w6
        protected void xMQ(float f3) {
            j.this.r(f3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void iF() {
        C.xMQ(mUb());
    }

    protected j(l4Z producer, KH settableProducerContext, Ml requestListener) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        Intrinsics.checkNotNullParameter(settableProducerContext, "settableProducerContext");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        this.KN = settableProducerContext;
        this.xMQ = requestListener;
        if (!T5.n.nr()) {
            ty(settableProducerContext.getExtras());
            if (T5.n.nr()) {
                T5.n.n("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.n(settableProducerContext);
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            } else {
                requestListener.n(settableProducerContext);
            }
            if (!T5.n.nr()) {
                producer.n(nY(), settableProducerContext);
                return;
            }
            T5.n.n("AbstractProducerToDataSourceAdapter()->produceResult");
            try {
                producer.n(nY(), settableProducerContext);
                Unit unit2 = Unit.INSTANCE;
                return;
            } finally {
            }
        }
        T5.n.n("AbstractProducerToDataSourceAdapter()");
        try {
            ty(settableProducerContext.getExtras());
            if (T5.n.nr()) {
                T5.n.n("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.n(settableProducerContext);
                    Unit unit3 = Unit.INSTANCE;
                    T5.n.rl();
                } finally {
                }
            } else {
                requestListener.n(settableProducerContext);
            }
            if (T5.n.nr()) {
                T5.n.n("AbstractProducerToDataSourceAdapter()->produceResult");
                try {
                    producer.n(nY(), settableProducerContext);
                    Unit unit4 = Unit.INSTANCE;
                    T5.n.rl();
                } finally {
                }
            } else {
                producer.n(nY(), settableProducerContext);
            }
            Unit unit5 = Unit.INSTANCE;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fD(Throwable th) {
        if (super.ck(th, g(this.KN))) {
            this.xMQ.xMQ(this.KN, th);
        }
    }

    private final Pl nY() {
        return new C1245j();
    }

    protected void E2(Object obj, int i2, mz producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        boolean zNr = w6.nr(i2);
        if (super.Z(obj, zNr, g(producerContext)) && zNr) {
            this.xMQ.O(this.KN);
        }
    }

    protected final Map g(mz producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        return producerContext.getExtras();
    }

    public final KH te() {
        return this.KN;
    }

    @Override // com.facebook.datasource.j, com.facebook.datasource.w6
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (!super.rl()) {
            this.xMQ.Uo(this.KN);
            this.KN.KN();
            return true;
        }
        return true;
    }
}
