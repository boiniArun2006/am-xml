package com.bendingspoons.injet.webbridge;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f51376n = j.f51377n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f51377n = new j();

        /* JADX INFO: renamed from: com.bendingspoons.injet.webbridge.I28$j$j, reason: collision with other inner class name */
        public static final class C0722j implements I28 {
            final /* synthetic */ String rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function2 f51378t;

            C0722j(String str, Function2 function2) {
                this.rl = str;
                this.f51378t = function2;
            }

            @Override // com.bendingspoons.injet.webbridge.I28
            public void n(String functionName, Function2 function) {
                Intrinsics.checkNotNullParameter(functionName, "functionName");
                Intrinsics.checkNotNullParameter(function, "function");
                this.f51378t.invoke(this.rl + "." + functionName, function);
            }
        }

        public final I28 n(String moduleName, Function2 registerNativeFunction) {
            Intrinsics.checkNotNullParameter(moduleName, "moduleName");
            Intrinsics.checkNotNullParameter(registerNativeFunction, "registerNativeFunction");
            return new C0722j(moduleName, registerNativeFunction);
        }

        private j() {
        }
    }

    void n(String str, Function2 function2);
}
