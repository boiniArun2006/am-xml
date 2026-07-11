package com.facebook.imagepipeline.producers;

import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Mf extends Gs.fuX {
    private final mz J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final InterfaceC1866p f52501O;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f52502r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Pl f52503t;

    protected Map KN(Exception exc) {
        return null;
    }

    protected Map Uo() {
        return null;
    }

    protected Map xMQ(Object obj) {
        return null;
    }

    public Mf(Pl consumer, InterfaceC1866p producerListener, mz producerContext, String str) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerListener, "producerListener");
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(str, LHbnkhI.XzveMJEyRkJug);
        this.f52503t = consumer;
        this.f52501O = producerListener;
        this.J2 = producerContext;
        this.f52502r = str;
        producerListener.nr(producerContext, str);
    }

    @Override // Gs.fuX
    protected void J2(Object obj) {
        InterfaceC1866p interfaceC1866p = this.f52501O;
        mz mzVar = this.J2;
        String str = this.f52502r;
        interfaceC1866p.mUb(mzVar, str, interfaceC1866p.J2(mzVar, str) ? xMQ(obj) : null);
        this.f52503t.rl(obj, 1);
    }

    @Override // Gs.fuX
    protected void O(Exception e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        InterfaceC1866p interfaceC1866p = this.f52501O;
        mz mzVar = this.J2;
        String str = this.f52502r;
        interfaceC1866p.gh(mzVar, str, e2, interfaceC1866p.J2(mzVar, str) ? KN(e2) : null);
        this.f52503t.onFailure(e2);
    }

    @Override // Gs.fuX
    protected void nr() {
        InterfaceC1866p interfaceC1866p = this.f52501O;
        mz mzVar = this.J2;
        String str = this.f52502r;
        interfaceC1866p.t(mzVar, str, interfaceC1866p.J2(mzVar, str) ? Uo() : null);
        this.f52503t.n();
    }
}
