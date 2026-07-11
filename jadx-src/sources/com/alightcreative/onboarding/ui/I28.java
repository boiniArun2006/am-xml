package com.alightcreative.onboarding.ui;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class I28 {

    public static final class j extends I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f46890n;

        public j(boolean z2) {
            super(null);
            this.f46890n = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f46890n == ((j) obj).f46890n;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f46890n);
        }

        public String toString() {
            return "Content(isSkipButtonVisible=" + this.f46890n + ")";
        }

        public final boolean n() {
            return this.f46890n;
        }
    }

    public /* synthetic */ I28(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private I28() {
    }
}
