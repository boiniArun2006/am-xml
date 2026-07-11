package com.facebook.imagepipeline.producers;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class l3D implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l4Z f52576n;
    private final ScheduledExecutorService rl;

    public l3D(l4Z inputProducer, ScheduledExecutorService scheduledExecutorService) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        this.f52576n = inputProducer;
        this.rl = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(l3D this$0, Pl consumer, mz context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(consumer, "$consumer");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.f52576n.n(consumer, context);
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(final Pl consumer, final mz context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        com.facebook.imagepipeline.request.j jVarM = context.M();
        ScheduledExecutorService scheduledExecutorService = this.rl;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new Runnable() { // from class: com.facebook.imagepipeline.producers.QJ
                @Override // java.lang.Runnable
                public final void run() {
                    l3D.nr(this.f52505n, consumer, context);
                }
            }, jVarM.J2(), TimeUnit.MILLISECONDS);
        } else {
            this.f52576n.n(consumer, context);
        }
    }
}
