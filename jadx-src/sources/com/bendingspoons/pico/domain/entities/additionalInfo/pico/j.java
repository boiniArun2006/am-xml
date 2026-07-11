package com.bendingspoons.pico.domain.entities.additionalInfo.pico;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0732j f51476n = C0732j.f51477n;

    /* JADX INFO: renamed from: com.bendingspoons.pico.domain.entities.additionalInfo.pico.j$j, reason: collision with other inner class name */
    public static final class C0732j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ C0732j f51477n = new C0732j();

        public final j n(Function1 appProvider, Function1 deviceProvider, Function1 installProvider, Function1 monetizationProvider, Function1 experimentProvider, Function1 idsProvider) {
            Intrinsics.checkNotNullParameter(appProvider, "appProvider");
            Intrinsics.checkNotNullParameter(deviceProvider, "deviceProvider");
            Intrinsics.checkNotNullParameter(installProvider, "installProvider");
            Intrinsics.checkNotNullParameter(monetizationProvider, "monetizationProvider");
            Intrinsics.checkNotNullParameter(experimentProvider, "experimentProvider");
            Intrinsics.checkNotNullParameter(idsProvider, "idsProvider");
            return new n(appProvider, deviceProvider, installProvider, monetizationProvider, experimentProvider, idsProvider);
        }

        private C0732j() {
        }
    }

    Object n(Continuation continuation);
}
