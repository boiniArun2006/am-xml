package com.facebook.imagepipeline.producers;

import bA.C1653C;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class gnv implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l4Z f52561n;

    private final class j extends AbstractC1863c {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ gnv f52562t;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w6
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public void KN(C1653C c1653c, int i2) {
            Pj0.j jVarT = null;
            try {
                if (C1653C.qm(c1653c) && c1653c != null) {
                    jVarT = c1653c.T();
                }
                HI().rl(jVarT, i2);
                Pj0.j.M7(jVarT);
            } catch (Throwable th) {
                Pj0.j.M7(jVarT);
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(gnv gnvVar, Pl consumer) {
            super(consumer);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            this.f52562t = gnvVar;
        }
    }

    public gnv(l4Z inputProducer) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        this.f52561n = inputProducer;
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl consumer, mz context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52561n.n(new j(this, consumer), context);
    }
}
