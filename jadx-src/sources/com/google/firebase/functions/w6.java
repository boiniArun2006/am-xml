package com.google.firebase.functions;

import android.content.Context;
import com.google.firebase.qz;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface w6 {

    public interface j {
        j J2(oSp.j jVar);

        j O(oSp.n nVar);

        j Uo(oSp.n nVar);

        w6 build();

        j n(Context context);

        j nr(Executor executor);

        j rl(Executor executor);

        j t(qz qzVar);
    }

    public interface n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f60503n = j.f60504n;

        public static final class j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            static final /* synthetic */ j f60504n = new j();

            public final String n(qz options) {
                Intrinsics.checkNotNullParameter(options, "options");
                return options.O();
            }

            private j() {
            }
        }
    }

    I28 n();
}
