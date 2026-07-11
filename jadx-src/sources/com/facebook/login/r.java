package com.facebook.login;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public enum r {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");


    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f52984t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f52985n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final r n(String str) {
            for (r rVar : r.values()) {
                if (Intrinsics.areEqual(rVar.toString(), str)) {
                    return rVar;
                }
            }
            return r.FACEBOOK;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f52985n;
    }

    r(String str) {
        this.f52985n = str;
    }
}
