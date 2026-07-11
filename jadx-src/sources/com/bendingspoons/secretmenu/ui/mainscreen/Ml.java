package com.bendingspoons.secretmenu.ui.mainscreen;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Ml {

    public static final class I28 extends Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f51514n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(String menuItemId) {
            super(null);
            Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
            this.f51514n = menuItemId;
        }

        public final String n() {
            return this.f51514n;
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.secretmenu.ui.mainscreen.Ml$Ml, reason: collision with other inner class name */
    public static final class C0734Ml extends Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f51515n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0734Ml(String customItemId) {
            super(null);
            Intrinsics.checkNotNullParameter(customItemId, "customItemId");
            this.f51515n = customItemId;
        }

        public final String n() {
            return this.f51515n;
        }
    }

    public static final class j extends Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f51516n = new j();

        private j() {
            super(null);
        }
    }

    public static final class n extends Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f51517n = new n();

        private n() {
            super(null);
        }
    }

    public static final class w6 extends Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f51518n = new w6();

        private w6() {
            super(null);
        }
    }

    public /* synthetic */ Ml(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Ml() {
    }
}
