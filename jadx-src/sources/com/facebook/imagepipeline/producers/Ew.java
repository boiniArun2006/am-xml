package com.facebook.imagepipeline.producers;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Ew implements InterfaceC1866p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final O f52468n;
    private final InterfaceC1866p rl;

    @Override // com.facebook.imagepipeline.producers.InterfaceC1866p
    public boolean J2(mz context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        O o2 = this.f52468n;
        Boolean boolValueOf = o2 != null ? Boolean.valueOf(o2.nr(context.getId())) : null;
        if (!Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            InterfaceC1866p interfaceC1866p = this.rl;
            boolValueOf = interfaceC1866p != null ? Boolean.valueOf(interfaceC1866p.J2(context, str)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1866p
    public void KN(mz context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        O o2 = this.f52468n;
        if (o2 != null) {
            o2.mUb(context.getId(), str, str2);
        }
        InterfaceC1866p interfaceC1866p = this.rl;
        if (interfaceC1866p != null) {
            interfaceC1866p.KN(context, str, str2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1866p
    public void gh(mz context, String str, Throwable th, Map map) {
        Intrinsics.checkNotNullParameter(context, "context");
        O o2 = this.f52468n;
        if (o2 != null) {
            o2.J2(context.getId(), str, th, map);
        }
        InterfaceC1866p interfaceC1866p = this.rl;
        if (interfaceC1866p != null) {
            interfaceC1866p.gh(context, str, th, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1866p
    public void mUb(mz context, String str, Map map) {
        Intrinsics.checkNotNullParameter(context, "context");
        O o2 = this.f52468n;
        if (o2 != null) {
            o2.O(context.getId(), str, map);
        }
        InterfaceC1866p interfaceC1866p = this.rl;
        if (interfaceC1866p != null) {
            interfaceC1866p.mUb(context, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1866p
    public void nr(mz context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        O o2 = this.f52468n;
        if (o2 != null) {
            o2.rl(context.getId(), str);
        }
        InterfaceC1866p interfaceC1866p = this.rl;
        if (interfaceC1866p != null) {
            interfaceC1866p.nr(context, str);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1866p
    public void rl(mz context, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        O o2 = this.f52468n;
        if (o2 != null) {
            o2.KN(context.getId(), str, z2);
        }
        InterfaceC1866p interfaceC1866p = this.rl;
        if (interfaceC1866p != null) {
            interfaceC1866p.rl(context, str, z2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1866p
    public void t(mz context, String str, Map map) {
        Intrinsics.checkNotNullParameter(context, "context");
        O o2 = this.f52468n;
        if (o2 != null) {
            o2.Uo(context.getId(), str, map);
        }
        InterfaceC1866p interfaceC1866p = this.rl;
        if (interfaceC1866p != null) {
            interfaceC1866p.t(context, str, map);
        }
    }

    public Ew(O o2, InterfaceC1866p interfaceC1866p) {
        this.f52468n = o2;
        this.rl = interfaceC1866p;
    }
}
